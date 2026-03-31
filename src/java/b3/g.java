package b3;

import t3.a;
import android.os.Looper;
import android.os.Handler;

public class g implements c$d
{
    private final Handler a;
    
    public g() {
        this.a = t3.a.a(Looper.getMainLooper());
    }
    
    public void a(final Runnable runnable) {
        this.a.post(runnable);
    }
}
