package r4;

import w4.h0;

public abstract class z1
{
    private static final h0 a;
    public static final h0 b;
    private static final h0 c;
    private static final h0 d;
    private static final h0 e;
    private static final z0 f;
    private static final z0 g;
    
    static {
        a = new h0("COMPLETING_ALREADY");
        b = new h0("COMPLETING_WAITING_CHILDREN");
        c = new h0("COMPLETING_RETRY");
        d = new h0("TOO_LATE_TO_CANCEL");
        e = new h0("SEALED");
        f = new z0(false);
        g = new z0(true);
    }
    
    public static final Object g(final Object o) {
        Object o2 = o;
        if (o instanceof l1) {
            o2 = new m1((l1)o);
        }
        return o2;
    }
    
    public static final Object h(final Object o) {
        m1 m1;
        if (o instanceof m1) {
            m1 = (m1)o;
        }
        else {
            m1 = null;
        }
        Object a = o;
        if (m1 != null) {
            a = m1.a;
            if (a == null) {
                a = o;
            }
        }
        return a;
    }
}
