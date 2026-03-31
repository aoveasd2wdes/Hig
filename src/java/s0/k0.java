package s0;

import android.os.Build$VERSION;
import android.view.View;

class k0 extends i0
{
    private static boolean i = true;
    
    public void g(final View view, final int n) {
        if (Build$VERSION.SDK_INT == 28) {
            super.g(view, n);
        }
        else if (k0.i) {
            try {
                j0.a(view, n);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                k0.i = false;
            }
        }
    }
}
