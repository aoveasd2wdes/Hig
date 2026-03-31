package v4;

import r4.n0;
import y3.h;
import java.util.ArrayList;
import r4.l0;
import t4.r;
import r4.k0;
import t4.s;
import u3.q;
import u3.l;
import z3.b;
import r4.j0;
import a4.k;
import h4.p;
import y3.d;
import u4.f;
import t4.a;
import y3.g;

public abstract class e implements m
{
    public final g e;
    public final int f;
    public final a g;
    
    public e(final g e, final int f, final a g) {
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    static /* synthetic */ Object f(final e e, final f f, final d d) {
        final Object b = k0.b((p)new p(f, e, null) {
            int i;
            private Object j;
            final f k;
            final e l;
            
            public final d a(final Object j, final d d) {
                final p p2 = (p)new p(this.k, this.l, d) {
                    int i;
                    private Object j;
                    final f k;
                    final e l;
                };
                p2.j = j;
                return (d)p2;
            }
            
            public final Object s(final Object o) {
                final Object c = z3.b.c();
                final int i = this.i;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u3.l.b(o);
                }
                else {
                    u3.l.b(o);
                    final j0 j0 = (j0)this.j;
                    final f k = this.k;
                    final s m = this.l.m(j0);
                    this.i = 1;
                    if (u4.g.j(k, m, (d)this) == c) {
                        return c;
                    }
                }
                return q.a;
            }
            
            public final Object w(final j0 j0, final d d) {
                return ((e$a)this.a(j0, d)).s(q.a);
            }
        }, d);
        if (b == z3.b.c()) {
            return b;
        }
        return q.a;
    }
    
    public Object a(final f f, final d d) {
        return f(this, f, d);
    }
    
    public u4.e d(g a, int n, a g) {
        a = a.A(this.e);
        if (g == a.e) {
            final int f = this.f;
            if (f != -3) {
                if (n == -3) {
                    n = f;
                }
                else if (f != -2) {
                    if (n == -2) {
                        n = f;
                    }
                    else {
                        n += f;
                        if (n < 0) {
                            n = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            g = this.g;
        }
        if (i4.l.a((Object)a, (Object)this.e) && n == this.f && g == this.g) {
            return (u4.e)this;
        }
        return (u4.e)this.i(a, n, g);
    }
    
    protected String e() {
        return null;
    }
    
    protected abstract Object h(final r p0, final d p1);
    
    protected abstract e i(final g p0, final int p1, final a p2);
    
    public u4.e j() {
        return null;
    }
    
    public final p k() {
        return (p)new p(this, null) {
            int i;
            Object j;
            final e k;
            
            public final d a(final Object j, final d d) {
                final p p2 = (p)new p(this.k, d) {
                    int i;
                    Object j;
                    final e k;
                };
                p2.j = j;
                return (d)p2;
            }
            
            public final Object s(final Object o) {
                final Object c = b.c();
                final int i = this.i;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l.b(o);
                }
                else {
                    l.b(o);
                    final r r = (r)this.j;
                    final e k = this.k;
                    this.i = 1;
                    if (k.h(r, (d)this) == c) {
                        return c;
                    }
                }
                return q.a;
            }
            
            public final Object w(final r r, final d d) {
                return ((e$b)this.a(r, d)).s(q.a);
            }
        };
    }
    
    public final int l() {
        int f;
        if ((f = this.f) == -3) {
            f = -2;
        }
        return f;
    }
    
    public s m(final j0 j0) {
        return t4.p.c(j0, this.e, this.l(), this.g, l0.g, (h4.l)null, this.k(), 16, (Object)null);
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList(4);
        final String e = this.e();
        if (e != null) {
            list.add((Object)e);
        }
        if (this.e != h.e) {
            final StringBuilder sb = new StringBuilder();
            sb.append("context=");
            sb.append((Object)this.e);
            list.add((Object)sb.toString());
        }
        if (this.f != -3) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("capacity=");
            sb2.append(this.f);
            list.add((Object)sb2.toString());
        }
        if (this.g != a.e) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("onBufferOverflow=");
            sb3.append((Object)this.g);
            list.add((Object)sb3.toString());
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(n0.a((Object)this));
        sb4.append('[');
        sb4.append(v3.l.x((Iterable)list, (CharSequence)", ", null, null, 0, null, null, 62, null));
        sb4.append(']');
        return sb4.toString();
    }
}
