package t4;

import h4.l;

public abstract class g
{
    public static final d a(int n, final a a, final l l) {
        Object o;
        if (n != -2) {
            final int n2 = 0;
            if (n != -1) {
                if (n != 0) {
                    if (n != Integer.MAX_VALUE) {
                        if (a == a.e) {
                            o = new b(n, l);
                        }
                        else {
                            o = new o(n, a, l);
                        }
                    }
                    else {
                        o = new b(Integer.MAX_VALUE, l);
                    }
                }
                else if (a == a.e) {
                    o = new b(0, l);
                }
                else {
                    o = new o(1, a, l);
                }
            }
            else {
                n = n2;
                if (a == a.e) {
                    n = 1;
                }
                if (n == 0) {
                    throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
                }
                o = new o(1, a.f, l);
            }
        }
        else if (a == a.e) {
            o = new b(d.c.a(), l);
        }
        else {
            o = new o(1, a, l);
        }
        return (d)o;
    }
}
