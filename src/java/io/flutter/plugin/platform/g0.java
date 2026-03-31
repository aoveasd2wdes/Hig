package io.flutter.plugin.platform;

import android.view.Surface;
import io.flutter.view.TextureRegistry$SurfaceProducer;

public class g0 implements q
{
    private TextureRegistry$SurfaceProducer a;
    
    public g0(final TextureRegistry$SurfaceProducer a) {
        this.a = a;
    }
    
    public long a() {
        return this.a.id();
    }
    
    public void b(final int n, final int n2) {
        this.a.setSize(n, n2);
    }
    
    public int getHeight() {
        return this.a.getHeight();
    }
    
    public Surface getSurface() {
        return this.a.getSurface();
    }
    
    public int getWidth() {
        return this.a.getWidth();
    }
    
    public void release() {
        this.a.release();
        this.a = null;
    }
    
    public void scheduleFrame() {
        this.a.scheduleFrame();
    }
}
