package io.flutter.embedding.android;

import android.os.BaseBundle;
import io.flutter.plugin.platform.i$d;
import androidx.lifecycle.h$a;
import android.content.Intent;
import java.util.List;
import android.window.BackEvent;
import io.flutter.embedding.engine.a;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import a3.b;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.os.Build$VERSION;
import android.view.View;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.m;
import androidx.lifecycle.l;
import android.app.Activity;

public abstract class i extends Activity implements j$c, l
{
    public static final int g;
    private boolean c;
    protected j d;
    private m e;
    private final OnBackInvokedCallback f;
    
    static {
        g = View.generateViewId();
    }
    
    public i() {
        this.c = false;
        OnBackInvokedCallback l;
        if (Build$VERSION.SDK_INT < 33) {
            l = null;
        }
        else {
            l = this.L();
        }
        this.f = l;
        this.e = new m((l)this);
    }
    
    private void I() {
        final Window window = this.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }
    
    private void J() {
        if (this.M() == k.f) {
            this.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
        }
    }
    
    private View K() {
        return this.d.u((LayoutInflater)null, (ViewGroup)null, (Bundle)null, i.g, this.p() == p0.e);
    }
    
    private OnBackInvokedCallback L() {
        if (Build$VERSION.SDK_INT >= 34) {
            return (OnBackInvokedCallback)new i$a(this);
        }
        return (OnBackInvokedCallback)new h(this);
    }
    
    private boolean P() {
        return (((Context)this).getApplicationInfo().flags & 0x2) != 0x0;
    }
    
    private boolean T(String s) {
        final j d = this.d;
        StringBuilder sb;
        if (d == null) {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(this.hashCode());
            sb.append(" ");
            sb.append(s);
            s = " called after release.";
        }
        else {
            if (d.o()) {
                return true;
            }
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(this.hashCode());
            sb.append(" ");
            sb.append(s);
            s = " called after detach.";
        }
        sb.append(s);
        b.g("FlutterActivity", sb.toString());
        return false;
    }
    
    private void U() {
        try {
            final Bundle o = this.O();
            if (o != null) {
                final int int1 = ((BaseBundle)o).getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (int1 != -1) {
                    ((Context)this).setTheme(int1);
                }
            }
            else {
                b.f("FlutterActivity", "Using the launch theme as normal theme.");
            }
        }
        catch (final PackageManager$NameNotFoundException ex) {
            b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }
    
    public String A() {
        if (this.P() && "android.intent.action.RUN".equals((Object)this.getIntent().getAction())) {
            final String dataString = this.getIntent().getDataString();
            if (dataString != null) {
                return dataString;
            }
        }
        return null;
    }
    
    public a B(final Context context) {
        return null;
    }
    
    public boolean C() {
        final boolean b = false;
        try {
            final Bundle o = this.O();
            boolean boolean1 = b;
            if (o != null) {
                boolean1 = o.getBoolean("flutter_deeplinking_enabled");
            }
            return boolean1;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return b;
        }
    }
    
    public q0 D() {
        q0 q0;
        if (this.M() == k.e) {
            q0 = io.flutter.embedding.android.q0.e;
        }
        else {
            q0 = io.flutter.embedding.android.q0.f;
        }
        return q0;
    }
    
    public void E(final t t) {
    }
    
    public void F(final a a) {
        if (this.d.p()) {
            return;
        }
        i3.a.a(a);
    }
    
    public void G() {
        if (this.T("cancelBackGesture")) {
            this.d.h();
        }
    }
    
    public void H() {
        if (this.T("commitBackGesture")) {
            this.d.i();
        }
    }
    
    protected k M() {
        if (this.getIntent().hasExtra("background_mode")) {
            return k.valueOf(this.getIntent().getStringExtra("background_mode"));
        }
        return k.e;
    }
    
    protected a N() {
        return this.d.n();
    }
    
    protected Bundle O() {
        return ((Context)this).getPackageManager().getActivityInfo(this.getComponentName(), 128).metaData;
    }
    
    public void Q() {
        if (Build$VERSION.SDK_INT >= 33) {
            io.flutter.embedding.android.g.a(io.flutter.embedding.android.e.a(this), 0, this.f);
            this.c = true;
        }
    }
    
    public void R() {
        this.V();
        final j d = this.d;
        if (d != null) {
            d.J();
            this.d = null;
        }
    }
    
    public void S(final BackEvent backEvent) {
        if (this.T("startBackGesture")) {
            this.d.L(backEvent);
        }
    }
    
    public void V() {
        if (Build$VERSION.SDK_INT >= 33) {
            io.flutter.embedding.android.f.a(io.flutter.embedding.android.e.a(this), this.f);
            this.c = false;
        }
    }
    
    public void W(final BackEvent backEvent) {
        if (this.T("updateBackGestureProgress")) {
            this.d.M(backEvent);
        }
    }
    
    public androidx.lifecycle.h a() {
        return (androidx.lifecycle.h)this.e;
    }
    
    public boolean b() {
        return false;
    }
    
    public void c() {
    }
    
    public Context d() {
        return (Context)this;
    }
    
    public Activity e() {
        return this;
    }
    
    public void f() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FlutterActivity ");
        sb.append((Object)this);
        sb.append(" connection to the engine ");
        sb.append((Object)this.N());
        sb.append(" evicted by another attaching activity");
        b.g("FlutterActivity", sb.toString());
        final j d = this.d;
        if (d != null) {
            d.v();
            this.d.w();
        }
    }
    
    public void g() {
        if (Build$VERSION.SDK_INT >= 29) {
            this.reportFullyDrawn();
        }
    }
    
    public void h(final boolean b) {
        if (b && !this.c) {
            this.Q();
        }
        else if (!b && this.c) {
            this.V();
        }
    }
    
    public String i() {
        return this.getIntent().getStringExtra("cached_engine_group_id");
    }
    
    public String j() {
        if (this.getIntent().hasExtra("route")) {
            return this.getIntent().getStringExtra("route");
        }
        final String s = null;
        try {
            final Bundle o = this.O();
            String string = s;
            if (o != null) {
                string = ((BaseBundle)o).getString("io.flutter.InitialRoute");
            }
            return string;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return s;
        }
    }
    
    public io.flutter.embedding.engine.l k() {
        return io.flutter.embedding.engine.l.a(this.getIntent());
    }
    
    public List n() {
        return (List)this.getIntent().getSerializableExtra("dart_entrypoint_args");
    }
    
    public boolean o() {
        return true;
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (this.T("onActivityResult")) {
            this.d.r(n, n2, intent);
        }
    }
    
    public void onBackPressed() {
        if (this.T("onBackPressed")) {
            this.d.t();
        }
    }
    
    protected void onCreate(final Bundle bundle) {
        this.U();
        super.onCreate(bundle);
        (this.d = new j((j$c)this)).s((Context)this);
        this.d.B(bundle);
        this.e.h(h$a.ON_CREATE);
        this.J();
        this.setContentView(this.K());
        this.I();
    }
    
    protected void onDestroy() {
        super.onDestroy();
        if (this.T("onDestroy")) {
            this.d.v();
            this.d.w();
        }
        this.R();
        this.e.h(h$a.ON_DESTROY);
    }
    
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        if (this.T("onNewIntent")) {
            this.d.x(intent);
        }
    }
    
    protected void onPause() {
        super.onPause();
        if (this.T("onPause")) {
            this.d.y();
        }
        this.e.h(h$a.ON_PAUSE);
    }
    
    public void onPostResume() {
        super.onPostResume();
        if (this.T("onPostResume")) {
            this.d.z();
        }
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        if (this.T("onRequestPermissionsResult")) {
            this.d.A(n, array, array2);
        }
    }
    
    protected void onResume() {
        super.onResume();
        this.e.h(h$a.ON_RESUME);
        if (this.T("onResume")) {
            this.d.C();
        }
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.T("onSaveInstanceState")) {
            this.d.D(bundle);
        }
    }
    
    protected void onStart() {
        super.onStart();
        this.e.h(h$a.ON_START);
        if (this.T("onStart")) {
            this.d.E();
        }
    }
    
    protected void onStop() {
        super.onStop();
        if (this.T("onStop")) {
            this.d.F();
        }
        this.e.h(h$a.ON_STOP);
    }
    
    public void onTrimMemory(final int n) {
        super.onTrimMemory(n);
        if (this.T("onTrimMemory")) {
            this.d.G(n);
        }
    }
    
    public void onUserLeaveHint() {
        if (this.T("onUserLeaveHint")) {
            this.d.H();
        }
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (this.T("onWindowFocusChanged")) {
            this.d.I(b);
        }
    }
    
    public p0 p() {
        p0 p0;
        if (this.M() == k.e) {
            p0 = io.flutter.embedding.android.p0.e;
        }
        else {
            p0 = io.flutter.embedding.android.p0.f;
        }
        return p0;
    }
    
    public boolean q() {
        boolean b = this.getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        if (this.t() == null) {
            if (this.d.p()) {
                b = b;
            }
            else {
                b = this.getIntent().getBooleanExtra("destroy_engine_with_activity", true);
            }
        }
        return b;
    }
    
    public boolean r() {
        return true;
    }
    
    public boolean s() {
        return true;
    }
    
    public String t() {
        return this.getIntent().getStringExtra("cached_engine_id");
    }
    
    public boolean u() {
        if (this.getIntent().hasExtra("enable_state_restoration")) {
            return this.getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        return this.t() == null;
    }
    
    public String v() {
        String s = "main";
        if (this.getIntent().hasExtra("dart_entrypoint")) {
            return this.getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            final Bundle o = this.O();
            String string;
            if (o != null) {
                string = ((BaseBundle)o).getString("io.flutter.Entrypoint");
            }
            else {
                string = null;
            }
            if (string != null) {
                s = string;
            }
            return s;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return s;
        }
    }
    
    public void w(final a a) {
    }
    
    public String x() {
        final String s = null;
        try {
            final Bundle o = this.O();
            String string = s;
            if (o != null) {
                string = ((BaseBundle)o).getString("io.flutter.EntrypointUri");
            }
            return string;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return s;
        }
    }
    
    public io.flutter.plugin.platform.i y(final Activity activity, final a a) {
        return new io.flutter.plugin.platform.i(this.e(), a.p(), (i$d)this);
    }
    
    public void z(final s s) {
    }
}
