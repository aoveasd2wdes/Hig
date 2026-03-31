package t;

import android.os.Looper;
import android.os.Handler;

abstract class b
{
    static Handler a() {
        Handler handler;
        if (Looper.myLooper() == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        else {
            handler = new Handler();
        }
        return handler;
    }
}
