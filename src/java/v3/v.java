package v3;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import i4.l;
import java.util.List;
import java.util.Collection;

abstract class v extends u
{
    public static List A(final Collection collection, final Iterable iterable) {
        l.e((Object)collection, "<this>");
        l.e((Object)iterable, "elements");
        if (iterable instanceof Collection) {
            final int size = collection.size();
            final Collection collection2 = (Collection)iterable;
            final ArrayList list = new ArrayList(size + collection2.size());
            list.addAll(collection);
            list.addAll(collection2);
            return (List)list;
        }
        final ArrayList list2 = new ArrayList(collection);
        v3.l.o((Collection)list2, iterable);
        return (List)list2;
    }
    
    public static Object B(final Iterable iterable) {
        l.e((Object)iterable, "<this>");
        if (iterable instanceof List) {
            return C((List)iterable);
        }
        final Iterator iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        final Object next = iterator.next();
        if (!iterator.hasNext()) {
            return next;
        }
        throw new IllegalArgumentException("Collection has more than one element.");
    }
    
    public static final Object C(final List list) {
        l.e((Object)list, "<this>");
        final int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }
    
    public static List D(final Iterable iterable, final Comparator comparator) {
        l.e((Object)iterable, "<this>");
        l.e((Object)comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            final List g = G(iterable);
            r.n(g, comparator);
            return g;
        }
        final Collection collection = (Collection)iterable;
        if (collection.size() <= 1) {
            return v3.l.F(iterable);
        }
        final Object[] array = collection.toArray(new Object[0]);
        i.k(array, comparator);
        return f.c(array);
    }
    
    public static final Collection E(final Iterable iterable, final Collection collection) {
        l.e((Object)iterable, "<this>");
        l.e((Object)collection, "destination");
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            collection.add(iterator.next());
        }
        return collection;
    }
    
    public static List F(final Iterable iterable) {
        l.e((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            final Collection collection = (Collection)iterable;
            final int size = collection.size();
            List list;
            if (size != 0) {
                if (size != 1) {
                    list = v3.l.H(collection);
                }
                else {
                    Object o;
                    if (iterable instanceof List) {
                        o = ((List)iterable).get(0);
                    }
                    else {
                        o = iterable.iterator().next();
                    }
                    list = v3.l.d(o);
                }
            }
            else {
                list = v3.l.h();
            }
            return list;
        }
        return n.k(G(iterable));
    }
    
    public static final List G(final Iterable iterable) {
        l.e((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            return v3.l.H((Collection)iterable);
        }
        return (List)E(iterable, (Collection)new ArrayList());
    }
    
    public static List H(final Collection collection) {
        l.e((Object)collection, "<this>");
        return (List)new ArrayList(collection);
    }
    
    public static Set I(final Iterable iterable) {
        l.e((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            final Collection collection = (Collection)iterable;
            final int size = collection.size();
            Set set;
            if (size != 0) {
                if (size != 1) {
                    set = (Set)E(iterable, (Collection)new LinkedHashSet(c0.a(collection.size())));
                }
                else {
                    Object o;
                    if (iterable instanceof List) {
                        o = ((List)iterable).get(0);
                    }
                    else {
                        o = iterable.iterator().next();
                    }
                    set = j0.a(o);
                }
            }
            else {
                set = i0.b();
            }
            return set;
        }
        return k0.c((Set)E(iterable, (Collection)new LinkedHashSet()));
    }
    
    public static boolean s(final Iterable iterable, final Object o) {
        l.e((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection)iterable).contains(o);
        }
        return t(iterable, o) >= 0;
    }
    
    public static final int t(final Iterable iterable, final Object o) {
        l.e((Object)iterable, "<this>");
        if (iterable instanceof List) {
            return ((List)iterable).indexOf(o);
        }
        final Iterator iterator = iterable.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n < 0) {
                v3.l.l();
            }
            if (l.a(o, next)) {
                return n;
            }
            ++n;
        }
        return -1;
    }
    
    public static final Appendable u(final Iterable iterable, final Appendable appendable, final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3, final int n, final CharSequence charSequence4, final h4.l l) {
        l.e((Object)iterable, "<this>");
        l.e((Object)appendable, "buffer");
        l.e((Object)charSequence, "separator");
        l.e((Object)charSequence2, "prefix");
        l.e((Object)charSequence3, "postfix");
        l.e((Object)charSequence4, "truncated");
        appendable.append(charSequence2);
        final Iterator iterator = iterable.iterator();
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n2;
            if (!iterator.hasNext()) {
                break;
            }
            final Object next = iterator.next();
            if (++n2 > 1) {
                appendable.append(charSequence);
            }
            if (n >= 0 && (n3 = n2) > n) {
                break;
            }
            p4.f.a(appendable, next, l);
        }
        if (n >= 0 && n3 > n) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }
    
    public static final String w(final Iterable iterable, final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3, final int n, final CharSequence charSequence4, final h4.l l) {
        l.e((Object)iterable, "<this>");
        l.e((Object)charSequence, "separator");
        l.e((Object)charSequence2, "prefix");
        l.e((Object)charSequence3, "postfix");
        l.e((Object)charSequence4, "truncated");
        final String string = ((StringBuilder)u(iterable, (Appendable)new StringBuilder(), charSequence, charSequence2, charSequence3, n, charSequence4, l)).toString();
        l.d((Object)string, "toString(...)");
        return string;
    }
    
    public static Object y(final List list) {
        l.e((Object)list, "<this>");
        if (!list.isEmpty()) {
            return list.get(v3.l.i(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
    
    public static Comparable z(final Iterable iterable) {
        l.e((Object)iterable, "<this>");
        final Iterator iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable)iterator.next();
        while (iterator.hasNext()) {
            final Comparable comparable2 = (Comparable)iterator.next();
            if (comparable.compareTo((Object)comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }
}
