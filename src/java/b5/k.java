package b5;

import java.io.IOException;
import i4.l;
import java.io.InputStream;

class k implements q0
{
    private final InputStream e;
    private final r0 f;
    
    public k(final InputStream e, final r0 f) {
        l.e((Object)e, "input");
        l.e((Object)f, "timeout");
        this.e = e;
        this.f = f;
    }
    
    public void close() {
        this.e.close();
    }
    
    public long m(final b b, long e) {
        l.e((Object)b, "sink");
        final long n = lcmp(e, 0L);
        if (n == 0) {
            return 0L;
        }
        if (n >= 0) {
            try {
                this.f.a();
                final m0 h = b.H(1);
                final int read = this.e.read(h.a, h.c, (int)Math.min(e, (long)(8192 - h.c)));
                if (read == -1) {
                    if (h.b == h.c) {
                        b.e = h.b();
                        n0.b(h);
                    }
                    return -1L;
                }
                h.c += read;
                e = b.E();
                final long n2 = read;
                b.D(e + n2);
                return n2;
            }
            catch (final AssertionError assertionError) {
                if (f0.c(assertionError)) {
                    throw new IOException((Throwable)assertionError);
                }
                throw assertionError;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("byteCount < 0: ");
        sb.append(e);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("source(");
        sb.append((Object)this.e);
        sb.append(')');
        return sb.toString();
    }
}
