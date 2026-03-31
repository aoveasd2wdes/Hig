package d0;

import r4.q0;
import u3.l;
import u3.q;
import z3.b;
import y3.d;
import r4.q1;
import r4.x;
import a5.c;
import r4.v;
import a5.a;

public abstract class s
{
    private final a a;
    private final v b;
    
    public s() {
        this.a = c.b(false, 1, null);
        this.b = x.b((q1)null, 1, (Object)null);
    }
    
    public final Object a(final d d) {
        final Object h = ((q0)this.b).H(d);
        if (h == z3.b.c()) {
            return h;
        }
        return q.a;
    }
    
    protected abstract Object b(final d p0);
    
    public final Object c(d a) {
        Object o = null;
        Label_0049: {
            if (a instanceof s$a) {
                o = a;
                final int l = ((s$a)o).l;
                if ((l & Integer.MIN_VALUE) != 0x0) {
                    ((s$a)o).l = l + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new s$a(this, a);
        }
        final Object j = ((s$a)o).j;
        final Object c = z3.b.c();
        final int i = ((s$a)o).l;
        Object o3 = null;
        Label_0279: {
            s h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        final Object o2 = ((s$a)o).i;
                        final s s = (s)((s$a)o).h;
                        a = (d)o2;
                        try {
                            l.b(j);
                            break Label_0279;
                        }
                        finally {
                            break Label_0279;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a = (d)((s$a)o).i;
                h = (s)((s$a)o).h;
                l.b(j);
            }
            else {
                l.b(j);
                if (((q1)this.b).p()) {
                    return q.a;
                }
                a = (d)this.a;
                ((s$a)o).h = this;
                ((s$a)o).i = a;
                ((s$a)o).l = 1;
                if (((a)a).c(null, (d)o) == c) {
                    return c;
                }
                h = this;
            }
            try {
                if (((q1)h.b).p()) {
                    final q a2 = q.a;
                    ((a)a).a(null);
                    return a2;
                }
                ((s$a)o).h = h;
                ((s$a)o).i = a;
                ((s$a)o).l = 2;
                if (h.b((d)o) == c) {
                    return c;
                }
                final s s = h;
                o3 = a;
                a = (d)o3;
                final v b = s.b;
                a = (d)o3;
                final q a3 = q.a;
                a = (d)o3;
                b.G((Object)a3);
                ((a)o3).a(null);
                return a3;
            }
            finally {}
        }
        ((a)a).a(null);
        throw o3;
    }
}
