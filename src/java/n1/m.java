package n1;

import android.content.pm.ApplicationInfo;
import android.content.pm.Signature;
import android.util.Log;
import android.content.pm.PackageInfo;
import q1.o;
import android.content.Context;

public class m
{
    private static m b;
    private final Context a;
    
    public m(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    public static m a(final Context context) {
        o.h((Object)context);
        synchronized (m.class) {
            if (m.b == null) {
                z.a(context);
                m.b = new m(context);
            }
            return m.b;
        }
    }
    
    static final v b(final PackageInfo packageInfo, final v... array) {
        final Signature[] signatures = packageInfo.signatures;
        if (signatures != null) {
            if (signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            final Signature[] signatures2 = packageInfo.signatures;
            int i = 0;
            final w w = new w(signatures2[0].toByteArray());
            while (i < array.length) {
                if (array[i].equals((Object)w)) {
                    return array[i];
                }
                ++i;
            }
        }
        return null;
    }
    
    public static final boolean c(final PackageInfo packageInfo, boolean b) {
        boolean b2 = b;
        PackageInfo packageInfo2 = null;
        Label_0075: {
            Label_0071: {
                if (b) {
                    if (packageInfo == null) {
                        packageInfo2 = null;
                        break Label_0075;
                    }
                    if (!"com.android.vending".equals((Object)packageInfo.packageName)) {
                        b2 = b;
                        if (!"com.google.android.gms".equals((Object)packageInfo.packageName)) {
                            break Label_0071;
                        }
                    }
                    final ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo != null && (applicationInfo.flags & 0x81) != 0x0) {
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                }
            }
            packageInfo2 = packageInfo;
            b = b2;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            v v;
            if (b) {
                v = b(packageInfo2, y.a);
            }
            else {
                v = b(packageInfo2, y.a[0]);
            }
            if (v != null) {
                return true;
            }
        }
        return false;
    }
}
