package u3;

public abstract class l
{
    public static final Object a(final Throwable t) {
        i4.l.e((Object)t, "exception");
        return new k.b(t);
    }
    
    public static final void b(final Object o) {
        if (!(o instanceof k.b)) {
            return;
        }
        throw ((k.b)o).e;
    }
}
