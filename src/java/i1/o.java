package i1;

public enum o
{
    e("lowest", 0), 
    f("low", 1), 
    g("medium", 2), 
    h("high", 3), 
    i("best", 4), 
    j("bestForNavigation", 5);
    
    private static final o[] k;
    
    static {
        k = a();
    }
    
    private o(final String s, final int n) {
    }
    
    private static /* synthetic */ o[] a() {
        return new o[] { o.e, o.f, o.g, o.h, o.i, o.j };
    }
}
