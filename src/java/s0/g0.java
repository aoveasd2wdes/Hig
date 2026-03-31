package s0;

import android.graphics.Matrix;
import android.view.View;

class g0 extends d0
{
    private static boolean f = true;
    private static boolean g = true;
    
    public void h(final View view, final Matrix matrix) {
        if (g0.f) {
            try {
                f0.a(view, matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                g0.f = false;
            }
        }
    }
    
    public void i(final View view, final Matrix matrix) {
        if (g0.g) {
            try {
                e0.a(view, matrix);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                g0.g = false;
            }
        }
    }
}
