package io.flutter.embedding.android;

import java.util.List;
import androidx.lifecycle.h;
import io.flutter.plugin.platform.i$d;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.app.Activity;
import android.window.BackEvent;
import io.flutter.embedding.engine.e;
import android.os.Bundle;
import java.util.Arrays;
import android.net.Uri;
import android.content.Intent;
import a3.b;
import b3.a$b;
import io.flutter.embedding.engine.d$b;
import io.flutter.embedding.engine.renderer.l;
import android.view.ViewTreeObserver$OnPreDrawListener;
import io.flutter.plugin.platform.i;
import io.flutter.embedding.engine.a;

class j implements d
{
    private c a;
    private a b;
    e0 c;
    private i d;
    ViewTreeObserver$OnPreDrawListener e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private Integer j;
    private io.flutter.embedding.engine.d k;
    private final l l;
    
    j(final c c) {
        this(c, null);
    }
    
    j(final c a, final io.flutter.embedding.engine.d k) {
        this.l = (l)new l() {
            final j a;
            
            public void c() {
                this.a.a.c();
                this.a.g = false;
            }
            
            public void g() {
                this.a.a.g();
                this.a.g = true;
                this.a.h = true;
            }
        };
        this.a = a;
        this.h = false;
        this.k = k;
    }
    
    private d$b e(final d$b d$b) {
        final String a = this.a.A();
        String g = null;
        Label_0033: {
            if (a != null) {
                g = a;
                if (!a.isEmpty()) {
                    break Label_0033;
                }
            }
            g = a3.a.e().c().g();
        }
        final a$b a$b = new a$b(g, this.a.v());
        String s;
        if ((s = this.a.j()) == null && (s = this.q(this.a.e().getIntent())) == null) {
            s = "/";
        }
        return d$b.i(a$b).k(s).j(this.a.n());
    }
    
    private void j(final e0 e0) {
        if (this.a.p() == p0.e) {
            if (this.e != null) {
                ((View)e0).getViewTreeObserver().removeOnPreDrawListener(this.e);
            }
            this.e = (ViewTreeObserver$OnPreDrawListener)new j$b(this, e0);
            ((View)e0).getViewTreeObserver().addOnPreDrawListener(this.e);
            return;
        }
        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
    }
    
    private void k() {
        if (this.a.t() != null) {
            return;
        }
        if (this.b.k().j()) {
            return;
        }
        String s;
        if ((s = this.a.j()) == null && (s = this.q(this.a.e().getIntent())) == null) {
            s = "/";
        }
        final String x = this.a.x();
        final StringBuilder sb = new StringBuilder();
        sb.append("Executing Dart entrypoint: ");
        sb.append(this.a.v());
        sb.append(", library uri: ");
        sb.append(x);
        String string;
        if (sb.toString() == null) {
            string = "\"\"";
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(x);
            sb2.append(", and sending initial route: ");
            sb2.append(s);
            string = sb2.toString();
        }
        a3.b.f("FlutterActivityAndFragmentDelegate", string);
        this.b.o().c(s);
        final String a = this.a.A();
        String g = null;
        Label_0216: {
            if (a != null) {
                g = a;
                if (!a.isEmpty()) {
                    break Label_0216;
                }
            }
            g = a3.a.e().c().g();
        }
        a$b a$b;
        if (x == null) {
            a$b = new a$b(g, this.a.v());
        }
        else {
            a$b = new a$b(g, x, this.a.v());
        }
        this.b.k().i(a$b, this.a.n());
    }
    
    private void l() {
        if (this.a != null) {
            return;
        }
        throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
    }
    
    private String q(final Intent intent) {
        if (this.a.C()) {
            final Uri data = intent.getData();
            if (data != null) {
                return data.toString();
            }
        }
        return null;
    }
    
    void A(final int n, final String[] array, final int[] array2) {
        this.l();
        if (this.b != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: ");
            sb.append(n);
            sb.append("\npermissions: ");
            sb.append(Arrays.toString((Object[])array));
            sb.append("\ngrantResults: ");
            sb.append(Arrays.toString(array2));
            a3.b.f("FlutterActivityAndFragmentDelegate", sb.toString());
            this.b.i().d(n, array, array2);
        }
        else {
            a3.b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
        }
    }
    
    void B(Bundle bundle) {
        a3.b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        this.l();
        byte[] byteArray;
        if (bundle != null) {
            final Bundle bundle2 = bundle.getBundle("plugins");
            byteArray = bundle.getByteArray("framework");
            bundle = bundle2;
        }
        else {
            bundle = null;
            byteArray = null;
        }
        if (this.a.u()) {
            this.b.u().j(byteArray);
        }
        if (this.a.o()) {
            this.b.i().b(bundle);
        }
    }
    
    void C() {
        a3.b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        this.l();
        if (this.a.s()) {
            final a b = this.b;
            if (b != null) {
                b.l().e();
            }
        }
    }
    
    void D(final Bundle bundle) {
        a3.b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        this.l();
        if (this.a.u()) {
            bundle.putByteArray("framework", this.b.u().h());
        }
        if (this.a.o()) {
            final Bundle bundle2 = new Bundle();
            this.b.i().c(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }
    
    void E() {
        a3.b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        this.l();
        this.k();
        final Integer j = this.j;
        if (j != null) {
            this.c.setVisibility(j);
        }
    }
    
    void F() {
        a3.b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        this.l();
        if (this.a.s()) {
            final a b = this.b;
            if (b != null) {
                b.l().d();
            }
        }
        this.j = ((View)this.c).getVisibility();
        this.c.setVisibility(8);
        final a b2 = this.b;
        if (b2 != null) {
            b2.t().p(40);
        }
    }
    
    void G(final int n) {
        this.l();
        final a b = this.b;
        if (b != null) {
            if (this.h && n >= 10) {
                b.k().k();
                this.b.x().a();
            }
            this.b.t().p(n);
            this.b.q().o0(n);
        }
    }
    
    void H() {
        this.l();
        if (this.b != null) {
            a3.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.b.i().i();
        }
        else {
            a3.b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        }
    }
    
    void I(final boolean b) {
        this.l();
        final StringBuilder sb = new StringBuilder();
        sb.append("Received onWindowFocusChanged: ");
        String s;
        if (b) {
            s = "true";
        }
        else {
            s = "false";
        }
        sb.append(s);
        b.f("FlutterActivityAndFragmentDelegate", sb.toString());
        if (this.a.s()) {
            final a b2 = this.b;
            if (b2 != null) {
                if (b) {
                    b2.l().a();
                }
                else {
                    b2.l().f();
                }
            }
        }
    }
    
    void J() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
    
    void K() {
        a3.b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        final String t = this.a.t();
        if (t != null) {
            final a a = io.flutter.embedding.engine.b.b().a(t);
            this.b = a;
            this.f = true;
            if (a != null) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '");
            sb.append(t);
            sb.append("'");
            throw new IllegalStateException(sb.toString());
        }
        else {
            final c a2 = this.a;
            if ((this.b = a2.B(a2.d())) != null) {
                this.f = true;
                return;
            }
            final String i = this.a.i();
            a b;
            if (i != null) {
                final io.flutter.embedding.engine.d a3 = io.flutter.embedding.engine.e.b().a(i);
                if (a3 == null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '");
                    sb2.append(i);
                    sb2.append("'");
                    throw new IllegalStateException(sb2.toString());
                }
                b = a3.a(this.e(new d$b(this.a.d())));
            }
            else {
                a3.b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
                io.flutter.embedding.engine.d k;
                if ((k = this.k) == null) {
                    k = new io.flutter.embedding.engine.d(this.a.d(), this.a.k().b());
                }
                b = k.a(this.e(new d$b(this.a.d()).h(false).l(this.a.u())));
            }
            this.b = b;
            this.f = false;
        }
    }
    
    void L(final BackEvent backEvent) {
        this.l();
        if (this.b != null) {
            a3.b.f("FlutterActivityAndFragmentDelegate", "Forwarding startBackGesture() to FlutterEngine.");
            this.b.j().d(backEvent);
        }
        else {
            a3.b.g("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
        }
    }
    
    void M(final BackEvent backEvent) {
        this.l();
        if (this.b != null) {
            a3.b.f("FlutterActivityAndFragmentDelegate", "Forwarding updateBackGestureProgress() to FlutterEngine.");
            this.b.j().e(backEvent);
        }
        else {
            a3.b.g("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
        }
    }
    
    void N() {
        final i d = this.d;
        if (d != null) {
            d.E();
        }
    }
    
    public void f() {
        if (!this.a.q()) {
            this.a.f();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("The internal FlutterEngine created by ");
        sb.append((Object)this.a);
        sb.append(" has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        throw new AssertionError((Object)sb.toString());
    }
    
    void h() {
        this.l();
        if (this.b != null) {
            a3.b.f("FlutterActivityAndFragmentDelegate", "Forwarding cancelBackGesture() to FlutterEngine.");
            this.b.j().b();
        }
        else {
            a3.b.g("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
        }
    }
    
    void i() {
        this.l();
        if (this.b != null) {
            a3.b.f("FlutterActivityAndFragmentDelegate", "Forwarding commitBackGesture() to FlutterEngine.");
            this.b.j().c();
        }
        else {
            a3.b.g("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
        }
    }
    
    public Activity m() {
        final Activity e = this.a.e();
        if (e != null) {
            return e;
        }
        throw new AssertionError((Object)"FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }
    
    a n() {
        return this.b;
    }
    
    boolean o() {
        return this.i;
    }
    
    boolean p() {
        return this.f;
    }
    
    void r(final int n, final int n2, final Intent intent) {
        this.l();
        if (this.b != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Forwarding onActivityResult() to FlutterEngine:\nrequestCode: ");
            sb.append(n);
            sb.append("\nresultCode: ");
            sb.append(n2);
            sb.append("\ndata: ");
            sb.append((Object)intent);
            a3.b.f("FlutterActivityAndFragmentDelegate", sb.toString());
            this.b.i().a(n, n2, intent);
        }
        else {
            a3.b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
        }
    }
    
    void s(final Context context) {
        this.l();
        if (this.b == null) {
            this.K();
        }
        if (this.a.o()) {
            a3.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.b.i().g((d)this, this.a.a());
        }
        final c a = this.a;
        this.d = a.y(a.e(), this.b);
        this.a.F(this.b);
        this.i = true;
    }
    
    void t() {
        this.l();
        if (this.b != null) {
            a3.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.b.o().a();
        }
        else {
            a3.b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        }
    }
    
    View u(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle, final int id, final boolean b) {
        b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        this.l();
        final p0 p5 = this.a.p();
        final p0 e = p0.e;
        boolean opaque = true;
        final boolean b2 = true;
        e0 c;
        if (p5 == e) {
            final s s = new s(this.a.d(), this.a.D() == q0.f && b2);
            this.a.z(s);
            c = new e0(this.a.d(), s);
        }
        else {
            final t t = new t(this.a.d());
            if (this.a.D() != q0.e) {
                opaque = false;
            }
            t.setOpaque(opaque);
            this.a.E(t);
            c = new e0(this.a.d(), t);
        }
        (this.c = c).l(this.l);
        if (this.a.r()) {
            b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
            this.c.n(this.b);
        }
        ((View)this.c).setId(id);
        if (b) {
            this.j(this.c);
        }
        return (View)this.c;
    }
    
    void v() {
        a3.b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        this.l();
        if (this.e != null) {
            ((View)this.c).getViewTreeObserver().removeOnPreDrawListener(this.e);
            this.e = null;
        }
        final e0 c = this.c;
        if (c != null) {
            c.s();
            this.c.y(this.l);
        }
    }
    
    void w() {
        if (!this.i) {
            return;
        }
        a3.b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
        this.l();
        this.a.w(this.b);
        if (this.a.o()) {
            a3.b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.a.e().isChangingConfigurations()) {
                this.b.i().j();
            }
            else {
                this.b.i().h();
            }
        }
        final i d = this.d;
        if (d != null) {
            d.q();
            this.d = null;
        }
        if (this.a.s()) {
            final a b = this.b;
            if (b != null) {
                b.l().b();
            }
        }
        if (this.a.q()) {
            this.b.g();
            if (this.a.t() != null) {
                io.flutter.embedding.engine.b.b().d(this.a.t());
            }
            this.b = null;
        }
        this.i = false;
    }
    
    void x(final Intent intent) {
        this.l();
        if (this.b != null) {
            a3.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
            this.b.i().e(intent);
            final String q = this.q(intent);
            if (q != null && !q.isEmpty()) {
                this.b.o().b(q);
            }
        }
        else {
            a3.b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
        }
    }
    
    void y() {
        a3.b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        this.l();
        if (this.a.s()) {
            final a b = this.b;
            if (b != null) {
                b.l().c();
            }
        }
    }
    
    void z() {
        a3.b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        this.l();
        if (this.b != null) {
            this.N();
            this.b.q().n0();
        }
        else {
            a3.b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }
    
    interface c extends i$d
    {
        String A();
        
        a B(final Context p0);
        
        boolean C();
        
        q0 D();
        
        void E(final t p0);
        
        void F(final a p0);
        
        h a();
        
        void c();
        
        Context d();
        
        Activity e();
        
        void f();
        
        void g();
        
        String i();
        
        String j();
        
        io.flutter.embedding.engine.l k();
        
        List n();
        
        boolean o();
        
        p0 p();
        
        boolean q();
        
        boolean r();
        
        boolean s();
        
        String t();
        
        boolean u();
        
        String v();
        
        void w(final a p0);
        
        String x();
        
        i y(final Activity p0, final a p1);
        
        void z(final s p0);
    }
}
