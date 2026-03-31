package k3;

import java.nio.ByteBuffer;

public class k
{
    private final k3.c a;
    private final String b;
    private final l c;
    private final k3.c.c d;
    
    public k(final k3.c c, final String s) {
        this(c, s, (l)p.b);
    }
    
    public k(final k3.c c, final String s, final l l) {
        this(c, s, l, null);
    }
    
    public k(final k3.c a, final String b, final l c, final k3.c.c d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void c(final String s, final Object o) {
        this.d(s, o, null);
    }
    
    public void d(final String s, final Object o, final d d) {
        final k3.c a = this.a;
        final String b = this.b;
        final ByteBuffer e = this.c.e(new j(s, o));
        Object o2;
        if (d == null) {
            o2 = null;
        }
        else {
            o2 = new k.k$b(this, d);
        }
        a.h(b, e, (k3.c.b)o2);
    }
    
    public void e(final c c) {
        final k3.c.c d = this.d;
        final k3.c.a a = null;
        final k3.c.a a2 = null;
        if (d != null) {
            final k3.c a3 = this.a;
            final String b = this.b;
            Object o;
            if (c == null) {
                o = a2;
            }
            else {
                o = new k.k$a(this, c);
            }
            a3.e(b, (k3.c.a)o, this.d);
        }
        else {
            final k3.c a4 = this.a;
            final String b2 = this.b;
            Object o2;
            if (c == null) {
                o2 = a;
            }
            else {
                o2 = new k.k$a(this, c);
            }
            a4.c(b2, (k3.c.a)o2);
        }
    }
    
    public interface c
    {
        void a(final j p0, final d p1);
    }
    
    public interface d
    {
        void a(final Object p0);
        
        void b(final String p0, final String p1, final Object p2);
        
        void c();
    }
}
