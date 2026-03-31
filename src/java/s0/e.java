package s0;

import androidx.core.os.a$a;
import androidx.core.os.a;
import j0.o;
import android.graphics.Rect;
import android.view.ViewGroup;
import java.util.List;
import android.view.View;
import java.util.Collection;
import java.util.ArrayList;
import j0.m0;

public class e extends m0
{
    private static boolean B(final l l) {
        return !m0.l(l.A()) || !m0.l(l.B()) || !m0.l(l.C());
    }
    
    public Object A(final Object o) {
        if (o == null) {
            return null;
        }
        final p p = new p();
        p.f0((l)o);
        return p;
    }
    
    public void C(final Object o, final ArrayList list, final ArrayList list2) {
        final l l = (l)o;
        final boolean b = l instanceof p;
        int i = 0;
        int j = 0;
        if (b) {
            for (p p3 = (p)l; j < p3.i0(); ++j) {
                this.C(p3.h0(j), list, list2);
            }
        }
        else if (!B(l)) {
            final List d = l.D();
            if (d.size() == list.size() && d.containsAll((Collection)list)) {
                int size;
                if (list2 == null) {
                    size = 0;
                }
                else {
                    size = list2.size();
                }
                while (i < size) {
                    l.b((View)list2.get(i));
                    ++i;
                }
                for (int k = list.size() - 1; k >= 0; --k) {
                    l.R((View)list.get(k));
                }
            }
        }
    }
    
    public void a(final Object o, final View view) {
        if (o != null) {
            ((l)o).b(view);
        }
    }
    
    public void b(final Object o, final ArrayList list) {
        final l l = (l)o;
        if (l == null) {
            return;
        }
        final boolean b = l instanceof p;
        int i = 0;
        final int n = 0;
        if (b) {
            final p p2 = (p)l;
            for (int i2 = p2.i0(), j = n; j < i2; ++j) {
                this.b(p2.h0(j), list);
            }
        }
        else if (!B(l) && m0.l(l.D())) {
            while (i < list.size()) {
                l.b((View)list.get(i));
                ++i;
            }
        }
    }
    
    public void e(final ViewGroup viewGroup, final Object o) {
        n.a(viewGroup, (l)o);
    }
    
    public boolean g(final Object o) {
        return o instanceof l;
    }
    
    public Object h(final Object o) {
        l n;
        if (o != null) {
            n = ((l)o).n();
        }
        else {
            n = null;
        }
        return n;
    }
    
    public Object o(final Object o, Object o2, final Object o3) {
        l n0 = (l)o;
        final l l = (l)o2;
        final l i = (l)o3;
        if (n0 != null && l != null) {
            n0 = new p().f0(n0).f0(l).n0(1);
        }
        else if (n0 == null) {
            if (l != null) {
                n0 = l;
            }
            else {
                n0 = null;
            }
        }
        if (i != null) {
            o2 = new p();
            if (n0 != null) {
                ((p)o2).f0(n0);
            }
            ((p)o2).f0(i);
            return o2;
        }
        return n0;
    }
    
    public Object p(final Object o, final Object o2, final Object o3) {
        final p p3 = new p();
        if (o != null) {
            p3.f0((l)o);
        }
        if (o2 != null) {
            p3.f0((l)o2);
        }
        if (o3 != null) {
            p3.f0((l)o3);
        }
        return p3;
    }
    
    public void r(final Object o, final View view, final ArrayList list) {
        ((l)o).a((l$f)new l$f(this, view, list) {
            final View a;
            final ArrayList b;
            final e c;
            
            public void a(final l l) {
                l.Q((l$f)this);
                this.a.setVisibility(8);
                for (int size = this.b.size(), i = 0; i < size; ++i) {
                    ((View)this.b.get(i)).setVisibility(0);
                }
            }
            
            public void b(final l l) {
            }
            
            public void c(final l l) {
                l.Q((l$f)this);
                l.a((l$f)this);
            }
            
            public void d(final l l) {
            }
            
            public void e(final l l) {
            }
        });
    }
    
    public void s(final Object o, final Object o2, final ArrayList list, final Object o3, final ArrayList list2, final Object o4, final ArrayList list3) {
        ((l)o).a((l$f)new e$c(this, o2, list, o3, list2, o4, list3));
    }
    
    public void t(final Object o, final Rect rect) {
        if (o != null) {
            ((l)o).W((l$e)new l$e(this, rect) {
                final Rect a;
                final e b;
            });
        }
    }
    
    public void u(final Object o, final View view) {
        if (view != null) {
            final l l = (l)o;
            final Rect rect = new Rect();
            this.k(view, rect);
            l.W((l$e)new l$e(this, rect) {
                final Rect a;
                final e b;
            });
        }
    }
    
    public void v(final o o, final Object o2, final a a, final Runnable runnable) {
        final l l = (l)o2;
        a.b((a$a)new a$a(this, l) {
            final l a;
            final e b;
            
            public void a() {
                this.a.g();
            }
        });
        l.a((l$f)new l$f(this, runnable) {
            final Runnable a;
            final e b;
            
            public void a(final l l) {
                this.a.run();
            }
            
            public void b(final l l) {
            }
            
            public void c(final l l) {
            }
            
            public void d(final l l) {
            }
            
            public void e(final l l) {
            }
        });
    }
    
    public void y(final Object o, final View view, final ArrayList list) {
        final p p3 = (p)o;
        final List d = p3.D();
        d.clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            m0.f(d, (View)list.get(i));
        }
        d.add((Object)view);
        list.add((Object)view);
        this.b(p3, list);
    }
    
    public void z(final Object o, final ArrayList list, final ArrayList list2) {
        final p p3 = (p)o;
        if (p3 != null) {
            p3.D().clear();
            p3.D().addAll((Collection)list2);
            this.C(p3, list, list2);
        }
    }
}
