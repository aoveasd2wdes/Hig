package b2;

import com.google.android.gms.common.api.internal.c$a;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;
import com.google.android.gms.location.LocationRequest;
import e2.v;
import e2.d;
import p1.c;
import q1.e;
import android.os.Looper;
import android.content.Context;
import p.g;
import q1.h;

public final class e0 extends h
{
    private final g I;
    private final g J;
    private final g K;
    private final g L;
    
    public e0(final Context context, final Looper looper, final e e, final c c, final p1.h h) {
        super(context, looper, 23, e, c, h);
        this.I = new g();
        this.J = new g();
        this.K = new g();
        this.L = new g();
    }
    
    private final boolean j0(final n1.c c) {
        final n1.c[] b = this.b();
        if (b != null) {
            int i = 0;
            while (true) {
                while (i < b.length) {
                    final n1.c c2 = b[i];
                    if (c.a().equals((Object)c2.a())) {
                        if (c2 == null) {
                            return false;
                        }
                        if (c2.b() >= c.b()) {
                            return true;
                        }
                        return false;
                    }
                    else {
                        ++i;
                    }
                }
                final n1.c c2 = null;
                continue;
            }
        }
        return false;
    }
    
    protected final String D() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }
    
    protected final String E() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
    
    public final void L(final int n) {
        super.L(n);
        final g i = this.I;
        synchronized (i) {
            this.I.clear();
            monitorexit(i);
            synchronized (this.J) {
                this.J.clear();
                monitorexit(i);
                final g k = this.K;
                synchronized (k) {
                    this.K.clear();
                }
            }
        }
    }
    
    public final boolean Q() {
        return true;
    }
    
    public final void k0(final d d, final k2.h h) {
        if (this.j0(v.j)) {
            ((h1)this.C()).c0(d, g0.b((j1)new x(h)));
            return;
        }
        if (this.j0(v.f)) {
            ((h1)this.C()).W1(d, (j1)new x(h));
            return;
        }
        h.c((Object)((h1)this.C()).Z0());
    }
    
    public final void l0(final z z, final LocationRequest locationRequest, final k2.h h) {
        final com.google.android.gms.common.api.internal.c l = z.l();
        final c$a b = l.b();
        Objects.requireNonNull((Object)b);
        final boolean j0 = this.j0(v.j);
        final g i = this.J;
        synchronized (i) {
            d0 d0 = (d0)this.J.get((Object)b);
            Object o;
            if (d0 != null && !j0) {
                d0.W(l);
                o = d0;
                d0 = null;
            }
            else {
                final d0 d2 = new d0(z);
                this.J.put((Object)b, (Object)d2);
                o = d2;
            }
            if (j0) {
                ((h1)this.C()).h0(g0.a((IInterface)d0, (e2.z)o, b.a()), locationRequest, (p1.d)new w((Object)null, h));
            }
            else {
                ((h1)this.C()).l0(new k0(1, i0.a((String)null, locationRequest), (IBinder)null, (IBinder)o, (PendingIntent)null, (IBinder)new u(h, (e2.z)o), b.a()));
            }
        }
    }
    
    public final void m0(final c$a c$a, final boolean b, final k2.h h) {
        final g j = this.J;
        synchronized (j) {
            final d0 d0 = (d0)this.J.remove((Object)c$a);
            if (d0 == null) {
                h.c((Object)Boolean.FALSE);
                return;
            }
            d0.u2();
            if (b) {
                if (this.j0(v.j)) {
                    final h1 h2 = (h1)this.C();
                    final int identityHashCode = System.identityHashCode((Object)d0);
                    final StringBuilder sb = new StringBuilder(String.valueOf(identityHashCode).length() + 18);
                    sb.append("ILocationCallback@");
                    sb.append(identityHashCode);
                    h2.i1(g0.a((IInterface)null, (e2.z)d0, sb.toString()), (p1.d)new w((Object)Boolean.TRUE, h));
                }
                else {
                    ((h1)this.C()).l0(new k0(2, (i0)null, (IBinder)null, (IBinder)d0, (PendingIntent)null, (IBinder)new y((Object)Boolean.TRUE, h), (String)null));
                }
            }
            else {
                h.c((Object)Boolean.TRUE);
            }
        }
    }
    
    public final int p() {
        return 11717000;
    }
    
    public final n1.c[] u() {
        return v.p;
    }
}
