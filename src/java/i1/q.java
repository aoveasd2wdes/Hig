package i1;

public enum q
{
    e("reduced", 0), 
    f("precise", 1);
    
    private static final q[] g;
    
    static {
        g = a();
    }
    
    private q(final String s, final int n) {
    }
    
    private static /* synthetic */ q[] a() {
        return new q[] { q.e, q.f };
    }
}
