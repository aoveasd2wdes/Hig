package q1;

import android.util.Log;
import android.app.PendingIntent;
import android.os.IInterface;
import n1.a;
import android.os.Message;
import android.os.Looper;
import a2.e;

final class s0 extends e
{
    final c b;
    
    public s0(final c b, final Looper looper) {
        this.b = b;
        super(looper);
    }
    
    private static final void a(final Message message) {
        final t0 t0 = (t0)message.obj;
        t0.b();
        t0.e();
    }
    
    private static final boolean b(final Message message) {
        final int what = message.what;
        return what == 2 || what == 1 || what == 7;
    }
    
    public final void handleMessage(final Message message) {
        if (this.b.C.get() != message.arg1) {
            if (b(message)) {
                a(message);
            }
            return;
        }
        final int what = message.what;
        if ((what == 1 || what == 7 || (what == 4 && !this.b.s()) || message.what == 5) && !this.b.a()) {
            a(message);
            return;
        }
        final int what2 = message.what;
        PendingIntent pendingIntent = null;
        if (what2 == 4) {
            c.X(this.b, new a(message.arg2));
            if (c.f0(this.b)) {
                final c b = this.b;
                if (!c.d0(b)) {
                    c.Z(b, 3, (IInterface)null);
                    return;
                }
            }
            final c b2 = this.b;
            a r;
            if (c.R(b2) != null) {
                r = c.R(b2);
            }
            else {
                r = new a(8);
            }
            this.b.p.c(r);
            this.b.K(r);
            return;
        }
        if (what2 == 5) {
            final c b3 = this.b;
            a r2;
            if (c.R(b3) != null) {
                r2 = c.R(b3);
            }
            else {
                r2 = new a(8);
            }
            this.b.p.c(r2);
            this.b.K(r2);
            return;
        }
        if (what2 == 3) {
            final Object obj = message.obj;
            if (obj instanceof PendingIntent) {
                pendingIntent = (PendingIntent)obj;
            }
            final a a = new a(message.arg2, pendingIntent);
            this.b.p.c(a);
            this.b.K(a);
            return;
        }
        if (what2 == 6) {
            c.Z(this.b, 5, (IInterface)null);
            final c b4 = this.b;
            if (c.S(b4) != null) {
                c.S(b4).G(message.arg2);
            }
            this.b.L(message.arg2);
            c.e0(this.b, 5, 1, (IInterface)null);
            return;
        }
        if (what2 == 2 && !this.b.c()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((t0)message.obj).c();
            return;
        }
        final int what3 = message.what;
        final StringBuilder sb = new StringBuilder();
        sb.append("Don't know how to handle message: ");
        sb.append(what3);
        Log.wtf("GmsClient", sb.toString(), (Throwable)new Exception());
    }
}
