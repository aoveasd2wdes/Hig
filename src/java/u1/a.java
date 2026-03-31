package u1;

import q1.n;

public abstract class a
{
    public static boolean a(final int[] array, final int n) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i] == n) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean b(final Object[] array, final Object o) {
        int length;
        if (array != null) {
            length = array.length;
        }
        else {
            length = 0;
        }
        int i = 0;
        while (i < length) {
            if (n.a(array[i], o)) {
                if (i >= 0) {
                    return true;
                }
                break;
            }
            else {
                ++i;
            }
        }
        return false;
    }
}
