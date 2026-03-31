package r0;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.os.Trace;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public abstract class a
{
    private static long a;
    private static Method b;
    private static Method c;
    private static Method d;
    
    public static void a(String j, final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        j = j(j);
        if (sdk_INT >= 29) {
            r0.c.a(j, n);
        }
        else {
            b(j, n);
        }
    }
    
    private static void b(final String s, final int n) {
        try {
            if (r0.a.c == null) {
                r0.a.c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            r0.a.c.invoke((Object)null, new Object[] { r0.a.a, s, n });
        }
        catch (final Exception ex) {
            g("asyncTraceBegin", ex);
        }
    }
    
    public static void c(final String s) {
        r0.b.a(j(s));
    }
    
    public static void d(String j, final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        j = j(j);
        if (sdk_INT >= 29) {
            r0.c.b(j, n);
        }
        else {
            e(j, n);
        }
    }
    
    private static void e(final String s, final int n) {
        try {
            if (r0.a.d == null) {
                r0.a.d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            r0.a.d.invoke((Object)null, new Object[] { r0.a.a, s, n });
        }
        catch (final Exception ex) {
            g("asyncTraceEnd", ex);
        }
    }
    
    public static void f() {
        r0.b.b();
    }
    
    private static void g(final String s, final Exception ex) {
        if (!(ex instanceof InvocationTargetException)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to call ");
            sb.append(s);
            sb.append(" via reflection");
            Log.v("Trace", sb.toString(), (Throwable)ex);
            return;
        }
        final Throwable cause = ((Throwable)ex).getCause();
        if (cause instanceof RuntimeException) {
            throw (RuntimeException)cause;
        }
        throw new RuntimeException(cause);
    }
    
    public static boolean h() {
        if (Build$VERSION.SDK_INT >= 29) {
            return r0.c.c();
        }
        return i();
    }
    
    private static boolean i() {
        try {
            if (r0.a.b == null) {
                r0.a.a = Trace.class.getField("TRACE_TAG_APP").getLong((Object)null);
                r0.a.b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return (boolean)r0.a.b.invoke((Object)null, new Object[] { r0.a.a });
        }
        catch (final Exception ex) {
            g("isTagEnabled", ex);
            return false;
        }
    }
    
    private static String j(final String s) {
        if (s.length() <= 127) {
            return s;
        }
        return s.substring(0, 127);
    }
}
