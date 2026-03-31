package c5;

import b5.q0;
import java.util.Calendar;
import java.util.Collection;
import i4.w;
import h4.p;
import i4.t;
import i4.v;
import b5.f;
import java.util.ArrayList;
import java.io.IOException;
import java.io.Closeable;
import u3.q;
import b5.d;
import b5.f0;
import b5.s0;
import java.util.GregorianCalendar;
import java.util.Iterator;
import v3.l;
import x3.a;
import java.util.Comparator;
import v3.c0;
import u3.n;
import i4.g;
import u3.j;
import b5.j0;
import java.util.Map;
import java.util.List;

public abstract class i
{
    private static final Map a(final List list) {
        final j0 e = j0.a.e(j0.f, "/", false, 1, null);
        final Map f = c0.f(new j[] { n.a((Object)e, (Object)new h(e, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)) });
        for (Object o : l.D((Iterable)list, (Comparator)new Comparator() {
            public final int compare(final Object o, final Object o2) {
                return a.a((Comparable)((h)o).a(), (Comparable)((h)o2).a());
            }
        })) {
            if (f.put((Object)((h)o).a(), o) == null) {
                while (true) {
                    final j0 m = ((h)o).a().m();
                    if (m == null) {
                        break;
                    }
                    final h h = (h)f.get((Object)m);
                    if (h != null) {
                        ((Collection)h.b()).add((Object)((h)o).a());
                        break;
                    }
                    final h h2 = new h(m, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                    f.put((Object)m, (Object)h2);
                    ((Collection)h2.b()).add((Object)((h)o).a());
                    o = h2;
                }
            }
        }
        return f;
    }
    
    private static final Long b(final int n, final int n2) {
        if (n2 == -1) {
            return null;
        }
        final GregorianCalendar gregorianCalendar = new GregorianCalendar();
        ((Calendar)gregorianCalendar).set(14, 0);
        ((Calendar)gregorianCalendar).set((n >> 9 & 0x7F) + 1980, (n >> 5 & 0xF) - 1, n & 0x1F, n2 >> 11 & 0x1F, n2 >> 5 & 0x3F, (n2 & 0x1F) << 1);
        return ((Calendar)gregorianCalendar).getTime().getTime();
    }
    
    private static final String c(final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("0x");
        final String string = Integer.toString(n, p4.a.a(16));
        i4.l.d(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        return sb.toString();
    }
    
    public static final s0 d(final j0 j0, final b5.h h, h4.l a) {
        i4.l.e(j0, "zipPath");
        i4.l.e(h, "fileSystem");
        i4.l.e(a, "predicate");
        final f i = h.i(j0);
        try {
            long k = i.z() - 22;
            final long n = 0L;
            if (k >= 0L) {
                long n2 = Math.max(k - 65536L, 0L);
                while (true) {
                    Object o = f0.b(i.A(k));
                    try {
                        if (((d)o).o() == 101010256) {
                            final e f = f((d)o);
                            final String d = ((d)o).d((long)f.b());
                            ((q0)o).close();
                            k -= 20;
                            o = f;
                            if (k > 0L) {
                                final d b = f0.b(i.A(k));
                                o = f;
                                try {
                                    Label_0318: {
                                        if (b.o() == 117853008) {
                                            final int o2 = b.o();
                                            k = b.k();
                                            if (b.o() == 1 && o2 == 0) {
                                                final d b2 = f0.b(i.A(k));
                                                try {
                                                    final int o3 = b2.o();
                                                    if (o3 == 101075792) {
                                                        o = j(b2, f);
                                                        final q a2 = q.a;
                                                        f4.a.a((Closeable)b2, null);
                                                        break Label_0318;
                                                    }
                                                    final StringBuilder sb = new StringBuilder();
                                                    sb.append("bad zip: expected ");
                                                    sb.append(c(101075792));
                                                    sb.append(" but was ");
                                                    sb.append(c(o3));
                                                    throw new IOException(sb.toString());
                                                }
                                                finally {
                                                    try {}
                                                    finally {
                                                        f4.a.a((Closeable)b2, (Throwable)j0);
                                                    }
                                                }
                                            }
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                    }
                                    final q a3 = q.a;
                                    f4.a.a((Closeable)b, null);
                                }
                                finally {
                                    try {}
                                    finally {
                                        f4.a.a((Closeable)b, (Throwable)h);
                                    }
                                }
                            }
                            final ArrayList list = new ArrayList();
                            final d b3 = f0.b(i.A(((e)o).a()));
                            try {
                                for (n2 = ((e)o).c(), k = n; k < n2; ++k) {
                                    final h e = e(b3);
                                    if (e.f() >= ((e)o).a()) {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                    if (a.p((Object)e)) {
                                        ((Collection)list).add((Object)e);
                                    }
                                }
                                a = (h4.l)q.a;
                                f4.a.a((Closeable)b3, null);
                                final s0 s0 = new s0(j0, h, a((List)list), d);
                                f4.a.a((Closeable)i, null);
                                return s0;
                            }
                            finally {
                                try {}
                                finally {
                                    f4.a.a((Closeable)b3, (Throwable)j0);
                                }
                            }
                        }
                        ((q0)o).close();
                        --k;
                        if (k >= n2) {
                            continue;
                        }
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                    finally {
                        ((q0)o).close();
                    }
                    break;
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("not a zip: size=");
            sb2.append(i.z());
            throw new IOException(sb2.toString());
        }
        finally {
            try {}
            finally {
                f4.a.a((Closeable)i, (Throwable)j0);
            }
        }
    }
    
    public static final h e(final d d) {
        i4.l.e(d, "<this>");
        final int o = d.o();
        if (o != 33639248) {
            final StringBuilder sb = new StringBuilder();
            sb.append("bad zip: expected ");
            sb.append(c(33639248));
            sb.append(" but was ");
            sb.append(c(o));
            throw new IOException(sb.toString());
        }
        d.skip(4L);
        final int n = d.g() & 0xFFFF;
        if ((n & 0x1) != 0x0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("unsupported zip: general purpose bit flag=");
            sb2.append(c(n));
            throw new IOException(sb2.toString());
        }
        final int n2 = d.g() & 0xFFFF;
        final Long b = b(d.g() & 0xFFFF, d.g() & 0xFFFF);
        final long n3 = d.o();
        final v v = new v();
        v.e = ((long)d.o() & 0xFFFFFFFFL);
        final v v2 = new v();
        v2.e = ((long)d.o() & 0xFFFFFFFFL);
        final short g = d.g();
        final short g2 = d.g();
        final short g3 = d.g();
        d.skip(8L);
        final v v3 = new v();
        v3.e = ((long)d.o() & 0xFFFFFFFFL);
        final String d2 = d.d((long)(g & 0xFFFF));
        if (p4.f.t((CharSequence)d2, '\0', false, 2, (Object)null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long n4;
        if (v2.e == 4294967295L) {
            n4 = 8 + 0L;
        }
        else {
            n4 = 0L;
        }
        long n5 = n4;
        if (v.e == 4294967295L) {
            n5 = n4 + 8;
        }
        long n6 = n5;
        if (v3.e == 4294967295L) {
            n6 = n5 + 8;
        }
        final t t = new t();
        g(d, g2 & 0xFFFF, (p)new i$b(t, n6, v2, d, v, v3));
        if (n6 > 0L && !t.e) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        return new h(j0.a.e(j0.f, "/", false, 1, null).p(d2), p4.f.j(d2, "/", false, 2, (Object)null), d.d((long)(g3 & 0xFFFF)), n3 & 0xFFFFFFFFL, v.e, v2.e, n2, b, v3.e);
    }
    
    private static final e f(final d d) {
        final short g = d.g();
        final short g2 = d.g();
        final long n = d.g() & 0xFFFF;
        if (n == (d.g() & 0xFFFF) && (g & 0xFFFF) == 0x0 && (g2 & 0xFFFF) == 0x0) {
            d.skip(4L);
            return new e(n, 0xFFFFFFFFL & (long)d.o(), d.g() & 0xFFFF);
        }
        throw new IOException("unsupported zip: spanned");
    }
    
    private static final void g(final d d, int n, final p p3) {
        long n3;
        long n4;
        for (long n2 = n; n2 != 0L; n2 = n4 - n3) {
            if (n2 < 4L) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            n = (d.g() & 0xFFFF);
            n3 = ((long)d.g() & 0xFFFFL);
            n4 = n2 - 4;
            if (n4 < n3) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            d.n(n3);
            final long e = d.q().E();
            p3.j((Object)n, (Object)n3);
            final long n5 = d.q().E() + n3 - e;
            final long n6 = lcmp(n5, 0L);
            if (n6 < 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("unsupported zip: too many bytes processed for ");
                sb.append(n);
                throw new IOException(sb.toString());
            }
            if (n6 > 0) {
                d.q().skip(n5);
            }
        }
    }
    
    public static final b5.g h(final d d, final b5.g g) {
        i4.l.e(d, "<this>");
        i4.l.e(g, "basicMetadata");
        final b5.g i = i(d, g);
        i4.l.b(i);
        return i;
    }
    
    private static final b5.g i(final d d, final b5.g g) {
        final w w = new w();
        Long a;
        if (g != null) {
            a = g.a();
        }
        else {
            a = null;
        }
        w.e = a;
        final w w2 = new w();
        final w w3 = new w();
        final int o = d.o();
        if (o != 67324752) {
            final StringBuilder sb = new StringBuilder();
            sb.append("bad zip: expected ");
            sb.append(c(67324752));
            sb.append(" but was ");
            sb.append(c(o));
            throw new IOException(sb.toString());
        }
        d.skip(2L);
        final int n = d.g() & 0xFFFF;
        if ((n & 0x1) != 0x0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("unsupported zip: general purpose bit flag=");
            sb2.append(c(n));
            throw new IOException(sb2.toString());
        }
        d.skip(18L);
        final long n2 = d.g();
        final int n3 = d.g() & 0xFFFF;
        d.skip(n2 & 0xFFFFL);
        if (g == null) {
            d.skip((long)n3);
            return null;
        }
        g(d, n3, (p)new i$c(d, w, w2, w3));
        return new b5.g(g.d(), g.c(), null, g.b(), (Long)w3.e, (Long)w.e, (Long)w2.e, null, 128, null);
    }
    
    private static final e j(final d d, final e e) {
        d.skip(12L);
        final int o = d.o();
        final int o2 = d.o();
        final long k = d.k();
        if (k == d.k() && o == 0 && o2 == 0) {
            d.skip(8L);
            return new e(k, d.k(), e.b());
        }
        throw new IOException("unsupported zip: spanned");
    }
    
    public static final void k(final d d) {
        i4.l.e(d, "<this>");
        i(d, null);
    }
}
