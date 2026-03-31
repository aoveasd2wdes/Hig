package io.flutter.plugin.platform;

import android.app.Dialog;
import android.view.ViewTreeObserver$OnDrawListener;
import android.view.View$OnAttachStateChangeListener;
import android.os.Build$VERSION;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.util.DisplayMetrics;
import android.os.Handler;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.View$OnFocusChangeListener;
import android.content.Context;
import android.hardware.display.VirtualDisplay$Callback;

class j0
{
    private static VirtualDisplay$Callback i;
    SingleViewPresentation a;
    private final Context b;
    private final a c;
    private final int d;
    private final int e;
    private final q f;
    private final View$OnFocusChangeListener g;
    private VirtualDisplay h;
    
    static {
        j0.i = new VirtualDisplay$Callback() {
            public void onPaused() {
            }
            
            public void onResumed() {
            }
        };
    }
    
    private j0(final Context b, final a c, final VirtualDisplay h, final l l, final q f, final View$OnFocusChangeListener g, final int e, final Object o) {
        this.b = b;
        this.c = c;
        this.f = f;
        this.g = g;
        this.e = e;
        this.h = h;
        this.d = b.getResources().getDisplayMetrics().densityDpi;
        ((Dialog)(this.a = new SingleViewPresentation(b, this.h.getDisplay(), l, c, e, g))).show();
    }
    
    public static j0 b(final Context context, final a a, final l l, final q q, final int n, final int n2, final int n3, final Object o, final View$OnFocusChangeListener view$OnFocusChangeListener) {
        j0 j0 = null;
        if (n != 0) {
            if (n2 == 0) {
                j0 = j0;
            }
            else {
                final DisplayManager displayManager = (DisplayManager)context.getSystemService("display");
                final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                q.b(n, n2);
                final StringBuilder sb = new StringBuilder();
                sb.append("flutter-vd#");
                sb.append(n3);
                final VirtualDisplay virtualDisplay = displayManager.createVirtualDisplay(sb.toString(), n, n2, displayMetrics.densityDpi, q.getSurface(), 0, io.flutter.plugin.platform.j0.i, (Handler)null);
                if (virtualDisplay == null) {
                    return null;
                }
                j0 = new j0(context, a, virtualDisplay, l, q, view$OnFocusChangeListener, n3, o);
            }
        }
        return j0;
    }
    
    private void l(final View view, final int n, final int n2, final Runnable runnable) {
        this.f.b(n, n2);
        this.h.resize(n, n2, this.d);
        this.h.setSurface(this.f.getSurface());
        view.postDelayed(runnable, 0L);
    }
    
    public void a() {
        this.h.setSurface((Surface)null);
    }
    
    public void c(final MotionEvent motionEvent) {
        final SingleViewPresentation a = this.a;
        if (a == null) {
            return;
        }
        ((Dialog)a).dispatchTouchEvent(motionEvent);
    }
    
    public void d() {
        ((Dialog)this.a).cancel();
        this.a.detachState();
        this.h.release();
        this.f.release();
    }
    
    public int e() {
        final q f = this.f;
        if (f != null) {
            return f.getHeight();
        }
        return 0;
    }
    
    public int f() {
        final q f = this.f;
        if (f != null) {
            return f.getWidth();
        }
        return 0;
    }
    
    public View g() {
        final SingleViewPresentation a = this.a;
        if (a == null) {
            return null;
        }
        return a.getView().X();
    }
    
    void h() {
        final SingleViewPresentation a = this.a;
        if (a != null) {
            if (a.getView() != null) {
                this.a.getView().o0();
            }
        }
    }
    
    void i() {
        final SingleViewPresentation a = this.a;
        if (a != null) {
            if (a.getView() != null) {
                this.a.getView().f0();
            }
        }
    }
    
    public void j() {
        final int f = this.f();
        final int e = this.e();
        final boolean focused = this.g().isFocused();
        final SingleViewPresentation.d detachState = this.a.detachState();
        this.h.setSurface((Surface)null);
        this.h.release();
        final DisplayManager displayManager = (DisplayManager)this.b.getSystemService("display");
        final StringBuilder sb = new StringBuilder();
        sb.append("flutter-vd#");
        sb.append(this.e);
        this.h = displayManager.createVirtualDisplay(sb.toString(), f, e, this.d, this.f.getSurface(), 0, j0.i, (Handler)null);
        final SingleViewPresentation a = new SingleViewPresentation(this.b, this.h.getDisplay(), this.c, detachState, this.g, focused);
        ((Dialog)a).show();
        ((Dialog)this.a).cancel();
        this.a = a;
    }
    
    public void k(final int n, final int n2, final Runnable runnable) {
        if (n == this.f() && n2 == this.e()) {
            this.g().postDelayed(runnable, 0L);
            return;
        }
        if (Build$VERSION.SDK_INT >= 31) {
            this.l(this.g(), n, n2, runnable);
            return;
        }
        final boolean focused = this.g().isFocused();
        final SingleViewPresentation.d detachState = this.a.detachState();
        this.h.setSurface((Surface)null);
        this.h.release();
        final DisplayManager displayManager = (DisplayManager)this.b.getSystemService("display");
        this.f.b(n, n2);
        final StringBuilder sb = new StringBuilder();
        sb.append("flutter-vd#");
        sb.append(this.e);
        this.h = displayManager.createVirtualDisplay(sb.toString(), n, n2, this.d, this.f.getSurface(), 0, j0.i, (Handler)null);
        final View g = this.g();
        g.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener(this, g, runnable) {
            final View c;
            final Runnable d;
            final j0 e;
            
            public void onViewAttachedToWindow(final View view) {
                j0.c.a(this.c, (Runnable)new Runnable(this) {
                    final j0$b e;
                    
                    public void run() {
                        final View$OnAttachStateChangeListener e = (View$OnAttachStateChangeListener)this.e;
                        e.c.postDelayed(e.d, 128L);
                    }
                });
                this.c.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
            
            public void onViewDetachedFromWindow(final View view) {
            }
        });
        final SingleViewPresentation a = new SingleViewPresentation(this.b, this.h.getDisplay(), this.c, detachState, this.g, focused);
        ((Dialog)a).show();
        ((Dialog)this.a).cancel();
        this.a = a;
    }
    
    static class c implements ViewTreeObserver$OnDrawListener
    {
        final View a;
        Runnable b;
        
        c(final View a, final Runnable b) {
            this.a = a;
            this.b = b;
        }
        
        static void a(final View view, final Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener((ViewTreeObserver$OnDrawListener)new c(view, runnable));
        }
        
        public void onDraw() {
            final Runnable b = this.b;
            if (b == null) {
                return;
            }
            b.run();
            this.b = null;
            this.a.post((Runnable)new Runnable(this) {
                final c e;
                
                public void run() {
                    this.e.a.getViewTreeObserver().removeOnDrawListener((ViewTreeObserver$OnDrawListener)this.e);
                }
            });
        }
    }
}
