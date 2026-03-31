package d0;

import r4.l0;
import t4.n;
import t4.h;
import t4.h$a;
import y3.g$c;
import r4.q1;
import t4.g;
import h4.l;
import t4.d;
import h4.p;
import r4.j0;

public final class t
{
    private final j0 a;
    private final p b;
    private final d c;
    private final a d;
    
    public t(final j0 a, final l l, final p p4, final p b) {
        i4.l.e(a, "scope");
        i4.l.e(l, "onComplete");
        i4.l.e(p4, "onUndeliveredElement");
        i4.l.e(b, "consumeMessage");
        this.a = a;
        this.b = b;
        this.c = g.b(Integer.MAX_VALUE, (t4.a)null, (l)null, 6, (Object)null);
        this.d = new a(0);
        final q1 q1 = (q1)a.s().a((g$c)r4.q1.b);
        if (q1 != null) {
            q1.t((l)new t$a(l, this, p4));
        }
    }
    
    public final void e(Object r) {
        r = ((t4.t)this.c).r(r);
        if (r instanceof h$a) {
            Object c;
            if ((c = h.c(r)) == null) {
                c = new n("Channel was closed normally");
            }
            throw c;
        }
        if (h.f(r)) {
            if (this.d.c() == 0) {
                r4.g.b(this.a, (y3.g)null, (l0)null, (p)new t$b(this, (y3.d)null), 3, (Object)null);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
