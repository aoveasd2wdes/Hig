package h0;

import java.util.Iterator;
import java.util.Set;
import u3.j;
import java.util.Arrays;
import java.util.Map$Entry;
import v3.c0;
import java.util.LinkedHashMap;
import i4.g;
import i4.l;
import java.util.Map;

public final class c extends f
{
    private final Map a;
    private final b b;
    
    public c(final Map a, final boolean b) {
        l.e((Object)a, "preferencesMap");
        this.a = a;
        this.b = new b(b);
    }
    
    public Map a() {
        final Set entrySet = this.a.entrySet();
        final LinkedHashMap linkedHashMap = new LinkedHashMap(m4.g.a(c0.a(v3.l.m((Iterable)entrySet, 10)), 16));
        for (final Map$Entry map$Entry : entrySet) {
            final Object value = map$Entry.getValue();
            j j;
            if (value instanceof byte[]) {
                final Object key = map$Entry.getKey();
                final byte[] array = (byte[])value;
                final byte[] copy = Arrays.copyOf(array, array.length);
                l.d((Object)copy, "copyOf(this, size)");
                j = new j(key, (Object)copy);
            }
            else {
                j = new j(map$Entry.getKey(), map$Entry.getValue());
            }
            ((Map)linkedHashMap).put(j.c(), j.d());
        }
        return h0.a.b((Map)linkedHashMap);
    }
    
    public Object b(final f$a f$a) {
        l.e((Object)f$a, "key");
        Object o2;
        final Object o = o2 = this.a.get((Object)f$a);
        if (o instanceof byte[]) {
            final byte[] array = (byte[])o;
            o2 = Arrays.copyOf(array, array.length);
            l.d(o2, "copyOf(this, size)");
        }
        return o2;
    }
    
    public final void e() {
        if (this.b.a() ^ true) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
    }
    
    public boolean equals(Object value) {
        final boolean b = value instanceof c;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final c c = (c)value;
        final Map a = c.a;
        if (a == this.a) {
            return true;
        }
        if (a.size() != this.a.size()) {
            return false;
        }
        final Map a2 = c.a;
        if (!a2.isEmpty()) {
            for (final Map$Entry map$Entry : a2.entrySet()) {
                value = this.a.get(map$Entry.getKey());
                boolean a3 = false;
                Label_0187: {
                    if (value != null) {
                        final Object value2 = map$Entry.getValue();
                        if (!(value2 instanceof byte[])) {
                            a3 = l.a(value2, value);
                            break Label_0187;
                        }
                        if (value instanceof byte[] && Arrays.equals((byte[])value2, (byte[])value)) {
                            a3 = true;
                            break Label_0187;
                        }
                    }
                    a3 = false;
                }
                if (!a3) {
                    return b2;
                }
            }
        }
        return true;
    }
    
    public final void f() {
        this.e();
        this.a.clear();
    }
    
    public final void g() {
        this.b.b(true);
    }
    
    public final void h(final f$b... array) {
        l.e((Object)array, "pairs");
        this.e();
        if (array.length <= 0) {
            return;
        }
        final f$b f$b = array[0];
        throw null;
    }
    
    public int hashCode() {
        final Iterator iterator = ((Iterable)this.a.entrySet()).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object value = ((Map$Entry)iterator.next()).getValue();
            int n2;
            if (value instanceof byte[]) {
                n2 = Arrays.hashCode((byte[])value);
            }
            else {
                n2 = value.hashCode();
            }
            n += n2;
        }
        return n;
    }
    
    public final Object i(final f$a f$a) {
        l.e((Object)f$a, "key");
        this.e();
        return this.a.remove((Object)f$a);
    }
    
    public final void j(final f$a f$a, final Object o) {
        l.e((Object)f$a, "key");
        this.k(f$a, o);
    }
    
    public final void k(final f$a f$a, Object a) {
        l.e((Object)f$a, "key");
        this.e();
        if (a == null) {
            this.i(f$a);
        }
        else {
            Map map;
            if (a instanceof Set) {
                map = this.a;
                a = a.a((Set)a);
            }
            else {
                if (a instanceof byte[]) {
                    final Map a2 = this.a;
                    final byte[] array = (byte[])a;
                    final byte[] copy = Arrays.copyOf(array, array.length);
                    l.d((Object)copy, "copyOf(this, size)");
                    a2.put((Object)f$a, (Object)copy);
                    return;
                }
                map = this.a;
            }
            map.put((Object)f$a, a);
        }
    }
    
    public String toString() {
        return v3.l.x((Iterable)this.a.entrySet(), (CharSequence)",\n", (CharSequence)"{\n", (CharSequence)"\n}", 0, (CharSequence)null, (h4.l)c$a.f, 24, (Object)null);
    }
}
