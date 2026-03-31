package t3;

import r0.a;

public final class f implements AutoCloseable
{
    private f(final String s) {
        a(s);
    }
    
    public static void a(final String s) {
        a.c(c(s));
    }
    
    public static void b(final String s, final int n) {
        a.a(c(s), n);
    }
    
    private static String c(String string) {
        if (string.length() >= 124) {
            final StringBuilder sb = new StringBuilder();
            sb.append(string.substring(0, 124));
            sb.append("...");
            string = sb.toString();
        }
        return string;
    }
    
    public static void e() {
        a.f();
    }
    
    public static void f(final String s, final int n) {
        a.d(c(s), n);
    }
    
    public static f h(final String s) {
        return new f(s);
    }
    
    public void close() {
        e();
    }
}
