package n1;

import android.os.Handler;
import com.google.android.gms.common.api.GoogleApiActivity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.res.Resources;
import i1.c;
import u1.f;
import u1.e;
import androidx.core.app.f$e;
import androidx.core.app.f$b;
import androidx.core.app.f$d;
import q1.o;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import z1.g;
import android.content.IntentFilter;
import p1.q;
import p1.p;
import android.app.AlertDialog;
import android.view.View;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.util.Log;
import q1.z;
import android.app.AlertDialog$Builder;
import android.util.TypedValue;
import android.content.DialogInterface$OnClickListener;
import q1.c0;
import android.app.Dialog;
import android.content.DialogInterface$OnCancelListener;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.Context;

public class h extends i
{
    public static final int d;
    private static final Object e;
    private static final h f;
    private String c;
    
    static {
        e = new Object();
        f = new h();
        d = i.a;
    }
    
    public static h l() {
        return h.f;
    }
    
    public Intent a(final Context context, final int n, final String s) {
        return super.a(context, n, s);
    }
    
    public PendingIntent b(final Context context, final int n, final int n2) {
        return super.b(context, n, n2);
    }
    
    public final String d(final int n) {
        return super.d(n);
    }
    
    public int f(final Context context) {
        return super.f(context);
    }
    
    public int g(final Context context, final int n) {
        return super.g(context, n);
    }
    
    public final boolean i(final int n) {
        return super.i(n);
    }
    
    public Dialog j(final Activity activity, final int n, final int n2, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        return this.o((Context)activity, n, c0.b(activity, this.a((Context)activity, n, "d"), n2), dialogInterface$OnCancelListener, null);
    }
    
    public PendingIntent k(final Context context, final a a) {
        if (a.d()) {
            return a.c();
        }
        return this.b(context, a.a(), 0);
    }
    
    public boolean m(final Activity activity, final int n, final int n2, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        final Dialog j = this.j(activity, n, n2, dialogInterface$OnCancelListener);
        if (j == null) {
            return false;
        }
        this.r(activity, j, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener);
        return true;
    }
    
    public void n(final Context context, final int n) {
        this.s(context, n, null, this.c(context, n, 0, "n"));
    }
    
    final Dialog o(final Context context, final int n, final c0 c0, final DialogInterface$OnCancelListener onCancelListener, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        AlertDialog$Builder alertDialog$Builder = null;
        if (n == 0) {
            return null;
        }
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals((Object)context.getResources().getResourceEntryName(typedValue.resourceId))) {
            alertDialog$Builder = new AlertDialog$Builder(context, 5);
        }
        AlertDialog$Builder alertDialog$Builder2;
        if ((alertDialog$Builder2 = alertDialog$Builder) == null) {
            alertDialog$Builder2 = new AlertDialog$Builder(context);
        }
        alertDialog$Builder2.setMessage((CharSequence)z.c(context, n));
        if (onCancelListener != null) {
            alertDialog$Builder2.setOnCancelListener(onCancelListener);
        }
        final String b = z.b(context, n);
        if (b != null) {
            Object o;
            if ((o = c0) == null) {
                o = dialogInterface$OnClickListener;
            }
            alertDialog$Builder2.setPositiveButton((CharSequence)b, (DialogInterface$OnClickListener)o);
        }
        final String f = z.f(context, n);
        if (f != null) {
            alertDialog$Builder2.setTitle((CharSequence)f);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[] { n }), (Throwable)new IllegalArgumentException());
        return (Dialog)alertDialog$Builder2.create();
    }
    
    public final Dialog p(final Activity activity, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        final ProgressBar view = new ProgressBar((Context)activity, (AttributeSet)null, 16842874);
        view.setIndeterminate(true);
        ((View)view).setVisibility(0);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)activity);
        alertDialog$Builder.setView((View)view);
        alertDialog$Builder.setMessage((CharSequence)z.c((Context)activity, 18));
        alertDialog$Builder.setPositiveButton((CharSequence)"", (DialogInterface$OnClickListener)null);
        final AlertDialog create = alertDialog$Builder.create();
        this.r(activity, (Dialog)create, "GooglePlayServicesUpdatingDialog", dialogInterface$OnCancelListener);
        return (Dialog)create;
    }
    
    public final q q(final Context context, final p p2) {
        final IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        final q q = new q(p2);
        g.j(context, (BroadcastReceiver)q, intentFilter);
        q.a(context);
        if (!this.h(context, "com.google.android.gms")) {
            p2.a();
            q.b();
            return null;
        }
        return q;
    }
    
    final void r(final Activity activity, final Dialog dialog, final String s, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        b.a(dialog, dialogInterface$OnCancelListener).show(activity.getFragmentManager(), s);
    }
    
    final void s(final Context context, int n, String s, final PendingIntent pendingIntent) {
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[] { n, null }), (Throwable)new IllegalArgumentException());
        if (n == 18) {
            this.t(context);
            return;
        }
        if (pendingIntent == null) {
            if (n == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
            return;
        }
        final String e = z.e(context, n);
        final String d = z.d(context, n);
        final Resources resources = context.getResources();
        final NotificationManager notificationManager = (NotificationManager)o.h(context.getSystemService("notification"));
        final f$d q = new f$d(context).m(true).e(true).k((CharSequence)e).q((f$e)new f$b().h((CharSequence)d));
        if (u1.e.b(context)) {
            o.j(u1.f.c());
            q.p(context.getApplicationInfo().icon).o(2);
            if (u1.e.c(context)) {
                q.a(m1.a.a, (CharSequence)resources.getString(m1.b.o), pendingIntent);
            }
            else {
                q.i(pendingIntent);
            }
        }
        else {
            q.p(17301642).s((CharSequence)resources.getString(m1.b.h)).t(System.currentTimeMillis()).i(pendingIntent).j((CharSequence)d);
        }
        Label_0372: {
            if (!u1.f.f()) {
                break Label_0372;
            }
            o.j(u1.f.f());
            final Object e2 = h.e;
            synchronized (e2) {
                final String c = this.c;
                monitorexit(e2);
                s = c;
                if (c == null) {
                    final String s2 = "com.google.android.gms.availability";
                    final NotificationChannel a = n1.d.a(notificationManager, "com.google.android.gms.availability");
                    final String string = context.getResources().getString(m1.b.g);
                    if (a == null) {
                        n1.e.a(notificationManager, i1.c.a("com.google.android.gms.availability", (CharSequence)string, 4));
                        s = s2;
                    }
                    else {
                        s = s2;
                        if (!string.contentEquals(n1.f.a(a))) {
                            n1.g.a(a, (CharSequence)string);
                            n1.e.a(notificationManager, a);
                            s = s2;
                        }
                    }
                }
                q.f(s);
                final Notification b = q.b();
                if (n != 1 && n != 2 && n != 3) {
                    n = 39789;
                }
                else {
                    l.b.set(false);
                    n = 10436;
                }
                notificationManager.notify(n, b);
            }
        }
    }
    
    final void t(final Context context) {
        ((Handler)new n1.o(this, context)).sendEmptyMessageDelayed(1, 120000L);
    }
    
    public final boolean u(final Activity activity, final p1.f f, final int n, final int n2, final DialogInterface$OnCancelListener dialogInterface$OnCancelListener) {
        final Dialog o = this.o((Context)activity, n, c0.c(f, this.a((Context)activity, n, "d"), 2), dialogInterface$OnCancelListener, null);
        if (o == null) {
            return false;
        }
        this.r(activity, o, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener);
        return true;
    }
    
    public final boolean v(final Context context, final a a, final int n) {
        if (!w1.b.a(context)) {
            final PendingIntent k = this.k(context, a);
            if (k != null) {
                this.s(context, a.a(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, k, n, true), z1.h.a | 0x8000000));
                return true;
            }
        }
        return false;
    }
}
