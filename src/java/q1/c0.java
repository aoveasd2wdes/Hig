package q1;

import android.content.ActivityNotFoundException;
import android.util.Log;
import android.os.Build;
import android.content.DialogInterface;
import p1.f;
import android.content.Intent;
import android.app.Activity;
import android.content.DialogInterface$OnClickListener;

public abstract class c0 implements DialogInterface$OnClickListener
{
    public static c0 b(final Activity activity, final Intent intent, final int n) {
        return (c0)new a0(intent, activity, n);
    }
    
    public static c0 c(final f f, final Intent intent, final int n) {
        return (c0)new b0(intent, f, 2);
    }
    
    protected abstract void a();
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        try {
            try {
                this.a();
            }
            finally {}
        }
        catch (final ActivityNotFoundException ex) {
            String s = "Failed to start resolution intent.";
            if (Build.FINGERPRINT.contains((CharSequence)"generic")) {
                s = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", s, (Throwable)ex);
        }
        dialogInterface.dismiss();
        return;
        dialogInterface.dismiss();
    }
}
