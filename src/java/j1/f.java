package j1;

import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import android.content.pm.PackageInfo;
import android.content.Context;

public abstract class f
{
    private static PackageInfo a(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        final String packageName = context.getPackageName();
        if (Build$VERSION.SDK_INT < 33) {
            return packageManager.getPackageInfo(packageName, 4096);
        }
        return e.a(packageManager, packageName, d.a(4096L));
    }
    
    public static boolean b(final Context context, final String s) {
        try {
            final String[] requestedPermissions = a(context).requestedPermissions;
            if (requestedPermissions != null) {
                for (int length = requestedPermissions.length, i = 0; i < length; ++i) {
                    if (requestedPermissions[i].equals((Object)s)) {
                        return true;
                    }
                }
                return false;
            }
        }
        catch (final Exception ex) {
            ((Throwable)ex).printStackTrace();
        }
        return false;
    }
}
