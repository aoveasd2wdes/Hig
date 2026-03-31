package j0;

import android.view.ViewParent;
import i0.b;
import java.util.ListIterator;
import i4.t;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import android.view.View;
import u3.q;
import java.util.ArrayList;
import i4.l;
import i4.g;
import java.util.List;
import android.view.ViewGroup;

public abstract class r0
{
    public static final a f;
    private final ViewGroup a;
    private final List b;
    private final List c;
    private boolean d;
    private boolean e;
    
    static {
        f = new a(null);
    }
    
    public r0(final ViewGroup a) {
        l.e((Object)a, "container");
        this.a = a;
        this.b = (List)new ArrayList();
        this.c = (List)new ArrayList();
    }
    
    private final void f(final d.b b, final d.a a, final h0 h0) {
        final List b2 = this.b;
        synchronized (b2) {
            final o k = h0.k();
            l.d((Object)k, "fragmentStateManager.fragment");
            d d;
            if ((d = this.n(k)) == null) {
                if (h0.k().o) {
                    final o i = h0.k();
                    l.d((Object)i, "fragmentStateManager.fragment");
                    d = this.o(i);
                }
                else {
                    d = null;
                }
            }
            if (d != null) {
                d.p(b, a);
                return;
            }
            final r0$c r0$c = new r0$c(b, a, h0);
            this.b.add((Object)r0$c);
            ((d)r0$c).a((Runnable)new p0(this, r0$c));
            ((d)r0$c).a((Runnable)new q0(this, r0$c));
            final q a2 = q.a;
        }
    }
    
    private static final void g(final r0 r0, final r0$c r0$c) {
        l.e((Object)r0, "this$0");
        l.e((Object)r0$c, "$operation");
        if (r0.b.contains((Object)r0$c)) {
            final d.b h = ((d)r0$c).h();
            final View j = ((d)r0$c).i().J;
            l.d((Object)j, "operation.fragment.mView");
            h.b(j, r0.a);
        }
    }
    
    private static final void h(final r0 r0, final r0$c r0$c) {
        l.e((Object)r0, "this$0");
        l.e((Object)r0$c, "$operation");
        r0.b.remove((Object)r0$c);
        r0.c.remove((Object)r0$c);
    }
    
    private final d n(final o o) {
        for (final Object next : this.b) {
            final d d = (d)next;
            if (l.a((Object)d.i(), (Object)o) && !d.l()) {
                return (d)next;
            }
        }
        return null;
    }
    
    private final d o(final o o) {
        for (final Object next : this.c) {
            final d d = (d)next;
            if (l.a((Object)d.i(), (Object)o) && !d.l()) {
                return (d)next;
            }
        }
        return null;
    }
    
    public static final r0 t(final ViewGroup viewGroup, final b0 b0) {
        return r0.f.a(viewGroup, b0);
    }
    
    public static final r0 u(final ViewGroup viewGroup, final s0 s0) {
        return r0.f.b(viewGroup, s0);
    }
    
    private final void w(List f) {
        final int size = f.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            ((d)f.get(i)).q();
        }
        final ArrayList list = new ArrayList();
        final Iterator iterator = ((Iterable)f).iterator();
        while (iterator.hasNext()) {
            v3.l.o((Collection)list, (Iterable)((d)iterator.next()).g());
        }
        f = v3.l.F((Iterable)v3.l.I((Iterable)list));
        for (int size2 = f.size(), j = n; j < size2; ++j) {
            ((b)f.get(j)).f(this.a);
        }
    }
    
    private final void x() {
        for (final d d : this.b) {
            if (d.j() == r0.d.a.f) {
                final View h0 = d.i().H0();
                l.d((Object)h0, "fragment.requireView()");
                d.p(r0.d.b.e.b(h0.getVisibility()), r0.d.a.e);
            }
        }
    }
    
    public final void c(final d d) {
        l.e((Object)d, "operation");
        if (d.k()) {
            final d.b h = d.h();
            final View h2 = d.i().H0();
            l.d((Object)h2, "operation.fragment.requireView()");
            h.b(h2, this.a);
            d.r(false);
        }
    }
    
    public abstract void d(final List p0, final boolean p1);
    
    public void e(final List list) {
        l.e((Object)list, "operations");
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = ((Iterable)list).iterator();
        while (iterator.hasNext()) {
            v3.l.o((Collection)list2, (Iterable)((d)iterator.next()).g());
        }
        final List f = v3.l.F((Iterable)v3.l.I((Iterable)list2));
        final int size = f.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            ((b)f.get(i)).d(this.a);
        }
        for (int size2 = list.size(), j = 0; j < size2; ++j) {
            this.c((d)list.get(j));
        }
        final List f2 = v3.l.F((Iterable)list);
        for (int size3 = f2.size(), k = n; k < size3; ++k) {
            final d d = (d)f2.get(k);
            if (d.g().isEmpty()) {
                d.e();
            }
        }
    }
    
    public final void i(final d.b b, final h0 h0) {
        l.e((Object)b, "finalState");
        l.e((Object)h0, "fragmentStateManager");
        if (b0.l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append((Object)h0.k());
            Log.v("FragmentManager", sb.toString());
        }
        this.f(b, r0.d.a.f, h0);
    }
    
    public final void j(final h0 h0) {
        l.e((Object)h0, "fragmentStateManager");
        if (b0.l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append((Object)h0.k());
            Log.v("FragmentManager", sb.toString());
        }
        this.f(r0.d.b.h, r0.d.a.e, h0);
    }
    
    public final void k(final h0 h0) {
        l.e((Object)h0, "fragmentStateManager");
        if (b0.l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append((Object)h0.k());
            Log.v("FragmentManager", sb.toString());
        }
        this.f(r0.d.b.f, r0.d.a.g, h0);
    }
    
    public final void l(final h0 h0) {
        l.e((Object)h0, "fragmentStateManager");
        if (b0.l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append((Object)h0.k());
            Log.v("FragmentManager", sb.toString());
        }
        this.f(r0.d.b.g, r0.d.a.e, h0);
    }
    
    public final void m() {
        if (this.e) {
            return;
        }
        if (!((View)this.a).isAttachedToWindow()) {
            this.p();
            this.d = false;
            return;
        }
        final List b = this.b;
        synchronized (b) {
            if (this.b.isEmpty()) {
                final List h = v3.l.H((Collection)this.c);
                this.c.clear();
                for (final d d : h) {
                    if (b0.l0(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Cancelling operation ");
                        sb.append((Object)d);
                        sb.append(" with no incoming pendingOperations");
                        Log.v("FragmentManager", sb.toString());
                    }
                    d.d(this.a, false);
                    if (!d.m()) {
                        this.c.add((Object)d);
                    }
                }
            }
            else {
                final List h2 = v3.l.H((Collection)this.c);
                this.c.clear();
                for (final d d2 : h2) {
                    if (b0.l0(2)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: Cancelling operation ");
                        sb2.append((Object)d2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    d2.d(this.a, d2.i().o);
                    if (!d2.m()) {
                        this.c.add((Object)d2);
                    }
                }
                this.x();
                final List h3 = v3.l.H((Collection)this.b);
                if (h3.isEmpty()) {
                    return;
                }
                this.b.clear();
                this.c.addAll((Collection)h3);
                if (b0.l0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                this.d(h3, this.d);
                final t t = new t();
                final boolean b2 = true;
                t.e = true;
                final Iterator iterator3 = ((Iterable)h3).iterator();
                boolean b3 = true;
                while (iterator3.hasNext()) {
                    final d d3 = (d)iterator3.next();
                    boolean e = false;
                    Label_0546: {
                        if (((Collection)d3.g()).isEmpty() ^ true) {
                            final List g = d3.g();
                            boolean b4 = false;
                            Label_0535: {
                                if (!(g instanceof Collection) || !((Collection)g).isEmpty()) {
                                    final Iterator iterator4 = ((Iterable)g).iterator();
                                    while (iterator4.hasNext()) {
                                        if (!((b)iterator4.next()).b()) {
                                            b4 = false;
                                            break Label_0535;
                                        }
                                    }
                                }
                                b4 = true;
                            }
                            if (b4) {
                                e = true;
                                break Label_0546;
                            }
                        }
                        e = false;
                    }
                    t.e = e;
                    if (!d3.i().o) {
                        b3 = false;
                    }
                }
                boolean e2 = false;
                Label_0647: {
                    if (t.e) {
                        final ArrayList list = new ArrayList();
                        final Iterator iterator5 = ((Iterable)h3).iterator();
                        while (iterator5.hasNext()) {
                            v3.l.o((Collection)list, (Iterable)((d)iterator5.next()).g());
                        }
                        if (((Collection)list).isEmpty() ^ true) {
                            e2 = b2;
                            break Label_0647;
                        }
                    }
                    e2 = false;
                }
                t.e = e2;
                if (!b3) {
                    this.w(h3);
                    this.e(h3);
                }
                else if (e2) {
                    this.w(h3);
                    for (int size = h3.size(), i = 0; i < size; ++i) {
                        this.c((d)h3.get(i));
                    }
                }
                this.d = false;
                if (b0.l0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
            final q a = q.a;
        }
    }
    
    public final void p() {
        if (b0.l0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        final boolean attachedToWindow = ((View)this.a).isAttachedToWindow();
        final List b = this.b;
        synchronized (b) {
            this.x();
            this.w(this.b);
            for (final d d : v3.l.H((Collection)this.c)) {
                if (b0.l0(2)) {
                    String string;
                    if (attachedToWindow) {
                        string = "";
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append((Object)this.a);
                        sb.append(" is not attached to window. ");
                        string = sb.toString();
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(string);
                    sb2.append("Cancelling running operation ");
                    sb2.append((Object)d);
                    Log.v("FragmentManager", sb2.toString());
                }
                d.c(this.a);
            }
            for (final d d2 : v3.l.H((Collection)this.b)) {
                if (b0.l0(2)) {
                    String string2;
                    if (attachedToWindow) {
                        string2 = "";
                    }
                    else {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Container ");
                        sb3.append((Object)this.a);
                        sb3.append(" is not attached to window. ");
                        string2 = sb3.toString();
                    }
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("SpecialEffectsController: ");
                    sb4.append(string2);
                    sb4.append("Cancelling pending operation ");
                    sb4.append((Object)d2);
                    Log.v("FragmentManager", sb4.toString());
                }
                d2.c(this.a);
            }
            final q a = q.a;
        }
    }
    
    public final void q() {
        if (this.e) {
            if (b0.l0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.e = false;
            this.m();
        }
    }
    
    public final d.a r(final h0 h0) {
        l.e((Object)h0, "fragmentStateManager");
        final o k = h0.k();
        l.d((Object)k, "fragmentStateManager.fragment");
        final d n = this.n(k);
        Enum j = null;
        Enum i;
        if (n != null) {
            i = n.j();
        }
        else {
            i = null;
        }
        final d o = this.o(k);
        if (o != null) {
            j = o.j();
        }
        int n2;
        if (i == null) {
            n2 = -1;
        }
        else {
            n2 = r0.e.a[i.ordinal()];
        }
        if (n2 == -1 || n2 == 1) {
            i = j;
        }
        return (d.a)i;
    }
    
    public final ViewGroup s() {
        return this.a;
    }
    
    public final void v() {
        final List b = this.b;
        synchronized (b) {
            this.x();
            final List b2 = this.b;
            final ListIterator listIterator = b2.listIterator(b2.size());
            while (true) {
                d.b h;
                d.b g;
                d.b a;
                do {
                    final boolean hasPrevious = listIterator.hasPrevious();
                    boolean u = false;
                    final o o = null;
                    if (!hasPrevious) {
                        final Object previous = null;
                        final d d = (d)previous;
                        o i = o;
                        if (d != null) {
                            i = d.i();
                        }
                        if (i != null) {
                            u = i.U();
                        }
                        this.e = u;
                        final q a2 = q.a;
                        return;
                    }
                    final Object previous = listIterator.previous();
                    final d d2 = (d)previous;
                    final d.b.a e = r0.d.b.e;
                    final View j = d2.i().J;
                    l.d((Object)j, "operation.fragment.mView");
                    a = e.a(j);
                    h = d2.h();
                    g = r0.d.b.g;
                } while (h != g || a == g);
                continue;
            }
        }
    }
    
    public final void y(final boolean d) {
        this.d = d;
    }
    
    public static final class a
    {
        private a() {
        }
        
        public final r0 a(final ViewGroup viewGroup, final b0 b0) {
            l.e((Object)viewGroup, "container");
            l.e((Object)b0, "fragmentManager");
            final s0 e0 = b0.e0();
            l.d((Object)e0, "fragmentManager.specialEffectsControllerFactory");
            return this.b(viewGroup, e0);
        }
        
        public final r0 b(final ViewGroup viewGroup, final s0 s0) {
            l.e((Object)viewGroup, "container");
            l.e((Object)s0, "factory");
            final Object tag = ((View)viewGroup).getTag(i0.b.b);
            if (tag instanceof r0) {
                return (r0)tag;
            }
            final r0 a = s0.a(viewGroup);
            l.d((Object)a, "factory.createController(container)");
            ((View)viewGroup).setTag(i0.b.b, (Object)a);
            return a;
        }
    }
    
    public abstract static class b
    {
        private final boolean a;
        private boolean b;
        private boolean c;
        
        public final void a(final ViewGroup viewGroup) {
            l.e((Object)viewGroup, "container");
            if (!this.c) {
                this.c(viewGroup);
            }
            this.c = true;
        }
        
        public boolean b() {
            return this.a;
        }
        
        public abstract void c(final ViewGroup p0);
        
        public abstract void d(final ViewGroup p0);
        
        public void e(final ViewGroup viewGroup) {
            l.e((Object)viewGroup, "container");
        }
        
        public final void f(final ViewGroup viewGroup) {
            l.e((Object)viewGroup, "container");
            if (!this.b) {
                this.e(viewGroup);
            }
            this.b = true;
        }
    }
    
    public abstract static class d
    {
        private b a;
        private a b;
        private final o c;
        private final List d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private final List j;
        private final List k;
        
        public d(final b a, final a b, final o c) {
            l.e((Object)a, "finalState");
            l.e((Object)b, "lifecycleImpact");
            l.e((Object)c, "fragment");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = (List)new ArrayList();
            this.i = true;
            final ArrayList list = new ArrayList();
            this.j = (List)list;
            this.k = (List)list;
        }
        
        public final void a(final Runnable runnable) {
            l.e((Object)runnable, "listener");
            this.d.add((Object)runnable);
        }
        
        public final void b(final r0.b b) {
            l.e((Object)b, "effect");
            this.j.add((Object)b);
        }
        
        public final void c(final ViewGroup viewGroup) {
            l.e((Object)viewGroup, "container");
            this.h = false;
            if (this.e) {
                return;
            }
            this.e = true;
            if (this.j.isEmpty()) {
                this.e();
            }
            else {
                final Iterator iterator = ((Iterable)v3.l.F((Iterable)this.k)).iterator();
                while (iterator.hasNext()) {
                    ((r0.b)iterator.next()).a(viewGroup);
                }
            }
        }
        
        public final void d(final ViewGroup viewGroup, final boolean b) {
            l.e((Object)viewGroup, "container");
            if (this.e) {
                return;
            }
            if (b) {
                this.g = true;
            }
            this.c(viewGroup);
        }
        
        public void e() {
            this.h = false;
            if (this.f) {
                return;
            }
            if (b0.l0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append((Object)this);
                sb.append(" has called complete.");
                Log.v("FragmentManager", sb.toString());
            }
            this.f = true;
            final Iterator iterator = ((Iterable)this.d).iterator();
            while (iterator.hasNext()) {
                ((Runnable)iterator.next()).run();
            }
        }
        
        public final void f(final r0.b b) {
            l.e((Object)b, "effect");
            if (this.j.remove((Object)b) && this.j.isEmpty()) {
                this.e();
            }
        }
        
        public final List g() {
            return this.k;
        }
        
        public final b h() {
            return this.a;
        }
        
        public final o i() {
            return this.c;
        }
        
        public final a j() {
            return this.b;
        }
        
        public final boolean k() {
            return this.i;
        }
        
        public final boolean l() {
            return this.e;
        }
        
        public final boolean m() {
            return this.f;
        }
        
        public final boolean n() {
            return this.g;
        }
        
        public final boolean o() {
            return this.h;
        }
        
        public final void p(final b a, final a a2) {
            l.e((Object)a, "finalState");
            l.e((Object)a2, "lifecycleImpact");
            final int n = r0.d.c.a[a2.ordinal()];
            a b;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        return;
                    }
                    if (this.a != r0.d.b.f) {
                        if (b0.l0(2)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: For fragment ");
                            sb.append((Object)this.c);
                            sb.append(" mFinalState = ");
                            sb.append((Object)this.a);
                            sb.append(" -> ");
                            sb.append((Object)a);
                            sb.append('.');
                            Log.v("FragmentManager", sb.toString());
                        }
                        this.a = a;
                    }
                    return;
                }
                else {
                    if (b0.l0(2)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: For fragment ");
                        sb2.append((Object)this.c);
                        sb2.append(" mFinalState = ");
                        sb2.append((Object)this.a);
                        sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                        sb2.append((Object)this.b);
                        sb2.append(" to REMOVING.");
                        Log.v("FragmentManager", sb2.toString());
                    }
                    this.a = r0.d.b.f;
                    b = r0.d.a.g;
                }
            }
            else {
                if (this.a != r0.d.b.f) {
                    return;
                }
                if (b0.l0(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append((Object)this.c);
                    sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb3.append((Object)this.b);
                    sb3.append(" to ADDING.");
                    Log.v("FragmentManager", sb3.toString());
                }
                this.a = r0.d.b.g;
                b = r0.d.a.f;
            }
            this.b = b;
            this.i = true;
        }
        
        public void q() {
            this.h = true;
        }
        
        public final void r(final boolean i) {
            this.i = i;
        }
        
        @Override
        public String toString() {
            final String hexString = Integer.toHexString(System.identityHashCode((Object)this));
            final StringBuilder sb = new StringBuilder();
            sb.append("Operation {");
            sb.append(hexString);
            sb.append("} {finalState = ");
            sb.append((Object)this.a);
            sb.append(" lifecycleImpact = ");
            sb.append((Object)this.b);
            sb.append(" fragment = ");
            sb.append((Object)this.c);
            sb.append('}');
            return sb.toString();
        }
        
        public enum a
        {
            e("NONE", 0), 
            f("ADDING", 1), 
            g("REMOVING", 2);
            
            private static final a[] h;
            
            static {
                h = a();
            }
            
            private a(final String s, final int n) {
            }
            
            private static final /* synthetic */ a[] a() {
                return new a[] { a.e, a.f, a.g };
            }
        }
        
        public enum b
        {
            public static final a e;
            
            f("REMOVED", 0), 
            g("VISIBLE", 1), 
            h("GONE", 2), 
            i("INVISIBLE", 3);
            
            private static final d.b[] j;
            
            static {
                j = a();
                e = new a(null);
            }
            
            private b(final String s, final int n) {
            }
            
            private static final /* synthetic */ d.b[] a() {
                return new d.b[] { d.b.f, d.b.g, d.b.h, d.b.i };
            }
            
            public static final d.b d(final int n) {
                return d.b.e.b(n);
            }
            
            public final void b(final View view, ViewGroup viewGroup) {
                l.e((Object)view, "view");
                l.e((Object)viewGroup, "container");
                final int n = r0.d.b.b.a[this.ordinal()];
                final ViewGroup viewGroup2 = null;
                ViewGroup viewGroup3 = null;
                if (n != 1) {
                    int visibility;
                    if (n != 2) {
                        if (n != 3) {
                            final int n2 = 4;
                            if (n != 4) {
                                return;
                            }
                            visibility = n2;
                            if (b0.l0(2)) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("SpecialEffectsController: Setting view ");
                                sb.append((Object)view);
                                sb.append(" to INVISIBLE");
                                Log.v("FragmentManager", sb.toString());
                                visibility = n2;
                            }
                        }
                        else {
                            if (b0.l0(2)) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("SpecialEffectsController: Setting view ");
                                sb2.append((Object)view);
                                sb2.append(" to GONE");
                                Log.v("FragmentManager", sb2.toString());
                            }
                            visibility = 8;
                        }
                    }
                    else {
                        if (b0.l0(2)) {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("SpecialEffectsController: Setting view ");
                            sb3.append((Object)view);
                            sb3.append(" to VISIBLE");
                            Log.v("FragmentManager", sb3.toString());
                        }
                        final ViewParent parent = view.getParent();
                        if (parent instanceof ViewGroup) {
                            viewGroup3 = (ViewGroup)parent;
                        }
                        if (viewGroup3 == null) {
                            if (b0.l0(2)) {
                                final StringBuilder sb4 = new StringBuilder();
                                sb4.append("SpecialEffectsController: Adding view ");
                                sb4.append((Object)view);
                                sb4.append(" to Container ");
                                sb4.append((Object)viewGroup);
                                Log.v("FragmentManager", sb4.toString());
                            }
                            viewGroup.addView(view);
                        }
                        visibility = 0;
                    }
                    view.setVisibility(visibility);
                }
                else {
                    final ViewParent parent2 = view.getParent();
                    viewGroup = viewGroup2;
                    if (parent2 instanceof ViewGroup) {
                        viewGroup = (ViewGroup)parent2;
                    }
                    if (viewGroup != null) {
                        if (b0.l0(2)) {
                            final StringBuilder sb5 = new StringBuilder();
                            sb5.append("SpecialEffectsController: Removing view ");
                            sb5.append((Object)view);
                            sb5.append(" from container ");
                            sb5.append((Object)viewGroup);
                            Log.v("FragmentManager", sb5.toString());
                        }
                        viewGroup.removeView(view);
                    }
                }
            }
            
            public static final class a
            {
                private a() {
                }
                
                public final d.b a(final View view) {
                    l.e((Object)view, "<this>");
                    d.b b;
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        b = r0.d.b.i;
                    }
                    else {
                        b = this.b(view.getVisibility());
                    }
                    return b;
                }
                
                public final d.b b(final int n) {
                    d.b b;
                    if (n != 0) {
                        if (n != 4) {
                            if (n != 8) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Unknown visibility ");
                                sb.append(n);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            b = r0.d.b.h;
                        }
                        else {
                            b = r0.d.b.i;
                        }
                    }
                    else {
                        b = r0.d.b.g;
                    }
                    return b;
                }
            }
        }
    }
}
