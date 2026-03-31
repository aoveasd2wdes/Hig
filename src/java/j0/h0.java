package j0;

import android.os.BaseBundle;
import android.util.SparseArray;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View$OnAttachStateChangeListener;
import androidx.core.view.y;
import i0.b;
import android.content.res.Resources$NotFoundException;
import android.view.ViewGroup;
import k0.c;
import android.util.Log;
import android.view.ViewParent;
import android.view.View;
import android.os.Bundle;

class h0
{
    private final w a;
    private final i0 b;
    private final o c;
    private boolean d;
    private int e;
    
    h0(final w a, final i0 b, final o c) {
        this.d = false;
        this.e = -1;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    h0(final w a, final i0 b, final o c, final Bundle d) {
        this.d = false;
        this.e = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        c.e = null;
        c.f = null;
        c.u = 0;
        c.r = false;
        c.m = false;
        final o i = c.i;
        String g;
        if (i != null) {
            g = i.g;
        }
        else {
            g = null;
        }
        c.j = g;
        c.i = null;
        c.d = d;
        c.h = d.getBundle("arguments");
    }
    
    private boolean l(final View view) {
        if (view == this.c.J) {
            return true;
        }
        for (ViewParent viewParent = view.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            if (viewParent == this.c.J) {
                return true;
            }
        }
        return false;
    }
    
    void a() {
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append((Object)this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Bundle d = this.c.d;
        Bundle bundle;
        if (d != null) {
            bundle = d.getBundle("savedInstanceState");
        }
        else {
            bundle = null;
        }
        this.c.o0(bundle);
        this.a.a(this.c, bundle, false);
    }
    
    void b() {
        final o r = b0.R((View)this.c.I);
        final o b = this.c.B();
        if (r != null && !r.equals((Object)b)) {
            final o c = this.c;
            k0.c.h(c, r, c.z);
        }
        final int h = this.b.h(this.c);
        final o c2 = this.c;
        c2.I.addView(c2.J, h);
    }
    
    void c() {
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append((Object)this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final o c = this.c;
        final o i = c.i;
        h0 h0 = null;
        if (i != null) {
            h0 = this.b.l(i.g);
            if (h0 == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append((Object)this.c);
                sb2.append(" declared target fragment ");
                sb2.append((Object)this.c.i);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
            final o c2 = this.c;
            c2.j = c2.i.g;
            c2.i = null;
        }
        else {
            final String j = c.j;
            if (j != null) {
                h0 = this.b.l(j);
                if (h0 == null) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Fragment ");
                    sb3.append((Object)this.c);
                    sb3.append(" declared target fragment ");
                    sb3.append(this.c.j);
                    sb3.append(" that does not belong to this FragmentManager!");
                    throw new IllegalStateException(sb3.toString());
                }
            }
        }
        if (h0 != null) {
            h0.m();
        }
        final o c3 = this.c;
        c3.v.a0();
        c3.getClass();
        final o c4 = this.c;
        c4.x = c4.v.c0();
        this.a.f(this.c, false);
        this.c.p0();
        this.a.b(this.c, false);
    }
    
    int d() {
        final o c = this.c;
        if (c.v == null) {
            return c.c;
        }
        final int e = this.e;
        final int n = h0$b.a[((Enum)c.S).ordinal()];
        int n2 = e;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        n2 = Math.min(e, -1);
                    }
                    else {
                        n2 = Math.min(e, 0);
                    }
                }
                else {
                    n2 = Math.min(e, 1);
                }
            }
            else {
                n2 = Math.min(e, 5);
            }
        }
        final o c2 = this.c;
        int n3 = n2;
        if (c2.q) {
            if (c2.r) {
                final int max = Math.max(this.e, 2);
                final View j = this.c.J;
                n3 = max;
                if (j != null) {
                    n3 = max;
                    if (j.getParent() == null) {
                        n3 = Math.min(max, 2);
                    }
                }
            }
            else if (this.e < 4) {
                n3 = Math.min(n2, c2.c);
            }
            else {
                n3 = Math.min(n2, 1);
            }
        }
        int min = n3;
        if (!this.c.m) {
            min = Math.min(n3, 1);
        }
        final o c3 = this.c;
        final ViewGroup i = c3.I;
        Enum r;
        if (i != null) {
            r = r0.t(i, c3.C()).r(this);
        }
        else {
            r = null;
        }
        int n4;
        if (r == r0.d.a.f) {
            n4 = Math.min(min, 6);
        }
        else if (r == r0.d.a.g) {
            n4 = Math.max(min, 3);
        }
        else {
            final o c4 = this.c;
            n4 = min;
            if (c4.n) {
                if (c4.T()) {
                    n4 = Math.min(min, 1);
                }
                else {
                    n4 = Math.min(min, -1);
                }
            }
        }
        final o c5 = this.c;
        int min2 = n4;
        if (c5.K) {
            min2 = n4;
            if (c5.c < 5) {
                min2 = Math.min(n4, 4);
            }
        }
        final o c6 = this.c;
        int max2 = min2;
        if (c6.o) {
            max2 = min2;
            if (c6.I != null) {
                max2 = Math.max(min2, 3);
            }
        }
        if (b0.l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(max2);
            sb.append(" for ");
            sb.append((Object)this.c);
            Log.v("FragmentManager", sb.toString());
        }
        return max2;
    }
    
    void e() {
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append((Object)this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Bundle d = this.c.d;
        Bundle bundle;
        if (d != null) {
            bundle = d.getBundle("savedInstanceState");
        }
        else {
            bundle = null;
        }
        final o c = this.c;
        if (!c.Q) {
            this.a.g(c, bundle, false);
            this.c.r0(bundle);
            this.a.c(this.c, bundle, false);
        }
        else {
            c.c = 1;
            c.I0();
        }
    }
    
    void f() {
        if (this.c.q) {
            return;
        }
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append((Object)this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final Bundle d = this.c.d;
        ViewGroup i = null;
        Bundle bundle;
        if (d != null) {
            bundle = d.getBundle("savedInstanceState");
        }
        else {
            bundle = null;
        }
        final LayoutInflater v0 = this.c.v0(bundle);
        final o c = this.c;
        final ViewGroup j = c.I;
        if (j != null) {
            i = j;
        }
        else {
            final int z = c.z;
            if (z != 0) {
                if (z == -1) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Cannot create fragment ");
                    sb2.append((Object)this.c);
                    sb2.append(" for a container view with no id");
                    throw new IllegalArgumentException(sb2.toString());
                }
                final ViewGroup viewGroup = (ViewGroup)c.v.X().a(this.c.z);
                if (viewGroup == null) {
                    final o c2 = this.c;
                    if (!c2.s) {
                        String resourceName;
                        try {
                            resourceName = c2.I().getResourceName(this.c.z);
                        }
                        catch (final Resources$NotFoundException ex) {
                            resourceName = "unknown";
                        }
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("No view found for id 0x");
                        sb3.append(Integer.toHexString(this.c.z));
                        sb3.append(" (");
                        sb3.append(resourceName);
                        sb3.append(") for fragment ");
                        sb3.append((Object)this.c);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    i = viewGroup;
                }
                else {
                    i = viewGroup;
                    if (!(viewGroup instanceof s)) {
                        k0.c.g(this.c, viewGroup);
                        i = viewGroup;
                    }
                }
            }
        }
        final o c3 = this.c;
        c3.s0(v0, c3.I = i, bundle);
        if (this.c.J != null) {
            if (b0.l0(3)) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("moveto VIEW_CREATED: ");
                sb4.append((Object)this.c);
                Log.d("FragmentManager", sb4.toString());
            }
            this.c.J.setSaveFromParentEnabled(false);
            final o c4 = this.c;
            c4.J.setTag(i0.b.a, (Object)c4);
            if (i != null) {
                this.b();
            }
            final o c5 = this.c;
            if (c5.B) {
                c5.J.setVisibility(8);
            }
            if (this.c.J.isAttachedToWindow()) {
                y.D(this.c.J);
            }
            else {
                final View k = this.c.J;
                k.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener(this, k) {
                    final View c;
                    final h0 d;
                    
                    public void onViewAttachedToWindow(final View view) {
                        this.c.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                        y.D(this.c);
                    }
                    
                    public void onViewDetachedFromWindow(final View view) {
                    }
                });
            }
            this.c.D0();
            final w a = this.a;
            final o c6 = this.c;
            a.l(c6, c6.J, bundle, false);
            final int visibility = this.c.J.getVisibility();
            this.c.P0(this.c.J.getAlpha());
            final o c7 = this.c;
            if (c7.I != null && visibility == 0) {
                final View focus = c7.J.findFocus();
                if (focus != null) {
                    this.c.M0(focus);
                    if (b0.l0(2)) {
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append("requestFocus: Saved focused view ");
                        sb5.append((Object)focus);
                        sb5.append(" for Fragment ");
                        sb5.append((Object)this.c);
                        Log.v("FragmentManager", sb5.toString());
                    }
                }
                this.c.J.setAlpha(0.0f);
            }
        }
        this.c.c = 2;
    }
    
    void g() {
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append((Object)this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final o c = this.c;
        final boolean n = c.n;
        final boolean b = true;
        final boolean b2 = n && !c.T();
        if (b2) {
            final o c2 = this.c;
            if (!c2.p) {
                this.b.z(c2.g, null);
            }
        }
        int n2 = b ? 1 : 0;
        if (!b2) {
            if (this.b.n().n(this.c)) {
                n2 = (b ? 1 : 0);
            }
            else {
                n2 = 0;
            }
        }
        final o c3 = this.c;
        if (n2 == 0) {
            final String j = c3.j;
            if (j != null) {
                final o e = this.b.e(j);
                if (e != null && e.D) {
                    this.c.i = e;
                }
            }
            this.c.c = 0;
            return;
        }
        c3.getClass();
        throw null;
    }
    
    void h() {
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append((Object)this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final o c = this.c;
        final ViewGroup i = c.I;
        if (i != null) {
            final View j = c.J;
            if (j != null) {
                i.removeView(j);
            }
        }
        this.c.t0();
        this.a.m(this.c, false);
        final o c2 = this.c;
        c2.I = null;
        c2.J = null;
        c2.U = null;
        c2.V.d((Object)null);
        this.c.r = false;
    }
    
    void i() {
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append((Object)this.c);
            Log.d("FragmentManager", sb.toString());
        }
        this.c.u0();
        final w a = this.a;
        final o c = this.c;
        final int n = 0;
        a.d(c, false);
        final o c2 = this.c;
        c2.c = -1;
        c2.getClass();
        final o c3 = this.c;
        c3.x = null;
        c3.v = null;
        int n2 = n;
        if (c3.n) {
            n2 = n;
            if (!c3.T()) {
                n2 = 1;
            }
        }
        if (n2 != 0 || this.b.n().n(this.c)) {
            if (b0.l0(3)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("initState called for fragment: ");
                sb2.append((Object)this.c);
                Log.d("FragmentManager", sb2.toString());
            }
            this.c.Q();
        }
    }
    
    void j() {
        final o c = this.c;
        if (c.q && c.r && !c.t) {
            if (b0.l0(3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append((Object)this.c);
                Log.d("FragmentManager", sb.toString());
            }
            final Bundle d = this.c.d;
            Bundle bundle;
            if (d != null) {
                bundle = d.getBundle("savedInstanceState");
            }
            else {
                bundle = null;
            }
            final o c2 = this.c;
            c2.s0(c2.v0(bundle), (ViewGroup)null, bundle);
            final View j = this.c.J;
            if (j != null) {
                j.setSaveFromParentEnabled(false);
                final o c3 = this.c;
                c3.J.setTag(i0.b.a, (Object)c3);
                final o c4 = this.c;
                if (c4.B) {
                    c4.J.setVisibility(8);
                }
                this.c.D0();
                final w a = this.a;
                final o c5 = this.c;
                a.l(c5, c5.J, bundle, false);
                this.c.c = 2;
            }
        }
    }
    
    o k() {
        return this.c;
    }
    
    void m() {
        if (this.d) {
            if (b0.l0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append((Object)this.k());
                Log.v("FragmentManager", sb.toString());
            }
            return;
        }
        try {
            this.d = true;
            boolean b = false;
            o c;
            int c2;
            while (true) {
                final int d = this.d();
                c = this.c;
                c2 = c.c;
                if (d == c2) {
                    break;
                }
                if (d > c2) {
                    switch (c2 + 1) {
                        case 7: {
                            this.o();
                            break;
                        }
                        case 6: {
                            c.c = 6;
                            break;
                        }
                        case 5: {
                            this.s();
                            break;
                        }
                        case 4: {
                            if (c.J != null) {
                                final ViewGroup i = c.I;
                                if (i != null) {
                                    r0.t(i, c.C()).i(r0.d.b.d(this.c.J.getVisibility()), this);
                                }
                            }
                            this.c.c = 4;
                            break;
                        }
                        case 3: {
                            this.a();
                            break;
                        }
                        case 2: {
                            this.j();
                            this.f();
                            break;
                        }
                        case 1: {
                            this.e();
                            break;
                        }
                        case 0: {
                            this.c();
                            break;
                        }
                    }
                }
                else {
                    switch (c2 - 1) {
                        case 6: {
                            this.n();
                            break;
                        }
                        case 5: {
                            c.c = 5;
                            break;
                        }
                        case 4: {
                            this.t();
                            break;
                        }
                        case 3: {
                            if (b0.l0(3)) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("movefrom ACTIVITY_CREATED: ");
                                sb2.append((Object)this.c);
                                Log.d("FragmentManager", sb2.toString());
                            }
                            final o c3 = this.c;
                            if (c3.p) {
                                this.b.z(c3.g, this.p());
                            }
                            else if (c3.J != null && c3.e == null) {
                                this.q();
                            }
                            final o c4 = this.c;
                            if (c4.J != null) {
                                final ViewGroup j = c4.I;
                                if (j != null) {
                                    r0.t(j, c4.C()).k(this);
                                }
                            }
                            this.c.c = 3;
                            break;
                        }
                        case 2: {
                            c.r = false;
                            c.c = 2;
                            break;
                        }
                        case 1: {
                            this.h();
                            this.c.c = 1;
                            break;
                        }
                        case 0: {
                            if (c.p && this.b.o(c.g) == null) {
                                this.b.z(this.c.g, this.p());
                            }
                            this.g();
                            break;
                        }
                        case -1: {
                            this.i();
                            break;
                        }
                    }
                }
                b = true;
            }
            if (!b && c2 == -1 && c.n && !c.T() && !this.c.p) {
                if (b0.l0(3)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Cleaning up state of never attached fragment: ");
                    sb3.append((Object)this.c);
                    Log.d("FragmentManager", sb3.toString());
                }
                this.b.n().e(this.c, true);
                this.b.q(this);
                if (b0.l0(3)) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("initState called for fragment: ");
                    sb4.append((Object)this.c);
                    Log.d("FragmentManager", sb4.toString());
                }
                this.c.Q();
            }
            final o c5 = this.c;
            if (c5.O) {
                if (c5.J != null) {
                    final ViewGroup k = c5.I;
                    if (k != null) {
                        final r0 t = r0.t(k, c5.C());
                        if (this.c.B) {
                            t.j(this);
                        }
                        else {
                            t.l(this);
                        }
                    }
                }
                final o c6 = this.c;
                final b0 v = c6.v;
                if (v != null) {
                    v.j0(c6);
                }
                final o c7 = this.c;
                c7.O = false;
                c7.e0(c7.B);
                this.c.w.x();
            }
        }
        finally {
            this.d = false;
        }
    }
    
    void n() {
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append((Object)this.c);
            Log.d("FragmentManager", sb.toString());
        }
        this.c.x0();
        this.a.e(this.c, false);
    }
    
    void o() {
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append((Object)this.c);
            Log.d("FragmentManager", sb.toString());
        }
        final View x = this.c.x();
        if (x != null && this.l(x)) {
            final boolean requestFocus = x.requestFocus();
            if (b0.l0(2)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append((Object)x);
                sb2.append(" ");
                String s;
                if (requestFocus) {
                    s = "succeeded";
                }
                else {
                    s = "failed";
                }
                sb2.append(s);
                sb2.append(" on Fragment ");
                sb2.append((Object)this.c);
                sb2.append(" resulting in focused view ");
                sb2.append((Object)this.c.J.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.c.M0((View)null);
        this.c.z0();
        this.a.h(this.c, false);
        this.b.z(this.c.g, null);
        final o c = this.c;
        c.d = null;
        c.e = null;
        c.f = null;
    }
    
    Bundle p() {
        final Bundle bundle = new Bundle();
        final o c = this.c;
        if (c.c == -1) {
            final Bundle d = c.d;
            if (d != null) {
                bundle.putAll(d);
            }
        }
        bundle.putParcelable("state", (Parcelable)new g0(this.c));
        if (this.c.c > -1) {
            final Bundle bundle2 = new Bundle();
            this.c.A0(bundle2);
            if (!((BaseBundle)bundle2).isEmpty()) {
                bundle.putBundle("savedInstanceState", bundle2);
            }
            this.a.i(this.c, bundle2, false);
            final Bundle bundle3 = new Bundle();
            this.c.X.e(bundle3);
            if (!((BaseBundle)bundle3).isEmpty()) {
                bundle.putBundle("registryState", bundle3);
            }
            final Bundle f0 = this.c.w.F0();
            if (!((BaseBundle)f0).isEmpty()) {
                bundle.putBundle("childFragmentManager", f0);
            }
            if (this.c.J != null) {
                this.q();
            }
            final SparseArray e = this.c.e;
            if (e != null) {
                bundle.putSparseParcelableArray("viewState", e);
            }
            final Bundle f2 = this.c.f;
            if (f2 != null) {
                bundle.putBundle("viewRegistryState", f2);
            }
        }
        final Bundle h = this.c.h;
        if (h != null) {
            bundle.putBundle("arguments", h);
        }
        return bundle;
    }
    
    void q() {
        if (this.c.J == null) {
            return;
        }
        if (b0.l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Saving view state for fragment ");
            sb.append((Object)this.c);
            sb.append(" with view ");
            sb.append((Object)this.c.J);
            Log.v("FragmentManager", sb.toString());
        }
        final SparseArray e = new SparseArray();
        this.c.J.saveHierarchyState(e);
        if (e.size() > 0) {
            this.c.e = e;
        }
        final Bundle f = new Bundle();
        this.c.U.h(f);
        if (!((BaseBundle)f).isEmpty()) {
            this.c.f = f;
        }
    }
    
    void r(final int e) {
        this.e = e;
    }
    
    void s() {
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append((Object)this.c);
            Log.d("FragmentManager", sb.toString());
        }
        this.c.B0();
        this.a.j(this.c, false);
    }
    
    void t() {
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append((Object)this.c);
            Log.d("FragmentManager", sb.toString());
        }
        this.c.C0();
        this.a.k(this.c, false);
    }
}
