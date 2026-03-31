package g2;

public abstract class f
{
    public static byte a(final Boolean b) {
        byte b2;
        if (b != null) {
            if (b) {
                return 1;
            }
            b2 = 0;
        }
        else {
            b2 = -1;
        }
        return b2;
    }
    
    public static Boolean b(final byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
