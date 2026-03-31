package r4;

import i4.g;
import h4.l;

final class z
{
    public final Object a;
    public final k b;
    public final l c;
    public final Object d;
    public final Throwable e;
    
    public z(final Object a, final k b, final l c, final Object d, final Throwable e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final z a(final Object o, final k k, final l l, final Object o2, final Throwable t) {
        return new z(o, k, l, o2, t);
    }
    
    public final boolean c() {
        return this.e != null;
    }
    
    public final void d(final n n, final Throwable t) {
        final k b = this.b;
        if (b != null) {
            n.j(b, t);
        }
        final l c = this.c;
        if (c != null) {
            n.l(c, t);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof z)) {
            return false;
        }
        final z z = (z)o;
        return i4.l.a(this.a, z.a) && i4.l.a((Object)this.b, (Object)z.b) && i4.l.a((Object)this.c, (Object)z.c) && i4.l.a(this.d, z.d) && i4.l.a((Object)this.e, (Object)z.e);
    }
    
    @Override
    public int hashCode() {
        final Object a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final k b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final l c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Object d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Throwable e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CompletedContinuation(result=");
        sb.append(this.a);
        sb.append(", cancelHandler=");
        sb.append((Object)this.b);
        sb.append(", onCancellation=");
        sb.append((Object)this.c);
        sb.append(", idempotentResume=");
        sb.append(this.d);
        sb.append(", cancelCause=");
        sb.append((Object)this.e);
        sb.append(')');
        return sb.toString();
    }
}
