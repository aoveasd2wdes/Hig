package io.flutter.embedding.engine;

import java.util.List;
import android.content.res.AssetManager;
import t3.i;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.Iterator;
import a3.b;
import java.util.HashSet;
import d3.d;
import android.content.Context;
import java.util.Set;
import io.flutter.plugin.platform.z;
import j3.w;
import j3.v;
import j3.u;
import j3.t;
import j3.r;
import j3.o;
import j3.s;
import j3.n;
import j3.m;
import j3.l;
import j3.k;
import j3.g;
import l3.f;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import t3.i$a;

public class a implements i$a
{
    private final FlutterJNI a;
    private final FlutterRenderer b;
    private final b3.a c;
    private final c d;
    private final f e;
    private final j3.a f;
    private final g g;
    private final k h;
    private final l i;
    private final m j;
    private final n k;
    private final j3.f l;
    private final s m;
    private final o n;
    private final r o;
    private final t p;
    private final u q;
    private final v r;
    private final w s;
    private final z t;
    private final Set u;
    private final a$b v;
    
    public a(final Context context, final d d, final FlutterJNI flutterJNI, final z z, final String[] array, final boolean b, final boolean b2) {
        this(context, d, flutterJNI, z, array, b, b2, null);
    }
    
    public a(final Context context, final d d, final FlutterJNI flutterJNI, final z z, final String[] array, final boolean b, final boolean b2, final io.flutter.embedding.engine.d d2) {
        this.u = (Set)new HashSet();
        this.v = (a$b)new a$b() {
            final a a;
            
            public void a() {
                a3.b.f("FlutterEngine", "onPreEngineRestart()");
                final Iterator iterator = this.a.u.iterator();
                while (iterator.hasNext()) {
                    ((a$b)iterator.next()).a();
                }
                this.a.t.m0();
                this.a.m.g();
            }
            
            public void b() {
            }
        };
        AssetManager assetManager;
        try {
            assetManager = context.createPackageContext(context.getPackageName(), 0).getAssets();
        }
        catch (final PackageManager$NameNotFoundException ex) {
            assetManager = context.getAssets();
        }
        final a3.a e = a3.a.e();
        FlutterJNI a = flutterJNI;
        if (flutterJNI == null) {
            a = e.d().a();
        }
        this.a = a;
        final b3.a c = new b3.a(a, assetManager);
        (this.c = c).l();
        a3.a.e().a();
        this.f = new j3.a(c, a);
        this.g = new g(c);
        this.h = new k(c);
        final l i = new l(c);
        this.i = i;
        this.j = new m(c);
        this.k = new n(c);
        this.l = new j3.f(c);
        this.n = new o(c);
        this.o = new r(c, context.getPackageManager());
        this.m = new s(c, b2);
        this.p = new t(c);
        this.q = new u(c);
        this.r = new v(c);
        this.s = new w(c);
        final f f = new f(context, i);
        this.e = f;
        d c2;
        if ((c2 = d) == null) {
            c2 = e.c();
        }
        if (!a.isAttached()) {
            c2.n(context.getApplicationContext());
            c2.f(context, array);
        }
        a.addEngineLifecycleListener(this.v);
        a.setPlatformViewsController(z);
        a.setLocalizationPlugin(f);
        e.a();
        a.setDeferredComponentManager((c3.a)null);
        if (!a.isAttached()) {
            this.f();
        }
        this.b = new FlutterRenderer(a);
        (this.t = z).g0();
        final c d3 = new c(context.getApplicationContext(), this, c2, d2);
        this.d = d3;
        f.d(context.getResources().getConfiguration());
        if (b && c2.e()) {
            i3.a.a(this);
        }
        t3.i.c(context, (i$a)this);
        d3.f((f3.a)new n3.c(this.s()));
    }
    
    private void f() {
        a3.b.f("FlutterEngine", "Attaching to JNI.");
        this.a.attachToNative();
        if (this.z()) {
            return;
        }
        throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
    }
    
    private boolean z() {
        return this.a.isAttached();
    }
    
    a A(final Context context, final b3.a$b a$b, final String s, final List list, final z z, final boolean b, final boolean b2) {
        if (this.z()) {
            return new a(context, null, this.a.spawn(a$b.c, a$b.b, s, list), z, null, b, b2);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }
    
    public void a(final float n, final float n2, final float n3) {
        this.a.updateDisplayMetrics(0, n, n2, n3);
    }
    
    public void e(final a$b a$b) {
        this.u.add((Object)a$b);
    }
    
    public void g() {
        a3.b.f("FlutterEngine", "Destroying.");
        final Iterator iterator = this.u.iterator();
        while (iterator.hasNext()) {
            ((a$b)iterator.next()).b();
        }
        this.d.l();
        this.t.i0();
        this.c.m();
        this.a.removeEngineLifecycleListener(this.v);
        this.a.setDeferredComponentManager((c3.a)null);
        this.a.detachFromNativeAndReleaseResources();
        a3.a.e().a();
    }
    
    public j3.a h() {
        return this.f;
    }
    
    public g3.b i() {
        return (g3.b)this.d;
    }
    
    public j3.f j() {
        return this.l;
    }
    
    public b3.a k() {
        return this.c;
    }
    
    public k l() {
        return this.h;
    }
    
    public f m() {
        return this.e;
    }
    
    public m n() {
        return this.j;
    }
    
    public n o() {
        return this.k;
    }
    
    public o p() {
        return this.n;
    }
    
    public z q() {
        return this.t;
    }
    
    public f3.b r() {
        return (f3.b)this.d;
    }
    
    public r s() {
        return this.o;
    }
    
    public FlutterRenderer t() {
        return this.b;
    }
    
    public s u() {
        return this.m;
    }
    
    public t v() {
        return this.p;
    }
    
    public u w() {
        return this.q;
    }
    
    public v x() {
        return this.r;
    }
    
    public w y() {
        return this.s;
    }
}
