package b5;

import java.io.Closeable;
import java.util.zip.Inflater;
import java.io.FileNotFoundException;
import c5.i;
import u3.a;
import java.io.IOException;
import i4.l;
import i4.g;
import java.util.Map;

public final class s0 extends h
{
    private static final s0.s0$a i;
    private static final j0 j;
    private final j0 e;
    private final h f;
    private final Map g;
    private final String h;
    
    static {
        i = new s0.s0$a((g)null);
        j = j0$a.e(j0.f, "/", false, 1, (Object)null);
    }
    
    public s0(final j0 e, final h f, final Map g, final String h) {
        l.e((Object)e, "zipPath");
        l.e((Object)f, "fileSystem");
        l.e((Object)g, "entries");
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    private final j0 m(final j0 j0) {
        return s0.j.o(j0, true);
    }
    
    public void a(final j0 j0, final j0 j2) {
        l.e((Object)j0, "source");
        l.e((Object)j2, "target");
        throw new IOException("zip file systems are read-only");
    }
    
    public void d(final j0 j0, final boolean b) {
        l.e((Object)j0, "dir");
        throw new IOException("zip file systems are read-only");
    }
    
    public void f(final j0 j0, final boolean b) {
        l.e((Object)j0, "path");
        throw new IOException("zip file systems are read-only");
    }
    
    public b5.g h(j0 m) {
        l.e(m, "path");
        m = this.m((j0)m);
        final c5.h h = (c5.h)this.g.get(m);
        if (h == null) {
            return null;
        }
        final boolean h2 = h.h();
        final boolean h3 = h.h();
        Long value;
        if (h.h()) {
            value = null;
        }
        else {
            value = h.g();
        }
        final b5.g g = new b5.g(h2 ^ true, h3, (j0)null, value, (Long)null, h.e(), (Long)null, (Map)null, 128, (g)null);
        if (h.f() == -1L) {
            return g;
        }
        final f i = this.f.i(this.e);
        d d;
        try {
            f0.b(i.A(h.f()));
            if (i != null) {
                try {
                    ((Closeable)i).close();
                }
                finally {}
            }
        }
        finally {
            if (i != null) {
                try {
                    ((Closeable)i).close();
                }
                finally {
                    final Throwable t;
                    a.a((Throwable)m, t);
                }
            }
            d = null;
        }
        if (m == null) {
            l.b((Object)d);
            return c5.i.h(d, g);
        }
    }
    
    public f i(final j0 j0) {
        l.e((Object)j0, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }
    
    public f k(final j0 j0, final boolean b, final boolean b2) {
        l.e((Object)j0, "file");
        throw new IOException("zip entries are not writable");
    }
    
    public q0 l(final j0 j0) {
        l.e((Object)j0, "file");
        final c5.h h = (c5.h)this.g.get((Object)this.m(j0));
        if (h == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("no such file: ");
            sb.append((Object)j0);
            throw new FileNotFoundException(sb.toString());
        }
        final f i = this.f.i(this.e);
        d d;
        try {
            f0.b(i.A(h.f()));
            if (i != null) {
                try {
                    ((Closeable)i).close();
                }
                finally {}
            }
        }
        finally {
            if (i != null) {
                try {
                    ((Closeable)i).close();
                }
                finally {
                    final Throwable t;
                    a.a((Throwable)j0, t);
                }
            }
            d = null;
        }
        if (j0 == null) {
            l.b((Object)d);
            c5.i.k(d);
            c5.f f;
            if (h.d() == 0) {
                f = new c5.f((q0)d, h.g(), true);
            }
            else {
                f = new c5.f((q0)new j((q0)new c5.f((q0)d, h.c(), true), new Inflater(true)), h.g(), false);
            }
            return (q0)f;
        }
    }
}
