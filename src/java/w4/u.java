package w4;

import androidx.concurrent.futures.b;
import i4.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class u
{
    public static final a e;
    private static final AtomicReferenceFieldUpdater f;
    private static final AtomicLongFieldUpdater g;
    public static final h0 h;
    private volatile Object _next;
    private volatile long _state;
    private final int a;
    private final boolean b;
    private final int c;
    private final AtomicReferenceArray d;
    
    static {
        e = new a(null);
        f = AtomicReferenceFieldUpdater.newUpdater((Class)u.class, (Class)Object.class, "_next");
        g = AtomicLongFieldUpdater.newUpdater((Class)u.class, "_state");
        h = new h0("REMOVE_FROZEN");
    }
    
    public u(final int a, final boolean b) {
        this.a = a;
        this.b = b;
        final int c = a - 1;
        this.c = c;
        this.d = new AtomicReferenceArray(a);
        final int n = 0;
        if (c > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int n2 = n;
        if ((a & c) == 0x0) {
            n2 = 1;
        }
        if (n2 != 0) {
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    private final u b(final long n) {
        final u u = new u(this.a * 2, this.b);
        int n2 = (int)((0x3FFFFFFFL & n) >> 0);
        final int n3 = (int)((0xFFFFFFFC0000000L & n) >> 30);
        while (true) {
            final int c = this.c;
            if ((n2 & c) == (n3 & c)) {
                break;
            }
            Object value;
            if ((value = this.d.get(c & n2)) == null) {
                value = new b(n2);
            }
            u.d.set(u.c & n2, value);
            ++n2;
        }
        w4.u.g.set((Object)u, w4.u.e.d(n, 1152921504606846976L));
        return u;
    }
    
    private final u c(final long n) {
        final AtomicReferenceFieldUpdater f = u.f;
        u u;
        while (true) {
            u = (u)f.get((Object)this);
            if (u != null) {
                break;
            }
            androidx.concurrent.futures.b.a(w4.u.f, (Object)this, (Object)null, (Object)this.b(n));
        }
        return u;
    }
    
    private final u e(final int n, final Object o) {
        final Object value = this.d.get(this.c & n);
        if (value instanceof b && ((b)value).a == n) {
            this.d.set(n & this.c, o);
            return this;
        }
        return null;
    }
    
    private final long h() {
        final AtomicLongFieldUpdater g = u.g;
        long value;
        long n;
        do {
            value = g.get((Object)this);
            if ((value & 0x1000000000000000L) != 0x0L) {
                return value;
            }
            n = (value | 0x1000000000000000L);
        } while (!g.compareAndSet((Object)this, value, n));
        return n;
    }
    
    private final u k(int n, final int n2) {
        final AtomicLongFieldUpdater g = u.g;
        long value;
        do {
            value = g.get((Object)this);
            n = (int)((0x3FFFFFFFL & value) >> 0);
            if ((0x1000000000000000L & value) != 0x0L) {
                return this.i();
            }
        } while (!u.g.compareAndSet((Object)this, value, u.e.b(value, n2)));
        this.d.set(this.c & n, (Object)null);
        return null;
    }
    
    public final int a(final Object o) {
        final AtomicLongFieldUpdater g = u.g;
        while (true) {
            final long value = g.get((Object)this);
            if ((0x3000000000000000L & value) != 0x0L) {
                return u.e.a(value);
            }
            final int n = (int)((0x3FFFFFFFL & value) >> 0);
            final int n2 = (int)((0xFFFFFFFC0000000L & value) >> 30);
            final int c = this.c;
            if ((n2 + 2 & c) == (n & c)) {
                return 1;
            }
            if (!this.b && this.d.get(n2 & c) != null) {
                final int a = this.a;
                if (a < 1024 || (n2 - n & 0x3FFFFFFF) > a >> 1) {
                    return 1;
                }
                continue;
            }
            else {
                if (u.g.compareAndSet((Object)this, value, u.e.c(value, n2 + 1 & 0x3FFFFFFF))) {
                    this.d.set(n2 & c, o);
                    u e = this;
                    while ((u.g.get((Object)e) & 0x1000000000000000L) != 0x0L && (e = e.i().e(n2, o)) != null) {}
                    return 0;
                }
                continue;
            }
        }
    }
    
    public final boolean d() {
        final AtomicLongFieldUpdater g = u.g;
        long value;
        do {
            value = g.get((Object)this);
            if ((value & 0x2000000000000000L) != 0x0L) {
                return true;
            }
            if ((0x1000000000000000L & value) != 0x0L) {
                return false;
            }
        } while (!g.compareAndSet((Object)this, value, value | 0x2000000000000000L));
        return true;
    }
    
    public final int f() {
        final long value = u.g.get((Object)this);
        return 0x3FFFFFFF & (int)((value & 0xFFFFFFFC0000000L) >> 30) - (int)((0x3FFFFFFFL & value) >> 0);
    }
    
    public final boolean g() {
        final long value = u.g.get((Object)this);
        boolean b = false;
        if ((int)((0x3FFFFFFFL & value) >> 0) == (int)((value & 0xFFFFFFFC0000000L) >> 30)) {
            b = true;
        }
        return b;
    }
    
    public final u i() {
        return this.c(this.h());
    }
    
    public final Object j() {
        final AtomicLongFieldUpdater g = u.g;
        while (true) {
            final long value = g.get((Object)this);
            if ((0x1000000000000000L & value) != 0x0L) {
                return u.h;
            }
            final int n = (int)((0x3FFFFFFFL & value) >> 0);
            final int n2 = (int)((0xFFFFFFFC0000000L & value) >> 30);
            final int c = this.c;
            if ((n2 & c) == (n & c)) {
                return null;
            }
            final Object value2 = this.d.get(c & n);
            if (value2 == null) {
                if (this.b) {
                    return null;
                }
                continue;
            }
            else {
                if (value2 instanceof b) {
                    return null;
                }
                final int n3 = n + 1 & 0x3FFFFFFF;
                if (u.g.compareAndSet((Object)this, value, u.e.b(value, n3))) {
                    this.d.set(this.c & n, (Object)null);
                    return value2;
                }
                if (this.b) {
                    u k = this;
                    while ((k = k.k(n, n3)) != null) {}
                    return value2;
                }
                continue;
            }
        }
    }
    
    public static final class a
    {
        private a() {
        }
        
        public final int a(final long n) {
            int n2;
            if ((n & 0x2000000000000000L) != 0x0L) {
                n2 = 2;
            }
            else {
                n2 = 1;
            }
            return n2;
        }
        
        public final long b(final long n, final int n2) {
            return this.d(n, 1073741823L) | (long)n2 << 0;
        }
        
        public final long c(final long n, final int n2) {
            return this.d(n, 1152921503533105152L) | (long)n2 << 30;
        }
        
        public final long d(final long n, final long n2) {
            return n & ~n2;
        }
    }
    
    public static final class b
    {
        public final int a;
        
        public b(final int a) {
            this.a = a;
        }
    }
}
