package f1;

import java.util.StringTokenizer;

public abstract class a
{
    public static String a(final String s) {
        if (s != null) {
            if (!s.isEmpty()) {
                final StringTokenizer stringTokenizer = new StringTokenizer(s, ",", false);
                if (stringTokenizer.hasMoreTokens()) {
                    return stringTokenizer.nextToken();
                }
            }
        }
        return null;
    }
}
