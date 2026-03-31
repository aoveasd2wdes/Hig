package p4;

import m4.a;
import java.util.Iterator;
import u3.n;
import java.util.Collection;
import u3.j;
import i4.m;
import java.util.List;
import o4.b;
import v3.a0;
import v3.f;
import i4.l;
import m4.c;
import m4.g;

abstract class p extends o
{
    private static final int A(final CharSequence charSequence, final CharSequence charSequence2, int n, int n2, final boolean b, final boolean b2) {
        Object f;
        if (!b2) {
            f = new c(g.a(n, 0), g.c(n2, charSequence.length()));
        }
        else {
            f = g.f(g.c(n, x(charSequence)), g.a(n2, 0));
        }
        if (charSequence instanceof String && charSequence2 instanceof String) {
            n2 = ((a)f).h();
            final int i = ((a)f).i();
            final int j = ((a)f).j();
            if (j <= 0 || (n = n2) > i) {
                if (j >= 0 || i > n2) {
                    return -1;
                }
                n = n2;
            }
            while (!o.l((String)charSequence2, 0, (String)charSequence, n, charSequence2.length(), b)) {
                if (n == i) {
                    return -1;
                }
                n += j;
            }
            return n;
        }
        n2 = ((a)f).h();
        final int k = ((a)f).i();
        final int l = ((a)f).j();
        if (l <= 0 || (n = n2) > k) {
            if (l >= 0 || k > n2) {
                return -1;
            }
            n = n2;
        }
        while (!O(charSequence2, 0, charSequence, n, charSequence2.length(), b)) {
            if (n == k) {
                return -1;
            }
            n += l;
        }
        return n;
    }
    
    static /* synthetic */ int B(final CharSequence charSequence, final CharSequence charSequence2, final int n, final int n2, final boolean b, boolean b2, final int n3, final Object o) {
        if ((n3 & 0x10) != 0x0) {
            b2 = false;
        }
        return A(charSequence, charSequence2, n, n2, b, b2);
    }
    
    public static /* synthetic */ int C(final CharSequence charSequence, final char c, int n, boolean b, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n = 0;
        }
        if ((n2 & 0x4) != 0x0) {
            b = false;
        }
        return y(charSequence, c, n, b);
    }
    
    public static /* synthetic */ int D(final CharSequence charSequence, final String s, int n, boolean b, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            n = 0;
        }
        if ((n2 & 0x4) != 0x0) {
            b = false;
        }
        return z(charSequence, s, n, b);
    }
    
    public static final int E(final CharSequence charSequence, final char[] array, int i, final boolean b) {
        i4.l.e((Object)charSequence, "<this>");
        i4.l.e((Object)array, "chars");
        if (!b && array.length == 1 && charSequence instanceof String) {
            return ((String)charSequence).indexOf((int)f.t(array), i);
        }
        final a0 k = ((a)new c(g.a(i, 0), x(charSequence))).k();
    Label_0067:
        while (((Iterator)k).hasNext()) {
            final int b2 = k.b();
            final char char1 = charSequence.charAt(b2);
            final int length = array.length;
            i = 0;
            while (true) {
                while (i < length) {
                    if (p4.c.d(array[i], char1, b)) {
                        i = 1;
                        if (i != 0) {
                            return b2;
                        }
                        continue Label_0067;
                    }
                    else {
                        ++i;
                    }
                }
                i = 0;
                continue;
            }
        }
        return -1;
    }
    
    public static final int F(final CharSequence charSequence, final char c, int n, final boolean b) {
        i4.l.e((Object)charSequence, "<this>");
        if (!b && charSequence instanceof String) {
            n = ((String)charSequence).lastIndexOf((int)c, n);
        }
        else {
            n = J(charSequence, new char[] { c }, n, b);
        }
        return n;
    }
    
    public static final int G(final CharSequence charSequence, final String s, int n, final boolean b) {
        i4.l.e((Object)charSequence, "<this>");
        i4.l.e((Object)s, "string");
        if (!b && charSequence instanceof String) {
            n = ((String)charSequence).lastIndexOf(s, n);
        }
        else {
            n = A(charSequence, (CharSequence)s, n, 0, b, true);
        }
        return n;
    }
    
    public static /* synthetic */ int H(final CharSequence charSequence, final char c, int x, boolean b, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            x = x(charSequence);
        }
        if ((n & 0x4) != 0x0) {
            b = false;
        }
        return F(charSequence, c, x, b);
    }
    
    public static final int J(final CharSequence charSequence, final char[] array, int c, final boolean b) {
        i4.l.e((Object)charSequence, "<this>");
        i4.l.e((Object)array, "chars");
        if (!b && array.length == 1 && charSequence instanceof String) {
            return ((String)charSequence).lastIndexOf((int)f.t(array), c);
        }
        char char1;
        int length;
        int n;
        int n2;
        int n3;
        for (c = g.c(c, x(charSequence)); -1 < c; --c) {
            char1 = charSequence.charAt(c);
            length = array.length;
            n = 0;
            n2 = 0;
            while (true) {
                n3 = n;
                if (n2 >= length) {
                    break;
                }
                if (c.d(array[n2], char1, b)) {
                    n3 = 1;
                    break;
                }
                ++n2;
            }
            if (n3 != 0) {
                return c;
            }
        }
        return -1;
    }
    
    public static final b K(final CharSequence charSequence) {
        i4.l.e((Object)charSequence, "<this>");
        return R(charSequence, new String[] { "\r\n", "\n", "\r" }, false, 0, 6, null);
    }
    
    public static final List L(final CharSequence charSequence) {
        i4.l.e((Object)charSequence, "<this>");
        return o4.c.d(K(charSequence));
    }
    
    private static final b M(final CharSequence charSequence, final String[] array, final int n, final boolean b, final int n2) {
        P(n2);
        return (b)new e(charSequence, n, n2, (h4.p)new h4.p(f.c(array), b) {
            final List f;
            final boolean g;
            
            public final u3.j a(final CharSequence charSequence, final int n) {
                i4.l.e((Object)charSequence, "$this$$receiver");
                final u3.j q = v(charSequence, (Collection)this.f, n, this.g, false);
                u3.j a;
                if (q != null) {
                    a = n.a(q.c(), (Object)((String)q.d()).length());
                }
                else {
                    a = null;
                }
                return a;
            }
        });
    }
    
    static /* synthetic */ b N(final CharSequence charSequence, final String[] array, int n, boolean b, int n2, final int n3, final Object o) {
        if ((n3 & 0x2) != 0x0) {
            n = 0;
        }
        if ((n3 & 0x4) != 0x0) {
            b = false;
        }
        if ((n3 & 0x8) != 0x0) {
            n2 = 0;
        }
        return M(charSequence, array, n, b, n2);
    }
    
    public static final boolean O(final CharSequence charSequence, final int n, final CharSequence charSequence2, final int n2, final int n3, final boolean b) {
        i4.l.e((Object)charSequence, "<this>");
        i4.l.e((Object)charSequence2, "other");
        if (n2 >= 0 && n >= 0 && n <= charSequence.length() - n3 && n2 <= charSequence2.length() - n3) {
            for (int i = 0; i < n3; ++i) {
                if (!p4.c.d(charSequence.charAt(n + i), charSequence2.charAt(n2 + i), b)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static final void P(final int n) {
        if (n >= 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static final b Q(final CharSequence charSequence, final String[] array, final boolean b, final int n) {
        i4.l.e((Object)charSequence, "<this>");
        i4.l.e((Object)array, "delimiters");
        return o4.c.c(N(charSequence, array, 0, b, n, 2, null), (h4.l)new h4.l(charSequence) {
            final CharSequence f;
            
            public final String a(final c c) {
                i4.l.e((Object)c, "it");
                return p.S(this.f, c);
            }
        });
    }
    
    public static /* synthetic */ b R(final CharSequence charSequence, final String[] array, boolean b, int n, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            b = false;
        }
        if ((n2 & 0x4) != 0x0) {
            n = 0;
        }
        return Q(charSequence, array, b, n);
    }
    
    public static final String S(final CharSequence charSequence, final c c) {
        i4.l.e((Object)charSequence, "<this>");
        i4.l.e((Object)c, "range");
        return charSequence.subSequence((int)c.o(), c.n() + 1).toString();
    }
    
    public static final String T(final String s, final char c, String substring) {
        i4.l.e((Object)s, "<this>");
        i4.l.e((Object)substring, "missingDelimiterValue");
        final int c2 = C((CharSequence)s, c, 0, false, 6, null);
        if (c2 != -1) {
            substring = s.substring(c2 + 1, s.length());
            i4.l.d((Object)substring, "substring(...)");
        }
        return substring;
    }
    
    public static final String U(final String s, final String s2, String substring) {
        i4.l.e((Object)s, "<this>");
        i4.l.e((Object)s2, "delimiter");
        i4.l.e((Object)substring, "missingDelimiterValue");
        final int d = D((CharSequence)s, s2, 0, false, 6, null);
        if (d != -1) {
            substring = s.substring(d + s2.length(), s.length());
            i4.l.d((Object)substring, "substring(...)");
        }
        return substring;
    }
    
    public static String X(final String s, final char c, String substring) {
        i4.l.e((Object)s, "<this>");
        i4.l.e((Object)substring, "missingDelimiterValue");
        final int h = H((CharSequence)s, c, 0, false, 6, null);
        if (h != -1) {
            substring = s.substring(h + 1, s.length());
            i4.l.d((Object)substring, "substring(...)");
        }
        return substring;
    }
    
    public static final String Z(final String s, final char c, String substring) {
        i4.l.e((Object)s, "<this>");
        i4.l.e((Object)substring, "missingDelimiterValue");
        final int c2 = C((CharSequence)s, c, 0, false, 6, null);
        if (c2 != -1) {
            substring = s.substring(0, c2);
            i4.l.d((Object)substring, "substring(...)");
        }
        return substring;
    }
    
    public static final String a0(final String s, final String s2, String substring) {
        i4.l.e((Object)s, "<this>");
        i4.l.e((Object)s2, "delimiter");
        i4.l.e((Object)substring, "missingDelimiterValue");
        final int d = D((CharSequence)s, s2, 0, false, 6, null);
        if (d != -1) {
            substring = s.substring(0, d);
            i4.l.d((Object)substring, "substring(...)");
        }
        return substring;
    }
    
    public static CharSequence d0(final CharSequence charSequence) {
        i4.l.e((Object)charSequence, "<this>");
        int n = charSequence.length() - 1;
        int i = 0;
        int n2 = 0;
        while (i <= n) {
            int n3;
            if (n2 == 0) {
                n3 = i;
            }
            else {
                n3 = n;
            }
            final boolean c = p4.b.c(charSequence.charAt(n3));
            if (n2 == 0) {
                if (!c) {
                    n2 = 1;
                }
                else {
                    ++i;
                }
            }
            else {
                if (!c) {
                    break;
                }
                --n;
            }
        }
        return charSequence.subSequence(i, n + 1);
    }
    
    public static final boolean r(final CharSequence charSequence, final char c, final boolean b) {
        i4.l.e((Object)charSequence, "<this>");
        return C(charSequence, c, 0, b, 2, null) >= 0;
    }
    
    public static final boolean s(final CharSequence charSequence, final CharSequence charSequence2, final boolean b) {
        i4.l.e((Object)charSequence, "<this>");
        i4.l.e((Object)charSequence2, "other");
        final boolean b2 = charSequence2 instanceof String;
        final boolean b3 = true;
        return (b2 ? (D(charSequence, (String)charSequence2, 0, b, 2, null) >= 0) : (B(charSequence, charSequence2, 0, charSequence.length(), b, false, 16, null) >= 0)) && b3;
    }
    
    private static final u3.j v(final CharSequence charSequence, final Collection collection, int n, final boolean b, final boolean b2) {
        final u3.j j = null;
        if (!b && collection.size() == 1) {
            final String s = (String)v3.l.B((Iterable)collection);
            if (!b2) {
                n = D(charSequence, s, n, false, 4, null);
            }
            else {
                n = p4.f.I(charSequence, s, n, false, 4, null);
            }
            u3.j a;
            if (n < 0) {
                a = j;
            }
            else {
                a = n.a((Object)n, (Object)s);
            }
            return a;
        }
        Object f;
        if (!b2) {
            f = new c(g.a(n, 0), charSequence.length());
        }
        else {
            f = g.f(g.c(n, x(charSequence)), 0);
        }
        String s4 = null;
        Label_0249: {
            if (charSequence instanceof String) {
                final int h = ((a)f).h();
                final int i = ((a)f).i();
                final int k = ((a)f).j();
                if (k <= 0 || (n = h) > i) {
                    if (k >= 0 || i > h) {
                        return null;
                    }
                    n = h;
                }
            Label_0174:
                while (true) {
                    while (true) {
                        for (final Object next : collection) {
                            final String s2 = (String)next;
                            if (o.l(s2, 0, (String)charSequence, n, s2.length(), b)) {
                                final String s3 = (String)next;
                                if (s3 != null) {
                                    s4 = s3;
                                    break Label_0249;
                                }
                                if (n != i) {
                                    n += k;
                                    continue Label_0174;
                                }
                                return null;
                            }
                        }
                        Object next = null;
                        continue;
                    }
                }
            }
            else {
                final int h2 = ((a)f).h();
                final int l = ((a)f).i();
                final int m = ((a)f).j();
                if (m <= 0 || (n = h2) > l) {
                    if (m >= 0 || l > h2) {
                        return null;
                    }
                    n = h2;
                }
            Label_0323:
                while (true) {
                    while (true) {
                        for (final Object next2 : collection) {
                            final String s5 = (String)next2;
                            if (O((CharSequence)s5, 0, charSequence, n, s5.length(), b)) {
                                final String s6 = (String)next2;
                                if (s6 != null) {
                                    s4 = s6;
                                    break Label_0249;
                                }
                                if (n != l) {
                                    n += m;
                                    continue Label_0323;
                                }
                                return null;
                            }
                        }
                        Object next2 = null;
                        continue;
                    }
                }
            }
        }
        return n.a((Object)n, (Object)s4);
    }
    
    public static final c w(final CharSequence charSequence) {
        i4.l.e((Object)charSequence, "<this>");
        return new c(0, charSequence.length() - 1);
    }
    
    public static final int x(final CharSequence charSequence) {
        i4.l.e((Object)charSequence, "<this>");
        return charSequence.length() - 1;
    }
    
    public static final int y(final CharSequence charSequence, final char c, int n, final boolean b) {
        i4.l.e((Object)charSequence, "<this>");
        if (!b && charSequence instanceof String) {
            n = ((String)charSequence).indexOf((int)c, n);
        }
        else {
            n = E(charSequence, new char[] { c }, n, b);
        }
        return n;
    }
    
    public static final int z(final CharSequence charSequence, final String s, int n, final boolean b) {
        i4.l.e((Object)charSequence, "<this>");
        i4.l.e((Object)s, "string");
        if (!b && charSequence instanceof String) {
            n = ((String)charSequence).indexOf(s, n);
        }
        else {
            n = B(charSequence, (CharSequence)s, n, charSequence.length(), b, false, 16, null);
        }
        return n;
    }
}
