package w3;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.ListIterator;
import i4.l;
import java.util.List;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import v3.f;
import java.util.Collection;
import i4.g;
import java.io.Serializable;
import java.util.RandomAccess;
import v3.c;

public final class a extends c implements RandomAccess, Serializable
{
    private static final a.a$a k;
    private static final a l;
    private Object[] e;
    private int f;
    private int g;
    private boolean h;
    private final a i;
    private final a j;
    
    static {
        k = new a.a$a((g)null);
        final a i = new a(0);
        i.h = true;
        l = i;
    }
    
    public a(final int n) {
        this(b.d(n), 0, 0, false, null, null);
    }
    
    private a(final Object[] e, final int f, final int g, final boolean h, final a i, final a j) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        if (i != null) {
            ((AbstractList)this).modCount = ((AbstractList)i).modCount;
        }
    }
    
    private final int A(int n, final int n2, final Collection collection, final boolean b) {
        final a i = this.i;
        if (i != null) {
            n = i.A(n, n2, collection, b);
        }
        else {
            int j = 0;
            int n3 = 0;
            while (j < n2) {
                final Object[] e = this.e;
                final int n4 = n + j;
                if (collection.contains(e[n4]) == b) {
                    final Object[] e2 = this.e;
                    ++j;
                    e2[n3 + n] = e2[n4];
                    ++n3;
                }
                else {
                    ++j;
                }
            }
            final int n5 = n2 - n3;
            final Object[] e3 = this.e;
            v3.f.e(e3, e3, n + n3, n2 + n, this.g);
            final Object[] e4 = this.e;
            n = this.g;
            b.g(e4, n - n5, n);
            n = n5;
        }
        if (n > 0) {
            this.x();
        }
        this.g -= n;
        return n;
    }
    
    private final void n(final int n, final Collection collection, final int n2) {
        this.x();
        final a i = this.i;
        if (i != null) {
            i.n(n, collection, n2);
            this.e = this.i.e;
            this.g += n2;
        }
        else {
            this.v(n, n2);
            final Iterator iterator = collection.iterator();
            for (int j = 0; j < n2; ++j) {
                this.e[n + j] = iterator.next();
            }
        }
    }
    
    private final void o(final int n, final Object o) {
        this.x();
        final a i = this.i;
        if (i != null) {
            i.o(n, o);
            this.e = this.i.e;
            ++this.g;
        }
        else {
            this.v(n, 1);
            this.e[n] = o;
        }
    }
    
    private final void q() {
        final a j = this.j;
        if (j != null && ((AbstractList)j).modCount != ((AbstractList)this).modCount) {
            throw new ConcurrentModificationException();
        }
    }
    
    private final void r() {
        if (!this.w()) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    private final boolean s(final List list) {
        return b.a(this.e, this.f, this.g, list);
    }
    
    private final void t(int d) {
        if (d >= 0) {
            final Object[] e = this.e;
            if (d > e.length) {
                d = v3.b.e.d(e.length, d);
                this.e = b.e(this.e, d);
            }
            return;
        }
        throw new OutOfMemoryError();
    }
    
    private final void u(final int n) {
        this.t(this.g + n);
    }
    
    private final void v(final int n, final int n2) {
        this.u(n2);
        final Object[] e = this.e;
        v3.f.e(e, e, n + n2, n, this.f + this.g);
        this.g += n2;
    }
    
    private final boolean w() {
        if (!this.h) {
            final a j = this.j;
            if (j == null || !j.h) {
                return false;
            }
        }
        return true;
    }
    
    private final void x() {
        ++((AbstractList)this).modCount;
    }
    
    private final Object y(final int n) {
        this.x();
        final a i = this.i;
        if (i != null) {
            final Object y = i.y(n);
            --this.g;
            return y;
        }
        final Object[] e = this.e;
        final Object o = e[n];
        v3.f.e(e, e, n, n + 1, this.f + this.g);
        b.f(this.e, this.f + this.g - 1);
        --this.g;
        return o;
    }
    
    private final void z(int g, final int n) {
        if (n > 0) {
            this.x();
        }
        final a i = this.i;
        if (i != null) {
            i.z(g, n);
        }
        else {
            final Object[] e = this.e;
            v3.f.e(e, e, g, g + n, this.g);
            final Object[] e2 = this.e;
            g = this.g;
            b.g(e2, g - n, g);
        }
        this.g -= n;
    }
    
    public void add(final int n, final Object o) {
        this.r();
        this.q();
        v3.b.e.b(n, this.g);
        this.o(this.f + n, o);
    }
    
    public boolean add(final Object o) {
        this.r();
        this.q();
        this.o(this.f + this.g, o);
        return true;
    }
    
    public boolean addAll(final int n, final Collection collection) {
        i4.l.e((Object)collection, "elements");
        this.r();
        this.q();
        v3.b.e.b(n, this.g);
        final int size = collection.size();
        this.n(this.f + n, collection, size);
        return size > 0;
    }
    
    public boolean addAll(final Collection collection) {
        i4.l.e((Object)collection, "elements");
        this.r();
        this.q();
        final int size = collection.size();
        this.n(this.f + this.g, collection, size);
        return size > 0;
    }
    
    public void clear() {
        this.r();
        this.q();
        this.z(this.f, this.g);
    }
    
    public boolean equals(final Object o) {
        this.q();
        return o == this || (o instanceof List && this.s((List)o));
    }
    
    public Object get(final int n) {
        this.q();
        v3.b.e.a(n, this.g);
        return this.e[this.f + n];
    }
    
    public int h() {
        this.q();
        return this.g;
    }
    
    public int hashCode() {
        this.q();
        return b.b(this.e, this.f, this.g);
    }
    
    public Object i(final int n) {
        this.r();
        this.q();
        v3.b.e.a(n, this.g);
        return this.y(this.f + n);
    }
    
    public int indexOf(final Object o) {
        this.q();
        for (int i = 0; i < this.g; ++i) {
            if (i4.l.a(this.e[this.f + i], o)) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean isEmpty() {
        this.q();
        return this.g == 0;
    }
    
    public Iterator iterator() {
        return (Iterator)this.listIterator(0);
    }
    
    public int lastIndexOf(final Object o) {
        this.q();
        for (int i = this.g - 1; i >= 0; --i) {
            if (i4.l.a(this.e[this.f + i], o)) {
                return i;
            }
        }
        return -1;
    }
    
    public ListIterator listIterator() {
        return this.listIterator(0);
    }
    
    public ListIterator listIterator(final int n) {
        this.q();
        v3.b.e.b(n, this.g);
        return (ListIterator)new a.a$b(this, n);
    }
    
    public final List p() {
        if (this.i == null) {
            this.r();
            this.h = true;
            a l;
            if (this.g > 0) {
                l = this;
            }
            else {
                l = a.l;
            }
            return (List)l;
        }
        throw new IllegalStateException();
    }
    
    public boolean remove(final Object o) {
        this.r();
        this.q();
        final int index = this.indexOf(o);
        if (index >= 0) {
            this.remove(index);
        }
        return index >= 0;
    }
    
    public boolean removeAll(final Collection collection) {
        i4.l.e((Object)collection, "elements");
        this.r();
        this.q();
        final int f = this.f;
        final int g = this.g;
        boolean b = false;
        if (this.A(f, g, collection, false) > 0) {
            b = true;
        }
        return b;
    }
    
    public boolean retainAll(final Collection collection) {
        i4.l.e((Object)collection, "elements");
        this.r();
        this.q();
        final int f = this.f;
        final int g = this.g;
        boolean b = true;
        if (this.A(f, g, collection, true) <= 0) {
            b = false;
        }
        return b;
    }
    
    public Object set(final int n, final Object o) {
        this.r();
        this.q();
        v3.b.e.a(n, this.g);
        final Object[] e = this.e;
        final int f = this.f;
        final Object o2 = e[f + n];
        e[f + n] = o;
        return o2;
    }
    
    public List subList(final int n, final int n2) {
        v3.b.e.c(n, n2, this.g);
        final Object[] e = this.e;
        final int f = this.f;
        final boolean h = this.h;
        a j = this.j;
        if (j == null) {
            j = this;
        }
        return (List)new a(e, f + n, n2 - n, h, this, j);
    }
    
    public Object[] toArray() {
        this.q();
        final Object[] e = this.e;
        final int f = this.f;
        return v3.f.i(e, f, this.g + f);
    }
    
    public Object[] toArray(Object[] copyOfRange) {
        i4.l.e((Object)copyOfRange, "destination");
        this.q();
        final int length = copyOfRange.length;
        final int g = this.g;
        if (length < g) {
            final Object[] e = this.e;
            final int f = this.f;
            copyOfRange = Arrays.copyOfRange(e, f, g + f, (Class)copyOfRange.getClass());
            i4.l.d((Object)copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        final Object[] e2 = this.e;
        final int f2 = this.f;
        v3.f.e(e2, copyOfRange, 0, f2, g + f2);
        return v3.l.e(this.g, copyOfRange);
    }
    
    public String toString() {
        this.q();
        return b.c(this.e, this.f, this.g, (Collection)this);
    }
}
