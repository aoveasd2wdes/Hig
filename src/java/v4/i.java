package v4;

import r4.k0;
import i4.w;
import u3.l;
import z3.b;
import r4.j0;
import a4.k;
import h4.p;
import y3.d;
import u4.f;
import y3.h;
import t4.a;
import u4.e;
import h4.q;

public final class i extends g
{
    private final q i;
    
    public i(final q i, final u4.e e, final y3.g g, final int n, final a a) {
        super(e, g, n, a);
        this.i = i;
    }
    
    @Override
    protected e i(final y3.g g, final int n, final a a) {
        return new i(this.i, super.h, g, n, a);
    }
    
    @Override
    protected Object r(final f f, final d d) {
        final Object b = k0.b((p)new p(this, f, null) {
            int i;
            private Object j;
            final i k;
            final f l;
            
            public final d a(final Object j, final d d) {
                final p p2 = (p)new p(this.k, this.l, d) {
                    int i;
                    private Object j;
                    final i k;
                    final f l;
                };
                p2.j = j;
                return (d)p2;
            }
            
            public final Object s(final Object o) {
                final Object c = z3.b.c();
                final int i = this.i;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u3.l.b(o);
                }
                else {
                    u3.l.b(o);
                    final j0 j0 = (j0)this.j;
                    final w w = new w();
                    final i k = this.k;
                    final u4.e h = k.h;
                    final i$a$a i$a$a = new i$a$a(w, j0, k, this.l);
                    this.i = 1;
                    if (h.a((f)i$a$a, (d)this) == c) {
                        return c;
                    }
                }
                return u3.q.a;
            }
            
            public final Object w(final j0 j0, final d d) {
                return ((i$a)this.a(j0, d)).s(u3.q.a);
            }
        }, d);
        if (b == z3.b.c()) {
            return b;
        }
        return u3.q.a;
    }
}
