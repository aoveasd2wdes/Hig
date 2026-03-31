package f2;

import com.google.android.gms.maps.model.LatLng;
import android.view.View;
import g2.o0;
import g2.m0;
import com.google.android.gms.maps.model.LatLngBounds;
import g2.j0;
import com.google.android.gms.maps.model.CameraPosition;
import h2.a0;
import h2.a;
import h2.m;
import h2.f;
import h2.g;
import g2.b0;
import x1.d;
import android.graphics.Bitmap;
import g2.y;
import g2.t;
import g2.r;
import g2.n;
import g2.l;
import g2.j;
import g2.h;
import g2.s0;
import android.os.RemoteException;
import h2.u;
import g2.q0;
import q1.o;
import java.util.HashMap;
import java.util.Map;
import g2.b;

public class c
{
    private final g2.b a;
    private final Map b;
    private final Map c;
    private f2.i d;
    
    public c(final g2.b b) {
        this.b = (Map)new HashMap();
        this.c = (Map)new HashMap();
        this.a = (g2.b)o.h((Object)b);
    }
    
    public final void A(final d d) {
        Label_0015: {
            if (d != null) {
                break Label_0015;
            }
            try {
                this.a.b2(null);
                return;
                this.a.b2((q0)new w(this, d));
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
    }
    
    public final void B(final e e) {
        Label_0015: {
            if (e != null) {
                break Label_0015;
            }
            try {
                this.a.g1(null);
                return;
                this.a.g1((s0)new s(this, e));
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
    }
    
    public final void C(final f f) {
        Label_0015: {
            if (f != null) {
                break Label_0015;
            }
            try {
                this.a.Y1(null);
                return;
                this.a.Y1((g2.h)new p(this, f));
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
    }
    
    public final void D(final g g) {
        Label_0015: {
            if (g != null) {
                break Label_0015;
            }
            try {
                this.a.N1(null);
                return;
                this.a.N1((g2.j)new q(this, g));
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
    }
    
    public final void E(final h h) {
        Label_0015: {
            if (h != null) {
                break Label_0015;
            }
            try {
                this.a.K0(null);
                return;
                this.a.K0((g2.l)new z(this, h));
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
    }
    
    public final void F(final i i) {
        Label_0015: {
            if (i != null) {
                break Label_0015;
            }
            try {
                this.a.g2(null);
                return;
                this.a.g2((g2.n)new f2.k(this, i));
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
    }
    
    public final void G(final j j) {
        Label_0015: {
            if (j != null) {
                break Label_0015;
            }
            try {
                this.a.H0(null);
                return;
                this.a.H0((r)new f2.j(this, j));
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
    }
    
    public final void H(final k k) {
        Label_0015: {
            if (k != null) {
                break Label_0015;
            }
            try {
                this.a.a1(null);
                return;
                this.a.a1((t)new f2.o(this, k));
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
    }
    
    public final void I(final l l) {
        Label_0015: {
            if (l != null) {
                break Label_0015;
            }
            try {
                this.a.o0(null);
                return;
                this.a.o0((g2.w)new f2.t(this, l));
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
    }
    
    public final void J(final m m) {
        Label_0015: {
            if (m != null) {
                break Label_0015;
            }
            try {
                this.a.l2(null);
                return;
                this.a.l2((y)new f2.u(this, m));
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
    }
    
    public final void K(final int n, final int n2, final int n3, final int n4) {
        try {
            this.a.c2(n, n2, n3, n4);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final void L(final boolean b) {
        try {
            this.a.Q(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final void M(final n n) {
        o.i((Object)n, (Object)"Callback must not be null.");
        this.N(n, null);
    }
    
    public final void N(final n n, final Bitmap bitmap) {
        o.i((Object)n, (Object)"Callback must not be null.");
        Object u2;
        if (bitmap != null) {
            u2 = x1.d.u2((Object)bitmap);
        }
        else {
            u2 = null;
        }
        final x1.d d = (x1.d)u2;
        try {
            this.a.h1((b0)new v(this, n), (x1.b)d);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final h2.f a(final h2.g g) {
        try {
            o.i((Object)g, (Object)"CircleOptions must not be null.");
            return new h2.f(this.a.M1(g));
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final h2.m b(final h2.n n) {
        try {
            o.i((Object)n, (Object)"MarkerOptions must not be null.");
            final c2.d y1 = this.a.y1(n);
            if (y1 != null) {
                Object o;
                if (n.A() == 1) {
                    o = new h2.a(y1);
                }
                else {
                    o = new h2.m(y1);
                }
                return (h2.m)o;
            }
            return null;
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final h2.p c(final h2.q q) {
        try {
            o.i((Object)q, (Object)"PolygonOptions must not be null");
            return new h2.p(this.a.e2(q));
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final h2.r d(final h2.s s) {
        try {
            o.i((Object)s, (Object)"PolylineOptions must not be null");
            return new h2.r(this.a.t1(s));
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final a0 e(final h2.b0 b0) {
        try {
            o.i((Object)b0, (Object)"TileOverlayOptions must not be null.");
            final c2.m i1 = this.a.I1(b0);
            if (i1 != null) {
                return new a0(i1);
            }
            return null;
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final void f(final f2.a a) {
        try {
            o.i((Object)a, (Object)"CameraUpdate must not be null.");
            this.a.n0(a.a());
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final CameraPosition g() {
        try {
            return this.a.q0();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final float h() {
        try {
            return this.a.b1();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final float i() {
        try {
            return this.a.B0();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final f2.h j() {
        try {
            return new f2.h(this.a.d2());
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final f2.i k() {
        try {
            if (this.d == null) {
                this.d = new f2.i(this.a.d1());
            }
            return this.d;
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final boolean l() {
        try {
            return this.a.A1();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final boolean m() {
        try {
            return this.a.L();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final void n(final f2.a a) {
        try {
            o.i((Object)a, (Object)"CameraUpdate must not be null.");
            this.a.X1(a.a());
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void o() {
        try {
            this.a.r0();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final void p(final boolean b) {
        try {
            this.a.o(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final boolean q(final boolean b) {
        try {
            return this.a.w(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final void r(final a a) {
        Label_0015: {
            if (a != null) {
                break Label_0015;
            }
            try {
                this.a.P1(null);
                return;
                this.a.P1((j0)new f2.r(this, a));
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
    }
    
    public void s(final LatLngBounds latLngBounds) {
        try {
            this.a.p1(latLngBounds);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public boolean t(final h2.l l) {
        try {
            return this.a.b0(l);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final void u(final int n) {
        try {
            this.a.m(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void v(final float n) {
        try {
            this.a.O1(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void w(final float n) {
        try {
            this.a.h2(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final void x(final boolean b) {
        try {
            this.a.B(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final void y(final b b) {
        Label_0015: {
            if (b != null) {
                break Label_0015;
            }
            try {
                this.a.O0(null);
                return;
                this.a.O0((m0)new f2.y(this, b));
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
    }
    
    public final void z(final c c) {
        Label_0015: {
            if (c != null) {
                break Label_0015;
            }
            try {
                this.a.v0(null);
                return;
                this.a.v0((o0)new x(this, c));
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
    }
    
    public interface a
    {
        View a(final h2.m p0);
        
        View c(final h2.m p0);
    }
    
    public interface b
    {
        void G0();
    }
    
    public interface c
    {
        void H0();
    }
    
    public interface d
    {
        void u(final int p0);
    }
    
    public interface e
    {
        void g(final h2.f p0);
    }
    
    public interface f
    {
        void u0(final h2.m p0);
    }
    
    public interface g
    {
        void b(final h2.m p0);
    }
    
    public interface h
    {
        void x0(final LatLng p0);
    }
    
    public interface i
    {
        void n0(final LatLng p0);
    }
    
    public interface j
    {
        boolean b0(final h2.m p0);
    }
    
    public interface k
    {
        void d(final h2.m p0);
        
        void e(final h2.m p0);
        
        void h(final h2.m p0);
    }
    
    public interface l
    {
        void y0(final h2.p p0);
    }
    
    public interface m
    {
        void c0(final h2.r p0);
    }
    
    public interface n
    {
        void a(final Bitmap p0);
    }
}
