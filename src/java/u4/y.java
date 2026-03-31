package u4;

import v4.d;

public final class y extends d
{
    public long a;
    public y3.d b;
    
    public y() {
        this.a = -1L;
    }
    
    public boolean c(final w w) {
        if (this.a >= 0L) {
            return false;
        }
        this.a = w.Z();
        return true;
    }
    
    public y3.d[] d(final w w) {
        final long a = this.a;
        this.a = -1L;
        this.b = null;
        return w.Y(a);
    }
}
