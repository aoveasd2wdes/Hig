package io.flutter.embedding.engine.renderer;

import io.flutter.view.TextureRegistry$SurfaceProducer$a;
import android.graphics.SurfaceTexture;
import io.flutter.embedding.engine.FlutterJNI;
import android.os.Handler;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import android.view.Surface;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;

final class n implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer
{
    private final long a;
    private int b;
    private int c;
    private boolean d;
    private Surface e;
    private final TextureRegistry$SurfaceTextureEntry f;
    private final Handler g;
    private final FlutterJNI h;
    
    n(final long a, final Handler g, final FlutterJNI h, final TextureRegistry$SurfaceTextureEntry f) {
        this.a = a;
        this.g = g;
        this.h = h;
        this.f = f;
    }
    
    @Override
    protected void finalize() {
        try {
            if (this.d) {
                return;
            }
            this.release();
            this.g.post((Runnable)new FlutterRenderer$g(this.a, this.h));
        }
        finally {
            super.finalize();
        }
    }
    
    public int getHeight() {
        return this.c;
    }
    
    public Surface getSurface() {
        if (this.e == null) {
            this.e = new Surface(this.f.surfaceTexture());
        }
        return this.e;
    }
    
    public SurfaceTexture getSurfaceTexture() {
        return this.f.surfaceTexture();
    }
    
    public int getWidth() {
        return this.b;
    }
    
    public long id() {
        return this.a;
    }
    
    public void release() {
        this.f.release();
        this.d = true;
    }
    
    public void scheduleFrame() {
        this.h.markTextureFrameAvailable(this.a);
    }
    
    public void setCallback(final TextureRegistry$SurfaceProducer$a textureRegistry$SurfaceProducer$a) {
    }
    
    public void setSize(final int b, final int c) {
        this.b = b;
        this.c = c;
        this.getSurfaceTexture().setDefaultBufferSize(b, c);
    }
}
