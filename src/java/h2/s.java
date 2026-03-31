package h2;

import android.os.Parcelable;
import r1.c;
import android.os.Parcel;
import java.util.Iterator;
import q1.o;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import r1.a;

public final class s extends a
{
    public static final Parcelable$Creator<s> CREATOR;
    private final List a;
    private float b;
    private int c;
    private float d;
    private boolean e;
    private boolean f;
    private boolean g;
    private e h;
    private e i;
    private int j;
    private List k;
    private List l;
    
    static {
        CREATOR = (Parcelable$Creator)new u0();
    }
    
    public s() {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = 0.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = (e)new d();
        this.i = (e)new d();
        this.j = 0;
        this.k = null;
        this.l = (List)new ArrayList();
        this.a = (List)new ArrayList();
    }
    
    s(final List a, final float b, final int c, final float d, final boolean e, final boolean f, final boolean g, final e h, final e i, final int j, final List k, final List l) {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = 0.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = (e)new d();
        this.i = (e)new d();
        this.j = 0;
        this.k = null;
        this.l = (List)new ArrayList();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        if (h != null) {
            this.h = h;
        }
        if (i != null) {
            this.i = i;
        }
        this.j = j;
        this.k = k;
        if (l != null) {
            this.l = l;
        }
    }
    
    public s a(final Iterable iterable) {
        o.i((Object)iterable, (Object)"points must not be null.");
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.a.add((Object)iterator.next());
        }
        return this;
    }
    
    public s b(final boolean g) {
        this.g = g;
        return this;
    }
    
    public s c(final int c) {
        this.c = c;
        return this;
    }
    
    public s d(final e e) {
        this.i = (e)o.i((Object)e, (Object)"endCap must not be null");
        return this;
    }
    
    public s e(final boolean f) {
        this.f = f;
        return this;
    }
    
    public int f() {
        return this.c;
    }
    
    public e g() {
        return this.i.a();
    }
    
    public int h() {
        return this.j;
    }
    
    public List i() {
        return this.k;
    }
    
    public List j() {
        return this.a;
    }
    
    public e k() {
        return this.h.a();
    }
    
    public float l() {
        return this.b;
    }
    
    public float m() {
        return this.d;
    }
    
    public boolean n() {
        return this.g;
    }
    
    public boolean o() {
        return this.f;
    }
    
    public boolean p() {
        return this.e;
    }
    
    public s q(final int j) {
        this.j = j;
        return this;
    }
    
    public s r(final List k) {
        this.k = k;
        return this;
    }
    
    public s s(final e e) {
        this.h = (e)o.i((Object)e, (Object)"startCap must not be null");
        return this;
    }
    
    public s t(final boolean e) {
        this.e = e;
        return this;
    }
    
    public s u(final float b) {
        this.b = b;
        return this;
    }
    
    public s v(final float d) {
        this.d = d;
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final int a = r1.c.a(parcel);
        r1.c.t(parcel, 2, this.j(), false);
        r1.c.h(parcel, 3, this.l());
        r1.c.k(parcel, 4, this.f());
        r1.c.h(parcel, 5, this.m());
        r1.c.c(parcel, 6, this.p());
        r1.c.c(parcel, 7, this.o());
        r1.c.c(parcel, 8, this.n());
        r1.c.p(parcel, 9, (Parcelable)this.k(), n, false);
        r1.c.p(parcel, 10, (Parcelable)this.g(), n, false);
        r1.c.k(parcel, 11, this.h());
        r1.c.t(parcel, 12, this.i(), false);
        final ArrayList list = new ArrayList(this.l.size());
        for (final y y : this.l) {
            final x$a x$a = new x$a(y.b());
            x$a.c(this.b);
            x$a.b(this.e);
            ((List)list).add((Object)new y(x$a.a(), y.a()));
        }
        r1.c.t(parcel, 13, (List)list, false);
        r1.c.b(parcel, a);
    }
}
