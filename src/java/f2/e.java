package f2;

import g2.g0;
import n1.j;
import h2.u;
import android.os.RemoteException;
import x1.d;
import h2.c;
import g2.e0;
import android.util.Log;
import q1.o;
import android.content.Context;

public abstract class e
{
    private static final String a = "e";
    private static boolean b;
    private static a c;
    
    static {
        e.c = e.a.e;
    }
    
    public static int a(final Context context) {
        synchronized (e.class) {
            return b(context, null, null);
        }
    }
    
    public static int b(final Context context, final a a, final g g) {
        synchronized (e.class) {
            o.i((Object)context, (Object)"Context is null");
            Log.d(e.a, "preferredRenderer: ".concat(String.valueOf((Object)a)));
            if (e.b) {
                if (g != null) {
                    g.a(e.c);
                }
                return 0;
            }
            try {
                final g0 a2 = e0.a(context, a);
                try {
                    f2.b.k(a2.l());
                    h2.c.e(a2.s());
                    int n = 1;
                    e.b = true;
                    Label_0117: {
                        if (a != null) {
                            final int ordinal = a.ordinal();
                            if (ordinal == 0) {
                                break Label_0117;
                            }
                            if (ordinal == 1) {
                                n = 2;
                                break Label_0117;
                            }
                        }
                        n = 0;
                        try {
                            if (a2.b() == 2) {
                                e.c = e.a.f;
                            }
                            a2.V1(d.u2((Object)context), n);
                        }
                        catch (final RemoteException ex) {
                            Log.e(e.a, "Failed to retrieve renderer type or log initialization.", (Throwable)ex);
                        }
                    }
                    Log.d(e.a, "loadedRenderer: ".concat(String.valueOf((Object)e.c)));
                    if (g != null) {
                        g.a(e.c);
                    }
                    return 0;
                }
                catch (final RemoteException ex2) {
                    throw new u(ex2);
                }
            }
            catch (final j j) {
                return j.e;
            }
        }
    }
    
    public enum a
    {
        e("LEGACY", 0), 
        f("LATEST", 1);
        
        private static final a[] g;
        
        private a(final String s, final int n) {
        }
    }
}
