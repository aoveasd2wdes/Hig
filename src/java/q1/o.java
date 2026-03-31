package q1;

import android.text.TextUtils;
import u1.i;
import android.os.Looper;
import android.os.Handler;

public abstract class o
{
    public static void a(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void b(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(o));
    }
    
    public static void c(final boolean b, final String s, final Object... array) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.format(s, array));
    }
    
    public static void d(final Handler handler) {
        final Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name;
            if (myLooper != null) {
                name = myLooper.getThread().getName();
            }
            else {
                name = "null current looper";
            }
            final String name2 = handler.getLooper().getThread().getName();
            final StringBuilder sb = new StringBuilder();
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static void e(final String s) {
        if (i.a()) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public static String f(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }
    
    public static String g(final String s, final Object o) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        throw new IllegalArgumentException(String.valueOf(o));
    }
    
    public static Object h(final Object o) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException("null reference");
    }
    
    public static Object i(final Object o, final Object o2) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(String.valueOf(o2));
    }
    
    public static void j(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void k(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf(o));
    }
}
