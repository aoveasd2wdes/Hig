package io.flutter.plugin.platform;

import android.view.View;
import android.view.Gravity;
import android.view.WindowManager$LayoutParams;
import android.view.View$MeasureSpec;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;

class a0 extends ViewGroup
{
    private final Rect c;
    private final Rect d;
    
    public a0(final Context context) {
        super(context);
        this.c = new Rect();
        this.d = new Rect();
    }
    
    private static int a(final int n) {
        return View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n), Integer.MIN_VALUE);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            final WindowManager$LayoutParams windowManager$LayoutParams = (WindowManager$LayoutParams)child.getLayoutParams();
            this.c.set(n, n2, n3, n4);
            Gravity.apply(windowManager$LayoutParams.gravity, child.getMeasuredWidth(), child.getMeasuredHeight(), this.c, windowManager$LayoutParams.x, windowManager$LayoutParams.y, this.d);
            final Rect d = this.d;
            child.layout(d.left, d.top, d.right, d.bottom);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            this.getChildAt(i).measure(a(n), a(n2));
        }
        super.onMeasure(n, n2);
    }
}
