package r4;

import u3.q;
import java.util.concurrent.Future;

final class j extends k
{
    private final Future e;
    
    public j(final Future e) {
        this.e = e;
    }
    
    @Override
    public void a(final Throwable t) {
        if (t != null) {
            this.e.cancel(false);
        }
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CancelFutureOnCancel[");
        sb.append((Object)this.e);
        sb.append(']');
        return sb.toString();
    }
}
