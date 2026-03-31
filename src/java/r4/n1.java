package r4;

import u3.q;
import h4.l;

final class n1 extends k
{
    private final h4.l e;
    
    public n1(final h4.l e) {
        this.e = e;
    }
    
    @Override
    public void a(final Throwable t) {
        this.e.p((Object)t);
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("InvokeOnCancel[");
        sb.append(n0.a((Object)this.e));
        sb.append('@');
        sb.append(n0.b((Object)this));
        sb.append(']');
        return sb.toString();
    }
}
