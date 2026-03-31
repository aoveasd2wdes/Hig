package j0;

import android.view.View;
import java.util.Iterator;
import l.d;
import android.os.Bundle;
import i4.l;
import java.util.concurrent.CopyOnWriteArrayList;

public final class w
{
    private final b0 a;
    private final CopyOnWriteArrayList b;
    
    public w(final b0 a) {
        l.e((Object)a, "fragmentManager");
        this.a = a;
        this.b = new CopyOnWriteArrayList();
    }
    
    public final void a(final o o, final Bundle bundle, final boolean b) {
        l.e((Object)o, "f");
        final o c0 = this.a.c0();
        if (c0 != null) {
            final b0 c2 = c0.C();
            l.d((Object)c2, "parent.getParentFragmentManager()");
            c2.b0().a(o, bundle, true);
        }
        final Iterator iterator = this.b.iterator();
        if (iterator.hasNext()) {
            d.a(iterator.next());
            throw null;
        }
    }
    
    public final void b(final o o, final boolean b) {
        l.e((Object)o, "f");
        this.a.a0();
        throw null;
    }
    
    public final void c(final o o, final Bundle bundle, final boolean b) {
        l.e((Object)o, "f");
        final o c0 = this.a.c0();
        if (c0 != null) {
            final b0 c2 = c0.C();
            l.d((Object)c2, "parent.getParentFragmentManager()");
            c2.b0().c(o, bundle, true);
        }
        final Iterator iterator = this.b.iterator();
        if (iterator.hasNext()) {
            d.a(iterator.next());
            throw null;
        }
    }
    
    public final void d(final o o, final boolean b) {
        l.e((Object)o, "f");
        final o c0 = this.a.c0();
        if (c0 != null) {
            final b0 c2 = c0.C();
            l.d((Object)c2, "parent.getParentFragmentManager()");
            c2.b0().d(o, true);
        }
        final Iterator iterator = this.b.iterator();
        if (iterator.hasNext()) {
            d.a(iterator.next());
            throw null;
        }
    }
    
    public final void e(final o o, final boolean b) {
        l.e((Object)o, "f");
        final o c0 = this.a.c0();
        if (c0 != null) {
            final b0 c2 = c0.C();
            l.d((Object)c2, "parent.getParentFragmentManager()");
            c2.b0().e(o, true);
        }
        final Iterator iterator = this.b.iterator();
        if (iterator.hasNext()) {
            d.a(iterator.next());
            throw null;
        }
    }
    
    public final void f(final o o, final boolean b) {
        l.e((Object)o, "f");
        this.a.a0();
        throw null;
    }
    
    public final void g(final o o, final Bundle bundle, final boolean b) {
        l.e((Object)o, "f");
        final o c0 = this.a.c0();
        if (c0 != null) {
            final b0 c2 = c0.C();
            l.d((Object)c2, "parent.getParentFragmentManager()");
            c2.b0().g(o, bundle, true);
        }
        final Iterator iterator = this.b.iterator();
        if (iterator.hasNext()) {
            d.a(iterator.next());
            throw null;
        }
    }
    
    public final void h(final o o, final boolean b) {
        l.e((Object)o, "f");
        final o c0 = this.a.c0();
        if (c0 != null) {
            final b0 c2 = c0.C();
            l.d((Object)c2, "parent.getParentFragmentManager()");
            c2.b0().h(o, true);
        }
        final Iterator iterator = this.b.iterator();
        if (iterator.hasNext()) {
            d.a(iterator.next());
            throw null;
        }
    }
    
    public final void i(final o o, final Bundle bundle, final boolean b) {
        l.e((Object)o, "f");
        l.e((Object)bundle, "outState");
        final o c0 = this.a.c0();
        if (c0 != null) {
            final b0 c2 = c0.C();
            l.d((Object)c2, "parent.getParentFragmentManager()");
            c2.b0().i(o, bundle, true);
        }
        final Iterator iterator = this.b.iterator();
        if (iterator.hasNext()) {
            d.a(iterator.next());
            throw null;
        }
    }
    
    public final void j(final o o, final boolean b) {
        l.e((Object)o, "f");
        final o c0 = this.a.c0();
        if (c0 != null) {
            final b0 c2 = c0.C();
            l.d((Object)c2, "parent.getParentFragmentManager()");
            c2.b0().j(o, true);
        }
        final Iterator iterator = this.b.iterator();
        if (iterator.hasNext()) {
            d.a(iterator.next());
            throw null;
        }
    }
    
    public final void k(final o o, final boolean b) {
        l.e((Object)o, "f");
        final o c0 = this.a.c0();
        if (c0 != null) {
            final b0 c2 = c0.C();
            l.d((Object)c2, "parent.getParentFragmentManager()");
            c2.b0().k(o, true);
        }
        final Iterator iterator = this.b.iterator();
        if (iterator.hasNext()) {
            d.a(iterator.next());
            throw null;
        }
    }
    
    public final void l(final o o, final View view, final Bundle bundle, final boolean b) {
        l.e((Object)o, "f");
        l.e((Object)view, "v");
        final o c0 = this.a.c0();
        if (c0 != null) {
            final b0 c2 = c0.C();
            l.d((Object)c2, "parent.getParentFragmentManager()");
            c2.b0().l(o, view, bundle, true);
        }
        final Iterator iterator = this.b.iterator();
        if (iterator.hasNext()) {
            d.a(iterator.next());
            throw null;
        }
    }
    
    public final void m(final o o, final boolean b) {
        l.e((Object)o, "f");
        final o c0 = this.a.c0();
        if (c0 != null) {
            final b0 c2 = c0.C();
            l.d((Object)c2, "parent.getParentFragmentManager()");
            c2.b0().m(o, true);
        }
        final Iterator iterator = this.b.iterator();
        if (iterator.hasNext()) {
            d.a(iterator.next());
            throw null;
        }
    }
}
