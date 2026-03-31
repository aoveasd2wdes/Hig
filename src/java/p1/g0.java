package p1;

import android.os.Handler;
import java.lang.ref.Reference;
import android.app.Activity;
import a2.e;
import android.os.Looper;
import java.util.Iterator;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Map$Entry;
import java.lang.ref.WeakReference;
import j0.p;
import java.util.Collections;
import p.a;
import android.os.Bundle;
import java.util.Map;
import java.util.WeakHashMap;
import j0.o;

public final class g0 extends o implements f
{
    private static final WeakHashMap g0;
    private final Map d0;
    private int e0;
    private Bundle f0;
    
    static {
        g0 = new WeakHashMap();
    }
    
    public g0() {
        this.d0 = Collections.synchronizedMap((Map)new a());
        this.e0 = 0;
    }
    
    public static g0 V0(final p p) {
        final WeakReference weakReference = (WeakReference)p1.g0.g0.get((Object)p);
        if (weakReference != null) {
            final g0 g0 = (g0)((Reference)weakReference).get();
            if (g0 != null) {
                return g0;
            }
        }
        throw null;
    }
    
    public final void X(final Bundle f0) {
        super.X(f0);
        this.e0 = 1;
        this.f0 = f0;
        for (final Map$Entry map$Entry : this.d0.entrySet()) {
            final LifecycleCallback lifecycleCallback = (LifecycleCallback)map$Entry.getValue();
            Bundle bundle;
            if (f0 != null) {
                bundle = f0.getBundle((String)map$Entry.getKey());
            }
            else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
    }
    
    public final void c(final String s, final LifecycleCallback lifecycleCallback) {
        if (!this.d0.containsKey((Object)s)) {
            this.d0.put((Object)s, (Object)lifecycleCallback);
            if (this.e0 > 0) {
                ((Handler)new e(Looper.getMainLooper())).post((Runnable)new f0(this, lifecycleCallback, s));
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("LifecycleCallback with tag ");
        sb.append(s);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final LifecycleCallback e(final String s, final Class clazz) {
        return clazz.cast(this.d0.get((Object)s));
    }
    
    public final void i0() {
        super.i0();
        this.e0 = 3;
        final Iterator iterator = this.d0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).h();
        }
    }
    
    public final void j0(final Bundle bundle) {
        super.j0(bundle);
        if (bundle != null) {
            for (final Map$Entry map$Entry : this.d0.entrySet()) {
                final Bundle bundle2 = new Bundle();
                ((LifecycleCallback)map$Entry.getValue()).i(bundle2);
                bundle.putBundle((String)map$Entry.getKey(), bundle2);
            }
        }
    }
    
    public final void k0() {
        super.k0();
        this.e0 = 2;
        final Iterator iterator = this.d0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).j();
        }
    }
    
    public final void l0() {
        super.l0();
        this.e0 = 4;
        final Iterator iterator = this.d0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).k();
        }
    }
}
