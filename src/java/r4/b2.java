package r4;

public abstract class b2 extends g0
{
    public abstract b2 K();
    
    protected final String M() {
        final b2 c = w0.c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        b2 k;
        try {
            k = c.K();
        }
        catch (final UnsupportedOperationException ex) {
            k = null;
        }
        if (this == k) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
