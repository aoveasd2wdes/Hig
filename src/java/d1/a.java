package d1;

import java.lang.reflect.Modifier;
import n4.b;
import java.lang.reflect.Method;
import android.util.Log;
import i4.l;

public final class a
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    private a() {
    }
    
    public static final boolean e(final String s, final h4.a a) {
        l.e(a, "block");
        boolean b = false;
        String s2 = null;
        StringBuilder sb2 = null;
        Label_0110: {
            try {
                final boolean booleanValue = (boolean)a.e();
                if (!booleanValue && s != null) {
                    Log.e("ReflectionGuard", s);
                }
                b = booleanValue;
                return b;
            }
            catch (final NoSuchMethodException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("NoSuchMethod: ");
                s2 = s;
                sb2 = sb;
                if (s != null) {
                    break Label_0110;
                }
                sb2 = sb;
            }
            catch (final ClassNotFoundException ex2) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("ClassNotFound: ");
                s2 = s;
                sb2 = sb3;
                if (s != null) {
                    break Label_0110;
                }
                sb2 = sb3;
            }
            s2 = "";
        }
        sb2.append(s2);
        Log.e("ReflectionGuard", sb2.toString());
        return b;
    }
    
    public final boolean a(final h4.a a) {
        l.e(a, "classLoader");
        boolean b = false;
        try {
            a.e();
            b = true;
            return b;
        }
        catch (final ClassNotFoundException | NoClassDefFoundError classNotFoundException | NoClassDefFoundError) {
            return b;
        }
    }
    
    public final boolean b(final Method method, final Class obj) {
        l.e(method, "<this>");
        l.e(obj, "clazz");
        return method.getReturnType().equals(obj);
    }
    
    public final boolean c(final Method method, final b b) {
        l.e(method, "<this>");
        l.e(b, "clazz");
        return this.b(method, g4.a.a(b));
    }
    
    public final boolean d(final Method method) {
        l.e(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }
}
