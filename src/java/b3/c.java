package b3;

import java.util.concurrent.Executor;
import java.nio.Buffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import a3.a;
import java.util.concurrent.ExecutorService;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import k3.c$c;
import k3.c$d;
import k3.c$b;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;
import io.flutter.embedding.engine.FlutterJNI;

class c implements c, f
{
    private final FlutterJNI a;
    private final Map b;
    private Map c;
    private final Object d;
    private final AtomicBoolean e;
    private final Map f;
    private int g;
    private final b3.c.c$d h;
    private WeakHashMap i;
    private c$i j;
    
    c(final FlutterJNI flutterJNI) {
        this(flutterJNI, (c$i)new e());
    }
    
    c(final FlutterJNI a, final c$i j) {
        this.b = (Map)new HashMap();
        this.c = (Map)new HashMap();
        this.d = new Object();
        this.e = new AtomicBoolean(false);
        this.f = (Map)new HashMap();
        this.g = 1;
        this.h = (b3.c.c$d)new b3.g();
        this.i = new WeakHashMap();
        this.a = a;
        this.j = j;
    }
    
    private void j(final String s, final c$f c$f, final ByteBuffer byteBuffer, final int n, final long n2) {
        b3.c.c$d b;
        if (c$f != null) {
            b = c$f.b;
        }
        else {
            b = null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("PlatformChannel ScheduleHandler on ");
        sb.append(s);
        t3.f.b(sb.toString(), n);
        final b b2 = new b(this, s, n, c$f, byteBuffer, n2);
        b3.c.c$d h = b;
        if (b == null) {
            h = this.h;
        }
        h.a((Runnable)b2);
    }
    
    private static void k(final Error error) {
        final Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() != null) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, (Throwable)error);
            return;
        }
        throw error;
    }
    
    private void l(final c$f c$f, final ByteBuffer byteBuffer, final int n) {
        Label_0069: {
            if (c$f != null) {
                try {
                    a3.b.f("DartMessenger", "Deferring to registered handler to process message.");
                    c$f.a.a(byteBuffer, (c$b)new g(this.a, n));
                    return;
                }
                catch (final Error error) {
                    k(error);
                    return;
                }
                catch (final Exception ex) {
                    a3.b.c("DartMessenger", "Uncaught exception in binary message listener", (Throwable)ex);
                    break Label_0069;
                }
            }
            a3.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.a.invokePlatformMessageEmptyResponseCallback(n);
    }
    
    public c$c a(final c$d c$d) {
        final b3.c.c$d a = this.j.a(c$d);
        final j j = new j(null);
        this.i.put((Object)j, (Object)a);
        return (c$c)j;
    }
    
    public void b(final String s, final ByteBuffer byteBuffer) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Sending message over channel '");
        sb.append(s);
        sb.append("'");
        a3.b.f("DartMessenger", sb.toString());
        this.h(s, byteBuffer, null);
    }
    
    public void c(final String s, final k3.c$a c$a) {
        this.e(s, c$a, null);
    }
    
    public void d(final int n, final ByteBuffer byteBuffer) {
        a3.b.f("DartMessenger", "Received message reply from Dart.");
        final c$b c$b = (c$b)this.f.remove((Object)n);
        if (c$b != null) {
            try {
                a3.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                c$b.a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            }
            catch (final Error error) {
                k(error);
            }
            catch (final Exception ex) {
                a3.b.c("DartMessenger", "Uncaught exception in binary message reply handler", (Throwable)ex);
            }
        }
    }
    
    public void e(final String s, final k3.c$a c$a, final c$c c$c) {
        if (c$a == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Removing handler for channel '");
            sb.append(s);
            sb.append("'");
            a3.b.f("DartMessenger", sb.toString());
            final Object d = this.d;
            synchronized (d) {
                this.b.remove((Object)s);
                return;
            }
        }
        b3.c.c$d c$d;
        if (c$c != null) {
            c$d = (b3.c.c$d)this.i.get((Object)c$c);
            if (c$d == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        }
        else {
            c$d = null;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Setting handler for channel '");
        sb2.append(s);
        sb2.append("'");
        a3.b.f("DartMessenger", sb2.toString());
        final Object d2 = this.d;
        synchronized (d2) {
            this.b.put((Object)s, (Object)new c$f(c$a, c$d));
            final List list = (List)this.c.remove((Object)s);
            if (list == null) {
                return;
            }
            monitorexit(d2);
            for (final b3.c.c$b c$b : list) {
                this.j(s, (c$f)this.b.get((Object)s), c$b.a, c$b.b, c$b.c);
            }
        }
    }
    
    public void g(final String s, final ByteBuffer byteBuffer, final int n, final long n2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Received message from Dart over channel '");
        sb.append(s);
        sb.append("'");
        a3.b.f("DartMessenger", sb.toString());
        final Object d = this.d;
        synchronized (d) {
            final c$f c$f = (c$f)this.b.get((Object)s);
            final boolean b = this.e.get() && c$f == null;
            if (b) {
                if (!this.c.containsKey((Object)s)) {
                    this.c.put((Object)s, (Object)new LinkedList());
                }
                ((List)this.c.get((Object)s)).add((Object)new b3.c.c$b(byteBuffer, n, n2));
            }
            monitorexit(d);
            if (!b) {
                this.j(s, c$f, byteBuffer, n, n2);
            }
        }
    }
    
    public void h(final String s, final ByteBuffer byteBuffer, final c$b c$b) {
        final StringBuilder sb = new StringBuilder();
        sb.append("DartMessenger#send on ");
        sb.append(s);
        final t3.f h = t3.f.h(sb.toString());
        try {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Sending message with callback over channel '");
            sb2.append(s);
            sb2.append("'");
            a3.b.f("DartMessenger", sb2.toString());
            final int n = this.g++;
            if (c$b != null) {
                this.f.put((Object)n, (Object)c$b);
            }
            if (byteBuffer == null) {
                this.a.dispatchEmptyPlatformMessage(s, n);
            }
            else {
                this.a.dispatchPlatformMessage(s, byteBuffer, ((Buffer)byteBuffer).position(), n);
            }
            if (h != null) {
                h.close();
            }
        }
        finally {
            if (h != null) {
                try {
                    h.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)s).addSuppressed(t);
                }
            }
        }
    }
    
    static class c implements b3.c$d
    {
        private final ExecutorService a;
        
        c(final ExecutorService a) {
            this.a = a;
        }
        
        public void a(final Runnable runnable) {
            ((Executor)this.a).execute(runnable);
        }
    }
    
    private static class e implements c$i
    {
        ExecutorService a;
        
        e() {
            this.a = a.e().b();
        }
        
        public b3.c$d a(final c$d c$d) {
            if (c$d.a()) {
                return (b3.c$d)new h(this.a);
            }
            return (b3.c$d)new c(this.a);
        }
    }
    
    static class g implements c$b
    {
        private final FlutterJNI a;
        private final int b;
        private final AtomicBoolean c;
        
        g(final FlutterJNI a, final int b) {
            this.c = new AtomicBoolean(false);
            this.a = a;
            this.b = b;
        }
        
        public void a(final ByteBuffer byteBuffer) {
            if (!this.c.getAndSet(true)) {
                if (byteBuffer == null) {
                    this.a.invokePlatformMessageEmptyResponseCallback(this.b);
                }
                else {
                    this.a.invokePlatformMessageResponseCallback(this.b, byteBuffer, ((Buffer)byteBuffer).position());
                }
                return;
            }
            throw new IllegalStateException("Reply already submitted");
        }
    }
    
    static class h implements b3.c$d
    {
        private final ExecutorService a;
        private final ConcurrentLinkedQueue b;
        private final AtomicBoolean c;
        
        h(final ExecutorService a) {
            this.a = a;
            this.b = new ConcurrentLinkedQueue();
            this.c = new AtomicBoolean(false);
        }
        
        private void d() {
            if (this.c.compareAndSet(false, true)) {
                try {
                    final Runnable runnable = (Runnable)this.b.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                finally {
                    this.c.set(false);
                    if (!this.b.isEmpty()) {
                        ((Executor)this.a).execute((Runnable)new b3.e(this));
                    }
                }
            }
        }
        
        public void a(final Runnable runnable) {
            this.b.add((Object)runnable);
            ((Executor)this.a).execute((Runnable)new d(this));
        }
    }
    
    private static class j implements c$c
    {
    }
}
