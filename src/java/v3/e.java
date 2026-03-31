package v3;

import java.util.NoSuchElementException;
import java.util.List;
import i4.l;
import java.util.Iterator;
import java.util.Collection;
import i4.g;

public final class e extends c
{
    public static final e.e$a h;
    private static final Object[] i;
    private int e;
    private Object[] f;
    private int g;
    
    static {
        h = new e.e$a((g)null);
        i = new Object[0];
    }
    
    public e() {
        this.f = v3.e.i;
    }
    
    private final void l(int n, final Collection collection) {
        Iterator iterator;
        for (iterator = collection.iterator(); n < this.f.length && iterator.hasNext(); ++n) {
            this.f[n] = iterator.next();
        }
        int e;
        for (e = this.e, n = 0; n < e && iterator.hasNext(); ++n) {
            this.f[n] = iterator.next();
        }
        this.g = this.size() + collection.size();
    }
    
    private final void m(int e) {
        final Object[] f = new Object[e];
        final Object[] f2 = this.f;
        v3.f.e(f2, f, 0, this.e, f2.length);
        final Object[] f3 = this.f;
        final int length = f3.length;
        e = this.e;
        v3.f.e(f3, f, length - e, 0, e);
        this.e = 0;
        this.f = f;
    }
    
    private final int n(int n) {
        if (n == 0) {
            n = j.n(this.f);
        }
        else {
            --n;
        }
        return n;
    }
    
    private final void o(final int n) {
        if (n < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        final Object[] f = this.f;
        if (n <= f.length) {
            return;
        }
        if (f == v3.e.i) {
            this.f = new Object[m4.g.a(n, 10)];
            return;
        }
        this.m(b.e.d(f.length, n));
    }
    
    private final int p(int n) {
        if (n == j.n(this.f)) {
            n = 0;
        }
        else {
            ++n;
        }
        return n;
    }
    
    private final int q(final int n) {
        int n2 = n;
        if (n < 0) {
            n2 = n + this.f.length;
        }
        return n2;
    }
    
    private final int r(final int n) {
        final Object[] f = this.f;
        int n2 = n;
        if (n >= f.length) {
            n2 = n - f.length;
        }
        return n2;
    }
    
    public void add(int n, final Object o) {
        b.e.b(n, this.size());
        if (n == this.size()) {
            this.k(o);
            return;
        }
        if (n == 0) {
            this.j(o);
            return;
        }
        this.o(this.size() + 1);
        final int r = this.r(this.e + n);
        if (n < this.size() + 1 >> 1) {
            final int n2 = this.n(r);
            final int n3 = this.n(this.e);
            n = this.e;
            if (n2 >= n) {
                final Object[] f = this.f;
                f[n3] = f[n];
                v3.f.e(f, f, n, n + 1, n2 + 1);
            }
            else {
                final Object[] f2 = this.f;
                v3.f.e(f2, f2, n - 1, n, f2.length);
                final Object[] f3 = this.f;
                f3[f3.length - 1] = f3[0];
                v3.f.e(f3, f3, 0, 1, n2 + 1);
            }
            this.f[n2] = o;
            this.e = n3;
        }
        else {
            n = this.r(this.e + this.size());
            final Object[] f4 = this.f;
            if (r < n) {
                v3.f.e(f4, f4, r + 1, r, n);
            }
            else {
                v3.f.e(f4, f4, 1, 0, n);
                final Object[] f5 = this.f;
                f5[0] = f5[f5.length - 1];
                v3.f.e(f5, f5, r + 1, r, f5.length - 1);
            }
            this.f[r] = o;
        }
        this.g = this.size() + 1;
    }
    
    public boolean add(final Object o) {
        this.k(o);
        return true;
    }
    
    public boolean addAll(int e, final Collection collection) {
        l.e((Object)collection, "elements");
        b.e.b(e, this.size());
        if (collection.isEmpty()) {
            return false;
        }
        if (e == this.size()) {
            return this.addAll(collection);
        }
        this.o(this.size() + collection.size());
        final int r = this.r(this.e + this.size());
        final int r2 = this.r(this.e + e);
        final int size = collection.size();
        if (e < this.size() + 1 >> 1) {
            final int e2 = this.e;
            e = e2 - size;
            if (r2 >= e2) {
                if (e >= 0) {
                    final Object[] f = this.f;
                    v3.f.e(f, f, e, e2, r2);
                }
                else {
                    final Object[] f2 = this.f;
                    e += f2.length;
                    final int n = f2.length - e;
                    if (n >= r2 - e2) {
                        v3.f.e(f2, f2, e, e2, r2);
                    }
                    else {
                        v3.f.e(f2, f2, e, e2, e2 + n);
                        final Object[] f3 = this.f;
                        v3.f.e(f3, f3, 0, this.e + n, r2);
                    }
                }
            }
            else {
                final Object[] f4 = this.f;
                v3.f.e(f4, f4, e, e2, f4.length);
                final Object[] f5 = this.f;
                if (size >= r2) {
                    v3.f.e(f5, f5, f5.length - size, 0, r2);
                }
                else {
                    v3.f.e(f5, f5, f5.length - size, 0, size);
                    final Object[] f6 = this.f;
                    v3.f.e(f6, f6, 0, size, r2);
                }
            }
            this.e = e;
            this.l(this.q(r2 - size), collection);
        }
        else {
            e = r2 + size;
            Label_0538: {
                if (r2 < r) {
                    final int n2 = size + r;
                    final Object[] f7 = this.f;
                    if (n2 > f7.length) {
                        if (e < f7.length) {
                            final int n3 = r - (n2 - f7.length);
                            v3.f.e(f7, f7, 0, n3, r);
                            final Object[] f8 = this.f;
                            v3.f.e(f8, f8, e, r2, n3);
                            break Label_0538;
                        }
                        e -= f7.length;
                    }
                    v3.f.e(f7, f7, e, r2, r);
                }
                else {
                    final Object[] f9 = this.f;
                    v3.f.e(f9, f9, size, 0, r);
                    final Object[] f10 = this.f;
                    if (e >= f10.length) {
                        v3.f.e(f10, f10, e - f10.length, r2, f10.length);
                    }
                    else {
                        v3.f.e(f10, f10, 0, f10.length - size, f10.length);
                        final Object[] f11 = this.f;
                        v3.f.e(f11, f11, e, r2, f11.length - size);
                    }
                }
            }
            this.l(r2, collection);
        }
        return true;
    }
    
    public boolean addAll(final Collection collection) {
        l.e((Object)collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.o(this.size() + collection.size());
        this.l(this.r(this.e + this.size()), collection);
        return true;
    }
    
    public void clear() {
        final int r = this.r(this.e + this.size());
        final int e = this.e;
        if (e < r) {
            v3.i.j(this.f, (Object)null, e, r);
        }
        else if (((Collection)this).isEmpty() ^ true) {
            final Object[] f = this.f;
            v3.i.j(f, (Object)null, this.e, f.length);
            v3.i.j(this.f, (Object)null, 0, r);
        }
        this.e = 0;
        this.g = 0;
    }
    
    public boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    public Object get(final int n) {
        b.e.a(n, this.size());
        return this.f[this.r(this.e + n)];
    }
    
    public int h() {
        return this.g;
    }
    
    public Object i(int n) {
        b.e.a(n, this.size());
        if (n == v3.l.i((List)this)) {
            return this.u();
        }
        if (n == 0) {
            return this.s();
        }
        final int r = this.r(this.e + n);
        final Object o = this.f[r];
        if (n < this.size() >> 1) {
            n = this.e;
            if (r >= n) {
                final Object[] f = this.f;
                v3.f.e(f, f, n + 1, n, r);
            }
            else {
                final Object[] f2 = this.f;
                v3.f.e(f2, f2, 1, 0, r);
                final Object[] f3 = this.f;
                f3[0] = f3[f3.length - 1];
                n = this.e;
                v3.f.e(f3, f3, n + 1, n, f3.length - 1);
            }
            final Object[] f4 = this.f;
            n = this.e;
            f4[n] = null;
            this.e = this.p(n);
        }
        else {
            n = this.r(this.e + v3.l.i((List)this));
            final Object[] f5 = this.f;
            if (r <= n) {
                v3.f.e(f5, f5, r, r + 1, n + 1);
            }
            else {
                v3.f.e(f5, f5, r, r + 1, f5.length);
                final Object[] f6 = this.f;
                f6[f6.length - 1] = f6[0];
                v3.f.e(f6, f6, 0, 1, n + 1);
            }
            this.f[n] = null;
        }
        this.g = this.size() - 1;
        return o;
    }
    
    public int indexOf(final Object o) {
        final int r = this.r(this.e + this.size());
        int i = this.e;
        if (i < r) {
            while (i < r) {
                if (l.a(o, this.f[i])) {
                    return i - this.e;
                }
                ++i;
            }
            return -1;
        }
        if (i >= r) {
            while (i < this.f.length) {
                if (l.a(o, this.f[i])) {
                    return i - this.e;
                }
                ++i;
            }
            for (int j = 0; j < r; ++j) {
                if (l.a(o, this.f[j])) {
                    i = j + this.f.length;
                    return i - this.e;
                }
            }
            return -1;
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    public final void j(final Object o) {
        this.o(this.size() + 1);
        final int n = this.n(this.e);
        this.e = n;
        this.f[n] = o;
        this.g = this.size() + 1;
    }
    
    public final void k(final Object o) {
        this.o(this.size() + 1);
        this.f[this.r(this.e + this.size())] = o;
        this.g = this.size() + 1;
    }
    
    public int lastIndexOf(final Object o) {
        int n = this.r(this.e + this.size());
        final int e = this.e;
        if (e < n) {
            --n;
            if (e > n) {
                return -1;
            }
            while (!l.a(o, this.f[n])) {
                if (n == e) {
                    return -1;
                }
                --n;
            }
        }
        else {
            if (e <= n) {
                return -1;
            }
            --n;
            while (-1 < n) {
                if (l.a(o, this.f[n])) {
                    n += this.f.length;
                    return n - this.e;
                }
                --n;
            }
            n = j.n(this.f);
            final int e2 = this.e;
            if (e2 > n) {
                return -1;
            }
            while (!l.a(o, this.f[n])) {
                if (n == e2) {
                    return -1;
                }
                --n;
            }
        }
        return n - this.e;
    }
    
    public boolean remove(final Object o) {
        final int index = this.indexOf(o);
        if (index == -1) {
            return false;
        }
        this.remove(index);
        return true;
    }
    
    public boolean removeAll(final Collection collection) {
        l.e((Object)collection, "elements");
        final boolean empty = this.isEmpty();
        final int n = 0;
        final boolean b = false;
        int n2 = 0;
        boolean b2 = b;
        if (!empty) {
            if (this.f.length == 0) {
                b2 = b;
            }
            else {
                final int r = this.r(this.e + this.size());
                int i = this.e;
                int n4;
                if (i < r) {
                    int n3 = i;
                    while (i < r) {
                        final Object o = this.f[i];
                        if (collection.contains(o) ^ true) {
                            this.f[n3] = o;
                            ++n3;
                        }
                        else {
                            n2 = 1;
                        }
                        ++i;
                    }
                    v3.i.j(this.f, (Object)null, n3, r);
                    n4 = n3;
                }
                else {
                    final int length = this.f.length;
                    int n5 = i;
                    n2 = 0;
                    while (i < length) {
                        final Object[] f = this.f;
                        final Object o2 = f[i];
                        f[i] = null;
                        if (collection.contains(o2) ^ true) {
                            this.f[n5] = o2;
                            ++n5;
                        }
                        else {
                            n2 = 1;
                        }
                        ++i;
                    }
                    n4 = this.r(n5);
                    for (int j = n; j < r; ++j) {
                        final Object[] f2 = this.f;
                        final Object o3 = f2[j];
                        f2[j] = null;
                        if (collection.contains(o3) ^ true) {
                            this.f[n4] = o3;
                            n4 = this.p(n4);
                        }
                        else {
                            n2 = 1;
                        }
                    }
                }
                b2 = (n2 != 0);
                if (n2 != 0) {
                    this.g = this.q(n4 - this.e);
                    b2 = (n2 != 0);
                }
            }
        }
        return b2;
    }
    
    public boolean retainAll(final Collection collection) {
        l.e((Object)collection, "elements");
        final boolean empty = this.isEmpty();
        final int n = 0;
        final boolean b = false;
        final int n2 = 0;
        int n3 = b ? 1 : 0;
        if (!empty) {
            if (this.f.length == 0) {
                n3 = (b ? 1 : 0);
            }
            else {
                final int r = this.r(this.e + this.size());
                int i = this.e;
                int n5;
                int n6;
                if (i < r) {
                    int n4 = i;
                    n5 = n2;
                    while (i < r) {
                        final Object o = this.f[i];
                        if (collection.contains(o)) {
                            this.f[n4] = o;
                            ++n4;
                        }
                        else {
                            n5 = 1;
                        }
                        ++i;
                    }
                    v3.i.j(this.f, (Object)null, n4, r);
                    n6 = n4;
                }
                else {
                    final int length = this.f.length;
                    int n7 = i;
                    n5 = 0;
                    while (i < length) {
                        final Object[] f = this.f;
                        final Object o2 = f[i];
                        f[i] = null;
                        if (collection.contains(o2)) {
                            this.f[n7] = o2;
                            ++n7;
                        }
                        else {
                            n5 = 1;
                        }
                        ++i;
                    }
                    n6 = this.r(n7);
                    for (int j = n; j < r; ++j) {
                        final Object[] f2 = this.f;
                        final Object o3 = f2[j];
                        f2[j] = null;
                        if (collection.contains(o3)) {
                            this.f[n6] = o3;
                            n6 = this.p(n6);
                        }
                        else {
                            n5 = 1;
                        }
                    }
                }
                n3 = n5;
                if (n5 != 0) {
                    this.g = this.q(n6 - this.e);
                    n3 = n5;
                }
            }
        }
        return n3 != 0;
    }
    
    public final Object s() {
        if (!this.isEmpty()) {
            final Object[] f = this.f;
            final int e = this.e;
            final Object o = f[e];
            f[e] = null;
            this.e = this.p(e);
            this.g = this.size() - 1;
            return o;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }
    
    public Object set(int r, final Object o) {
        b.e.a(r, this.size());
        r = this.r(this.e + r);
        final Object[] f = this.f;
        final Object o2 = f[r];
        f[r] = o;
        return o2;
    }
    
    public final Object t() {
        Object s;
        if (this.isEmpty()) {
            s = null;
        }
        else {
            s = this.s();
        }
        return s;
    }
    
    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }
    
    public Object[] toArray(Object[] a) {
        l.e((Object)a, "array");
        if (a.length < this.size()) {
            a = v3.g.a(a, this.size());
        }
        final int r = this.r(this.e + this.size());
        final int e = this.e;
        if (e < r) {
            v3.i.g(this.f, a, 0, e, r, 2, (Object)null);
        }
        else if (((Collection)this).isEmpty() ^ true) {
            final Object[] f = this.f;
            v3.f.e(f, a, 0, this.e, f.length);
            final Object[] f2 = this.f;
            v3.f.e(f2, a, f2.length - this.e, 0, r);
        }
        return v3.l.e(this.size(), a);
    }
    
    public final Object u() {
        if (!this.isEmpty()) {
            final int r = this.r(this.e + v3.l.i((List)this));
            final Object[] f = this.f;
            final Object o = f[r];
            f[r] = null;
            this.g = this.size() - 1;
            return o;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }
}
