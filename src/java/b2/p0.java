package b2;

public abstract class p0
{
    public static int a(final int n, final int n2, String s) {
        if (n >= 0 && n < n2) {
            return n;
        }
        if (n >= 0) {
            if (n2 < 0) {
                final StringBuilder sb = new StringBuilder(String.valueOf(n2).length() + 15);
                sb.append("negative size: ");
                sb.append(n2);
                throw new IllegalArgumentException(sb.toString());
            }
            s = q0.a("%s (%s) must be less than size (%s)", "index", n, n2);
        }
        else {
            s = q0.a("%s (%s) must not be negative", "index", n);
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static int b(final int n, final int n2, final String s) {
        if (n >= 0 && n <= n2) {
            return n;
        }
        throw new IndexOutOfBoundsException(d(n, n2, "index"));
    }
    
    public static void c(final int n, final int n2, final int n3) {
        if (n >= 0 && n2 >= n && n2 <= n3) {
            return;
        }
        String s;
        if (n >= 0 && n <= n3) {
            if (n2 >= 0 && n2 <= n3) {
                s = q0.a("end index (%s) must not be less than start index (%s)", n2, n);
            }
            else {
                s = d(n2, n3, "end index");
            }
        }
        else {
            s = d(n, n3, "start index");
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    private static String d(final int n, final int n2, final String s) {
        if (n < 0) {
            return q0.a("%s (%s) must not be negative", s, n);
        }
        if (n2 >= 0) {
            return q0.a("%s (%s) must not be greater than size (%s)", s, n, n2);
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(n2).length() + 15);
        sb.append("negative size: ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
}
