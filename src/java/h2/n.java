package h2;

import android.os.IInterface;
import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import x1.d;
import x1.b$a;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import android.os.Parcelable$Creator;
import r1.a;

public class n extends a
{
    public static final Parcelable$Creator<n> CREATOR;
    private LatLng a;
    private String b;
    private String c;
    private b d;
    private float e;
    private float f;
    private boolean g;
    private boolean h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private int o;
    private View p;
    private int q;
    private String r;
    private float s;
    
    static {
        CREATOR = (Parcelable$Creator)new r0();
    }
    
    public n() {
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = 0.0f;
        this.k = 0.5f;
        this.l = 0.0f;
        this.m = 1.0f;
        this.o = 0;
    }
    
    n(final LatLng a, final String b, final String c, final IBinder binder, final float e, final float f, final boolean g, final boolean h, final boolean i, final float j, final float k, final float l, final float m, final float n, final int o, final IBinder binder2, final int q, final String r, final float s) {
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = 0.0f;
        this.k = 0.5f;
        this.l = 0.0f;
        this.m = 1.0f;
        this.o = 0;
        this.a = a;
        this.b = b;
        this.c = c;
        View p19 = null;
        if (binder == null) {
            this.d = null;
        }
        else {
            this.d = new b(b$a.J(binder));
        }
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
        this.q = q;
        this.o = o;
        final x1.b j2 = b$a.J(binder2);
        if (j2 != null) {
            p19 = (View)x1.d.W(j2);
        }
        this.p = p19;
        this.r = r;
        this.s = s;
    }
    
    public final int A() {
        return this.q;
    }
    
    public n a(final float m) {
        this.m = m;
        return this;
    }
    
    public n b(final float e, final float f) {
        this.e = e;
        this.f = f;
        return this;
    }
    
    public n c(final boolean g) {
        this.g = g;
        return this;
    }
    
    public n d(final boolean i) {
        this.i = i;
        return this;
    }
    
    public float e() {
        return this.m;
    }
    
    public float f() {
        return this.e;
    }
    
    public float g() {
        return this.f;
    }
    
    public b h() {
        return this.d;
    }
    
    public float i() {
        return this.k;
    }
    
    public float j() {
        return this.l;
    }
    
    public LatLng k() {
        return this.a;
    }
    
    public float l() {
        return this.j;
    }
    
    public String m() {
        return this.c;
    }
    
    public String n() {
        return this.b;
    }
    
    public float o() {
        return this.n;
    }
    
    public n p(final b d) {
        this.d = d;
        return this;
    }
    
    public n q(final float k, final float l) {
        this.k = k;
        this.l = l;
        return this;
    }
    
    public boolean r() {
        return this.g;
    }
    
    public boolean s() {
        return this.i;
    }
    
    public boolean t() {
        return this.h;
    }
    
    public n u(final LatLng a) {
        if (a != null) {
            this.a = a;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }
    
    public n v(final float j) {
        this.j = j;
        return this;
    }
    
    public n w(final String c) {
        this.c = c;
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final int a = r1.c.a(parcel);
        r1.c.p(parcel, 2, (Parcelable)this.k(), n, false);
        r1.c.q(parcel, 3, this.n(), false);
        r1.c.q(parcel, 4, this.m(), false);
        final b d = this.d;
        IBinder binder;
        if (d == null) {
            binder = null;
        }
        else {
            binder = ((IInterface)d.a()).asBinder();
        }
        r1.c.j(parcel, 5, binder, false);
        r1.c.h(parcel, 6, this.f());
        r1.c.h(parcel, 7, this.g());
        r1.c.c(parcel, 8, this.r());
        r1.c.c(parcel, 9, this.t());
        r1.c.c(parcel, 10, this.s());
        r1.c.h(parcel, 11, this.l());
        r1.c.h(parcel, 12, this.i());
        r1.c.h(parcel, 13, this.j());
        r1.c.h(parcel, 14, this.e());
        r1.c.h(parcel, 15, this.o());
        r1.c.k(parcel, 17, this.o);
        r1.c.j(parcel, 18, ((IInterface)x1.d.u2((Object)this.p)).asBinder(), false);
        r1.c.k(parcel, 19, this.q);
        r1.c.q(parcel, 20, this.r, false);
        r1.c.h(parcel, 21, this.s);
        r1.c.b(parcel, a);
    }
    
    public n x(final String b) {
        this.b = b;
        return this;
    }
    
    public n y(final boolean h) {
        this.h = h;
        return this;
    }
    
    public n z(final float n) {
        this.n = n;
        return this;
    }
}
