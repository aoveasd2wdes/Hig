package v4;

import java.util.concurrent.CancellationException;

public final class j extends CancellationException
{
    public j() {
        super("Child of the scoped flow was cancelled");
    }
    
    public Throwable fillInStackTrace() {
        ((Throwable)this).setStackTrace(new StackTraceElement[0]);
        return (Throwable)this;
    }
}
