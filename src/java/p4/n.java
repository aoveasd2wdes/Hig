package p4;

import i4.l;

abstract class n extends m
{
    public static Long f(final String s) {
        i4.l.e((Object)s, "<this>");
        return g(s, 10);
    }
    
    public static final Long g(final String s, final int n) {
        i4.l.e((Object)s, "<this>");
        a.a(n);
        final int length = s.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        final char char1 = s.charAt(0);
        final int f = i4.l.f((int)char1, 48);
        long n2 = -9223372036854775807L;
        boolean b = false;
        Label_0093: {
            if (f < 0) {
                b = true;
                if (length == 1) {
                    return null;
                }
                if (char1 == '-') {
                    n2 = Long.MIN_VALUE;
                    i = 1;
                    break Label_0093;
                }
                if (char1 != '+') {
                    return null;
                }
                i = 1;
            }
            b = false;
        }
        long n3 = 0L;
        long n4 = -256204778801521550L;
        while (i < length) {
            final int b2 = p4.b.b(s.charAt(i), n);
            if (b2 < 0) {
                return null;
            }
            long n5 = n4;
            if (n3 < n4 && (n4 != -256204778801521550L || n3 < (n5 = n2 / n))) {
                return null;
            }
            final long n6 = n3 * n;
            final long n7 = b2;
            if (n6 < n2 + n7) {
                return null;
            }
            n3 = n6 - n7;
            ++i;
            n4 = n5;
        }
        Long n8;
        if (b) {
            n8 = n3;
        }
        else {
            n8 = -n3;
        }
        return n8;
    }
}
