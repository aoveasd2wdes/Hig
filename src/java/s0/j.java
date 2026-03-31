package s0;

import android.graphics.Rect;
import android.animation.TypeEvaluator;

class j implements TypeEvaluator
{
    private Rect a;
    
    public Rect a(final float n, Rect a, final Rect rect) {
        final int left = a.left;
        final int n2 = left + (int)((rect.left - left) * n);
        final int top = a.top;
        final int n3 = top + (int)((rect.top - top) * n);
        final int right = a.right;
        final int n4 = right + (int)((rect.right - right) * n);
        final int bottom = a.bottom;
        final int n5 = bottom + (int)((rect.bottom - bottom) * n);
        a = this.a;
        if (a == null) {
            return new Rect(n2, n3, n4, n5);
        }
        a.set(n2, n3, n4, n5);
        return this.a;
    }
}
