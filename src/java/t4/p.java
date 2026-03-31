package t4;

import r4.y1;
import r4.f0;
import r4.l0;
import y3.g;
import r4.j0;
import u3.q;
import a4.h;
import r4.m;
import r4.n;
import y3.g$c;
import r4.q1;
import u3.l;
import z3.b;
import y3.d;
import h4.a;

public abstract class p
{
    public static final Object a(final r h, final a i, d d) {
        Object o = null;
        Label_0048: {
            if (d instanceof p$a) {
                o = d;
                final int k = ((p$a)o).k;
                if ((k & Integer.MIN_VALUE) != 0x0) {
                    ((p$a)o).k = k + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            o = new p$a(d);
        }
        final Object j = ((p$a)o).j;
        final Object c = b.c();
        final int l = ((p$a)o).k;
        final a a;
        Label_0267: {
            if (l != 0) {
                if (l == 1) {
                    final Object o2 = ((p$a)o).i;
                    final r r = (r)((p$a)o).h;
                    d = (d)o2;
                    Label_0278: {
                        try {
                            u3.l.b(j);
                            break Label_0267;
                        }
                        finally {
                            break Label_0278;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ((a)d).e();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u3.l.b(j);
            if (((d)o).d().a((g$c)q1.b) != h) {
                throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
            }
            ((p$a)o).h = h;
            ((p$a)o).i = i;
            ((p$a)o).k = 1;
            final n n = new n(b.b((d)o), 1);
            n.B();
            ((t)h).y((h4.l)new p$b((m)n));
            final Object y = n.y();
            if (y == b.c()) {
                h.c((d)o);
            }
            a = i;
            if (y == c) {
                return c;
            }
        }
        a.e();
        return q.a;
    }
    
    public static final s b(final j0 j0, final g g, final int n, final t4.a a, final l0 l0, final h4.l i, final h4.p p7) {
        final t4.q q = new t4.q(f0.d(j0, g), g.b(n, a, null, 4, null));
        if (i != null) {
            ((y1)q).t(i);
        }
        ((r4.a)q).V0(l0, (Object)q, p7);
        return (s)q;
    }
}
