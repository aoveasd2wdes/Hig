package g2;

import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import n1.j;
import android.os.RemoteException;
import h2.u;
import x1.d;
import n1.k;
import android.util.Log;
import q1.o;
import f2.e;
import android.content.Context;

public abstract class e0
{
    private static final String a = "e0";
    private static Context b;
    private static g0 c;
    
    public static g0 a(Context c, final e.a a) {
        o.h((Object)c);
        Log.d(e0.a, "preferredRenderer: ".concat(String.valueOf((Object)a)));
        final g0 c2 = e0.c;
        if (c2 == null) {
            final int d = k.d(c, 13400000);
            if (d == 0) {
                final g0 g0 = e0.c = d(c, a);
                try {
                    if (g0.b() == 2) {
                        try {
                            e0.c.D1(x1.d.u2((Object)c(c, a)));
                        }
                        catch (final RemoteException ex) {
                            throw new u(ex);
                        }
                        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
                            Log.w(e0.a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                            e0.b = null;
                            e0.c = d(c, e.a.e);
                        }
                    }
                    try {
                        final g0 c3 = e0.c;
                        c = c(c, a);
                        c.getClass();
                        c3.K1(x1.d.u2((Object)c.getResources()), 18020000);
                        return e0.c;
                    }
                    catch (final RemoteException ex2) {
                        throw new u(ex2);
                    }
                }
                catch (final RemoteException ex3) {
                    throw new u(ex3);
                }
            }
            throw new j(d);
        }
        return c2;
    }
    
    private static Context b(final Exception ex, final Context context) {
        Log.e(e0.a, "Failed to load maps module, use pre-Chimera", (Throwable)ex);
        return k.b(context);
    }
    
    private static Context c(Context b, e.a o) {
        final Context b2 = e0.b;
        if (b2 == null) {
            if (o == e.a.e) {
                o = "com.google.android.gms.maps_legacy_dynamite";
            }
            else {
                o = "com.google.android.gms.maps_core_dynamite";
            }
            try {
                b = DynamiteModule.c(b, DynamiteModule.b, (String)o).b();
            }
            catch (final Exception ex) {
                if (!((String)o).equals("com.google.android.gms.maps_dynamite")) {
                    try {
                        Log.d(e0.a, "Attempting to load maps_dynamite again.");
                        b = DynamiteModule.c(b, DynamiteModule.b, "com.google.android.gms.maps_dynamite").b();
                    }
                    catch (final Exception ex2) {
                        b = b(ex2, b);
                    }
                }
                else {
                    b = b(ex, b);
                }
            }
            return e0.b = b;
        }
        return b2;
    }
    
    private static g0 d(final Context context, final e.a a) {
        Log.i(e0.a, "Making Creator dynamically");
        final ClassLoader classLoader = c(context, a).getClassLoader();
        try {
            final IBinder binder = (IBinder)e(((ClassLoader)o.h((Object)classLoader)).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            Object o;
            if (binder == null) {
                o = null;
            }
            else {
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                if (queryLocalInterface instanceof g0) {
                    o = queryLocalInterface;
                }
                else {
                    o = new f0(binder);
                }
            }
            return (g0)o;
        }
        catch (final ClassNotFoundException ex) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", (Throwable)ex);
        }
    }
    
    private static Object e(final Class clazz) {
        try {
            return clazz.newInstance();
        }
        catch (final IllegalAccessException ex) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(clazz.getName()), (Throwable)ex);
        }
        catch (final InstantiationException ex2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(clazz.getName()), (Throwable)ex2);
        }
    }
}
