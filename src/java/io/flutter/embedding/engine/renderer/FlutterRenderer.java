package io.flutter.embedding.engine.renderer;

import java.lang.ref.Reference;
import io.flutter.view.TextureRegistry$a;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import java.io.IOException;
import android.media.Image;
import android.media.ImageReader$Builder;
import android.media.ImageReader;
import java.util.HashMap;
import java.util.ArrayDeque;
import io.flutter.view.TextureRegistry$SurfaceProducer$a;
import androidx.annotation.Keep;
import android.annotation.TargetApi;
import android.graphics.Rect;
import java.nio.ByteBuffer;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import android.os.Build$VERSION;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import a3.b;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import android.graphics.SurfaceTexture;
import io.flutter.view.TextureRegistry$ImageConsumer;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import io.flutter.view.TextureRegistry$b;
import androidx.lifecycle.k;
import androidx.lifecycle.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import android.os.Handler;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicLong;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;

public class FlutterRenderer implements TextureRegistry
{
    public static boolean i;
    public static boolean j;
    private final FlutterJNI a;
    private final AtomicLong b;
    private Surface c;
    private boolean d;
    private final Handler e;
    private final Set f;
    private final List g;
    private final l h;
    
    public FlutterRenderer(final FlutterJNI a) {
        this.b = new AtomicLong(0L);
        this.d = false;
        this.e = new Handler();
        this.f = (Set)new HashSet();
        this.g = (List)new ArrayList();
        final l h = (l)new l() {
            final FlutterRenderer a;
            
            public void c() {
                this.a.d = false;
            }
            
            public void g() {
                this.a.d = true;
            }
        };
        this.h = (l)h;
        (this.a = a).addIsDisplayingFlutterUiListener((l)h);
        u.o().a().a((k)new FlutterRenderer$b(this));
    }
    
    private void D(final long n) {
        this.a.unregisterTexture(n);
    }
    
    private void l() {
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            if (((Reference)iterator.next()).get() == null) {
                iterator.remove();
            }
        }
    }
    
    private void q(final long n, final TextureRegistry$ImageConsumer textureRegistry$ImageConsumer) {
        this.a.registerImageTexture(n, textureRegistry$ImageConsumer);
    }
    
    private TextureRegistry$SurfaceTextureEntry r(final long n, final SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        final f f = new f(n, surfaceTexture);
        final StringBuilder sb = new StringBuilder();
        sb.append("New SurfaceTexture ID: ");
        sb.append(f.id());
        a3.b.f("FlutterRenderer", sb.toString());
        this.t(f.id(), f.f());
        this.k((TextureRegistry$b)f);
        return (TextureRegistry$SurfaceTextureEntry)f;
    }
    
    private void t(final long n, final SurfaceTextureWrapper surfaceTextureWrapper) {
        this.a.registerTexture(n, surfaceTextureWrapper);
    }
    
    private void w() {
        this.a.scheduleFrame();
    }
    
    public void A() {
        if (this.c != null) {
            this.a.onSurfaceDestroyed();
            if (this.d) {
                this.h.c();
            }
            this.d = false;
            this.c = null;
        }
    }
    
    public void B(final int n, final int n2) {
        this.a.onSurfaceChanged(n, n2);
    }
    
    public void C(final Surface c) {
        this.c = c;
        this.a.onSurfaceWindowChanged(c);
    }
    
    public TextureRegistry$SurfaceProducer a() {
        Object o;
        if (!FlutterRenderer.i && Build$VERSION.SDK_INT >= 29) {
            final long andIncrement = this.b.getAndIncrement();
            o = new ImageReaderSurfaceProducer(andIncrement);
            this.q(andIncrement, (TextureRegistry$ImageConsumer)o);
            this.k((TextureRegistry$b)o);
            this.g.add(o);
            final StringBuilder sb = new StringBuilder();
            sb.append("New ImageReaderSurfaceProducer ID: ");
            sb.append(andIncrement);
            a3.b.f("FlutterRenderer", sb.toString());
        }
        else {
            final TextureRegistry$SurfaceTextureEntry c = this.c();
            o = new n(c.id(), this.e, this.a, c);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("New SurfaceTextureSurfaceProducer ID: ");
            sb2.append(c.id());
            a3.b.f("FlutterRenderer", sb2.toString());
        }
        return (TextureRegistry$SurfaceProducer)o;
    }
    
    public TextureRegistry$ImageTextureEntry b() {
        final ImageTextureRegistryEntry imageTextureRegistryEntry = new ImageTextureRegistryEntry(this.b.getAndIncrement());
        final StringBuilder sb = new StringBuilder();
        sb.append("New ImageTextureEntry ID: ");
        sb.append(imageTextureRegistryEntry.id());
        a3.b.f("FlutterRenderer", sb.toString());
        this.q(imageTextureRegistryEntry.id(), (TextureRegistry$ImageConsumer)imageTextureRegistryEntry);
        return (TextureRegistry$ImageTextureEntry)imageTextureRegistryEntry;
    }
    
    public TextureRegistry$SurfaceTextureEntry c() {
        a3.b.f("FlutterRenderer", "Creating a SurfaceTexture.");
        return this.s(new SurfaceTexture(0));
    }
    
    public void j(final l l) {
        this.a.addIsDisplayingFlutterUiListener(l);
        if (this.d) {
            l.g();
        }
    }
    
    void k(final TextureRegistry$b textureRegistry$b) {
        this.l();
        this.f.add((Object)new WeakReference((Object)textureRegistry$b));
    }
    
    public void m(final ByteBuffer byteBuffer, final int n) {
        this.a.dispatchPointerDataPacket(byteBuffer, n);
    }
    
    public boolean n() {
        return this.d;
    }
    
    public boolean o() {
        return this.a.getIsSoftwareRenderingEnabled();
    }
    
    public void p(final int n) {
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            final TextureRegistry$b textureRegistry$b = (TextureRegistry$b)((Reference)iterator.next()).get();
            if (textureRegistry$b != null) {
                textureRegistry$b.onTrimMemory(n);
            }
            else {
                iterator.remove();
            }
        }
    }
    
    public TextureRegistry$SurfaceTextureEntry s(final SurfaceTexture surfaceTexture) {
        return this.r(this.b.getAndIncrement(), surfaceTexture);
    }
    
    public void u(final l l) {
        this.a.removeIsDisplayingFlutterUiListener(l);
    }
    
    void v(final TextureRegistry$b textureRegistry$b) {
        for (final WeakReference weakReference : this.f) {
            if (((Reference)weakReference).get() == textureRegistry$b) {
                this.f.remove((Object)weakReference);
                break;
            }
        }
    }
    
    public void x(final boolean semanticsEnabled) {
        this.a.setSemanticsEnabled(semanticsEnabled);
    }
    
    public void y(final FlutterRenderer.FlutterRenderer$h flutterRenderer$h) {
        if (!flutterRenderer$h.a()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Setting viewport metrics\nSize: ");
        sb.append(flutterRenderer$h.b);
        sb.append(" x ");
        sb.append(flutterRenderer$h.c);
        sb.append("\nPadding - L: ");
        sb.append(flutterRenderer$h.g);
        sb.append(", T: ");
        sb.append(flutterRenderer$h.d);
        sb.append(", R: ");
        sb.append(flutterRenderer$h.e);
        sb.append(", B: ");
        sb.append(flutterRenderer$h.f);
        sb.append("\nInsets - L: ");
        sb.append(flutterRenderer$h.k);
        sb.append(", T: ");
        sb.append(flutterRenderer$h.h);
        sb.append(", R: ");
        sb.append(flutterRenderer$h.i);
        sb.append(", B: ");
        sb.append(flutterRenderer$h.j);
        sb.append("\nSystem Gesture Insets - L: ");
        sb.append(flutterRenderer$h.o);
        sb.append(", T: ");
        sb.append(flutterRenderer$h.l);
        sb.append(", R: ");
        sb.append(flutterRenderer$h.m);
        sb.append(", B: ");
        sb.append(flutterRenderer$h.m);
        sb.append("\nDisplay Features: ");
        sb.append(flutterRenderer$h.q.size());
        a3.b.f("FlutterRenderer", sb.toString());
        final int[] array = new int[flutterRenderer$h.q.size() * 4];
        final int[] array2 = new int[flutterRenderer$h.q.size()];
        final int[] array3 = new int[flutterRenderer$h.q.size()];
        for (int i = 0; i < flutterRenderer$h.q.size(); ++i) {
            final FlutterRenderer.FlutterRenderer$c flutterRenderer$c = (FlutterRenderer.FlutterRenderer$c)flutterRenderer$h.q.get(i);
            final int n = i * 4;
            final Rect a = flutterRenderer$c.a;
            array[n] = a.left;
            array[n + 1] = a.top;
            array[n + 2] = a.right;
            array[n + 3] = a.bottom;
            array2[i] = flutterRenderer$c.b.e;
            array3[i] = flutterRenderer$c.c.e;
        }
        this.a.setViewportMetrics(flutterRenderer$h.a, flutterRenderer$h.b, flutterRenderer$h.c, flutterRenderer$h.d, flutterRenderer$h.e, flutterRenderer$h.f, flutterRenderer$h.g, flutterRenderer$h.h, flutterRenderer$h.i, flutterRenderer$h.j, flutterRenderer$h.k, flutterRenderer$h.l, flutterRenderer$h.m, flutterRenderer$h.n, flutterRenderer$h.o, flutterRenderer$h.p, array, array2, array3);
    }
    
    public void z(final Surface c, final boolean b) {
        if (!b) {
            this.A();
        }
        this.c = c;
        if (b) {
            this.a.onSurfaceWindowChanged(c);
        }
        else {
            this.a.onSurfaceCreated(c);
        }
    }
    
    @TargetApi(29)
    @Keep
    final class ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, TextureRegistry$b
    {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_IMAGES = 5;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private static final boolean trimOnMemoryPressure = true;
        private TextureRegistry$SurfaceProducer$a callback;
        private boolean createNewReader;
        private final long id;
        private boolean ignoringFence;
        private final ArrayDeque<ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b> imageReaderQueue;
        private long lastDequeueTime;
        private ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$a lastDequeuedImage;
        private long lastQueueTime;
        private ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b lastReaderDequeuedFrom;
        private long lastScheduleTime;
        private final Object lock;
        private int numTrims;
        private final HashMap<ImageReader, ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b> perImageReaders;
        private boolean released;
        private int requestedHeight;
        private int requestedWidth;
        final FlutterRenderer this$0;
        
        ImageReaderSurfaceProducer(final FlutterRenderer this$0, final long id) {
            this.this$0 = this$0;
            this.ignoringFence = false;
            this.requestedWidth = 1;
            this.requestedHeight = 1;
            this.createNewReader = true;
            this.lastDequeueTime = 0L;
            this.lastQueueTime = 0L;
            this.lastScheduleTime = 0L;
            this.numTrims = 0;
            this.lock = new Object();
            this.imageReaderQueue = (ArrayDeque<ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b>)new ArrayDeque();
            this.perImageReaders = (HashMap<ImageReader, ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b>)new HashMap();
            this.lastDequeuedImage = null;
            this.lastReaderDequeuedFrom = null;
            this.id = id;
        }
        
        private void cleanup() {
            final Object lock = this.lock;
            synchronized (lock) {
                for (final ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b flutterRenderer$ImageReaderSurfaceProducer$b : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == flutterRenderer$ImageReaderSurfaceProducer$b) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    flutterRenderer$ImageReaderSurfaceProducer$b.d();
                }
                this.perImageReaders.clear();
                final ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$a lastDequeuedImage = this.lastDequeuedImage;
                if (lastDequeuedImage != null) {
                    lastDequeuedImage.a.close();
                    this.lastDequeuedImage = null;
                }
                final ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b lastReaderDequeuedFrom = this.lastReaderDequeuedFrom;
                if (lastReaderDequeuedFrom != null) {
                    lastReaderDequeuedFrom.d();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            }
        }
        
        private ImageReader createImageReader() {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 33) {
                return this.createImageReader33();
            }
            if (sdk_INT >= 29) {
                return this.createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        
        @TargetApi(29)
        private ImageReader createImageReader29() {
            return io.flutter.embedding.android.l.a(this.requestedWidth, this.requestedHeight, 34, 5, 256L);
        }
        
        @TargetApi(33)
        private ImageReader createImageReader33() {
            io.flutter.embedding.engine.renderer.h.a();
            final ImageReader$Builder a = io.flutter.embedding.engine.renderer.g.a(this.requestedWidth, this.requestedHeight);
            io.flutter.embedding.engine.renderer.a.a(a, 5);
            io.flutter.embedding.engine.renderer.b.a(a, 34);
            io.flutter.embedding.engine.renderer.c.a(a, 256L);
            return io.flutter.embedding.engine.renderer.d.a(a);
        }
        
        private ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b getActiveReader() {
            final Object lock = this.lock;
            synchronized (lock) {
                if (this.createNewReader) {
                    this.createNewReader = false;
                    return this.getOrCreatePerImageReader(this.createImageReader());
                }
                return (ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b)this.imageReaderQueue.peekLast();
            }
        }
        
        private void maybeWaitOnFence(final Image image) {
            if (image == null) {
                return;
            }
            if (this.ignoringFence) {
                return;
            }
            if (Build$VERSION.SDK_INT >= 33) {
                this.waitOnFence(image);
                return;
            }
            this.ignoringFence = true;
            a3.b.a("ImageReaderSurfaceProducer", "ImageTextureEntry can't wait on the fence on Android < 33");
        }
        
        private void releaseInternal() {
            this.cleanup();
            this.released = true;
            this.this$0.g.remove((Object)this);
        }
        
        @TargetApi(33)
        private void waitOnFence(final Image image) {
            try {
                io.flutter.embedding.engine.renderer.f.a(io.flutter.embedding.engine.renderer.e.a(image));
            }
            catch (final IOException ex) {}
        }
        
        @TargetApi(29)
        public Image acquireLatestImage() {
            final ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$a dequeueImage = this.dequeueImage();
            if (dequeueImage == null) {
                return null;
            }
            this.maybeWaitOnFence(dequeueImage.a);
            return dequeueImage.a;
        }
        
        double deltaMillis(final long n) {
            return n / 1000000.0;
        }
        
        ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$a dequeueImage() {
            final Object lock = this.lock;
            synchronized (lock) {
                final Iterator iterator = this.imageReaderQueue.iterator();
                ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$a e = null;
                while (iterator.hasNext()) {
                    final ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b lastReaderDequeuedFrom = (ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b)iterator.next();
                    e = lastReaderDequeuedFrom.e();
                    if (e == null) {
                        continue;
                    }
                    final ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$a lastDequeuedImage = this.lastDequeuedImage;
                    if (lastDequeuedImage != null) {
                        lastDequeuedImage.a.close();
                    }
                    this.lastDequeuedImage = e;
                    this.lastReaderDequeuedFrom = lastReaderDequeuedFrom;
                    break;
                }
                this.pruneImageReaderQueue();
                return e;
            }
        }
        
        public void disableFenceForTest() {
            this.ignoringFence = true;
        }
        
        @Override
        protected void finalize() {
            try {
                if (this.released) {
                    return;
                }
                this.releaseInternal();
                this.this$0.e.post((Runnable)new FlutterRenderer$g(this.id, this.this$0.a));
            }
            finally {
                super.finalize();
            }
        }
        
        public int getHeight() {
            return this.requestedHeight;
        }
        
        ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b getOrCreatePerImageReader(final ImageReader imageReader) {
            ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b flutterRenderer$ImageReaderSurfaceProducer$b;
            if ((flutterRenderer$ImageReaderSurfaceProducer$b = (ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b)this.perImageReaders.get((Object)imageReader)) == null) {
                flutterRenderer$ImageReaderSurfaceProducer$b = new ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b(this, imageReader);
                this.perImageReaders.put((Object)imageReader, (Object)flutterRenderer$ImageReaderSurfaceProducer$b);
                this.imageReaderQueue.add((Object)flutterRenderer$ImageReaderSurfaceProducer$b);
            }
            return flutterRenderer$ImageReaderSurfaceProducer$b;
        }
        
        public Surface getSurface() {
            return this.getActiveReader().a.getSurface();
        }
        
        public int getWidth() {
            return this.requestedWidth;
        }
        
        public long id() {
            return this.id;
        }
        
        public int numImageReaders() {
            final Object lock = this.lock;
            synchronized (lock) {
                return this.imageReaderQueue.size();
            }
        }
        
        public int numImages() {
            final Object lock = this.lock;
            synchronized (lock) {
                final Iterator iterator = this.imageReaderQueue.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    n += ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b.b((ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b)iterator.next()).size();
                }
                return n;
            }
        }
        
        public int numTrims() {
            final Object lock = this.lock;
            synchronized (lock) {
                return this.numTrims;
            }
        }
        
        void onImage(final ImageReader imageReader, final Image image) {
            final Object lock = this.lock;
            synchronized (lock) {
                final ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$a g = this.getOrCreatePerImageReader(imageReader).g(image);
                monitorexit(lock);
                if (g == null) {
                    return;
                }
                this.this$0.w();
            }
        }
        
        public void onTrimMemory(final int n) {
            if (n < 40) {
                return;
            }
            final Object lock = this.lock;
            synchronized (lock) {
                ++this.numTrims;
                monitorexit(lock);
                this.cleanup();
                this.createNewReader = true;
            }
        }
        
        void pruneImageReaderQueue() {
            while (this.imageReaderQueue.size() > 1) {
                final ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b flutterRenderer$ImageReaderSurfaceProducer$b = (ImageReaderSurfaceProducer.FlutterRenderer$ImageReaderSurfaceProducer$b)this.imageReaderQueue.peekFirst();
                if (flutterRenderer$ImageReaderSurfaceProducer$b == null) {
                    break;
                }
                if (!flutterRenderer$ImageReaderSurfaceProducer$b.c()) {
                    break;
                }
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove((Object)flutterRenderer$ImageReaderSurfaceProducer$b.a);
                flutterRenderer$ImageReaderSurfaceProducer$b.d();
            }
        }
        
        public void release() {
            if (this.released) {
                return;
            }
            this.releaseInternal();
            this.this$0.D(this.id);
        }
        
        public void scheduleFrame() {
            this.this$0.w();
        }
        
        public void setCallback(final TextureRegistry$SurfaceProducer$a textureRegistry$SurfaceProducer$a) {
        }
        
        public void setSize(int max, int max2) {
            max = Math.max(1, max);
            max2 = Math.max(1, max2);
            if (this.requestedWidth == max && this.requestedHeight == max2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = max2;
            this.requestedWidth = max;
        }
    }
    
    @Keep
    final class ImageTextureRegistryEntry implements TextureRegistry$ImageTextureEntry, TextureRegistry$ImageConsumer
    {
        private static final String TAG = "ImageTextureRegistryEntry";
        private final long id;
        private boolean ignoringFence;
        private Image image;
        private boolean released;
        final FlutterRenderer this$0;
        
        ImageTextureRegistryEntry(final FlutterRenderer this$0, final long id) {
            this.this$0 = this$0;
            this.ignoringFence = false;
            this.id = id;
        }
        
        @TargetApi(29)
        private void maybeWaitOnFence(final Image image) {
            if (image == null) {
                return;
            }
            if (this.ignoringFence) {
                return;
            }
            if (Build$VERSION.SDK_INT >= 33) {
                this.waitOnFence(image);
                return;
            }
            this.ignoringFence = true;
            a3.b.a("ImageTextureRegistryEntry", "ImageTextureEntry can't wait on the fence on Android < 33");
        }
        
        @TargetApi(33)
        private void waitOnFence(final Image image) {
            try {
                io.flutter.embedding.engine.renderer.f.a(io.flutter.embedding.engine.renderer.e.a(image));
            }
            catch (final IOException ex) {}
        }
        
        @TargetApi(29)
        public Image acquireLatestImage() {
            synchronized (this) {
                final Image image = this.image;
                this.image = null;
                monitorexit(this);
                this.maybeWaitOnFence(image);
                return image;
            }
        }
        
        @Override
        protected void finalize() {
            try {
                if (this.released) {
                    return;
                }
                final Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                this.this$0.e.post((Runnable)new FlutterRenderer$g(this.id, this.this$0.a));
            }
            finally {
                super.finalize();
            }
        }
        
        public long id() {
            return this.id;
        }
        
        public void pushImage(final Image image) {
            if (this.released) {
                return;
            }
            synchronized (this) {
                final Image image2 = this.image;
                this.image = image;
                monitorexit(this);
                if (image2 != null) {
                    a3.b.b("ImageTextureRegistryEntry", "Dropping PlatformView Frame");
                    image2.close();
                }
                if (image != null) {
                    this.this$0.w();
                }
            }
        }
        
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            final Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            this.this$0.D(this.id);
        }
    }
    
    final class f implements TextureRegistry$SurfaceTextureEntry, TextureRegistry$b
    {
        private final long a;
        private final SurfaceTextureWrapper b;
        private boolean c;
        private TextureRegistry$b d;
        final FlutterRenderer e;
        
        f(final FlutterRenderer e, final long a, final SurfaceTexture surfaceTexture) {
            this.e = e;
            this.a = a;
            this.b = new SurfaceTextureWrapper(surfaceTexture, (Runnable)new j(this));
            this.surfaceTexture().setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)new io.flutter.embedding.engine.renderer.k(this), new Handler());
        }
        
        private void e() {
            this.e.v((TextureRegistry$b)this);
        }
        
        public SurfaceTextureWrapper f() {
            return this.b;
        }
        
        @Override
        protected void finalize() {
            try {
                if (this.c) {
                    return;
                }
                this.e.e.post((Runnable)new FlutterRenderer$g(this.a, this.e.a));
            }
            finally {
                super.finalize();
            }
        }
        
        public long id() {
            return this.a;
        }
        
        public void onTrimMemory(final int n) {
            final TextureRegistry$b d = this.d;
            if (d != null) {
                d.onTrimMemory(n);
            }
        }
        
        public void release() {
            if (this.c) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Releasing a SurfaceTexture (");
            sb.append(this.a);
            sb.append(").");
            a3.b.f("FlutterRenderer", sb.toString());
            this.b.release();
            this.e.D(this.a);
            this.e();
            this.c = true;
        }
        
        public void setOnFrameConsumedListener(final TextureRegistry$a textureRegistry$a) {
        }
        
        public void setOnTrimMemoryListener(final TextureRegistry$b d) {
            this.d = d;
        }
        
        public SurfaceTexture surfaceTexture() {
            return this.b.surfaceTexture();
        }
    }
}
