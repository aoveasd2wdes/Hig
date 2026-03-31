package f4;

import java.io.Closeable;

public abstract class a
{
    public static final void a(final Closeable closeable, final Throwable t) {
        if (closeable != null) {
            if (t == null) {
                closeable.close();
            }
            else {
                try {
                    closeable.close();
                }
                finally {
                    final Throwable t2;
                    u3.a.a(t, t2);
                }
            }
        }
    }
}
