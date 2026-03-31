package n1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.AlertDialog$Builder;
import android.content.Context;
import android.os.Bundle;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;
import q1.o;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import android.app.DialogFragment;

public class b extends DialogFragment
{
    private Dialog c;
    private DialogInterface$OnCancelListener d;
    private Dialog e;
    
    public static b a(Dialog c, final DialogInterface$OnCancelListener d) {
        final b b = new b();
        c = (Dialog)o.i((Object)c, (Object)"Cannot display null dialog");
        c.setOnCancelListener((DialogInterface$OnCancelListener)null);
        c.setOnDismissListener((DialogInterface$OnDismissListener)null);
        b.c = c;
        if (d != null) {
            b.d = d;
        }
        return b;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        final DialogInterface$OnCancelListener d = this.d;
        if (d != null) {
            d.onCancel(dialogInterface);
        }
    }
    
    public Dialog onCreateDialog(final Bundle bundle) {
        Dialog dialog;
        if ((dialog = this.c) == null) {
            this.setShowsDialog(false);
            if (this.e == null) {
                this.e = (Dialog)new AlertDialog$Builder((Context)o.h((Object)((Fragment)this).getActivity())).create();
            }
            dialog = this.e;
        }
        return dialog;
    }
    
    public void show(final FragmentManager fragmentManager, final String s) {
        super.show(fragmentManager, s);
    }
}
