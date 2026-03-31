package s0;

import android.view.ViewGroup;
import android.util.AndroidRuntimeException;
import android.animation.TimeInterpolator;
import android.view.View;
import java.util.Iterator;
import java.util.ArrayList;

public class p extends l
{
    private ArrayList M;
    private boolean N;
    int O;
    boolean P;
    private int Q;
    
    public p() {
        this.M = new ArrayList();
        this.N = true;
        this.P = false;
        this.Q = 0;
    }
    
    private void g0(final l l) {
        this.M.add((Object)l);
        l.v = this;
    }
    
    private void p0() {
        final p.p$b p$b = new p.p$b(this);
        final Iterator iterator = this.M.iterator();
        while (iterator.hasNext()) {
            ((l)iterator.next()).a((l$f)p$b);
        }
        this.O = this.M.size();
    }
    
    public void O(final View view) {
        super.O(view);
        for (int size = this.M.size(), i = 0; i < size; ++i) {
            ((l)this.M.get(i)).O(view);
        }
    }
    
    public void S(final View view) {
        super.S(view);
        for (int size = this.M.size(), i = 0; i < size; ++i) {
            ((l)this.M.get(i)).S(view);
        }
    }
    
    protected void U() {
        if (this.M.isEmpty()) {
            this.b0();
            this.q();
            return;
        }
        this.p0();
        if (!this.N) {
            for (int i = 1; i < this.M.size(); ++i) {
                ((l)this.M.get(i - 1)).a((l$f)new p$a(this, (l)this.M.get(i)));
            }
            final l l = (l)this.M.get(0);
            if (l != null) {
                l.U();
            }
        }
        else {
            final Iterator iterator = this.M.iterator();
            while (iterator.hasNext()) {
                ((l)iterator.next()).U();
            }
        }
    }
    
    public void W(final l$e l$e) {
        super.W(l$e);
        this.Q |= 0x8;
        for (int size = this.M.size(), i = 0; i < size; ++i) {
            ((l)this.M.get(i)).W(l$e);
        }
    }
    
    public void Y(final g g) {
        super.Y(g);
        this.Q |= 0x4;
        if (this.M != null) {
            for (int i = 0; i < this.M.size(); ++i) {
                ((l)this.M.get(i)).Y(g);
            }
        }
    }
    
    public void Z(final o o) {
        super.Z(o);
        this.Q |= 0x2;
        for (int size = this.M.size(), i = 0; i < size; ++i) {
            ((l)this.M.get(i)).Z(o);
        }
    }
    
    String c0(final String s) {
        String s2 = super.c0(s);
        for (int i = 0; i < this.M.size(); ++i) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s2);
            sb.append("\n");
            final l l = (l)this.M.get(i);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s);
            sb2.append("  ");
            sb.append(l.c0(sb2.toString()));
            s2 = sb.toString();
        }
        return s2;
    }
    
    public p d0(final l$f l$f) {
        return (p)super.a(l$f);
    }
    
    public p e0(final View view) {
        for (int i = 0; i < this.M.size(); ++i) {
            ((l)this.M.get(i)).b(view);
        }
        return (p)super.b(view);
    }
    
    public p f0(final l l) {
        this.g0(l);
        final long g = super.g;
        if (g >= 0L) {
            l.V(g);
        }
        if ((this.Q & 0x1) != 0x0) {
            l.X(this.t());
        }
        if ((this.Q & 0x2) != 0x0) {
            this.x();
            l.Z((o)null);
        }
        if ((this.Q & 0x4) != 0x0) {
            l.Y(this.w());
        }
        if ((this.Q & 0x8) != 0x0) {
            l.W(this.s());
        }
        return this;
    }
    
    protected void g() {
        super.g();
        for (int size = this.M.size(), i = 0; i < size; ++i) {
            ((l)this.M.get(i)).g();
        }
    }
    
    public void h(final s s) {
        if (this.H(s.b)) {
            for (final l l : this.M) {
                if (l.H(s.b)) {
                    l.h(s);
                    s.c.add((Object)l);
                }
            }
        }
    }
    
    public l h0(final int n) {
        if (n >= 0 && n < this.M.size()) {
            return (l)this.M.get(n);
        }
        return null;
    }
    
    public int i0() {
        return this.M.size();
    }
    
    void j(final s s) {
        super.j(s);
        for (int size = this.M.size(), i = 0; i < size; ++i) {
            ((l)this.M.get(i)).j(s);
        }
    }
    
    public p j0(final l$f l$f) {
        return (p)super.Q(l$f);
    }
    
    public void k(final s s) {
        if (this.H(s.b)) {
            for (final l l : this.M) {
                if (l.H(s.b)) {
                    l.k(s);
                    s.c.add((Object)l);
                }
            }
        }
    }
    
    public p k0(final View view) {
        for (int i = 0; i < this.M.size(); ++i) {
            ((l)this.M.get(i)).R(view);
        }
        return (p)super.R(view);
    }
    
    public p l0(final long n) {
        super.V(n);
        if (super.g >= 0L) {
            final ArrayList m = this.M;
            if (m != null) {
                for (int size = m.size(), i = 0; i < size; ++i) {
                    ((l)this.M.get(i)).V(n);
                }
            }
        }
        return this;
    }
    
    public p m0(final TimeInterpolator timeInterpolator) {
        this.Q |= 0x1;
        final ArrayList m = this.M;
        if (m != null) {
            for (int size = m.size(), i = 0; i < size; ++i) {
                ((l)this.M.get(i)).X(timeInterpolator);
            }
        }
        return (p)super.X(timeInterpolator);
    }
    
    public l n() {
        final p p = (p)super.n();
        p.M = new ArrayList();
        for (int size = this.M.size(), i = 0; i < size; ++i) {
            p.g0(((l)this.M.get(i)).n());
        }
        return p;
    }
    
    public p n0(final int n) {
        if (n != 0) {
            if (n != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid parameter for TransitionSet ordering: ");
                sb.append(n);
                throw new AndroidRuntimeException(sb.toString());
            }
            this.N = false;
        }
        else {
            this.N = true;
        }
        return this;
    }
    
    public p o0(final long n) {
        return (p)super.a0(n);
    }
    
    protected void p(final ViewGroup viewGroup, final t t, final t t2, final ArrayList list, final ArrayList list2) {
        final long z = this.z();
        for (int size = this.M.size(), i = 0; i < size; ++i) {
            final l l = (l)this.M.get(i);
            if (z > 0L && (this.N || i == 0)) {
                final long z2 = l.z();
                if (z2 > 0L) {
                    l.a0(z2 + z);
                }
                else {
                    l.a0(z);
                }
            }
            l.p(viewGroup, t, t2, list, list2);
        }
    }
}
