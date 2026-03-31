package s0;

import android.view.View;

abstract class d0 extends m0
{
    private static boolean e = true;
    
    public void a(final View view) {
    }
    
    public float c(final View view) {
        if (d0.e) {
            try {
                return c0.a(view);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                d0.e = false;
            }
        }
        return view.getAlpha();
    }
    
    public void d(final View view) {
    }
    
    public void f(final View view, final float alpha) {
        if (d0.e) {
            try {
                b0.a(view, alpha);
                return;
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                d0.e = false;
            }
        }
        view.setAlpha(alpha);
    }
}
