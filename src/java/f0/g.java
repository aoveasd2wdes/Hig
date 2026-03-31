package f0;

import u3.a;
import u3.q;
import b5.f0;
import java.io.Closeable;
import b5.f;
import y3.d;
import i4.l;
import b5.j0;
import b5.h;
import d0.b0;

public final class g extends b implements b0
{
    public g(final h h, final j0 j0, final c c) {
        l.e((Object)h, "fileSystem");
        l.e((Object)j0, "path");
        l.e((Object)c, "serializer");
        super(h, j0, c);
    }
    
    public Object c(Object c, d j) {
        Object o = null;
        Label_0049: {
            if (j instanceof g$a) {
                o = j;
                final int m = ((g$a)o).m;
                if ((m & Integer.MIN_VALUE) != 0x0) {
                    ((g$a)o).m = m + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new a4.d(this, j) {
                Object h;
                Object i;
                Object j;
                Object k;
                final g l;
                int m;
                
                public final Object s(final Object k) {
                    this.k = k;
                    this.m |= Integer.MIN_VALUE;
                    return this.l.c(null, (d)this);
                }
            };
        }
        final Object k = ((g$a)o).k;
        final Object c2 = z3.b.c();
        final int i = ((g$a)o).m;
        final d d = null;
        Object a = null;
        Label_0434: {
            Label_0316: {
                if (i != 0) {
                    if (i == 1) {
                        final Object o2 = ((g$a)o).j;
                        final f f = (f)((g$a)o).i;
                        final Closeable closeable = (Closeable)((g$a)o).h;
                        j = (d)o2;
                        try {
                            u3.l.b(k);
                            o = f;
                            break Label_0316;
                        }
                        finally {
                            c = closeable;
                            final Object o3;
                            a = o3;
                            break Label_0316;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u3.l.b(k);
                this.f();
                j = (d)this.g().j(this.h());
                try {
                    a = f0.a(f.w((f)j, 0L, 1, (Object)null));
                    Object o4 = null;
                    Label_0350: {
                        try {
                            final c l = this.i();
                            ((g$a)o).h = j;
                            ((g$a)o).i = j;
                            ((g$a)o).j = a;
                            ((g$a)o).m = 1;
                            c = l.c(c, (b5.c)a, (d)o);
                            if (c == c2) {
                                return c2;
                            }
                            c = (o = j);
                            final Object o3 = a;
                            a = c;
                            j = (d)o3;
                            ((f)o).flush();
                            a = c;
                            j = (d)o3;
                            final q a2 = q.a;
                            if (o3 != null) {
                                try {
                                    ((Closeable)o3).close();
                                }
                                finally {
                                    break Label_0350;
                                }
                            }
                            a = null;
                            break Label_0350;
                        }
                        finally {
                            c = j;
                            final d d2;
                            j = d2;
                            o4 = a;
                            a = j;
                            j = (d)o4;
                        }
                        Label_0347: {
                            if (j != null) {
                                try {
                                    ((Closeable)j).close();
                                }
                                finally {
                                    j = (d)c;
                                    final Throwable t;
                                    u3.a.a((Throwable)a, t);
                                    break Label_0347;
                                }
                            }
                        }
                        o4 = null;
                    }
                    if (a == null) {
                        j = (d)c;
                        l.b(o4);
                        j = (d)c;
                        final q a3 = q.a;
                        j = d;
                        a = a3;
                        if (c == null) {
                            break Label_0434;
                        }
                        try {
                            ((Closeable)c).close();
                        }
                        finally {
                            a = a3;
                            break Label_0434;
                        }
                    }
                    j = (d)c;
                    throw a;
                }
                finally {}
            }
            if (j != null) {
                try {
                    ((Closeable)j).close();
                }
                finally {
                    final Throwable t2;
                    u3.a.a((Throwable)c, t2);
                }
            }
            a = null;
            j = (d)c;
        }
        if (j == null) {
            l.b(a);
            return q.a;
        }
        throw j;
    }
}
