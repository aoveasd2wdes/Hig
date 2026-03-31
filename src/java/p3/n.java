package p3;

import io.flutter.plugin.platform.m;
import f3.a$b;
import g3.c;
import androidx.lifecycle.h;
import f3.a;

public class n implements a, g3.a
{
    h c;
    
    public void c(final c c) {
        this.h(c);
    }
    
    public void e() {
        this.c = null;
    }
    
    public void g(final a$b a$b) {
        a$b.c().a("plugins.flutter.dev/google_maps_android", (m)new j(a$b.b(), a$b.a(), (s)new s(this) {
            final n a;
            
            public h a() {
                return this.a.c;
            }
        }));
    }
    
    public void h(final c c) {
        this.c = h3.a.a(c);
    }
    
    public void i() {
        this.e();
    }
    
    public void k(final a$b a$b) {
    }
}
