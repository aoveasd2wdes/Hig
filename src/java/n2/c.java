package n2;

import java.util.Map;
import t2.a$a;
import java.util.Iterator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Collection;
import s2.b;

public class c extends a
{
    private static final b e;
    private int b;
    private final Collection c;
    private final t2.a d;
    
    static {
        e = new b(1.0);
    }
    
    public c() {
        this.b = 100;
        this.c = (Collection)new LinkedHashSet();
        this.d = new t2.a(0.0, 1.0, 0.0, 1.0);
    }
    
    private q2.a k(final q2.b b, double n) {
        n /= 2.0;
        final double a = b.a;
        final double b2 = b.b;
        return new q2.a(a - n, a + n, b2 - n, b2 + n);
    }
    
    private double l(final q2.b b, final q2.b b2) {
        final double a = b.a;
        final double a2 = b2.a;
        final double b3 = b.b;
        final double b4 = b2.b;
        return (a - a2) * (a - a2) + (b3 - b4) * (b3 - b4);
    }
    
    public int b() {
        return this.b;
    }
    
    public void d() {
        final t2.a d = this.d;
        synchronized (d) {
            this.c.clear();
            this.d.b();
        }
    }
    
    public Set e(final float n) {
        final double n2 = this.b / Math.pow(2.0, (double)(int)n) / 256.0;
        final HashSet set = new HashSet();
        final HashSet set2 = new HashSet();
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final t2.a d = this.d;
        synchronized (d) {
            for (final c.c$b c$b : this.m(this.d, n)) {
                if (((Set)set).contains((Object)c$b)) {
                    continue;
                }
                final Collection f = this.d.f(this.k(c$b.a(), n2));
                if (f.size() == 1) {
                    ((Set)set2).add((Object)c$b);
                    ((Set)set).add((Object)c$b);
                    ((Map)hashMap).put((Object)c$b, (Object)0.0);
                }
                else {
                    final g g = new g(n2.c.c$b.b(c$b).c());
                    ((Set)set2).add((Object)g);
                Label_0303_Outer:
                    for (final c.c$b c$b2 : f) {
                        final Double n3 = (Double)((Map)hashMap).get((Object)c$b2);
                        final double l = this.l(c$b2.a(), c$b.a());
                        while (true) {
                            Label_0327: {
                                if (n3 == null) {
                                    break Label_0327;
                                }
                                if (n3 < l) {
                                    continue Label_0303_Outer;
                                }
                                ((g)((Map)hashMap2).get((Object)c$b2)).b(n2.c.c$b.b(c$b2));
                                break Label_0327;
                                continue Label_0303_Outer;
                            }
                            ((Map)hashMap).put((Object)c$b2, (Object)l);
                            g.a(n2.c.c$b.b(c$b2));
                            ((Map)hashMap2).put((Object)c$b2, (Object)g);
                            continue;
                        }
                    }
                    ((Set)set).addAll(f);
                }
            }
            return (Set)set2;
        }
    }
    
    public boolean f(final m2.b b) {
        final c.c$b c$b = new c.c$b(b, (c$a)null);
        final t2.a d = this.d;
        synchronized (d) {
            final boolean remove = this.c.remove((Object)c$b);
            if (remove) {
                this.d.e((a$a)c$b);
            }
            return remove;
        }
    }
    
    public boolean h(final m2.b b) {
        final c.c$b c$b = new c.c$b(b, (c$a)null);
        final t2.a d = this.d;
        synchronized (d) {
            final boolean add = this.c.add((Object)c$b);
            if (add) {
                this.d.a((a$a)c$b);
            }
            return add;
        }
    }
    
    protected Collection m(final t2.a a, final float n) {
        return this.c;
    }
}
