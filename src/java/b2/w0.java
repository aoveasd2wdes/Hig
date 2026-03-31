package b2;

import java.util.AbstractCollection;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;

public abstract class w0 extends t0 implements List, RandomAccess
{
    private static final a1 f;
    
    static {
        f = (a1)new u0(x0.i, 0);
    }
    
    w0() {
    }
    
    public static w0 o() {
        return x0.i;
    }
    
    public static w0 p(final Collection collection) {
        if (collection instanceof t0) {
            w0 w2;
            final w0 w0 = w2 = ((t0)collection).k();
            if (w0.l()) {
                final Object[] array = w0.toArray();
                w2 = q(array, array.length);
            }
            return w2;
        }
        final Object[] array2 = collection.toArray();
        final int length = array2.length;
        for (int i = 0; i < length; ++i) {
            if (array2[i] == null) {
                final StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 9);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        return q(array2, length);
    }
    
    static w0 q(final Object[] array, final int n) {
        if (n == 0) {
            return x0.i;
        }
        return (w0)new x0(array, n);
    }
    
    public final void add(final int n, final Object o) {
        throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    public final boolean contains(final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = true;
        boolean b2;
        if (o == this) {
            b2 = b;
        }
        else {
            Label_0022: {
                if (o instanceof List) {
                    final List list = (List)o;
                    final int size = ((List)this).size();
                    if (size == list.size()) {
                        if (list instanceof RandomAccess) {
                            int n = 0;
                            while (true) {
                                b2 = b;
                                if (n >= size) {
                                    return b2;
                                }
                                if (!o0.a(((List)this).get(n), list.get(n))) {
                                    break;
                                }
                                ++n;
                            }
                        }
                        else {
                            final Iterator iterator = ((List)this).iterator();
                            final Iterator iterator2 = list.iterator();
                            while (iterator.hasNext()) {
                                if (!iterator2.hasNext()) {
                                    break Label_0022;
                                }
                                if (!o0.a(iterator.next(), iterator2.next())) {
                                    break Label_0022;
                                }
                            }
                            if (!iterator2.hasNext()) {
                                b2 = b;
                                return b2;
                            }
                        }
                    }
                }
            }
            b2 = false;
        }
        return b2;
    }
    
    public final int hashCode() {
        final int size = ((AbstractCollection)this).size();
        int i = 0;
        int n = 1;
        while (i < size) {
            n = n * 31 + ((List)this).get(i).hashCode();
            ++i;
        }
        return n;
    }
    
    public final int indexOf(final Object o) {
        final int n = -1;
        if (o == null) {
            return -1;
        }
        final int size = ((List)this).size();
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= size) {
                break;
            }
            if (o.equals(((List)this).get(n2))) {
                n3 = n2;
                break;
            }
            ++n2;
        }
        return n3;
    }
    
    public final w0 k() {
        return this;
    }
    
    public final int lastIndexOf(final Object o) {
        final int n = -1;
        if (o == null) {
            return -1;
        }
        int n2 = ((List)this).size() - 1;
        int n3;
        while (true) {
            n3 = n;
            if (n2 < 0) {
                break;
            }
            if (o.equals(((List)this).get(n2))) {
                n3 = n2;
                break;
            }
            --n2;
        }
        return n3;
    }
    
    int m(final Object[] array, int i) {
        int size;
        for (size = ((AbstractCollection)this).size(), i = 0; i < size; ++i) {
            array[i] = ((List)this).get(i);
        }
        return size;
    }
    
    public w0 n(final int n, int n2) {
        p0.c(n, n2, ((AbstractCollection)this).size());
        n2 -= n;
        if (n2 == ((AbstractCollection)this).size()) {
            return this;
        }
        if (n2 == 0) {
            return x0.i;
        }
        return (w0)new v0(this, n, n2);
    }
    
    public final a1 r(final int n) {
        p0.b(n, ((AbstractCollection)this).size(), "index");
        if (((AbstractCollection)this).isEmpty()) {
            return w0.f;
        }
        return (a1)new u0(this, n);
    }
    
    public final Object remove(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public final Object set(final int n, final Object o) {
        throw new UnsupportedOperationException();
    }
}
