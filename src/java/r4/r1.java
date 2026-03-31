package r4;

import i4.l;
import java.util.concurrent.CancellationException;

public final class r1 extends CancellationException
{
    public final transient q1 e;
    
    public r1(final String s, final Throwable t, final q1 e) {
        super(s);
        this.e = e;
        if (t != null) {
            ((Throwable)this).initCause(t);
        }
    }
    
    public boolean equals(final Object o) {
        if (o != this) {
            if (o instanceof r1) {
                final r1 r1 = (r1)o;
                if (l.a((Object)((Throwable)r1).getMessage(), (Object)((Throwable)this).getMessage()) && l.a((Object)r1.e, (Object)this.e) && l.a((Object)((Throwable)r1).getCause(), (Object)((Throwable)this).getCause())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public Throwable fillInStackTrace() {
        ((Throwable)this).setStackTrace(new StackTraceElement[0]);
        return (Throwable)this;
    }
    
    public int hashCode() {
        final String message = ((Throwable)this).getMessage();
        l.b((Object)message);
        final int hashCode = message.hashCode();
        final int hashCode2 = this.e.hashCode();
        final Throwable cause = ((Throwable)this).getCause();
        int hashCode3;
        if (cause != null) {
            hashCode3 = cause.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (hashCode * 31 + hashCode2) * 31 + hashCode3;
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append((Object)this.e);
        return sb.toString();
    }
}
