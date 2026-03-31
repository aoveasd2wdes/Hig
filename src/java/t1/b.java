package t1;

import u1.f;
import q1.i1;
import android.content.ComponentName;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import w1.d;
import java.util.concurrent.Executor;
import android.content.Intent;
import java.util.NoSuchElementException;
import android.content.ServiceConnection;
import android.content.Context;
import q1.o;
import java.util.concurrent.ConcurrentHashMap;

public class b
{
    private static final Object b;
    private static volatile b c;
    public final ConcurrentHashMap a;
    
    static {
        b = new Object();
    }
    
    private b() {
        this.a = new ConcurrentHashMap();
    }
    
    public static b a() {
        if (t1.b.c == null) {
            final Object b = t1.b.b;
            synchronized (b) {
                if (t1.b.c == null) {
                    t1.b.c = new b();
                }
            }
        }
        final b c = t1.b.c;
        o.h(c);
        return c;
    }
    
    private static void d(final Context context, final ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        }
        catch (final IllegalArgumentException | IllegalStateException | NoSuchElementException ex) {}
    }
    
    private final boolean e(final Context context, final String s, final Intent intent, final ServiceConnection serviceConnection, final int n, boolean b, final Executor executor) {
        final ComponentName component = intent.getComponent();
        if (component != null) {
            final String packageName = component.getPackageName();
            "com.google.android.gms".equals((Object)packageName);
            try {
                if ((d.a(context).a(packageName, 0).flags & 0x200000) != 0x0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {}
        }
        if (f(serviceConnection)) {
            final ServiceConnection serviceConnection2 = (ServiceConnection)this.a.putIfAbsent((Object)serviceConnection, (Object)serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[] { serviceConnection, s, intent.getAction() }));
            }
            try {
                b = g(context, intent, serviceConnection, n, executor);
                if (b) {
                    return b;
                }
                return false;
            }
            finally {
                this.a.remove((Object)serviceConnection, (Object)serviceConnection);
            }
        }
        b = g(context, intent, serviceConnection, n, executor);
        return b;
    }
    
    private static boolean f(final ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof i1);
    }
    
    private static final boolean g(final Context context, final Intent intent, final ServiceConnection serviceConnection, final int n, final Executor executor) {
        Executor executor2 = executor;
        if (executor == null) {
            executor2 = null;
        }
        if (f.h() && executor2 != null) {
            return a.a(context, intent, n, executor2, serviceConnection);
        }
        return context.bindService(intent, serviceConnection, n);
    }
    
    public void b(final Context context, final ServiceConnection serviceConnection) {
        if (f(serviceConnection) && this.a.containsKey((Object)serviceConnection)) {
            try {
                d(context, (ServiceConnection)this.a.get((Object)serviceConnection));
                return;
            }
            finally {
                this.a.remove((Object)serviceConnection);
            }
        }
        d(context, serviceConnection);
    }
    
    public final boolean c(final Context context, final String s, final Intent intent, final ServiceConnection serviceConnection, final int n, final Executor executor) {
        return this.e(context, s, intent, serviceConnection, 4225, true, executor);
    }
}
