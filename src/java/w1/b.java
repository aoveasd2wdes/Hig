package w1;

import u1.f;
import android.content.Context;

public abstract class b
{
    private static Context a;
    private static Boolean b;
    
    public static boolean a(final Context context) {
        synchronized (b.class) {
            final Context applicationContext = context.getApplicationContext();
            final Context a = w1.b.a;
            if (a != null) {
                final Boolean b = w1.b.b;
                if (b != null) {
                    if (a == applicationContext) {
                        return b;
                    }
                }
            }
            w1.b.b = null;
            Label_0103: {
                Boolean b2 = null;
                Label_0069: {
                    if (!f.f()) {
                        try {
                            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                            w1.b.b = Boolean.TRUE;
                        }
                        catch (final ClassNotFoundException ex) {
                            b2 = Boolean.FALSE;
                            break Label_0069;
                        }
                        break Label_0103;
                    }
                    b2 = w1.a.a(applicationContext.getPackageManager());
                }
                w1.b.b = b2;
            }
            w1.b.a = applicationContext;
            return w1.b.b;
        }
    }
}
