package io.flutter.embedding.android;

import android.graphics.Paint;
import android.graphics.Canvas;
import android.view.Surface;
import java.nio.ByteBuffer;
import android.media.Image$Plane;
import android.hardware.HardwareBuffer;
import java.nio.Buffer;
import android.graphics.Bitmap$Config;
import a3.b;
import java.util.Locale;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.content.Context;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageReader;
import io.flutter.embedding.engine.renderer.m;
import android.view.View;

public class r extends View implements m
{
    private ImageReader c;
    private Image d;
    private Bitmap e;
    private FlutterRenderer f;
    private r.r$b g;
    private boolean h;
    
    public r(final Context context, final int n, final int n2, final r.r$b r$b) {
        this(context, h(n, n2), r$b);
    }
    
    r(final Context context, final ImageReader c, final r.r$b g) {
        super(context, (AttributeSet)null);
        this.h = false;
        this.c = c;
        this.g = g;
        this.i();
    }
    
    private void f() {
        final Image d = this.d;
        if (d != null) {
            d.close();
            this.d = null;
        }
    }
    
    private static ImageReader h(int n, int n2) {
        if (n <= 0) {
            j("ImageReader width must be greater than 0, but given width=%d, set width=1", n);
            n = 1;
        }
        if (n2 <= 0) {
            j("ImageReader height must be greater than 0, but given height=%d, set height=1", n2);
            n2 = 1;
        }
        if (Build$VERSION.SDK_INT >= 29) {
            return l.a(n, n2, 1, 3, 768L);
        }
        return ImageReader.newInstance(n, n2, 1, 3);
    }
    
    private void i() {
        this.setAlpha(0.0f);
    }
    
    private static void j(final String s, final Object... array) {
        b.g("FlutterImageView", String.format(Locale.US, s, array));
    }
    
    private void l() {
        if (Build$VERSION.SDK_INT >= 29) {
            final HardwareBuffer a = io.flutter.embedding.android.m.a(this.d);
            this.e = p.a(a, o.a(n.a()));
            q.a(a);
        }
        else {
            final Image$Plane[] planes = this.d.getPlanes();
            if (planes.length != 1) {
                return;
            }
            final Image$Plane image$Plane = planes[0];
            final int n = image$Plane.getRowStride() / image$Plane.getPixelStride();
            final int height = this.d.getHeight();
            final Bitmap e = this.e;
            if (e == null || e.getWidth() != n || this.e.getHeight() != height) {
                this.e = Bitmap.createBitmap(n, height, Bitmap$Config.ARGB_8888);
            }
            final ByteBuffer buffer = image$Plane.getBuffer();
            buffer.rewind();
            this.e.copyPixelsFromBuffer((Buffer)buffer);
        }
    }
    
    public void a(final FlutterRenderer f) {
        if (r$a.a[((Enum)this.g).ordinal()] == 1) {
            f.C(this.c.getSurface());
        }
        this.setAlpha(1.0f);
        this.f = f;
        this.h = true;
    }
    
    public void b() {
    }
    
    public void c() {
        if (!this.h) {
            return;
        }
        this.setAlpha(0.0f);
        this.e();
        this.e = null;
        this.f();
        this.invalidate();
        this.h = false;
    }
    
    public void d() {
    }
    
    public boolean e() {
        final boolean h = this.h;
        boolean b = false;
        if (!h) {
            return false;
        }
        final Image acquireLatestImage = this.c.acquireLatestImage();
        if (acquireLatestImage != null) {
            this.f();
            this.d = acquireLatestImage;
            this.invalidate();
        }
        if (acquireLatestImage != null) {
            b = true;
        }
        return b;
    }
    
    public void g() {
        this.c.close();
    }
    
    public FlutterRenderer getAttachedRenderer() {
        return this.f;
    }
    
    public ImageReader getImageReader() {
        return this.c;
    }
    
    public Surface getSurface() {
        return this.c.getSurface();
    }
    
    public void k(final int n, final int n2) {
        if (this.f == null) {
            return;
        }
        if (n == this.c.getWidth() && n2 == this.c.getHeight()) {
            return;
        }
        this.f();
        this.g();
        this.c = h(n, n2);
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.d != null) {
            this.l();
        }
        final Bitmap e = this.e;
        if (e != null) {
            canvas.drawBitmap(e, 0.0f, 0.0f, (Paint)null);
        }
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        if (n == this.c.getWidth() && n2 == this.c.getHeight()) {
            return;
        }
        if (this.g == r.r$b.e && this.h) {
            this.k(n, n2);
            this.f.C(this.c.getSurface());
        }
    }
}
