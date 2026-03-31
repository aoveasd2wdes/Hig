package d0;

import a4.b;
import h4.p;
import u4.g;
import y3.d;
import a5.c;
import i4.l;
import u4.e;
import a5.a;

public final class u implements n
{
    private final String a;
    private final a b;
    private final d0.a c;
    private final e d;
    
    public u(final String a) {
        l.e((Object)a, "filePath");
        this.a = a;
        this.b = a5.c.b(false, 1, (Object)null);
        this.c = new d0.a(0);
        this.d = g.o((p)new u$c((d)null));
    }
    
    public Object a(final d d) {
        return a4.b.c(this.c.d());
    }
    
    public e b() {
        return this.d;
    }
    
    public Object c(h4.l l, final d d) {
        u$a u$a2 = null;
        Label_0051: {
            if (d instanceof u$a) {
                final u$a u$a = (u$a)d;
                final int i = u$a.l;
                if ((i & Integer.MIN_VALUE) != 0x0) {
                    u$a.l = i + Integer.MIN_VALUE;
                    u$a2 = u$a;
                    break Label_0051;
                }
            }
            u$a2 = new u$a(this, d);
        }
        final Object j = u$a2.j;
        final Object c = z3.b.c();
        final int k = u$a2.l;
        h4.l m = null;
        Label_0231: {
            h4.l l3;
            if (k != 0) {
                if (k != 1) {
                    if (k == 2) {
                        l = (h4.l)u$a2.h;
                        try {
                            u3.l.b(j);
                            break Label_0231;
                        }
                        finally {
                            m = l;
                            final Object p2;
                            l = (h4.l)p2;
                            break Label_0231;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l = (h4.l)u$a2.i;
                final h4.l l2 = (h4.l)u$a2.h;
                u3.l.b(j);
                l3 = l2;
            }
            else {
                u3.l.b(j);
                final Object b = this.b;
                u$a2.h = l;
                u$a2.i = b;
                u$a2.l = 1;
                l3 = l;
                l = (h4.l)b;
                if (((a)b).c((Object)null, (d)u$a2) == c) {
                    return c;
                }
            }
            try {
                u$a2.h = l;
                u$a2.i = null;
                u$a2.l = 2;
                final Object p2 = l3.p(u$a2);
                if (p2 == c) {
                    return c;
                }
                ((a)l).a((Object)null);
                return p2;
            }
            finally {
                m = l;
                final h4.l l4;
                l = l4;
            }
        }
        ((a)m).a((Object)null);
        throw l;
    }
    
    public Object d(p j, d b) {
        Object o = null;
        Label_0049: {
            if (b instanceof u$b) {
                o = b;
                final int l = ((u$b)o).l;
                if ((l & Integer.MIN_VALUE) != 0x0) {
                    ((u$b)o).l = l + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new u$b(this, b);
        }
        final Object i = ((u$b)o).j;
        final Object c = z3.b.c();
        final int k = ((u$b)o).l;
        boolean m = false;
        Label_0199: {
            if (k != 0) {
                if (k == 1) {
                    m = ((u$b)o).i;
                    j = (p)((u$b)o).h;
                    try {
                        u3.l.b(i);
                        b = (d)j;
                        j = (p)i;
                        break Label_0199;
                    }
                    finally {
                        break Label_0199;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u3.l.b(i);
            b = (d)this.b;
            m = ((a)b).b((Object)null);
            boolean b2;
            if (m) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            try {
                final Boolean a = b.a(b2);
                ((u$b)o).h = b;
                ((u$b)o).i = m;
                ((u$b)o).l = 1;
                j = (p)j.j(a, o);
                if (j == c) {
                    return c;
                }
                if (m) {
                    ((a)b).a((Object)null);
                }
                return j;
            }
            finally {
                j = (p)b;
            }
        }
        if (m) {
            ((a)j).a((Object)null);
        }
        throw;
    }
    
    public Object e(final d d) {
        return a4.b.c(this.c.b());
    }
}
