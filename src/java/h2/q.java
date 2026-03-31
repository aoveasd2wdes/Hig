package h2;

import r1.c;
import android.os.Parcel;
import java.util.Iterator;
import q1.o;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import r1.a;

public final class q extends a
{
    public static final Parcelable$Creator<q> CREATOR;
    private final List a;
    private final List b;
    private float c;
    private int d;
    private int e;
    private float f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private List k;
    
    static {
        CREATOR = (Parcelable$Creator)new t0();
    }
    
    public q() {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.a = (List)new ArrayList();
        this.b = (List)new ArrayList();
    }
    
    q(final List a, final List b, final float c, final int d, final int e, final float f, final boolean g, final boolean h, final boolean i, final int j, final List k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public q a(final Iterable iterable) {
        o.i((Object)iterable, (Object)"points must not be null.");
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.a.add((Object)iterator.next());
        }
        return this;
    }
    
    public q b(final Iterable iterable) {
        o.i((Object)iterable, (Object)"points must not be null.");
        final ArrayList list = new ArrayList();
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            list.add((Object)iterator.next());
        }
        this.b.add((Object)list);
        return this;
    }
    
    public q c(final boolean i) {
        this.i = i;
        return this;
    }
    
    public q d(final int e) {
        this.e = e;
        return this;
    }
    
    public q e(final boolean h) {
        this.h = h;
        return this;
    }
    
    public int f() {
        return this.e;
    }
    
    public List g() {
        return this.a;
    }
    
    public int h() {
        return this.d;
    }
    
    public int i() {
        return this.j;
    }
    
    public List j() {
        return this.k;
    }
    
    public float k() {
        return this.c;
    }
    
    public float l() {
        return this.f;
    }
    
    public boolean m() {
        return this.i;
    }
    
    public boolean n() {
        return this.h;
    }
    
    public boolean o() {
        return this.g;
    }
    
    public q p(final int d) {
        this.d = d;
        return this;
    }
    
    public q q(final float c) {
        this.c = c;
        return this;
    }
    
    public q r(final boolean g) {
        this.g = g;
        return this;
    }
    
    public q s(final float f) {
        this.f = f;
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, int a) {
        a = r1.c.a(parcel);
        r1.c.t(parcel, 2, this.g(), false);
        r1.c.n(parcel, 3, this.b, false);
        r1.c.h(parcel, 4, this.k());
        r1.c.k(parcel, 5, this.h());
        r1.c.k(parcel, 6, this.f());
        r1.c.h(parcel, 7, this.l());
        r1.c.c(parcel, 8, this.o());
        r1.c.c(parcel, 9, this.n());
        r1.c.c(parcel, 10, this.m());
        r1.c.k(parcel, 11, this.i());
        r1.c.t(parcel, 12, this.j(), false);
        r1.c.b(parcel, a);
    }
}
