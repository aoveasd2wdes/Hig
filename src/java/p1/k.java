package p1;

import q1.b;
import k2.h;
import com.google.android.gms.common.api.Status;

public abstract class k
{
    public static void a(final Status status, final Object o, final h h) {
        if (status.e()) {
            h.c(o);
            return;
        }
        h.b((Exception)b.a(status));
    }
    
    public static void b(final Status status, final h h) {
        a(status, null, h);
    }
}
