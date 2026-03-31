package s0;

import android.widget.AdapterView;
import android.widget.Adapter;
import java.util.Map;
import android.util.SparseIntArray;
import java.util.Iterator;
import java.util.List;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.y;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator;
import p.d;
import android.view.View;
import android.util.SparseArray;
import android.animation.TimeInterpolator;
import p.a;
import java.util.ArrayList;

public abstract class l implements Cloneable
{
    private static final int[] J;
    private static final g K;
    private static ThreadLocal L;
    ArrayList A;
    private int B;
    private boolean C;
    private boolean D;
    private ArrayList E;
    private ArrayList F;
    private e G;
    private a H;
    private g I;
    private String e;
    private long f;
    long g;
    private TimeInterpolator h;
    ArrayList i;
    ArrayList j;
    private ArrayList k;
    private ArrayList l;
    private ArrayList m;
    private ArrayList n;
    private ArrayList o;
    private ArrayList p;
    private ArrayList q;
    private ArrayList r;
    private ArrayList s;
    private t t;
    private t u;
    p v;
    private int[] w;
    private ArrayList x;
    private ArrayList y;
    boolean z;
    
    static {
        J = new int[] { 2, 1, 3, 4 };
        K = (g)new l$a();
        l.L = new ThreadLocal();
    }
    
    public l() {
        this.e = this.getClass().getName();
        this.f = -1L;
        this.g = -1L;
        this.h = null;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = new t();
        this.u = new t();
        this.v = null;
        this.w = s0.l.J;
        this.z = false;
        this.A = new ArrayList();
        this.B = 0;
        this.C = false;
        this.D = false;
        this.E = null;
        this.F = new ArrayList();
        this.I = s0.l.K;
    }
    
    private static boolean I(final s s, final s s2, final String s3) {
        final Object value = s.a.get((Object)s3);
        final Object value2 = s2.a.get((Object)s3);
        return (value != null || value2 != null) && (value == null || value2 == null || (value.equals(value2) ^ true));
    }
    
    private void J(final a a, final a a2, final SparseArray sparseArray, final SparseArray sparseArray2) {
        for (int size = sparseArray.size(), i = 0; i < size; ++i) {
            final View view = (View)sparseArray.valueAt(i);
            if (view != null && this.H(view)) {
                final View view2 = (View)sparseArray2.get(sparseArray.keyAt(i));
                if (view2 != null && this.H(view2)) {
                    final s s = (s)((p.g)a).get((Object)view);
                    final s s2 = (s)((p.g)a2).get((Object)view2);
                    if (s != null && s2 != null) {
                        this.x.add((Object)s);
                        this.y.add((Object)s2);
                        ((p.g)a).remove((Object)view);
                        ((p.g)a2).remove((Object)view2);
                    }
                }
            }
        }
    }
    
    private void K(final a a, final a a2) {
        for (int i = ((p.g)a).size() - 1; i >= 0; --i) {
            final View view = (View)((p.g)a).i(i);
            if (view != null && this.H(view)) {
                final s s = (s)((p.g)a2).remove((Object)view);
                if (s != null && this.H(s.b)) {
                    this.x.add((Object)((p.g)a).k(i));
                    this.y.add((Object)s);
                }
            }
        }
    }
    
    private void L(final a a, final a a2, final p.d d, final p.d d2) {
        for (int m = d.m(), i = 0; i < m; ++i) {
            final View view = (View)d.n(i);
            if (view != null && this.H(view)) {
                final View view2 = (View)d2.g(d.j(i));
                if (view2 != null && this.H(view2)) {
                    final s s = (s)((p.g)a).get((Object)view);
                    final s s2 = (s)((p.g)a2).get((Object)view2);
                    if (s != null && s2 != null) {
                        this.x.add((Object)s);
                        this.y.add((Object)s2);
                        ((p.g)a).remove((Object)view);
                        ((p.g)a2).remove((Object)view2);
                    }
                }
            }
        }
    }
    
    private void M(final a a, final a a2, final a a3, final a a4) {
        for (int size = ((p.g)a3).size(), i = 0; i < size; ++i) {
            final View view = (View)((p.g)a3).m(i);
            if (view != null && this.H(view)) {
                final View view2 = (View)((p.g)a4).get(((p.g)a3).i(i));
                if (view2 != null && this.H(view2)) {
                    final s s = (s)((p.g)a).get((Object)view);
                    final s s2 = (s)((p.g)a2).get((Object)view2);
                    if (s != null && s2 != null) {
                        this.x.add((Object)s);
                        this.y.add((Object)s2);
                        ((p.g)a).remove((Object)view);
                        ((p.g)a2).remove((Object)view2);
                    }
                }
            }
        }
    }
    
    private void N(final t t, final t t2) {
        final a a = new a((p.g)t.a);
        final a a2 = new a((p.g)t2.a);
        int n = 0;
        while (true) {
            final int[] w = this.w;
            if (n >= w.length) {
                break;
            }
            final int n2 = w[n];
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 == 4) {
                            this.L(a, a2, t.c, t2.c);
                        }
                    }
                    else {
                        this.J(a, a2, t.b, t2.b);
                    }
                }
                else {
                    this.M(a, a2, t.d, t2.d);
                }
            }
            else {
                this.K(a, a2);
            }
            ++n;
        }
        this.c(a, a2);
    }
    
    private void T(final Animator animator, final a a) {
        if (animator != null) {
            animator.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter(this, a) {
                final a a;
                final l b;
                
                public void onAnimationEnd(final Animator animator) {
                    ((p.g)this.a).remove((Object)animator);
                    this.b.A.remove((Object)animator);
                }
                
                public void onAnimationStart(final Animator animator) {
                    this.b.A.add((Object)animator);
                }
            });
            this.f(animator);
        }
    }
    
    private void c(final a a, final a a2) {
        final int n = 0;
        int n2 = 0;
        int i;
        while (true) {
            i = n;
            if (n2 >= ((p.g)a).size()) {
                break;
            }
            final s s = (s)((p.g)a).m(n2);
            if (this.H(s.b)) {
                this.x.add((Object)s);
                this.y.add((Object)null);
            }
            ++n2;
        }
        while (i < ((p.g)a2).size()) {
            final s s2 = (s)((p.g)a2).m(i);
            if (this.H(s2.b)) {
                this.y.add((Object)s2);
                this.x.add((Object)null);
            }
            ++i;
        }
    }
    
    private static void d(final t t, View view, final s s) {
        ((p.g)t.a).put((Object)view, (Object)s);
        final int id = view.getId();
        if (id >= 0) {
            if (t.b.indexOfKey(id) >= 0) {
                t.b.put(id, (Object)null);
            }
            else {
                t.b.put(id, (Object)view);
            }
        }
        final String q = y.q(view);
        if (q != null) {
            if (((p.g)t.d).containsKey((Object)q)) {
                ((p.g)t.d).put((Object)q, (Object)null);
            }
            else {
                ((p.g)t.d).put((Object)q, (Object)view);
            }
        }
        if (view.getParent() instanceof ListView) {
            final ListView listView = (ListView)view.getParent();
            if (((Adapter)listView.getAdapter()).hasStableIds()) {
                final long itemIdAtPosition = ((AdapterView)listView).getItemIdAtPosition(((AdapterView)listView).getPositionForView(view));
                if (t.c.i(itemIdAtPosition) >= 0) {
                    view = (View)t.c.g(itemIdAtPosition);
                    if (view != null) {
                        y.K(view, false);
                        t.c.k(itemIdAtPosition, (Object)null);
                    }
                }
                else {
                    y.K(view, true);
                    t.c.k(itemIdAtPosition, (Object)view);
                }
            }
        }
    }
    
    private void i(final View view, final boolean b) {
        if (view == null) {
            return;
        }
        final int id = view.getId();
        final ArrayList m = this.m;
        if (m != null && m.contains((Object)id)) {
            return;
        }
        final ArrayList n = this.n;
        if (n != null && n.contains((Object)view)) {
            return;
        }
        final ArrayList o = this.o;
        final int n2 = 0;
        if (o != null) {
            for (int size = o.size(), i = 0; i < size; ++i) {
                if (((Class)this.o.get(i)).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            final s s = new s(view);
            if (b) {
                this.k(s);
            }
            else {
                this.h(s);
            }
            s.c.add((Object)this);
            this.j(s);
            t t;
            if (b) {
                t = this.t;
            }
            else {
                t = this.u;
            }
            d(t, view, s);
        }
        if (view instanceof ViewGroup) {
            final ArrayList q = this.q;
            if (q != null && q.contains((Object)id)) {
                return;
            }
            final ArrayList r = this.r;
            if (r != null && r.contains((Object)view)) {
                return;
            }
            final ArrayList s2 = this.s;
            if (s2 != null) {
                for (int size2 = s2.size(), j = 0; j < size2; ++j) {
                    if (((Class)this.s.get(j)).isInstance(view)) {
                        return;
                    }
                }
            }
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int k = n2; k < viewGroup.getChildCount(); ++k) {
                this.i(viewGroup.getChildAt(k), b);
            }
        }
    }
    
    private static a y() {
        a a;
        if ((a = (a)l.L.get()) == null) {
            a = new a();
            l.L.set((Object)a);
        }
        return a;
    }
    
    public List A() {
        return (List)this.i;
    }
    
    public List B() {
        return (List)this.k;
    }
    
    public List C() {
        return (List)this.l;
    }
    
    public List D() {
        return (List)this.j;
    }
    
    public String[] E() {
        return null;
    }
    
    public s F(final View view, final boolean b) {
        final p v = this.v;
        if (v != null) {
            return ((l)v).F(view, b);
        }
        t t;
        if (b) {
            t = this.t;
        }
        else {
            t = this.u;
        }
        return (s)((p.g)t.a).get((Object)view);
    }
    
    public boolean G(final s s, final s s2) {
        boolean b2;
        final boolean b = b2 = false;
        if (s != null) {
            b2 = b;
            if (s2 != null) {
                final String[] e = this.E();
                if (e != null) {
                    final int length = e.length;
                    int n = 0;
                    while (true) {
                        b2 = b;
                        if (n >= length) {
                            return b2;
                        }
                        if (I(s, s2, e[n])) {
                            break;
                        }
                        ++n;
                    }
                }
                else {
                    final Iterator iterator = s.a.keySet().iterator();
                    do {
                        b2 = b;
                        if (iterator.hasNext()) {
                            continue;
                        }
                        return b2;
                    } while (!I(s, s2, (String)iterator.next()));
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    boolean H(final View view) {
        final int id = view.getId();
        final ArrayList m = this.m;
        if (m != null && m.contains((Object)id)) {
            return false;
        }
        final ArrayList n = this.n;
        if (n != null && n.contains((Object)view)) {
            return false;
        }
        final ArrayList o = this.o;
        if (o != null) {
            for (int size = o.size(), i = 0; i < size; ++i) {
                if (((Class)this.o.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.p != null && androidx.core.view.y.q(view) != null && this.p.contains((Object)androidx.core.view.y.q(view))) {
            return false;
        }
        if (this.i.size() == 0 && this.j.size() == 0) {
            final ArrayList l = this.l;
            if (l == null || l.isEmpty()) {
                final ArrayList k = this.k;
                if (k == null || k.isEmpty()) {
                    return true;
                }
            }
        }
        if (this.i.contains((Object)id) || this.j.contains((Object)view)) {
            return true;
        }
        final ArrayList j = this.k;
        if (j != null && j.contains((Object)androidx.core.view.y.q(view))) {
            return true;
        }
        if (this.l != null) {
            for (int n2 = 0; n2 < this.l.size(); ++n2) {
                if (((Class)this.l.get(n2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void O(final View view) {
        if (!this.D) {
            for (int i = this.A.size() - 1; i >= 0; --i) {
                s0.a.b((Animator)this.A.get(i));
            }
            final ArrayList e = this.E;
            if (e != null && e.size() > 0) {
                final ArrayList list = (ArrayList)this.E.clone();
                for (int size = list.size(), j = 0; j < size; ++j) {
                    ((f)list.get(j)).b(this);
                }
            }
            this.C = true;
        }
    }
    
    void P(final ViewGroup viewGroup) {
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.N(this.t, this.u);
        final a y = y();
        int i = ((p.g)y).size();
        final p0 d = a0.d((View)viewGroup);
        --i;
        while (i >= 0) {
            final Animator animator = (Animator)((p.g)y).i(i);
            if (animator != null) {
                final d d2 = (d)((p.g)y).get((Object)animator);
                if (d2 != null && d2.a != null && d.equals(d2.d)) {
                    final s c = d2.c;
                    final View a = d2.a;
                    final s f = this.F(a, true);
                    s u;
                    final s s = u = this.u(a, (boolean)(1 != 0));
                    if (f == null && (u = s) == null) {
                        u = (s)((p.g)this.u.a).get((Object)a);
                    }
                    if ((f != null || u != null) && d2.e.G(c, u)) {
                        if (!animator.isRunning() && !animator.isStarted()) {
                            ((p.g)y).remove((Object)animator);
                        }
                        else {
                            animator.cancel();
                        }
                    }
                }
            }
            --i;
        }
        this.p(viewGroup, this.t, this.u, this.x, this.y);
        this.U();
    }
    
    public l Q(final f f) {
        final ArrayList e = this.E;
        if (e == null) {
            return this;
        }
        e.remove((Object)f);
        if (this.E.size() == 0) {
            this.E = null;
        }
        return this;
    }
    
    public l R(final View view) {
        this.j.remove((Object)view);
        return this;
    }
    
    public void S(final View view) {
        if (this.C) {
            if (!this.D) {
                for (int i = this.A.size() - 1; i >= 0; --i) {
                    s0.a.c((Animator)this.A.get(i));
                }
                final ArrayList e = this.E;
                if (e != null && e.size() > 0) {
                    final ArrayList list = (ArrayList)this.E.clone();
                    for (int size = list.size(), j = 0; j < size; ++j) {
                        ((f)list.get(j)).e(this);
                    }
                }
            }
            this.C = false;
        }
    }
    
    protected void U() {
        this.b0();
        final a y = y();
        for (final Animator animator : this.F) {
            if (((p.g)y).containsKey((Object)animator)) {
                this.b0();
                this.T(animator, y);
            }
        }
        this.F.clear();
        this.q();
    }
    
    public l V(final long g) {
        this.g = g;
        return this;
    }
    
    public void W(final e g) {
        this.G = g;
    }
    
    public l X(final TimeInterpolator h) {
        this.h = h;
        return this;
    }
    
    public void Y(final g g) {
        g k = g;
        if (g == null) {
            k = s0.l.K;
        }
        this.I = k;
    }
    
    public void Z(final o o) {
    }
    
    public l a(final f f) {
        if (this.E == null) {
            this.E = new ArrayList();
        }
        this.E.add((Object)f);
        return this;
    }
    
    public l a0(final long f) {
        this.f = f;
        return this;
    }
    
    public l b(final View view) {
        this.j.add((Object)view);
        return this;
    }
    
    protected void b0() {
        if (this.B == 0) {
            final ArrayList e = this.E;
            if (e != null && e.size() > 0) {
                final ArrayList list = (ArrayList)this.E.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((f)list.get(i)).c(this);
                }
            }
            this.D = false;
        }
        ++this.B;
    }
    
    String c0(String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(this.getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(this.hashCode()));
        sb.append(": ");
        final String s2 = s = sb.toString();
        if (this.g != -1L) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s2);
            sb2.append("dur(");
            sb2.append(this.g);
            sb2.append(") ");
            s = sb2.toString();
        }
        String string = s;
        if (this.f != -1L) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(s);
            sb3.append("dly(");
            sb3.append(this.f);
            sb3.append(") ");
            string = sb3.toString();
        }
        s = string;
        if (this.h != null) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(string);
            sb4.append("interp(");
            sb4.append((Object)this.h);
            sb4.append(") ");
            s = sb4.toString();
        }
        if (this.i.size() <= 0) {
            final String string2 = s;
            if (this.j.size() <= 0) {
                return string2;
            }
        }
        final StringBuilder sb5 = new StringBuilder();
        sb5.append(s);
        sb5.append("tgts(");
        s = sb5.toString();
        final int size = this.i.size();
        final int n = 0;
        String string3 = s;
        if (size > 0) {
            int n2 = 0;
            while (true) {
                string3 = s;
                if (n2 >= this.i.size()) {
                    break;
                }
                String string4 = s;
                if (n2 > 0) {
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append(s);
                    sb6.append(", ");
                    string4 = sb6.toString();
                }
                final StringBuilder sb7 = new StringBuilder();
                sb7.append(string4);
                sb7.append(this.i.get(n2));
                s = sb7.toString();
                ++n2;
            }
        }
        s = string3;
        if (this.j.size() > 0) {
            int n3 = n;
            while (true) {
                s = string3;
                if (n3 >= this.j.size()) {
                    break;
                }
                s = string3;
                if (n3 > 0) {
                    final StringBuilder sb8 = new StringBuilder();
                    sb8.append(string3);
                    sb8.append(", ");
                    s = sb8.toString();
                }
                final StringBuilder sb9 = new StringBuilder();
                sb9.append(s);
                sb9.append(this.j.get(n3));
                string3 = sb9.toString();
                ++n3;
            }
        }
        final StringBuilder sb10 = new StringBuilder();
        sb10.append(s);
        sb10.append(")");
        return sb10.toString();
    }
    
    protected void f(final Animator animator) {
        if (animator == null) {
            this.q();
        }
        else {
            if (this.r() >= 0L) {
                animator.setDuration(this.r());
            }
            if (this.z() >= 0L) {
                animator.setStartDelay(this.z() + animator.getStartDelay());
            }
            if (this.t() != null) {
                animator.setInterpolator(this.t());
            }
            animator.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter(this) {
                final l a;
                
                public void onAnimationEnd(final Animator animator) {
                    this.a.q();
                    animator.removeListener((Animator$AnimatorListener)this);
                }
            });
            animator.start();
        }
    }
    
    protected void g() {
        for (int i = this.A.size() - 1; i >= 0; --i) {
            ((Animator)this.A.get(i)).cancel();
        }
        final ArrayList e = this.E;
        if (e != null && e.size() > 0) {
            final ArrayList list = (ArrayList)this.E.clone();
            for (int size = list.size(), j = 0; j < size; ++j) {
                ((f)list.get(j)).d(this);
            }
        }
    }
    
    public abstract void h(final s p0);
    
    void j(final s s) {
    }
    
    public abstract void k(final s p0);
    
    void l(final ViewGroup viewGroup, final boolean b) {
        this.m(b);
        final int size = this.i.size();
        final int n = 0;
        Label_0301: {
            if (size > 0 || this.j.size() > 0) {
                final ArrayList k = this.k;
                if (k == null || k.isEmpty()) {
                    final ArrayList l = this.l;
                    if (l == null || l.isEmpty()) {
                        for (int i = 0; i < this.i.size(); ++i) {
                            final View viewById = ((View)viewGroup).findViewById((int)this.i.get(i));
                            if (viewById != null) {
                                final s s = new s(viewById);
                                if (b) {
                                    this.k(s);
                                }
                                else {
                                    this.h(s);
                                }
                                s.c.add((Object)this);
                                this.j(s);
                                t t;
                                if (b) {
                                    t = this.t;
                                }
                                else {
                                    t = this.u;
                                }
                                d(t, viewById, s);
                            }
                        }
                        for (int j = 0; j < this.j.size(); ++j) {
                            final View view = (View)this.j.get(j);
                            final s s2 = new s(view);
                            if (b) {
                                this.k(s2);
                            }
                            else {
                                this.h(s2);
                            }
                            s2.c.add((Object)this);
                            this.j(s2);
                            t t2;
                            if (b) {
                                t2 = this.t;
                            }
                            else {
                                t2 = this.u;
                            }
                            d(t2, view, s2);
                        }
                        break Label_0301;
                    }
                }
            }
            this.i((View)viewGroup, b);
        }
        if (!b) {
            final a h = this.H;
            if (h != null) {
                final int size2 = ((p.g)h).size();
                final ArrayList list = new ArrayList(size2);
                int n2 = 0;
                int n3;
                while (true) {
                    n3 = n;
                    if (n2 >= size2) {
                        break;
                    }
                    list.add(((p.g)this.t.d).remove((Object)((p.g)this.H).i(n2)));
                    ++n2;
                }
                while (n3 < size2) {
                    final View view2 = (View)list.get(n3);
                    if (view2 != null) {
                        ((p.g)this.t.d).put((Object)((p.g)this.H).m(n3), (Object)view2);
                    }
                    ++n3;
                }
            }
        }
    }
    
    void m(final boolean b) {
        t t;
        if (b) {
            ((p.g)this.t.a).clear();
            this.t.b.clear();
            t = this.t;
        }
        else {
            ((p.g)this.u.a).clear();
            this.u.b.clear();
            t = this.u;
        }
        t.c.b();
    }
    
    public l n() {
        try {
            final l l = (l)super.clone();
            l.F = new ArrayList();
            l.t = new t();
            l.u = new t();
            l.x = null;
            l.y = null;
            return l;
        }
        catch (final CloneNotSupportedException ex) {
            return null;
        }
    }
    
    public Animator o(final ViewGroup viewGroup, final s s, final s s2) {
        return null;
    }
    
    protected void p(final ViewGroup viewGroup, final t t, final t t2, final ArrayList list, final ArrayList list2) {
        final a y = y();
        final SparseIntArray sparseIntArray = new SparseIntArray();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final s s = (s)list.get(i);
            final s s2 = (s)list2.get(i);
            s s3;
            if ((s3 = s) != null) {
                s3 = s;
                if (!s.c.contains((Object)this)) {
                    s3 = null;
                }
            }
            s s4;
            if ((s4 = s2) != null) {
                s4 = s2;
                if (!s2.c.contains((Object)this)) {
                    s4 = null;
                }
            }
            if ((s3 != null || s4 != null) && (s3 == null || s4 == null || this.G(s3, s4))) {
                Animator o = this.o(viewGroup, s3, s4);
                if (o != null) {
                    s s8;
                    View b2;
                    if (s4 != null) {
                        final View b = s4.b;
                        final String[] e = this.E();
                        Label_0395: {
                            if (e != null && e.length > 0) {
                                final s s5 = new s(b);
                                final s s6 = (s)((p.g)t2.a).get((Object)b);
                                Animator animator = o;
                                if (s6 != null) {
                                    int n = 0;
                                    while (true) {
                                        animator = o;
                                        if (n >= e.length) {
                                            break;
                                        }
                                        final Map a = s5.a;
                                        final String s7 = e[n];
                                        a.put((Object)s7, s6.a.get((Object)s7));
                                        ++n;
                                    }
                                }
                                for (int size2 = ((p.g)y).size(), j = 0; j < size2; ++j) {
                                    final d d = (d)((p.g)y).get((Object)((p.g)y).i(j));
                                    if (d.c != null && d.a == b && d.b.equals((Object)this.v()) && d.c.equals(s5)) {
                                        o = null;
                                        s8 = s5;
                                        break Label_0395;
                                    }
                                }
                                o = animator;
                                s8 = s5;
                            }
                            else {
                                s8 = null;
                            }
                        }
                        b2 = b;
                    }
                    else {
                        b2 = s3.b;
                        s8 = null;
                    }
                    if (o != null) {
                        ((p.g)y).put((Object)o, (Object)new d(b2, this.v(), this, a0.d((View)viewGroup), s8));
                        this.F.add((Object)o);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int k = 0; k < sparseIntArray.size(); ++k) {
                final Animator animator2 = (Animator)this.F.get(sparseIntArray.keyAt(k));
                animator2.setStartDelay(sparseIntArray.valueAt(k) - Long.MAX_VALUE + animator2.getStartDelay());
            }
        }
    }
    
    protected void q() {
        final int b = this.B - 1;
        this.B = b;
        if (b == 0) {
            final ArrayList e = this.E;
            if (e != null && e.size() > 0) {
                final ArrayList list = (ArrayList)this.E.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((f)list.get(i)).a(this);
                }
            }
            for (int j = 0; j < this.t.c.m(); ++j) {
                final View view = (View)this.t.c.n(j);
                if (view != null) {
                    androidx.core.view.y.K(view, false);
                }
            }
            for (int k = 0; k < this.u.c.m(); ++k) {
                final View view2 = (View)this.u.c.n(k);
                if (view2 != null) {
                    androidx.core.view.y.K(view2, false);
                }
            }
            this.D = true;
        }
    }
    
    public long r() {
        return this.g;
    }
    
    public e s() {
        return this.G;
    }
    
    public TimeInterpolator t() {
        return this.h;
    }
    
    @Override
    public String toString() {
        return this.c0("");
    }
    
    s u(final View view, final boolean b) {
        final p v = this.v;
        if (v != null) {
            return ((l)v).u(view, b);
        }
        ArrayList list;
        if (b) {
            list = this.x;
        }
        else {
            list = this.y;
        }
        final s s = null;
        if (list == null) {
            return null;
        }
        while (true) {
            for (int size = list.size(), i = 0; i < size; ++i) {
                final s s2 = (s)list.get(i);
                if (s2 == null) {
                    return null;
                }
                if (s2.b == view) {
                    s s3 = s;
                    if (i >= 0) {
                        ArrayList list2;
                        if (b) {
                            list2 = this.y;
                        }
                        else {
                            list2 = this.x;
                        }
                        s3 = (s)list2.get(i);
                    }
                    return s3;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    public String v() {
        return this.e;
    }
    
    public g w() {
        return this.I;
    }
    
    public o x() {
        return null;
    }
    
    public long z() {
        return this.f;
    }
    
    private static class d
    {
        View a;
        String b;
        s c;
        p0 d;
        l e;
        
        d(final View a, final String b, final l e, final p0 d, final s c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
    
    public abstract static class e
    {
    }
    
    public interface f
    {
        void a(final l p0);
        
        void b(final l p0);
        
        void c(final l p0);
        
        void d(final l p0);
        
        void e(final l p0);
    }
}
