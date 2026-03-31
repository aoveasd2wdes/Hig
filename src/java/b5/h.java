package b5;

import c5.b;
import i4.l;
import i4.g;

public abstract class h
{
    public static final a a;
    public static final h b;
    public static final j0 c;
    public static final h d;
    
    static {
        a = new a(null);
        Object b2;
        try {
            Class.forName("java.nio.file.Files");
            b2 = new e0();
        }
        catch (final ClassNotFoundException ex) {
            b2 = new m();
        }
        b = (h)b2;
        final j0.a f = j0.f;
        final String property = System.getProperty("java.io.tmpdir");
        l.d(property, "getProperty(\"java.io.tmpdir\")");
        c = j0.a.e(f, property, false, 1, null);
        final ClassLoader classLoader = c5.g.class.getClassLoader();
        l.d(classLoader, "ResourceFileSystem::class.java.classLoader");
        d = (h)new c5.g(classLoader, false);
    }
    
    public abstract void a(final j0 p0, final j0 p1);
    
    public final void b(final j0 j0, final boolean b) {
        l.e(j0, "dir");
        b.a(this, j0, b);
    }
    
    public final void c(final j0 j0) {
        l.e(j0, "dir");
        this.d(j0, false);
    }
    
    public abstract void d(final j0 p0, final boolean p1);
    
    public final void e(final j0 j0) {
        l.e(j0, "path");
        this.f(j0, false);
    }
    
    public abstract void f(final j0 p0, final boolean p1);
    
    public final boolean g(final j0 j0) {
        l.e(j0, "path");
        return c5.b.b(this, j0);
    }
    
    public abstract b5.g h(final j0 p0);
    
    public abstract f i(final j0 p0);
    
    public final f j(final j0 j0) {
        l.e(j0, "file");
        return this.k(j0, false, false);
    }
    
    public abstract f k(final j0 p0, final boolean p1, final boolean p2);
    
    public abstract q0 l(final j0 p0);
    
    public static final class a
    {
        private a() {
        }
    }
}
