package j3;

import java.util.Map;
import k3.l;
import k3.c;
import k3.p;
import b3.a;
import android.content.pm.PackageManager;
import k3.k;

public class r
{
    public final k a;
    public final PackageManager b;
    private b c;
    public final k.c d;
    
    public r(final a a, final PackageManager b) {
        final r$a d = new r$a(this);
        this.d = (k.c)d;
        this.b = b;
        (this.a = new k((c)a, "flutter/processtext", (l)p.b)).e((k.c)d);
    }
    
    public void b(final b c) {
        this.c = c;
    }
    
    public interface b
    {
        void b(final String p0, final String p1, final boolean p2, final k.d p3);
        
        Map d();
    }
}
