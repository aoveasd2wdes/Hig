package a2;

import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Handler;

public class e extends Handler
{
    private final Looper a;
    
    public e(final Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }
    
    public e(final Looper looper, final Handler$Callback handler$Callback) {
        super(looper, handler$Callback);
        this.a = Looper.getMainLooper();
    }
}
