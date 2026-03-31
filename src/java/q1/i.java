package q1;

import android.content.ServiceConnection;
import android.os.Looper;
import android.content.Context;
import java.util.concurrent.Executor;
import android.os.HandlerThread;

public abstract class i
{
    private static final Object a;
    private static h1 b;
    static HandlerThread c;
    private static Executor d;
    private static boolean e;
    
    static {
        a = new Object();
    }
    
    public static i a(final Context context) {
        final Object a = i.a;
        synchronized (a) {
            if (i.b == null) {
                final Context applicationContext = context.getApplicationContext();
                Looper looper;
                if (i.e) {
                    looper = b().getLooper();
                }
                else {
                    looper = context.getMainLooper();
                }
                i.b = new h1(applicationContext, looper, i.d);
            }
            return (i)i.b;
        }
    }
    
    public static HandlerThread b() {
        final Object a = i.a;
        synchronized (a) {
            final HandlerThread c = i.c;
            if (c != null) {
                return c;
            }
            ((Thread)(i.c = new HandlerThread("GoogleApiHandler", 9))).start();
            return i.c;
        }
    }
    
    protected abstract void c(final c1 p0, final ServiceConnection p1, final String p2);
    
    public final void d(final String s, final String s2, final int n, final ServiceConnection serviceConnection, final String s3, final boolean b) {
        this.c(new c1(s, s2, 4225, b), serviceConnection, s3);
    }
    
    protected abstract boolean e(final c1 p0, final ServiceConnection p1, final String p2, final Executor p3);
}
