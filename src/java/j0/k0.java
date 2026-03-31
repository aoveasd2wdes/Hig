package j0;

import p.g;
import java.util.Iterator;
import android.view.View;
import java.util.List;
import s0.e;
import i4.l;
import p.a;

public final class k0
{
    public static final k0 a;
    public static final m0 b;
    public static final m0 c;
    
    static {
        final k0 k0 = a = new k0();
        b = (m0)new l0();
        c = k0.b();
    }
    
    private k0() {
    }
    
    public static final void a(final o o, final o o2, final boolean b, final a a, final boolean b2) {
        l.e((Object)o, "inFragment");
        l.e((Object)o2, "outFragment");
        l.e((Object)a, "sharedElements");
        if (b) {
            o2.t();
        }
        else {
            o.t();
        }
    }
    
    private final m0 b() {
        m0 m0;
        try {
            l.c((Object)e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            m0 = (m0)e.class.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final Exception ex) {
            m0 = null;
        }
        return m0;
    }
    
    public static final void c(final a a, final a a2) {
        l.e((Object)a, "<this>");
        l.e((Object)a2, "namedViews");
        for (int n = ((g)a).size() - 1; -1 < n; --n) {
            if (!((g)a2).containsKey(((g)a).m(n))) {
                ((g)a).k(n);
            }
        }
    }
    
    public static final void d(final List list, final int visibility) {
        l.e((Object)list, "views");
        final Iterator iterator = ((Iterable)list).iterator();
        while (iterator.hasNext()) {
            ((View)iterator.next()).setVisibility(visibility);
        }
    }
}
