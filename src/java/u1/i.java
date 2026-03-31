package u1;

import android.os.Looper;

public abstract class i
{
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
