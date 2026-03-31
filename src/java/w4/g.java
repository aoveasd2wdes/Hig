package w4;

import o4.c;
import java.util.ServiceLoader;
import r4.h0;
import java.util.Collection;

public abstract class g
{
    private static final Collection a;
    
    static {
        a = (Collection)c.d(c.a(ServiceLoader.load((Class)h0.class, h0.class.getClassLoader()).iterator()));
    }
    
    public static final Collection a() {
        return g.a;
    }
    
    public static final void b(final Throwable t) {
        final Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, t);
    }
}
