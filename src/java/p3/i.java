package p3;

import h2.p;
import com.google.android.gms.maps.model.LatLng;
import java.util.Iterator;
import java.util.Set;
import m2.a;
import f2.c$n;
import f2.c$k;
import f2.c$j;
import android.os.Bundle;
import androidx.lifecycle.h;
import java.util.ArrayList;
import h2.a0;
import com.google.android.gms.maps.model.LatLngBounds;
import io.flutter.plugin.platform.k;
import java.util.Objects;
import f2.c$i;
import f2.c$h;
import f2.c$e;
import f2.c$m;
import f2.c$l;
import f2.c$b;
import f2.c$c;
import f2.c$d;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import android.view.TextureView$SurfaceTextureListener;
import android.util.Log;
import android.view.View;
import android.view.TextureView;
import android.view.ViewGroup;
import android.os.Process;
import android.graphics.Bitmap;
import android.content.res.AssetManager;
import android.content.Context;
import f2.d;
import com.google.android.gms.maps.GoogleMapOptions;
import k3.c;
import java.util.List;
import p2.b$a;
import p2.b;
import f2.f;
import androidx.lifecycle.DefaultLifecycleObserver;
import m2.c$f;
import g3.c$a;

class i implements c$a, c$f, e$b, DefaultLifecycleObserver, l, m, x$b, x$e, f, io.flutter.plugin.platform.l
{
    private final n2 A;
    private b B;
    private b$a C;
    private List D;
    private List E;
    private List F;
    private List G;
    private List H;
    private List I;
    private List J;
    private String K;
    private boolean L;
    List M;
    private final int c;
    private final x$c d;
    private final c e;
    private final GoogleMapOptions f;
    private d g;
    private f2.c h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    final float q;
    private x$a1 r;
    private final Context s;
    private final s t;
    private final w u;
    private final e v;
    private final f2 w;
    private final j2 x;
    private final p3.d y;
    private final r z;
    
    i(final int c, final Context s, final c e, final s t, final GoogleMapOptions f) {
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = true;
        this.m = true;
        this.n = false;
        this.o = true;
        this.p = false;
        this.c = c;
        this.s = s;
        this.f = f;
        this.g = new d(s, f);
        final float density = s.getResources().getDisplayMetrics().density;
        this.q = density;
        this.e = e;
        final x$c d = new x$c(e, Integer.toString(c));
        this.d = d;
        u0.x(e, Integer.toString(c), (x$b)this);
        a2.p(e, Integer.toString(c), (x$e)this);
        final AssetManager assets = s.getAssets();
        this.t = t;
        final e v = new e(d, s);
        this.v = v;
        this.u = new w(d, v, assets, density, new f$b());
        this.w = new f2(d, density);
        this.x = new j2(d, assets, density);
        this.y = new p3.d(d, density);
        this.z = new r();
        this.A = new n2(d);
    }
    
    private int J0(final String s) {
        if (s != null) {
            return this.s.checkPermission(s, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }
    
    private void K0() {
        final d g = this.g;
        if (g == null) {
            return;
        }
        g.c();
        this.g = null;
    }
    
    private static TextureView L0(final ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = viewGroup.getChildAt(i);
            if (child instanceof TextureView) {
                return (TextureView)child;
            }
            if (child instanceof ViewGroup) {
                final TextureView l0 = L0((ViewGroup)child);
                if (l0 != null) {
                    return l0;
                }
            }
        }
        return null;
    }
    
    private boolean M0() {
        return this.J0("android.permission.ACCESS_FINE_LOCATION") == 0 || this.J0("android.permission.ACCESS_COARSE_LOCATION") == 0;
    }
    
    private void O0() {
        final d g = this.g;
        if (g == null) {
            return;
        }
        final TextureView l0 = L0((ViewGroup)g);
        if (l0 == null) {
            Log.i("GoogleMapController", "No TextureView found. Likely using the LEGACY renderer.");
            return;
        }
        Log.i("GoogleMapController", "Installing custom TextureView driven invalidator.");
        l0.setSurfaceTextureListener((TextureView$SurfaceTextureListener)new i$a(this, l0.getSurfaceTextureListener(), this.g));
    }
    
    private void U0(final l l) {
        final f2.c h = this.h;
        if (h == null) {
            Log.v("GoogleMapController", "Controller was disposed before GoogleMap was ready.");
            return;
        }
        h.A((c$d)l);
        this.h.z((c$c)l);
        this.h.y((c$b)l);
        this.h.I((c$l)l);
        this.h.J((c$m)l);
        this.h.B((c$e)l);
        this.h.E((c$h)l);
        this.h.F((c$i)l);
    }
    
    private void e1() {
        final List h = this.H;
        if (h != null) {
            this.y.c(h);
        }
    }
    
    private void f1() {
        final List e = this.E;
        if (e != null) {
            this.v.c(e);
        }
    }
    
    private void g1() {
        final List i = this.I;
        if (i != null) {
            this.z.b(i);
        }
    }
    
    private void h1() {
        final List d = this.D;
        if (d != null) {
            this.u.e(d);
        }
    }
    
    private void i1() {
        final List f = this.F;
        if (f != null) {
            this.w.c(f);
        }
    }
    
    private void j1() {
        final List g = this.G;
        if (g != null) {
            this.x.c(g);
        }
    }
    
    private void k1() {
        final List j = this.J;
        if (j != null) {
            this.A.b(j);
        }
    }
    
    private boolean l1(final String s) {
        h2.l l;
        if (s != null && !s.isEmpty()) {
            l = new h2.l(s);
        }
        else {
            l = null;
        }
        final f2.c h = this.h;
        Objects.requireNonNull((Object)h);
        return this.L = h.t(l);
    }
    
    private void m1() {
        if (this.M0()) {
            this.h.x(this.j);
            this.h.k().k(this.k);
        }
        else {
            Log.e("GoogleMapController", "Cannot enable MyLocation layer as location permissions are not granted");
        }
    }
    
    public void A(final boolean b) {
        this.h.k().n(b);
    }
    
    public void A0(final String s) {
        this.A.e(s);
    }
    
    public void B(final boolean j) {
        if (this.j == j) {
            return;
        }
        this.j = j;
        if (this.h != null) {
            this.m1();
        }
    }
    
    public void B0(final x$p x$p) {
        final f2.c h = this.h;
        if (h != null) {
            h.n(p3.f.c(x$p, this.q));
            return;
        }
        throw new x$a("GoogleMap uninitialized", "moveCamera called prior to map initialization", (Object)null);
    }
    
    public void C(final boolean b) {
        this.h.k().i(b);
    }
    
    public void C0(final List list, final List list2, final List list3) {
        this.w.c(list);
        this.w.e(list2);
        this.w.g(list3);
    }
    
    public x$j0 D() {
        final f2.c h = this.h;
        if (h != null) {
            return p3.f.s(h.j().b().e);
        }
        throw new x$a("GoogleMap uninitialized", "getVisibleRegion called prior to map initialization", (Object)null);
    }
    
    public Boolean D0() {
        final f2.c h = this.h;
        Objects.requireNonNull((Object)h);
        return h.l();
    }
    
    public void E(final boolean b) {
        this.h.k().p(b);
    }
    
    public x$y0 E0() {
        final x$y0$a x$y0$a = new x$y0$a();
        final f2.c h = this.h;
        Objects.requireNonNull((Object)h);
        final x$y0$a c = x$y0$a.c(Double.valueOf((double)h.i()));
        final f2.c h2 = this.h;
        Objects.requireNonNull((Object)h2);
        return c.b(Double.valueOf((double)h2.h())).a();
    }
    
    public void F(final boolean b) {
        this.h.k().j(b);
    }
    
    public Boolean F0() {
        final f2.c h = this.h;
        Objects.requireNonNull((Object)h);
        return h.k().g();
    }
    
    public void G0() {
        this.v.G0();
        this.d.G((x$a1)new b2());
    }
    
    public void H(final List list, final List list2, final List list3) {
        this.y.c(list);
        this.y.e(list2);
        this.y.g(list3);
    }
    
    public void H0() {
        if (!this.i) {
            return;
        }
        this.d.H(p3.f.b(this.h.g()), (x$a1)new b2());
    }
    
    public Boolean I() {
        final f2.c h = this.h;
        Objects.requireNonNull((Object)h);
        return h.k().h();
    }
    
    public void J(final LatLngBounds latLngBounds) {
        this.h.s(latLngBounds);
    }
    
    public Boolean K() {
        final f2.c h = this.h;
        Objects.requireNonNull((Object)h);
        return h.k().d();
    }
    
    public Boolean L() {
        final f2.c h = this.h;
        Objects.requireNonNull((Object)h);
        return h.m();
    }
    
    public void N(final boolean b) {
        this.h.k().m(b);
    }
    
    void N0() {
        this.t.a().a((androidx.lifecycle.k)this);
        this.g.a((f)this);
    }
    
    public void O(final boolean l) {
        if (this.l == l) {
            return;
        }
        this.l = l;
        final f2.c h = this.h;
        if (h != null) {
            h.k().o(l);
        }
    }
    
    public void P(final List list, final List list2, final List list3) {
        this.A.b(list);
        this.A.d(list2);
        this.A.h(list3);
    }
    
    public void Q(final boolean n) {
        this.n = n;
        final f2.c h = this.h;
        if (h == null) {
            return;
        }
        h.L(n);
    }
    
    public boolean Q0(final t t) {
        return this.u.q(t.r());
    }
    
    public void R0(final t t, final h2.m m) {
        this.u.k(t, m);
    }
    
    public Boolean S(final String s) {
        return this.u.j(s);
    }
    
    public void S0(final c$f c$f) {
        if (this.h == null) {
            Log.v("GoogleMapController", "Controller was disposed before GoogleMap was ready.");
            return;
        }
        this.v.m(c$f);
    }
    
    public void T(final boolean b) {
        this.h.k().l(b);
    }
    
    public void T0(final e$b e$b) {
        if (this.h == null) {
            Log.v("GoogleMapController", "Controller was disposed before GoogleMap was ready.");
            return;
        }
        this.v.n(e$b);
    }
    
    public x$w0 U(final String s) {
        final a0 f = this.A.f(s);
        if (f == null) {
            return null;
        }
        return new x$w0$a().b(Boolean.valueOf(f.b())).c(Double.valueOf((double)f.c())).e(Double.valueOf((double)f.d())).d(Boolean.valueOf(f.e())).a();
    }
    
    public void V0(final List h) {
        this.H = h;
        if (this.h != null) {
            this.e1();
        }
    }
    
    public void W0(final List e) {
        this.E = e;
        if (this.h != null) {
            this.f1();
        }
    }
    
    public View X() {
        return (View)this.g;
    }
    
    public void X0(final List i) {
        this.I = i;
        if (this.h != null) {
            this.g1();
        }
    }
    
    public void Y(final List list, final List list2, final List list3) {
        this.z.b(list);
        this.z.e(list2);
        this.z.h(list3);
    }
    
    public void Y0(final List d) {
        this.D = d;
        if (this.h != null) {
            this.h1();
        }
    }
    
    public void Z(final x$a1 r) {
        if (this.h == null) {
            this.r = r;
        }
        else {
            r.a();
        }
    }
    
    void Z0(final float n, final float n2, final float n3, final float n4) {
        final List m = this.M;
        if (m == null) {
            this.M = (List)new ArrayList();
        }
        else {
            m.clear();
        }
        this.M.add((Object)n);
        this.M.add((Object)n2);
        this.M.add((Object)n3);
        this.M.add((Object)n4);
    }
    
    public void a() {
        if (this.p) {
            return;
        }
        this.p = true;
        u0.x(this.e, Integer.toString(this.c), (x$b)null);
        a2.p(this.e, Integer.toString(this.c), (x$e)null);
        this.U0(null);
        this.d1(null);
        this.S0(null);
        this.T0(null);
        this.K0();
        final h a = this.t.a();
        if (a != null) {
            a.c((androidx.lifecycle.k)this);
        }
    }
    
    public void a0(final List list, final List list2) {
        this.v.c(list);
        this.v.k(list2);
    }
    
    public void a1(final List f) {
        this.F = f;
        if (this.h != null) {
            this.i1();
        }
    }
    
    public void b(final Bundle bundle) {
        if (this.p) {
            return;
        }
        this.g.b(bundle);
    }
    
    public boolean b0(final h2.m m) {
        return this.u.m(m.a());
    }
    
    public void b1(final List g) {
        this.G = g;
        if (this.h != null) {
            this.j1();
        }
    }
    
    public void c(final Bundle bundle) {
        if (this.p) {
            return;
        }
        this.g.e(bundle);
    }
    
    public void c0(final h2.r r) {
        this.x.f(r.a());
    }
    
    public void c1(final List j) {
        this.J = j;
        if (this.h != null) {
            this.k1();
        }
    }
    
    public void d(final h2.m m) {
        this.u.p(m.a(), m.b());
    }
    
    public void d0(final String s) {
        this.u.i(s);
    }
    
    public void d1(final l l) {
        if (this.h == null) {
            Log.v("GoogleMapController", "Controller was disposed before GoogleMap was ready.");
            return;
        }
        this.C.m((c$j)l);
        this.C.n((c$k)l);
        this.C.k((f2.c$f)l);
    }
    
    public void e(final h2.m m) {
        this.u.o(m.a(), m.b());
    }
    
    public void e0(final x$p x$p) {
        final f2.c h = this.h;
        if (h != null) {
            h.f(p3.f.c(x$p, this.q));
            return;
        }
        throw new x$a("GoogleMap uninitialized", "animateCamera called prior to map initialization", (Object)null);
    }
    
    public void f(final float n, final float n2, final float n3, final float n4) {
        final f2.c h = this.h;
        if (h != null) {
            final float q = this.q;
            h.K((int)(n2 * q), (int)(n * q), (int)(n4 * q), (int)(n3 * q));
        }
        else {
            this.Z0(n, n2, n3, n4);
        }
    }
    
    public void g(final h2.f f) {
        this.y.f(f.a());
    }
    
    public Boolean g0() {
        return this.L;
    }
    
    public void h(final h2.m m) {
        this.u.n(m.a(), m.b());
    }
    
    public void h0(final String k) {
        if (this.h == null) {
            this.K = k;
        }
        else {
            this.l1(k);
        }
    }
    
    public Boolean i() {
        final f2.c h = this.h;
        Objects.requireNonNull((Object)h);
        return h.k().f();
    }
    
    public void i0(final androidx.lifecycle.l l) {
        if (this.p) {
            return;
        }
        this.g.d();
    }
    
    public void j(final x$z0 x$z0) {
        final f2.c h = this.h;
        if (h == null) {
            x$z0.b((Throwable)new x$a("GoogleMap uninitialized", "takeSnapshot", (Object)null));
        }
        else {
            h.M((c$n)new p3.h(x$z0));
        }
    }
    
    public void j0(final List list, final List list2, final List list3) {
        this.u.e(list);
        this.u.g(list2);
        this.u.s(list3);
    }
    
    public List k(final String s) {
        final Set e = this.v.e(s);
        final ArrayList list = new ArrayList(e.size());
        final Iterator iterator = e.iterator();
        while (iterator.hasNext()) {
            ((List)list).add((Object)p3.f.e(s, (a)iterator.next()));
        }
        return (List)list;
    }
    
    public void k0(final boolean i) {
        this.i = i;
    }
    
    public void l(final androidx.lifecycle.l l) {
        if (this.p) {
            return;
        }
        this.g.d();
    }
    
    public void l0(final androidx.lifecycle.l l) {
        if (this.p) {
            return;
        }
        this.g.g();
    }
    
    public void m(final int n) {
        this.h.u(n);
    }
    
    public Boolean m0() {
        return this.f.f();
    }
    
    public Boolean n() {
        final f2.c h = this.h;
        Objects.requireNonNull((Object)h);
        return h.k().b();
    }
    
    public void n0(final LatLng latLng) {
        this.d.M(p3.f.u(latLng), (x$a1)new b2());
    }
    
    public void o(final boolean o) {
        this.o = o;
    }
    
    public x$i0 p(final x$r0 x$r0) {
        final f2.c h = this.h;
        if (h != null) {
            return p3.f.u(h.j().a(p3.f.y(x$r0)));
        }
        throw new x$a("GoogleMap uninitialized", "getLatLng called prior to map initialization", (Object)null);
    }
    
    public void p0(final androidx.lifecycle.l l) {
        if (this.p) {
            return;
        }
        this.g.f();
    }
    
    public void q(final String s) {
        this.u.u(s);
    }
    
    public Double q0() {
        final f2.c h = this.h;
        if (h != null) {
            return (double)h.g().b;
        }
        throw new x$a("GoogleMap uninitialized", "getZoomLevel called prior to map initialization", (Object)null);
    }
    
    public void r(final androidx.lifecycle.l l) {
        l.a().c((androidx.lifecycle.k)this);
        if (this.p) {
            return;
        }
        this.K0();
    }
    
    public x$r0 r0(final x$i0 x$i0) {
        final f2.c h = this.h;
        if (h != null) {
            return p3.f.z(h.j().c(p3.f.t(x$i0)));
        }
        throw new x$a("GoogleMap uninitialized", "getScreenCoordinate called prior to map initialization", (Object)null);
    }
    
    public void s(final androidx.lifecycle.l l) {
        if (this.p) {
            return;
        }
        this.g.b((Bundle)null);
    }
    
    public Boolean s0(final String s) {
        return this.l1(s);
    }
    
    public Boolean t() {
        final f2.c h = this.h;
        Objects.requireNonNull((Object)h);
        return h.k().e();
    }
    
    public void t0(final List list, final List list2, final List list3) {
        this.x.c(list);
        this.x.e(list2);
        this.x.g(list3);
    }
    
    public void u(final int n) {
        this.d.I((x$a1)new b2());
    }
    
    public void u0(final h2.m m) {
        this.u.l(m.a());
    }
    
    public Boolean v() {
        final f2.c h = this.h;
        Objects.requireNonNull((Object)h);
        return h.k().a();
    }
    
    public void v0(final boolean b) {
        this.f.l(b);
    }
    
    public void w(final boolean m) {
        this.m = m;
    }
    
    public void w0(final Float n, final Float n2) {
        this.h.o();
        if (n != null) {
            this.h.w((float)n);
        }
        if (n2 != null) {
            this.h.v((float)n2);
        }
    }
    
    public Boolean x() {
        final f2.c h = this.h;
        Objects.requireNonNull((Object)h);
        return h.k().c();
    }
    
    public void x0(final LatLng latLng) {
        this.d.T(p3.f.u(latLng), (x$a1)new b2());
    }
    
    public void y(final x$l0 x$l0) {
        p3.f.l(x$l0, (m)this);
    }
    
    public void y0(final p p) {
        this.w.f(p.a());
    }
    
    public void z(final boolean k) {
        if (this.k == k) {
            return;
        }
        this.k = k;
        if (this.h != null) {
            this.m1();
        }
    }
    
    public void z0(final f2.c h) {
        (this.h = h).q(this.m);
        this.h.L(this.n);
        this.h.p(this.o);
        this.O0();
        final x$a1 r = this.r;
        if (r != null) {
            r.a();
            this.r = null;
        }
        this.U0((l)this);
        final b b = new b(h);
        this.B = b;
        this.C = b.j();
        this.m1();
        this.u.t(this.C);
        this.v.f(h, this.B);
        this.w.h(h);
        this.x.h(h);
        this.y.h(h);
        this.z.i(h);
        this.A.i(h);
        this.d1((l)this);
        this.S0((c$f)this);
        this.T0((e$b)this);
        this.f1();
        this.h1();
        this.i1();
        this.j1();
        this.e1();
        this.g1();
        this.k1();
        final List m = this.M;
        if (m != null && m.size() == 4) {
            this.f((float)this.M.get(0), (float)this.M.get(1), (float)this.M.get(2), (float)this.M.get(3));
        }
        final String k = this.K;
        if (k != null) {
            this.l1(k);
            this.K = null;
        }
    }
}
