package p;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;

public final class b implements Collection, Set
{
    private static final int[] i;
    private static final Object[] j;
    private static Object[] k;
    private static int l;
    private static Object[] m;
    private static int n;
    private int[] e;
    Object[] f;
    int g;
    private f h;
    
    static {
        i = new int[0];
        j = new Object[0];
    }
    
    public b() {
        this(0);
    }
    
    public b(final int n) {
        if (n == 0) {
            this.e = b.i;
            this.f = b.j;
        }
        else {
            this.h(n);
        }
        this.g = 0;
    }
    
    private void h(final int n) {
        Label_0143: {
            if (n == 8) {
                synchronized (b.class) {
                    final Object[] m = b.m;
                    if (m != null) {
                        this.f = m;
                        b.m = (Object[])m[0];
                        this.e = (int[])m[1];
                        m[0] = (m[1] = null);
                        --b.n;
                        return;
                    }
                    break Label_0143;
                }
            }
            if (n == 4) {
                synchronized (b.class) {
                    final Object[] k = b.k;
                    if (k != null) {
                        this.f = k;
                        b.k = (Object[])k[0];
                        this.e = (int[])k[1];
                        k[0] = (k[1] = null);
                        --b.l;
                        return;
                    }
                }
            }
        }
        this.e = new int[n];
        this.f = new Object[n];
    }
    
    private static void j(final int[] array, final Object[] array2, int i) {
        if (array.length == 8) {
            synchronized (b.class) {
                if (b.n < 10) {
                    array2[0] = b.m;
                    array2[1] = array;
                    --i;
                    while (i >= 2) {
                        array2[i] = null;
                        --i;
                    }
                    b.m = array2;
                    ++b.n;
                }
                return;
            }
        }
        if (array.length == 4) {
            synchronized (b.class) {
                if (b.l < 10) {
                    array2[0] = b.k;
                    array2[1] = array;
                    --i;
                    while (i >= 2) {
                        array2[i] = null;
                        --i;
                    }
                    b.k = array2;
                    ++b.l;
                }
            }
        }
    }
    
    private f k() {
        if (this.h == null) {
            this.h = (f)new b$a(this);
        }
        return this.h;
    }
    
    private int l(final Object o, final int n) {
        final int g = this.g;
        if (g == 0) {
            return -1;
        }
        final int a = c.a(this.e, g, n);
        if (a < 0) {
            return a;
        }
        if (o.equals(this.f[a])) {
            return a;
        }
        int n2;
        for (n2 = a + 1; n2 < g && this.e[n2] == n; ++n2) {
            if (o.equals(this.f[n2])) {
                return n2;
            }
        }
        for (int n3 = a - 1; n3 >= 0 && this.e[n3] == n; --n3) {
            if (o.equals(this.f[n3])) {
                return n3;
            }
        }
        return ~n2;
    }
    
    private int m() {
        final int g = this.g;
        if (g == 0) {
            return -1;
        }
        int a = c.a(this.e, g, 0);
        if (a < 0) {
            return a;
        }
        if (this.f[a] == null) {
            return a;
        }
        int n;
        for (n = a + 1; n < g && this.e[n] == 0; ++n) {
            if (this.f[n] == null) {
                return n;
            }
        }
        --a;
        while (a >= 0 && this.e[a] == 0) {
            if (this.f[a] == null) {
                return a;
            }
            --a;
        }
        return ~n;
    }
    
    public boolean add(final Object o) {
        int n;
        int hashCode;
        if (o == null) {
            n = this.m();
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
            n = this.l(o, hashCode);
        }
        if (n >= 0) {
            return false;
        }
        final int n2 = ~n;
        final int g = this.g;
        final int[] e = this.e;
        if (g >= e.length) {
            int n3 = 8;
            if (g >= 8) {
                n3 = (g >> 1) + g;
            }
            else if (g < 4) {
                n3 = 4;
            }
            final Object[] f = this.f;
            this.h(n3);
            final int[] e2 = this.e;
            if (e2.length > 0) {
                System.arraycopy((Object)e, 0, (Object)e2, 0, e.length);
                System.arraycopy((Object)f, 0, (Object)this.f, 0, f.length);
            }
            j(e, f, this.g);
        }
        final int g2 = this.g;
        if (n2 < g2) {
            final int[] e3 = this.e;
            final int n4 = n2 + 1;
            System.arraycopy((Object)e3, n2, (Object)e3, n4, g2 - n2);
            final Object[] f2 = this.f;
            System.arraycopy((Object)f2, n2, (Object)f2, n4, this.g - n2);
        }
        this.e[n2] = hashCode;
        this.f[n2] = o;
        ++this.g;
        return true;
    }
    
    public boolean addAll(final Collection collection) {
        this.i(this.g + collection.size());
        final Iterator iterator = collection.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= this.add(iterator.next());
        }
        return b;
    }
    
    public void clear() {
        final int g = this.g;
        if (g != 0) {
            j(this.e, this.f, g);
            this.e = b.i;
            this.f = b.j;
            this.g = 0;
        }
    }
    
    public boolean contains(final Object o) {
        return this.indexOf(o) >= 0;
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
        if (this == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set = (Set)o;
        if (this.size() != set.size()) {
            return false;
        }
        int i = 0;
        try {
            while (i < this.g) {
                if (!set.contains(this.o(i))) {
                    return false;
                }
                ++i;
            }
            return true;
        }
        catch (final NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public int hashCode() {
        final int[] e = this.e;
        final int g = this.g;
        int i = 0;
        int n = 0;
        while (i < g) {
            n += e[i];
            ++i;
        }
        return n;
    }
    
    public void i(int g) {
        final int[] e = this.e;
        if (e.length < g) {
            final Object[] f = this.f;
            this.h(g);
            g = this.g;
            if (g > 0) {
                System.arraycopy((Object)e, 0, (Object)this.e, 0, g);
                System.arraycopy((Object)f, 0, (Object)this.f, 0, this.g);
            }
            j(e, f, this.g);
        }
    }
    
    public int indexOf(final Object o) {
        int n;
        if (o == null) {
            n = this.m();
        }
        else {
            n = this.l(o, o.hashCode());
        }
        return n;
    }
    
    public boolean isEmpty() {
        return this.g <= 0;
    }
    
    public Iterator iterator() {
        return this.k().m().iterator();
    }
    
    public Object n(final int n) {
        final Object[] f = this.f;
        final Object o = f[n];
        int g = this.g;
        if (g <= 1) {
            j(this.e, f, g);
            this.e = b.i;
            this.f = b.j;
            this.g = 0;
        }
        else {
            final int[] e = this.e;
            final int length = e.length;
            int n2 = 8;
            if (length > 8 && g < e.length / 3) {
                if (g > 8) {
                    n2 = g + (g >> 1);
                }
                this.h(n2);
                --this.g;
                if (n > 0) {
                    System.arraycopy((Object)e, 0, (Object)this.e, 0, n);
                    System.arraycopy((Object)f, 0, (Object)this.f, 0, n);
                }
                final int g2 = this.g;
                if (n < g2) {
                    final int n3 = n + 1;
                    System.arraycopy((Object)e, n3, (Object)this.e, n, g2 - n);
                    System.arraycopy((Object)f, n3, (Object)this.f, n, this.g - n);
                }
            }
            else {
                --g;
                if (n < (this.g = g)) {
                    final int n4 = n + 1;
                    System.arraycopy((Object)e, n4, (Object)e, n, g - n);
                    final Object[] f2 = this.f;
                    System.arraycopy((Object)f2, n4, (Object)f2, n, this.g - n);
                }
                this.f[this.g] = null;
            }
        }
        return o;
    }
    
    public Object o(final int n) {
        return this.f[n];
    }
    
    public boolean remove(final Object o) {
        final int index = this.indexOf(o);
        if (index >= 0) {
            this.n(index);
            return true;
        }
        return false;
    }
    
    public boolean removeAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= this.remove(iterator.next());
        }
        return b;
    }
    
    public boolean retainAll(final Collection collection) {
        int i = this.g - 1;
        boolean b = false;
        while (i >= 0) {
            if (!collection.contains(this.f[i])) {
                this.n(i);
                b = true;
            }
            --i;
        }
        return b;
    }
    
    public int size() {
        return this.g;
    }
    
    public Object[] toArray() {
        final int g = this.g;
        final Object[] array = new Object[g];
        System.arraycopy((Object)this.f, 0, (Object)array, 0, g);
        return array;
    }
    
    public Object[] toArray(final Object[] array) {
        Object[] array2 = array;
        if (array.length < this.g) {
            array2 = (Object[])Array.newInstance((Class)array.getClass().getComponentType(), this.g);
        }
        System.arraycopy((Object)this.f, 0, (Object)array2, 0, this.g);
        final int length = array2.length;
        final int g = this.g;
        if (length > g) {
            array2[g] = null;
        }
        return array2;
    }
    
    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.g * 14);
        sb.append('{');
        for (int i = 0; i < this.g; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object o = this.o(i);
            if (o != this) {
                sb.append(o);
            }
            else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
