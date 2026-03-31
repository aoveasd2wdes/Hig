package q1;

import o1.g;
import com.google.android.gms.common.api.Status;

public abstract class b
{
    public static o1.b a(final Status status) {
        if (status.d()) {
            return (o1.b)new g(status);
        }
        return new o1.b(status);
    }
}
