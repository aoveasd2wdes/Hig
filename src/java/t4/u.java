package t4;

import r4.r2;

final class u
{
    public final r2 a;
    
    public u(final r2 a) {
        this.a = a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("WaiterEB(");
        sb.append((Object)this.a);
        sb.append(')');
        return sb.toString();
    }
}
