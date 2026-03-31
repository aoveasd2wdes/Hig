package o2;

import f2.c$j;
import m2.c$e;
import m2.c$h;
import m2.c$d;
import h2.n;
import android.graphics.Color;
import m2.c$g;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.LayerDrawable;
import h2.m;
import java.util.Iterator;
import java.util.List;
import android.graphics.drawable.Drawable;
import l2.d;
import android.view.View;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import m2.c$f;
import m2.c$c;
import android.util.SparseArray;
import java.util.Set;
import android.graphics.drawable.ShapeDrawable;
import java.util.concurrent.Executor;
import u2.b;
import f2.c;
import android.animation.TimeInterpolator;

public class f implements a
{
    private static final int[] s;
    private static final TimeInterpolator t;
    private final c a;
    private final b b;
    private final m2.c c;
    private final float d;
    private boolean e;
    private long f;
    private final Executor g;
    private ShapeDrawable h;
    private Set i;
    private SparseArray j;
    private f.f$e k;
    private int l;
    private Set m;
    private f.f$e n;
    private float o;
    private final f.f$i p;
    private c$c q;
    private c$f r;
    
    static {
        s = new int[] { 10, 20, 50, 100, 200, 500, 1000 };
        t = (TimeInterpolator)new DecelerateInterpolator();
    }
    
    public f(final Context context, final c a, final m2.c c) {
        this.g = (Executor)Executors.newSingleThreadExecutor();
        this.i = Collections.newSetFromMap((Map)new ConcurrentHashMap());
        this.j = new SparseArray();
        this.k = new f.f$e((f$a)null);
        this.l = 4;
        this.n = new f.f$e((f$a)null);
        this.p = new f.f$i(this, (f$a)null);
        this.a = a;
        this.e = true;
        this.f = 300L;
        this.d = context.getResources().getDisplayMetrics().density;
        final b b = new b(context);
        (this.b = b).g((View)this.S(context));
        b.i(l2.d.c);
        b.e((Drawable)this.R());
        this.c = c;
    }
    
    private static double F(final q2.b b, final q2.b b2) {
        final double a = b.a;
        final double a2 = b2.a;
        final double b3 = b.b;
        final double b4 = b2.b;
        return (a - a2) * (a - a2) + (b3 - b4) * (b3 - b4);
    }
    
    private q2.b G(final List list, final q2.b b) {
        final q2.b b2 = null;
        final q2.b b3 = null;
        q2.b b4 = b2;
        if (list != null) {
            if (list.isEmpty()) {
                b4 = b2;
            }
            else {
                final int b5 = this.c.e().b();
                double n = b5 * b5;
                final Iterator iterator = list.iterator();
                q2.b b6 = b3;
                while (true) {
                    b4 = b6;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final q2.b b7 = (q2.b)iterator.next();
                    final double f = F(b7, b);
                    if (f >= n) {
                        continue;
                    }
                    b6 = b7;
                    n = f;
                }
            }
        }
        return b4;
    }
    
    private Set M(Set set) {
        if (set != null) {
            set = Collections.unmodifiableSet(set);
        }
        else {
            set = Collections.emptySet();
        }
        return set;
    }
    
    private LayerDrawable R() {
        this.h = new ShapeDrawable((Shape)new OvalShape());
        final ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        final LayerDrawable layerDrawable = new LayerDrawable(new Drawable[] { (Drawable)shapeDrawable, (Drawable)this.h });
        final int n = (int)(this.d * 3.0f);
        layerDrawable.setLayerInset(1, n, n, n, n);
        return layerDrawable;
    }
    
    private u2.c S(final Context context) {
        final u2.c c = new u2.c(context);
        ((View)c).setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
        ((View)c).setId(l2.b.a);
        final int n = (int)(this.d * 12.0f);
        ((View)c).setPadding(n, n, n, n);
        return c;
    }
    
    static /* synthetic */ c$g y(final f f) {
        f.getClass();
        return null;
    }
    
    protected int H(final m2.a a) {
        final int e = a.e();
        final int[] s = o2.f.s;
        int n = 0;
        if (e <= s[0]) {
            return e;
        }
        while (true) {
            final int[] s2 = o2.f.s;
            if (n >= s2.length - 1) {
                return s2[s2.length - 1];
            }
            final int n2 = n + 1;
            if (e < s2[n2]) {
                return s2[n];
            }
            n = n2;
        }
    }
    
    protected String I(final int n) {
        if (n < o2.f.s[0]) {
            return String.valueOf(n);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append("+");
        return sb.toString();
    }
    
    public int J(final int n) {
        return l2.d.c;
    }
    
    public int K(final int n) {
        final float n2 = 300.0f - Math.min((float)n, 300.0f);
        return Color.HSVToColor(new float[] { n2 * n2 / 90000.0f * 220.0f, 1.0f, 0.6f });
    }
    
    protected h2.b L(final m2.a a) {
        final int h = this.H(a);
        h2.b d;
        if ((d = (h2.b)this.j.get(h)) == null) {
            this.h.getPaint().setColor(this.K(h));
            this.b.i(this.J(h));
            d = h2.c.d(this.b.d((CharSequence)this.I(h)));
            this.j.put(h, (Object)d);
        }
        return d;
    }
    
    protected void T(final m2.b b, final n n) {
        if (b.getTitle() != null && b.m() != null) {
            n.x(b.getTitle());
            n.w(b.m());
        }
        else {
            String s;
            if (b.getTitle() != null) {
                s = b.getTitle();
            }
            else {
                if (b.m() == null) {
                    return;
                }
                s = b.m();
            }
            n.x(s);
        }
    }
    
    protected void U(final m2.a a, final n n) {
        n.p(this.L(a));
    }
    
    protected void V(final m2.b b, final m m) {
    }
    
    protected void W(final m2.b b, final m m) {
        final String title = b.getTitle();
        final int n = 1;
        final int n2 = 0;
        int n3 = 0;
        Label_0173: {
            if (title != null && b.m() != null) {
                if (!b.getTitle().equals((Object)m.d())) {
                    m.q(b.getTitle());
                    n3 = 1;
                }
                if (b.m().equals((Object)m.c())) {
                    break Label_0173;
                }
                m.p(b.m());
            }
            else {
                String s;
                if (b.m() != null && !b.m().equals((Object)m.d())) {
                    s = b.m();
                }
                else {
                    n3 = n2;
                    if (b.getTitle() == null) {
                        break Label_0173;
                    }
                    n3 = n2;
                    if (b.getTitle().equals((Object)m.d())) {
                        break Label_0173;
                    }
                    s = b.getTitle();
                }
                m.q(s);
            }
            n3 = 1;
        }
        if (!m.b().equals((Object)b.c())) {
            m.n(b.c());
            n3 = n;
            if (b.h() != null) {
                m.s((float)b.h());
                n3 = n;
            }
        }
        if (n3 != 0 && m.f()) {
            m.t();
        }
    }
    
    protected void X(final m2.a a, final m m) {
    }
    
    protected void Y(final m2.a a, final m m) {
        m.l(this.L(a));
    }
    
    protected boolean Z(final Set set, final Set set2) {
        return set2.equals((Object)set) ^ true;
    }
    
    public void a(final c$d c$d) {
    }
    
    protected boolean a0(final m2.a a) {
        return a.e() >= this.l;
    }
    
    public void b(final c$c q) {
        this.q = q;
    }
    
    public void c(final c$g c$g) {
    }
    
    public void d(final c$f r) {
        this.r = r;
    }
    
    public void e(final c$h c$h) {
    }
    
    public void f(final Set set) {
        this.p.c(set);
    }
    
    public void g(final c$e c$e) {
    }
    
    public void h() {
        this.c.g().m((c$j)new c$j(this) {
            final f c;
            
            public boolean b0(final m m) {
                return this.c.r != null && this.c.r.V((m2.b)this.c.k.b(m));
            }
        });
        this.c.g().k((f2.c$f)new f2.c$f(this) {
            final f c;
            
            public void u0(final m m) {
                o2.f.y(this.c);
            }
        });
        this.c.g().l((f2.c$g)new o2.b(this));
        this.c.f().m((c$j)new o2.c(this));
        this.c.f().k((f2.c$f)new o2.d(this));
        this.c.f().l((f2.c$g)new e(this));
    }
    
    public void i() {
        this.c.g().m(null);
        this.c.g().k(null);
        this.c.g().l(null);
        this.c.f().m(null);
        this.c.f().k(null);
        this.c.f().l(null);
    }
}
