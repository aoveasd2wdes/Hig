package c5;

import b5.q0;
import java.io.FileNotFoundException;
import java.util.Iterator;
import u3.j;
import java.io.IOException;
import java.util.List;
import h4.a;
import u3.f;
import i4.l;
import b5.j0$a;
import u3.e;
import b5.j0;
import b5.h;

public final class g extends h
{
    private static final g.g$a f;
    private static final j0 g;
    private final e e;
    
    static {
        f = new g.g$a((i4.g)null);
        g = j0$a.e(j0.f, "/", false, 1, (Object)null);
    }
    
    public g(final ClassLoader classLoader, final boolean b) {
        l.e((Object)classLoader, "classLoader");
        this.e = u3.f.a((a)new g$b(classLoader));
        if (b) {
            this.p().size();
        }
    }
    
    private final j0 o(final j0 j0) {
        return c5.g.g.o(j0, true);
    }
    
    private final List p() {
        return (List)this.e.getValue();
    }
    
    private final String q(final j0 j0) {
        return this.o(j0).n(c5.g.g).toString();
    }
    
    public void a(final j0 j0, final j0 j2) {
        l.e((Object)j0, "source");
        l.e((Object)j2, "target");
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)this);
        sb.append(" is read-only");
        throw new IOException(sb.toString());
    }
    
    public void d(final j0 j0, final boolean b) {
        l.e((Object)j0, "dir");
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)this);
        sb.append(" is read-only");
        throw new IOException(sb.toString());
    }
    
    public void f(final j0 j0, final boolean b) {
        l.e((Object)j0, "path");
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)this);
        sb.append(" is read-only");
        throw new IOException(sb.toString());
    }
    
    public b5.g h(final j0 j0) {
        l.e((Object)j0, "path");
        if (!c5.g.g$a.a(c5.g.f, j0)) {
            return null;
        }
        final String q = this.q(j0);
        for (final j i : this.p()) {
            final b5.g h = ((h)i.a()).h(((j0)i.b()).p(q));
            if (h == null) {
                continue;
            }
            return h;
        }
        return null;
    }
    
    public b5.f i(final j0 j0) {
        l.e((Object)j0, "file");
        if (c5.g.g$a.a(c5.g.f, j0)) {
            final String q = this.q(j0);
            for (final j i : this.p()) {
                final h h = (h)i.a();
                final j0 j2 = (j0)i.b();
                try {
                    return h.i(j2.p(q));
                }
                catch (final FileNotFoundException ex) {
                    continue;
                }
                break;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("file not found: ");
            sb.append((Object)j0);
            throw new FileNotFoundException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("file not found: ");
        sb2.append((Object)j0);
        throw new FileNotFoundException(sb2.toString());
    }
    
    public b5.f k(final j0 j0, final boolean b, final boolean b2) {
        l.e((Object)j0, "file");
        throw new IOException("resources are not writable");
    }
    
    public q0 l(final j0 j0) {
        l.e((Object)j0, "file");
        if (c5.g.g$a.a(c5.g.f, j0)) {
            final String q = this.q(j0);
            for (final j i : this.p()) {
                final h h = (h)i.a();
                final j0 j2 = (j0)i.b();
                try {
                    return h.l(j2.p(q));
                }
                catch (final FileNotFoundException ex) {
                    continue;
                }
                break;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("file not found: ");
            sb.append((Object)j0);
            throw new FileNotFoundException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("file not found: ");
        sb2.append((Object)j0);
        throw new FileNotFoundException(sb2.toString());
    }
}
