package c5;

import java.util.List;
import java.util.ArrayList;
import b5.b;
import i4.l;
import b5.j0;
import b5.e;

public abstract class c
{
    private static final e a;
    private static final e b;
    private static final e c;
    private static final e d;
    private static final e e;
    
    static {
        final e.a h = b5.e.h;
        a = h.a("/");
        b = h.a("\\");
        c = h.a("/\\");
        d = h.a(".");
        e = h.a("..");
    }
    
    public static final j0 j(final j0 j0, final j0 j2, final boolean b) {
        l.e(j0, "<this>");
        l.e(j2, "child");
        if (!j2.g() && j2.s() == null) {
            e e;
            if ((e = m(j0)) == null && (e = m(j2)) == null) {
                e = s(j0.g);
            }
            final b b2 = new b();
            b2.I(j0.b());
            if (b2.E() > 0L) {
                b2.I(e);
            }
            b2.I(j2.b());
            return q(b2, b);
        }
        return j2;
    }
    
    public static final j0 k(final String s, final boolean b) {
        l.e(s, "<this>");
        return q(new b().M(s), b);
    }
    
    private static final int l(final j0 j0) {
        final int t = b5.e.t(j0.b(), c5.c.a, 0, 2, null);
        if (t != -1) {
            return t;
        }
        return b5.e.t(j0.b(), c5.c.b, 0, 2, null);
    }
    
    private static final e m(final j0 j0) {
        final e b = j0.b();
        final e a = c5.c.a;
        e b2;
        if (b5.e.o(b, a, 0, 2, null) != -1) {
            b2 = a;
        }
        else {
            final e b3 = j0.b();
            b2 = c5.c.b;
            if (b5.e.o(b3, b2, 0, 2, null) == -1) {
                b2 = null;
            }
        }
        return b2;
    }
    
    private static final boolean n(final j0 j0) {
        if (j0.b().b(c5.c.e)) {
            if (j0.b().y() == 2) {
                return true;
            }
            if (j0.b().u(j0.b().y() - 3, c5.c.a, 0, 1)) {
                return true;
            }
            if (j0.b().u(j0.b().y() - 3, c5.c.b, 0, 1)) {
                return true;
            }
        }
        return false;
    }
    
    private static final int o(final j0 j0) {
        if (j0.b().y() == 0) {
            return -1;
        }
        final e b = j0.b();
        final boolean b2 = false;
        if (b.d(0) == 47) {
            return 1;
        }
        if (j0.b().d(0) == 92) {
            if (j0.b().y() > 2 && j0.b().d(1) == 92) {
                int n;
                if ((n = j0.b().m(c5.c.b, 2)) == -1) {
                    n = j0.b().y();
                }
                return n;
            }
            return 1;
        }
        else {
            if (j0.b().y() > 2 && j0.b().d(1) == 58 && j0.b().d(2) == 92) {
                final char c = (char)j0.b().d(0);
                if ('a' > c || c >= '{') {
                    int n2 = b2 ? 1 : 0;
                    if ('A' <= c) {
                        n2 = (b2 ? 1 : 0);
                        if (c < '[') {
                            n2 = 1;
                        }
                    }
                    if (n2 == 0) {
                        return -1;
                    }
                }
                return 3;
            }
            return -1;
        }
    }
    
    private static final boolean p(final b b, final e e) {
        final boolean a = l.a(e, c5.c.b);
        boolean b2 = false;
        if (!a) {
            return false;
        }
        if (b.E() < 2L) {
            return false;
        }
        if (b.h(1L) != 58) {
            return false;
        }
        final char c = (char)b.h(0L);
        if (('a' <= c && c < '{') || ('A' <= c && c < '[')) {
            b2 = true;
        }
        return b2;
    }
    
    public static final j0 q(final b b, final boolean b2) {
        l.e(b, "<this>");
        final b b3 = new b();
        e e = null;
        final int n = 0;
        int n2 = 0;
        e b4;
        while (true) {
            if (!b.l(0L, c5.c.a)) {
                b4 = c5.c.b;
                if (!b.l(0L, b4)) {
                    break;
                }
            }
            final byte byte1 = b.readByte();
            e r;
            if ((r = e) == null) {
                r = r(byte1);
            }
            ++n2;
            e = r;
        }
        final boolean b5 = n2 >= 2 && l.a(e, b4);
        Label_0217: {
            if (b5) {
                l.b(e);
                b3.I(e);
            }
            else if (n2 > 0) {
                l.b(e);
            }
            else {
                final long i = b.i(c5.c.c);
                e e2;
                if ((e2 = e) == null) {
                    if (i == -1L) {
                        e2 = s(j0.g);
                    }
                    else {
                        e2 = r(b.h(i));
                    }
                }
                e = e2;
                if (!p(b, e2)) {
                    break Label_0217;
                }
                if (i == 2L) {
                    b3.x(b, 3L);
                    e = e2;
                    break Label_0217;
                }
                b3.x(b, 2L);
                e = e2;
                break Label_0217;
            }
            b3.I(e);
        }
        final boolean b6 = b3.E() > 0L;
        final ArrayList list = new ArrayList();
        while (!b.r()) {
            final long j = b.i(c5.c.c);
            e e3;
            if (j == -1L) {
                e3 = b.u();
            }
            else {
                e3 = b.v(j);
                b.readByte();
            }
            final e e4 = c5.c.e;
            Label_0403: {
                if (l.a(e3, e4)) {
                    if (b6 && ((List)list).isEmpty()) {
                        continue;
                    }
                    if (b2) {
                        if (!b6) {
                            if (((List)list).isEmpty()) {
                                break Label_0403;
                            }
                            if (l.a(v3.l.y((List)list), e4)) {
                                break Label_0403;
                            }
                        }
                        if (!b5 || ((List)list).size() != 1) {
                            v3.l.q((List)list);
                            continue;
                        }
                        continue;
                    }
                }
                else if (l.a(e3, c5.c.d) || l.a(e3, b5.e.i)) {
                    continue;
                }
            }
            ((List)list).add((Object)e3);
        }
        for (int size = ((List)list).size(), k = n; k < size; ++k) {
            if (k > 0) {
                b3.I(e);
            }
            b3.I((e)((List)list).get(k));
        }
        if (b3.E() == 0L) {
            b3.I(c5.c.d);
        }
        return new j0(b3.u());
    }
    
    private static final e r(final byte b) {
        e e;
        if (b != 47) {
            if (b != 92) {
                final StringBuilder sb = new StringBuilder();
                sb.append("not a directory separator: ");
                sb.append((int)b);
                throw new IllegalArgumentException(sb.toString());
            }
            e = c5.c.b;
        }
        else {
            e = c5.c.a;
        }
        return e;
    }
    
    private static final e s(final String s) {
        e e;
        if (l.a(s, "/")) {
            e = c5.c.a;
        }
        else {
            if (!l.a(s, "\\")) {
                final StringBuilder sb = new StringBuilder();
                sb.append("not a directory separator: ");
                sb.append(s);
                throw new IllegalArgumentException(sb.toString());
            }
            e = c5.c.b;
        }
        return e;
    }
}
