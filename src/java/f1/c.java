package f1;

import java.util.StringTokenizer;
import java.util.Locale;

public abstract class c
{
    public static Locale a(String nextToken) {
        Locale locale2;
        final Locale locale = locale2 = null;
        if (nextToken != null) {
            if (nextToken.isEmpty()) {
                locale2 = locale;
            }
            else {
                final StringTokenizer stringTokenizer = new StringTokenizer(nextToken, "_", false);
                if (stringTokenizer.hasMoreTokens()) {
                    nextToken = stringTokenizer.nextToken();
                }
                else {
                    nextToken = null;
                }
                String nextToken2;
                if (stringTokenizer.hasMoreTokens()) {
                    nextToken2 = stringTokenizer.nextToken();
                }
                else {
                    nextToken2 = null;
                }
                String nextToken3;
                if (stringTokenizer.hasMoreTokens()) {
                    nextToken3 = stringTokenizer.nextToken();
                }
                else {
                    nextToken3 = null;
                }
                if (nextToken != null && nextToken2 != null && nextToken3 != null) {
                    return new Locale(nextToken, nextToken2, nextToken3);
                }
                if (nextToken != null && nextToken2 != null) {
                    return new Locale(nextToken, nextToken2);
                }
                locale2 = locale;
                if (nextToken != null) {
                    locale2 = new Locale(nextToken);
                }
            }
        }
        return locale2;
    }
}
