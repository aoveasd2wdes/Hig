package d2;

import android.os.Looper;
import android.os.Handler;

public final class a extends Handler
{
    private final Looper a;
    
    public a(final Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }
}
