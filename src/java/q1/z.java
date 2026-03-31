package q1;

import n1.k;
import android.util.Log;
import u1.e;
import n1.n;
import android.content.res.Resources;
import m1.b;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import w1.d;
import android.content.Context;
import java.util.Locale;
import p.g;

public abstract class z
{
    private static final g a;
    private static Locale b;
    
    static {
        a = new g();
    }
    
    public static String a(final Context context) {
        final String packageName = context.getPackageName();
        try {
            return d.a(context).b(packageName).toString();
        }
        catch (final PackageManager$NameNotFoundException | NullPointerException ex) {
            final String name = context.getApplicationInfo().name;
            if (TextUtils.isEmpty((CharSequence)name)) {
                return packageName;
            }
            return name;
        }
    }
    
    public static String b(final Context context, int n) {
        final Resources resources = context.getResources();
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    n = 17039370;
                }
                else {
                    n = m1.b.a;
                }
            }
            else {
                n = m1.b.j;
            }
        }
        else {
            n = m1.b.d;
        }
        return resources.getString(n);
    }
    
    public static String c(final Context context, final int n) {
        final Resources resources = context.getResources();
        final String a = a(context);
        if (n == 1) {
            return resources.getString(m1.b.e, new Object[] { a });
        }
        if (n != 2) {
            if (n == 3) {
                return resources.getString(m1.b.b, new Object[] { a });
            }
            if (n == 5) {
                return g(context, "common_google_play_services_invalid_account_text", a);
            }
            if (n == 7) {
                return g(context, "common_google_play_services_network_error_text", a);
            }
            if (n == 9) {
                return resources.getString(m1.b.i, new Object[] { a });
            }
            if (n == 20) {
                return g(context, "common_google_play_services_restricted_profile_text", a);
            }
            switch (n) {
                default: {
                    return resources.getString(n.a, new Object[] { a });
                }
                case 18: {
                    return resources.getString(m1.b.m, new Object[] { a });
                }
                case 17: {
                    return g(context, "common_google_play_services_sign_in_failed_text", a);
                }
                case 16: {
                    return g(context, "common_google_play_services_api_unavailable_text", a);
                }
            }
        }
        else {
            if (e.c(context)) {
                return resources.getString(m1.b.n);
            }
            return resources.getString(m1.b.k, new Object[] { a });
        }
    }
    
    public static String d(final Context context, final int n) {
        if (n != 6 && n != 19) {
            return c(context, n);
        }
        return g(context, "common_google_play_services_resolution_required_text", a(context));
    }
    
    public static String e(final Context context, final int n) {
        String s;
        if (n == 6) {
            s = h(context, "common_google_play_services_resolution_required_title");
        }
        else {
            s = f(context, n);
        }
        if (s == null) {
            return context.getResources().getString(m1.b.h);
        }
        return s;
    }
    
    public static String f(final Context context, final int n) {
        final Resources resources = context.getResources();
        String string = null;
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unexpected error code ");
                sb.append(n);
                string = sb.toString();
                break;
            }
            case 20: {
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
            }
            case 17: {
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            }
            case 16: {
                string = "One of the API components you attempted to connect to is not available.";
                break;
            }
            case 11: {
                string = "The application is not licensed to the user.";
                break;
            }
            case 10: {
                string = "Developer error occurred. Please see logs for detailed information";
                break;
            }
            case 9: {
                string = "Google Play services is invalid. Cannot recover.";
                break;
            }
            case 8: {
                string = "Internal error occurred. Please see logs for detailed information";
                break;
            }
            case 7: {
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            }
            case 5: {
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            }
            case 4:
            case 6:
            case 18: {
                return null;
            }
            case 3: {
                return resources.getString(m1.b.c);
            }
            case 2: {
                return resources.getString(m1.b.l);
            }
            case 1: {
                return resources.getString(m1.b.f);
            }
        }
        Log.e("GoogleApiAvailability", string);
        return null;
    }
    
    private static String g(final Context context, String s, final String s2) {
        final Resources resources = context.getResources();
        String s3;
        s = (s3 = h(context, s));
        if (s == null) {
            s3 = resources.getString(n.a);
        }
        return String.format(resources.getConfiguration().locale, s3, new Object[] { s2 });
    }
    
    private static String h(final Context context, final String s) {
        final g a = z.a;
        synchronized (a) {
            final Locale c = androidx.core.os.b.a(context.getResources().getConfiguration()).c(0);
            if (!c.equals((Object)z.b)) {
                a.clear();
                z.b = c;
            }
            final String s2 = (String)a.get((Object)s);
            if (s2 != null) {
                return s2;
            }
            final Resources c2 = k.c(context);
            if (c2 == null) {
                return null;
            }
            final int identifier = c2.getIdentifier(s, "string", "com.google.android.gms");
            if (identifier == 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Missing resource: ");
                sb.append(s);
                Log.w("GoogleApiAvailability", sb.toString());
                return null;
            }
            final String string = c2.getString(identifier);
            if (TextUtils.isEmpty((CharSequence)string)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Got empty resource: ");
                sb2.append(s);
                Log.w("GoogleApiAvailability", sb2.toString());
                return null;
            }
            a.put((Object)s, (Object)string);
            return string;
        }
    }
}
