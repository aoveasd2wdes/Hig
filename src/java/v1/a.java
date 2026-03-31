package v1;

import a2.e;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;

public class a implements Executor
{
    private final Handler e;
    
    public a(final Looper looper) {
        this.e = (Handler)new e(looper);
    }
    
    public final void execute(final Runnable runnable) {
        this.e.post(runnable);
    }
}
