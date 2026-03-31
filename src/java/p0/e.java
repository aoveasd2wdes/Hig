package p0;

import i4.l;
import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.h$b;
import i4.g;

public final class e
{
    public static final a d;
    private final f a;
    private final d b;
    private boolean c;
    
    static {
        d = new a(null);
    }
    
    private e(final f a) {
        this.a = a;
        this.b = new d();
    }
    
    public static final e a(final f f) {
        return e.d.a(f);
    }
    
    public final d b() {
        return this.b;
    }
    
    public final void c() {
        final h a = ((androidx.lifecycle.l)this.a).a();
        if (a.b() == h$b.f) {
            a.a((k)new b(this.a));
            this.b.e(a);
            this.c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }
    
    public final void d(final Bundle bundle) {
        if (!this.c) {
            this.c();
        }
        final h a = ((androidx.lifecycle.l)this.a).a();
        if (a.b().b(h$b.h) ^ true) {
            this.b.f(bundle);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("performRestore cannot be called when owner is ");
        sb.append((Object)a.b());
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final void e(final Bundle bundle) {
        l.e((Object)bundle, "outBundle");
        this.b.g(bundle);
    }
    
    public static final class a
    {
        private a() {
        }
        
        public final e a(final f f) {
            l.e((Object)f, "owner");
            return new e(f, null);
        }
    }
}
