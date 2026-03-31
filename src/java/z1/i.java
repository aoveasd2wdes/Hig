package z1;

import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Handler;

public class i extends Handler
{
    private final Looper a;
    
    public i(final Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }
    
    public i(final Looper looper, final Handler$Callback handler$Callback) {
        super(looper, handler$Callback);
        this.a = Looper.getMainLooper();
    }
}
