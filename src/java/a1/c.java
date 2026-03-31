package a1;

import java.util.concurrent.Executor;
import android.content.Context;
import y0.j;
import i4.l;
import z0.a;

public final class c implements a
{
    private static final void d(final v.a a) {
        l.e((Object)a, "$callback");
        a.accept((Object)new j(v3.l.h()));
    }
    
    @Override
    public void a(final v.a a) {
        l.e((Object)a, "callback");
    }
    
    @Override
    public void b(final Context context, final Executor executor, final v.a a) {
        l.e((Object)context, "context");
        l.e((Object)executor, "executor");
        l.e((Object)a, "callback");
        executor.execute((Runnable)new b(a));
    }
}
