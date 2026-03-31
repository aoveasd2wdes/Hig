package j0;

import android.animation.Animator;
import androidx.core.view.t;
import androidx.core.view.d0;
import android.graphics.Rect;
import i4.w;
import android.animation.Animator$AnimatorListener;
import android.os.Build$VERSION;
import android.animation.AnimatorSet;
import java.util.ListIterator;
import androidx.core.view.y;
import java.util.Set;
import android.view.View;
import u3.j;
import java.util.Map;
import l.d;
import u3.n;
import p.a;
import android.content.Context;
import java.util.Iterator;
import android.util.Log;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import i4.l;
import android.view.ViewGroup;

public final class f extends r0
{
    public f(final ViewGroup viewGroup) {
        l.e((Object)viewGroup, "container");
        super(viewGroup);
    }
    
    private final void A(final List list) {
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        final Iterator iterator = ((Iterable)list).iterator();
        while (iterator.hasNext()) {
            v3.l.o((Collection)list3, (Iterable)((f$e)iterator.next()).a().g());
        }
        final boolean empty = ((Collection)list3).isEmpty();
        final Iterator iterator2 = list.iterator();
        boolean b = false;
        while (iterator2.hasNext()) {
            final b b2 = (b)iterator2.next();
            final Context context = ((View)this.s()).getContext();
            final r0$d a = ((f$e)b2).a();
            l.d((Object)context, "context");
            final q$a c = b2.c(context);
            if (c == null) {
                continue;
            }
            if (c.b == null) {
                ((List)list2).add((Object)b2);
            }
            else {
                final o i = a.i();
                if (((Collection)a.g()).isEmpty() ^ true) {
                    if (!b0.l0(2)) {
                        continue;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Ignoring Animator set on ");
                    sb.append((Object)i);
                    sb.append(" as this Fragment was involved in a Transition.");
                    Log.v("FragmentManager", sb.toString());
                }
                else {
                    if (a.h() == r0$d$b.h) {
                        a.r(false);
                    }
                    a.b((r0$b)new c(b2));
                    b = true;
                }
            }
        }
        for (final b b3 : list2) {
            final r0$d a2 = ((f$e)b3).a();
            final o j = a2.i();
            StringBuilder sb2;
            String s;
            if (empty ^ true) {
                if (!b0.l0(2)) {
                    continue;
                }
                sb2 = new StringBuilder();
                sb2.append("Ignoring Animation set on ");
                sb2.append((Object)j);
                s = " as Animations cannot run alongside Transitions.";
            }
            else {
                if (!b) {
                    a2.b((r0$b)new f$a(b3));
                    continue;
                }
                if (!b0.l0(2)) {
                    continue;
                }
                sb2 = new StringBuilder();
                sb2.append("Ignoring Animation set on ");
                sb2.append((Object)j);
                s = " as Animations cannot run alongside Animators.";
            }
            sb2.append(s);
            Log.v("FragmentManager", sb2.toString());
        }
    }
    
    private static final void B(final f f, final r0$d r0$d) {
        l.e((Object)f, "this$0");
        l.e((Object)r0$d, "$operation");
        f.c(r0$d);
    }
    
    private final void C(final List list, final boolean b, final r0$d r0$d, final r0$d r0$d2) {
        final ArrayList list2 = new ArrayList();
        for (final Object next : list) {
            if (!((f$e)next).b()) {
                ((Collection)list2).add(next);
            }
        }
        final ArrayList list3 = new ArrayList();
        for (final Object next2 : list2) {
            if (((g)next2).c() != null) {
                ((Collection)list3).add(next2);
            }
        }
        final Iterator iterator3 = ((Iterable)list3).iterator();
        m0 m0 = null;
        while (iterator3.hasNext()) {
            final g g = (g)iterator3.next();
            final m0 c = g.c();
            if (m0 != null && c != m0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append((Object)((f$e)g).a().i());
                sb.append(" returned Transition ");
                sb.append(g.f());
                sb.append(" which uses a different Transition type than other Fragments.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            m0 = c;
        }
        if (m0 == null) {
            return;
        }
        final ArrayList list4 = new ArrayList();
        final ArrayList list5 = new ArrayList();
        final a a = new a();
        ArrayList list6 = new ArrayList();
        ArrayList list7 = new ArrayList();
        final a a2 = new a();
        final a a3 = new a();
        final Iterator iterator4 = ((List)list3).iterator();
        ArrayList list8 = null;
        Object o2 = null;
    Label_0346:
        while (true) {
            final Object o = null;
            list8 = list7;
            o2 = o;
            while (iterator4.hasNext()) {
                final g g2 = (g)iterator4.next();
                if (g2.g() && r0$d != null && r0$d2 != null) {
                    final Object a4 = m0.A(m0.h(g2.e()));
                    final ArrayList i = r0$d2.i().M();
                    l.d((Object)i, "lastIn.fragment.sharedElementSourceNames");
                    final ArrayList j = r0$d.i().M();
                    l.d((Object)j, "firstOut.fragment.sharedElementSourceNames");
                    final ArrayList n = r0$d.i().N();
                    l.d((Object)n, "firstOut.fragment.sharedElementTargetNames");
                    for (int size = n.size(), k = 0; k < size; ++k) {
                        final int index = i.indexOf(n.get(k));
                        if (index != -1) {
                            i.set(index, j.get(k));
                        }
                    }
                    final ArrayList n2 = r0$d2.i().N();
                    l.d((Object)n2, "lastIn.fragment.sharedElementTargetNames");
                    if (!b) {
                        r0$d.i().w();
                        r0$d2.i().t();
                    }
                    else {
                        r0$d.i().t();
                        r0$d2.i().w();
                    }
                    final j a5 = u3.n.a((Object)null, (Object)null);
                    d.a(a5.a());
                    d.a(a5.b());
                    for (int size2 = i.size(), l = 0; l < size2; ++l) {
                        final Object value = i.get(l);
                        l.d(value, "exitingNames[i]");
                        final String s = (String)value;
                        final Object value2 = n2.get(l);
                        l.d(value2, "enteringNames[i]");
                        ((Map)a).put((Object)s, (Object)value2);
                    }
                    if (b0.l0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        for (final String s2 : n2) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Name: ");
                            sb2.append(s2);
                            Log.v("FragmentManager", sb2.toString());
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for (final String s3 : i) {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("Name: ");
                            sb3.append(s3);
                            Log.v("FragmentManager", sb3.toString());
                        }
                    }
                    final View j2 = r0$d.i().J;
                    l.d((Object)j2, "firstOut.fragment.mView");
                    this.D((Map)a2, j2);
                    a2.o((Collection)i);
                    a.o((Collection)a2.keySet());
                    final View j3 = r0$d2.i().J;
                    l.d((Object)j3, "lastIn.fragment.mView");
                    this.D((Map)a3, j3);
                    a3.o((Collection)n2);
                    a3.o(a.values());
                    k0.c(a, a3);
                    final Set keySet = a.keySet();
                    l.d((Object)keySet, "sharedElementNameMapping.keys");
                    this.E(a2, (Collection)keySet);
                    final Collection values = a.values();
                    l.d((Object)values, "sharedElementNameMapping.values");
                    this.E(a3, values);
                    if (a.isEmpty()) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Ignoring shared elements transition ");
                        sb4.append(a4);
                        sb4.append(" between ");
                        sb4.append((Object)r0$d);
                        sb4.append(" and ");
                        sb4.append((Object)r0$d2);
                        sb4.append(" as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                        Log.i("FragmentManager", sb4.toString());
                        list4.clear();
                        list5.clear();
                        final ArrayList list9 = i;
                        list6 = n2;
                        list7 = list9;
                        continue Label_0346;
                    }
                    list8 = i;
                    list6 = n2;
                    o2 = a4;
                }
            }
            break;
        }
        if (o2 == null) {
            boolean b2 = false;
            Label_1186: {
                if (!((Collection)list3).isEmpty()) {
                    final Iterator iterator7 = ((Iterable)list3).iterator();
                    while (iterator7.hasNext()) {
                        if (((g)iterator7.next()).f() != null) {
                            b2 = false;
                            break Label_1186;
                        }
                    }
                }
                b2 = true;
            }
            if (b2) {
                return;
            }
        }
        final f f = new f((List)list3, r0$d, r0$d2, m0, o2, list4, list5, a, list6, list8, a2, a3, b);
        final Iterator iterator8 = ((Iterable)list3).iterator();
        while (iterator8.hasNext()) {
            ((f$e)iterator8.next()).a().b((r0$b)f);
        }
    }
    
    private final void D(final Map map, final View view) {
        final String q = y.q(view);
        if (q != null) {
            map.put((Object)q, (Object)view);
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    l.d((Object)child, "child");
                    this.D(map, child);
                }
            }
        }
    }
    
    private final void E(final a a, final Collection collection) {
        final Set entrySet = a.entrySet();
        l.d((Object)entrySet, "entries");
        v3.l.r((Iterable)entrySet, (h4.l)new f$h(collection));
    }
    
    private final void F(final List list) {
        final o i = ((r0$d)v3.l.y(list)).i();
        for (final r0$d r0$d : list) {
            r0$d.i().M.b = i.M.b;
            r0$d.i().M.c = i.M.c;
            r0$d.i().M.d = i.M.d;
            r0$d.i().M.e = i.M.e;
        }
    }
    
    public void d(final List list, final boolean b) {
        l.e((Object)list, "operations");
        final Iterator iterator = ((Iterable)list).iterator();
        while (true) {
            r0$d$b a;
            r0$d$b g;
            r0$d r0$d;
            do {
                final boolean hasNext = iterator.hasNext();
                final r0$d r0$d2 = null;
                if (!hasNext) {
                    final Object next = null;
                    final r0$d r0$d3 = (r0$d)next;
                    final ListIterator listIterator = list.listIterator(list.size());
                    r0$d$b a2;
                    r0$d$b g2;
                    r0$d r0$d4;
                    Object previous;
                    do {
                        previous = r0$d2;
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        previous = listIterator.previous();
                        r0$d4 = (r0$d)previous;
                        final r0$d$b$a e = r0$d$b.e;
                        final View j = r0$d4.i().J;
                        l.d((Object)j, "operation.fragment.mView");
                        a2 = e.a(j);
                        g2 = r0$d$b.g;
                    } while (a2 == g2 || r0$d4.h() != g2);
                    final r0$d r0$d5 = (r0$d)previous;
                    if (b0.l0(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Executing operations from ");
                        sb.append((Object)r0$d3);
                        sb.append(" to ");
                        sb.append((Object)r0$d5);
                        Log.v("FragmentManager", sb.toString());
                    }
                    final ArrayList list2 = new ArrayList();
                    final ArrayList list3 = new ArrayList();
                    this.F(list);
                    for (final r0$d r0$d6 : list) {
                        ((List)list2).add((Object)new b(r0$d6, b));
                        ((List)list3).add((Object)new g(r0$d6, b, b ? (r0$d6 == r0$d3) : (r0$d6 == r0$d5)));
                        r0$d6.a((Runnable)new j0.d(this, r0$d6));
                    }
                    this.C((List)list3, b, r0$d3, r0$d5);
                    this.A((List)list2);
                    return;
                }
                final Object next = iterator.next();
                r0$d = (r0$d)next;
                final r0$d$b$a e2 = r0$d$b.e;
                final View i = r0$d.i().J;
                l.d((Object)i, "operation.fragment.mView");
                a = e2.a(i);
                g = r0$d$b.g;
            } while (a != g || r0$d.h() == g);
            continue;
        }
    }
    
    private static final class b extends f$e
    {
        private final boolean b;
        private boolean c;
        private q$a d;
        
        public b(final r0$d r0$d, final boolean b) {
            l.e((Object)r0$d, "operation");
            super(r0$d);
            this.b = b;
        }
        
        public final q$a c(final Context context) {
            l.e((Object)context, "context");
            q$a d;
            if (this.c) {
                d = this.d;
            }
            else {
                d = q.b(context, this.a().i(), this.a().h() == r0$d$b.g, this.b);
                this.d = d;
                this.c = true;
            }
            return d;
        }
    }
    
    private static final class c extends r0$b
    {
        private final b d;
        private AnimatorSet e;
        
        public c(final b d) {
            l.e((Object)d, "animatorInfo");
            this.d = d;
        }
        
        public boolean b() {
            return true;
        }
        
        public void c(final ViewGroup viewGroup) {
            l.e((Object)viewGroup, "container");
            final AnimatorSet e = this.e;
            if (e == null) {
                this.d.a().f((r0$b)this);
            }
            else {
                final r0$d a = this.d.a();
                if (a.n()) {
                    if (Build$VERSION.SDK_INT >= 26) {
                        f$d.a.a(e);
                    }
                }
                else {
                    e.end();
                }
                if (b0.l0(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Animator from operation ");
                    sb.append((Object)a);
                    sb.append(" has been canceled");
                    String s;
                    if (a.n()) {
                        s = " with seeking.";
                    }
                    else {
                        s = ".";
                    }
                    sb.append(s);
                    sb.append(' ');
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        
        public void d(final ViewGroup viewGroup) {
            l.e((Object)viewGroup, "container");
            final r0$d a = this.d.a();
            final AnimatorSet e = this.e;
            if (e == null) {
                this.d.a().f((r0$b)this);
                return;
            }
            e.start();
            if (b0.l0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append((Object)a);
                sb.append(" has started.");
                Log.v("FragmentManager", sb.toString());
            }
        }
        
        public void e(final ViewGroup viewGroup) {
            l.e((Object)viewGroup, "container");
            if (this.d.b()) {
                return;
            }
            final Context context = ((View)viewGroup).getContext();
            final b d = this.d;
            l.d((Object)context, "context");
            final q$a c = d.c(context);
            AnimatorSet b;
            if (c != null) {
                b = c.b;
            }
            else {
                b = null;
            }
            this.e = b;
            final r0$d a = this.d.a();
            final o i = a.i();
            final boolean b2 = a.h() == r0$d$b.h;
            final View j = i.J;
            viewGroup.startViewTransition(j);
            final AnimatorSet e = this.e;
            if (e != null) {
                ((Animator)e).addListener((Animator$AnimatorListener)new f$c$a(viewGroup, j, b2, a, this));
            }
            final AnimatorSet e2 = this.e;
            if (e2 != null) {
                e2.setTarget((Object)j);
            }
        }
        
        public final b g() {
            return this.d;
        }
    }
    
    private static final class f extends r0$b
    {
        private final List d;
        private final r0$d e;
        private final r0$d f;
        private final m0 g;
        private final Object h;
        private final ArrayList i;
        private final ArrayList j;
        private final a k;
        private final ArrayList l;
        private final ArrayList m;
        private final a n;
        private final a o;
        private final boolean p;
        private final androidx.core.os.a q;
        private Object r;
        
        public f(final List d, final r0$d e, final r0$d f, final m0 g, final Object h, final ArrayList i, final ArrayList j, final a k, final ArrayList l, final ArrayList m, final a n, final a o, final boolean p13) {
            l.e((Object)d, "transitionInfos");
            l.e((Object)g, "transitionImpl");
            l.e((Object)i, "sharedElementFirstOutViews");
            l.e((Object)j, "sharedElementLastInViews");
            l.e((Object)k, "sharedElementNameMapping");
            l.e((Object)l, "enteringNames");
            l.e((Object)m, "exitingNames");
            l.e((Object)n, "firstOutViews");
            l.e((Object)o, "lastInViews");
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
            this.o = o;
            this.p = p13;
            this.q = new androidx.core.os.a();
        }
        
        private final void A(final ArrayList list, final ViewGroup viewGroup, final h4.a a) {
            k0.d((List)list, 4);
            final ArrayList q = this.g.q(this.j);
            if (b0.l0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                for (final Object next : this.i) {
                    i4.l.d(next, "sharedElementFirstOutViews");
                    final View view = (View)next;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("View: ");
                    sb.append((Object)view);
                    sb.append(" Name: ");
                    sb.append(y.q(view));
                    Log.v("FragmentManager", sb.toString());
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                for (final Object next2 : this.j) {
                    i4.l.d(next2, "sharedElementLastInViews");
                    final View view2 = (View)next2;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("View: ");
                    sb2.append((Object)view2);
                    sb2.append(" Name: ");
                    sb2.append(y.q(view2));
                    Log.v("FragmentManager", sb2.toString());
                }
            }
            a.e();
            this.g.x((View)viewGroup, this.i, this.j, q, (Map)this.k);
            k0.d((List)list, 0);
            this.g.z(this.h, this.i, this.j);
        }
        
        private final void m(final ArrayList list, View child) {
            if (child instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)child;
                if (!d0.a(viewGroup)) {
                    for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                        child = viewGroup.getChildAt(i);
                        if (child.getVisibility() == 0) {
                            i4.l.d((Object)child, "child");
                            this.m(list, child);
                        }
                    }
                    return;
                }
                if (list.contains((Object)child)) {
                    return;
                }
            }
            else if (list.contains((Object)child)) {
                return;
            }
            list.add((Object)child);
        }
        
        private final j n(final ViewGroup viewGroup, final r0$d r0$d, final r0$d r0$d2) {
            final View view = new View(((View)viewGroup).getContext());
            final Rect rect = new Rect();
            final Iterator iterator = this.d.iterator();
            View view2 = null;
            int n = 0;
            while (iterator.hasNext()) {
                if (((g)iterator.next()).g() && r0$d2 != null && r0$d != null && (((Map)this.k).isEmpty() ^ true) && this.h != null) {
                    k0.a(r0$d.i(), r0$d2.i(), this.p, this.n, true);
                    t.a((View)viewGroup, (Runnable)new j0.j(r0$d, r0$d2, this));
                    this.i.addAll(this.n.values());
                    if (((Collection)this.m).isEmpty() ^ true) {
                        final Object value = this.m.get(0);
                        i4.l.d(value, "exitingNames[0]");
                        view2 = (View)this.n.get((Object)value);
                        this.g.u(this.h, view2);
                    }
                    this.j.addAll(this.o.values());
                    int n2 = n;
                    if (((Collection)this.l).isEmpty() ^ true) {
                        final Object value2 = this.l.get(0);
                        i4.l.d(value2, "enteringNames[0]");
                        final View view3 = (View)this.o.get((Object)value2);
                        n2 = n;
                        if (view3 != null) {
                            t.a((View)viewGroup, (Runnable)new k(this.g, view3, rect));
                            n2 = 1;
                        }
                    }
                    this.g.y(this.h, view, this.i);
                    final m0 g = this.g;
                    final Object h = this.h;
                    g.s(h, (Object)null, (ArrayList)null, (Object)null, (ArrayList)null, h, this.j);
                    n = n2;
                }
            }
            final ArrayList list = new ArrayList();
            final Iterator iterator2 = this.d.iterator();
            Object p3 = null;
            Object p4 = null;
            while (iterator2.hasNext()) {
                final g g2 = (g)iterator2.next();
                final r0$d a = g2.a();
                final Object h2 = this.g.h(g2.f());
                if (h2 != null) {
                    final ArrayList list2 = new ArrayList();
                    final View j = a.i().J;
                    i4.l.d((Object)j, "operation.fragment.mView");
                    this.m(list2, j);
                    if (this.h != null && (a == r0$d2 || a == r0$d)) {
                        ArrayList list3;
                        if (a == r0$d2) {
                            list3 = this.i;
                        }
                        else {
                            list3 = this.j;
                        }
                        list2.removeAll((Collection)v3.l.I((Iterable)list3));
                    }
                    if (list2.isEmpty()) {
                        this.g.a(h2, view);
                    }
                    else {
                        this.g.b(h2, list2);
                        this.g.s(h2, h2, list2, (Object)null, (ArrayList)null, (Object)null, (ArrayList)null);
                        if (a.h() == r0$d$b.h) {
                            a.r(false);
                            final ArrayList list4 = new ArrayList((Collection)list2);
                            list4.remove((Object)a.i().J);
                            this.g.r(h2, a.i().J, list4);
                            t.a((View)viewGroup, (Runnable)new j0.l(list2));
                        }
                    }
                    if (a.h() == r0$d$b.g) {
                        list.addAll((Collection)list2);
                        if (n != 0) {
                            this.g.t(h2, rect);
                        }
                        if (b0.l0(2)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Entering Transition: ");
                            sb.append(h2);
                            Log.v("FragmentManager", sb.toString());
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            for (final Object next : list2) {
                                i4.l.d(next, "transitioningViews");
                                final View view4 = (View)next;
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("View: ");
                                sb2.append((Object)view4);
                                Log.v("FragmentManager", sb2.toString());
                            }
                        }
                    }
                    else {
                        this.g.u(h2, view2);
                        if (b0.l0(2)) {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("Exiting Transition: ");
                            sb3.append(h2);
                            Log.v("FragmentManager", sb3.toString());
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            for (final Object next2 : list2) {
                                i4.l.d(next2, "transitioningViews");
                                final View view5 = (View)next2;
                                final StringBuilder sb4 = new StringBuilder();
                                sb4.append("View: ");
                                sb4.append((Object)view5);
                                Log.v("FragmentManager", sb4.toString());
                            }
                        }
                    }
                    if (g2.h()) {
                        p3 = this.g.p(p3, h2, (Object)null);
                    }
                    else {
                        p4 = this.g.p(p4, h2, (Object)null);
                    }
                }
            }
            final Object o = this.g.o(p3, p4, this.h);
            if (b0.l0(2)) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append("Final merged transition: ");
                sb5.append(o);
                Log.v("FragmentManager", sb5.toString());
            }
            return new j((Object)list, o);
        }
        
        private static final void o(final r0$d r0$d, final r0$d r0$d2, final f f) {
            l.e((Object)f, "this$0");
            k0.a(r0$d.i(), r0$d2.i(), f.p, f.o, false);
        }
        
        private static final void p(final m0 m0, final View view, final Rect rect) {
            l.e((Object)m0, "$impl");
            l.e((Object)rect, "$lastInEpicenterRect");
            m0.k(view, rect);
        }
        
        private static final void q(final ArrayList list) {
            l.e((Object)list, "$transitioningViews");
            k0.d((List)list, 4);
        }
        
        private static final void x(final r0$d r0$d, final f f) {
            l.e((Object)r0$d, "$operation");
            l.e((Object)f, "this$0");
            if (b0.l0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Transition for operation ");
                sb.append((Object)r0$d);
                sb.append(" has completed");
                Log.v("FragmentManager", sb.toString());
            }
            r0$d.f((r0$b)f);
        }
        
        private static final void y(final w w) {
            l.e((Object)w, "$seekCancelLambda");
            final h4.a a = (h4.a)w.e;
            if (a != null) {
                a.e();
            }
        }
        
        private static final void z(final r0$d r0$d, final f f) {
            l.e((Object)r0$d, "$operation");
            l.e((Object)f, "this$0");
            if (b0.l0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Transition for operation ");
                sb.append((Object)r0$d);
                sb.append(" has completed");
                Log.v("FragmentManager", sb.toString());
            }
            r0$d.f((r0$b)f);
        }
        
        public final void B(final Object r) {
            this.r = r;
        }
        
        public boolean b() {
            final boolean m = this.g.m();
            boolean b2;
            final boolean b = b2 = false;
            if (m) {
                final List d = this.d;
                boolean b3 = false;
                Label_0122: {
                    if (!(d instanceof Collection) || !((Collection)d).isEmpty()) {
                        for (final g g : d) {
                            if (Build$VERSION.SDK_INT < 34 || g.f() == null || !this.g.n(g.f())) {
                                b3 = false;
                                break Label_0122;
                            }
                        }
                    }
                    b3 = true;
                }
                b2 = b;
                if (b3) {
                    final Object h = this.h;
                    if (h != null) {
                        b2 = b;
                        if (!this.g.n(h)) {
                            return b2;
                        }
                    }
                    b2 = true;
                }
            }
            return b2;
        }
        
        public void c(final ViewGroup viewGroup) {
            i4.l.e((Object)viewGroup, "container");
            this.q.a();
        }
        
        public void d(final ViewGroup viewGroup) {
            i4.l.e((Object)viewGroup, "container");
            if (!((View)viewGroup).isLaidOut()) {
                for (final g g : this.d) {
                    final r0$d a = g.a();
                    if (b0.l0(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Container ");
                        sb.append((Object)viewGroup);
                        sb.append(" has not been laid out. Completing operation ");
                        sb.append((Object)a);
                        Log.v("FragmentManager", sb.toString());
                    }
                    g.a().f((r0$b)this);
                }
                return;
            }
            final Object r = this.r;
            StringBuilder sb2;
            String s;
            if (r != null) {
                final m0 g2 = this.g;
                i4.l.b(r);
                g2.c(r);
                if (!b0.l0(2)) {
                    return;
                }
                sb2 = new StringBuilder();
                s = "Ending execution of operations from ";
            }
            else {
                final j n = this.n(viewGroup, this.f, this.e);
                final ArrayList list = (ArrayList)n.a();
                final Object b = n.b();
                final List d = this.d;
                final ArrayList list2 = new ArrayList(v3.l.m((Iterable)d, 10));
                final Iterator iterator2 = ((Iterable)d).iterator();
                while (iterator2.hasNext()) {
                    ((Collection)list2).add((Object)((g)iterator2.next()).a());
                }
                for (final r0$d r0$d : list2) {
                    this.g.v(r0$d.i(), b, this.q, (Runnable)new j0.g(r0$d, this));
                }
                this.A(list, viewGroup, (h4.a)new f$f$a(this, viewGroup, b));
                if (!b0.l0(2)) {
                    return;
                }
                sb2 = new StringBuilder();
                s = "Completed executing operations from ";
            }
            sb2.append(s);
            sb2.append((Object)this.e);
            sb2.append(" to ");
            sb2.append((Object)this.f);
            Log.v("FragmentManager", sb2.toString());
        }
        
        public void e(final ViewGroup viewGroup) {
            i4.l.e((Object)viewGroup, "container");
            if (!((View)viewGroup).isLaidOut()) {
                final Iterator iterator = ((Iterable)this.d).iterator();
                while (iterator.hasNext()) {
                    final r0$d a = ((g)iterator.next()).a();
                    if (b0.l0(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Container ");
                        sb.append((Object)viewGroup);
                        sb.append(" has not been laid out. Skipping onStart for operation ");
                        sb.append((Object)a);
                        Log.v("FragmentManager", sb.toString());
                    }
                }
                return;
            }
            if (this.w() && this.h != null && !this.b()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Ignoring shared elements transition ");
                sb2.append(this.h);
                sb2.append(" between ");
                sb2.append((Object)this.e);
                sb2.append(" and ");
                sb2.append((Object)this.f);
                sb2.append(" as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
                Log.i("FragmentManager", sb2.toString());
            }
            if (this.b() && this.w()) {
                final w w = new w();
                final j n = this.n(viewGroup, this.f, this.e);
                final ArrayList list = (ArrayList)n.a();
                final Object b = n.b();
                final List d = this.d;
                final ArrayList list2 = new ArrayList(v3.l.m((Iterable)d, 10));
                final Iterator iterator2 = ((Iterable)d).iterator();
                while (iterator2.hasNext()) {
                    ((Collection)list2).add((Object)((g)iterator2.next()).a());
                }
                for (final r0$d r0$d : list2) {
                    this.g.w(r0$d.i(), b, this.q, (Runnable)new h(w), (Runnable)new i(r0$d, this));
                }
                this.A(list, viewGroup, (h4.a)new f$f$b(this, viewGroup, b, w));
            }
        }
        
        public final Object r() {
            return this.r;
        }
        
        public final r0$d s() {
            return this.e;
        }
        
        public final r0$d t() {
            return this.f;
        }
        
        public final m0 u() {
            return this.g;
        }
        
        public final List v() {
            return this.d;
        }
        
        public final boolean w() {
            final List d = this.d;
            final boolean b = d instanceof Collection;
            final boolean b2 = true;
            boolean b3;
            if (b && ((Collection)d).isEmpty()) {
                b3 = b2;
            }
            else {
                final Iterator iterator = ((Iterable)d).iterator();
                do {
                    b3 = b2;
                    if (iterator.hasNext()) {
                        continue;
                    }
                    return b3;
                } while (((g)iterator.next()).a().i().o);
                b3 = false;
            }
            return b3;
        }
    }
    
    private static final class g extends f$e
    {
        private final Object b;
        private final boolean c;
        private final Object d;
        
        public g(final r0$d r0$d, final boolean b, final boolean b2) {
            l.e((Object)r0$d, "operation");
            super(r0$d);
            final r0$d$b h = r0$d.h();
            final r0$d$b g = r0$d$b.g;
            Object b3;
            if (h == g) {
                final o i = r0$d.i();
                if (b) {
                    b3 = i.H();
                }
                else {
                    b3 = i.s();
                }
            }
            else {
                final o j = r0$d.i();
                if (b) {
                    b3 = j.J();
                }
                else {
                    b3 = j.v();
                }
            }
            this.b = b3;
            boolean c;
            if (r0$d.h() == g) {
                final o k = r0$d.i();
                if (b) {
                    c = k.n();
                }
                else {
                    c = k.k();
                }
            }
            else {
                c = true;
            }
            this.c = c;
            Object d;
            if (b2) {
                final o l = r0$d.i();
                if (b) {
                    d = l.L();
                }
                else {
                    d = l.K();
                }
            }
            else {
                d = null;
            }
            this.d = d;
        }
        
        private final m0 d(final Object o) {
            if (o == null) {
                return null;
            }
            final m0 b = k0.b;
            if (b != null && b.g(o)) {
                return b;
            }
            final m0 c = k0.c;
            if (c != null && c.g(o)) {
                return c;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Transition ");
            sb.append(o);
            sb.append(" for fragment ");
            sb.append((Object)this.a().i());
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
        
        public final m0 c() {
            final m0 d = this.d(this.b);
            final m0 d2 = this.d(this.d);
            if (d == null || d2 == null || d == d2) {
                m0 m0;
                if ((m0 = d) == null) {
                    m0 = d2;
                }
                return m0;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            sb.append((Object)this.a().i());
            sb.append(" returned Transition ");
            sb.append(this.b);
            sb.append(" which uses a different Transition  type than its shared element transition ");
            sb.append(this.d);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public final Object e() {
            return this.d;
        }
        
        public final Object f() {
            return this.b;
        }
        
        public final boolean g() {
            return this.d != null;
        }
        
        public final boolean h() {
            return this.c;
        }
    }
}
