package s0;

import android.graphics.Matrix;
import androidx.core.view.y;
import android.graphics.Rect;
import android.view.View;
import android.os.Build$VERSION;
import android.util.Property;

abstract class a0
{
    private static final m0 a;
    static final Property b;
    static final Property c;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        Object a2;
        if (sdk_INT >= 29) {
            a2 = new l0();
        }
        else if (sdk_INT >= 23) {
            a2 = new k0();
        }
        else if (sdk_INT >= 22) {
            a2 = new i0();
        }
        else {
            a2 = new g0();
        }
        a = (m0)a2;
        b = new Property("translationAlpha") {
            public Float a(final View view) {
                return a0.c(view);
            }
            
            public void b(final View view, final Float n) {
                a0.g(view, n);
            }
        };
        c = new Property("clipBounds") {
            public Rect a(final View view) {
                return y.h(view);
            }
            
            public void b(final View view, final Rect rect) {
                y.J(view, rect);
            }
        };
    }
    
    static void a(final View view) {
        a0.a.a(view);
    }
    
    static z b(final View view) {
        return (z)new s0.y(view);
    }
    
    static float c(final View view) {
        return a0.a.c(view);
    }
    
    static p0 d(final View view) {
        return (p0)new o0(view);
    }
    
    static void e(final View view) {
        a0.a.d(view);
    }
    
    static void f(final View view, final int n, final int n2, final int n3, final int n4) {
        a0.a.e(view, n, n2, n3, n4);
    }
    
    static void g(final View view, final float n) {
        a0.a.f(view, n);
    }
    
    static void h(final View view, final int n) {
        a0.a.g(view, n);
    }
    
    static void i(final View view, final Matrix matrix) {
        a0.a.h(view, matrix);
    }
    
    static void j(final View view, final Matrix matrix) {
        a0.a.i(view, matrix);
    }
}
