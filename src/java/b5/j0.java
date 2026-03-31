package b5;

import java.util.Collection;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import c5.c;
import i4.l;
import java.io.File;
import i4.g;

public final class j0 implements Comparable
{
    public static final a f;
    public static final String g;
    private final e e;
    
    static {
        f = new a(null);
        final String separator = File.separator;
        l.d(separator, "separator");
        g = separator;
    }
    
    public j0(final e e) {
        l.e(e, "bytes");
        this.e = e;
    }
    
    public int a(final j0 j0) {
        l.e(j0, "other");
        return this.b().a(j0.b());
    }
    
    public final e b() {
        return this.e;
    }
    
    public final j0 d() {
        final int h = c.h(this);
        j0 j0;
        if (h == -1) {
            j0 = null;
        }
        else {
            j0 = new j0(this.b().A(0, h));
        }
        return j0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof j0 && l.a(((j0)o).b(), this.b());
    }
    
    public final List f() {
        final ArrayList list = new ArrayList();
        final int h = c.h(this);
        int n;
        if (h == -1) {
            n = 0;
        }
        else if ((n = h) < this.b().y()) {
            n = h;
            if (this.b().d(h) == 92) {
                n = h + 1;
            }
        }
        final int y = this.b().y();
        int n2 = n;
        int n3;
        for (int i = n; i < y; ++i, n2 = n3) {
            if (this.b().d(i) != 47) {
                n3 = n2;
                if (this.b().d(i) != 92) {
                    continue;
                }
            }
            ((Collection)list).add((Object)this.b().A(n2, i));
            n3 = i + 1;
        }
        if (n2 < this.b().y()) {
            ((Collection)list).add((Object)this.b().A(n2, this.b().y()));
        }
        return (List)list;
    }
    
    public final boolean g() {
        return c.h(this) != -1;
    }
    
    @Override
    public int hashCode() {
        return this.b().hashCode();
    }
    
    public final String j() {
        return this.k().C();
    }
    
    public final e k() {
        final int d = c.d(this);
        e e;
        if (d != -1) {
            e = b5.e.B(this.b(), d + 1, 0, 2, null);
        }
        else if (this.s() != null && this.b().y() == 2) {
            e = b5.e.i;
        }
        else {
            e = this.b();
        }
        return e;
    }
    
    public final j0 l() {
        return j0.f.b(this.toString(), true);
    }
    
    public final j0 m() {
        final boolean a = l.a(this.b(), c.b());
        j0 j2;
        final j0 j0 = j2 = null;
        if (!a) {
            j2 = j0;
            if (!l.a(this.b(), c.e())) {
                j2 = j0;
                if (!l.a(this.b(), c.a())) {
                    if (c.g(this)) {
                        j2 = j0;
                    }
                    else {
                        final int d = c.d(this);
                        if (d == 2 && this.s() != null) {
                            if (this.b().y() == 3) {
                                j2 = j0;
                            }
                            else {
                                j2 = new j0(b5.e.B(this.b(), 0, 3, 1, null));
                            }
                        }
                        else if (d == 1 && this.b().z(c.a())) {
                            j2 = j0;
                        }
                        else if (d == -1 && this.s() != null) {
                            if (this.b().y() == 2) {
                                j2 = j0;
                            }
                            else {
                                j2 = new j0(b5.e.B(this.b(), 0, 2, 1, null));
                            }
                        }
                        else if (d == -1) {
                            j2 = new j0(c.b());
                        }
                        else if (d == 0) {
                            j2 = new j0(b5.e.B(this.b(), 0, 1, 1, null));
                        }
                        else {
                            j2 = new j0(b5.e.B(this.b(), 0, d, 1, null));
                        }
                    }
                }
            }
        }
        return j2;
    }
    
    public final j0 n(j0 j0) {
        l.e(j0, "other");
        if (l.a(this.d(), j0.d())) {
            List f;
            List f2;
            int min;
            int i;
            for (f = this.f(), f2 = j0.f(), min = Math.min(f.size(), f2.size()), i = 0; i < min && l.a(f.get(i), f2.get(i)); ++i) {}
            boolean b = true;
            if (i == min && this.b().y() == j0.b().y()) {
                j0 = a.e(j0.f, ".", false, 1, null);
            }
            else {
                if (f2.subList(i, f2.size()).indexOf((Object)c.c()) != -1) {
                    b = false;
                }
                if (!b) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Impossible relative path to resolve: ");
                    sb.append((Object)this);
                    sb.append(" and ");
                    sb.append((Object)j0);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                final b b2 = new b();
                e e;
                if ((e = c.f(j0)) == null && (e = c.f(this)) == null) {
                    e = c.i(j0.g);
                }
                for (int size = f2.size(), k = i; k < size; ++k) {
                    b2.I(c.c());
                    b2.I(e);
                }
                while (i < f.size()) {
                    b2.I((e)f.get(i));
                    b2.I(e);
                    ++i;
                }
                j0 = c.q(b2, false);
            }
            return j0;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Paths of different roots cannot be relative to each other: ");
        sb2.append((Object)this);
        sb2.append(" and ");
        sb2.append((Object)j0);
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    public final j0 o(final j0 j0, final boolean b) {
        l.e(j0, "child");
        return c.j(this, j0, b);
    }
    
    public final j0 p(final String s) {
        l.e(s, "child");
        return c.j(this, c.q(new b().M(s), false), false);
    }
    
    public final File q() {
        return new File(this.toString());
    }
    
    public final Path r() {
        final Path a = i0.a(this.toString(), new String[0]);
        l.d(a, "get(toString())");
        return a;
    }
    
    public final Character s() {
        final e b = this.b();
        final e e = c.e();
        final boolean b2 = false;
        Character value = null;
        if (b5.e.o(b, e, 0, 2, null) == -1) {
            if (this.b().y() >= 2) {
                if (this.b().d(1) == 58) {
                    final char c = (char)this.b().d(0);
                    if ('a' > c || c >= '{') {
                        int n = b2 ? 1 : 0;
                        if ('A' <= c) {
                            n = (b2 ? 1 : 0);
                            if (c < '[') {
                                n = 1;
                            }
                        }
                        if (n == 0) {
                            return value;
                        }
                    }
                    value = c;
                }
            }
        }
        return value;
    }
    
    @Override
    public String toString() {
        return this.b().C();
    }
    
    public static final class a
    {
        private a() {
        }
        
        public static /* synthetic */ j0 e(final a a, final String s, boolean b, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                b = false;
            }
            return a.b(s, b);
        }
        
        public final j0 a(final File file, final boolean b) {
            l.e(file, "<this>");
            final String string = file.toString();
            l.d(string, "toString()");
            return this.b(string, b);
        }
        
        public final j0 b(final String s, final boolean b) {
            l.e(s, "<this>");
            return c.k(s, b);
        }
        
        public final j0 c(final Path path, final boolean b) {
            l.e(path, "<this>");
            return this.b(path.toString(), b);
        }
    }
}
