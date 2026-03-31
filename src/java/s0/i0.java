package s0;

import android.view.View;

class i0 extends g0
{
    private static boolean h = true;
    
    public void e(final View view, final int n, final int n2, final int n3, final int n4) {
        if (i0.h) {
            try {
                h0.a(view, n, n2, n3, n4);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                i0.h = false;
            }
        }
    }
}
