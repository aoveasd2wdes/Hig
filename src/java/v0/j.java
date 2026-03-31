package v0;

public enum j
{
    e("STRICT", 0), 
    f("LOG", 1), 
    g("QUIET", 2);
    
    private static final j[] h;
    
    static {
        h = a();
    }
    
    private j(final String s, final int n) {
    }
    
    private static final /* synthetic */ j[] a() {
        return new j[] { j.e, j.f, j.g };
    }
}
