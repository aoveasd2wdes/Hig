package z1;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.core.content.a;

public abstract class g extends a
{
    public static Intent j(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        if (e.a()) {
            int n;
            if (!e.a()) {
                n = 0;
            }
            else {
                n = 2;
            }
            return f.a(context, broadcastReceiver, intentFilter, n);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
