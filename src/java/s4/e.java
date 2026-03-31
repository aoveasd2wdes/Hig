package s4;

import android.os.Handler$Callback;
import android.os.Build$VERSION;
import android.os.Handler;
import u3.l;
import i4.g;
import android.os.Looper;
import u3.k;
import android.view.Choreographer;

public abstract class e
{
    public static final d a;
    private static volatile Choreographer choreographer;
    
    static {
        final d d = null;
        Object a2 = null;
        try {
            final k.a e = k.e;
            k.a(new c(a(Looper.getMainLooper(), true), (String)null, 2, (g)null));
        }
        finally {
            final k.a e2 = k.e;
            final Throwable t;
            a2 = k.a(l.a(t));
        }
        if (k.c(a2)) {
            a2 = d;
        }
        a = (d)a2;
    }
    
    public static final Handler a(Looper o, final boolean b) {
        if (b) {
            if (Build$VERSION.SDK_INT < 28) {
                try {
                    o = Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(new Object[] { o, null, Boolean.TRUE });
                    return (Handler)o;
                }
                catch (final NoSuchMethodException ex) {
                    return new Handler((Looper)o);
                }
                return new Handler((Looper)o);
            }
            o = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke((Object)null, new Object[] { o });
            i4.l.c(o, "null cannot be cast to non-null type android.os.Handler");
            return (Handler)o;
        }
        return new Handler((Looper)o);
    }
}
