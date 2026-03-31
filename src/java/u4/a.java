package u4;

import v4.q;
import u3.l;
import z3.b;
import y3.d;

public abstract class a implements e
{
    public final Object a(f h, final d d) {
        Object o = null;
        Label_0051: {
            if (d instanceof a$a) {
                final a$a a$a = (a$a)d;
                final int k = a$a.k;
                if ((k & Integer.MIN_VALUE) != 0x0) {
                    a$a.k = k + Integer.MIN_VALUE;
                    o = a$a;
                    break Label_0051;
                }
            }
            o = new a$a(this, d);
        }
        final Object i = ((a$a)o).i;
        final Object c = b.c();
        final int j = ((a$a)o).k;
        Label_0152: {
            if (j != 0) {
                if (j == 1) {
                    h = (f)((a$a)o).h;
                    try {
                        l.b(i);
                        break Label_0152;
                    }
                    finally {
                        break Label_0152;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.b(i);
            h = (f)new q(h, ((d)o).d());
            try {
                ((a$a)o).h = h;
                ((a$a)o).k = 1;
                if (this.e(h, (d)o) == c) {
                    return c;
                }
                ((q)h).t();
                return u3.q.a;
            }
            finally {}
        }
        ((q)h).t();
        throw;
    }
    
    public abstract Object e(final f p0, final d p1);
}
