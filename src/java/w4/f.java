package w4;

import y3.g;
import r4.j0;

public final class f implements j0
{
    private final g e;
    
    public f(final g e) {
        this.e = e;
    }
    
    public g s() {
        return this.e;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CoroutineScope(coroutineContext=");
        sb.append((Object)this.s());
        sb.append(')');
        return sb.toString();
    }
}
