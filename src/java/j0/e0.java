package j0;

import android.util.Log;
import java.util.Iterator;
import androidx.lifecycle.h0;
import java.util.Collection;
import java.util.ArrayList;
import androidx.lifecycle.f0;
import m0.a;
import java.util.HashMap;
import androidx.lifecycle.e0$b;
import androidx.lifecycle.d0;

final class e0 extends d0
{
    private static final e0$b k;
    private final HashMap d;
    private final HashMap e;
    private final HashMap f;
    private final boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    
    static {
        k = (e0$b)new e0$b() {
            public d0 b(final Class clazz) {
                return new e0(true);
            }
        };
    }
    
    e0(final boolean g) {
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.h = false;
        this.i = false;
        this.j = false;
        this.g = g;
    }
    
    private void g(final String s, final boolean b) {
        final e0 e0 = (e0)this.e.get((Object)s);
        if (e0 != null) {
            if (b) {
                final ArrayList list = new ArrayList();
                list.addAll((Collection)e0.e.keySet());
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    e0.f((String)iterator.next(), true);
                }
            }
            e0.c();
            this.e.remove((Object)s);
        }
        final h0 h0 = (h0)this.f.get((Object)s);
        if (h0 != null) {
            h0.a();
            this.f.remove((Object)s);
        }
    }
    
    protected void c() {
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append((Object)this);
            Log.d("FragmentManager", sb.toString());
        }
        this.h = true;
    }
    
    void d(final o o) {
        if (this.j) {
            if (b0.l0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.d.containsKey((Object)o.g)) {
            return;
        }
        this.d.put((Object)o.g, (Object)o);
        if (b0.l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append((Object)o);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    void e(final o o, final boolean b) {
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append((Object)o);
            Log.d("FragmentManager", sb.toString());
        }
        this.g(o.g, b);
    }
    
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && e0.class == o.getClass()) {
            final e0 e0 = (e0)o;
            if (!this.d.equals(e0.d) || !this.e.equals(e0.e) || !this.f.equals(e0.f)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    void f(final String s, final boolean b) {
        if (b0.l0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for saved state of Fragment ");
            sb.append(s);
            Log.d("FragmentManager", sb.toString());
        }
        this.g(s, b);
    }
    
    o h(final String s) {
        return (o)this.d.get((Object)s);
    }
    
    public int hashCode() {
        return (this.d.hashCode() * 31 + this.e.hashCode()) * 31 + this.f.hashCode();
    }
    
    e0 i(final o o) {
        e0 e0;
        if ((e0 = (e0)this.e.get((Object)o.g)) == null) {
            e0 = new e0(this.g);
            this.e.put((Object)o.g, (Object)e0);
        }
        return e0;
    }
    
    Collection j() {
        return (Collection)new ArrayList(this.d.values());
    }
    
    h0 k(final o o) {
        h0 h0;
        if ((h0 = (h0)this.f.get((Object)o.g)) == null) {
            h0 = new h0();
            this.f.put((Object)o.g, (Object)h0);
        }
        return h0;
    }
    
    void l(final o o) {
        if (this.j) {
            if (b0.l0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.d.remove((Object)o.g) != null && b0.l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append((Object)o);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    void m(final boolean j) {
        this.j = j;
    }
    
    boolean n(final o o) {
        if (!this.d.containsKey((Object)o.g)) {
            return true;
        }
        if (this.g) {
            return this.h;
        }
        return this.i ^ true;
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode((Object)this)));
        sb.append("} Fragments (");
        final Iterator iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        final Iterator iterator2 = this.e.keySet().iterator();
        while (iterator2.hasNext()) {
            sb.append((String)iterator2.next());
            if (iterator2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        final Iterator iterator3 = this.f.keySet().iterator();
        while (iterator3.hasNext()) {
            sb.append((String)iterator3.next());
            if (iterator3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
