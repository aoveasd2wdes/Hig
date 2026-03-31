package u4;

import u3.q;
import z3.b;
import i4.w;
import h4.p;
import h4.l;

final class d implements e
{
    private final e e;
    public final l f;
    public final p g;
    
    public d(final e e, final l f, final p g) {
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public Object a(final f f, final y3.d d) {
        final w w = new w();
        w.e = v4.p.a;
        final Object a = this.e.a((f)new f(this, w, f) {
            final d e;
            final w f;
            final f g;
            
            public final Object h(final Object o, final y3.d d) {
                d$a$a d$a$a2 = null;
                Label_0051: {
                    if (d instanceof d$a$a) {
                        final d$a$a d$a$a = (d$a$a)d;
                        final int j = d$a$a.j;
                        if ((j & Integer.MIN_VALUE) != 0x0) {
                            d$a$a.j = j + Integer.MIN_VALUE;
                            d$a$a2 = d$a$a;
                            break Label_0051;
                        }
                    }
                    d$a$a2 = new d$a$a(this, d);
                }
                final Object h = d$a$a2.h;
                final Object c = b.c();
                final int i = d$a$a2.j;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u3.l.b(h);
                }
                else {
                    u3.l.b(h);
                    final Object p2 = this.e.f.p(o);
                    final Object e = this.f.e;
                    if (e != v4.p.a && (boolean)this.e.g.j(e, p2)) {
                        return q.a;
                    }
                    this.f.e = p2;
                    final f g = this.g;
                    d$a$a2.j = 1;
                    if (g.h(o, (y3.d)d$a$a2) == c) {
                        return c;
                    }
                }
                return q.a;
            }
        }, d);
        if (a == b.c()) {
            return a;
        }
        return q.a;
    }
}
