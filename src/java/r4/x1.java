package r4;

import i4.l;

public abstract class x1 extends c0 implements x0, l1
{
    public y1 h;
    
    public final void A(final y1 h) {
        this.h = h;
    }
    
    public void a() {
        this.z().G0(this);
    }
    
    public boolean c() {
        return true;
    }
    
    public c2 d() {
        return null;
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(n0.a((Object)this));
        sb.append('@');
        sb.append(n0.b((Object)this));
        sb.append("[job@");
        sb.append(n0.b((Object)this.z()));
        sb.append(']');
        return sb.toString();
    }
    
    public final y1 z() {
        final y1 h = this.h;
        if (h != null) {
            return h;
        }
        l.n("job");
        return null;
    }
}
