package d0;

import u3.q;
import i4.w;
import h4.p;
import java.util.ArrayList;
import u3.a;
import u3.l;
import java.util.Iterator;
import z3.b;
import y3.d;
import java.util.List;

public abstract class g
{
    public static final a a;
    
    static {
        a = new a(null);
    }
    
    public static final class a
    {
        private a() {
        }
        
        private final Object c(List o, final m m, final d d) {
            Object o2 = null;
            Label_0054: {
                if (d instanceof g$a$b) {
                    final g$a$b g$a$b = (g$a$b)d;
                    final int l = g$a$b.l;
                    if ((l & Integer.MIN_VALUE) != 0x0) {
                        g$a$b.l = l + Integer.MIN_VALUE;
                        o2 = g$a$b;
                        break Label_0054;
                    }
                }
                o2 = new g$a$b(this, d);
            }
            final Object j = ((g$a$b)o2).j;
            final Object c = b.c();
            final int i = ((g$a$b)o2).l;
            Object h = null;
        Label_0369:
            while (true) {
                Label_0151: {
                    if (i == 0) {
                        break Label_0151;
                    }
                    Label_0135: {
                        if (i == 1) {
                            break Label_0135;
                        }
                        Label_0125: {
                            if (i != 2) {
                                break Label_0125;
                            }
                            Iterator iterator = (Iterator)((g$a$b)o2).i;
                            h = ((g$a$b)o2).h;
                            final g$a$b g$a$b2 = (g$a$b)o2;
                            final Iterator iterator2 = iterator;
                            final Object o3 = h;
                            try {
                                l.b(j);
                                break Label_0226;
                            }
                            finally {
                                final Object e = ((w)o3).e;
                                if (e == null) {
                                    final Throwable e2;
                                    ((w)o3).e = e2;
                                    o2 = g$a$b2;
                                    iterator = iterator2;
                                    h = o3;
                                }
                                else {
                                    i4.l.b(e);
                                    final Throwable e2;
                                    u3.a.a((Throwable)e, e2);
                                    o2 = g$a$b2;
                                    iterator = iterator2;
                                    h = o3;
                                }
                                while (iterator.hasNext()) {
                                    final h4.l k = (h4.l)iterator.next();
                                    ((g$a$b)o2).h = h;
                                    ((g$a$b)o2).i = iterator;
                                    ((g$a$b)o2).l = 2;
                                    if (k.p(o2) == c) {
                                        return c;
                                    }
                                }
                                break Label_0369;
                                o = ((g$a$b)o2).h;
                                l.b(j);
                                Label_0207: {
                                    break Label_0207;
                                    l.b(j);
                                    final Object h2 = new ArrayList();
                                    final g$a$c g$a$c = new g$a$c((List)o, (List)h2, (d)null);
                                    ((g$a$b)o2).h = h2;
                                    ((g$a$b)o2).l = 1;
                                    iftrue(Label_0204:)(m.a((p)g$a$c, (d)o2) != c);
                                    return c;
                                    Label_0204: {
                                        o = h2;
                                    }
                                    break Label_0207;
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                final w w = new w();
                                iterator = ((Iterable)o).iterator();
                                h = w;
                                continue;
                            }
                        }
                    }
                }
                continue;
            }
            final Throwable t = (Throwable)((w)h).e;
            if (t == null) {
                return q.a;
            }
            throw t;
        }
        
        public final p b(final List list) {
            i4.l.e(list, "migrations");
            return (p)new g$a$a(list, (d)null);
        }
    }
}
