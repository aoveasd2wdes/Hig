package h2;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import q1.o;
import java.util.List;
import com.google.android.gms.maps.model.LatLng;
import android.os.Parcelable$Creator;
import r1.a;

public final class g extends a
{
    public static final Parcelable$Creator<g> CREATOR;
    private LatLng a;
    private double b;
    private float c;
    private int d;
    private int e;
    private float f;
    private boolean g;
    private boolean h;
    private List i;
    
    static {
        CREATOR = (Parcelable$Creator)new n0();
    }
    
    public g() {
        this.a = null;
        this.b = 0.0;
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = null;
    }
    
    g(final LatLng a, final double b, final float c, final int d, final int e, final float f, final boolean g, final boolean h, final List i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public g a(final LatLng a) {
        o.i((Object)a, (Object)"center must not be null.");
        this.a = a;
        return this;
    }
    
    public g b(final boolean h) {
        this.h = h;
        return this;
    }
    
    public g c(final int e) {
        this.e = e;
        return this;
    }
    
    public LatLng d() {
        return this.a;
    }
    
    public int e() {
        return this.e;
    }
    
    public double f() {
        return this.b;
    }
    
    public int g() {
        return this.d;
    }
    
    public List h() {
        return this.i;
    }
    
    public float i() {
        return this.c;
    }
    
    public float j() {
        return this.f;
    }
    
    public boolean k() {
        return this.h;
    }
    
    public boolean l() {
        return this.g;
    }
    
    public g m(final double b) {
        this.b = b;
        return this;
    }
    
    public g n(final int d) {
        this.d = d;
        return this;
    }
    
    public g o(final float c) {
        this.c = c;
        return this;
    }
    
    public g p(final boolean g) {
        this.g = g;
        return this;
    }
    
    public g q(final float f) {
        this.f = f;
        return this;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int a = r1.c.a(parcel);
        r1.c.p(parcel, 2, (Parcelable)this.d(), n, false);
        r1.c.g(parcel, 3, this.f());
        r1.c.h(parcel, 4, this.i());
        r1.c.k(parcel, 5, this.g());
        r1.c.k(parcel, 6, this.e());
        r1.c.h(parcel, 7, this.j());
        r1.c.c(parcel, 8, this.l());
        r1.c.c(parcel, 9, this.k());
        r1.c.t(parcel, 10, this.h(), false);
        r1.c.b(parcel, a);
    }
}
