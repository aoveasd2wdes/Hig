package i1;

import android.app.Activity;
import h1.b;
import h1.a;
import java.util.Iterator;
import android.content.Intent;
import n1.h;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import k3.m;

public class n implements m
{
    private static n d;
    private final List c;
    
    private n() {
        this.c = (List)new CopyOnWriteArrayList();
    }
    
    public static n c() {
        synchronized (n.class) {
            if (n.d == null) {
                n.d = new n();
            }
            return n.d;
        }
    }
    
    private boolean e(final Context context) {
        boolean b = false;
        try {
            if (h.l().f(context) == 0) {
                b = true;
            }
            return b;
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {
            return b;
        }
    }
    
    public boolean a(final int n, final int n2, final Intent intent) {
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            if (((s)iterator.next()).b(n, n2)) {
                return true;
            }
        }
        return false;
    }
    
    public s b(final Context context, final boolean b, final g0 g0) {
        if (b) {
            return (s)new t(context, g0);
        }
        Object o;
        if (this.e(context)) {
            o = new i1.m(context, g0);
        }
        else {
            o = new t(context, g0);
        }
        return (s)o;
    }
    
    public void d(final Context context, final boolean b, final r0 r0, final a a) {
        this.b(context, b, null).a(r0, a);
    }
    
    public void f(final Context context, final h0 h0) {
        if (context == null) {
            h0.a(b.g);
        }
        this.b(context, false, null).d(h0);
    }
    
    public void g(final s s, final Activity activity, final r0 r0, final a a) {
        this.c.add((Object)s);
        s.e(activity, r0, a);
    }
    
    public void h(final s s) {
        this.c.remove((Object)s);
        s.c();
    }
}
