package r4;

import u3.q;

final class y0 extends k
{
    private final x0 e;
    
    public y0(final x0 e) {
        this.e = e;
    }
    
    @Override
    public void a(final Throwable t) {
        this.e.a();
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DisposeOnCancel[");
        sb.append((Object)this.e);
        sb.append(']');
        return sb.toString();
    }
}
