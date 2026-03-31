package j0;

import java.util.Map;
import android.util.Log;
import android.os.Bundle;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;

class i0
{
    private final ArrayList a;
    private final HashMap b;
    private final HashMap c;
    private e0 d;
    
    i0() {
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
    }
    
    void a(final o o) {
        if (!this.a.contains((Object)o)) {
            final ArrayList a = this.a;
            synchronized (a) {
                this.a.add((Object)o);
                monitorexit(a);
                o.m = true;
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment already added: ");
        sb.append((Object)o);
        throw new IllegalStateException(sb.toString());
    }
    
    void b() {
        this.b.values().removeAll((Collection)Collections.singleton((Object)null));
    }
    
    boolean c(final String s) {
        return this.b.get((Object)s) != null;
    }
    
    void d(final int n) {
        for (final h0 h0 : this.b.values()) {
            if (h0 != null) {
                h0.r(n);
            }
        }
    }
    
    o e(final String s) {
        final h0 h0 = (h0)this.b.get((Object)s);
        if (h0 != null) {
            return h0.k();
        }
        return null;
    }
    
    o f(final int n) {
        for (int i = this.a.size() - 1; i >= 0; --i) {
            final o o = (o)this.a.get(i);
            if (o != null && o.y == n) {
                return o;
            }
        }
        for (final h0 h0 : this.b.values()) {
            if (h0 != null) {
                final o k = h0.k();
                if (k.y == n) {
                    return k;
                }
                continue;
            }
        }
        return null;
    }
    
    o g(final String s) {
        if (s != null) {
            for (int i = this.a.size() - 1; i >= 0; --i) {
                final o o = (o)this.a.get(i);
                if (o != null && s.equals((Object)o.A)) {
                    return o;
                }
            }
        }
        if (s != null) {
            for (final h0 h0 : this.b.values()) {
                if (h0 != null) {
                    final o k = h0.k();
                    if (s.equals((Object)k.A)) {
                        return k;
                    }
                    continue;
                }
            }
        }
        return null;
    }
    
    int h(o o) {
        final ViewGroup i = o.I;
        if (i == null) {
            return -1;
        }
        final int index = this.a.indexOf((Object)o);
        int n = index - 1;
        int n2;
        while (true) {
            n2 = index;
            if (n < 0) {
                break;
            }
            o = (o)this.a.get(n);
            if (o.I == i) {
                final View j = o.J;
                if (j != null) {
                    return i.indexOfChild(j) + 1;
                }
            }
            --n;
        }
        while (++n2 < this.a.size()) {
            o = (o)this.a.get(n2);
            if (o.I == i) {
                final View k = o.J;
                if (k != null) {
                    return i.indexOfChild(k);
                }
                continue;
            }
        }
        return -1;
    }
    
    List i() {
        final ArrayList list = new ArrayList();
        for (final h0 h0 : this.b.values()) {
            if (h0 != null) {
                list.add((Object)h0);
            }
        }
        return (List)list;
    }
    
    List j() {
        final ArrayList list = new ArrayList();
        for (final h0 h0 : this.b.values()) {
            o k;
            if (h0 != null) {
                k = h0.k();
            }
            else {
                k = null;
            }
            list.add((Object)k);
        }
        return (List)list;
    }
    
    HashMap k() {
        return this.c;
    }
    
    h0 l(final String s) {
        return (h0)this.b.get((Object)s);
    }
    
    List m() {
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        final ArrayList a = this.a;
        synchronized (a) {
            return (List)new ArrayList((Collection)this.a);
        }
    }
    
    e0 n() {
        return this.d;
    }
    
    Bundle o(final String s) {
        return (Bundle)this.c.get((Object)s);
    }
    
    void p(final h0 h0) {
        final o k = h0.k();
        if (this.c(k.g)) {
            return;
        }
        this.b.put((Object)k.g, (Object)h0);
        if (k.E) {
            if (k.D) {
                this.d.d(k);
            }
            else {
                this.d.l(k);
            }
            k.E = false;
        }
        if (b0.l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append((Object)k);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    void q(final h0 h0) {
        final o k = h0.k();
        if (k.D) {
            this.d.l(k);
        }
        if (this.b.get((Object)k.g) != h0) {
            return;
        }
        if (this.b.put((Object)k.g, (Object)null) == null) {
            return;
        }
        if (b0.l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append((Object)k);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    void r() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            final h0 h0 = (h0)this.b.get((Object)((o)iterator.next()).g);
            if (h0 != null) {
                h0.m();
            }
        }
        for (final h0 h2 : this.b.values()) {
            if (h2 != null) {
                h2.m();
                final o k = h2.k();
                if (!k.n || k.T()) {
                    continue;
                }
                if (k.p && !this.c.containsKey((Object)k.g)) {
                    this.z(k.g, h2.p());
                }
                this.q(h2);
            }
        }
    }
    
    void s(final o o) {
        final ArrayList a = this.a;
        synchronized (a) {
            this.a.remove((Object)o);
            monitorexit(a);
            o.m = false;
        }
    }
    
    void t() {
        this.b.clear();
    }
    
    void u(final List list) {
        this.a.clear();
        if (list != null) {
            for (final String s : list) {
                final o e = this.e(s);
                if (e == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("No instantiated fragment for (");
                    sb.append(s);
                    sb.append(")");
                    throw new IllegalStateException(sb.toString());
                }
                if (b0.l0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: added (");
                    sb2.append(s);
                    sb2.append("): ");
                    sb2.append((Object)e);
                    Log.v("FragmentManager", sb2.toString());
                }
                this.a(e);
            }
        }
    }
    
    void v(final HashMap hashMap) {
        this.c.clear();
        this.c.putAll((Map)hashMap);
    }
    
    ArrayList w() {
        final ArrayList list = new ArrayList(this.b.size());
        for (final h0 h0 : this.b.values()) {
            if (h0 != null) {
                final o k = h0.k();
                this.z(k.g, h0.p());
                list.add((Object)k.g);
                if (!b0.l0(2)) {
                    continue;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Saved state of ");
                sb.append((Object)k);
                sb.append(": ");
                sb.append((Object)k.d);
                Log.v("FragmentManager", sb.toString());
            }
        }
        return list;
    }
    
    ArrayList x() {
        final ArrayList a = this.a;
        synchronized (a) {
            if (this.a.isEmpty()) {
                return null;
            }
            final ArrayList list = new ArrayList(this.a.size());
            for (final o o : this.a) {
                list.add((Object)o.g);
                if (b0.l0(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding fragment (");
                    sb.append(o.g);
                    sb.append("): ");
                    sb.append((Object)o);
                    Log.v("FragmentManager", sb.toString());
                }
            }
            return list;
        }
    }
    
    void y(final e0 d) {
        this.d = d;
    }
    
    Bundle z(final String s, final Bundle bundle) {
        Object o;
        if (bundle != null) {
            o = this.c.put((Object)s, (Object)bundle);
        }
        else {
            o = this.c.remove((Object)s);
        }
        return (Bundle)o;
    }
}
