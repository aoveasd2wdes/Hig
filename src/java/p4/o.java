package p4;

import m4.g;
import java.util.Iterator;
import m4.c;
import v3.a0;
import java.util.Collection;
import i4.l;

abstract class o extends n
{
    public static String h(final char[] array) {
        i4.l.e((Object)array, "<this>");
        return new String(array);
    }
    
    public static boolean i(final String s, final String s2, final boolean b) {
        i4.l.e((Object)s, "<this>");
        i4.l.e((Object)s2, "suffix");
        if (!b) {
            return s.endsWith(s2);
        }
        return l(s, s.length() - s2.length(), s2, 0, s2.length(), true);
    }
    
    public static boolean k(final CharSequence charSequence) {
        i4.l.e((Object)charSequence, "<this>");
        final int length = charSequence.length();
        boolean b = true;
        if (length != 0) {
            final c w = p.w(charSequence);
            boolean b2 = false;
            Label_0094: {
                if (!(w instanceof Collection) || !((Collection)w).isEmpty()) {
                    final Iterator iterator = ((Iterable)w).iterator();
                    while (iterator.hasNext()) {
                        if (!p4.b.c(charSequence.charAt(((a0)iterator).b()))) {
                            b2 = false;
                            break Label_0094;
                        }
                    }
                }
                b2 = true;
            }
            b = (b2 && b);
        }
        return b;
    }
    
    public static final boolean l(final String s, final int n, final String s2, final int n2, final int n3, final boolean b) {
        i4.l.e((Object)s, "<this>");
        i4.l.e((Object)s2, "other");
        boolean b2;
        if (!b) {
            b2 = s.regionMatches(n, s2, n2, n3);
        }
        else {
            b2 = s.regionMatches(b, n, s2, n2, n3);
        }
        return b2;
    }
    
    public static final String m(String string, final String s, final String s2, final boolean b) {
        i4.l.e((Object)string, "<this>");
        i4.l.e((Object)s, "oldValue");
        i4.l.e((Object)s2, "newValue");
        int n = 0;
        int z = p.z((CharSequence)string, s, 0, b);
        if (z < 0) {
            return string;
        }
        final int length = s.length();
        final int a = g.a(length, 1);
        final int n2 = string.length() - length + s2.length();
        if (n2 >= 0) {
            final StringBuilder sb = new StringBuilder(n2);
            int z2;
            int n3;
            do {
                sb.append((CharSequence)string, n, z);
                sb.append(s2);
                n3 = z + length;
                if (z >= string.length()) {
                    break;
                }
                z2 = p.z((CharSequence)string, s, z + a, b);
                n = n3;
            } while ((z = z2) > 0);
            sb.append((CharSequence)string, n3, string.length());
            string = sb.toString();
            i4.l.d((Object)string, "toString(...)");
            return string;
        }
        throw new OutOfMemoryError();
    }
    
    public static final boolean o(final String s, final String s2, final boolean b) {
        i4.l.e((Object)s, "<this>");
        i4.l.e((Object)s2, "prefix");
        if (!b) {
            return s.startsWith(s2);
        }
        return l(s, 0, s2, 0, s2.length(), b);
    }
}
