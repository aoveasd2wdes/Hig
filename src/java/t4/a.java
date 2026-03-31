package t4;

public enum a
{
    e("SUSPEND", 0), 
    f("DROP_OLDEST", 1), 
    g("DROP_LATEST", 2);
    
    private static final a[] h;
    
    static {
        h = a();
    }
    
    private a(final String s, final int n) {
    }
    
    private static final /* synthetic */ a[] a() {
        return new a[] { a.e, a.f, a.g };
    }
}
