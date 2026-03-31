package r4;

import java.util.concurrent.CancellationException;

public abstract class f1
{
    public static final CancellationException a(final String s, final Throwable t) {
        final CancellationException ex = new CancellationException(s);
        ((Throwable)ex).initCause(t);
        return ex;
    }
}
