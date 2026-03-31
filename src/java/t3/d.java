package t3;

public abstract class d
{
    public static void a(final boolean b, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf(o));
    }
}
