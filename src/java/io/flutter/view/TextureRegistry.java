package io.flutter.view;

import android.view.Surface;
import android.media.Image;
import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;

public interface TextureRegistry
{
    SurfaceProducer a();
    
    ImageTextureEntry b();
    
    SurfaceTextureEntry c();
    
    @Keep
    public interface GLTextureConsumer
    {
        SurfaceTexture getSurfaceTexture();
    }
    
    @Keep
    public interface ImageConsumer
    {
        Image acquireLatestImage();
    }
    
    @Keep
    public interface ImageTextureEntry
    {
        void pushImage(final Image p0);
    }
    
    @Keep
    public interface SurfaceProducer
    {
        int getHeight();
        
        Surface getSurface();
        
        int getWidth();
        
        void scheduleFrame();
        
        void setCallback(final a p0);
        
        void setSize(final int p0, final int p1);
        
        public interface a
        {
        }
    }
    
    @Keep
    public interface SurfaceTextureEntry
    {
        void setOnFrameConsumedListener(final TextureRegistry.a p0);
        
        void setOnTrimMemoryListener(final b p0);
        
        SurfaceTexture surfaceTexture();
    }
    
    public interface a
    {
    }
    
    public interface b
    {
        void onTrimMemory(final int p0);
    }
}
