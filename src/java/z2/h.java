package z2;

import f3.a$b;
import k3.d$d;
import k3.k$c;
import android.net.ConnectivityManager;
import android.content.Context;
import k3.c;
import k3.d;
import k3.k;
import f3.a;

public class h implements a
{
    private k c;
    private d d;
    private f e;
    
    private void a(final c c, final Context context) {
        this.c = new k(c, "dev.fluttercommunity.plus/connectivity");
        this.d = new d(c, "dev.fluttercommunity.plus/connectivity_status");
        final b b = new b((ConnectivityManager)context.getSystemService("connectivity"));
        final g g = new g(b);
        this.e = new f(context, b);
        this.c.e((k$c)g);
        this.d.d((d$d)this.e);
    }
    
    private void b() {
        this.c.e((k$c)null);
        this.d.d((d$d)null);
        this.e.a(null);
        this.c = null;
        this.d = null;
        this.e = null;
    }
    
    public void g(final a$b a$b) {
        this.a(a$b.b(), a$b.a());
    }
    
    public void k(final a$b a$b) {
        this.b();
    }
}
