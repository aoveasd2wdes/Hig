package u4;

import t4.t;
import v4.e;
import u3.q;
import u3.l;
import y3.d;
import t4.r;
import y3.h;
import t4.a;
import y3.g;
import h4.p;

final class b extends c
{
    private final p i;
    
    public b(final p i, final g g, final int n, final a a) {
        super(i, g, n, a);
        this.i = i;
    }
    
    @Override
    protected Object h(final r h, final d d) {
        a4.d d3 = null;
        Label_0051: {
            if (d instanceof b$a) {
                final a4.d d2 = (b$a)d;
                final int k = d2.k;
                if ((k & Integer.MIN_VALUE) != 0x0) {
                    d2.k = k + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0051;
                }
            }
            d3 = new a4.d(this, d) {
                Object h;
                Object i;
                final b j;
                int k;
                
                public final Object s(final Object i) {
                    this.i = i;
                    this.k |= Integer.MIN_VALUE;
                    return this.j.h(null, (d)this);
                }
            };
        }
        final Object i = d3.i;
        final Object c = z3.b.c();
        final int j = d3.k;
        r r;
        if (j != 0) {
            if (j != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r = (r)d3.h;
            l.b(i);
        }
        else {
            l.b(i);
            d3.h = h;
            d3.k = 1;
            r = h;
            if (super.h(h, (d)d3) == c) {
                return c;
            }
        }
        if (((t)r).z()) {
            return q.a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }
    
    @Override
    protected e i(final g g, final int n, final a a) {
        return new b(this.i, g, n, a);
    }
}
