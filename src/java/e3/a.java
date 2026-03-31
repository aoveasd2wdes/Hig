package e3;

import android.view.ViewGroup;
import t3.i;
import android.view.View$OnFocusChangeListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.MotionEvent;
import java.util.Iterator;
import android.graphics.Path;
import android.graphics.Canvas;
import android.view.ViewTreeObserver;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewTreeObserver$OnGlobalFocusChangeListener;
import io.flutter.embedding.android.c;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import android.widget.FrameLayout;

public class a extends FrameLayout
{
    private FlutterMutatorsStack c;
    private float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final c i;
    ViewTreeObserver$OnGlobalFocusChangeListener j;
    
    public a(final Context context, final float d, final c i) {
        super(context, (AttributeSet)null);
        this.d = d;
        this.i = i;
    }
    
    private Matrix getPlatformViewMatrix() {
        final Matrix matrix = new Matrix(this.c.getFinalMatrix());
        final float d = this.d;
        matrix.preScale(1.0f / d, 1.0f / d);
        matrix.postTranslate((float)(-this.e), (float)(-this.f));
        return matrix;
    }
    
    public void a(final FlutterMutatorsStack c, final int n, final int n2, final int n3, final int n4) {
        this.c = c;
        this.e = n;
        this.f = n2;
        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(n3, n4);
        layoutParams.leftMargin = n;
        layoutParams.topMargin = n2;
        ((View)this).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        ((View)this).setWillNotDraw(false);
    }
    
    public void b() {
        final ViewTreeObserver viewTreeObserver = ((View)this).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            final ViewTreeObserver$OnGlobalFocusChangeListener j = this.j;
            if (j != null) {
                this.j = null;
                viewTreeObserver.removeOnGlobalFocusChangeListener(j);
            }
        }
    }
    
    public void dispatchDraw(final Canvas canvas) {
        canvas.save();
        canvas.concat(this.getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
    
    public void draw(final Canvas canvas) {
        canvas.save();
        final Iterator iterator = this.c.getFinalClippingPaths().iterator();
        while (iterator.hasNext()) {
            final Path path = new Path((Path)iterator.next());
            path.offset((float)(-this.e), (float)(-this.f));
            canvas.clipPath(path);
        }
        super.draw(canvas);
        canvas.restore();
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return true;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.i == null) {
            return super.onTouchEvent(motionEvent);
        }
        final Matrix matrix = new Matrix();
        final int action = motionEvent.getAction();
        float n;
        int h;
        if (action != 0) {
            if (action == 2) {
                matrix.postTranslate((float)this.g, (float)this.h);
                this.g = this.e;
                this.h = this.f;
                return this.i.l(motionEvent, matrix);
            }
            n = (float)this.e;
            h = this.f;
        }
        else {
            final int e = this.e;
            this.g = e;
            h = this.f;
            this.h = h;
            n = (float)e;
        }
        matrix.postTranslate(n, (float)h);
        return this.i.l(motionEvent, matrix);
    }
    
    public boolean requestSendAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        final View child = ((ViewGroup)this).getChildAt(0);
        return (child == null || child.getImportantForAccessibility() != 4) && super.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
    
    public void setOnDescendantFocusChangeListener(final View$OnFocusChangeListener view$OnFocusChangeListener) {
        this.b();
        final ViewTreeObserver viewTreeObserver = ((View)this).getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.j == null) {
            viewTreeObserver.addOnGlobalFocusChangeListener(this.j = (ViewTreeObserver$OnGlobalFocusChangeListener)new ViewTreeObserver$OnGlobalFocusChangeListener(this, view$OnFocusChangeListener, this) {
                final View$OnFocusChangeListener a;
                final View b;
                final a c;
                
                public void onGlobalFocusChanged(View b, final View view) {
                    final View$OnFocusChangeListener a = this.a;
                    b = this.b;
                    a.onFocusChange(b, t3.i.d(b));
                }
            });
        }
    }
}
