package g2;

import c2.c;
import c2.i;
import h2.s;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import c2.f;
import h2.q;
import c2.w;
import c2.x;
import h2.g;
import c2.l;
import android.os.Parcelable;
import c2.m;
import h2.b0;
import android.os.IInterface;
import android.os.Parcel;
import c2.r;
import android.os.IBinder;
import c2.a;

public final class h0 extends a implements b
{
    h0(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }
    
    public final boolean A1() {
        final Parcel g = this.G(40, this.J());
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final void B(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(22, j);
    }
    
    public final float B0() {
        final Parcel g = this.G(3, this.J());
        final float float1 = g.readFloat();
        g.recycle();
        return float1;
    }
    
    public final void H0(final g2.r r) {
        final Parcel j = this.J();
        r.d(j, (IInterface)r);
        this.W(30, j);
    }
    
    public final m I1(final b0 b0) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)b0);
        final Parcel g = this.G(13, j);
        final m i = l.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
    
    public final void K0(final g2.l l) {
        final Parcel j = this.J();
        r.d(j, (IInterface)l);
        this.W(28, j);
    }
    
    public final boolean L() {
        final Parcel g = this.G(17, this.J());
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final x M1(final g g) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)g);
        final Parcel g2 = this.G(35, j);
        final x i = w.J(g2.readStrongBinder());
        g2.recycle();
        return i;
    }
    
    public final void N1(final j j) {
        final Parcel i = this.J();
        r.d(i, (IInterface)j);
        this.W(84, i);
    }
    
    public final void O0(final m0 m0) {
        final Parcel j = this.J();
        r.d(j, (IInterface)m0);
        this.W(99, j);
    }
    
    public final void O1(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        this.W(93, j);
    }
    
    public final void P1(final j0 j0) {
        final Parcel i = this.J();
        r.d(i, (IInterface)j0);
        this.W(33, i);
    }
    
    public final void Q(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(18, j);
    }
    
    public final void X1(final x1.b b) {
        final Parcel j = this.J();
        r.d(j, (IInterface)b);
        this.W(4, j);
    }
    
    public final void Y1(final h h) {
        final Parcel j = this.J();
        r.d(j, (IInterface)h);
        this.W(32, j);
    }
    
    public final void a1(final t t) {
        final Parcel j = this.J();
        r.d(j, (IInterface)t);
        this.W(31, j);
    }
    
    public final boolean b0(final h2.l l) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)l);
        final Parcel g = this.G(91, j);
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final float b1() {
        final Parcel g = this.G(2, this.J());
        final float float1 = g.readFloat();
        g.recycle();
        return float1;
    }
    
    public final void b2(final q0 q0) {
        final Parcel j = this.J();
        r.d(j, (IInterface)q0);
        this.W(96, j);
    }
    
    public final void c2(final int n, final int n2, final int n3, final int n4) {
        final Parcel j = this.J();
        j.writeInt(n);
        j.writeInt(n2);
        j.writeInt(n3);
        j.writeInt(n4);
        this.W(39, j);
    }
    
    public final e d1() {
        final Parcel g = this.G(25, this.J());
        final IBinder strongBinder = g.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (queryLocalInterface instanceof e) {
                o = queryLocalInterface;
            }
            else {
                o = new c0(strongBinder);
            }
        }
        g.recycle();
        return (e)o;
    }
    
    public final d d2() {
        final Parcel g = this.G(26, this.J());
        final IBinder strongBinder = g.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (queryLocalInterface instanceof d) {
                o = queryLocalInterface;
            }
            else {
                o = new z(strongBinder);
            }
        }
        g.recycle();
        return (d)o;
    }
    
    public final c2.g e2(final q q) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)q);
        final Parcel g = this.G(10, j);
        final c2.g i = f.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
    
    public final void g1(final s0 s0) {
        final Parcel j = this.J();
        r.d(j, (IInterface)s0);
        this.W(89, j);
    }
    
    public final void g2(final n n) {
        final Parcel j = this.J();
        r.d(j, (IInterface)n);
        this.W(29, j);
    }
    
    public final void h1(final g2.b0 b0, final x1.b b2) {
        final Parcel j = this.J();
        r.d(j, (IInterface)b0);
        r.d(j, (IInterface)b2);
        this.W(38, j);
    }
    
    public final void h2(final float n) {
        final Parcel j = this.J();
        j.writeFloat(n);
        this.W(92, j);
    }
    
    public final void l2(final y y) {
        final Parcel j = this.J();
        r.d(j, (IInterface)y);
        this.W(87, j);
    }
    
    public final void m(final int n) {
        final Parcel j = this.J();
        j.writeInt(n);
        this.W(16, j);
    }
    
    public final void n0(final x1.b b) {
        final Parcel j = this.J();
        r.d(j, (IInterface)b);
        this.W(5, j);
    }
    
    public final void o(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        this.W(41, j);
    }
    
    public final void o0(final g2.w w) {
        final Parcel j = this.J();
        r.d(j, (IInterface)w);
        this.W(85, j);
    }
    
    public final void p1(final LatLngBounds latLngBounds) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)latLngBounds);
        this.W(95, j);
    }
    
    public final CameraPosition q0() {
        final Parcel g = this.G(1, this.J());
        final CameraPosition cameraPosition = (CameraPosition)r.a(g, CameraPosition.CREATOR);
        g.recycle();
        return cameraPosition;
    }
    
    public final void r0() {
        this.W(94, this.J());
    }
    
    public final c2.j t1(final s s) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)s);
        final Parcel g = this.G(9, j);
        final c2.j i = c2.i.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
    
    public final void v0(final o0 o0) {
        final Parcel j = this.J();
        r.d(j, (IInterface)o0);
        this.W(97, j);
    }
    
    public final boolean w(final boolean b) {
        final Parcel j = this.J();
        final int b2 = r.b;
        j.writeInt((int)(b ? 1 : 0));
        final Parcel g = this.G(20, j);
        final boolean e = r.e(g);
        g.recycle();
        return e;
    }
    
    public final c2.d y1(final h2.n n) {
        final Parcel j = this.J();
        r.c(j, (Parcelable)n);
        final Parcel g = this.G(11, j);
        final c2.d i = c.J(g.readStrongBinder());
        g.recycle();
        return i;
    }
}
