package f0;

import java.io.Closeable;
import java.io.FileNotFoundException;
import b5.f0;
import y3.d;
import i4.l;
import b5.j0;
import b5.h;
import d0.r;

public class b implements r
{
    private final h a;
    private final j0 b;
    private final c c;
    private final a d;
    
    public b(final h a, final j0 b, final c c) {
        l.e((Object)a, "fileSystem");
        l.e((Object)b, "path");
        l.e((Object)c, "serializer");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new a(false);
    }
    
    static /* synthetic */ Object j(b a, d d) {
        Object o = null;
        Label_0049: {
            if (d instanceof b$a) {
                o = d;
                final int l = ((b$a)o).l;
                if ((l & Integer.MIN_VALUE) != 0x0) {
                    ((b$a)o).l = l + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new b$a(a, d);
        }
        final Object j = ((b$a)o).j;
        final Object c = z3.b.c();
        final int i = ((b$a)o).l;
        final d d2 = null;
        d d3 = null;
        Label_0231: {
            if (i != 0) {
                if (i == 1) {
                    final Object b = ((b$a)o).i;
                    a = (b)((b$a)o).h;
                    try {
                        u3.l.b(j);
                        o = b;
                        a = (b)j;
                        break Label_0231;
                    }
                    finally {
                        break Label_0231;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u3.l.b(j);
            a.f();
            d = (d)a;
            try {
                Object b = f0.b(a.a.l(a.b));
                Label_0267: {
                    try {
                        final c c2 = a.c;
                        ((b$a)o).h = a;
                        ((b$a)o).i = b;
                        ((b$a)o).l = 1;
                        final Object b2 = c2.b((b5.d)b, (d)o);
                        if (b2 == c) {
                            return c;
                        }
                        a = (b)b2;
                        o = b;
                        b = d2;
                        if (o != null) {
                            try {
                                ((Closeable)o).close();
                            }
                            finally {}
                        }
                        break Label_0267;
                    }
                    finally {}
                    if (b != null) {
                        try {
                            ((Closeable)b).close();
                        }
                        finally {
                            try {
                                final Throwable t;
                                u3.a.a((Throwable)d, t);
                            }
                            catch (final FileNotFoundException ex) {}
                        }
                    }
                    final Object o2 = a;
                    b = d;
                    a = null;
                    d = (d)o2;
                }
                if (b == null) {
                    l.b((Object)a);
                    return a;
                }
                throw b;
            }
            catch (final FileNotFoundException ex2) {
                d3 = d;
            }
        }
        if (((b)d3).a.g(((b)d3).b)) {
            throw;
        }
        a = (b)((b)d3).c.a();
        return a;
    }
    
    public Object a(final d d) {
        return j(this, d);
    }
    
    public void close() {
        this.d.b(true);
    }
    
    protected final void f() {
        if (this.d.a() ^ true) {
            return;
        }
        throw new IllegalStateException("This scope has already been closed.".toString());
    }
    
    protected final h g() {
        return this.a;
    }
    
    protected final j0 h() {
        return this.b;
    }
    
    protected final c i() {
        return this.c;
    }
}
