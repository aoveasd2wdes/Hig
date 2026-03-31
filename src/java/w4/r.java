package w4;

import i4.l;

public abstract class r
{
    private static final Object a;
    
    static {
        a = new h0("CONDITION_FALSE");
    }
    
    public static final Object a() {
        return r.a;
    }
    
    public static final s b(final Object o) {
        b0 b0;
        if (o instanceof b0) {
            b0 = (b0)o;
        }
        else {
            b0 = null;
        }
        s a;
        if (b0 == null || (a = b0.a) == null) {
            l.c(o, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            a = (s)o;
        }
        return a;
    }
}
