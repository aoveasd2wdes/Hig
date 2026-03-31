package q1;

import java.util.Collection;
import java.util.concurrent.Executor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import android.accounts.Account;
import android.os.IBinder;
import android.os.DeadObjectException;
import java.util.Set;
import android.os.Bundle;
import android.content.ServiceConnection;
import android.util.Log;
import android.text.TextUtils;
import n1.a;
import java.util.ArrayList;
import android.os.IInterface;
import android.os.Handler;
import android.os.Looper;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c
{
    public static final String[] D;
    private static final c[] E;
    private boolean A;
    private volatile y0 B;
    protected AtomicInteger C;
    private int a;
    private long b;
    private long c;
    private int d;
    private long e;
    private volatile String f;
    j1 g;
    private final Context h;
    private final Looper i;
    private final i j;
    private final n1.i k;
    final Handler l;
    private final Object m;
    private final Object n;
    private l o;
    protected c p;
    private IInterface q;
    private final ArrayList r;
    private v0 s;
    private int t;
    private final a u;
    private final b v;
    private final int w;
    private final String x;
    private volatile String y;
    private n1.a z;
    
    static {
        E = new c[0];
        D = new String[] { "service_esmobile", "service_googleme" };
    }
    
    protected c(final Context h, final Looper i, final i j, final n1.i k, final int w, final a u, final b v, final String x) {
        this.f = null;
        this.m = new Object();
        this.n = new Object();
        this.r = new ArrayList();
        this.t = 1;
        this.z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        q1.o.i(h, "Context must not be null");
        this.h = h;
        q1.o.i(i, "Looper must not be null");
        this.i = i;
        q1.o.i(j, "Supervisor must not be null");
        this.j = j;
        q1.o.i(k, "API availability must not be null");
        this.k = k;
        this.l = (Handler)new s0(this, i);
        this.w = w;
        this.u = u;
        this.v = v;
        this.x = x;
    }
    
    private final void g0(final int t, final IInterface q) {
        boolean b = false;
        if (t == 4 == (q != null)) {
            b = true;
        }
        q1.o.a(b);
        final Object m = this.m;
        synchronized (m) {
            this.t = t;
            this.q = q;
            if (t != 1) {
                if (t != 2 && t != 3) {
                    if (t == 4) {
                        q1.o.h(q);
                        this.J(q);
                    }
                }
                else {
                    final v0 s = this.s;
                    if (s != null) {
                        final j1 g = this.g;
                        if (g != null) {
                            final String b2 = g.b();
                            final String a = g.a();
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Calling connect() while still connected, missing disconnect() for ");
                            sb.append(b2);
                            sb.append(" on ");
                            sb.append(a);
                            Log.e("GmsClient", sb.toString());
                            final i j = this.j;
                            final String b3 = this.g.b();
                            q1.o.h(b3);
                            j.d(b3, this.g.a(), 4225, (ServiceConnection)s, this.V(), this.g.c());
                            this.C.incrementAndGet();
                        }
                    }
                    final v0 s2 = new v0(this, this.C.get());
                    this.s = s2;
                    j1 g2;
                    if (this.t == 3 && this.A() != null) {
                        g2 = new j1(this.x().getPackageName(), this.A(), true, 4225, false);
                    }
                    else {
                        g2 = new j1(this.F(), this.E(), false, 4225, this.H());
                    }
                    this.g = g2;
                    if (g2.c() && this.p() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((Object)this.g.b())));
                    }
                    final i i = this.j;
                    final String b4 = this.g.b();
                    q1.o.h(b4);
                    if (!i.e(new c1(b4, this.g.a(), 4225, this.g.c()), (ServiceConnection)s2, this.V(), this.v())) {
                        final String b5 = this.g.b();
                        final String a2 = this.g.a();
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("unable to connect to service: ");
                        sb2.append(b5);
                        sb2.append(" on ");
                        sb2.append(a2);
                        Log.w("GmsClient", sb2.toString());
                        this.c0(16, null, this.C.get());
                    }
                }
            }
            else {
                final v0 s3 = this.s;
                if (s3 != null) {
                    final i k = this.j;
                    final String b6 = this.g.b();
                    q1.o.h(b6);
                    k.d(b6, this.g.a(), 4225, (ServiceConnection)s3, this.V(), this.g.c());
                    this.s = null;
                }
            }
        }
    }
    
    protected String A() {
        return null;
    }
    
    protected abstract Set B();
    
    public final IInterface C() {
        final Object m = this.m;
        synchronized (m) {
            if (this.t != 5) {
                this.q();
                final IInterface q = this.q;
                q1.o.i(q, "Client is connected but service is null");
                return q;
            }
            throw new DeadObjectException();
        }
    }
    
    protected abstract String D();
    
    protected abstract String E();
    
    protected String F() {
        return "com.google.android.gms";
    }
    
    public f G() {
        final y0 b = this.B;
        if (b == null) {
            return null;
        }
        return b.d;
    }
    
    protected boolean H() {
        return this.p() >= 211700000;
    }
    
    public boolean I() {
        return this.B != null;
    }
    
    protected void J(final IInterface interface1) {
        this.c = System.currentTimeMillis();
    }
    
    protected void K(final n1.a a) {
        this.d = a.a();
        this.e = System.currentTimeMillis();
    }
    
    protected void L(final int a) {
        this.a = a;
        this.b = System.currentTimeMillis();
    }
    
    protected void M(final int n, final IBinder binder, final Bundle bundle, final int n2) {
        this.l.sendMessage(this.l.obtainMessage(1, n2, -1, (Object)new w0(this, n, binder, bundle)));
    }
    
    public boolean N() {
        return false;
    }
    
    public void O(final String y) {
        this.y = y;
    }
    
    public void P(final int n) {
        this.l.sendMessage(this.l.obtainMessage(6, this.C.get(), n));
    }
    
    public boolean Q() {
        return false;
    }
    
    protected final String V() {
        String s;
        if ((s = this.x) == null) {
            s = this.h.getClass().getName();
        }
        return s;
    }
    
    public boolean a() {
        final Object m = this.m;
        synchronized (m) {
            final int t = this.t;
            boolean b = true;
            if (t != 2) {
                b = (t == 3 && b);
            }
            return b;
        }
    }
    
    public final c[] b() {
        final y0 b = this.B;
        if (b == null) {
            return null;
        }
        return b.b;
    }
    
    public boolean c() {
        final Object m = this.m;
        synchronized (m) {
            return this.t == 4;
        }
    }
    
    protected final void c0(final int n, final Bundle bundle, final int n2) {
        this.l.sendMessage(this.l.obtainMessage(7, n2, -1, (Object)new x0(this, n, (Bundle)null)));
    }
    
    public String d() {
        if (this.c()) {
            final j1 g = this.g;
            if (g != null) {
                return g.a();
            }
        }
        throw new RuntimeException("Failed to connect when checking package");
    }
    
    public void e(final c p) {
        q1.o.i(p, "Connection progress callbacks cannot be null.");
        this.p = p;
        this.g0(2, null);
    }
    
    public void f(j n, final Set set) {
        final Bundle z = this.z();
        final String y = this.y;
        final int a = n1.i.a;
        final Scope[] o = q1.g.o;
        final Bundle bundle = new Bundle();
        final int w = this.w;
        final c[] p2 = q1.g.p;
        final g g = new g(6, w, a, (String)null, (IBinder)null, o, bundle, (Account)null, p2, p2, true, 0, false, y);
        g.d = this.h.getPackageName();
        g.g = z;
        if (set != null) {
            g.f = (Scope[])((Collection)set).toArray((Object[])new Scope[0]);
        }
        if (this.k()) {
            Account t;
            if ((t = this.t()) == null) {
                t = new Account("<<default account>>", "com.google");
            }
            g.h = t;
            if (n != null) {
                g.e = ((IInterface)n).asBinder();
            }
        }
        else if (this.N()) {
            g.h = this.t();
        }
        g.i = q1.c.E;
        g.j = this.u();
        if (this.Q()) {
            g.m = true;
        }
        try {
            n = (RuntimeException)this.n;
            synchronized (n) {
                final l o2 = this.o;
                if (o2 != null) {
                    o2.Y0((k)new u0(this, this.C.get()), g);
                }
                else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        }
        catch (final RuntimeException n) {
            goto Label_0292;
        }
        catch (final RemoteException ex) {}
        catch (final SecurityException ex2) {
            throw ex2;
        }
        catch (final DeadObjectException ex3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", (Throwable)ex3);
            this.P(3);
        }
    }
    
    public String g() {
        return this.f;
    }
    
    public void i() {
        this.C.incrementAndGet();
        final ArrayList r = this.r;
        synchronized (r) {
            for (int size = this.r.size(), i = 0; i < size; ++i) {
                ((t0)this.r.get(i)).d();
            }
            this.r.clear();
            monitorexit(r);
            synchronized (this.n) {
                this.o = null;
                monitorexit(r);
                this.g0(1, null);
            }
        }
    }
    
    public void j(final String f) {
        this.f = f;
        this.i();
    }
    
    public boolean k() {
        return false;
    }
    
    public void m(final e e) {
        e.a();
    }
    
    public boolean o() {
        return true;
    }
    
    public abstract int p();
    
    protected final void q() {
        if (this.c()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
    
    protected abstract IInterface r(final IBinder p0);
    
    protected boolean s() {
        return false;
    }
    
    public abstract Account t();
    
    public c[] u() {
        return q1.c.E;
    }
    
    protected abstract Executor v();
    
    public Bundle w() {
        return null;
    }
    
    public final Context x() {
        return this.h;
    }
    
    public int y() {
        return this.w;
    }
    
    protected Bundle z() {
        return new Bundle();
    }
    
    public interface a
    {
        void G(final int p0);
        
        void W(final Bundle p0);
    }
    
    public interface b
    {
        void J(final n1.a p0);
    }
    
    public interface c
    {
        void c(final n1.a p0);
    }
    
    public interface e
    {
        void a();
    }
}
