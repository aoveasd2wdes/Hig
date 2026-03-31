package h2;

import android.os.IInterface;
import r1.c;
import android.os.Parcel;
import c2.o;
import android.os.IBinder;
import c2.p;
import android.os.Parcelable$Creator;
import r1.a;

public final class b0 extends a
{
    public static final Parcelable$Creator<b0> CREATOR;
    private p a;
    private c0 b;
    private boolean c;
    private float d;
    private boolean e;
    private float f;
    
    static {
        CREATOR = (Parcelable$Creator)new k0();
    }
    
    public b0() {
        this.c = true;
        this.e = true;
        this.f = 0.0f;
    }
    
    b0(final IBinder binder, final boolean c, final float d, final boolean e, final float f) {
        this.c = true;
        this.e = true;
        this.f = 0.0f;
        final p j = o.J(binder);
        this.a = j;
        Object b;
        if (j == null) {
            b = null;
        }
        else {
            b = new i0(this);
        }
        this.b = (c0)b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public b0 a(final boolean e) {
        this.e = e;
        return this;
    }
    
    public boolean b() {
        return this.e;
    }
    
    public float c() {
        return this.f;
    }
    
    public float d() {
        return this.d;
    }
    
    public boolean e() {
        return this.c;
    }
    
    public b0 f(final c0 c0) {
        this.b = (c0)q1.o.i((Object)c0, (Object)"tileProvider must not be null.");
        this.a = (p)new j0(this, c0);
        return this;
    }
    
    public b0 g(final float f) {
        boolean b = false;
        if (f >= 0.0f) {
            b = b;
            if (f <= 1.0f) {
                b = true;
            }
        }
        q1.o.b(b, (Object)"Transparency must be in the range [0..1]");
        this.f = f;
        return this;
    }
    
    public b0 h(final boolean c) {
        this.c = c;
        return this;
    }
    
    public b0 i(final float d) {
        this.d = d;
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, int a) {
        a = r1.c.a(parcel);
        final p a2 = this.a;
        IBinder binder;
        if (a2 == null) {
            binder = null;
        }
        else {
            binder = ((IInterface)a2).asBinder();
        }
        r1.c.j(parcel, 2, binder, false);
        r1.c.c(parcel, 3, this.e());
        r1.c.h(parcel, 4, this.d());
        r1.c.c(parcel, 5, this.b());
        r1.c.h(parcel, 6, this.c());
        r1.c.b(parcel, a);
    }
}
