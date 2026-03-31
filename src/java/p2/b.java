package p2;

import h2.n;
import android.view.View;
import h2.m;
import f2.c;
import f2.c$g;
import f2.c$a;
import f2.c$k;
import f2.c$j;
import f2.c$f;

public class b extends p2.a implements c$f, c$j, c$k, c$a, c$g
{
    public b(final c c) {
        super(c);
    }
    
    public View a(final m m) {
        final a a = (a)super.e.get((Object)m);
        if (a != null && a.g != null) {
            return a.g.a(m);
        }
        return null;
    }
    
    public void b(final m m) {
        final a a = (a)super.e.get((Object)m);
        if (a != null && a.d != null) {
            a.d.b(m);
        }
    }
    
    public boolean b0(final m m) {
        final a a = (a)super.e.get((Object)m);
        return a != null && a.e != null && a.e.b0(m);
    }
    
    public View c(final m m) {
        final a a = (a)super.e.get((Object)m);
        if (a != null && a.g != null) {
            return a.g.c(m);
        }
        return null;
    }
    
    public void d(final m m) {
        final a a = (a)super.e.get((Object)m);
        if (a != null && a.f != null) {
            a.f.d(m);
        }
    }
    
    public void e(final m m) {
        final a a = (a)super.e.get((Object)m);
        if (a != null && a.f != null) {
            a.f.e(m);
        }
    }
    
    public void h(final m m) {
        final a a = (a)super.e.get((Object)m);
        if (a != null && a.f != null) {
            a.f.h(m);
        }
    }
    
    void i() {
        final c c = super.c;
        if (c != null) {
            c.C((c$f)this);
            super.c.D((c$g)this);
            super.c.G((c$j)this);
            super.c.H((c$k)this);
            super.c.r((c$a)this);
        }
    }
    
    public a j() {
        return new a();
    }
    
    protected void k(final m m) {
        m.g();
    }
    
    public void u0(final m m) {
        final a a = (a)super.e.get((Object)m);
        if (a != null && a.c != null) {
            a.c.u0(m);
        }
    }
    
    public class a extends a$b
    {
        private c$f c;
        private c$g d;
        private c$j e;
        private c$k f;
        private c$a g;
        final b h;
        
        public a(final b h) {
            super((p2.a)(this.h = h));
        }
        
        public m i(final n n) {
            final m b = this.h.c.b(n);
            super.a((Object)b);
            return b;
        }
        
        public boolean j(final m m) {
            return super.c((Object)m);
        }
        
        public void k(final c$f c) {
            this.c = c;
        }
        
        public void l(final c$g d) {
            this.d = d;
        }
        
        public void m(final c$j e) {
            this.e = e;
        }
        
        public void n(final c$k f) {
            this.f = f;
        }
    }
}
