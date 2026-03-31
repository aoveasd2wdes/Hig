package io.flutter.plugin.platform;

import android.view.Surface;
import android.media.ImageReader$Builder;
import io.flutter.embedding.engine.renderer.d;
import io.flutter.embedding.engine.renderer.c;
import io.flutter.embedding.engine.renderer.a;
import io.flutter.embedding.engine.renderer.g;
import io.flutter.embedding.engine.renderer.h;
import io.flutter.embedding.android.l;
import android.media.Image;
import android.os.Build$VERSION;
import android.media.ImageReader$OnImageAvailableListener;
import android.os.Handler;
import android.media.ImageReader;
import io.flutter.view.TextureRegistry$ImageTextureEntry;

public class b implements q
{
    private TextureRegistry$ImageTextureEntry a;
    private ImageReader b;
    private int c;
    private int d;
    private final Handler e;
    private final ImageReader$OnImageAvailableListener f;
    
    public b(final TextureRegistry$ImageTextureEntry a) {
        this.c = 0;
        this.d = 0;
        this.e = new Handler();
        this.f = (ImageReader$OnImageAvailableListener)new b$a(this);
        if (Build$VERSION.SDK_INT >= 29) {
            this.a = a;
            return;
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }
    
    private void d() {
        if (this.b != null) {
            this.a.pushImage((Image)null);
            this.b.close();
            this.b = null;
        }
    }
    
    public long a() {
        return this.a.id();
    }
    
    public void b(final int c, final int d) {
        if (this.b != null && this.c == c && this.d == d) {
            return;
        }
        this.d();
        this.c = c;
        this.d = d;
        this.b = this.e();
    }
    
    protected ImageReader e() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 33) {
            return this.g();
        }
        if (sdk_INT >= 29) {
            return this.f();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }
    
    protected ImageReader f() {
        final ImageReader a = l.a(this.c, this.d, 34, 4, 256L);
        a.setOnImageAvailableListener(this.f, this.e);
        return a;
    }
    
    protected ImageReader g() {
        h.a();
        final ImageReader$Builder a = g.a(this.c, this.d);
        io.flutter.embedding.engine.renderer.a.a(a, 4);
        io.flutter.embedding.engine.renderer.b.a(a, 34);
        io.flutter.embedding.engine.renderer.c.a(a, 256L);
        final ImageReader a2 = io.flutter.embedding.engine.renderer.d.a(a);
        a2.setOnImageAvailableListener(this.f, this.e);
        return a2;
    }
    
    public int getHeight() {
        return this.d;
    }
    
    public Surface getSurface() {
        return this.b.getSurface();
    }
    
    public int getWidth() {
        return this.c;
    }
    
    public void release() {
        this.d();
        this.a = null;
    }
}
