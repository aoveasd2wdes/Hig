package u4;

import java.util.List;
import v3.l;
import h4.p;
import h4.q;
import y3.d;

final class g0 implements b0
{
    private final long b;
    private final long c;
    
    public g0(final long b, final long c) {
        this.b = b;
        this.c = c;
        final int n = 1;
        if (b < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("stopTimeout(");
            sb.append(b);
            sb.append(" ms) cannot be negative");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int n2;
        if (c >= 0L) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("replayExpiration(");
        sb2.append(c);
        sb2.append(" ms) cannot be negative");
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    public e a(final h0 h0) {
        return g.h(g.i(g.w((e)h0, (q)new g0$a(this, (d)null)), (p)new g0$b((d)null)));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof g0) {
            final long b = this.b;
            final g0 g0 = (g0)o;
            if (b == g0.b && this.c == g0.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return f0.a(this.b) * 31 + f0.a(this.c);
    }
    
    @Override
    public String toString() {
        final List c = l.c(2);
        if (this.b > 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("stopTimeout=");
            sb.append(this.b);
            sb.append("ms");
            c.add((Object)sb.toString());
        }
        if (this.c < Long.MAX_VALUE) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("replayExpiration=");
            sb2.append(this.c);
            sb2.append("ms");
            c.add((Object)sb2.toString());
        }
        final List a = l.a(c);
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("SharingStarted.WhileSubscribed(");
        sb3.append(l.x((Iterable)a, (CharSequence)null, (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (h4.l)null, 63, (Object)null));
        sb3.append(')');
        return sb3.toString();
    }
}
