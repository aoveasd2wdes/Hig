package io.flutter.embedding.engine;

import k3.n;
import k3.m;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import android.os.Bundle;
import t3.f;
import android.content.Intent;
import java.util.Iterator;
import androidx.lifecycle.h;
import android.app.Activity;
import f3.a$a;
import io.flutter.view.TextureRegistry;
import java.util.HashMap;
import android.content.Context;
import android.content.ContentProvider;
import android.content.BroadcastReceiver;
import android.app.Service;
import io.flutter.embedding.android.d;
import f3.a$b;
import java.util.Map;
import f3.b;

class c implements f3.b, g3.b
{
    private final Map a;
    private final a b;
    private final a$b c;
    private final Map d;
    private d e;
    private c f;
    private boolean g;
    private final Map h;
    private Service i;
    private final Map j;
    private BroadcastReceiver k;
    private final Map l;
    private ContentProvider m;
    
    c(final Context context, final a b, final d3.d d, final io.flutter.embedding.engine.d d2) {
        this.a = (Map)new HashMap();
        this.d = (Map)new HashMap();
        this.g = false;
        this.h = (Map)new HashMap();
        this.j = (Map)new HashMap();
        this.l = (Map)new HashMap();
        this.b = b;
        this.c = new a$b(context, b, (c)b.k(), (TextureRegistry)b.t(), b.q().W(), (a$a)new b(d, null), d2);
    }
    
    private void k(final Activity activity, final h h) {
        this.f = new c(activity, h);
        this.b.q().u0(activity.getIntent() != null && activity.getIntent().getBooleanExtra("enable-software-rendering", false));
        this.b.q().C((Context)activity, (TextureRegistry)this.b.t(), this.b.k());
        for (final g3.a a : this.d.values()) {
            if (this.g) {
                a.c((g3.c)this.f);
            }
            else {
                a.h((g3.c)this.f);
            }
        }
        this.g = false;
    }
    
    private void m() {
        this.b.q().O();
        this.e = null;
        this.f = null;
    }
    
    private void n() {
        if (this.s()) {
            this.h();
        }
        else if (this.v()) {
            this.q();
        }
        else if (this.t()) {
            this.o();
        }
        else if (this.u()) {
            this.p();
        }
    }
    
    private boolean s() {
        return this.e != null;
    }
    
    private boolean t() {
        return this.k != null;
    }
    
    private boolean u() {
        return this.m != null;
    }
    
    private boolean v() {
        return this.i != null;
    }
    
    public boolean a(final int n, final int n2, final Intent intent) {
        if (this.s()) {
            final f h = t3.f.h("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                final boolean b = this.f.b(n, n2, intent);
                if (h != null) {
                    h.close();
                }
                return b;
            }
            finally {
                if (h != null) {
                    try {
                        h.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)intent).addSuppressed(t);
                    }
                }
            }
        }
        a3.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
        return false;
    }
    
    public void b(final Bundle bundle) {
        if (this.s()) {
            final f h = t3.f.h("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                this.f.j(bundle);
                if (h != null) {
                    h.close();
                }
                return;
            }
            finally {
                if (h != null) {
                    try {
                        h.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)bundle).addSuppressed(t);
                    }
                }
            }
        }
        a3.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
    }
    
    public void c(final Bundle bundle) {
        if (this.s()) {
            final f h = t3.f.h("FlutterEngineConnectionRegistry#onSaveInstanceState");
            try {
                this.f.k(bundle);
                if (h != null) {
                    h.close();
                }
                return;
            }
            finally {
                if (h != null) {
                    try {
                        h.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)bundle).addSuppressed(t);
                    }
                }
            }
        }
        a3.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
    }
    
    public boolean d(final int n, final String[] array, final int[] array2) {
        if (this.s()) {
            final f h = t3.f.h("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                final boolean d = this.f.d(n, array, array2);
                if (h != null) {
                    h.close();
                }
                return d;
            }
            finally {
                if (h != null) {
                    try {
                        h.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)(Object)array).addSuppressed(t);
                    }
                }
            }
        }
        a3.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
        return false;
    }
    
    public void e(final Intent intent) {
        if (this.s()) {
            final f h = t3.f.h("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                this.f.c(intent);
                if (h != null) {
                    h.close();
                }
                return;
            }
            finally {
                if (h != null) {
                    try {
                        h.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)intent).addSuppressed(t);
                    }
                }
            }
        }
        a3.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
    }
    
    public void f(final f3.a a) {
        final StringBuilder sb = new StringBuilder();
        sb.append("FlutterEngineConnectionRegistry#add ");
        sb.append(a.getClass().getSimpleName());
        final f h = t3.f.h(sb.toString());
        try {
            if (this.r(a.getClass())) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Attempted to register plugin (");
                sb2.append((Object)a);
                sb2.append(") but it was already registered with this FlutterEngine (");
                sb2.append((Object)this.b);
                sb2.append(").");
                a3.b.g("FlutterEngineCxnRegstry", sb2.toString());
                if (h != null) {
                    h.close();
                }
                return;
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Adding plugin: ");
            sb3.append((Object)a);
            a3.b.f("FlutterEngineCxnRegstry", sb3.toString());
            this.a.put((Object)a.getClass(), (Object)a);
            a.g(this.c);
            if (a instanceof g3.a) {
                final g3.a a2 = (g3.a)a;
                this.d.put((Object)a.getClass(), (Object)a2);
                if (this.s()) {
                    a2.h((g3.c)this.f);
                }
            }
            if (h != null) {
                h.close();
            }
        }
        finally {
            if (h != null) {
                try {
                    h.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)a).addSuppressed(t);
                }
            }
        }
    }
    
    public void g(final d e, final h h) {
        final f h2 = t3.f.h("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            final d e2 = this.e;
            if (e2 != null) {
                e2.f();
            }
            this.n();
            this.e = e;
            this.k((Activity)e.g(), h);
            if (h2 != null) {
                h2.close();
            }
        }
        finally {
            if (h2 != null) {
                try {
                    h2.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)e).addSuppressed(t);
                }
            }
        }
    }
    
    public void h() {
        if (this.s()) {
            final f h = t3.f.h("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                final Iterator iterator = this.d.values().iterator();
                while (iterator.hasNext()) {
                    ((g3.a)iterator.next()).e();
                }
                this.m();
                if (h != null) {
                    h.close();
                }
                return;
            }
            finally {
                if (h != null) {
                    try {
                        h.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
        }
        a3.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
    }
    
    public void i() {
        if (this.s()) {
            final f h = t3.f.h("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                this.f.l();
                if (h != null) {
                    h.close();
                }
                return;
            }
            finally {
                if (h != null) {
                    try {
                        h.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
        }
        a3.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
    }
    
    public void j() {
        if (this.s()) {
            final f h = t3.f.h("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
            try {
                this.g = true;
                final Iterator iterator = this.d.values().iterator();
                while (iterator.hasNext()) {
                    ((g3.a)iterator.next()).i();
                }
                this.m();
                if (h != null) {
                    h.close();
                }
                return;
            }
            finally {
                if (h != null) {
                    try {
                        h.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
        }
        a3.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
    }
    
    public void l() {
        a3.b.f("FlutterEngineCxnRegstry", "Destroying.");
        this.n();
        this.y();
    }
    
    public void o() {
        if (this.t()) {
            final f h = t3.f.h("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
            try {
                final Iterator iterator = this.j.values().iterator();
                if (iterator.hasNext()) {
                    l.d.a(iterator.next());
                    throw null;
                }
                if (h != null) {
                    h.close();
                }
                return;
            }
            finally {
                if (h != null) {
                    try {
                        h.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
        }
        a3.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
    }
    
    public void p() {
        if (this.u()) {
            final f h = t3.f.h("FlutterEngineConnectionRegistry#detachFromContentProvider");
            try {
                final Iterator iterator = this.l.values().iterator();
                if (iterator.hasNext()) {
                    l.d.a(iterator.next());
                    throw null;
                }
                if (h != null) {
                    h.close();
                }
                return;
            }
            finally {
                if (h != null) {
                    try {
                        h.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
        }
        a3.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
    }
    
    public void q() {
        if (this.v()) {
            final f h = t3.f.h("FlutterEngineConnectionRegistry#detachFromService");
            try {
                final Iterator iterator = this.h.values().iterator();
                if (iterator.hasNext()) {
                    l.d.a(iterator.next());
                    throw null;
                }
                this.i = null;
                if (h != null) {
                    h.close();
                }
                return;
            }
            finally {
                if (h != null) {
                    try {
                        h.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
        }
        a3.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
    }
    
    public boolean r(final Class clazz) {
        return this.a.containsKey((Object)clazz);
    }
    
    public void w(final Class clazz) {
        final f3.a a = (f3.a)this.a.get((Object)clazz);
        if (a == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("FlutterEngineConnectionRegistry#remove ");
        sb.append(clazz.getSimpleName());
        final f h = t3.f.h(sb.toString());
        try {
            if (a instanceof g3.a) {
                if (this.s()) {
                    ((g3.a)a).e();
                }
                this.d.remove((Object)clazz);
            }
            a.k(this.c);
            this.a.remove((Object)clazz);
            if (h != null) {
                h.close();
            }
        }
        finally {
            if (h != null) {
                try {
                    h.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)clazz).addSuppressed(t);
                }
            }
        }
    }
    
    public void x(final Set set) {
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            this.w((Class)iterator.next());
        }
    }
    
    public void y() {
        this.x((Set)new HashSet((Collection)this.a.keySet()));
        this.a.clear();
    }
    
    private static class b implements a$a
    {
        final d3.d a;
        
        private b(final d3.d a) {
            this.a = a;
        }
    }
    
    private static class c implements g3.c
    {
        private final Activity a;
        private final HiddenLifecycleReference b;
        private final Set c;
        private final Set d;
        private final Set e;
        private final Set f;
        private final Set g;
        private final Set h;
        
        public c(final Activity a, final h h) {
            this.c = (Set)new HashSet();
            this.d = (Set)new HashSet();
            this.e = (Set)new HashSet();
            this.f = (Set)new HashSet();
            this.g = (Set)new HashSet();
            this.h = (Set)new HashSet();
            this.a = a;
            this.b = new HiddenLifecycleReference(h);
        }
        
        public Object a() {
            return this.b;
        }
        
        boolean b(final int n, final int n2, final Intent intent) {
            final Iterator iterator = new HashSet((Collection)this.d).iterator();
            boolean b = false;
        Label_0016:
            while (true) {
                b = false;
                while (iterator.hasNext()) {
                    if (!((m)iterator.next()).a(n, n2, intent) && !b) {
                        continue Label_0016;
                    }
                    b = true;
                }
                break;
            }
            return b;
        }
        
        void c(final Intent intent) {
            final Iterator iterator = this.e.iterator();
            if (!iterator.hasNext()) {
                return;
            }
            l.d.a(iterator.next());
            throw null;
        }
        
        boolean d(final int n, final String[] array, final int[] array2) {
            final Iterator iterator = this.c.iterator();
            boolean b = false;
        Label_0011:
            while (true) {
                b = false;
                while (iterator.hasNext()) {
                    if (!((n)iterator.next()).d(n, array, array2) && !b) {
                        continue Label_0011;
                    }
                    b = true;
                }
                break;
            }
            return b;
        }
        
        public Activity e() {
            return this.a;
        }
        
        public void f(final m m) {
            this.d.add((Object)m);
        }
        
        public void g(final n n) {
            this.c.remove((Object)n);
        }
        
        public void h(final m m) {
            this.d.remove((Object)m);
        }
        
        public void i(final n n) {
            this.c.add((Object)n);
        }
        
        void j(final Bundle bundle) {
            final Iterator iterator = this.h.iterator();
            while (iterator.hasNext()) {
                ((g3.c$a)iterator.next()).b(bundle);
            }
        }
        
        void k(final Bundle bundle) {
            final Iterator iterator = this.h.iterator();
            while (iterator.hasNext()) {
                ((g3.c$a)iterator.next()).c(bundle);
            }
        }
        
        void l() {
            final Iterator iterator = this.f.iterator();
            if (!iterator.hasNext()) {
                return;
            }
            l.d.a(iterator.next());
            throw null;
        }
    }
}
