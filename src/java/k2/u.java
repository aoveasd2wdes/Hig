package k2;

import d2.a;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;

final class u implements Executor
{
    private final Handler e;
    
    public u() {
        this.e = (Handler)new a(Looper.getMainLooper());
    }
    
    public final void execute(final Runnable runnable) {
        this.e.post(runnable);
    }
}
