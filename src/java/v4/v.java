package v4;

import t4.a;
import u4.h0;
import u4.w;

final class v extends w implements h0
{
    public v(final int n) {
        super(1, Integer.MAX_VALUE, a.f);
        this.c(n);
    }
    
    public final boolean a0(final int n) {
        synchronized (this) {
            return this.c(((Number)this.N()).intValue() + n);
        }
    }
}
