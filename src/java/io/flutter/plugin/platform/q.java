package io.flutter.plugin.platform;

import android.view.Surface;

public interface q
{
    long a();
    
    void b(final int p0, final int p1);
    
    int getHeight();
    
    Surface getSurface();
    
    int getWidth();
    
    void release();
    
    void scheduleFrame();
}
