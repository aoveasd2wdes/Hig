package u1;

import android.util.Log;
import q1.o;
import android.content.Context;

public abstract class c
{
    private static final String[] a;
    
    static {
        a = new String[] { "android.", "com.android.", "dalvik.", "java.", "javax." };
    }
    
    public static boolean a(final Context context, final Throwable t) {
        try {
            o.h(context);
            o.h(t);
        }
        catch (final Exception ex) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", (Throwable)ex);
        }
        return false;
    }
}
