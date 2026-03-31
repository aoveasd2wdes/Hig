package i4;

import u3.p;
import java.util.Arrays;

public abstract class l
{
    public static boolean a(final Object o, final Object obj) {
        boolean equals;
        if (o == null) {
            equals = (obj == null);
        }
        else {
            equals = o.equals(obj);
        }
        return equals;
    }
    
    public static void b(final Object o) {
        if (o == null) {
            j();
        }
    }
    
    public static void c(final Object o, final String s) {
        if (o == null) {
            k(s);
        }
    }
    
    public static void d(final Object o, final String s) {
        if (o != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" must not be null");
        throw (NullPointerException)h((Throwable)new NullPointerException(sb.toString()));
    }
    
    public static void e(final Object o, final String s) {
        if (o == null) {
            l(s);
        }
    }
    
    public static int f(int n, final int n2) {
        if (n < n2) {
            n = -1;
        }
        else if (n == n2) {
            n = 0;
        }
        else {
            n = 1;
        }
        return n;
    }
    
    private static String g(final String s) {
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final String name = l.class.getName();
        int n = 0;
        int n2;
        while (true) {
            n2 = n;
            if (stackTrace[n].getClassName().equals((Object)name)) {
                break;
            }
            ++n;
        }
        while (stackTrace[n2].getClassName().equals((Object)name)) {
            ++n2;
        }
        final StackTraceElement stackTraceElement = stackTrace[n2];
        final String className = stackTraceElement.getClassName();
        final String methodName = stackTraceElement.getMethodName();
        final StringBuilder sb = new StringBuilder();
        sb.append("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(s);
        return sb.toString();
    }
    
    private static Throwable h(final Throwable t) {
        return i(t, l.class.getName());
    }
    
    static Throwable i(final Throwable t, final String s) {
        final StackTraceElement[] stackTrace = t.getStackTrace();
        final int length = stackTrace.length;
        int n = -1;
        for (int i = 0; i < length; ++i) {
            if (s.equals((Object)stackTrace[i].getClassName())) {
                n = i;
            }
        }
        t.setStackTrace((StackTraceElement[])Arrays.copyOfRange((Object[])stackTrace, n + 1, length));
        return t;
    }
    
    public static void j() {
        throw (NullPointerException)h((Throwable)new NullPointerException());
    }
    
    public static void k(final String s) {
        throw (NullPointerException)h((Throwable)new NullPointerException(s));
    }
    
    private static void l(final String s) {
        throw (NullPointerException)h((Throwable)new NullPointerException(g(s)));
    }
    
    public static void m(final String s) {
        throw (p)h((Throwable)new p(s));
    }
    
    public static void n(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append("lateinit property ");
        sb.append(s);
        sb.append(" has not been initialized");
        m(sb.toString());
    }
}
