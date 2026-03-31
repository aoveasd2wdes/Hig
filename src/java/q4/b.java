package q4;

public abstract class b
{
    private static final boolean a = false;
    private static final ThreadLocal[] b;
    
    static {
        final ThreadLocal[] b2 = new ThreadLocal[4];
        for (int i = 0; i < 4; ++i) {
            b2[i] = new ThreadLocal();
        }
        b = b2;
    }
    
    public static final boolean a() {
        return q4.b.a;
    }
}
