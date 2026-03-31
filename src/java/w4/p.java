package w4;

public abstract class p
{
    public static final void a(final int n) {
        boolean b = true;
        if (n < 1) {
            b = false;
        }
        if (b) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected positive parallelism level, but got ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
