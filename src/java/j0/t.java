package j0;

import p.g;

public abstract class t
{
    private static final g a;
    
    static {
        a = new g();
    }
    
    static boolean b(final ClassLoader classLoader, final String s) {
        try {
            return o.class.isAssignableFrom(c(classLoader, s));
        }
        catch (final ClassNotFoundException ex) {
            return false;
        }
    }
    
    private static Class c(final ClassLoader loader, final String name) {
        final g a = t.a;
        g g;
        if ((g = (g)a.get(loader)) == null) {
            g = new g();
            a.put(loader, g);
        }
        Class<?> forName;
        if ((forName = (Class)g.get(name)) == null) {
            forName = Class.forName(name, false, loader);
            g.put(name, forName);
        }
        return forName;
    }
    
    public abstract o a(final ClassLoader p0, final String p1);
}
