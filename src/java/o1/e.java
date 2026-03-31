package o1;

import p1.a0;
import android.os.Handler;
import q1.c;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.c$a;
import java.util.Collection;
import java.util.Collections;
import android.accounts.Account;
import q1.e$a;
import k2.h;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.GoogleApiActivity;
import android.os.Build$VERSION;
import q1.o;
import android.app.Activity;
import p1.j;
import android.os.Looper;
import p1.b;
import android.content.Context;

public abstract class e
{
    private final Context a;
    private final String b;
    private final o1.a c;
    private final o1.a.d d;
    private final b e;
    private final Looper f;
    private final int g;
    private final f h;
    private final j i;
    protected final com.google.android.gms.common.api.internal.b j;
    
    public e(final Activity activity, final o1.a a, final o1.a.d d, final a a2) {
        this((Context)activity, activity, a, d, a2);
    }
    
    private e(final Context context, final Activity activity, final o1.a c, final o1.a.d d, final a a) {
        o.i((Object)context, (Object)"Null context is not permitted.");
        o.i((Object)c, (Object)"Api must not be null.");
        o.i((Object)a, (Object)"Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        final Context a2 = (Context)o.i((Object)context.getApplicationContext(), (Object)"The provided context did not have an application context.");
        this.a = a2;
        String b;
        if (Build$VERSION.SDK_INT >= 30) {
            b = o1.d.a(context);
        }
        else {
            b = this.k(context);
        }
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = a.b;
        final b a3 = p1.b.a(c, d, b);
        this.e = a3;
        this.h = (f)new p1.o(this);
        final com.google.android.gms.common.api.internal.b t = com.google.android.gms.common.api.internal.b.t(a2);
        this.j = t;
        this.g = t.k();
        this.i = a.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            k.u(activity, t, a3);
        }
        t.F(this);
    }
    
    public e(final Context context, final o1.a a, final o1.a.d d, final a a2) {
        this(context, null, a, d, a2);
    }
    
    private final k2.g q(final int n, final g g) {
        final h h = new h();
        this.j.B(this, n, g, h, this.i);
        return h.a();
    }
    
    protected e$a f() {
        final e$a e$a = new e$a();
        e$a.d((Account)null);
        e$a.c((Collection)Collections.emptySet());
        e$a.e(this.a.getClass().getName());
        e$a.b(this.a.getPackageName());
        return e$a;
    }
    
    public k2.g g(final g g) {
        return this.q(2, g);
    }
    
    public k2.g h(final g g) {
        return this.q(0, g);
    }
    
    public k2.g i(final com.google.android.gms.common.api.internal.f f) {
        o.h((Object)f);
        o.i((Object)f.a.b(), (Object)"Listener has already been released.");
        o.i((Object)f.b.a(), (Object)"Listener has already been released.");
        return this.j.v(this, f.a, f.b, f.c);
    }
    
    public k2.g j(final c$a c$a, final int n) {
        o.i((Object)c$a, (Object)"Listener key cannot be null.");
        return this.j.w(this, c$a, n);
    }
    
    protected String k(final Context context) {
        return null;
    }
    
    public final b l() {
        return this.e;
    }
    
    protected String m() {
        return this.b;
    }
    
    public final int n() {
        return this.g;
    }
    
    public final a$f o(final Looper looper, final q q) {
        final a$f a = ((a$a)o.h((Object)this.c.a())).a(this.a, looper, this.f().a(), (Object)this.d, (f$a)q, (f$b)q);
        final String m = this.m();
        if (m != null && a instanceof c) {
            ((c)a).O(m);
        }
        if (m != null && a instanceof p1.g) {
            final p1.g g = (p1.g)a;
            throw null;
        }
        return a;
    }
    
    public final a0 p(final Context context, final Handler handler) {
        return new a0(context, handler, this.f().a());
    }
    
    public static class a
    {
        public static final e.a c;
        public final j a;
        public final Looper b;
        
        static {
            c = new e.a.a().a();
        }
        
        private a(final j a, final Account account, final Looper b) {
            this.a = a;
            this.b = b;
        }
        
        public static class a
        {
            private j a;
            private Looper b;
            
            public e.a a() {
                if (this.a == null) {
                    this.a = (j)new p1.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new e.a(this.a, null, this.b, null);
            }
        }
    }
}
