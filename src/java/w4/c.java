package w4;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.lang.reflect.Method;

public abstract class c
{
    private static final Method a;
    
    static {
        Method a2;
        try {
            ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        }
        finally {
            a2 = null;
        }
        a = a2;
    }
    
    public static final boolean a(final Executor executor) {
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor)executor;
            }
            else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor == null) {}
            final Method a = c.a;
            if (a == null) {}
            a.invoke((Object)scheduledThreadPoolExecutor, new Object[] { Boolean.TRUE });
            return true;
        }
        finally {
            return false;
        }
    }
}
