package n1;

import android.util.Log;
import android.os.Message;
import android.os.Looper;
import android.content.Context;
import z1.i;

final class o extends i
{
    private final Context b;
    final h c;
    
    public o(final h c, final Context context) {
        this.c = c;
        Looper looper;
        if (Looper.myLooper() == null) {
            looper = Looper.getMainLooper();
        }
        else {
            looper = Looper.myLooper();
        }
        super(looper);
        this.b = context.getApplicationContext();
    }
    
    public final void handleMessage(final Message message) {
        final int what = message.what;
        if (what != 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Don't know how to handle this message: ");
            sb.append(what);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        final h c = this.c;
        final int f = c.f(this.b);
        if (c.i(f)) {
            this.c.n(this.b, f);
        }
    }
}
