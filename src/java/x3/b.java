package x3;

abstract class b
{
    public static int a(final Comparable comparable, final Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo((Object)comparable2);
    }
}
