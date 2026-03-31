package b5;

import java.util.concurrent.locks.Lock;
import u3.q;
import i4.l;
import java.util.concurrent.locks.ReentrantLock;
import java.io.Closeable;

public abstract class f implements Closeable
{
    private final boolean e;
    private boolean f;
    private int g;
    private final ReentrantLock h;
    
    public f(final boolean e) {
        this.e = e;
        this.h = t0.b();
    }
    
    private final void B(long n, final b b, long n2) {
        a.b(b.E(), 0L, n2);
        for (long n3 = n2 + n; n < n3; n = n2) {
            final m0 e = b.e;
            l.b(e);
            final int n4 = (int)Math.min(n3 - n, (long)(e.c - e.b));
            this.t(n, e.a, e.b, n4);
            e.b += n4;
            final long n5 = n4;
            n2 = n + n5;
            b.D(b.E() - n5);
            n = n2;
            if (e.b == e.c) {
                b.e = e.b();
                n0.b(e);
            }
        }
    }
    
    private final long u(final long n, final b b, long n2) {
        if (n2 >= 0L) {
            final long n3 = n + n2;
            n2 = n;
            while (n2 < n3) {
                final m0 h = b.H(1);
                final byte[] a = h.a;
                final int c = h.c;
                final int l = this.l(n2, a, c, (int)Math.min(n3 - n2, (long)(8192 - c)));
                if (l == -1) {
                    if (h.b == h.c) {
                        b.e = h.b();
                        n0.b(h);
                    }
                    if (n == n2) {
                        return -1L;
                    }
                    break;
                }
                else {
                    h.c += l;
                    final long n4 = l;
                    n2 += n4;
                    b.D(b.E() + n4);
                }
            }
            return n2 - n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("byteCount < 0: ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final q0 A(final long n) {
        final ReentrantLock h = this.h;
        ((Lock)h).lock();
        try {
            if (this.f ^ true) {
                ++this.g;
                ((Lock)h).unlock();
                return (q0)new f.f$b(this, n);
            }
            throw new IllegalStateException("closed".toString());
        }
        finally {
            ((Lock)h).unlock();
        }
    }
    
    public final void close() {
        final ReentrantLock h = this.h;
        ((Lock)h).lock();
        try {
            if (this.f) {
                return;
            }
            this.f = true;
            if (this.g != 0) {
                return;
            }
            final q a = q.a;
            ((Lock)h).unlock();
            this.i();
        }
        finally {
            ((Lock)h).unlock();
        }
    }
    
    public final void flush() {
        if (this.e) {
            final ReentrantLock h = this.h;
            ((Lock)h).lock();
            try {
                if (this.f ^ true) {
                    final q a = q.a;
                    ((Lock)h).unlock();
                    this.j();
                    return;
                }
                throw new IllegalStateException("closed".toString());
            }
            finally {
                ((Lock)h).unlock();
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }
    
    public final ReentrantLock h() {
        return this.h;
    }
    
    protected abstract void i();
    
    protected abstract void j();
    
    protected abstract int l(final long p0, final byte[] p1, final int p2, final int p3);
    
    protected abstract long p();
    
    protected abstract void t(final long p0, final byte[] p1, final int p2, final int p3);
    
    public final p0 v(final long n) {
        if (this.e) {
            final ReentrantLock h = this.h;
            ((Lock)h).lock();
            try {
                if (this.f ^ true) {
                    ++this.g;
                    ((Lock)h).unlock();
                    return (p0)new f.f$a(this, n);
                }
                throw new IllegalStateException("closed".toString());
            }
            finally {
                ((Lock)h).unlock();
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }
    
    public final long z() {
        final ReentrantLock h = this.h;
        ((Lock)h).lock();
        try {
            if (this.f ^ true) {
                final q a = q.a;
                ((Lock)h).unlock();
                return this.p();
            }
            throw new IllegalStateException("closed".toString());
        }
        finally {
            ((Lock)h).unlock();
        }
    }
}
