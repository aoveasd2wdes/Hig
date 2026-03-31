package q1;

import android.os.BaseBundle;
import android.os.Bundle;
import w1.c;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import w1.d;
import android.content.Context;

public abstract class p0
{
    private static final Object a;
    private static boolean b;
    private static String c;
    private static int d;
    
    static {
        a = new Object();
    }
    
    public static int a(final Context context) {
        b(context);
        return p0.d;
    }
    
    private static void b(final Context context) {
        final Object a = p0.a;
        synchronized (a) {
            if (p0.b) {
                return;
            }
            p0.b = true;
            final String packageName = context.getPackageName();
            final c a2 = w1.d.a(context);
            try {
                final Bundle metaData = a2.a(packageName, 128).metaData;
                if (metaData == null) {
                    return;
                }
                p0.c = ((BaseBundle)metaData).getString("com.google.app.id");
                p0.d = ((BaseBundle)metaData).getInt("com.google.android.gms.version");
            }
            catch (final PackageManager$NameNotFoundException ex) {
                Log.wtf("MetadataValueReader", "This should never happen.", (Throwable)ex);
            }
        }
    }
}
