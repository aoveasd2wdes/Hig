package k3;

import java.nio.ByteBuffer;

public final class a
{
    private final c a;
    private final String b;
    private final i c;
    private final c.c d;
    
    public a(final c c, final String s, final i i) {
        this(c, s, i, null);
    }
    
    public a(final c a, final String b, final i c, final c.c d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void c(final Object o) {
        this.d(o, null);
    }
    
    public void d(final Object o, final e e) {
        final c a = this.a;
        final String b = this.b;
        final ByteBuffer b2 = this.c.b(o);
        Object o2 = null;
        if (e != null) {
            o2 = new a.a$c(this, e, (a$a)null);
        }
        a.h(b, b2, (c.b)o2);
    }
    
    public void e(final d d) {
        final c.c d2 = this.d;
        final c.a a = null;
        final c.a a2 = null;
        if (d2 != null) {
            final c a3 = this.a;
            final String b = this.b;
            Object o;
            if (d == null) {
                o = a2;
            }
            else {
                o = new a.a$b(this, d, (a$a)null);
            }
            a3.e(b, (c.a)o, this.d);
        }
        else {
            final c a4 = this.a;
            final String b2 = this.b;
            Object o2;
            if (d == null) {
                o2 = a;
            }
            else {
                o2 = new a.a$b(this, d, (a$a)null);
            }
            a4.c(b2, (c.a)o2);
        }
    }
    
    public interface d
    {
        void a(final Object p0, final e p1);
    }
    
    public interface e
    {
        void a(final Object p0);
    }
}
