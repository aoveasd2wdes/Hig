package b2;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class q0
{
    public static String a(final String s, final Object... array) {
        final int n = 0;
        int n2 = 0;
        int length;
        while (true) {
            length = array.length;
            if (n2 >= length) {
                break;
            }
            final Object o = array[n2];
            String s2;
            if (o == null) {
                s2 = "null";
            }
            else {
                try {
                    s2 = o.toString();
                }
                catch (final Exception ex) {
                    final String name = o.getClass().getName();
                    final String hexString = Integer.toHexString(System.identityHashCode(o));
                    final StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf((Object)hexString).length());
                    sb.append(name);
                    sb.append("@");
                    sb.append(hexString);
                    final String string = sb.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string), (Throwable)ex);
                    final String name2 = ((Throwable)ex).getClass().getName();
                    final StringBuilder sb2 = new StringBuilder(string.length() + 8 + name2.length() + 1);
                    sb2.append("<");
                    sb2.append(string);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    s2 = sb2.toString();
                }
            }
            array[n2] = s2;
            ++n2;
        }
        final StringBuilder sb3 = new StringBuilder(s.length() + length * 16);
        int n3 = 0;
        int n4 = n;
        int length2;
        while (true) {
            length2 = array.length;
            if (n4 >= length2) {
                break;
            }
            final int index = s.indexOf("%s", n3);
            if (index == -1) {
                break;
            }
            sb3.append((CharSequence)s, n3, index);
            sb3.append(array[n4]);
            n3 = index + 2;
            ++n4;
        }
        sb3.append((CharSequence)s, n3, s.length());
        if (n4 < length2) {
            sb3.append(" [");
            final int n5 = n4 + 1;
            sb3.append(array[n4]);
            for (int i = n5; i < array.length; ++i) {
                sb3.append(", ");
                sb3.append(array[i]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
