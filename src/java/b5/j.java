package b5;

import java.io.EOFException;
import java.util.zip.DataFormatException;
import java.io.IOException;
import i4.l;
import java.util.zip.Inflater;

public final class j implements q0
{
    private final d e;
    private final Inflater f;
    private int g;
    private boolean h;
    
    public j(final d e, final Inflater f) {
        l.e((Object)e, "source");
        l.e((Object)f, "inflater");
        this.e = e;
        this.f = f;
    }
    
    public j(final q0 q0, final Inflater inflater) {
        l.e((Object)q0, "source");
        l.e((Object)inflater, "inflater");
        this(f0.b(q0), inflater);
    }
    
    private final void c() {
        final int g = this.g;
        if (g == 0) {
            return;
        }
        final int n = g - this.f.getRemaining();
        this.g -= n;
        this.e.skip(n);
    }
    
    public final long a(final b b, long n) {
        l.e((Object)b, "sink");
        final long n2 = lcmp(n, 0L);
        if (n2 >= 0) {
            if (this.h ^ true) {
                if (n2 == 0) {
                    return 0L;
                }
                try {
                    final m0 h = b.H(1);
                    final int n3 = (int)Math.min(n, (long)(8192 - h.c));
                    this.b();
                    final int inflate = this.f.inflate(h.a, h.c, n3);
                    this.c();
                    if (inflate > 0) {
                        h.c += inflate;
                        final long e = b.E();
                        n = inflate;
                        b.D(e + n);
                        return n;
                    }
                    if (h.b == h.c) {
                        b.e = h.b();
                        n0.b(h);
                    }
                    return 0L;
                }
                catch (final DataFormatException ex) {
                    throw new IOException((Throwable)ex);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("byteCount < 0: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final boolean b() {
        if (!this.f.needsInput()) {
            return false;
        }
        if (this.e.r()) {
            return true;
        }
        final m0 e = this.e.q().e;
        l.b((Object)e);
        final int c = e.c;
        final int b = e.b;
        final int g = c - b;
        this.g = g;
        this.f.setInput(e.a, b, g);
        return false;
    }
    
    public void close() {
        if (this.h) {
            return;
        }
        this.f.end();
        this.h = true;
        ((q0)this.e).close();
    }
    
    public long m(final b b, final long n) {
        l.e((Object)b, "sink");
        while (true) {
            final long a = this.a(b, n);
            if (a > 0L) {
                return a;
            }
            if (this.f.finished() || this.f.needsDictionary()) {
                return -1L;
            }
            if (!this.e.r()) {
                continue;
            }
            throw new EOFException("source exhausted prematurely");
        }
    }
}
