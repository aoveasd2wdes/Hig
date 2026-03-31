package j0;

import android.os.BaseBundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.lifecycle.h$b;
import java.io.Writer;
import java.io.PrintWriter;
import java.util.List;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Set;
import android.content.res.Configuration;
import androidx.core.app.j;
import android.view.ViewParent;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.util.Log;
import java.util.LinkedHashSet;
import java.util.Collection;
import android.view.ViewGroup;
import i0.b;
import java.util.Iterator;
import java.util.Collections;
import java.util.HashMap;
import androidx.core.view.l;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import c.d;
import k0.c;
import java.util.ArrayList;
import java.util.ArrayDeque;

public abstract class b0
{
    private static boolean P;
    private t A;
    private s0 B;
    private s0 C;
    ArrayDeque D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private ArrayList J;
    private ArrayList K;
    private ArrayList L;
    private e0 M;
    private c.c N;
    private Runnable O;
    private final ArrayList a;
    private boolean b;
    private final i0 c;
    ArrayList d;
    private final v e;
    private d f;
    a g;
    boolean h;
    private final c.c i;
    private final AtomicInteger j;
    private final Map k;
    private final Map l;
    private final Map m;
    ArrayList n;
    private final w o;
    private final CopyOnWriteArrayList p;
    private final v.a q;
    private final v.a r;
    private final v.a s;
    private final v.a t;
    private final l u;
    int v;
    private r w;
    private o x;
    o y;
    private t z;
    
    public b0() {
        this.a = new ArrayList();
        this.c = new i0();
        this.d = new ArrayList();
        this.e = new v(this);
        this.g = null;
        this.h = false;
        this.i = (c.c)new b0$a(this, false);
        this.j = new AtomicInteger();
        this.k = Collections.synchronizedMap((Map)new HashMap());
        this.l = Collections.synchronizedMap((Map)new HashMap());
        this.m = Collections.synchronizedMap((Map)new HashMap());
        this.n = new ArrayList();
        this.o = new w(this);
        this.p = new CopyOnWriteArrayList();
        this.q = (v.a)new x(this);
        this.r = (v.a)new y(this);
        this.s = (v.a)new z(this);
        this.t = (v.a)new a0(this);
        this.u = (l)new b0$b(this);
        this.v = -1;
        this.z = null;
        this.A = (t)new b0$c(this);
        this.B = null;
        this.C = (s0)new b0$d(this);
        this.D = new ArrayDeque();
        this.O = (Runnable)new Runnable() {
            final b0 e;
            
            public void run() {
                this.e.J(true);
            }
        };
    }
    
    private void B0(final ArrayList list, final ArrayList list2) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == list2.size()) {
            final int size = list.size();
            int i = 0;
            int n = 0;
            while (i < size) {
                int n2 = i;
                int n3 = n;
                if (!((j0)list.get(i)).r) {
                    if (n != i) {
                        this.M(list, list2, n, i);
                    }
                    int n4 = n3 = i + 1;
                    if (list2.get(i)) {
                        while ((n3 = n4) < size) {
                            n3 = n4;
                            if (!(boolean)list2.get(n4)) {
                                break;
                            }
                            n3 = n4;
                            if (((j0)list.get(n4)).r) {
                                break;
                            }
                            ++n4;
                        }
                    }
                    this.M(list, list2, i, n3);
                    n2 = n3 - 1;
                }
                i = n2 + 1;
                n = n3;
            }
            if (n != size) {
                this.M(list, list2, n, size);
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }
    
    private void C0() {
        if (this.n.size() <= 0) {
            return;
        }
        l.d.a(this.n.get(0));
        throw null;
    }
    
    private void D(final int n) {
        try {
            this.b = true;
            this.c.d(n);
            this.w0(n, false);
            final Iterator iterator = this.n().iterator();
            while (iterator.hasNext()) {
                ((r0)iterator.next()).p();
            }
            this.b = false;
            this.J(true);
        }
        finally {
            this.b = false;
        }
    }
    
    static int E0(final int n) {
        int n2 = 8194;
        if (n != 4097) {
            if (n != 8194) {
                n2 = 4100;
                if (n != 8197) {
                    if (n != 4099) {
                        if (n != 4100) {
                            n2 = 0;
                        }
                        else {
                            n2 = 8197;
                        }
                    }
                    else {
                        n2 = 4099;
                    }
                }
            }
            else {
                n2 = 4097;
            }
        }
        return n2;
    }
    
    private void G() {
        if (this.I) {
            this.I = false;
            this.L0();
        }
    }
    
    private void H() {
        final Iterator iterator = this.n().iterator();
        while (iterator.hasNext()) {
            ((r0)iterator.next()).p();
        }
    }
    
    private void I(final boolean b) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.H) {
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }
    
    private void J0(final o o) {
        final ViewGroup y = this.Y(o);
        if (y != null && o.r() + o.u() + o.E() + o.F() > 0) {
            if (((View)y).getTag(i0.b.c) == null) {
                ((View)y).setTag(i0.b.c, (Object)o);
            }
            ((o)((View)y).getTag(i0.b.c)).O0(o.D());
        }
    }
    
    private static void L(final ArrayList list, final ArrayList list2, int i, final int n) {
        while (i < n) {
            final a a = (a)list.get(i);
            if (list2.get(i)) {
                a.i(-1);
                a.l();
            }
            else {
                a.i(1);
                a.k();
            }
            ++i;
        }
    }
    
    private void L0() {
        final Iterator iterator = this.c.i().iterator();
        while (iterator.hasNext()) {
            this.z0((h0)iterator.next());
        }
    }
    
    private void M(final ArrayList list, final ArrayList list2, final int n, final int n2) {
        final boolean r = ((j0)list.get(n)).r;
        final ArrayList l = this.L;
        if (l == null) {
            this.L = new ArrayList();
        }
        else {
            l.clear();
        }
        this.L.addAll((Collection)this.c.m());
        o o = this.d0();
        int i = n;
        int n3 = 0;
        while (i < n2) {
            final a a = (a)list.get(i);
            if (!(boolean)list2.get(i)) {
                o = a.m(this.L, o);
            }
            else {
                o = a.o(this.L, o);
            }
            if (n3 == 0 && !((j0)a).i) {
                n3 = 0;
            }
            else {
                n3 = 1;
            }
            ++i;
        }
        this.L.clear();
        if (!r && this.v >= 1) {
            for (int j = n; j < n2; ++j) {
                final Iterator iterator = ((j0)list.get(j)).c.iterator();
                while (iterator.hasNext()) {
                    final o b = ((j0.a)iterator.next()).b;
                    if (b != null && b.v != null) {
                        this.c.p(this.p(b));
                    }
                }
            }
        }
        L(list, list2, n, n2);
        final boolean booleanValue = (boolean)list2.get(n2 - 1);
        if (n3 != 0 && !this.n.isEmpty()) {
            final LinkedHashSet set = new LinkedHashSet();
            final Iterator iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                ((Set)set).addAll((Collection)this.T((a)iterator2.next()));
            }
            if (this.g == null) {
                final Iterator iterator3 = this.n.iterator();
                while (iterator3.hasNext()) {
                    l.d.a(iterator3.next());
                    final Iterator iterator4 = ((Set)set).iterator();
                    if (!iterator4.hasNext()) {
                        continue;
                    }
                    final o o2 = (o)iterator4.next();
                    throw null;
                }
                final Iterator iterator5 = this.n.iterator();
                while (iterator5.hasNext()) {
                    l.d.a(iterator5.next());
                    final Iterator iterator6 = ((Set)set).iterator();
                    if (!iterator6.hasNext()) {
                        continue;
                    }
                    final o o3 = (o)iterator6.next();
                    throw null;
                }
            }
        }
        for (int k = n; k < n2; ++k) {
            final a a2 = (a)list.get(k);
            if (booleanValue) {
                for (int n4 = ((j0)a2).c.size() - 1; n4 >= 0; --n4) {
                    final o b2 = ((j0.a)((j0)a2).c.get(n4)).b;
                    if (b2 != null) {
                        this.p(b2).m();
                    }
                }
            }
            else {
                final Iterator iterator7 = ((j0)a2).c.iterator();
                while (iterator7.hasNext()) {
                    final o b3 = ((j0.a)iterator7.next()).b;
                    if (b3 != null) {
                        this.p(b3).m();
                    }
                }
            }
        }
        this.w0(this.v, true);
        final Iterator iterator8 = this.o(list, n, n2).iterator();
        int n5;
        while (true) {
            n5 = n;
            if (!iterator8.hasNext()) {
                break;
            }
            final r0 r2 = (r0)iterator8.next();
            r2.y(booleanValue);
            r2.v();
            r2.m();
        }
        while (n5 < n2) {
            final a a3 = (a)list.get(n5);
            if ((boolean)list2.get(n5) && a3.v >= 0) {
                a3.v = -1;
            }
            a3.n();
            ++n5;
        }
        if (n3 != 0) {
            this.C0();
        }
    }
    
    private void M0() {
        final ArrayList a = this.a;
        synchronized (a) {
            final boolean empty = this.a.isEmpty();
            boolean b = true;
            if (!empty) {
                this.i.b(true);
                if (l0(3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("FragmentManager ");
                    sb.append((Object)this);
                    sb.append(" enabling OnBackPressedCallback, caused by non-empty pending actions");
                    Log.d("FragmentManager", sb.toString());
                }
                return;
            }
            monitorexit(a);
            if (this.V() <= 0 || !this.p0(this.x)) {
                b = false;
            }
            if (l0(3)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("OnBackPressedCallback for FragmentManager ");
                sb2.append((Object)this);
                sb2.append(" enabled state is ");
                sb2.append(b);
                Log.d("FragmentManager", sb2.toString());
            }
            this.i.b(b);
        }
    }
    
    static b0 Q(final View view) {
        final o r = R(view);
        if (r == null) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {}
            final StringBuilder sb = new StringBuilder();
            sb.append("View ");
            sb.append((Object)view);
            sb.append(" is not within a subclass of FragmentActivity.");
            throw new IllegalStateException(sb.toString());
        }
        if (r.R()) {
            return r.p();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("The Fragment ");
        sb2.append((Object)r);
        sb2.append(" that owns View ");
        sb2.append((Object)view);
        sb2.append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
        throw new IllegalStateException(sb2.toString());
    }
    
    static o R(View view) {
        while (view != null) {
            final o g0 = g0(view);
            if (g0 != null) {
                return g0;
            }
            final ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View)parent;
            }
            else {
                view = null;
            }
        }
        return null;
    }
    
    private void S() {
        final Iterator iterator = this.n().iterator();
        while (iterator.hasNext()) {
            ((r0)iterator.next()).q();
        }
    }
    
    private boolean U(final ArrayList list, final ArrayList list2) {
        final ArrayList a = this.a;
        synchronized (a) {
            final boolean empty = this.a.isEmpty();
            int i = 0;
            if (empty) {
                return false;
            }
            try {
                while (i < this.a.size()) {
                    ((h)this.a.get(i)).a(list, list2);
                    ++i;
                }
            }
            finally {
                this.a.clear();
                throw null;
            }
        }
    }
    
    private e0 W(final o o) {
        return this.M.i(o);
    }
    
    private ViewGroup Y(final o o) {
        final ViewGroup i = o.I;
        if (i != null) {
            return i;
        }
        if (o.z <= 0) {
            return null;
        }
        if (this.w.b()) {
            final View a = this.w.a(o.z);
            if (a instanceof ViewGroup) {
                return (ViewGroup)a;
            }
        }
        return null;
    }
    
    static o g0(final View view) {
        final Object tag = view.getTag(b.a);
        if (tag instanceof o) {
            return (o)tag;
        }
        return null;
    }
    
    private void l() {
        this.b = false;
        this.K.clear();
        this.J.clear();
    }
    
    public static boolean l0(final int n) {
        return b0.P || Log.isLoggable("FragmentManager", n);
    }
    
    private void m() {
        throw null;
    }
    
    private boolean m0(final o o) {
        return (o.F && o.G) || o.w.k();
    }
    
    private Set n() {
        final HashSet set = new HashSet();
        final Iterator iterator = this.c.i().iterator();
        while (iterator.hasNext()) {
            final ViewGroup i = ((h0)iterator.next()).k().I;
            if (i != null) {
                ((Set)set).add((Object)r0.u(i, this.e0()));
            }
        }
        return (Set)set;
    }
    
    private boolean n0() {
        final o x = this.x;
        boolean b = true;
        if (x == null) {
            return true;
        }
        if (!x.R() || !this.x.C().n0()) {
            b = false;
        }
        return b;
    }
    
    private void y(final o o) {
        if (o != null && o.equals((Object)this.N(o.g))) {
            o.y0();
        }
    }
    
    void A() {
        this.M0();
        this.y(this.y);
    }
    
    void A0(final o o) {
        if (l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append((Object)o);
            sb.append(" nesting=");
            sb.append(o.u);
            Log.v("FragmentManager", sb.toString());
        }
        final boolean t = o.T();
        if (!o.C || (t ^ true)) {
            this.c.s(o);
            if (this.m0(o)) {
                this.E = true;
            }
            o.n = true;
            this.J0(o);
        }
    }
    
    void B() {
        this.F = false;
        this.G = false;
        this.M.m(false);
        this.D(7);
    }
    
    void C() {
        this.F = false;
        this.G = false;
        this.M.m(false);
        this.D(5);
    }
    
    void D0(final Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        final Bundle bundle = (Bundle)parcelable;
        for (final String s : ((BaseBundle)bundle).keySet()) {
            if (s.startsWith("result_")) {
                if (bundle.getBundle(s) == null) {
                    continue;
                }
                throw null;
            }
        }
        final HashMap hashMap = new HashMap();
        for (final String s2 : ((BaseBundle)bundle).keySet()) {
            if (s2.startsWith("fragment_")) {
                if (bundle.getBundle(s2) == null) {
                    continue;
                }
                throw null;
            }
        }
        this.c.v(hashMap);
        final d0 d0 = (d0)bundle.getParcelable("state");
        if (d0 == null) {
            return;
        }
        this.c.t();
        final Iterator iterator3 = d0.a.iterator();
        while (iterator3.hasNext()) {
            final Bundle z = this.c.z((String)iterator3.next(), null);
            if (z != null) {
                final o h = this.M.h(((g0)z.getParcelable("state")).b);
                h.getClass();
                if (l0(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("restoreSaveState: re-attaching retained ");
                    sb.append((Object)h);
                    Log.v("FragmentManager", sb.toString());
                }
                final o k = new h0(this.o, this.c, h, z).k();
                k.d = z;
                k.v = this;
                if (l0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(k.g);
                    sb2.append("): ");
                    sb2.append((Object)k);
                    Log.v("FragmentManager", sb2.toString());
                }
                throw null;
            }
        }
        for (final o o : this.M.j()) {
            if (!this.c.c(o.g)) {
                if (l0(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append((Object)o);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append((Object)d0.a);
                    Log.v("FragmentManager", sb3.toString());
                }
                this.M.l(o);
                o.v = this;
                final h0 h2 = new h0(this.o, this.c, o);
                h2.r(1);
                h2.m();
                o.n = true;
                h2.m();
            }
        }
        this.c.u((List)d0.b);
        final j0.b[] c = d0.c;
        final int n = 0;
        if (c != null) {
            this.d = new ArrayList(d0.c.length);
            int n2 = 0;
            while (true) {
                final j0.b[] c2 = d0.c;
                if (n2 >= c2.length) {
                    break;
                }
                final a b = c2[n2].b(this);
                if (l0(2)) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreAllState: back stack #");
                    sb4.append(n2);
                    sb4.append(" (index ");
                    sb4.append(b.v);
                    sb4.append("): ");
                    sb4.append((Object)b);
                    Log.v("FragmentManager", sb4.toString());
                    final PrintWriter printWriter = new PrintWriter((Writer)new o0("FragmentManager"));
                    b.j("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add((Object)b);
                ++n2;
            }
        }
        else {
            this.d = new ArrayList();
        }
        this.j.set(d0.d);
        final String e = d0.e;
        if (e != null) {
            this.y(this.y = this.N(e));
        }
        final ArrayList f = d0.f;
        if (f != null) {
            for (int i = n; i < f.size(); ++i) {
                this.k.put((Object)f.get(i), (Object)d0.g.get(i));
            }
        }
        this.D = new ArrayDeque((Collection)d0.h);
    }
    
    void E() {
        this.G = true;
        this.M.m(true);
        this.D(4);
    }
    
    void F() {
        this.D(2);
    }
    
    Bundle F0() {
        final Bundle bundle = new Bundle();
        this.S();
        this.H();
        this.J(true);
        this.F = true;
        this.M.m(true);
        final ArrayList w = this.c.w();
        final HashMap k = this.c.k();
        if (k.isEmpty()) {
            if (l0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        }
        else {
            final ArrayList x = this.c.x();
            final int size = this.d.size();
            j0.b[] c;
            if (size > 0) {
                final j0.b[] array = new j0.b[size];
                int n = 0;
                while (true) {
                    c = array;
                    if (n >= size) {
                        break;
                    }
                    array[n] = new j0.b((a)this.d.get(n));
                    if (l0(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding back stack #");
                        sb.append(n);
                        sb.append(": ");
                        sb.append(this.d.get(n));
                        Log.v("FragmentManager", sb.toString());
                    }
                    ++n;
                }
            }
            else {
                c = null;
            }
            final d0 d0 = new d0();
            d0.a = w;
            d0.b = x;
            d0.c = c;
            d0.d = this.j.get();
            final o y = this.y;
            if (y != null) {
                d0.e = y.g;
            }
            d0.f.addAll((Collection)this.k.keySet());
            d0.g.addAll(this.k.values());
            d0.h = new ArrayList((Collection)this.D);
            bundle.putParcelable("state", (Parcelable)d0);
            for (final String s : this.l.keySet()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("result_");
                sb2.append(s);
                bundle.putBundle(sb2.toString(), (Bundle)this.l.get((Object)s));
            }
            for (final String s2 : k.keySet()) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("fragment_");
                sb3.append(s2);
                bundle.putBundle(sb3.toString(), (Bundle)k.get((Object)s2));
            }
        }
        return bundle;
    }
    
    void G0(final o o, final boolean b) {
        final ViewGroup y = this.Y(o);
        if (y != null && y instanceof s) {
            ((s)y).setDrawDisappearingViewsLast(b ^ true);
        }
    }
    
    void H0(final o o, final h$b s) {
        if (o.equals((Object)this.N(o.g))) {
            o.S = s;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append((Object)o);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append((Object)this);
        throw new IllegalArgumentException(sb.toString());
    }
    
    void I0(final o y) {
        if (y != null && !y.equals((Object)this.N(y.g))) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append((Object)y);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append((Object)this);
            throw new IllegalArgumentException(sb.toString());
        }
        final o y2 = this.y;
        this.y = y;
        this.y(y2);
        this.y(this.y);
    }
    
    boolean J(boolean b) {
        this.I(b);
        b = false;
        while (this.U(this.J, this.K)) {
            b = true;
            this.b = true;
            try {
                this.B0(this.J, this.K);
                continue;
            }
            finally {
                this.l();
            }
            break;
        }
        this.M0();
        this.G();
        this.c.b();
        return b;
    }
    
    void K(final h h, final boolean b) {
        if (b) {
            return;
        }
        this.I(b);
        if (h.a(this.J, this.K)) {
            this.b = true;
            try {
                this.B0(this.J, this.K);
            }
            finally {
                this.l();
            }
        }
        this.M0();
        this.G();
        this.c.b();
    }
    
    void K0(final o o) {
        if (l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append((Object)o);
            Log.v("FragmentManager", sb.toString());
        }
        if (o.B) {
            o.B = false;
            o.O ^= true;
        }
    }
    
    o N(final String s) {
        return this.c.e(s);
    }
    
    public o O(final int n) {
        return this.c.f(n);
    }
    
    public o P(final String s) {
        return this.c.g(s);
    }
    
    Set T(final a a) {
        final HashSet set = new HashSet();
        for (int i = 0; i < ((j0)a).c.size(); ++i) {
            final o b = ((j0.a)((j0)a).c.get(i)).b;
            if (b != null && ((j0)a).i) {
                ((Set)set).add((Object)b);
            }
        }
        return (Set)set;
    }
    
    public int V() {
        final int size = this.d.size();
        int n;
        if (this.g != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        return size + n;
    }
    
    r X() {
        return this.w;
    }
    
    public t Z() {
        final t z = this.z;
        if (z != null) {
            return z;
        }
        final o x = this.x;
        if (x != null) {
            return x.v.Z();
        }
        return this.A;
    }
    
    public u a0() {
        return null;
    }
    
    w b0() {
        return this.o;
    }
    
    o c0() {
        return this.x;
    }
    
    public o d0() {
        return this.y;
    }
    
    void e(final a a) {
        this.d.add((Object)a);
    }
    
    s0 e0() {
        final s0 b = this.B;
        if (b != null) {
            return b;
        }
        final o x = this.x;
        if (x != null) {
            return x.v.e0();
        }
        return this.C;
    }
    
    h0 f(final o o) {
        final String r = o.R;
        if (r != null) {
            k0.c.f(o, r);
        }
        if (l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append((Object)o);
            Log.v("FragmentManager", sb.toString());
        }
        final h0 p = this.p(o);
        o.v = this;
        this.c.p(p);
        if (!o.C) {
            this.c.a(o);
            o.n = false;
            if (o.J == null) {
                o.O = false;
            }
            if (this.m0(o)) {
                this.E = true;
            }
        }
        return p;
    }
    
    public c.c f0() {
        return this.N;
    }
    
    public void g(final f0 f0) {
        this.p.add((Object)f0);
    }
    
    void h(final u u, final r w, final o x) {
        this.w = w;
        this.x = x;
        if (x != null) {
            this.g((f0)new b0$f(this, x));
        }
        if (this.x != null) {
            this.M0();
        }
        e0 w2;
        if (x != null) {
            w2 = x.v.W(x);
        }
        else {
            w2 = new e0(false);
        }
        (this.M = w2).m(this.r0());
        this.c.y(this.M);
    }
    
    androidx.lifecycle.h0 h0(final o o) {
        return this.M.k(o);
    }
    
    void i(final o o) {
        if (l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append((Object)o);
            Log.v("FragmentManager", sb.toString());
        }
        if (o.C) {
            o.C = false;
            if (!o.m) {
                this.c.a(o);
                if (l0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append((Object)o);
                    Log.v("FragmentManager", sb2.toString());
                }
                if (this.m0(o)) {
                    this.E = true;
                }
            }
        }
    }
    
    void i0(final o o) {
        if (l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append((Object)o);
            Log.v("FragmentManager", sb.toString());
        }
        if (!o.B) {
            o.B = true;
            o.O ^= true;
            this.J0(o);
        }
    }
    
    public j0 j() {
        return (j0)new a(this);
    }
    
    void j0(final o o) {
        if (o.m && this.m0(o)) {
            this.E = true;
        }
    }
    
    boolean k() {
        final Iterator iterator = this.c.j().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final o o = (o)iterator.next();
            int m0 = n;
            if (o != null) {
                m0 = (this.m0(o) ? 1 : 0);
            }
            if ((n = m0) != 0) {
                return true;
            }
        }
        return false;
    }
    
    public boolean k0() {
        return this.H;
    }
    
    Set o(final ArrayList list, int i, final int n) {
        final HashSet set = new HashSet();
        while (i < n) {
            final Iterator iterator = ((j0)list.get(i)).c.iterator();
            while (iterator.hasNext()) {
                final o b = ((j0.a)iterator.next()).b;
                if (b != null) {
                    final ViewGroup j = b.I;
                    if (j == null) {
                        continue;
                    }
                    ((Set)set).add((Object)r0.t(j, this));
                }
            }
            ++i;
        }
        return (Set)set;
    }
    
    boolean o0(final o o) {
        return o != null && o.S();
    }
    
    h0 p(final o o) {
        final h0 l = this.c.l(o.g);
        if (l != null) {
            return l;
        }
        new h0(this.o, this.c, o);
        throw null;
    }
    
    boolean p0(final o o) {
        boolean b = true;
        if (o == null) {
            return true;
        }
        final b0 v = o.v;
        if (!o.equals((Object)v.d0()) || !this.p0(v.x)) {
            b = false;
        }
        return b;
    }
    
    void q(final o o) {
        if (l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append((Object)o);
            Log.v("FragmentManager", sb.toString());
        }
        if (!o.C) {
            o.C = true;
            if (o.m) {
                if (l0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append((Object)o);
                    Log.v("FragmentManager", sb2.toString());
                }
                this.c.s(o);
                if (this.m0(o)) {
                    this.E = true;
                }
                this.J0(o);
            }
        }
    }
    
    boolean q0(final int n) {
        return this.v >= n;
    }
    
    void r() {
        this.F = false;
        this.G = false;
        this.M.m(false);
        this.D(4);
    }
    
    public boolean r0() {
        return this.F || this.G;
    }
    
    void s(final Configuration configuration, final boolean b) {
        for (final o o : this.c.m()) {
            if (o != null) {
                o.q0(configuration);
                if (!b) {
                    continue;
                }
                o.w.s(configuration, true);
            }
        }
    }
    
    void t() {
        this.F = false;
        this.G = false;
        this.M.m(false);
        this.D(1);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode((Object)this)));
        sb.append(" in ");
        final o x = this.x;
        String s;
        if (x != null) {
            sb.append(x.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode((Object)this.x)));
            s = "}";
        }
        else {
            s = "null";
        }
        sb.append(s);
        sb.append("}}");
        return sb.toString();
    }
    
    void u() {
        this.J(this.H = true);
        this.H();
        this.m();
        this.D(-1);
        this.w = null;
        this.x = null;
        if (this.f != null) {
            this.i.a();
            this.f = null;
        }
    }
    
    void v() {
        this.D(1);
    }
    
    void w(final boolean b) {
        for (final o o : this.c.m()) {
            if (o != null) {
                o.w0();
                if (!b) {
                    continue;
                }
                o.w.w(true);
            }
        }
    }
    
    void w0(final int v, final boolean b) {
        if (v != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!b && v == this.v) {
            return;
        }
        this.v = v;
        this.c.r();
        this.L0();
    }
    
    void x() {
        for (final o o : this.c.j()) {
            if (o != null) {
                o.e0(o.S());
                o.w.x();
            }
        }
    }
    
    void x0() {
    }
    
    void y0(final s i) {
        for (final h0 h0 : this.c.i()) {
            final o k = h0.k();
            if (k.z == ((View)i).getId()) {
                final View j = k.J;
                if (j == null || j.getParent() != null) {
                    continue;
                }
                k.I = (ViewGroup)i;
                h0.b();
            }
        }
    }
    
    void z() {
        this.D(5);
    }
    
    void z0(final h0 h0) {
        final o k = h0.k();
        if (k.K) {
            if (this.b) {
                this.I = true;
                return;
            }
            k.K = false;
            h0.m();
        }
    }
    
    static class g implements Parcelable
    {
        public static final Parcelable$Creator<g> CREATOR;
        String a;
        int b;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public g a(final Parcel parcel) {
                    return new g(parcel);
                }
                
                public g[] b(final int n) {
                    return new g[n];
                }
            };
        }
        
        g(final Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readInt();
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeString(this.a);
            parcel.writeInt(this.b);
        }
    }
    
    interface h
    {
        boolean a(final ArrayList p0, final ArrayList p1);
    }
}
