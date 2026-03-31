package k2;

public final class b extends IllegalStateException
{
    private b(final String s, final Throwable t) {
        super(s, t);
    }
    
    public static IllegalStateException a(final g g) {
        if (!g.k()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        final Exception h = g.h();
        String concat;
        if (h != null) {
            concat = "failure";
        }
        else if (g.l()) {
            concat = "result ".concat(String.valueOf(g.i()));
        }
        else if (g.j()) {
            concat = "cancellation";
        }
        else {
            concat = "unknown issue";
        }
        return new b("Complete with: ".concat(concat), (Throwable)h);
    }
}
