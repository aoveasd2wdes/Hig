package e2;

import q1.o;

public abstract class w
{
    public static int a(int n) {
        int n2 = n;
        boolean b = false;
        Label_0032: {
            if (n != 0 && (n2 = n) != 1) {
                if (n != 2) {
                    b = false;
                    break Label_0032;
                }
                n2 = 2;
            }
            b = true;
            n = n2;
        }
        o.c(b, "granularity %d must be a Granularity.GRANULARITY_* constant", new Object[] { n });
        return n;
    }
    
    public static String b(final int n) {
        if (n == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (n == 1) {
            return "GRANULARITY_COARSE";
        }
        if (n == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}
