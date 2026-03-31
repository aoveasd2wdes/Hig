package u1;

public class d implements b
{
    private static final d a;
    
    static {
        a = new d();
    }
    
    private d() {
    }
    
    public static b a() {
        return (b)d.a;
    }
}
