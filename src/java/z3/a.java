package z3;

import b4.b;

public enum a
{
    e("COROUTINE_SUSPENDED", 0), 
    f("UNDECIDED", 1), 
    g("RESUMED", 2);
    
    private static final a[] h;
    private static final b4.a i;
    
    static {
        i = b.a((Enum[])(h = a()));
    }
    
    private a(final String s, final int n) {
    }
    
    private static final /* synthetic */ a[] a() {
        return new a[] { a.e, a.f, a.g };
    }
}
