package b5;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.io.EOFException;
import i4.l;

public final class l0 implements d
{
    public final q0 e;
    public final b f;
    public boolean g;
    
    public l0(final q0 e) {
        l.e((Object)e, "source");
        this.e = e;
        this.f = new b();
    }
    
    public boolean a(final long n) {
        boolean b = false;
        if (n < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (this.g ^ true) {
            while (this.f.E() < n) {
                if (this.e.m(this.f, 8192L) == -1L) {
                    return b;
                }
            }
            b = true;
            return b;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    public void close() {
        if (!this.g) {
            this.g = true;
            this.e.close();
            this.f.a();
        }
    }
    
    public String d(final long n) {
        this.n(n);
        return this.f.d(n);
    }
    
    public short g() {
        this.n(2L);
        return this.f.g();
    }
    
    public boolean isOpen() {
        return this.g ^ true;
    }
    
    public long k() {
        this.n(8L);
        return this.f.k();
    }
    
    public long m(final b b, long n) {
        l.e((Object)b, "sink");
        if (n < 0L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (true ^ this.g) {
            if (this.f.E() == 0L) {
                final long m = this.e.m(this.f, 8192L);
                final long n2 = -1L;
                if (m == -1L) {
                    n = n2;
                    return n;
                }
            }
            n = Math.min(n, this.f.E());
            n = this.f.m(b, n);
            return n;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    public void n(final long n) {
        if (this.a(n)) {
            return;
        }
        throw new EOFException();
    }
    
    public int o() {
        this.n(4L);
        return this.f.o();
    }
    
    public b q() {
        return this.f;
    }
    
    public boolean r() {
        final boolean g = this.g;
        boolean b = true;
        if (g ^ true) {
            if (!this.f.r() || this.e.m(this.f, 8192L) != -1L) {
                b = false;
            }
            return b;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    public int read(final ByteBuffer byteBuffer) {
        l.e((Object)byteBuffer, "sink");
        if (this.f.E() == 0L && this.e.m(this.f, 8192L) == -1L) {
            return -1;
        }
        return this.f.read(byteBuffer);
    }
    
    public byte readByte() {
        this.n(1L);
        return this.f.readByte();
    }
    
    public void skip(long n) {
        if (this.g ^ true) {
            while (n > 0L) {
                if (this.f.E() == 0L && this.e.m(this.f, 8192L) == -1L) {
                    throw new EOFException();
                }
                final long min = Math.min(n, this.f.E());
                this.f.skip(min);
                n -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append((Object)this.e);
        sb.append(')');
        return sb.toString();
    }
    
    public InputStream y() {
        return (InputStream)new l0$a(this);
    }
}
