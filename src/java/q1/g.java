package q1;

import android.os.Parcel;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import n1.c;
import com.google.android.gms.common.api.Scope;
import android.os.Parcelable$Creator;
import r1.a;

public class g extends a
{
    public static final Parcelable$Creator<g> CREATOR;
    static final Scope[] o;
    static final c[] p;
    final int a;
    final int b;
    final int c;
    String d;
    IBinder e;
    Scope[] f;
    Bundle g;
    Account h;
    c[] i;
    c[] j;
    final boolean k;
    final int l;
    boolean m;
    private final String n;
    
    static {
        CREATOR = (Parcelable$Creator)new b1();
        o = new Scope[0];
        p = new c[0];
    }
    
    g(final int a, final int b, final int c, final String d, final IBinder e, final Scope[] array, final Bundle bundle, final Account h, c[] p14, final c[] array2, final boolean k, final int l, final boolean m, final String n) {
        Scope[] o = array;
        if (array == null) {
            o = q1.g.o;
        }
        Bundle g;
        if ((g = bundle) == null) {
            g = new Bundle();
        }
        c[] p15;
        if ((p15 = p14) == null) {
            p15 = q1.g.p;
        }
        if ((p14 = array2) == null) {
            p14 = q1.g.p;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        if ("com.google.android.gms".equals((Object)d)) {
            this.d = "com.google.android.gms";
        }
        else {
            this.d = d;
        }
        if (a < 2) {
            Account w;
            if (e != null) {
                w = q1.a.W(q1.j.a.J(e));
            }
            else {
                w = null;
            }
            this.h = w;
        }
        else {
            this.e = e;
            this.h = h;
        }
        this.f = o;
        this.g = g;
        this.i = p15;
        this.j = p14;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    public final String a() {
        return this.n;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        b1.a(this, parcel, n);
    }
}
