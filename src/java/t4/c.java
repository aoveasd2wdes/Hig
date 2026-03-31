package t4;

import n4.e;
import h4.l;
import r4.m;
import w4.i0;
import w4.h0;

public abstract class c
{
    private static final j a;
    public static final int b;
    private static final int c;
    public static final h0 d;
    private static final h0 e;
    private static final h0 f;
    private static final h0 g;
    private static final h0 h;
    private static final h0 i;
    private static final h0 j;
    private static final h0 k;
    private static final h0 l;
    private static final h0 m;
    private static final h0 n;
    private static final h0 o;
    private static final h0 p;
    private static final h0 q;
    private static final h0 r;
    private static final h0 s;
    
    static {
        a = new j(-1L, (j)null, (b)null, 0);
        b = i0.g("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object)null);
        c = i0.g("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object)null);
        d = new h0("BUFFERED");
        e = new h0("SHOULD_BUFFER");
        f = new h0("S_RESUMING_BY_RCV");
        g = new h0("RESUMING_BY_EB");
        h = new h0("POISONED");
        i = new h0("DONE_RCV");
        j = new h0("INTERRUPTED_SEND");
        k = new h0("INTERRUPTED_RCV");
        l = new h0("CHANNEL_CLOSED");
        m = new h0("SUSPEND");
        n = new h0("SUSPEND_NO_WAITER");
        o = new h0("FAILED");
        p = new h0("NO_RECEIVE_RESULT");
        q = new h0("CLOSE_HANDLER_CLOSED");
        r = new h0("CLOSE_HANDLER_INVOKED");
        s = new h0("NO_CLOSE_CAUSE");
    }
    
    private static final long A(final int n) {
        long n2;
        if (n != 0) {
            if (n != Integer.MAX_VALUE) {
                n2 = n;
            }
            else {
                n2 = Long.MAX_VALUE;
            }
        }
        else {
            n2 = 0L;
        }
        return n2;
    }
    
    private static final boolean B(final m m, Object x, final l l) {
        x = m.x(x, (Object)null, l);
        boolean b;
        if (x != null) {
            m.J(x);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    private static final long v(final long n, final boolean b) {
        long n2;
        if (b) {
            n2 = 4611686018427387904L;
        }
        else {
            n2 = 0L;
        }
        return n2 + n;
    }
    
    private static final long w(final long n, final int n2) {
        return ((long)n2 << 60) + n;
    }
    
    private static final j x(final long n, final j j) {
        return new j(n, j, j.u(), 0);
    }
    
    public static final e y() {
        return (e)c$a.n;
    }
    
    public static final h0 z() {
        return t4.c.l;
    }
}
