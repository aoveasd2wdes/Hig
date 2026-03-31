package f0;

import d0.n;
import d0.x;
import b5.j0;
import u3.f;
import i4.l;
import java.util.LinkedHashSet;
import i4.g;
import u3.e;
import h4.a;
import h4.p;
import java.util.Set;
import d0.w;

public final class d implements w
{
    public static final d.d$b f;
    private static final Set g;
    private static final h h;
    private final b5.h a;
    private final c b;
    private final p c;
    private final a d;
    private final e e;
    
    static {
        f = new d.d$b((g)null);
        g = (Set)new LinkedHashSet();
        h = new h();
    }
    
    public d(final b5.h a, final c b, final p c, final a d) {
        l.e((Object)a, "fileSystem");
        l.e((Object)b, "serializer");
        l.e((Object)c, "coordinatorProducer");
        l.e((Object)d, "producePath");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = u3.f.a((a)new d$c(this));
    }
    
    private final j0 f() {
        return (j0)this.e.getValue();
    }
    
    public x a() {
        final String string = this.f().toString();
        final h h = f0.d.h;
        synchronized (h) {
            final Set g = f0.d.g;
            if (g.contains((Object)string) ^ true) {
                g.add((Object)string);
                monitorexit(h);
                return (x)new f0.e(this.a, this.f(), this.b, (n)this.c.j(this.f(), this.a), (a)new d$d(this));
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("There are multiple DataStores active for the same file: ");
            sb.append(string);
            sb.append(". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).");
            throw new IllegalStateException(sb.toString().toString());
        }
    }
}
