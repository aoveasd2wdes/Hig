package e2;

import q1.o;

public abstract class t
{
    public static int a(int n) {
        int n2 = n;
        boolean b = false;
        Label_0045: {
            if (n != 100 && (n2 = n) != 102 && (n2 = n) != 104) {
                if (n != 105) {
                    b = false;
                    break Label_0045;
                }
                n2 = 105;
            }
            b = true;
            n = n2;
        }
        o.c(b, "priority %d must be a Priority.PRIORITY_* constant", new Object[] { n });
        return n;
    }
    
    public static String b(final int n) {
        if (n == 100) {
            return "HIGH_ACCURACY";
        }
        if (n == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (n == 104) {
            return "LOW_POWER";
        }
        if (n == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
