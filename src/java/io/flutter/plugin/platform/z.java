package io.flutter.plugin.platform;

import io.flutter.embedding.android.o0$a;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.view.k;
import android.content.MutableContextWrapper;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import android.view.MotionEvent;
import android.view.MotionEvent$PointerProperties;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.view.MotionEvent$PointerCoords;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.embedding.android.r;
import android.view.View$OnFocusChangeListener;
import android.view.ViewGroup$LayoutParams;
import j3.q$e;
import android.view.ViewGroup;
import j3.q$f;
import j3.q$d$a;
import t3.i;
import android.os.Build$VERSION;
import j3.q$d;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import a3.b;
import j3.q$c;
import j3.q$b;
import android.view.SurfaceView;
import j3.q$g;
import io.flutter.embedding.android.o0;
import java.util.HashSet;
import android.util.SparseArray;
import java.util.HashMap;
import j3.q;
import io.flutter.plugin.editing.k0;
import io.flutter.view.TextureRegistry;
import io.flutter.embedding.android.e0;
import android.content.Context;
import io.flutter.embedding.android.c;

public class z implements t
{
    private static Class[] w;
    private static boolean x = true;
    private static boolean y = true;
    private final o a;
    private c b;
    private Context c;
    private e0 d;
    private TextureRegistry e;
    private k0 f;
    private q g;
    private final a h;
    final HashMap i;
    final HashMap j;
    private final SparseArray k;
    private final SparseArray l;
    private final SparseArray m;
    private final SparseArray n;
    private int o;
    private boolean p;
    private boolean q;
    private final HashSet r;
    private final HashSet s;
    private final o0 t;
    private boolean u;
    private final q$g v;
    
    static {
        z.w = new Class[] { SurfaceView.class };
    }
    
    public z() {
        this.o = 0;
        this.p = false;
        this.q = true;
        this.u = false;
        this.v = (q$g)new q$g() {
            final z a;
            
            public void a(final int n) {
                View view = null;
                while (true) {
                    Label_0094: {
                        if (this.a.c(n)) {
                            view = ((j0)this.a.i.get((Object)n)).g();
                            break Label_0094;
                        }
                        final l l = (l)this.a.k.get(n);
                        if (l != null) {
                            view = l.X();
                            break Label_0094;
                        }
                        final StringBuilder sb = new StringBuilder();
                        final String s = "Clearing focus on an unknown view with id: ";
                        sb.append(s);
                        sb.append(n);
                        a3.b.b("PlatformViewsController", sb.toString());
                        return;
                    }
                    if (view == null) {
                        final StringBuilder sb = new StringBuilder();
                        final String s = "Clearing focus on a null view with id: ";
                        continue;
                    }
                    break;
                }
                view.clearFocus();
            }
            
            public void b(final boolean b) {
                this.a.q = b;
            }
            
            public void c(int l, final double n, final double n2) {
                if (this.a.c(l)) {
                    return;
                }
                final s s = (s)this.a.n.get(l);
                if (s == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Setting offset for unknown platform view with id: ");
                    sb.append(l);
                    a3.b.b("PlatformViewsController", sb.toString());
                    return;
                }
                final int i = this.a.y0(n);
                l = this.a.y0(n2);
                final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)((View)s).getLayoutParams();
                layoutParams.topMargin = i;
                layoutParams.leftMargin = l;
                s.setLayoutParams(layoutParams);
            }
            
            public void d(final int n, final int layoutDirection) {
                if (!B0(layoutDirection)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Trying to set unknown direction value: ");
                    sb.append(layoutDirection);
                    sb.append("(view id: ");
                    sb.append(n);
                    sb.append(")");
                    throw new IllegalStateException(sb.toString());
                }
                View view = null;
                while (true) {
                    Label_0103: {
                        if (this.a.c(n)) {
                            view = ((j0)this.a.i.get((Object)n)).g();
                            break Label_0103;
                        }
                        final l l = (l)this.a.k.get(n);
                        if (l != null) {
                            view = l.X();
                            break Label_0103;
                        }
                        final StringBuilder sb2 = new StringBuilder();
                        final String s = "Setting direction to an unknown view with id: ";
                        sb2.append(s);
                        sb2.append(n);
                        a3.b.b("PlatformViewsController", sb2.toString());
                        return;
                    }
                    if (view == null) {
                        final StringBuilder sb2 = new StringBuilder();
                        final String s = "Setting direction to a null view with id: ";
                        continue;
                    }
                    break;
                }
                view.setLayoutDirection(layoutDirection);
            }
            
            public long e(final q$d q$d) {
                this.a.T(q$d);
                final int a = q$d.a;
                if (this.a.n.get(a) != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Trying to create an already created platform view, view id: ");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
                if (this.a.e == null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Texture registry is null. This means that platform views controller was detached, view id: ");
                    sb2.append(a);
                    throw new IllegalStateException(sb2.toString());
                }
                if (this.a.d == null) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ");
                    sb3.append(a);
                    throw new IllegalStateException(sb3.toString());
                }
                final z a2 = this.a;
                boolean b = true;
                final l m = a2.M(q$d, true);
                final View x = m.X();
                if (x.getParent() == null) {
                    if (Build$VERSION.SDK_INT < 23 || t3.i.f(x, z.w)) {
                        b = false;
                    }
                    if (!b) {
                        if (q$d.h == q$d$a.f) {
                            this.a.H(m, q$d);
                            return -2L;
                        }
                        if (!this.a.u) {
                            return this.a.J(m, q$d);
                        }
                    }
                    return this.a.I(m, q$d);
                }
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            
            public void f(final q$d q$d) {
                this.a.S(19);
                this.a.T(q$d);
                this.a.H(this.a.M(q$d, false), q$d);
            }
            
            public void g(final q$f q$f) {
                final int a = q$f.a;
                final float density = this.a.c.getResources().getDisplayMetrics().density;
                if (this.a.c(a)) {
                    ((j0)this.a.i.get((Object)a)).c(this.a.x0(density, q$f, true));
                    return;
                }
                final l l = (l)this.a.k.get(a);
                if (l == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Sending touch to an unknown view with id: ");
                    sb.append(a);
                    a3.b.b("PlatformViewsController", sb.toString());
                    return;
                }
                final View x = l.X();
                if (x == null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Sending touch to a null view with id: ");
                    sb2.append(a);
                    a3.b.b("PlatformViewsController", sb2.toString());
                    return;
                }
                x.dispatchTouchEvent(this.a.x0(density, q$f, false));
            }
            
            public void h(final int n) {
                final l l = (l)this.a.k.get(n);
                if (l == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Disposing unknown platform view with id: ");
                    sb.append(n);
                    a3.b.b("PlatformViewsController", sb.toString());
                    return;
                }
                if (l.X() != null) {
                    final View x = l.X();
                    final ViewGroup viewGroup = (ViewGroup)x.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(x);
                    }
                }
                this.a.k.remove(n);
                try {
                    l.a();
                }
                catch (final RuntimeException ex) {
                    a3.b.c("PlatformViewsController", "Disposing platform view threw an exception", (Throwable)ex);
                }
                if (this.a.c(n)) {
                    final j0 j0 = (j0)this.a.i.get((Object)n);
                    final View g = j0.g();
                    if (g != null) {
                        this.a.j.remove((Object)g.getContext());
                    }
                    j0.d();
                    this.a.i.remove((Object)n);
                    return;
                }
                final s s = (s)this.a.n.get(n);
                if (s != null) {
                    ((ViewGroup)s).removeAllViews();
                    s.a();
                    s.c();
                    final ViewGroup viewGroup2 = (ViewGroup)((View)s).getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView((View)s);
                    }
                    this.a.n.remove(n);
                    return;
                }
                final e3.a a = (e3.a)this.a.l.get(n);
                if (a != null) {
                    ((ViewGroup)a).removeAllViews();
                    a.b();
                    final ViewGroup viewGroup3 = (ViewGroup)((View)a).getParent();
                    if (viewGroup3 != null) {
                        viewGroup3.removeView((View)a);
                    }
                    this.a.l.remove(n);
                }
            }
            
            public void i(final q$e q$e, final q$b q$b) {
                final int l = this.a.y0(q$e.b);
                final int i = this.a.y0(q$e.c);
                final int a = q$e.a;
                if (this.a.c(a)) {
                    final float m = this.a.V();
                    final j0 j0 = (j0)this.a.i.get((Object)a);
                    this.a.d0(j0);
                    j0.k(l, i, (Runnable)new y(this, j0, m, q$b));
                    return;
                }
                final l k = (l)this.a.k.get(a);
                final s s = (s)this.a.n.get(a);
                if (k != null && s != null) {
                    if (l > s.getRenderTargetWidth() || i > s.getRenderTargetHeight()) {
                        s.b(l, i);
                    }
                    final ViewGroup$LayoutParams layoutParams = ((View)s).getLayoutParams();
                    layoutParams.width = l;
                    layoutParams.height = i;
                    ((View)s).setLayoutParams(layoutParams);
                    final View x = k.X();
                    if (x != null) {
                        final ViewGroup$LayoutParams layoutParams2 = x.getLayoutParams();
                        layoutParams2.width = l;
                        layoutParams2.height = i;
                        x.setLayoutParams(layoutParams2);
                    }
                    q$b.a(new q$c(this.a.v0(s.getRenderTargetWidth()), this.a.v0(s.getRenderTargetHeight())));
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Resizing unknown platform view with id: ");
                sb.append(a);
                a3.b.b("PlatformViewsController", sb.toString());
            }
        };
        this.a = new o();
        this.i = new HashMap();
        this.h = new a();
        this.j = new HashMap();
        this.m = new SparseArray();
        this.r = new HashSet();
        this.s = new HashSet();
        this.n = new SparseArray();
        this.k = new SparseArray();
        this.l = new SparseArray();
        this.t = o0.a();
    }
    
    private void A0(final j0 j0) {
        final k0 f = this.f;
        if (f == null) {
            return;
        }
        f.F();
        j0.i();
    }
    
    private static boolean B0(final int n) {
        boolean b = true;
        if (n != 0) {
            b = (n == 1 && b);
        }
        return b;
    }
    
    private void H(final l l, final q$d q$d) {
        this.S(19);
        final StringBuilder sb = new StringBuilder();
        sb.append("Using hybrid composition for platform view: ");
        sb.append(q$d.a);
        a3.b.e("PlatformViewsController", sb.toString());
    }
    
    private long J(final l l, final q$d q$d) {
        this.S(20);
        final StringBuilder sb = new StringBuilder();
        sb.append("Hosting view in a virtual display for platform view: ");
        sb.append(q$d.a);
        a3.b.e("PlatformViewsController", sb.toString());
        final io.flutter.plugin.platform.q e0 = e0(this.e);
        final j0 b = j0.b(this.c, this.h, l, e0, this.y0(q$d.c), this.y0(q$d.d), q$d.a, (Object)null, (View$OnFocusChangeListener)new x(this, q$d));
        if (b != null) {
            this.i.put((Object)q$d.a, (Object)b);
            final View x = l.X();
            this.j.put((Object)x.getContext(), (Object)x);
            return e0.a();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed creating virtual display for a ");
        sb2.append(q$d.b);
        sb2.append(" with id: ");
        sb2.append(q$d.a);
        throw new IllegalStateException(sb2.toString());
    }
    
    private void R() {
        while (this.k.size() > 0) {
            this.v.h(this.k.keyAt(0));
        }
    }
    
    private void S(final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= n) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Trying to use platform views with API ");
        sb.append(sdk_INT);
        sb.append(", required API level is: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    private void T(final q$d q$d) {
        if (B0(q$d.g)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Trying to create a view with unknown direction value: ");
        sb.append(q$d.g);
        sb.append("(view id: ");
        sb.append(q$d.a);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }
    
    private void U(boolean b) {
        for (int i = 0; i < this.m.size(); ++i) {
            final int key = this.m.keyAt(i);
            final io.flutter.plugin.platform.c c = (io.flutter.plugin.platform.c)this.m.valueAt(i);
            if (this.r.contains((Object)key)) {
                this.d.m((r)c);
                b &= ((r)c).e();
            }
            else {
                if (!this.p) {
                    ((r)c).c();
                }
                ((View)c).setVisibility(8);
                ((ViewGroup)this.d).removeView((View)c);
            }
        }
        for (int j = 0; j < this.l.size(); ++j) {
            final int key2 = this.l.keyAt(j);
            final View view = (View)this.l.get(key2);
            if (this.s.contains((Object)key2) && (b || !this.q)) {
                view.setVisibility(0);
            }
            else {
                view.setVisibility(8);
            }
        }
    }
    
    private float V() {
        return this.c.getResources().getDisplayMetrics().density;
    }
    
    private void Y() {
        if (this.q && !this.p) {
            this.d.p();
            this.p = true;
        }
    }
    
    private void d0(final j0 j0) {
        final k0 f = this.f;
        if (f == null) {
            return;
        }
        f.t();
        j0.h();
    }
    
    private static io.flutter.plugin.platform.q e0(final TextureRegistry textureRegistry) {
        if (z.y && Build$VERSION.SDK_INT >= 29) {
            final TextureRegistry$SurfaceProducer a = textureRegistry.a();
            b.e("PlatformViewsController", "PlatformView is using SurfaceProducer backend");
            return (io.flutter.plugin.platform.q)new g0(a);
        }
        if (z.x && Build$VERSION.SDK_INT >= 29) {
            final TextureRegistry$ImageTextureEntry b = textureRegistry.b();
            a3.b.e("PlatformViewsController", "PlatformView is using ImageReader backend");
            return (io.flutter.plugin.platform.q)new io.flutter.plugin.platform.b(b);
        }
        final TextureRegistry$SurfaceTextureEntry c = textureRegistry.c();
        b.e("PlatformViewsController", "PlatformView is using SurfaceTexture backend");
        return (io.flutter.plugin.platform.q)new i0(c);
    }
    
    private void f0(final l l) {
        final e0 d = this.d;
        if (d == null) {
            a3.b.e("PlatformViewsController", "null flutterView");
            return;
        }
        l.G((View)d);
    }
    
    private static MotionEvent$PointerCoords p0(final Object o, final float n) {
        final List list = (List)o;
        final MotionEvent$PointerCoords motionEvent$PointerCoords = new MotionEvent$PointerCoords();
        motionEvent$PointerCoords.orientation = (float)(double)list.get(0);
        motionEvent$PointerCoords.pressure = (float)(double)list.get(1);
        motionEvent$PointerCoords.size = (float)(double)list.get(2);
        final double doubleValue = (double)list.get(3);
        final double n2 = n;
        motionEvent$PointerCoords.toolMajor = (float)(doubleValue * n2);
        motionEvent$PointerCoords.toolMinor = (float)((double)list.get(4) * n2);
        motionEvent$PointerCoords.touchMajor = (float)((double)list.get(5) * n2);
        motionEvent$PointerCoords.touchMinor = (float)((double)list.get(6) * n2);
        motionEvent$PointerCoords.x = (float)((double)list.get(7) * n2);
        motionEvent$PointerCoords.y = (float)((double)list.get(8) * n2);
        return motionEvent$PointerCoords;
    }
    
    private static List q0(final Object o, final float n) {
        final List list = (List)o;
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((List)list2).add((Object)p0(iterator.next(), n));
        }
        return (List)list2;
    }
    
    private static MotionEvent$PointerProperties r0(final Object o) {
        final List list = (List)o;
        final MotionEvent$PointerProperties motionEvent$PointerProperties = new MotionEvent$PointerProperties();
        motionEvent$PointerProperties.id = (int)list.get(0);
        motionEvent$PointerProperties.toolType = (int)list.get(1);
        return motionEvent$PointerProperties;
    }
    
    private static List s0(final Object o) {
        final List list = (List)o;
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((List)list2).add((Object)r0(iterator.next()));
        }
        return (List)list2;
    }
    
    private void t0() {
        if (this.d == null) {
            a3.b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i = 0; i < this.m.size(); ++i) {
            ((ViewGroup)this.d).removeView((View)this.m.valueAt(i));
        }
        this.m.clear();
    }
    
    private int v0(final double n) {
        return this.w0(n, this.V());
    }
    
    private int w0(final double n, final float n2) {
        return (int)Math.round(n / n2);
    }
    
    private int y0(final double n) {
        return (int)Math.round(n * this.V());
    }
    
    private static void z0(final MotionEvent motionEvent, final MotionEvent$PointerCoords[] array) {
        if (array.length < 1) {
            return;
        }
        motionEvent.offsetLocation(array[0].x - motionEvent.getX(), array[0].y - motionEvent.getY());
    }
    
    public void C(final Context c, final TextureRegistry e, final b3.a a) {
        if (this.c == null) {
            this.c = c;
            this.e = e;
            (this.g = new q(a)).e(this.v);
            return;
        }
        throw new AssertionError((Object)"A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }
    
    public void D(final k0 f) {
        this.f = f;
    }
    
    public void E(final FlutterRenderer flutterRenderer) {
        this.b = new c(flutterRenderer, true);
    }
    
    public void F(final e0 d) {
        this.d = d;
        final int n = 0;
        for (int i = 0; i < this.n.size(); ++i) {
            ((ViewGroup)this.d).addView((View)this.n.valueAt(i));
        }
        int n2 = 0;
        int j;
        while (true) {
            j = n;
            if (n2 >= this.l.size()) {
                break;
            }
            ((ViewGroup)this.d).addView((View)this.l.valueAt(n2));
            ++n2;
        }
        while (j < this.k.size()) {
            ((l)this.k.valueAt(j)).G((View)this.d);
            ++j;
        }
    }
    
    public boolean G(final View view) {
        if (view == null) {
            return false;
        }
        if (!this.j.containsKey((Object)view.getContext())) {
            return false;
        }
        final View view2 = (View)this.j.get((Object)view.getContext());
        return view2 == view || view2.checkInputConnectionProxy(view);
    }
    
    public long I(final l l, final q$d q$d) {
        this.S(23);
        final StringBuilder sb = new StringBuilder();
        sb.append("Hosting view in view hierarchy for platform view: ");
        sb.append(q$d.a);
        a3.b.e("PlatformViewsController", sb.toString());
        final int y0 = this.y0(q$d.c);
        final int y2 = this.y0(q$d.d);
        s s;
        long a;
        if (this.u) {
            s = new s(this.c);
            a = -1L;
        }
        else {
            final io.flutter.plugin.platform.q e0 = e0(this.e);
            s = new s(this.c, e0);
            a = e0.a();
        }
        s.setTouchProcessor(this.b);
        s.b(y0, y2);
        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(y0, y2);
        final int y3 = this.y0(q$d.e);
        final int y4 = this.y0(q$d.f);
        layoutParams.topMargin = y3;
        layoutParams.leftMargin = y4;
        s.setLayoutParams(layoutParams);
        final View x = l.X();
        x.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(y0, y2));
        x.setImportantForAccessibility(4);
        ((ViewGroup)s).addView(x);
        s.setOnDescendantFocusChangeListener((View$OnFocusChangeListener)new w(this, q$d));
        ((ViewGroup)this.d).addView((View)s);
        this.n.append(q$d.a, (Object)s);
        this.f0(l);
        return a;
    }
    
    public FlutterOverlaySurface K() {
        return this.L(new io.flutter.plugin.platform.c(((View)this.d).getContext(), ((View)this.d).getWidth(), ((View)this.d).getHeight(), this.h));
    }
    
    public FlutterOverlaySurface L(final io.flutter.plugin.platform.c c) {
        final int n = this.o++;
        this.m.put(n, (Object)c);
        return new FlutterOverlaySurface(n, ((r)c).getSurface());
    }
    
    public l M(final q$d q$d, final boolean b) {
        final m b2 = this.a.b(q$d.b);
        if (b2 == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Trying to create a platform view of unregistered type: ");
            sb.append(q$d.b);
            throw new IllegalStateException(sb.toString());
        }
        Object a;
        if (q$d.i != null) {
            a = b2.b().a(q$d.i);
        }
        else {
            a = null;
        }
        Object c;
        if (b) {
            c = new MutableContextWrapper(this.c);
        }
        else {
            c = this.c;
        }
        final l a2 = b2.a((Context)c, q$d.a, a);
        final View x = a2.X();
        if (x != null) {
            x.setLayoutDirection(q$d.g);
            this.k.put(q$d.a, (Object)a2);
            this.f0(a2);
            return a2;
        }
        throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
    }
    
    public void N() {
        for (int i = 0; i < this.m.size(); ++i) {
            final io.flutter.plugin.platform.c c = (io.flutter.plugin.platform.c)this.m.valueAt(i);
            ((r)c).c();
            ((r)c).g();
        }
    }
    
    public void O() {
        final q g = this.g;
        if (g != null) {
            g.e((q$g)null);
        }
        this.N();
        this.g = null;
        this.c = null;
        this.e = null;
    }
    
    public void P() {
        final int n = 0;
        for (int i = 0; i < this.n.size(); ++i) {
            ((ViewGroup)this.d).removeView((View)this.n.valueAt(i));
        }
        for (int j = 0; j < this.l.size(); ++j) {
            ((ViewGroup)this.d).removeView((View)this.l.valueAt(j));
        }
        this.N();
        this.t0();
        this.d = null;
        this.p = false;
        for (int k = n; k < this.k.size(); ++k) {
            ((l)this.k.valueAt(k)).M();
        }
    }
    
    public void Q() {
        this.f = null;
    }
    
    public n W() {
        return (n)this.a;
    }
    
    void X(final int n) {
        final l l = (l)this.k.get(n);
        if (l == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        }
        if (this.l.get(n) != null) {
            return;
        }
        final View x = l.X();
        if (x == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (x.getParent() == null) {
            final Context c = this.c;
            final e3.a a = new e3.a(c, c.getResources().getDisplayMetrics().density, this.b);
            a.setOnDescendantFocusChangeListener((View$OnFocusChangeListener)new u(this, n));
            this.l.put(n, (Object)a);
            x.setImportantForAccessibility(4);
            ((ViewGroup)a).addView(x);
            ((ViewGroup)this.d).addView((View)a);
            return;
        }
        throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
    }
    
    public void a() {
        this.h.c((k)null);
    }
    
    public void b(final k k) {
        this.h.c(k);
    }
    
    public boolean c(final int n) {
        return this.i.containsKey((Object)n);
    }
    
    public View d(final int n) {
        if (this.c(n)) {
            return ((j0)this.i.get((Object)n)).g();
        }
        final l l = (l)this.k.get(n);
        if (l == null) {
            return null;
        }
        return l.X();
    }
    
    public void g0() {
    }
    
    public void h0() {
        this.r.clear();
        this.s.clear();
    }
    
    public void i0() {
        this.R();
    }
    
    public void j0(final int n, final int leftMargin, final int topMargin, final int n2, final int n3) {
        if (this.m.get(n) != null) {
            this.Y();
            final io.flutter.plugin.platform.c c = (io.flutter.plugin.platform.c)this.m.get(n);
            if (((View)c).getParent() == null) {
                ((ViewGroup)this.d).addView((View)c);
            }
            final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(n2, n3);
            layoutParams.leftMargin = leftMargin;
            layoutParams.topMargin = topMargin;
            ((View)c).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            ((View)c).setVisibility(0);
            ((View)c).bringToFront();
            this.r.add((Object)n);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("The overlay surface (id:");
        sb.append(n);
        sb.append(") doesn't exist");
        throw new IllegalStateException(sb.toString());
    }
    
    public void k0(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final FlutterMutatorsStack flutterMutatorsStack) {
        this.Y();
        this.X(n);
        final e3.a a = (e3.a)this.l.get(n);
        a.a(flutterMutatorsStack, n2, n3, n4, n5);
        ((View)a).setVisibility(0);
        ((View)a).bringToFront();
        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(n6, n7);
        final View x = ((l)this.k.get(n)).X();
        if (x != null) {
            x.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            x.bringToFront();
        }
        this.s.add((Object)n);
    }
    
    public void l0() {
        final boolean p = this.p;
        final boolean b = false;
        if (p && this.s.isEmpty()) {
            this.p = false;
            this.d.A((Runnable)new v(this));
            return;
        }
        boolean b2 = b;
        if (this.p) {
            b2 = b;
            if (this.d.k()) {
                b2 = true;
            }
        }
        this.U(b2);
    }
    
    public void m0() {
        this.R();
    }
    
    public void n0() {
        final Iterator iterator = this.i.values().iterator();
        while (iterator.hasNext()) {
            ((j0)iterator.next()).j();
        }
    }
    
    public void o0(final int n) {
        if (n < 40) {
            return;
        }
        final Iterator iterator = this.i.values().iterator();
        while (iterator.hasNext()) {
            ((j0)iterator.next()).a();
        }
    }
    
    public void u0(final boolean u) {
        this.u = u;
    }
    
    public MotionEvent x0(final float n, final q$f q$f, final boolean b) {
        final MotionEvent b2 = this.t.b(o0$a.c(q$f.p));
        final MotionEvent$PointerCoords[] array = (MotionEvent$PointerCoords[])q0(q$f.g, n).toArray((Object[])new MotionEvent$PointerCoords[q$f.e]);
        if (!b && b2 != null) {
            z0(b2, array);
            return b2;
        }
        return MotionEvent.obtain(q$f.b.longValue(), q$f.c.longValue(), q$f.d, q$f.e, (MotionEvent$PointerProperties[])s0(q$f.f).toArray((Object[])new MotionEvent$PointerProperties[q$f.e]), array, q$f.h, q$f.i, q$f.j, q$f.k, q$f.l, q$f.m, q$f.n, q$f.o);
    }
}
