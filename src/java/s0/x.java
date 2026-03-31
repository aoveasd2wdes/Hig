package s0;

import android.os.Build$VERSION;
import android.view.ViewGroup;

abstract class x
{
    private static boolean a = true;
    
    static v a(final ViewGroup viewGroup) {
        return (v)new u(viewGroup);
    }
    
    private static void b(final ViewGroup viewGroup, final boolean b) {
        if (x.a) {
            try {
                w.a(viewGroup, b);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                x.a = false;
            }
        }
    }
    
    static void c(final ViewGroup viewGroup, final boolean b) {
        if (Build$VERSION.SDK_INT >= 29) {
            w.a(viewGroup, b);
        }
        else {
            b(viewGroup, b);
        }
    }
}
