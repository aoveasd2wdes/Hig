package i1;

import h1.b;
import h1.a;
import android.content.Context;

public class p
{
    private static p a;
    
    private p() {
    }
    
    public static p a() {
        synchronized (p.class) {
            if (p.a == null) {
                p.a = new p();
            }
            return p.a;
        }
    }
    
    public q b(final Context context, final a a) {
        if (androidx.core.content.a.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return q.f;
        }
        if (androidx.core.content.a.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return q.e;
        }
        a.a(b.i);
        return null;
    }
}
