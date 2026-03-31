package u1;

import android.content.pm.PackageManager;
import android.content.Context;

public abstract class e
{
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;
    
    public static boolean a(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        if (e.d == null) {
            final boolean f = u1.f.f();
            boolean b = false;
            if (f) {
                b = b;
                if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                    b = true;
                }
            }
            e.d = b;
        }
        return e.d;
    }
    
    public static boolean b(final Context context) {
        return f(context.getPackageManager());
    }
    
    public static boolean c(final Context context) {
        return (b(context) && !f.e()) || (d(context) && (!f.f() || f.i()));
    }
    
    public static boolean d(final Context context) {
        if (e.b == null) {
            final boolean d = f.d();
            boolean b = false;
            if (d) {
                b = b;
                if (context.getPackageManager().hasSystemFeature("cn.google")) {
                    b = true;
                }
            }
            e.b = b;
        }
        return e.b;
    }
    
    public static boolean e(final Context context) {
        if (e.c == null) {
            final boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.type.iot");
            boolean b = true;
            if (!hasSystemFeature) {
                b = (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") && b);
            }
            e.c = b;
        }
        return e.c;
    }
    
    public static boolean f(final PackageManager packageManager) {
        if (e.a == null) {
            final boolean c = f.c();
            boolean b = false;
            if (c) {
                b = b;
                if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                    b = true;
                }
            }
            e.a = b;
        }
        return e.a;
    }
}
