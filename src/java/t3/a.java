package t3;

import androidx.profileinstaller.o;
import android.os.Build$VERSION;
import android.os.Handler;
import android.os.Looper;

public abstract class a
{
    public static Handler a(final Looper looper) {
        if (Build$VERSION.SDK_INT >= 28) {
            return o.a(looper);
        }
        return new Handler(looper);
    }
}
