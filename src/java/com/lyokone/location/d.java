package com.lyokone.location;

import android.util.Log;
import k3.c;
import k3.d$b;
import k3.d$d;

class d implements d$d
{
    private a a;
    private k3.d b;
    
    public void a(final Object o) {
        final a a = this.a;
        a.d.e(a.h);
        this.a.o = null;
    }
    
    public void b(final Object o, final d$b o2) {
        final a a = this.a;
        a.o = o2;
        if (a.c == null) {
            o2.b("NO_ACTIVITY", (String)null, (Object)null);
            return;
        }
        if (!a.j()) {
            this.a.s();
            return;
        }
        this.a.x();
    }
    
    void c(final a a) {
        this.a = a;
    }
    
    void d(final c c) {
        if (this.b != null) {
            Log.wtf("StreamHandlerImpl", "Setting a method call handler before the last was disposed.");
            this.e();
        }
        (this.b = new k3.d(c, "lyokone/locationstream")).d((d$d)this);
    }
    
    void e() {
        final k3.d b = this.b;
        if (b == null) {
            Log.d("StreamHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        b.d((d$d)null);
        this.b = null;
    }
}
