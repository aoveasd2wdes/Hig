package c5;

import java.io.IOException;
import b5.b;
import i4.l;
import b5.q0;
import b5.i;

public final class f extends i
{
    private final long f;
    private final boolean g;
    private long h;
    
    public f(final q0 q0, final long f, final boolean g) {
        l.e((Object)q0, "delegate");
        super(q0);
        this.f = f;
        this.g = g;
    }
    
    private final void a(final b b, final long n) {
        final b b2 = new b();
        b2.K((q0)b);
        b.x(b2, n);
        b2.a();
    }
    
    public long m(final b b, long f) {
        l.e((Object)b, "sink");
        final long h = this.h;
        final long f2 = this.f;
        long min;
        if (h > f2) {
            min = 0L;
        }
        else {
            min = f;
            if (this.g) {
                final long n = f2 - h;
                if (n == 0L) {
                    return -1L;
                }
                min = Math.min(f, n);
            }
        }
        final long m = super.m(b, min);
        final long n2 = lcmp(m, -1L);
        if (n2 != 0) {
            this.h += m;
        }
        final long h2 = this.h;
        f = this.f;
        if ((h2 < f && n2 == 0) || h2 > f) {
            if (m > 0L && h2 > f) {
                this.a(b, b.E() - (this.h - this.f));
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("expected ");
            sb.append(this.f);
            sb.append(" bytes but got ");
            sb.append(this.h);
            throw new IOException(sb.toString());
        }
        return m;
    }
}
