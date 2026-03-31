package io.flutter.embedding.android;

import android.view.ViewGroup;
import android.annotation.TargetApi;
import java.util.List;
import android.graphics.Rect;
import io.flutter.embedding.engine.renderer.FlutterRenderer$c;
import io.flutter.embedding.engine.renderer.FlutterRenderer$d;
import io.flutter.embedding.engine.renderer.FlutterRenderer$e;
import java.util.ArrayList;
import android.view.ViewStructure;
import android.view.MotionEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import t3.i$a;
import android.content.res.Configuration;
import android.app.Activity;
import t3.i;
import android.view.DisplayCutout;
import android.graphics.Insets;
import androidx.core.view.n0;
import androidx.core.view.y0;
import androidx.core.view.x0;
import androidx.core.view.v0;
import androidx.appcompat.widget.u0;
import androidx.appcompat.widget.s0;
import androidx.appcompat.widget.t0;
import androidx.core.view.p0;
import l.d;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.PointerIcon;
import android.util.SparseArray;
import android.view.KeyEvent;
import j3.t$b;
import android.text.format.DateFormat;
import android.provider.Settings$System;
import java.util.function.Predicate;
import j3.t$c;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import android.view.View;
import android.view.WindowInsets;
import android.os.Build$VERSION;
import android.view.WindowManager;
import android.view.textservice.SpellCheckerInfo;
import android.view.ViewConfiguration;
import y0.j;
import java.util.Iterator;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import android.util.AttributeSet;
import android.content.Context;
import io.flutter.embedding.engine.renderer.l;
import android.database.ContentObserver;
import io.flutter.view.k$k;
import io.flutter.embedding.engine.renderer.FlutterRenderer$h;
import android.view.textservice.TextServicesManager;
import io.flutter.view.k;
import l3.f;
import io.flutter.plugin.editing.o;
import io.flutter.plugin.editing.k0;
import m3.b;
import io.flutter.embedding.engine.a;
import java.util.Set;
import io.flutter.embedding.engine.renderer.m;
import m3.b$c;
import android.widget.FrameLayout;

public class e0 extends FrameLayout implements b$c, m0$e
{
    private s c;
    private t d;
    private r e;
    m f;
    private m g;
    private final Set h;
    private boolean i;
    private a j;
    private final Set k;
    private b l;
    private k0 m;
    private o n;
    private f o;
    private m0 p;
    private c q;
    private k r;
    private TextServicesManager s;
    private r0 t;
    private final FlutterRenderer$h u;
    private final k$k v;
    private final ContentObserver w;
    private final l x;
    private final v.a y;
    
    private e0(final Context context, final AttributeSet set, final s s) {
        super(context, set);
        this.h = (Set)new HashSet();
        this.k = (Set)new HashSet();
        this.u = new FlutterRenderer$h();
        this.v = (k$k)new k$k() {
            final e0 a;
            
            public void a(final boolean b, final boolean b2) {
                this.a.z(b, b2);
            }
        };
        this.w = (ContentObserver)new e0$b(this, new Handler(Looper.getMainLooper()));
        this.x = (l)new l() {
            final e0 a;
            
            public void c() {
                this.a.i = false;
                final Iterator iterator = this.a.h.iterator();
                while (iterator.hasNext()) {
                    ((l)iterator.next()).c();
                }
            }
            
            public void g() {
                this.a.i = true;
                final Iterator iterator = this.a.h.iterator();
                while (iterator.hasNext()) {
                    ((l)iterator.next()).g();
                }
            }
        };
        this.y = (v.a)new v.a() {
            final e0 a;
            
            public void a(final j windowInfoListenerDisplayFeatures) {
                this.a.setWindowInfoListenerDisplayFeatures(windowInfoListenerDisplayFeatures);
            }
        };
        this.c = s;
        this.f = (m)s;
        this.u();
    }
    
    private e0(final Context context, final AttributeSet set, final t t) {
        super(context, set);
        this.h = (Set)new HashSet();
        this.k = (Set)new HashSet();
        this.u = new FlutterRenderer$h();
        this.v = (k$k)new k$k() {
            final e0 a;
            
            public void a(final boolean b, final boolean b2) {
                this.a.z(b, b2);
            }
        };
        this.w = (ContentObserver)new e0$b(this, new Handler(Looper.getMainLooper()));
        this.x = (l)new l() {
            final e0 a;
            
            public void c() {
                this.a.i = false;
                final Iterator iterator = this.a.h.iterator();
                while (iterator.hasNext()) {
                    ((l)iterator.next()).c();
                }
            }
            
            public void g() {
                this.a.i = true;
                final Iterator iterator = this.a.h.iterator();
                while (iterator.hasNext()) {
                    ((l)iterator.next()).g();
                }
            }
        };
        this.y = (v.a)new v.a() {
            final e0 a;
            
            public void a(final j windowInfoListenerDisplayFeatures) {
                this.a.setWindowInfoListenerDisplayFeatures(windowInfoListenerDisplayFeatures);
            }
        };
        this.d = t;
        this.f = (m)t;
        this.u();
    }
    
    public e0(final Context context, final s s) {
        this(context, null, s);
    }
    
    public e0(final Context context, final t t) {
        this(context, null, t);
    }
    
    private void C() {
        if (!this.v()) {
            a3.b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.u.a = ((View)this).getResources().getDisplayMetrics().density;
        this.u.p = ViewConfiguration.get(((View)this).getContext()).getScaledTouchSlop();
        this.j.t().y(this.u);
    }
    
    private e0.e0$f o() {
        final Context context = ((View)this).getContext();
        final int orientation = context.getResources().getConfiguration().orientation;
        final int rotation = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (orientation == 2) {
            if (rotation == 1) {
                return e0.e0$f.g;
            }
            if (rotation == 3) {
                e0.e0$f e0$f;
                if (Build$VERSION.SDK_INT >= 23) {
                    e0$f = e0.e0$f.f;
                }
                else {
                    e0$f = e0.e0$f.g;
                }
                return e0$f;
            }
            if (rotation == 0 || rotation == 2) {
                return e0.e0$f.h;
            }
        }
        return e0.e0$f.e;
    }
    
    private int t(final WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < ((View)this).getRootView().getHeight() * 0.18) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }
    
    private void u() {
        a3.b.f("FlutterView", "Initializing FlutterView");
        Object o;
        if (this.c != null) {
            a3.b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            o = this.c;
        }
        else if (this.d != null) {
            a3.b.f("FlutterView", "Internally using a FlutterTextureView.");
            o = this.d;
        }
        else {
            a3.b.f("FlutterView", "Internally using a FlutterImageView.");
            o = this.e;
        }
        ((ViewGroup)this).addView((View)o);
        ((View)this).setFocusable(true);
        ((View)this).setFocusableInTouchMode(true);
        if (Build$VERSION.SDK_INT >= 26) {
            io.flutter.embedding.android.u.a(this, 1);
        }
    }
    
    private void x() {
        final r e = this.e;
        if (e != null) {
            e.g();
            ((ViewGroup)this).removeView((View)this.e);
            this.e = null;
        }
    }
    
    private void z(final boolean b, final boolean b2) {
        final boolean o = this.j.t().o();
        boolean willNotDraw;
        final boolean b3 = willNotDraw = false;
        if (!o) {
            willNotDraw = b3;
            if (!b) {
                willNotDraw = b3;
                if (!b2) {
                    willNotDraw = true;
                }
            }
        }
        ((View)this).setWillNotDraw(willNotDraw);
    }
    
    public void A(final Runnable runnable) {
        if (this.e == null) {
            a3.b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        final m g = this.g;
        if (g == null) {
            a3.b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f = g;
        this.g = null;
        final FlutterRenderer t = this.j.t();
        if (this.j != null && t != null) {
            this.f.d();
            t.j((l)new l(this, t, runnable) {
                final FlutterRenderer a;
                final Runnable b;
                final e0 c;
                
                public void c() {
                }
                
                public void g() {
                    this.a.u((l)this);
                    this.b.run();
                    final e0 c = this.c;
                    if (!(c.f instanceof r) && c.e != null) {
                        this.c.e.c();
                        this.c.x();
                    }
                }
            });
            return;
        }
        this.e.c();
        this.x();
        runnable.run();
    }
    
    void B() {
        final int uiMode = ((View)this).getResources().getConfiguration().uiMode;
        final boolean b = false;
        t$c t$c;
        if ((uiMode & 0x30) == 0x20) {
            t$c = j3.t$c.g;
        }
        else {
            t$c = j3.t$c.f;
        }
        final TextServicesManager s = this.s;
        boolean b2 = false;
        Label_0105: {
            Label_0103: {
                if (s != null) {
                    if (Build$VERSION.SDK_INT >= 31) {
                        final boolean a = a0.a(z.a(io.flutter.embedding.android.y.a(s)), (Predicate)new d0());
                        if (!b0.a(this.s) || !a) {
                            break Label_0103;
                        }
                    }
                    b2 = true;
                    break Label_0105;
                }
            }
            b2 = false;
        }
        final t$b d = this.j.v().d().f(((View)this).getResources().getConfiguration().fontScale).c(((View)this).getResources().getDisplayMetrics()).d(b2);
        boolean b3 = b;
        if (Settings$System.getInt(((View)this).getContext().getContentResolver(), "show_password", 1) == 1) {
            b3 = true;
        }
        d.b(b3).g(DateFormat.is24HourFormat(((View)this).getContext())).e(t$c).a();
    }
    
    public void a(final KeyEvent keyEvent) {
        ((View)this).getRootView().dispatchKeyEvent(keyEvent);
    }
    
    public void autofill(final SparseArray sparseArray) {
        this.m.j(sparseArray);
    }
    
    public boolean b(final KeyEvent keyEvent) {
        return this.m.q(keyEvent);
    }
    
    public PointerIcon c(final int n) {
        return c0.a(((View)this).getContext(), n);
    }
    
    public boolean checkInputConnectionProxy(final View view) {
        final a j = this.j;
        boolean b;
        if (j != null) {
            b = j.q().G(view);
        }
        else {
            b = super.checkInputConnectionProxy(view);
        }
        return b;
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final int action = keyEvent.getAction();
        final boolean b = true;
        if (action == 0 && keyEvent.getRepeatCount() == 0) {
            ((View)this).getKeyDispatcherState().startTracking(keyEvent, (Object)this);
        }
        else if (keyEvent.getAction() == 1) {
            ((View)this).getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if (this.v()) {
            final boolean b2 = b;
            if (this.p.b(keyEvent)) {
                return b2;
            }
        }
        return super.dispatchKeyEvent(keyEvent) && b;
    }
    
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        final k r = this.r;
        if (r != null && r.C()) {
            return (AccessibilityNodeProvider)this.r;
        }
        return null;
    }
    
    public a getAttachedFlutterEngine() {
        return this.j;
    }
    
    public k3.c getBinaryMessenger() {
        return (k3.c)this.j.k();
    }
    
    public r getCurrentImageSurface() {
        return this.e;
    }
    
    public boolean k() {
        final r e = this.e;
        return e != null && e.e();
    }
    
    public void l(final l l) {
        this.h.add((Object)l);
    }
    
    public void m(final r r) {
        final a j = this.j;
        if (j != null) {
            r.a(j.t());
        }
    }
    
    public void n(final a j) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Attaching to a FlutterEngine: ");
        sb.append((Object)j);
        a3.b.f("FlutterView", sb.toString());
        if (this.v()) {
            if (j == this.j) {
                a3.b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            }
            a3.b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
            this.s();
        }
        this.j = j;
        final FlutterRenderer t = j.t();
        this.i = t.n();
        this.f.a(t);
        t.j(this.x);
        if (Build$VERSION.SDK_INT >= 24) {
            this.l = new b((b$c)this, this.j.n());
        }
        this.m = new k0((View)this, this.j.y(), this.j.q());
        try {
            final TextServicesManager s = (TextServicesManager)((View)this).getContext().getSystemService("textservices");
            this.s = s;
            this.n = new o(s, this.j.w());
        }
        catch (final Exception ex) {
            a3.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.o = this.j.m();
        this.p = new m0((m0.m0$e)this);
        this.q = new c(this.j.t(), false);
        (this.r = new k((View)this, j.h(), (AccessibilityManager)((View)this).getContext().getSystemService("accessibility"), ((View)this).getContext().getContentResolver(), (io.flutter.plugin.platform.t)this.j.q())).a0(this.v);
        this.z(this.r.C(), this.r.E());
        this.j.q().b(this.r);
        this.j.q().E(this.j.t());
        this.m.p().restartInput((View)this);
        this.B();
        ((View)this).getContext().getContentResolver().registerContentObserver(Settings$System.getUriFor("show_password"), false, this.w);
        this.C();
        j.q().F(this);
        final Iterator iterator = this.k.iterator();
        if (!iterator.hasNext()) {
            if (this.i) {
                this.x.g();
            }
            return;
        }
        l.d.a(iterator.next());
        throw null;
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        final WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT == 29) {
            final Insets a = p0.a(windowInsets);
            this.u.l = t0.a(a);
            this.u.m = s0.a(a);
            this.u.n = u0.a(a);
            this.u.o = androidx.appcompat.widget.r0.a(a);
        }
        final int windowSystemUiVisibility = ((View)this).getWindowSystemUiVisibility();
        boolean b = true;
        int n = 0;
        final boolean b2 = (windowSystemUiVisibility & 0x4) == 0x0;
        if ((((View)this).getWindowSystemUiVisibility() & 0x2) != 0x0) {
            b = false;
        }
        if (sdk_INT >= 30) {
            if (b) {
                n = (0x0 | v0.a());
            }
            int n2 = n;
            if (b2) {
                n2 = (n | androidx.core.view.u0.a());
            }
            final Insets a2 = androidx.core.view.t0.a(windowInsets, n2);
            this.u.d = t0.a(a2);
            this.u.e = s0.a(a2);
            this.u.f = u0.a(a2);
            this.u.g = androidx.appcompat.widget.r0.a(a2);
            final Insets a3 = androidx.core.view.t0.a(windowInsets, x0.a());
            this.u.h = t0.a(a3);
            this.u.i = s0.a(a3);
            this.u.j = u0.a(a3);
            this.u.k = androidx.appcompat.widget.r0.a(a3);
            final Insets a4 = androidx.core.view.t0.a(windowInsets, y0.a());
            this.u.l = t0.a(a4);
            this.u.m = s0.a(a4);
            this.u.n = u0.a(a4);
            this.u.o = androidx.appcompat.widget.r0.a(a4);
            final DisplayCutout a5 = n0.a(windowInsets);
            if (a5 != null) {
                final Insets a6 = io.flutter.embedding.android.x.a(a5);
                final FlutterRenderer$h u = this.u;
                u.d = Math.max(Math.max(u.d, t0.a(a6)), c1.l.a(a5));
                final FlutterRenderer$h u2 = this.u;
                u2.e = Math.max(Math.max(u2.e, s0.a(a6)), c1.m.a(a5));
                final FlutterRenderer$h u3 = this.u;
                u3.f = Math.max(Math.max(u3.f, u0.a(a6)), c1.j.a(a5));
                final FlutterRenderer$h u4 = this.u;
                u4.g = Math.max(Math.max(u4.g, androidx.appcompat.widget.r0.a(a6)), c1.k.a(a5));
            }
        }
        else {
            e0.e0$f e0$f = e0.e0$f.e;
            if (!b) {
                e0$f = this.o();
            }
            final FlutterRenderer$h u5 = this.u;
            int systemWindowInsetTop;
            if (b2) {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
            }
            else {
                systemWindowInsetTop = 0;
            }
            u5.d = systemWindowInsetTop;
            final FlutterRenderer$h u6 = this.u;
            int systemWindowInsetRight;
            if (e0$f != e0.e0$f.g && e0$f != e0.e0$f.h) {
                systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
            }
            else {
                systemWindowInsetRight = 0;
            }
            u6.e = systemWindowInsetRight;
            final FlutterRenderer$h u7 = this.u;
            int systemWindowInsetBottom;
            if (b && this.t(windowInsets) == 0) {
                systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            }
            else {
                systemWindowInsetBottom = 0;
            }
            u7.f = systemWindowInsetBottom;
            final FlutterRenderer$h u8 = this.u;
            int systemWindowInsetLeft;
            if (e0$f != e0.e0$f.f && e0$f != e0.e0$f.h) {
                systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            }
            else {
                systemWindowInsetLeft = 0;
            }
            u8.g = systemWindowInsetLeft;
            final FlutterRenderer$h u9 = this.u;
            u9.h = 0;
            u9.i = 0;
            u9.j = this.t(windowInsets);
            this.u.k = 0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: ");
        sb.append(this.u.d);
        sb.append(", Left: ");
        sb.append(this.u.g);
        sb.append(", Right: ");
        sb.append(this.u.e);
        sb.append("\nKeyboard insets: Bottom: ");
        sb.append(this.u.j);
        sb.append(", Left: ");
        sb.append(this.u.k);
        sb.append(", Right: ");
        sb.append(this.u.i);
        sb.append("System Gesture Insets - Left: ");
        sb.append(this.u.o);
        sb.append(", Top: ");
        sb.append(this.u.l);
        sb.append(", Right: ");
        sb.append(this.u.m);
        sb.append(", Bottom: ");
        sb.append(this.u.j);
        a3.b.f("FlutterView", sb.toString());
        this.C();
        return onApplyWindowInsets;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t = this.r();
        final Activity e = t3.i.e(((View)this).getContext());
        final r0 t = this.t;
        if (t != null && e != null) {
            t.a(e, androidx.core.content.a.f(((View)this).getContext()), this.y);
        }
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.j != null) {
            a3.b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.o.d(configuration);
            this.B();
            t3.i.c(((View)this).getContext(), (i$a)this.j);
        }
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        if (!this.v()) {
            return super.onCreateInputConnection(editorInfo);
        }
        return this.m.n((View)this, this.p, editorInfo);
    }
    
    protected void onDetachedFromWindow() {
        final r0 t = this.t;
        if (t != null) {
            t.b(this.y);
        }
        this.t = null;
        super.onDetachedFromWindow();
    }
    
    public boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        final boolean v = this.v();
        boolean onGenericMotionEvent = true;
        if (!v || !this.q.j(motionEvent, ((View)this).getContext())) {
            onGenericMotionEvent = super.onGenericMotionEvent(motionEvent);
        }
        return onGenericMotionEvent;
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        if (!this.v()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.r.L(motionEvent);
    }
    
    public void onProvideAutofillVirtualStructure(final ViewStructure viewStructure, final int n) {
        super.onProvideAutofillVirtualStructure(viewStructure, n);
        this.m.y(viewStructure, n);
    }
    
    protected void onSizeChanged(final int b, final int c, final int n, final int n2) {
        super.onSizeChanged(b, c, n, n2);
        final StringBuilder sb = new StringBuilder();
        sb.append("Size changed. Sending Flutter new viewport metrics. FlutterView was ");
        sb.append(n);
        sb.append(" x ");
        sb.append(n2);
        sb.append(", it is now ");
        sb.append(b);
        sb.append(" x ");
        sb.append(c);
        a3.b.f("FlutterView", sb.toString());
        final FlutterRenderer$h u = this.u;
        u.b = b;
        u.c = c;
        this.C();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.v()) {
            return super.onTouchEvent(motionEvent);
        }
        ((View)this).requestUnbufferedDispatch(motionEvent);
        return this.q.k(motionEvent);
    }
    
    public void p() {
        this.f.b();
        final r e = this.e;
        if (e == null) {
            ((ViewGroup)this).addView((View)(this.e = this.q()));
        }
        else {
            e.k(((View)this).getWidth(), ((View)this).getHeight());
        }
        this.g = this.f;
        final r e2 = this.e;
        this.f = (m)e2;
        final a j = this.j;
        if (j != null) {
            ((m)e2).a(j.t());
        }
    }
    
    public r q() {
        return new r(((View)this).getContext(), ((View)this).getWidth(), ((View)this).getHeight(), r$b.e);
    }
    
    protected r0 r() {
        try {
            return new r0(new x0.a(y0.f.a.d(((View)this).getContext())));
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {
            return null;
        }
    }
    
    public void s() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Detaching from a FlutterEngine: ");
        sb.append((Object)this.j);
        a3.b.f("FlutterView", sb.toString());
        if (!this.v()) {
            a3.b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        final Iterator iterator = this.k.iterator();
        if (!iterator.hasNext()) {
            ((View)this).getContext().getContentResolver().unregisterContentObserver(this.w);
            this.j.q().P();
            this.j.q().a();
            this.r.S();
            this.r = null;
            this.m.p().restartInput((View)this);
            this.m.o();
            this.p.d();
            final o n = this.n;
            if (n != null) {
                n.b();
            }
            final b l = this.l;
            if (l != null) {
                l.c();
            }
            final FlutterRenderer t = this.j.t();
            this.i = false;
            t.u(this.x);
            t.A();
            t.x(false);
            final m g = this.g;
            if (g != null && this.f == this.e) {
                this.f = g;
            }
            this.f.c();
            this.x();
            this.g = null;
            this.j = null;
            return;
        }
        l.d.a(iterator.next());
        throw null;
    }
    
    public void setVisibility(final int n) {
        super.setVisibility(n);
        final m f = this.f;
        if (f instanceof s) {
            ((View)f).setVisibility(n);
        }
    }
    
    @TargetApi(28)
    protected void setWindowInfoListenerDisplayFeatures(final j j) {
        final List a = j.a();
        final ArrayList q = new ArrayList();
        for (final y0.a a2 : a) {
            final StringBuilder sb = new StringBuilder();
            sb.append("WindowInfoTracker Display Feature reported with bounds = ");
            sb.append(a2.b().toString());
            sb.append(" and type = ");
            sb.append(a2.getClass().getSimpleName());
            a3.b.f("FlutterView", sb.toString());
            if (a2 instanceof y0.c) {
                final y0.c c = (y0.c)a2;
                FlutterRenderer$e flutterRenderer$e;
                if (c.c() == y0.c.a.d) {
                    flutterRenderer$e = FlutterRenderer$e.h;
                }
                else {
                    flutterRenderer$e = FlutterRenderer$e.g;
                }
                FlutterRenderer$d flutterRenderer$d;
                if (c.a() == y0.c.b.c) {
                    flutterRenderer$d = FlutterRenderer$d.g;
                }
                else if (c.a() == y0.c.b.d) {
                    flutterRenderer$d = FlutterRenderer$d.h;
                }
                else {
                    flutterRenderer$d = FlutterRenderer$d.f;
                }
                ((List)q).add((Object)new FlutterRenderer$c(a2.b(), flutterRenderer$e, flutterRenderer$d));
            }
            else {
                ((List)q).add((Object)new FlutterRenderer$c(a2.b(), FlutterRenderer$e.f, FlutterRenderer$d.f));
            }
        }
        if (Build$VERSION.SDK_INT >= 28) {
            final WindowInsets a3 = io.flutter.embedding.android.v.a(this);
            if (a3 != null) {
                final DisplayCutout a4 = n0.a(a3);
                if (a4 != null) {
                    for (final Rect rect : io.flutter.embedding.android.w.a(a4)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("DisplayCutout area reported with bounds = ");
                        sb2.append(rect.toString());
                        a3.b.f("FlutterView", sb2.toString());
                        ((List)q).add((Object)new FlutterRenderer$c(rect, FlutterRenderer$e.i));
                    }
                }
            }
        }
        this.u.q = (List)q;
        this.C();
    }
    
    public boolean v() {
        final a j = this.j;
        return j != null && j.t() == this.f.getAttachedRenderer();
    }
    
    public void y(final l l) {
        this.h.remove((Object)l);
    }
}
