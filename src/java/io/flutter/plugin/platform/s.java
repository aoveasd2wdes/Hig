package io.flutter.plugin.platform;

import android.view.ViewGroup;
import t3.i;
import android.view.View$OnFocusChangeListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.graphics.Rect;
import a3.b;
import android.view.ViewTreeObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff$Mode;
import android.view.Surface;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import android.content.Context;
import android.view.ViewTreeObserver$OnGlobalFocusChangeListener;
import io.flutter.embedding.android.c;
import android.widget.FrameLayout;

public class s extends FrameLayout
{
    private int c;
    private int d;
    private int e;
    private int f;
    private c g;
    private q h;
    private ViewTreeObserver$OnGlobalFocusChangeListener i;
    
    public s(final Context context) {
        super(context);
        ((View)this).setWillNotDraw(false);
    }
    
    public s(Context surface, final q h) {
        this(surface);
        this.h = h;
        surface = (Context)h.getSurface();
        if (surface != null && !FlutterRenderer.j) {
            final Canvas a = r.a((Surface)surface);
            try {
                a.drawColor(0, PorterDuff$Mode.CLEAR);
            }
            finally {
                ((Surface)surface).unlockCanvasAndPost(a);
            }
        }
    }
    
    public void a() {
        final q h = this.h;
        if (h != null) {
            h.release();
            this.h = null;
        }
    }
    
    public void b(final int n, final int n2) {
        final q h = this.h;
        if (h != null) {
            h.b(n, n2);
        }
    }
    
    public void c() {
        final ViewTreeObserver viewTreeObserver = ((View)this).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            final ViewTreeObserver$OnGlobalFocusChangeListener i = this.i;
            if (i != null) {
                this.i = null;
                viewTreeObserver.removeOnGlobalFocusChangeListener(i);
            }
        }
    }
    
    public void draw(Canvas surface) {
        final q h = this.h;
        String s;
        if (h == null) {
            super.draw(surface);
            s = "Platform view cannot be composed without a RenderTarget.";
        }
        else {
            surface = (Canvas)h.getSurface();
            if (!((Surface)surface).isValid()) {
                s = "Platform view cannot be composed without a valid RenderTarget surface.";
            }
            else {
                final Canvas a = r.a((Surface)surface);
                if (a == null) {
                    ((View)this).invalidate();
                    return;
                }
                try {
                    a.drawColor(0, PorterDuff$Mode.CLEAR);
                    super.draw(a);
                    return;
                }
                finally {
                    this.h.scheduleFrame();
                    ((Surface)surface).unlockCanvasAndPost(a);
                }
            }
        }
        b.b("PlatformViewWrapper", s);
    }
    
    public ViewTreeObserver$OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.i;
    }
    
    public int getRenderTargetHeight() {
        final q h = this.h;
        if (h != null) {
            return h.getHeight();
        }
        return 0;
    }
    
    public int getRenderTargetWidth() {
        final q h = this.h;
        if (h != null) {
            return h.getWidth();
        }
        return 0;
    }
    
    public ViewParent invalidateChildInParent(final int[] array, final Rect rect) {
        ((View)this).invalidate();
        return super.invalidateChildInParent(array, rect);
    }
    
    public void onDescendantInvalidated(final View view, final View view2) {
        super.onDescendantInvalidated(view, view2);
        ((View)this).invalidate();
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return true;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.g == null) {
            return super.onTouchEvent(motionEvent);
        }
        final Matrix matrix = new Matrix();
        final int action = motionEvent.getAction();
        float n;
        int d;
        if (action != 0) {
            if (action == 2) {
                matrix.postTranslate((float)this.c, (float)this.d);
                this.c = this.e;
                this.d = this.f;
                return this.g.l(motionEvent, matrix);
            }
            n = (float)this.e;
            d = this.f;
        }
        else {
            final int e = this.e;
            this.c = e;
            d = this.f;
            this.d = d;
            n = (float)e;
        }
        matrix.postTranslate(n, (float)d);
        return this.g.l(motionEvent, matrix);
    }
    
    public boolean requestSendAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        final View child = ((ViewGroup)this).getChildAt(0);
        return (child == null || child.getImportantForAccessibility() != 4) && super.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
    
    public void setLayoutParams(final FrameLayout$LayoutParams layoutParams) {
        super.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.e = layoutParams.leftMargin;
        this.f = layoutParams.topMargin;
    }
    
    public void setOnDescendantFocusChangeListener(final View$OnFocusChangeListener view$OnFocusChangeListener) {
        this.c();
        final ViewTreeObserver viewTreeObserver = ((View)this).getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.i == null) {
            viewTreeObserver.addOnGlobalFocusChangeListener(this.i = (ViewTreeObserver$OnGlobalFocusChangeListener)new ViewTreeObserver$OnGlobalFocusChangeListener(this, view$OnFocusChangeListener) {
                final View$OnFocusChangeListener a;
                final s b;
                
                public void onGlobalFocusChanged(final View view, final View view2) {
                    final View$OnFocusChangeListener a = this.a;
                    final s b = this.b;
                    a.onFocusChange((View)b, t3.i.d((View)b));
                }
            });
        }
    }
    
    public void setTouchProcessor(final c g) {
        this.g = g;
    }
}
