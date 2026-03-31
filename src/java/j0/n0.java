package j0;

import p0.d;
import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.h$a;
import android.content.Context;
import androidx.lifecycle.z;
import androidx.lifecycle.e0$a;
import m0.b;
import android.app.Application;
import android.content.ContextWrapper;
import m0.a;
import androidx.lifecycle.h;
import p0.e;
import androidx.lifecycle.m;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import p0.f;
import androidx.lifecycle.g;

class n0 implements g, f, i0
{
    private final o c;
    private final h0 d;
    private final Runnable e;
    private m f;
    private e g;
    
    n0(final o c, final h0 d, final Runnable e) {
        this.f = null;
        this.g = null;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public h a() {
        this.e();
        return (h)this.f;
    }
    
    public a b() {
        while (true) {
            for (Context context = this.c.G0().getApplicationContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
                if (context instanceof Application) {
                    final Application application = (Application)context;
                    final b b = new b();
                    if (application != null) {
                        b.b(e0$a.d, application);
                    }
                    b.b(z.a, this.c);
                    b.b(z.b, this);
                    if (this.c.o() != null) {
                        b.b(z.c, this.c.o());
                    }
                    return b;
                }
            }
            final Application application = null;
            continue;
        }
    }
    
    void c(final h$a h$a) {
        this.f.h(h$a);
    }
    
    public h0 d() {
        this.e();
        return this.d;
    }
    
    void e() {
        if (this.f == null) {
            this.f = new m((l)this);
            (this.g = p0.e.a((f)this)).c();
            this.e.run();
        }
    }
    
    boolean f() {
        return this.f != null;
    }
    
    void g(final Bundle bundle) {
        this.g.d(bundle);
    }
    
    void h(final Bundle bundle) {
        this.g.e(bundle);
    }
    
    public d m() {
        this.e();
        return this.g.b();
    }
}
