package j3;

import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import android.window.BackEvent;
import k3.l;
import k3.c;
import k3.p;
import b3.a;
import k3.k;

public class f
{
    public final k a;
    private final k.c b;
    
    public f(final a a) {
        final f$a b = new f$a(this);
        this.b = (k.c)b;
        (this.a = new k((c)a, "flutter/backgesture", (l)p.b)).e((k.c)b);
    }
    
    private Map a(final BackEvent backEvent) {
        final HashMap hashMap = new HashMap(3);
        final float a = j3.b.a(backEvent);
        final float a2 = j3.c.a(backEvent);
        List list;
        if (!Float.isNaN(a) && !Float.isNaN(a2)) {
            list = Arrays.asList((Object[])new Float[] { a, a2 });
        }
        else {
            list = null;
        }
        ((Map)hashMap).put((Object)"touchOffset", (Object)list);
        ((Map)hashMap).put((Object)"progress", (Object)d.a(backEvent));
        ((Map)hashMap).put((Object)"swipeEdge", (Object)e.a(backEvent));
        return (Map)hashMap;
    }
    
    public void b() {
        a3.b.f("BackGestureChannel", "Sending message to cancel back gesture");
        this.a.c("cancelBackGesture", null);
    }
    
    public void c() {
        a3.b.f("BackGestureChannel", "Sending message to commit back gesture");
        this.a.c("commitBackGesture", null);
    }
    
    public void d(final BackEvent backEvent) {
        a3.b.f("BackGestureChannel", "Sending message to start back gesture");
        this.a.c("startBackGesture", this.a(backEvent));
    }
    
    public void e(final BackEvent backEvent) {
        a3.b.f("BackGestureChannel", "Sending message to update back gesture progress");
        this.a.c("updateBackGestureProgress", this.a(backEvent));
    }
}
