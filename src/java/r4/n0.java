package r4;

import u3.l;
import u3.k;
import w4.j;
import y3.d;

public abstract class n0
{
    public static final String a(final Object o) {
        return o.getClass().getSimpleName();
    }
    
    public static final String b(final Object o) {
        return Integer.toHexString(System.identityHashCode(o));
    }
    
    public static final String c(final d d) {
        String string;
        if (d instanceof j) {
            string = d.toString();
        }
        else {
            Object o = null;
            try {
                final k.a e = k.e;
                final StringBuilder sb = new StringBuilder();
                sb.append((Object)d);
                sb.append('@');
                sb.append(b(d));
                k.a(sb.toString());
            }
            finally {
                final k.a e2 = k.e;
                final Throwable t;
                o = k.a(l.a(t));
            }
            if (k.b(o) != null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(d.getClass().getName());
                sb2.append('@');
                sb2.append(b(d));
                o = sb2.toString();
            }
            string = (String)o;
        }
        return string;
    }
}
