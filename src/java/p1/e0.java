package p1;

import android.os.Handler;
import java.lang.ref.Reference;
import java.util.Map$Entry;
import android.content.Intent;
import java.util.Iterator;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import a2.e;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import android.app.Activity;
import java.util.Collections;
import p.a;
import android.os.Bundle;
import java.util.Map;
import java.util.WeakHashMap;
import android.app.Fragment;

public final class e0 extends Fragment implements f
{
    private static final WeakHashMap f;
    private final Map c;
    private int d;
    private Bundle e;
    
    static {
        f = new WeakHashMap();
    }
    
    public e0() {
        this.c = Collections.synchronizedMap((Map)new a());
        this.d = 0;
    }
    
    public static e0 d(final Activity activity) {
        final WeakHashMap f = e0.f;
        final WeakReference weakReference = (WeakReference)f.get((Object)activity);
        if (weakReference != null) {
            final e0 e0 = (e0)((Reference)weakReference).get();
            if (e0 != null) {
                return e0;
            }
        }
        try {
            final e0 e2 = (e0)activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            e0 e3 = null;
            Label_0085: {
                if (e2 != null) {
                    e3 = e2;
                    if (!e2.isRemoving()) {
                        break Label_0085;
                    }
                }
                e3 = new e0();
                activity.getFragmentManager().beginTransaction().add((Fragment)e3, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f.put((Object)activity, (Object)new WeakReference((Object)e3));
            return e3;
        }
        catch (final ClassCastException ex) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", (Throwable)ex);
        }
    }
    
    public final void c(final String s, final LifecycleCallback lifecycleCallback) {
        if (!this.c.containsKey((Object)s)) {
            this.c.put((Object)s, (Object)lifecycleCallback);
            if (this.d > 0) {
                ((Handler)new e(Looper.getMainLooper())).post((Runnable)new d0(this, lifecycleCallback, s));
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("LifecycleCallback with tag ");
        sb.append(s);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        final Iterator iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).a(s, fileDescriptor, printWriter, array);
        }
    }
    
    public final LifecycleCallback e(final String s, final Class clazz) {
        return clazz.cast(this.c.get((Object)s));
    }
    
    public final Activity f() {
        return this.getActivity();
    }
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        final Iterator iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).e(n, n2, intent);
        }
    }
    
    public final void onCreate(final Bundle e) {
        super.onCreate(e);
        this.d = 1;
        this.e = e;
        for (final Map$Entry map$Entry : this.c.entrySet()) {
            final LifecycleCallback lifecycleCallback = (LifecycleCallback)map$Entry.getValue();
            Bundle bundle;
            if (e != null) {
                bundle = e.getBundle((String)map$Entry.getKey());
            }
            else {
                bundle = null;
            }
            lifecycleCallback.f(bundle);
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.d = 5;
        final Iterator iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).g();
        }
    }
    
    public final void onResume() {
        super.onResume();
        this.d = 3;
        final Iterator iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).h();
        }
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (final Map$Entry map$Entry : this.c.entrySet()) {
                final Bundle bundle2 = new Bundle();
                ((LifecycleCallback)map$Entry.getValue()).i(bundle2);
                bundle.putBundle((String)map$Entry.getKey(), bundle2);
            }
        }
    }
    
    public final void onStart() {
        super.onStart();
        this.d = 2;
        final Iterator iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).j();
        }
    }
    
    public final void onStop() {
        super.onStop();
        this.d = 4;
        final Iterator iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).k();
        }
    }
}
