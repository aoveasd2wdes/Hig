package y0;

import i4.l;
import android.content.Context;
import h4.a;
import i4.x;
import u4.e;
import android.app.Activity;

public interface f
{
    public static final a a = f.a.a;
    
    e a(final Activity p0);
    
    public static final class a
    {
        static final a a;
        private static final boolean b = false;
        private static final String c;
        private static final u3.e d;
        private static g e;
        
        static {
            a = new a();
            c = x.b((Class)f.class).b();
            d = u3.f.a((h4.a)f$a$a.f);
            f.a.e = (g)y0.b.a;
        }
        
        private a() {
        }
        
        public final z0.a c() {
            return (z0.a)f.a.d.getValue();
        }
        
        public final f d(final Context context) {
            l.e((Object)context, "context");
            Object o;
            if ((o = this.c()) == null) {
                o = androidx.window.layout.adapter.sidecar.b.c.a(context);
            }
            return f.a.e.a((f)new i((m)p.b, (z0.a)o));
        }
    }
}
