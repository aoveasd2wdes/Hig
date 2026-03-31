package n1;

import android.util.Log;
import android.content.Context;

abstract class z
{
    static final x a;
    static final x b;
    static final x c;
    static final x d;
    private static final Object e;
    private static Context f;
    
    static {
        a = (x)new r(v.J("0\u0082\u0005\u00c80\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bs\u00f9/\u008eQ\u00ed"));
        b = (x)new s(v.J("0\u0082\u0006\u00040\u0082\u0003\u00ec \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad\u00d7\u00e1r\u00cak\u00ec"));
        c = (x)new t(v.J("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0"));
        d = (x)new u(v.J("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085¸l}\u00d3N\u00f50"));
        e = new Object();
    }
    
    static void a(final Context context) {
        synchronized (z.class) {
            if (z.f != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                return;
            }
            if (context != null) {
                z.f = context.getApplicationContext();
            }
        }
    }
}
