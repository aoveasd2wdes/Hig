package v;

public abstract class b
{
    public static void a(final Object o, final StringBuilder sb) {
        String hexString;
        if (o == null) {
            hexString = "null";
        }
        else {
            String s;
            if ((s = o.getClass().getSimpleName()).length() <= 0) {
                final String name = o.getClass().getName();
                final int lastIndex = name.lastIndexOf(46);
                s = name;
                if (lastIndex > 0) {
                    s = name.substring(lastIndex + 1);
                }
            }
            sb.append(s);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(o));
        }
        sb.append(hexString);
    }
}
