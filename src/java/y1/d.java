package y1;

import android.util.Log;
import android.os.Looper;

public abstract class d
{
    private static ClassLoader a;
    private static Thread b;
    
    public static ClassLoader a() {
        synchronized (d.class) {
            if (d.a == null) {
                final Thread b = d.b;
                final ThreadGroup threadGroup = null;
                Label_0425: {
                    Object threadGroup2;
                    Object contextClassLoader = null;
                    if ((threadGroup2 = b) == null) {
                        threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    Block_23_Outer:
                        while (true) {
                            if (threadGroup2 == null) {
                                contextClassLoader = null;
                                break Label_0323;
                            }
                            final Class<Void> clazz;
                            monitorenter(clazz = Void.class);
                            try {
                                Label_0316: {
                                    try {
                                        final int activeGroupCount = ((ThreadGroup)threadGroup2).activeGroupCount();
                                        final ThreadGroup[] array = new ThreadGroup[activeGroupCount];
                                        ((ThreadGroup)threadGroup2).enumerate(array);
                                        final int n = 0;
                                        for (final ThreadGroup threadGroup3 : array) {
                                            if ("dynamiteLoader".equals((Object)threadGroup3.getName())) {
                                                ThreadGroup threadGroup4 = threadGroup3;
                                                if (threadGroup3 == null) {
                                                    threadGroup4 = new ThreadGroup((ThreadGroup)threadGroup2, "dynamiteLoader");
                                                }
                                                final int activeCount = threadGroup4.activeCount();
                                                threadGroup2 = new Thread[activeCount];
                                                threadGroup4.enumerate((Thread[])threadGroup2);
                                                int j = n;
                                                while (true) {
                                                    while (j < activeCount) {
                                                        Object o = threadGroup2[j];
                                                        if ("GmsDynamite".equals((Object)((Thread)o).getName())) {
                                                            threadGroup2 = o;
                                                            if (o != null) {
                                                                break Label_0316;
                                                            }
                                                            try {
                                                                threadGroup2 = new c(threadGroup4, "GmsDynamite");
                                                                try {
                                                                    ((Thread)threadGroup2).setContextClassLoader((ClassLoader)null);
                                                                    ((Thread)threadGroup2).start();
                                                                }
                                                                catch (final SecurityException ex) {
                                                                    o = threadGroup2;
                                                                    threadGroup2 = ex;
                                                                }
                                                            }
                                                            catch (final SecurityException threadGroup2) {}
                                                        }
                                                        else {
                                                            ++j;
                                                        }
                                                    }
                                                    Object o = null;
                                                    continue;
                                                }
                                            }
                                        }
                                        ThreadGroup threadGroup3 = null;
                                    }
                                    finally {
                                        monitorexit(clazz);
                                        while (true) {
                                            contextClassLoader = threadGroup;
                                            break Label_0425;
                                            d.b = (Thread)contextClassLoader;
                                            threadGroup2 = contextClassLoader;
                                            iftrue(Label_0350:)(contextClassLoader != null);
                                            continue;
                                        }
                                        monitorexit(clazz);
                                        contextClassLoader = threadGroup2;
                                        continue Block_23_Outer;
                                        final String message = ((Throwable)threadGroup2).getMessage();
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("Failed to enumerate thread/threadgroup ");
                                        sb.append(message);
                                        Log.w("DynamiteLoaderV2CL", sb.toString());
                                        final Object o;
                                        threadGroup2 = o;
                                    }
                                }
                            }
                            catch (final SecurityException ex2) {}
                            break;
                        }
                    }
                    final ClassLoader classLoader;
                    Label_0350: {
                        monitorenter(classLoader = (ClassLoader)threadGroup2);
                    }
                    try {
                        try {
                            contextClassLoader = d.b.getContextClassLoader();
                        }
                        finally {
                            monitorexit(classLoader);
                            d.a = (ClassLoader)contextClassLoader;
                            return d.a;
                            monitorexit(classLoader);
                        }
                    }
                    catch (final SecurityException ex3) {}
                }
            }
            return d.a;
        }
    }
}
