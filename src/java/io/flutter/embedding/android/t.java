package io.flutter.embedding.android;

import android.view.View;
import a3.b;
import android.util.AttributeSet;
import android.content.Context;
import android.view.TextureView$SurfaceTextureListener;
import android.view.Surface;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.m;
import android.view.TextureView;

public class t extends TextureView implements m
{
    private boolean c;
    private boolean d;
    private FlutterRenderer e;
    private Surface f;
    private final TextureView$SurfaceTextureListener g;
    
    public t(final Context context) {
        this(context, null);
    }
    
    public t(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = false;
        this.d = false;
        this.g = (TextureView$SurfaceTextureListener)new t$a(this);
        this.o();
    }
    
    private void l(final int n, final int n2) {
        if (this.e != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Notifying FlutterRenderer that Android surface size has changed to ");
            sb.append(n);
            sb.append(" x ");
            sb.append(n2);
            b.f("FlutterTextureView", sb.toString());
            this.e.B(n, n2);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }
    
    private void m() {
        if (this.e != null && this.getSurfaceTexture() != null) {
            final Surface f = this.f;
            if (f != null) {
                f.release();
                this.f = null;
            }
            final Surface f2 = new Surface(this.getSurfaceTexture());
            this.f = f2;
            this.e.z(f2, this.d);
            return;
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
    }
    
    private void n() {
        final FlutterRenderer e = this.e;
        if (e != null) {
            e.A();
            final Surface f = this.f;
            if (f != null) {
                f.release();
                this.f = null;
            }
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }
    
    private void o() {
        this.setSurfaceTextureListener(this.g);
    }
    
    private boolean q() {
        return this.e != null && !this.d;
    }
    
    public void a(final FlutterRenderer e) {
        b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.e != null) {
            b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.e.A();
        }
        this.e = e;
        this.d();
    }
    
    public void b() {
        if (this.e == null) {
            b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.d = true;
    }
    
    public void c() {
        if (this.e != null) {
            if (((View)this).getWindowToken() != null) {
                b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
                this.n();
            }
            this.e = null;
        }
        else {
            b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
        }
    }
    
    public void d() {
        if (this.e == null) {
            b.g("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.p()) {
            b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            this.m();
        }
        this.d = false;
    }
    
    public FlutterRenderer getAttachedRenderer() {
        return this.e;
    }
    
    boolean p() {
        return this.c;
    }
    
    public void setRenderSurface(final Surface f) {
        this.f = f;
    }
}
