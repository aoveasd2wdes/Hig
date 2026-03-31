package x0;

import java.util.concurrent.Executor;
import u4.e;
import android.app.Activity;
import i4.l;
import y0.f;

public final class a implements f
{
    private final f b;
    private final w0.a c;
    
    public a(final f f) {
        l.e((Object)f, "tracker");
        this(f, new w0.a());
    }
    
    private a(final f b, final w0.a c) {
        this.b = b;
        this.c = c;
    }
    
    public e a(final Activity activity) {
        l.e((Object)activity, "activity");
        return this.b.a(activity);
    }
    
    public final void b(final Activity activity, final Executor executor, final v.a a) {
        l.e((Object)activity, "activity");
        l.e((Object)executor, "executor");
        l.e((Object)a, "consumer");
        this.c.a(executor, a, this.b.a(activity));
    }
    
    public final void c(final v.a a) {
        l.e((Object)a, "consumer");
        this.c.b(a);
    }
}
