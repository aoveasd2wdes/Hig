package r4;

import java.util.concurrent.locks.LockSupport;
import i4.l;
import y3.g;

final class e extends a
{
    private final Thread h;
    private final a1 i;
    
    public e(final g g, final Thread h, final a1 i) {
        super(g, true, true);
        this.h = h;
        this.i = i;
    }
    
    @Override
    protected void Q(final Object o) {
        if (!l.a((Object)Thread.currentThread(), (Object)this.h)) {
            final Thread h = this.h;
            c.a();
            LockSupport.unpark(h);
        }
    }
    
    public final Object W0() {
        c.a();
        try {
            final a1 i = this.i;
            a0 a0 = null;
            if (i != null) {
                a1.R(i, false, 1, null);
            }
            Label_0079: {
                try {
                    while (!Thread.interrupted()) {
                        final a1 j = this.i;
                        long u;
                        if (j != null) {
                            u = j.U();
                        }
                        else {
                            u = Long.MAX_VALUE;
                        }
                        if (this.p()) {
                            break Label_0079;
                        }
                        c.a();
                        LockSupport.parkNanos((Object)this, u);
                    }
                }
                finally {
                    final a1 k = this.i;
                    if (k != null) {
                        a1.M(k, false, 1, null);
                    }
                    final a1 l = this.i;
                    iftrue(Label_0098:)(l == null);
                    while (true) {
                        Block_9: {
                            break Block_9;
                            final InterruptedException ex = new InterruptedException();
                            this.T((Throwable)ex);
                            throw ex;
                            iftrue(Label_0132:)(a0 != null);
                            return;
                        }
                        a1.M(l, false, 1, null);
                        Label_0098: {
                            c.a();
                        }
                        final Object h = z1.h(this.l0());
                        iftrue(Label_0125:)(!(h instanceof a0));
                        a0 = (a0)h;
                        continue;
                    }
                    Label_0132: {
                        throw a0.a;
                    }
                }
            }
        }
        finally {
            c.a();
        }
    }
    
    @Override
    protected boolean q0() {
        return true;
    }
}
