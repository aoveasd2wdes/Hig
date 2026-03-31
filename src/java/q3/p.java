package q3;

import android.content.pm.PackageManager$NameNotFoundException;
import java.util.Arrays;
import j1.d;
import android.os.Build$VERSION;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import e.b;
import e.e;

abstract class p
{
    static int a(final r.e e) {
        final Long c = e.c();
        int n2;
        final int n = n2 = b();
        if (c != null) {
            n2 = n;
            if (c < n) {
                n2 = o.a(c);
            }
        }
        return n2;
    }
    
    static int b() {
        if (e.b()) {
            return b.a();
        }
        return Integer.MAX_VALUE;
    }
    
    private static PackageInfo c(final PackageManager packageManager, final String s) {
        return packageManager.getPackageInfo(s, 4096);
    }
    
    private static boolean d(final Context context, final String s) {
        try {
            final PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo;
            if (Build$VERSION.SDK_INT >= 33) {
                packageInfo = j1.e.a(packageManager, context.getPackageName(), d.a(4096L));
            }
            else {
                packageInfo = c(packageManager, context.getPackageName());
            }
            return Arrays.asList((Object[])packageInfo.requestedPermissions).contains((Object)s);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            ((Throwable)ex).printStackTrace();
            return false;
        }
    }
    
    static boolean e(final Context context) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = true;
        if (sdk_INT < 23 || !d(context, "android.permission.CAMERA")) {
            b = false;
        }
        return b;
    }
}
