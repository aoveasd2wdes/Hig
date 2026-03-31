package x1;

import android.content.ActivityNotFoundException;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.content.Context;
import android.view.View$OnClickListener;

final class h implements View$OnClickListener
{
    final Context c;
    final Intent d;
    
    h(final Context c, final Intent d) {
        this.c = c;
        this.d = d;
    }
    
    public final void onClick(final View view) {
        try {
            this.c.startActivity(this.d);
        }
        catch (final ActivityNotFoundException ex) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", (Throwable)ex);
        }
    }
}
