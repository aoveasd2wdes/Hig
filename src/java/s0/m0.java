package s0;

import java.lang.reflect.AccessibleObject;
import android.graphics.Matrix;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

abstract class m0
{
    private static Method a;
    private static boolean b;
    private static Field c;
    private static boolean d;
    
    private void b() {
        if (!m0.b) {
            try {
                final Class type = Integer.TYPE;
                ((AccessibleObject)(m0.a = View.class.getDeclaredMethod("setFrame", type, type, type, type))).setAccessible(true);
            }
            catch (final NoSuchMethodException ex) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", (Throwable)ex);
            }
            m0.b = true;
        }
    }
    
    public abstract void a(final View p0);
    
    public abstract float c(final View p0);
    
    public abstract void d(final View p0);
    
    public void e(final View view, final int n, final int n2, final int n3, final int n4) {
        this.b();
        final Method a = m0.a;
        if (a == null) {
            goto Label_0071;
        }
        try {
            a.invoke((Object)view, new Object[] { n, n2, n3, n4 });
            goto Label_0071;
        }
        catch (final InvocationTargetException ex) {
            throw new RuntimeException(ex.getCause());
        }
        catch (final IllegalAccessException ex2) {
            goto Label_0071;
        }
    }
    
    public abstract void f(final View p0, final float p1);
    
    public void g(final View view, final int n) {
        if (!m0.d) {
            try {
                ((AccessibleObject)(m0.c = View.class.getDeclaredField("mViewFlags"))).setAccessible(true);
            }
            catch (final NoSuchFieldException ex) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            m0.d = true;
        }
        final Field c = m0.c;
        if (c == null) {
            return;
        }
        try {
            m0.c.setInt((Object)view, n | (c.getInt((Object)view) & 0xFFFFFFF3));
        }
        catch (final IllegalAccessException ex2) {}
    }
    
    public abstract void h(final View p0, final Matrix p1);
    
    public abstract void i(final View p0, final Matrix p1);
}
