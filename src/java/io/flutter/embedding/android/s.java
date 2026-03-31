package io.flutter.embedding.android;

import android.view.View;
import android.graphics.Region$Op;
import android.graphics.Region;
import a3.b;
import android.util.AttributeSet;
import android.content.Context;
import io.flutter.embedding.engine.renderer.l;
import android.view.SurfaceHolder$Callback;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.m;
import android.view.SurfaceView;

public class s extends SurfaceView implements m
{
    private final boolean c;
    private boolean d;
    private boolean e;
    private FlutterRenderer f;
    private final SurfaceHolder$Callback g;
    private final l h;
    
    private s(final Context context, final AttributeSet set, final boolean c) {
        super(context, set);
        this.d = false;
        this.e = false;
        this.g = (SurfaceHolder$Callback)new s$a(this);
        this.h = (l)new l() {
            final s a;
            
            public void c() {
            }
            
            public void g() {
                b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
                ((View)this.a).setAlpha(1.0f);
                if (this.a.f != null) {
                    this.a.f.u((l)this);
                }
            }
        };
        this.c = c;
        this.n();
    }
    
    public s(final Context context, final boolean b) {
        this(context, null, b);
    }
    
    private void k(final int n, final int n2) {
        if (this.f != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Notifying FlutterRenderer that Android surface size has changed to ");
            sb.append(n);
            sb.append(" x ");
            sb.append(n2);
            b.f("FlutterSurfaceView", sb.toString());
            this.f.B(n, n2);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }
    
    private void l() {
        if (this.f != null && this.getHolder() != null) {
            this.f.z(this.getHolder().getSurface(), this.e);
            return;
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
    }
    
    private void m() {
        final FlutterRenderer f = this.f;
        if (f != null) {
            f.A();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }
    
    private void n() {
        if (this.c) {
            this.getHolder().setFormat(-2);
            this.setZOrderOnTop(true);
        }
        this.getHolder().addCallback(this.g);
        ((View)this).setAlpha(0.0f);
    }
    
    private boolean p() {
        return this.f != null && !this.e;
    }
    
    public void a(final FlutterRenderer f) {
        b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f != null) {
            b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f.A();
            this.f.u(this.h);
        }
        this.f = f;
        this.d();
    }
    
    public void b() {
        if (this.f == null) {
            b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.e = true;
    }
    
    public void c() {
        if (this.f != null) {
            if (((View)this).getWindowToken() != null) {
                b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
                this.m();
            }
            ((View)this).setAlpha(0.0f);
            this.f.u(this.h);
            this.f = null;
        }
        else {
            b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
        }
    }
    
    public void d() {
        final FlutterRenderer f = this.f;
        if (f == null) {
            b.g("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        f.j(this.h);
        if (this.o()) {
            b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            this.l();
        }
        this.e = false;
    }
    
    public boolean gatherTransparentRegion(final Region region) {
        if (((View)this).getAlpha() < 1.0f) {
            return false;
        }
        final int[] array = new int[2];
        ((View)this).getLocationInWindow(array);
        final int n = array[0];
        region.op(n, array[1], ((View)this).getRight() + n - ((View)this).getLeft(), array[1] + ((View)this).getBottom() - ((View)this).getTop(), Region$Op.DIFFERENCE);
        return true;
    }
    
    public FlutterRenderer getAttachedRenderer() {
        return this.f;
    }
    
    boolean o() {
        return this.d;
    }
}
