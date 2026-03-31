package p4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import h4.l;

abstract class h extends g
{
    private static final l b(final String s) {
        Object f;
        if (((CharSequence)s).length() == 0) {
            f = h$a.f;
        }
        else {
            f = new h$b(s);
        }
        return (l)f;
    }
    
    private static final int c(final String s) {
        while (true) {
            for (int length = ((CharSequence)s).length(), i = 0; i < length; ++i) {
                if (b.c(((CharSequence)s).charAt(i)) ^ true) {
                    int length2 = i;
                    if (i == -1) {
                        length2 = s.length();
                    }
                    return length2;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    public static final String d(String string, String s) {
        i4.l.e((Object)string, "<this>");
        i4.l.e((Object)s, "newIndent");
        final List l = p.L((CharSequence)string);
        final ArrayList list = new ArrayList();
        for (final Object next : l) {
            if (f.k((CharSequence)next) ^ true) {
                ((Collection)list).add(next);
            }
        }
        final ArrayList list2 = new ArrayList(v3.l.m((Iterable)list, 10));
        final Iterator iterator2 = ((Iterable)list).iterator();
        while (iterator2.hasNext()) {
            ((Collection)list2).add((Object)c((String)iterator2.next()));
        }
        final Integer n = (Integer)v3.l.z((Iterable)list2);
        int n2 = 0;
        int intValue;
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        final int length = string.length();
        final int length2 = s.length();
        final int size = l.size();
        final l b = b(s);
        final int i = v3.l.i(l);
        final ArrayList list3 = new ArrayList();
        for (final Object next2 : l) {
            if (n2 < 0) {
                v3.l.l();
            }
            s = (String)next2;
            if ((n2 == 0 || n2 == i) && f.k((CharSequence)s)) {
                string = null;
            }
            else {
                final String e0 = r.e0(s, intValue);
                string = s;
                if (e0 != null) {
                    string = (String)b.p((Object)e0);
                    if (string == null) {
                        string = s;
                    }
                }
            }
            if (string != null) {
                ((Collection)list3).add((Object)string);
            }
            ++n2;
        }
        string = ((StringBuilder)v3.l.v((Iterable)list3, (Appendable)new StringBuilder(length + length2 * size), (CharSequence)"\n", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 124, (Object)null)).toString();
        i4.l.d((Object)string, "toString(...)");
        return string;
    }
    
    public static String e(final String s) {
        i4.l.e((Object)s, "<this>");
        return d(s, "");
    }
}
