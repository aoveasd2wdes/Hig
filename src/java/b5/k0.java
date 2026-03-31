package b5;

import java.nio.ByteBuffer;
import java.io.OutputStream;
import i4.l;

public final class k0 implements c
{
    public final p0 e;
    public final b f;
    public boolean g;
    
    public k0(final p0 e) {
        l.e((Object)e, "sink");
        this.e = e;
        this.f = new b();
    }
    
    public c a() {
        if (this.g ^ true) {
            final long c = this.f.c();
            if (c > 0L) {
                this.e.x(this.f, c);
            }
            return (c)this;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    public void close() {
        if (!this.g) {
            try {
                if (this.f.E() > 0L) {
                    final p0 e = this.e;
                    final b f = this.f;
                    e.x(f, f.E());
                }
            }
            finally {}
            Throwable t = null;
            try {
                this.e.close();
            }
            finally {
                final Throwable t2;
                t = t2;
                if (t2 == null) {
                    final Throwable t3;
                    t = t3;
                }
            }
            this.g = true;
            if (t != null) {
                throw t;
            }
        }
    }
    
    public void flush() {
        if (this.g ^ true) {
            if (this.f.E() > 0L) {
                final p0 e = this.e;
                final b f = this.f;
                e.x(f, f.E());
            }
            this.e.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    public boolean isOpen() {
        return this.g ^ true;
    }
    
    public OutputStream s() {
        return (OutputStream)new k0$a(this);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append((Object)this.e);
        sb.append(')');
        return sb.toString();
    }
    
    public int write(final ByteBuffer byteBuffer) {
        l.e((Object)byteBuffer, "source");
        if (this.g ^ true) {
            final int write = this.f.write(byteBuffer);
            this.a();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
    
    public void x(final b b, final long n) {
        l.e((Object)b, "source");
        if (this.g ^ true) {
            this.f.x(b, n);
            this.a();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
