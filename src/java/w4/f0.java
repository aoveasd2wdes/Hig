package w4;

import i4.l;

public abstract class f0
{
    public static Object a(final Object o) {
        return o;
    }
    
    public static final e0 b(final Object o) {
        if (o != d.a()) {
            l.c(o, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (e0)o;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }
    
    public static final boolean c(final Object o) {
        return o == d.a();
    }
}
