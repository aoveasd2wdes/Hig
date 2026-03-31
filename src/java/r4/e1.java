package r4;

import w4.h0;

public abstract class e1
{
    private static final h0 a;
    private static final h0 b;
    
    static {
        a = new h0("REMOVED_TASK");
        b = new h0("CLOSED_EMPTY");
    }
    
    public static final long c(long n) {
        final long n2 = 0L;
        if (n <= 0L) {
            n = n2;
        }
        else if (n >= 9223372036854L) {
            n = Long.MAX_VALUE;
        }
        else {
            n *= 1000000L;
        }
        return n;
    }
}
