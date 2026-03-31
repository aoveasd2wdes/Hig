package n1;

import android.os.BaseBundle;
import java.util.Iterator;
import android.content.pm.PackageInstaller$SessionInfo;
import android.os.Bundle;
import android.os.UserManager;
import u1.f;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import u1.h;
import q1.o;
import u1.e;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import q1.p0;
import android.util.Log;
import android.content.res.Resources;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class l
{
    public static final int a = 12451000;
    static final AtomicBoolean b;
    private static final AtomicBoolean c;
    
    static {
        b = new AtomicBoolean();
        c = new AtomicBoolean();
    }
    
    public static String a(final int n) {
        return n1.a.f(n);
    }
    
    public static Context b(Context packageContext) {
        try {
            packageContext = packageContext.createPackageContext("com.google.android.gms", 3);
            return packageContext;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public static Resources c(final Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public static int d(final Context context, int n) {
        try {
            context.getResources().getString(n.a);
        }
        finally {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals((Object)context.getPackageName())) {
            if (!l.c.get()) {
                final int a = p0.a(context);
                if (a == 0) {
                    throw new GooglePlayServicesMissingManifestValueException();
                }
                if (a != l.a) {
                    throw new GooglePlayServicesIncorrectManifestValueException(a);
                }
            }
        }
        final boolean c = e.c(context);
        final int n2 = 1;
        final boolean b = !c && !e.e(context);
        o.a(n >= 0);
        final String packageName = context.getPackageName();
        final PackageManager packageManager = context.getPackageManager();
        Label_0192: {
            while (true) {
                PackageInfo packageInfo = null;
                Block_9: {
                    if (!b) {
                        packageInfo = null;
                        break Block_9;
                    }
                    String s;
                    String s2;
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                        break Label_0192;
                    }
                    catch (final PackageManager$NameNotFoundException ex) {
                        s = String.valueOf((Object)packageName);
                        s2 = " requires the Google Play Store, but it is missing.";
                    }
                    Log.w("GooglePlayServicesUtil", s.concat(s2));
                    n = 9;
                    return n;
                }
                try {
                    final PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                    m.a(context);
                    if (!m.c(packageInfo2, true)) {
                        final String s = String.valueOf((Object)packageName);
                        final String s2 = " requires Google Play services, but their signature is invalid.";
                        continue;
                    }
                    if (b) {
                        o.h((Object)packageInfo);
                        if (!m.c(packageInfo, true)) {
                            final String s = String.valueOf((Object)packageName);
                            final String s2 = " requires Google Play Store, but its signature is invalid.";
                            continue;
                        }
                    }
                    if (b && packageInfo != null && !packageInfo.signatures[0].equals((Object)packageInfo2.signatures[0])) {
                        final String s = String.valueOf((Object)packageName);
                        final String s2 = " requires Google Play Store, but its signature doesn't match that of Google Play services.";
                        continue;
                    }
                    if (h.a(packageInfo2.versionCode) < h.a(n)) {
                        final int versionCode = packageInfo2.versionCode;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Google Play services out of date for ");
                        sb.append(packageName);
                        sb.append(".  Requires ");
                        sb.append(n);
                        sb.append(" but found ");
                        sb.append(versionCode);
                        Log.w("GooglePlayServicesUtil", sb.toString());
                        n = 2;
                    }
                    else {
                        ApplicationInfo applicationInfo;
                        if ((applicationInfo = packageInfo2.applicationInfo) == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            }
                            catch (final PackageManager$NameNotFoundException ex2) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf((Object)packageName).concat(" requires Google Play services, but they're missing when getting application info."), (Throwable)ex2);
                                n = n2;
                                return n;
                            }
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        n = 3;
                    }
                }
                catch (final PackageManager$NameNotFoundException ex3) {
                    Log.w("GooglePlayServicesUtil", String.valueOf((Object)packageName).concat(" requires Google Play services, but they are missing."));
                    n = n2;
                }
                break;
            }
        }
        return n;
    }
    
    public static boolean e(final Context context, final int n) {
        return n == 18 || (n == 1 && h(context, "com.google.android.gms"));
    }
    
    public static boolean f(final Context context) {
        if (f.b()) {
            final Object systemService = context.getSystemService("user");
            o.h(systemService);
            final Bundle applicationRestrictions = ((UserManager)systemService).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && "true".equals((Object)((BaseBundle)applicationRestrictions).getString("restricted_profile"))) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean g(final int n) {
        return n == 1 || n == 2 || n == 3 || n == 9;
    }
    
    static boolean h(final Context context, final String s) {
        final boolean equals = s.equals((Object)"com.google.android.gms");
        if (f.d()) {
            try {
                final Iterator iterator = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (iterator.hasNext()) {
                    if (s.equals((Object)((PackageInstaller$SessionInfo)iterator.next()).getAppPackageName())) {
                        return true;
                    }
                }
            }
            catch (final Exception ex) {
                return false;
            }
        }
        final PackageManager packageManager = context.getPackageManager();
        try {
            final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(s, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (applicationInfo.enabled && !f(context)) {
                return true;
            }
            return false;
        }
        catch (final PackageManager$NameNotFoundException ex2) {
            return false;
        }
    }
}
