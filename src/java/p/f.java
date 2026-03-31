package p;

import java.util.Map$Entry;
import java.util.NoSuchElementException;
import java.lang.reflect.Array;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;

abstract class f
{
    b a;
    c b;
    e c;
    
    public static boolean j(final Map map, final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!map.containsKey(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean k(final Set set, final Object o) {
        boolean b = true;
        if (set == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set2 = (Set)o;
        try {
            if (set.size() != set2.size() || !set.containsAll((Collection)set2)) {
                b = false;
            }
            return b;
        }
        catch (final NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    public static boolean o(final Map map, final Collection collection) {
        final int size = map.size();
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            map.remove(iterator.next());
        }
        return size != map.size();
    }
    
    public static boolean p(final Map map, final Collection collection) {
        final int size = map.size();
        final Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            if (!collection.contains(iterator.next())) {
                iterator.remove();
            }
        }
        return size != map.size();
    }
    
    protected abstract void a();
    
    protected abstract Object b(final int p0, final int p1);
    
    protected abstract Map c();
    
    protected abstract int d();
    
    protected abstract int e(final Object p0);
    
    protected abstract int f(final Object p0);
    
    protected abstract void g(final Object p0, final Object p1);
    
    protected abstract void h(final int p0);
    
    protected abstract Object i(final int p0, final Object p1);
    
    public Set l() {
        if (this.a == null) {
            this.a = new b();
        }
        return (Set)this.a;
    }
    
    public Set m() {
        if (this.b == null) {
            this.b = new c();
        }
        return (Set)this.b;
    }
    
    public Collection n() {
        if (this.c == null) {
            this.c = new e();
        }
        return (Collection)this.c;
    }
    
    public Object[] q(final int n) {
        final int d = this.d();
        final Object[] array = new Object[d];
        for (int i = 0; i < d; ++i) {
            array[i] = this.b(i, n);
        }
        return array;
    }
    
    public Object[] r(final Object[] array, final int n) {
        final int d = this.d();
        Object[] array2 = array;
        if (array.length < d) {
            array2 = (Object[])Array.newInstance((Class)array.getClass().getComponentType(), d);
        }
        for (int i = 0; i < d; ++i) {
            array2[i] = this.b(i, n);
        }
        if (array2.length > d) {
            array2[d] = null;
        }
        return array2;
    }
    
    final class a implements Iterator
    {
        final int e;
        int f;
        int g;
        boolean h;
        final f i;
        
        a(final f i, final int e) {
            this.i = i;
            this.h = false;
            this.e = e;
            this.f = i.d();
        }
        
        public boolean hasNext() {
            return this.g < this.f;
        }
        
        public Object next() {
            if (this.hasNext()) {
                final Object b = this.i.b(this.g, this.e);
                ++this.g;
                this.h = true;
                return b;
            }
            throw new NoSuchElementException();
        }
        
        public void remove() {
            if (this.h) {
                final int g = this.g - 1;
                this.g = g;
                --this.f;
                this.h = false;
                this.i.h(g);
                return;
            }
            throw new IllegalStateException();
        }
    }
    
    final class b implements Set
    {
        final f e;
        
        b(final f e) {
            this.e = e;
        }
        
        public boolean addAll(final Collection collection) {
            final int d = this.e.d();
            for (final Map$Entry map$Entry : collection) {
                this.e.g(map$Entry.getKey(), map$Entry.getValue());
            }
            return d != this.e.d();
        }
        
        public void clear() {
            this.e.a();
        }
        
        public boolean contains(final Object o) {
            if (!(o instanceof Map$Entry)) {
                return false;
            }
            final Map$Entry map$Entry = (Map$Entry)o;
            final int e = this.e.e(map$Entry.getKey());
            return e >= 0 && p.c.c(this.e.b(e, 1), map$Entry.getValue());
        }
        
        public boolean containsAll(final Collection collection) {
            final Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!this.contains(iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public boolean equals(final Object o) {
            return f.k((Set)this, o);
        }
        
        public boolean h(final Map$Entry map$Entry) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public int hashCode() {
            int i = this.e.d() - 1;
            int n = 0;
            while (i >= 0) {
                final Object b = this.e.b(i, 0);
                final Object b2 = this.e.b(i, 1);
                int hashCode;
                if (b == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = b.hashCode();
                }
                int hashCode2;
                if (b2 == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = b2.hashCode();
                }
                n += (hashCode ^ hashCode2);
                --i;
            }
            return n;
        }
        
        public boolean isEmpty() {
            return this.e.d() == 0;
        }
        
        public Iterator iterator() {
            return (Iterator)this.e.new d();
        }
        
        public boolean remove(final Object o) {
            throw new UnsupportedOperationException();
        }
        
        public boolean removeAll(final Collection collection) {
            throw new UnsupportedOperationException();
        }
        
        public boolean retainAll(final Collection collection) {
            throw new UnsupportedOperationException();
        }
        
        public int size() {
            return this.e.d();
        }
        
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }
        
        public Object[] toArray(final Object[] array) {
            throw new UnsupportedOperationException();
        }
    }
    
    final class c implements Set
    {
        final f e;
        
        c(final f e) {
            this.e = e;
        }
        
        public boolean add(final Object o) {
            throw new UnsupportedOperationException();
        }
        
        public boolean addAll(final Collection collection) {
            throw new UnsupportedOperationException();
        }
        
        public void clear() {
            this.e.a();
        }
        
        public boolean contains(final Object o) {
            return this.e.e(o) >= 0;
        }
        
        public boolean containsAll(final Collection collection) {
            return f.j(this.e.c(), collection);
        }
        
        @Override
        public boolean equals(final Object o) {
            return f.k((Set)this, o);
        }
        
        @Override
        public int hashCode() {
            int i = this.e.d() - 1;
            int n = 0;
            while (i >= 0) {
                final Object b = this.e.b(i, 0);
                int hashCode;
                if (b == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = b.hashCode();
                }
                n += hashCode;
                --i;
            }
            return n;
        }
        
        public boolean isEmpty() {
            return this.e.d() == 0;
        }
        
        public Iterator iterator() {
            return (Iterator)this.e.new a(0);
        }
        
        public boolean remove(final Object o) {
            final int e = this.e.e(o);
            if (e >= 0) {
                this.e.h(e);
                return true;
            }
            return false;
        }
        
        public boolean removeAll(final Collection collection) {
            return f.o(this.e.c(), collection);
        }
        
        public boolean retainAll(final Collection collection) {
            return f.p(this.e.c(), collection);
        }
        
        public int size() {
            return this.e.d();
        }
        
        public Object[] toArray() {
            return this.e.q(0);
        }
        
        public Object[] toArray(final Object[] array) {
            return this.e.r(array, 0);
        }
    }
    
    final class d implements Iterator, Map$Entry
    {
        int e;
        int f;
        boolean g;
        final f h;
        
        d(final f h) {
            this.h = h;
            this.g = false;
            this.e = h.d() - 1;
            this.f = -1;
        }
        
        public Map$Entry b() {
            if (this.hasNext()) {
                ++this.f;
                this.g = true;
                return (Map$Entry)this;
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public boolean equals(final Object o) {
            if (!this.g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            final boolean b = o instanceof Map$Entry;
            final boolean b2 = false;
            if (!b) {
                return false;
            }
            final Map$Entry map$Entry = (Map$Entry)o;
            boolean b3 = b2;
            if (p.c.c(map$Entry.getKey(), this.h.b(this.f, 0))) {
                b3 = b2;
                if (p.c.c(map$Entry.getValue(), this.h.b(this.f, 1))) {
                    b3 = true;
                }
            }
            return b3;
        }
        
        public Object getKey() {
            if (this.g) {
                return this.h.b(this.f, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        public Object getValue() {
            if (this.g) {
                return this.h.b(this.f, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        public boolean hasNext() {
            return this.f < this.e;
        }
        
        @Override
        public int hashCode() {
            if (this.g) {
                final f h = this.h;
                final int f = this.f;
                int hashCode = 0;
                final Object b = h.b(f, 0);
                final Object b2 = this.h.b(this.f, 1);
                int hashCode2;
                if (b == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = b.hashCode();
                }
                if (b2 != null) {
                    hashCode = b2.hashCode();
                }
                return hashCode2 ^ hashCode;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        public void remove() {
            if (this.g) {
                this.h.h(this.f);
                --this.f;
                --this.e;
                this.g = false;
                return;
            }
            throw new IllegalStateException();
        }
        
        public Object setValue(final Object o) {
            if (this.g) {
                return this.h.i(this.f, o);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getKey());
            sb.append("=");
            sb.append(this.getValue());
            return sb.toString();
        }
    }
    
    final class e implements Collection
    {
        final f e;
        
        e(final f e) {
            this.e = e;
        }
        
        public boolean add(final Object o) {
            throw new UnsupportedOperationException();
        }
        
        public boolean addAll(final Collection collection) {
            throw new UnsupportedOperationException();
        }
        
        public void clear() {
            this.e.a();
        }
        
        public boolean contains(final Object o) {
            return this.e.f(o) >= 0;
        }
        
        public boolean containsAll(final Collection collection) {
            final Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!this.contains(iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        public boolean isEmpty() {
            return this.e.d() == 0;
        }
        
        public Iterator iterator() {
            return (Iterator)this.e.new a(1);
        }
        
        public boolean remove(final Object o) {
            final int f = this.e.f(o);
            if (f >= 0) {
                this.e.h(f);
                return true;
            }
            return false;
        }
        
        public boolean removeAll(final Collection collection) {
            int d = this.e.d();
            int i = 0;
            boolean b = false;
            while (i < d) {
                int n = d;
                int n2 = i;
                if (collection.contains(this.e.b(i, 1))) {
                    this.e.h(i);
                    n2 = i - 1;
                    n = d - 1;
                    b = true;
                }
                i = n2 + 1;
                d = n;
            }
            return b;
        }
        
        public boolean retainAll(final Collection collection) {
            int d = this.e.d();
            int i = 0;
            boolean b = false;
            while (i < d) {
                int n = d;
                int n2 = i;
                if (!collection.contains(this.e.b(i, 1))) {
                    this.e.h(i);
                    n2 = i - 1;
                    n = d - 1;
                    b = true;
                }
                i = n2 + 1;
                d = n;
            }
            return b;
        }
        
        public int size() {
            return this.e.d();
        }
        
        public Object[] toArray() {
            return this.e.q(1);
        }
        
        public Object[] toArray(final Object[] array) {
            return this.e.r(array, 1);
        }
    }
}
