package b5;

import i4.l;

public abstract class i implements q0
{
    private final q0 e;
    
    public i(final q0 e) {
        l.e((Object)e, "delegate");
        this.e = e;
    }
    
    public void close() {
        this.e.close();
    }
    
    public long m(final b b, final long n) {
        l.e((Object)b, "sink");
        return this.e.m(b, n);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append('(');
        sb.append((Object)this.e);
        sb.append(')');
        return sb.toString();
    }
}
