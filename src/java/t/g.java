package t;

import java.util.concurrent.Callable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import android.content.pm.PackageManager$NameNotFoundException;
import androidx.core.graphics.d;
import android.os.CancellationSignal;
import android.graphics.Typeface;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import p.e;

abstract class g
{
    static final p.e a;
    private static final ExecutorService b;
    static final Object c;
    static final p.g d;
    
    static {
        a = new p.e(16);
        b = (ExecutorService)i.a("fonts-androidx", 10, 10000);
        c = new Object();
        d = new p.g();
    }
    
    private static String a(final f f, final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append(f.d());
        sb.append("-");
        sb.append(n);
        return sb.toString();
    }
    
    private static int b(final h.a a) {
        final int c = a.c();
        final int n = -3;
        final boolean b = true;
        if (c == 0) {
            final h.b[] b2 = a.b();
            int n2 = b ? 1 : 0;
            if (b2 != null) {
                if (b2.length == 0) {
                    n2 = (b ? 1 : 0);
                }
                else {
                    final int length = b2.length;
                    final int n3 = 0;
                    int n4 = 0;
                    while (true) {
                        n2 = n3;
                        if (n4 >= length) {
                            break;
                        }
                        final int b3 = b2[n4].b();
                        if (b3 != 0) {
                            int n5;
                            if (b3 < 0) {
                                n5 = n;
                            }
                            else {
                                n5 = b3;
                            }
                            return n5;
                        }
                        ++n4;
                    }
                }
            }
            return n2;
        }
        if (a.c() != 1) {
            return -3;
        }
        return -2;
    }
    
    static e c(final String s, final Context context, final f f, final int n) {
        final p.e a = g.a;
        final Typeface typeface = (Typeface)a.d((Object)s);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            final h.a e = t.e.e(context, f, null);
            final int b = b(e);
            if (b != 0) {
                return new e(b);
            }
            final Typeface b2 = androidx.core.graphics.d.b(context, (CancellationSignal)null, e.b(), n);
            if (b2 != null) {
                a.e((Object)s, (Object)b2);
                return new e(b2);
            }
            return new e(-3);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return new e(-1);
        }
    }
    
    static Typeface d(final Context context, final f f, final int n, final Executor executor, final a a) {
        final String a2 = a(f, n);
        final Typeface typeface = (Typeface)g.a.d((Object)a2);
        if (typeface != null) {
            a.b(new e(typeface));
            return typeface;
        }
        final g$b g$b = new g$b(a);
        final Object c = g.c;
        synchronized (c) {
            final p.g d = g.d;
            final ArrayList list = (ArrayList)d.get((Object)a2);
            if (list != null) {
                list.add((Object)g$b);
                return null;
            }
            final ArrayList list2 = new ArrayList();
            list2.add((Object)g$b);
            d.put((Object)a2, (Object)list2);
            monitorexit(c);
            final Callable callable = (Callable)new Callable(a2, context, f, n) {
                final String a;
                final Context b;
                final f c;
                final int d;
                
                public e a() {
                    try {
                        return g.c(this.a, this.b, this.c, this.d);
                    }
                    finally {
                        return new e(-3);
                    }
                }
            };
            Object b;
            if ((b = executor) == null) {
                b = g.b;
            }
            i.b((Executor)b, (Callable)callable, (v.a)new g$d(a2));
            return null;
        }
    }
    
    static Typeface e(final Context context, final f f, final a a, final int n, final int n2) {
        final String a2 = a(f, n);
        final Typeface typeface = (Typeface)g.a.d((Object)a2);
        if (typeface != null) {
            a.b(new e(typeface));
            return typeface;
        }
        if (n2 == -1) {
            final e c = c(a2, context, f, n);
            a.b(c);
            return c.a;
        }
        final Callable callable = (Callable)new Callable(a2, context, f, n) {
            final String a;
            final Context b;
            final f c;
            final int d;
            
            public e a() {
                return g.c(this.a, this.b, this.c, this.d);
            }
        };
        try {
            final e e = (e)i.c(g.b, (Callable)callable, n2);
            a.b(e);
            return e.a;
        }
        catch (final InterruptedException ex) {
            a.b(new e(-3));
            return null;
        }
    }
    
    static final class e
    {
        final Typeface a;
        final int b;
        
        e(final int b) {
            this.a = null;
            this.b = b;
        }
        
        e(final Typeface a) {
            this.a = a;
            this.b = 0;
        }
        
        boolean a() {
            return this.b == 0;
        }
    }
}
