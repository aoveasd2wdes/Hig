package w4;

import y3.g;

public final class i extends RuntimeException
{
    private final transient g e;
    
    public i(final g e) {
        this.e = e;
    }
    
    public Throwable fillInStackTrace() {
        ((Throwable)this).setStackTrace(new StackTraceElement[0]);
        return (Throwable)this;
    }
    
    public String getLocalizedMessage() {
        return this.e.toString();
    }
}
