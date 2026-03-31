package b2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

public abstract class m0
{
    private static final SimpleDateFormat a;
    private static final SimpleDateFormat b;
    private static final StringBuilder c;
    
    static {
        final Locale root = Locale.ROOT;
        a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", root);
        b = new SimpleDateFormat("MM-dd HH:mm:ss", root);
        c = new StringBuilder(33);
    }
    
    public static String a(final long n) {
        if (n >= 0L) {
            return ((DateFormat)m0.a).format(new Date(n));
        }
        return Long.toString(n);
    }
    
    public static String b(final long n) {
        final StringBuilder c = m0.c;
        synchronized (c) {
            c.setLength(0);
            c(n, c);
            return c.toString();
        }
    }
    
    public static StringBuilder c(long n, final StringBuilder sb) {
        final long n2 = lcmp(n, 0L);
        if (n2 == 0) {
            sb.append("0s");
            return sb;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean b = false;
        long n3 = n;
        if (n2 < 0) {
            sb.append("-");
            if (n != Long.MIN_VALUE) {
                n3 = -n;
                b = b;
            }
            else {
                n3 = Long.MAX_VALUE;
                b = true;
            }
        }
        n = n3;
        if (n3 >= 86400000L) {
            sb.append(n3 / 86400000L);
            sb.append("d");
            n = n3 % 86400000L;
        }
        if (b) {
            n = 25975808L;
        }
        long n4 = n;
        if (n >= 3600000L) {
            sb.append(n / 3600000L);
            sb.append("h");
            n4 = n % 3600000L;
        }
        n = n4;
        if (n4 >= 60000L) {
            sb.append(n4 / 60000L);
            sb.append("m");
            n = n4 % 60000L;
        }
        long n5 = n;
        if (n >= 1000L) {
            sb.append(n / 1000L);
            sb.append("s");
            n5 = n % 1000L;
        }
        if (n5 > 0L) {
            sb.append(n5);
            sb.append("ms");
        }
        return sb;
    }
}
