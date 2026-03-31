package y4;

public final class c extends f
{
    public static final c m;
    
    static {
        m = new c();
    }
    
    private c() {
        super(y4.l.c, y4.l.d, y4.l.e, y4.l.a);
    }
    
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }
    
    @Override
    public String toString() {
        return "Dispatchers.Default";
    }
}
