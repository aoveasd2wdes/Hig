package j3;

import a3.b;
import java.util.Locale;
import k3.i;
import k3.c;
import k3.q;
import k3.a;

public class k
{
    private b a;
    private b b;
    private boolean c;
    private final a d;
    
    public k(final b3.a a) {
        this(new a((c)a, "flutter/lifecycle", (i)q.b));
    }
    
    public k(final a d) {
        this.a = null;
        this.b = null;
        this.c = true;
        this.d = d;
    }
    
    private void g(final b a, final boolean b) {
        final b a2 = this.a;
        if (a2 == a && b == this.c) {
            return;
        }
        if (a == null && a2 == null) {
            this.c = b;
            return;
        }
        final int n = k$a.a[a.ordinal()];
        b b2;
        if (n != 1) {
            if (n != 2 && n != 3 && n != 4 && n != 5) {
                b2 = null;
            }
            else {
                b2 = a;
            }
        }
        else if (b) {
            b2 = k.b.f;
        }
        else {
            b2 = k.b.g;
        }
        this.a = a;
        this.c = b;
        if (b2 == this.b) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("AppLifecycleState.");
        sb.append(b2.name().toLowerCase(Locale.ROOT));
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        sb2.append(string);
        sb2.append(" message.");
        b.f("LifecycleChannel", sb2.toString());
        this.d.c(string);
        this.b = b2;
    }
    
    public void a() {
        this.g(this.a, true);
    }
    
    public void b() {
        this.g(k.b.e, this.c);
    }
    
    public void c() {
        this.g(k.b.g, this.c);
    }
    
    public void d() {
        this.g(k.b.i, this.c);
    }
    
    public void e() {
        this.g(k.b.f, this.c);
    }
    
    public void f() {
        this.g(this.a, false);
    }
    
    private enum b
    {
        e("DETACHED", 0), 
        f("RESUMED", 1), 
        g("INACTIVE", 2), 
        h("HIDDEN", 3), 
        i("PAUSED", 4);
        
        private static final b[] j;
        
        static {
            j = a();
        }
        
        private b(final String s, final int n) {
        }
        
        private static /* synthetic */ b[] a() {
            return new b[] { b.e, b.f, b.g, b.h, b.i };
        }
    }
}
