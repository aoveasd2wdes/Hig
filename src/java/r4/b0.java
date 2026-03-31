package r4;

import h4.l;

public final class b0
{
    public final Object a;
    public final l b;
    
    public b0(final Object a, final l b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b0)) {
            return false;
        }
        final b0 b0 = (b0)o;
        return i4.l.a(this.a, b0.a) && i4.l.a((Object)this.b, (Object)b0.b);
    }
    
    @Override
    public int hashCode() {
        final Object a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode * 31 + this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CompletedWithCancellation(result=");
        sb.append(this.a);
        sb.append(", onCancellation=");
        sb.append((Object)this.b);
        sb.append(')');
        return sb.toString();
    }
}
