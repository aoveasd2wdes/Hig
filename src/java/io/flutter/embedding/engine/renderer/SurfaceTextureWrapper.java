package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;

@Keep
public class SurfaceTextureWrapper
{
    private boolean attached;
    private boolean newFrameAvailable;
    private Runnable onFrameConsumed;
    private boolean released;
    private SurfaceTexture surfaceTexture;
    
    public SurfaceTextureWrapper(final SurfaceTexture surfaceTexture) {
        this(surfaceTexture, null);
    }
    
    public SurfaceTextureWrapper(final SurfaceTexture surfaceTexture, final Runnable onFrameConsumed) {
        this.newFrameAvailable = false;
        this.surfaceTexture = surfaceTexture;
        this.released = false;
        this.onFrameConsumed = onFrameConsumed;
    }
    
    public void attachToGLContext(final int n) {
        synchronized (this) {
            if (this.released) {
                return;
            }
            if (this.attached) {
                this.surfaceTexture.detachFromGLContext();
            }
            this.surfaceTexture.attachToGLContext(n);
            this.attached = true;
        }
    }
    
    public void detachFromGLContext() {
        synchronized (this) {
            if (this.attached && !this.released) {
                this.surfaceTexture.detachFromGLContext();
                this.attached = false;
            }
        }
    }
    
    public void getTransformMatrix(final float[] array) {
        this.surfaceTexture.getTransformMatrix(array);
    }
    
    public void markDirty() {
        synchronized (this) {
            this.newFrameAvailable = true;
        }
    }
    
    public void release() {
        synchronized (this) {
            if (!this.released) {
                this.surfaceTexture.release();
                this.released = true;
                this.attached = false;
            }
        }
    }
    
    public boolean shouldUpdate() {
        synchronized (this) {
            return this.newFrameAvailable;
        }
    }
    
    public SurfaceTexture surfaceTexture() {
        return this.surfaceTexture;
    }
    
    public void updateTexImage() {
        synchronized (this) {
            this.newFrameAvailable = false;
            if (!this.released) {
                this.surfaceTexture.updateTexImage();
                final Runnable onFrameConsumed = this.onFrameConsumed;
                if (onFrameConsumed != null) {
                    onFrameConsumed.run();
                }
            }
        }
    }
}
