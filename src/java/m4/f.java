package m4;

import i4.g;

public final class f extends d
{
    public static final f.f$a i;
    private static final f j;
    
    static {
        i = new f.f$a((g)null);
        j = new f(1L, 0L);
    }
    
    public f(final long n, final long n2) {
        super(n, n2, 1L);
    }
    
    public boolean equals(final Object o) {
        if (o instanceof f) {
            if (!this.isEmpty() || !((f)o).isEmpty()) {
                final long h = this.h();
                final f f = (f)o;
                if (h != f.h() || this.i() != f.i()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public int hashCode() {
        int n;
        if (this.isEmpty()) {
            n = -1;
        }
        else {
            n = (int)(31 * (this.h() ^ this.h() >>> 32) + (this.i() ^ this.i() >>> 32));
        }
        return n;
    }
    
    public boolean isEmpty() {
        return this.h() > this.i();
    }
    
    public boolean k(final long n) {
        return this.h() <= n && n <= this.i();
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.h());
        sb.append("..");
        sb.append(this.i());
        return sb.toString();
    }
}
