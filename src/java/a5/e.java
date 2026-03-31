package a5;

import w4.i0;
import w4.h0;

public abstract class e
{
    private static final int a;
    private static final h0 b;
    private static final h0 c;
    private static final h0 d;
    private static final h0 e;
    private static final int f;
    
    static {
        a = i0.g("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object)null);
        b = new h0("PERMIT");
        c = new h0("TAKEN");
        d = new h0("BROKEN");
        e = new h0("CANCELLED");
        f = i0.g("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object)null);
    }
    
    private static final f h(final long n, final f f) {
        return new f(n, f, 0);
    }
}
