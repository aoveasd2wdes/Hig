package n0;

import android.content.SharedPreferences;
import android.content.Context;

public abstract class b
{
    public static SharedPreferences a(final Context context) {
        return context.getSharedPreferences(c(context), b());
    }
    
    private static int b() {
        return 0;
    }
    
    private static String c(final Context context) {
        final StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append("_preferences");
        return sb.toString();
    }
}
