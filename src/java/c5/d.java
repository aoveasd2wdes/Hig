package c5;

import b5.o0;
import i4.l;

public abstract class d
{
    public static final int a(final int[] array, final int n, int i, int n2) {
        l.e(array, "<this>");
        --n2;
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            final int n4 = array[n3];
            if (n4 < n) {
                i = n3 + 1;
            }
            else {
                if (n4 <= n) {
                    return n3;
                }
                n2 = n3 - 1;
            }
        }
        return -i - 1;
    }
    
    public static final int b(final o0 o0, int a) {
        l.e(o0, "<this>");
        a = a(o0.E(), a + 1, 0, o0.F().length);
        if (a < 0) {
            a ^= -1;
        }
        return a;
    }
}
