package v4;

import u4.f;
import java.util.concurrent.CancellationException;

public final class a extends CancellationException
{
    public final transient f e;
    
    public a(final f e) {
        super("Flow was aborted, no more elements needed");
        this.e = e;
    }
    
    public Throwable fillInStackTrace() {
        ((Throwable)this).setStackTrace(new StackTraceElement[0]);
        return (Throwable)this;
    }
}
