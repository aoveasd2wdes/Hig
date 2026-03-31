package a4;

import i4.l;
import java.lang.reflect.Method;

final class i
{
    public static final i a;
    private static final a b;
    private static a c;
    
    static {
        a = new i();
        b = new a(null, null, null);
    }
    
    private i() {
    }
    
    private final a a(final a4.a a) {
        try {
            return i.c = new a(Class.class.getDeclaredMethod("getModule", (Class<?>[])new Class[0]), a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class[])new Class[0]), a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class[])new Class[0]));
        }
        catch (final Exception ex) {
            return i.c = i.b;
        }
    }
    
    public final String b(final a4.a a) {
        l.e(a, "continuation");
        a a2;
        if ((a2 = i.c) == null) {
            a2 = this.a(a);
        }
        final a b = i.b;
        final String s = null;
        if (a2 == b) {
            return null;
        }
        final Method a3 = a2.a;
        Object invoke;
        if (a3 != null) {
            invoke = a3.invoke((Object)a.getClass(), new Object[0]);
        }
        else {
            invoke = null;
        }
        if (invoke == null) {
            return null;
        }
        final Method b2 = a2.b;
        Object invoke2;
        if (b2 != null) {
            invoke2 = b2.invoke(invoke, new Object[0]);
        }
        else {
            invoke2 = null;
        }
        if (invoke2 == null) {
            return null;
        }
        final Method c = a2.c;
        Object invoke3;
        if (c != null) {
            invoke3 = c.invoke(invoke2, new Object[0]);
        }
        else {
            invoke3 = null;
        }
        String s2 = s;
        if (invoke3 instanceof String) {
            s2 = (String)invoke3;
        }
        return s2;
    }
    
    private static final class a
    {
        public final Method a;
        public final Method b;
        public final Method c;
        
        public a(final Method a, final Method b, final Method c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
