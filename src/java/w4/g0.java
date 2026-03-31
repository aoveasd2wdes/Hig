package w4;

import u3.k$a;
import u3.l;
import u3.k;
import a.a;

public abstract class g0
{
    private static final StackTraceElement a;
    private static final String b;
    private static final String c;
    
    static {
        a = new a().a();
        Object a2 = null;
        try {
            final k$a e = k.e;
            k.a((Object)a4.a.class.getCanonicalName());
        }
        finally {
            final k$a e2 = k.e;
            final Throwable t;
            a2 = k.a(l.a(t));
        }
        if (k.b(a2) != null) {
            a2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String)a2;
        Object a3 = null;
        try {
            k.a((Object)g0.class.getCanonicalName());
        }
        finally {
            final k$a e3 = k.e;
            final Throwable t2;
            a3 = k.a(l.a(t2));
        }
        if (k.b(a3) != null) {
            a3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String)a3;
    }
    
    public static final Throwable a(final Throwable t) {
        return t;
    }
}
