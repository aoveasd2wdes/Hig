package j1;

public enum a
{
    e("denied", 0), 
    f("deniedForever", 1), 
    g("whileInUse", 2), 
    h("always", 3);
    
    private static final a[] i;
    
    static {
        i = a();
    }
    
    private a(final String s, final int n) {
    }
    
    private static /* synthetic */ a[] a() {
        return new a[] { a.e, a.f, a.g, a.h };
    }
    
    public int b() {
        final int n = a$a.a[this.ordinal()];
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        if (n == 4) {
            return 3;
        }
        throw new IndexOutOfBoundsException();
    }
}
