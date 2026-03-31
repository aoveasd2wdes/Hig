package t2;

import q2.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class a
{
    private final a a;
    private final int b;
    private Set c;
    private List d;
    
    public a(final double n, final double n2, final double n3, final double n4) {
        this(new a(n, n2, n3, n4));
    }
    
    private a(final double n, final double n2, final double n3, final double n4, final int n5) {
        this(new a(n, n2, n3, n4), n5);
    }
    
    public a(final a a) {
        this(a, 0);
    }
    
    private a(final a a, final int b) {
        this.d = null;
        this.a = a;
        this.b = b;
    }
    
    private void c(final double n, final double n2, final a a) {
        final List d = this.d;
        if (d != null) {
            final a a2 = this.a;
            final double f = a2.f;
            final double n3 = dcmpg(n, a2.e);
            int n4;
            if (n2 < f) {
                if (n3 < 0) {
                    n4 = 0;
                }
                else {
                    n4 = 1;
                }
            }
            else if (n3 < 0) {
                n4 = 2;
            }
            else {
                n4 = 3;
            }
            ((a)d.get(n4)).c(n, n2, a);
            return;
        }
        if (this.c == null) {
            this.c = (Set)new LinkedHashSet();
        }
        this.c.add((Object)a);
        if (this.c.size() > 50 && this.b < 40) {
            this.h();
        }
    }
    
    private boolean d(final double n, final double n2, final a a) {
        final List d = this.d;
        int n3 = 0;
        if (d != null) {
            final a a2 = this.a;
            if (n2 < a2.f) {
                if (n >= a2.e) {
                    n3 = 1;
                }
            }
            else if (n < a2.e) {
                n3 = 2;
            }
            else {
                n3 = 3;
            }
            return ((a)d.get(n3)).d(n, n2, a);
        }
        final Set c = this.c;
        return c != null && c.remove((Object)a);
    }
    
    private void g(final a a, final Collection collection) {
        if (!this.a.e(a)) {
            return;
        }
        final List d = this.d;
        if (d != null) {
            final Iterator iterator = d.iterator();
            while (iterator.hasNext()) {
                ((a)iterator.next()).g(a, collection);
            }
        }
        else if (this.c != null) {
            if (a.b(this.a)) {
                collection.addAll((Collection)this.c);
            }
            else {
                for (final a a2 : this.c) {
                    if (a.c(a2.a())) {
                        collection.add((Object)a2);
                    }
                }
            }
        }
    }
    
    private void h() {
        final ArrayList d = new ArrayList(4);
        this.d = (List)d;
        final a a = this.a;
        ((List)d).add((Object)new a(a.a, a.e, a.b, a.f, this.b + 1));
        final List d2 = this.d;
        final a a2 = this.a;
        d2.add((Object)new a(a2.e, a2.c, a2.b, a2.f, this.b + 1));
        final List d3 = this.d;
        final a a3 = this.a;
        d3.add((Object)new a(a3.a, a3.e, a3.f, a3.d, this.b + 1));
        final List d4 = this.d;
        final a a4 = this.a;
        d4.add((Object)new a(a4.e, a4.c, a4.f, a4.d, this.b + 1));
        final Set c = this.c;
        this.c = null;
        for (final a a5 : c) {
            this.c(a5.a().a, a5.a().b, a5);
        }
    }
    
    public void a(final a a) {
        final b a2 = a.a();
        if (this.a.a(a2.a, a2.b)) {
            this.c(a2.a, a2.b, a);
        }
    }
    
    public void b() {
        this.d = null;
        final Set c = this.c;
        if (c != null) {
            c.clear();
        }
    }
    
    public boolean e(final a a) {
        final b a2 = a.a();
        return this.a.a(a2.a, a2.b) && this.d(a2.a, a2.b, a);
    }
    
    public Collection f(final a a) {
        final ArrayList list = new ArrayList();
        this.g(a, (Collection)list);
        return (Collection)list;
    }
    
    public interface a
    {
        b a();
    }
}
