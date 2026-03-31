package v3;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import m4.g;
import java.util.List;
import i4.l;

abstract class j extends i
{
    public static final boolean l(final Object[] array, final Object o) {
        l.e((Object)array, "<this>");
        return p(array, o) >= 0;
    }
    
    public static List m(final Object[] array, final int n) {
        l.e((Object)array, "<this>");
        if (n >= 0) {
            return v(array, g.a(array.length - n, 0));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Requested element count ");
        sb.append(n);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static final int n(final Object[] array) {
        l.e((Object)array, "<this>");
        return array.length - 1;
    }
    
    public static Object o(final Object[] array, final int n) {
        l.e((Object)array, "<this>");
        Object o;
        if (n >= 0 && n <= n(array)) {
            o = array[n];
        }
        else {
            o = null;
        }
        return o;
    }
    
    public static final int p(final Object[] array, final Object o) {
        l.e((Object)array, "<this>");
        final int n = 0;
        int i = 0;
        if (o == null) {
            while (i < array.length) {
                if (array[i] == null) {
                    return i;
                }
                ++i;
            }
        }
        else {
            for (int length = array.length, j = n; j < length; ++j) {
                if (l.a(o, array[j])) {
                    return j;
                }
            }
        }
        return -1;
    }
    
    public static final Appendable q(final byte[] array, final Appendable appendable, final CharSequence charSequence, CharSequence value, final CharSequence charSequence2, final int n, final CharSequence charSequence3, final h4.l l) {
        l.e((Object)array, "<this>");
        l.e((Object)appendable, "buffer");
        l.e((Object)charSequence, "separator");
        l.e(value, "prefix");
        l.e((Object)charSequence2, "postfix");
        l.e((Object)charSequence3, "truncated");
        appendable.append((CharSequence)value);
        final int length = array.length;
        int n2 = 0;
        int n3 = 0;
        int n4;
        while (true) {
            n4 = n3;
            if (n2 >= length) {
                break;
            }
            final byte b = array[n2];
            if (++n3 > 1) {
                appendable.append(charSequence);
            }
            if (n >= 0 && (n4 = n3) > n) {
                break;
            }
            if (l != null) {
                value = l.p((Object)b);
            }
            else {
                value = String.valueOf((int)b);
            }
            appendable.append((CharSequence)value);
            ++n2;
        }
        if (n >= 0 && n4 > n) {
            appendable.append(charSequence3);
        }
        appendable.append(charSequence2);
        return appendable;
    }
    
    public static final String r(final byte[] array, final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3, final int n, final CharSequence charSequence4, final h4.l l) {
        l.e((Object)array, "<this>");
        l.e((Object)charSequence, "separator");
        l.e((Object)charSequence2, "prefix");
        l.e((Object)charSequence3, "postfix");
        l.e((Object)charSequence4, "truncated");
        final String string = ((StringBuilder)q(array, (Appendable)new StringBuilder(), charSequence, charSequence2, charSequence3, n, charSequence4, l)).toString();
        l.d((Object)string, "toString(...)");
        return string;
    }
    
    public static char t(final char[] array) {
        l.e((Object)array, "<this>");
        final int length = array.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return array[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }
    
    public static Object u(final Object[] array) {
        l.e((Object)array, "<this>");
        Object o;
        if (array.length == 1) {
            o = array[0];
        }
        else {
            o = null;
        }
        return o;
    }
    
    public static final List v(final Object[] array, int i) {
        l.e((Object)array, "<this>");
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i == 0) {
            return v3.l.h();
        }
        final int length = array.length;
        if (i >= length) {
            return x(array);
        }
        if (i == 1) {
            return v3.l.d(array[length - 1]);
        }
        final ArrayList list = new ArrayList(i);
        for (i = length - i; i < length; ++i) {
            list.add(array[i]);
        }
        return (List)list;
    }
    
    public static final Collection w(final Object[] array, final Collection collection) {
        l.e((Object)array, "<this>");
        l.e((Object)collection, "destination");
        for (int length = array.length, i = 0; i < length; ++i) {
            collection.add(array[i]);
        }
        return collection;
    }
    
    public static final List x(final Object[] array) {
        l.e((Object)array, "<this>");
        final int length = array.length;
        List list;
        if (length != 0) {
            if (length != 1) {
                list = y(array);
            }
            else {
                list = v3.l.d(array[0]);
            }
        }
        else {
            list = v3.l.h();
        }
        return list;
    }
    
    public static final List y(final Object[] array) {
        l.e((Object)array, "<this>");
        return (List)new ArrayList(n.g(array));
    }
    
    public static final Set z(final Object[] array) {
        l.e((Object)array, "<this>");
        final int length = array.length;
        Set set;
        if (length != 0) {
            if (length != 1) {
                set = (Set)w(array, (Collection)new LinkedHashSet(c0.a(array.length)));
            }
            else {
                set = j0.a(array[0]);
            }
        }
        else {
            set = i0.b();
        }
        return set;
    }
}
