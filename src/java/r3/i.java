package r3;

import java.util.List;
import android.util.Log;
import java.util.ArrayList;

public abstract class i
{
    protected static ArrayList a(final Throwable t) {
        final ArrayList list = new ArrayList(3);
        list.add((Object)t.toString());
        list.add((Object)t.getClass().getSimpleName());
        final StringBuilder sb = new StringBuilder();
        sb.append("Cause: ");
        sb.append((Object)t.getCause());
        sb.append(", Stacktrace: ");
        sb.append(Log.getStackTraceString(t));
        list.add((Object)sb.toString());
        return list;
    }
    
    public interface a
    {
        String a();
        
        String b();
        
        String c();
        
        List d();
        
        String e();
        
        String f();
        
        List h(final c p0);
    }
    
    public enum c
    {
        f("ROOT", 0, 0), 
        g("MUSIC", 1, 1), 
        h("PODCASTS", 2, 2), 
        i("RINGTONES", 3, 3), 
        j("ALARMS", 4, 4), 
        k("NOTIFICATIONS", 5, 5), 
        l("PICTURES", 6, 6), 
        m("MOVIES", 7, 7), 
        n("DOWNLOADS", 8, 8), 
        o("DCIM", 9, 9), 
        p("DOCUMENTS", 10, 10);
        
        private static final c[] q;
        final int e;
        
        static {
            q = a();
        }
        
        private c(final String s, final int n, final int e) {
            this.e = e;
        }
        
        private static /* synthetic */ c[] a() {
            return new c[] { c.f, c.g, c.h, c.i, c.j, c.k, c.l, c.m, c.n, c.o, c.p };
        }
    }
}
