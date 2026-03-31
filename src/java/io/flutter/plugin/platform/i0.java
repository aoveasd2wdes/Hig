package io.flutter.plugin.platform;

import android.os.Build$VERSION;
import io.flutter.view.TextureRegistry$b;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;

public class i0 implements q
{
    private final TextureRegistry$SurfaceTextureEntry a;
    private SurfaceTexture b;
    private Surface c;
    private int d;
    private int e;
    private boolean f;
    private final TextureRegistry$b g;
    
    public i0(final TextureRegistry$SurfaceTextureEntry a) {
        this.d = 0;
        this.e = 0;
        this.f = false;
        final TextureRegistry$b textureRegistry$b = (TextureRegistry$b)new TextureRegistry$b() {
            final i0 a;
            
            public void onTrimMemory(final int n) {
                if (n == 80 && Build$VERSION.SDK_INT >= 29) {
                    this.a.f = true;
                }
            }
        };
        this.g = (TextureRegistry$b)textureRegistry$b;
        if (Build$VERSION.SDK_INT >= 23) {
            this.a = a;
            this.b = a.surfaceTexture();
            a.setOnTrimMemoryListener((TextureRegistry$b)textureRegistry$b);
            return;
        }
        throw new UnsupportedOperationException("Platform views cannot be displayed below API level 23You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
    }
    
    private void e() {
        final Surface c = this.c;
        if (c != null && !this.f) {
            return;
        }
        if (c != null) {
            c.release();
            this.c = null;
        }
        this.c = this.d();
        this.f = false;
    }
    
    public long a() {
        return this.a.id();
    }
    
    public void b(final int d, final int e) {
        this.d = d;
        this.e = e;
        final SurfaceTexture b = this.b;
        if (b != null) {
            b.setDefaultBufferSize(d, e);
        }
    }
    
    protected Surface d() {
        return new Surface(this.b);
    }
    
    public int getHeight() {
        return this.e;
    }
    
    public Surface getSurface() {
        this.e();
        final SurfaceTexture b = this.b;
        if (b != null && !h0.a(b)) {
            return this.c;
        }
        return null;
    }
    
    public int getWidth() {
        return this.d;
    }
    
    public void release() {
        this.b = null;
        final Surface c = this.c;
        if (c != null) {
            c.release();
            this.c = null;
        }
    }
}
