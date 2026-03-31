package b5;

import i4.l;
import java.util.concurrent.atomic.AtomicReference;

public final class n0
{
    public static final n0 a;
    private static final int b;
    private static final m0 c;
    private static final int d;
    private static final AtomicReference[] e;
    
    static {
        a = new n0();
        b = 65536;
        int i = 0;
        c = new m0(new byte[0], 0, 0, false, false);
        final int n = d = Integer.highestOneBit(Runtime.getRuntime().availableProcessors() * 2 - 1);
        final AtomicReference[] e2 = new AtomicReference[n];
        while (i < n) {
            e2[i] = new AtomicReference();
            ++i;
        }
        e = e2;
    }
    
    private n0() {
    }
    
    private final AtomicReference a() {
        return n0.e[(int)(Thread.currentThread().getId() & n0.d - 1L)];
    }
    
    public static final void b(final m0 m0) {
        l.e(m0, "segment");
        if (m0.f != null || m0.g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (m0.d) {
            return;
        }
        final AtomicReference a = n0.a.a();
        final m0 c = n0.c;
        final m0 f = (m0)a.getAndSet((Object)c);
        if (f == c) {
            return;
        }
        int c2;
        if (f != null) {
            c2 = f.c;
        }
        else {
            c2 = 0;
        }
        if (c2 >= n0.b) {
            a.set((Object)f);
            return;
        }
        m0.f = f;
        m0.b = 0;
        m0.c = c2 + 8192;
        a.set((Object)m0);
    }
    
    public static final m0 c() {
        final AtomicReference a = n0.a.a();
        final m0 c = n0.c;
        final m0 m0 = (m0)a.getAndSet((Object)c);
        if (m0 == c) {
            return new m0();
        }
        if (m0 == null) {
            a.set((Object)null);
            return new m0();
        }
        a.set((Object)m0.f);
        m0.f = null;
        m0.c = 0;
        return m0;
    }
}
