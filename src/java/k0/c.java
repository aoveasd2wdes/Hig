package k0;

import java.util.Iterator;
import java.util.Map$Entry;
import java.util.LinkedHashMap;
import v3.c0;
import v3.i0;
import i4.g;
import java.util.Map;
import java.util.Set;
import android.view.ViewGroup;
import android.util.Log;
import j0.b0;
import i4.l;
import j0.o;

public final class c
{
    public static final c a;
    private static c b;
    
    static {
        a = new c();
        c.b = c.d;
    }
    
    private c() {
    }
    
    private final c b(o b) {
        while (b != null) {
            if (b.R()) {
                final b0 c = b.C();
                l.d((Object)c, "declaringFragment.parentFragmentManager");
                if (c.f0() != null) {
                    final c f0 = c.f0();
                    l.b((Object)f0);
                    return f0;
                }
            }
            b = b.B();
        }
        return c.b;
    }
    
    private final void c(final c c, final d d) {
        final o a = d.a();
        final String name = a.getClass().getName();
        if (c.a().contains((Object)k0.c.a.e)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Policy violation in ");
            sb.append(name);
            Log.d("FragmentStrictMode", sb.toString(), (Throwable)d);
        }
        c.b();
        if (c.a().contains((Object)k0.c.a.f)) {
            this.i(a, (Runnable)new k0.b(name, d));
        }
    }
    
    private static final void d(final String s, final d d) {
        l.e((Object)d, "$violation");
        final StringBuilder sb = new StringBuilder();
        sb.append("Policy violation with PENALTY_DEATH in ");
        sb.append(s);
        Log.e("FragmentStrictMode", sb.toString(), (Throwable)d);
        throw d;
    }
    
    private final void e(final d d) {
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("StrictMode violation in ");
            sb.append(d.a().getClass().getName());
            Log.d("FragmentManager", sb.toString(), (Throwable)d);
        }
    }
    
    public static final void f(final o o, final String s) {
        l.e((Object)o, "fragment");
        l.e((Object)s, "previousFragmentId");
        final k0.a a = new k0.a(o, s);
        final c a2 = c.a;
        a2.e((d)a);
        final c b = a2.b(o);
        if (b.a().contains((Object)k0.c.a.g) && a2.j(b, o.getClass(), ((d)a).getClass())) {
            a2.c(b, (d)a);
        }
    }
    
    public static final void g(final o o, final ViewGroup viewGroup) {
        l.e((Object)o, "fragment");
        l.e((Object)viewGroup, "container");
        final e e = new e(o, viewGroup);
        final c a = c.a;
        a.e((d)e);
        final c b = a.b(o);
        if (b.a().contains((Object)k0.c.a.m) && a.j(b, o.getClass(), ((d)e).getClass())) {
            a.c(b, (d)e);
        }
    }
    
    public static final void h(final o o, final o o2, final int n) {
        l.e((Object)o, "fragment");
        l.e((Object)o2, "expectedParentFragment");
        final f f = new f(o, o2, n);
        final c a = c.a;
        a.e((d)f);
        final c b = a.b(o);
        if (b.a().contains((Object)k0.c.a.i) && a.j(b, o.getClass(), ((d)f).getClass())) {
            a.c(b, (d)f);
        }
    }
    
    private final void i(final o o, final Runnable runnable) {
        if (!o.R()) {
            runnable.run();
            return;
        }
        o.C().a0();
        throw null;
    }
    
    private final boolean j(final c c, final Class clazz, final Class clazz2) {
        final Set set = (Set)c.c().get((Object)clazz.getName());
        return set == null || ((l.a((Object)clazz2.getSuperclass(), (Object)d.class) || !v3.l.s((Iterable)set, (Object)clazz2.getSuperclass())) && (set.contains((Object)clazz2) ^ true));
    }
    
    public enum a
    {
        e("PENALTY_LOG", 0), 
        f("PENALTY_DEATH", 1), 
        g("DETECT_FRAGMENT_REUSE", 2), 
        h("DETECT_FRAGMENT_TAG_USAGE", 3), 
        i("DETECT_WRONG_NESTED_HIERARCHY", 4), 
        j("DETECT_RETAIN_INSTANCE_USAGE", 5), 
        k("DETECT_SET_USER_VISIBLE_HINT", 6), 
        l("DETECT_TARGET_FRAGMENT_USAGE", 7), 
        m("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        
        private static final a[] n;
        
        static {
            n = a();
        }
        
        private a(final String s, final int n) {
        }
        
        private static final /* synthetic */ a[] a() {
            return new a[] { a.e, a.f, a.g, a.h, a.i, a.j, a.k, a.l, a.m };
        }
    }
    
    public interface b
    {
    }
    
    public static final class c
    {
        public static final a c;
        public static final c d;
        private final Set a;
        private final Map b;
        
        static {
            c = new a(null);
            d = new c(i0.b(), null, c0.d());
        }
        
        public c(final Set a, final b b, final Map map) {
            l.e((Object)a, "flags");
            l.e((Object)map, "allowedViolations");
            this.a = a;
            final LinkedHashMap b2 = new LinkedHashMap();
            for (final Map$Entry map$Entry : map.entrySet()) {
                ((Map)b2).put((Object)map$Entry.getKey(), (Object)map$Entry.getValue());
            }
            this.b = (Map)b2;
        }
        
        public final Set a() {
            return this.a;
        }
        
        public final b b() {
            return null;
        }
        
        public final Map c() {
            return this.b;
        }
        
        public static final class a
        {
            private a() {
            }
        }
    }
}
