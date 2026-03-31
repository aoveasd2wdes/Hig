package k1;

import android.net.Uri;
import android.content.Intent;
import android.content.Context;

public abstract class a
{
    public static boolean a(final Context context) {
        try {
            final Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            final StringBuilder sb = new StringBuilder();
            sb.append("package:");
            sb.append(context.getPackageName());
            intent.setData(Uri.parse(sb.toString()));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
            return true;
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public static boolean b(final Context context) {
        try {
            final Intent intent = new Intent();
            intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
            return true;
        }
        catch (final Exception ex) {
            return false;
        }
    }
}
