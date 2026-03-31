package c4;

public abstract class c
{
    private static final int a(final int n, final int n2, final int n3) {
        return e(e(n, n3) - e(n2, n3), n3);
    }
    
    private static final long b(final long n, final long n2, final long n3) {
        return f(f(n, n3) - f(n2, n3), n3);
    }
    
    public static final int c(final int n, int n2, final int n3) {
        if (n3 > 0) {
            if (n < n2) {
                n2 -= a(n2, n, n3);
            }
        }
        else {
            if (n3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (n > n2) {
                n2 += a(n, n2, -n3);
            }
        }
        return n2;
    }
    
    public static final long d(final long n, long n2, final long n3) {
        final long n4 = lcmp(n3, 0L);
        if (n4 > 0) {
            if (n < n2) {
                n2 -= b(n2, n, n3);
            }
        }
        else {
            if (n4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (n > n2) {
                n2 += b(n, n2, -n3);
            }
        }
        return n2;
    }
    
    private static final int e(int n, final int n2) {
        n %= n2;
        if (n < 0) {
            n += n2;
        }
        return n;
    }
    
    private static final long f(long n, final long n2) {
        n %= n2;
        if (n < 0L) {
            n += n2;
        }
        return n;
    }
}
