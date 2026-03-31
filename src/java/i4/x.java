package i4;

import n4.g;
import n4.f;
import n4.d;
import n4.e;
import n4.b;

public abstract class x
{
    private static final y a;
    private static final b[] b;
    
    static {
        y a2 = null;
        try {
            a2 = (y)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        }
        catch (final ClassCastException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {}
        if (a2 == null) {
            a2 = new y();
        }
        a = a2;
        b = new b[0];
    }
    
    public static e a(final i i) {
        return x.a.a(i);
    }
    
    public static b b(final Class clazz) {
        return x.a.b(clazz);
    }
    
    public static d c(final Class clazz) {
        return x.a.c(clazz, "");
    }
    
    public static f d(final o o) {
        return x.a.d(o);
    }
    
    public static g e(final q q) {
        return x.a.e(q);
    }
    
    public static String f(final h h) {
        return x.a.f(h);
    }
    
    public static String g(final m m) {
        return x.a.g(m);
    }
}
