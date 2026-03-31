package p0;

import android.os.BaseBundle;
import o.b$d;
import androidx.lifecycle.k;
import androidx.lifecycle.h;
import java.util.Iterator;
import java.util.Map$Entry;
import androidx.lifecycle.h$a;
import androidx.lifecycle.l;
import i4.g;
import android.os.Bundle;
import o.b;

public final class d
{
    private static final d.d$b f;
    private final b a;
    private boolean b;
    private Bundle c;
    private boolean d;
    private boolean e;
    
    static {
        f = new d.d$b((g)null);
    }
    
    public d() {
        this.a = new b();
        this.e = true;
    }
    
    private static final void d(final d d, final l l, final h$a h$a) {
        i4.l.e((Object)d, "this$0");
        i4.l.e((Object)l, "<anonymous parameter 0>");
        i4.l.e((Object)h$a, "event");
        boolean e;
        if (h$a == h$a.ON_START) {
            e = true;
        }
        else {
            if (h$a != h$a.ON_STOP) {
                return;
            }
            e = false;
        }
        d.e = e;
    }
    
    public final Bundle b(final String s) {
        i4.l.e((Object)s, "key");
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        final Bundle c = this.c;
        if (c != null) {
            Bundle bundle;
            if (c != null) {
                bundle = c.getBundle(s);
            }
            else {
                bundle = null;
            }
            final Bundle c2 = this.c;
            if (c2 != null) {
                c2.remove(s);
            }
            final Bundle c3 = this.c;
            int n = 0;
            if (c3 != null) {
                n = n;
                if (!((BaseBundle)c3).isEmpty()) {
                    n = 1;
                }
            }
            if (n == 0) {
                this.c = null;
            }
            return bundle;
        }
        return null;
    }
    
    public final c c(final String s) {
        i4.l.e((Object)s, "key");
        for (final Map$Entry map$Entry : this.a) {
            i4.l.d((Object)map$Entry, "components");
            final String s2 = (String)map$Entry.getKey();
            final c c = (c)map$Entry.getValue();
            if (i4.l.a((Object)s2, (Object)s)) {
                return c;
            }
        }
        return null;
    }
    
    public final void e(final h h) {
        i4.l.e((Object)h, "lifecycle");
        if (this.b ^ true) {
            h.a((k)new p0.c(this));
            this.b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }
    
    public final void f(Bundle bundle) {
        if (!this.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (this.d ^ true) {
            if (bundle != null) {
                bundle = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            else {
                bundle = null;
            }
            this.c = bundle;
            this.d = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
    }
    
    public final void g(final Bundle bundle) {
        i4.l.e((Object)bundle, "outBundle");
        final Bundle bundle2 = new Bundle();
        final Bundle c = this.c;
        if (c != null) {
            bundle2.putAll(c);
        }
        final b$d k = this.a.k();
        i4.l.d((Object)k, "this.components.iteratorWithAdditions()");
        while (((Iterator)k).hasNext()) {
            final Map$Entry map$Entry = (Map$Entry)((Iterator)k).next();
            bundle2.putBundle((String)map$Entry.getKey(), ((c)map$Entry.getValue()).a());
        }
        if (!((BaseBundle)bundle2).isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
    
    public final void h(final String s, final c c) {
        i4.l.e((Object)s, "key");
        i4.l.e((Object)c, "provider");
        if (this.a.n((Object)s, (Object)c) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }
    
    public interface c
    {
        Bundle a();
    }
}
