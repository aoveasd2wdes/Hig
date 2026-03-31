package j0;

import androidx.lifecycle.k0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k;
import androidx.lifecycle.j;
import java.util.Iterator;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.content.res.Configuration;
import p0.d;
import android.util.AttributeSet;
import androidx.lifecycle.h0;
import androidx.lifecycle.e0$a;
import m0.b;
import android.app.Application;
import android.content.ContextWrapper;
import m0.a;
import androidx.lifecycle.h;
import android.animation.Animator;
import android.view.animation.Animation;
import android.content.Intent;
import android.os.Parcelable;
import android.content.res.Resources;
import android.content.Context;
import androidx.lifecycle.h$a;
import android.util.Log;
import androidx.lifecycle.z;
import java.util.UUID;
import android.util.SparseArray;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p0.e;
import androidx.lifecycle.e0$b;
import androidx.lifecycle.q;
import androidx.lifecycle.m;
import androidx.lifecycle.h$b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p0.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i0;
import androidx.lifecycle.l;
import android.view.View$OnCreateContextMenuListener;
import android.content.ComponentCallbacks;

public abstract class o implements ComponentCallbacks, View$OnCreateContextMenuListener, l, i0, g, f
{
    static final Object c0;
    String A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    private boolean H;
    ViewGroup I;
    View J;
    boolean K;
    boolean L;
    o.o$e M;
    Runnable N;
    boolean O;
    LayoutInflater P;
    boolean Q;
    public String R;
    h$b S;
    m T;
    n0 U;
    q V;
    e0$b W;
    e X;
    private int Y;
    private final AtomicInteger Z;
    private final ArrayList a0;
    private final o$f b0;
    int c;
    Bundle d;
    SparseArray e;
    Bundle f;
    String g;
    Bundle h;
    o i;
    String j;
    int k;
    private Boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    int u;
    b0 v;
    b0 w;
    o x;
    int y;
    int z;
    
    static {
        c0 = new Object();
    }
    
    public o() {
        this.c = -1;
        this.g = UUID.randomUUID().toString();
        this.j = null;
        this.l = null;
        this.w = (b0)new c0();
        this.G = true;
        this.L = true;
        this.N = (Runnable)new o$a(this);
        this.S = h$b.i;
        this.V = new q();
        this.Z = new AtomicInteger();
        this.a0 = new ArrayList();
        this.b0 = (o$f)new o$f() {
            final o a;
            
            void a() {
                this.a.X.c();
                androidx.lifecycle.z.a((f)this.a);
                final Bundle d = this.a.d;
                Bundle bundle;
                if (d != null) {
                    bundle = d.getBundle("registryState");
                }
                else {
                    bundle = null;
                }
                this.a.X.d(bundle);
            }
        };
        this.P();
    }
    
    private void E0(final o$f o$f) {
        if (this.c >= 0) {
            o$f.a();
        }
        else {
            this.a0.add((Object)o$f);
        }
    }
    
    private void J0() {
        if (j0.b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append((Object)this);
            Log.d("FragmentManager", sb.toString());
        }
        if (this.J != null) {
            final Bundle d = this.d;
            Bundle bundle;
            if (d != null) {
                bundle = d.getBundle("savedInstanceState");
            }
            else {
                bundle = null;
            }
            this.K0(bundle);
        }
        this.d = null;
    }
    
    private void P() {
        this.T = new m((l)this);
        this.X = p0.e.a((f)this);
        this.W = null;
        if (!this.a0.contains((Object)this.b0)) {
            this.E0(this.b0);
        }
    }
    
    private o.o$e i() {
        if (this.M == null) {
            this.M = new o.o$e();
        }
        return this.M;
    }
    
    private int z() {
        final h$b s = this.S;
        if (s != h$b.f && this.x != null) {
            return Math.min(((Enum)s).ordinal(), this.x.z());
        }
        return ((Enum)s).ordinal();
    }
    
    int A() {
        final o.o$e m = this.M;
        if (m == null) {
            return 0;
        }
        return m.f;
    }
    
    void A0(final Bundle bundle) {
        this.j0(bundle);
    }
    
    public final o B() {
        return this.x;
    }
    
    void B0() {
        this.w.x0();
        this.w.J(true);
        this.c = 5;
        this.H = false;
        this.k0();
        if (this.H) {
            final m t = this.T;
            final h$a on_START = h$a.ON_START;
            t.h(on_START);
            if (this.J != null) {
                this.U.c(on_START);
            }
            this.w.C();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" did not call through to super.onStart()");
        throw new t0(sb.toString());
    }
    
    public final b0 C() {
        final b0 v = this.v;
        if (v != null) {
            return v;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }
    
    void C0() {
        this.w.E();
        if (this.J != null) {
            this.U.c(h$a.ON_STOP);
        }
        this.T.h(h$a.ON_STOP);
        this.c = 4;
        this.H = false;
        this.l0();
        if (this.H) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" did not call through to super.onStop()");
        throw new t0(sb.toString());
    }
    
    boolean D() {
        final o.o$e m = this.M;
        return m != null && m.a;
    }
    
    void D0() {
        final Bundle d = this.d;
        Bundle bundle;
        if (d != null) {
            bundle = d.getBundle("savedInstanceState");
        }
        else {
            bundle = null;
        }
        this.m0(this.J, bundle);
        this.w.F();
    }
    
    int E() {
        final o.o$e m = this.M;
        if (m == null) {
            return 0;
        }
        return m.d;
    }
    
    int F() {
        final o.o$e m = this.M;
        if (m == null) {
            return 0;
        }
        return m.e;
    }
    
    public final p F0() {
        this.j();
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }
    
    float G() {
        final o.o$e m = this.M;
        if (m == null) {
            return 1.0f;
        }
        return m.q;
    }
    
    public final Context G0() {
        final Context q = this.q();
        if (q != null) {
            return q;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }
    
    public Object H() {
        final o.o$e m = this.M;
        if (m == null) {
            return null;
        }
        Object o;
        if ((o = m.l) == j0.o.c0) {
            o = this.v();
        }
        return o;
    }
    
    public final View H0() {
        final View o = this.O();
        if (o != null) {
            return o;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }
    
    public final Resources I() {
        return this.G0().getResources();
    }
    
    void I0() {
        final Bundle d = this.d;
        if (d != null) {
            final Bundle bundle = d.getBundle("childFragmentManager");
            if (bundle != null) {
                this.w.D0((Parcelable)bundle);
                this.w.t();
            }
        }
    }
    
    public Object J() {
        final o.o$e m = this.M;
        if (m == null) {
            return null;
        }
        Object o;
        if ((o = m.j) == j0.o.c0) {
            o = this.s();
        }
        return o;
    }
    
    public Object K() {
        final o.o$e m = this.M;
        if (m == null) {
            return null;
        }
        return m.m;
    }
    
    final void K0(final Bundle bundle) {
        final SparseArray e = this.e;
        if (e != null) {
            this.J.restoreHierarchyState(e);
            this.e = null;
        }
        this.H = false;
        this.n0(bundle);
        if (this.H) {
            if (this.J != null) {
                this.U.c(h$a.ON_CREATE);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" did not call through to super.onViewStateRestored()");
        throw new t0(sb.toString());
    }
    
    public Object L() {
        final o.o$e m = this.M;
        if (m == null) {
            return null;
        }
        Object o;
        if ((o = m.n) == j0.o.c0) {
            o = this.K();
        }
        return o;
    }
    
    void L0(final int b, final int c, final int d, final int e) {
        if (this.M == null && b == 0 && c == 0 && d == 0 && e == 0) {
            return;
        }
        this.i().b = b;
        this.i().c = c;
        this.i().d = d;
        this.i().e = e;
    }
    
    ArrayList M() {
        final o.o$e m = this.M;
        if (m != null) {
            final ArrayList g = m.g;
            if (g != null) {
                return g;
            }
        }
        return new ArrayList();
    }
    
    void M0(final View r) {
        this.i().r = r;
    }
    
    ArrayList N() {
        final o.o$e m = this.M;
        if (m != null) {
            final ArrayList h = m.h;
            if (h != null) {
                return h;
            }
        }
        return new ArrayList();
    }
    
    void N0(final int f) {
        if (this.M == null && f == 0) {
            return;
        }
        this.i();
        this.M.f = f;
    }
    
    public View O() {
        return this.J;
    }
    
    void O0(final boolean a) {
        if (this.M == null) {
            return;
        }
        this.i().a = a;
    }
    
    void P0(final float q) {
        this.i().q = q;
    }
    
    void Q() {
        this.P();
        this.R = this.g;
        this.g = UUID.randomUUID().toString();
        this.m = false;
        this.n = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.u = 0;
        this.v = null;
        this.w = (b0)new c0();
        this.y = 0;
        this.z = 0;
        this.A = null;
        this.B = false;
        this.C = false;
    }
    
    void Q0(final ArrayList g, final ArrayList h) {
        this.i();
        final o.o$e m = this.M;
        m.g = g;
        m.h = h;
    }
    
    public final boolean R() {
        return false;
    }
    
    public void R0(final Intent intent, final int n, final Bundle bundle) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }
    
    public final boolean S() {
        if (!this.B) {
            final b0 v = this.v;
            if (v == null || !v.o0(this.x)) {
                return false;
            }
        }
        return true;
    }
    
    public void S0() {
        if (this.M != null) {
            if (this.i().s) {
                this.i().s = false;
            }
        }
    }
    
    final boolean T() {
        return this.u > 0;
    }
    
    boolean U() {
        final o.o$e m = this.M;
        return m != null && m.s;
    }
    
    public void W(final Bundle bundle) {
        this.H = true;
    }
    
    public void X(final Bundle bundle) {
        this.H = true;
        this.I0();
        if (!this.w.q0(1)) {
            this.w.t();
        }
    }
    
    public Animation Y(final int n, final boolean b, final int n2) {
        return null;
    }
    
    public Animator Z(final int n, final boolean b, final int n2) {
        return null;
    }
    
    public h a() {
        return (h)this.T;
    }
    
    public View a0(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final int y = this.Y;
        if (y != 0) {
            return layoutInflater.inflate(y, viewGroup, false);
        }
        return null;
    }
    
    public a b() {
        while (true) {
            for (Context context = this.G0().getApplicationContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
                if (context instanceof Application) {
                    final Application application = (Application)context;
                    if (application == null && j0.b0.l0(3)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Could not find Application instance from Context ");
                        sb.append((Object)this.G0().getApplicationContext());
                        sb.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                        Log.d("FragmentManager", sb.toString());
                    }
                    final b b = new b();
                    if (application != null) {
                        b.b(e0$a.d, application);
                    }
                    b.b(androidx.lifecycle.z.a, this);
                    b.b(androidx.lifecycle.z.b, this);
                    if (this.o() != null) {
                        b.b(androidx.lifecycle.z.c, this.o());
                    }
                    return b;
                }
            }
            final Application application = null;
            continue;
        }
    }
    
    public void b0() {
        this.H = true;
    }
    
    public void c0() {
        this.H = true;
    }
    
    public h0 d() {
        if (this.v == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.z() != ((Enum)h$b.f).ordinal()) {
            return this.v.h0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }
    
    public LayoutInflater d0(final Bundle bundle) {
        return this.y(bundle);
    }
    
    public void e0(final boolean b) {
    }
    
    @Override
    public final boolean equals(final Object obj) {
        return super.equals(obj);
    }
    
    public void f0(final Context context, final AttributeSet set, final Bundle bundle) {
        this.H = true;
    }
    
    public void g0() {
        this.H = true;
    }
    
    r h() {
        return new r(this) {
            final o a;
            
            public View a(final int n) {
                final View j = this.a.J;
                if (j != null) {
                    return j.findViewById(n);
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append((Object)this.a);
                sb.append(" does not have a view");
                throw new IllegalStateException(sb.toString());
            }
            
            public boolean b() {
                return this.a.J != null;
            }
        };
    }
    
    public void h0(final boolean b) {
    }
    
    @Override
    public final int hashCode() {
        return super.hashCode();
    }
    
    public void i0() {
        this.H = true;
    }
    
    public final p j() {
        return null;
    }
    
    public void j0(final Bundle bundle) {
    }
    
    public boolean k() {
        final o.o$e m = this.M;
        if (m != null) {
            final Boolean p = m.p;
            if (p != null) {
                return p;
            }
        }
        return true;
    }
    
    public void k0() {
        this.H = true;
    }
    
    public void l0() {
        this.H = true;
    }
    
    public final d m() {
        return this.X.b();
    }
    
    public void m0(final View view, final Bundle bundle) {
    }
    
    public boolean n() {
        final o.o$e m = this.M;
        if (m != null) {
            final Boolean o = m.o;
            if (o != null) {
                return o;
            }
        }
        return true;
    }
    
    public void n0(final Bundle bundle) {
        this.H = true;
    }
    
    public final Bundle o() {
        return this.h;
    }
    
    void o0(final Bundle bundle) {
        this.w.x0();
        this.c = 3;
        this.H = false;
        this.W(bundle);
        if (this.H) {
            this.J0();
            this.w.r();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new t0(sb.toString());
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        this.H = true;
    }
    
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        this.F0();
        throw null;
    }
    
    public void onLowMemory() {
        this.H = true;
    }
    
    public final b0 p() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }
    
    void p0() {
        final Iterator iterator = this.a0.iterator();
        while (iterator.hasNext()) {
            ((o$f)iterator.next()).a();
        }
        this.a0.clear();
        this.w.h((u)null, this.h(), this);
        this.c = 0;
        this.H = false;
        throw null;
    }
    
    public Context q() {
        return null;
    }
    
    void q0(final Configuration configuration) {
        this.onConfigurationChanged(configuration);
    }
    
    int r() {
        final o.o$e m = this.M;
        if (m == null) {
            return 0;
        }
        return m.b;
    }
    
    void r0(final Bundle bundle) {
        this.w.x0();
        this.c = 1;
        this.H = false;
        this.T.a((k)new j(this) {
            final o c;
            
            public void W(final l l, final h$a h$a) {
                if (h$a == h$a.ON_STOP) {
                    final View j = this.c.J;
                    if (j != null) {
                        j.cancelPendingInputEvents();
                    }
                }
            }
        });
        this.X(bundle);
        this.Q = true;
        if (this.H) {
            this.T.h(h$a.ON_CREATE);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" did not call through to super.onCreate()");
        throw new t0(sb.toString());
    }
    
    public Object s() {
        final o.o$e m = this.M;
        if (m == null) {
            return null;
        }
        return m.i;
    }
    
    void s0(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.w.x0();
        this.t = true;
        this.U = new n0(this, this.d(), (Runnable)new n(this));
        final View a0 = this.a0(layoutInflater, viewGroup, bundle);
        this.J = a0;
        if (a0 != null) {
            this.U.e();
            if (j0.b0.l0(3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Setting ViewLifecycleOwner on View ");
                sb.append((Object)this.J);
                sb.append(" for Fragment ");
                sb.append((Object)this);
                Log.d("FragmentManager", sb.toString());
            }
            j0.a(this.J, (l)this.U);
            k0.a(this.J, (i0)this.U);
            p0.g.a(this.J, (f)this.U);
            this.V.d((Object)this.U);
        }
        else {
            if (this.U.f()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.U = null;
        }
    }
    
    public void startActivityForResult(final Intent intent, final int n) {
        this.R0(intent, n, null);
    }
    
    androidx.core.app.l t() {
        final o.o$e m = this.M;
        if (m == null) {
            return null;
        }
        m.getClass();
        return null;
    }
    
    void t0() {
        this.w.v();
        if (this.J != null && this.U.a().b().b(h$b.g)) {
            this.U.c(h$a.ON_DESTROY);
        }
        this.c = 1;
        this.H = false;
        this.b0();
        if (this.H) {
            androidx.loader.app.a.a((l)this).b();
            this.t = false;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new t0(sb.toString());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append(this.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode((Object)this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.g);
        if (this.y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.y));
        }
        if (this.A != null) {
            sb.append(" tag=");
            sb.append(this.A);
        }
        sb.append(")");
        return sb.toString();
    }
    
    int u() {
        final o.o$e m = this.M;
        if (m == null) {
            return 0;
        }
        return m.c;
    }
    
    void u0() {
        this.c = -1;
        this.H = false;
        this.c0();
        this.P = null;
        if (this.H) {
            if (!this.w.k0()) {
                this.w.u();
                this.w = (b0)new c0();
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" did not call through to super.onDetach()");
        throw new t0(sb.toString());
    }
    
    public Object v() {
        final o.o$e m = this.M;
        if (m == null) {
            return null;
        }
        return m.k;
    }
    
    LayoutInflater v0(final Bundle bundle) {
        return this.P = this.d0(bundle);
    }
    
    androidx.core.app.l w() {
        final o.o$e m = this.M;
        if (m == null) {
            return null;
        }
        m.getClass();
        return null;
    }
    
    void w0() {
        this.onLowMemory();
    }
    
    View x() {
        final o.o$e m = this.M;
        if (m == null) {
            return null;
        }
        return m.r;
    }
    
    void x0() {
        this.w.z();
        if (this.J != null) {
            this.U.c(h$a.ON_PAUSE);
        }
        this.T.h(h$a.ON_PAUSE);
        this.c = 6;
        this.H = false;
        this.g0();
        if (this.H) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" did not call through to super.onPause()");
        throw new t0(sb.toString());
    }
    
    public LayoutInflater y(final Bundle bundle) {
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }
    
    void y0() {
        final boolean p0 = this.v.p0(this);
        final Boolean l = this.l;
        if (l == null || l != p0) {
            this.l = p0;
            this.h0(p0);
            this.w.A();
        }
    }
    
    void z0() {
        this.w.x0();
        this.w.J(true);
        this.c = 7;
        this.H = false;
        this.i0();
        if (this.H) {
            final m t = this.T;
            final h$a on_RESUME = h$a.ON_RESUME;
            t.h(on_RESUME);
            if (this.J != null) {
                this.U.c(on_RESUME);
            }
            this.w.B();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)this);
        sb.append(" did not call through to super.onResume()");
        throw new t0(sb.toString());
    }
}
