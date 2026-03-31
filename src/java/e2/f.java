package e2;

import b2.s;
import android.content.Context;
import android.app.Activity;
import b2.q;
import b2.p;
import b2.e;
import b2.i;
import o1.a;

public abstract class f
{
    public static final a a;
    public static final e2.a b;
    public static final c c;
    public static final k d;
    
    static {
        a = i.l;
        b = (e2.a)new e();
        c = (c)new p();
        d = (k)new q();
    }
    
    public static b a(final Activity activity) {
        return (b)new i(activity);
    }
    
    public static b b(final Context context) {
        return (b)new i(context);
    }
    
    public static l c(final Activity activity) {
        return (l)new s(activity);
    }
    
    public static l d(final Context context) {
        return (l)new s(context);
    }
}
