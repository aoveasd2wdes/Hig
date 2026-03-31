package d4;

import i4.l;

public abstract class a extends c4.a
{
    private final boolean c(final int n) {
        final Integer b = a.a$a.b;
        return b == null || b >= n;
    }
    
    public void a(final Throwable t, final Throwable t2) {
        l.e((Object)t, "cause");
        l.e((Object)t2, "exception");
        if (this.c(19)) {
            t.addSuppressed(t2);
        }
        else {
            super.a(t, t2);
        }
    }
}
