package b2;

public abstract class o0 extends n0
{
    public static boolean a(final Object o, final Object obj) {
        boolean b = true;
        if (o != obj) {
            if (o != null) {
                if (!o.equals(obj)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
}
