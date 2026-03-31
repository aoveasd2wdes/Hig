package j3;

import io.flutter.embedding.engine.FlutterJNI$a;
import io.flutter.view.k;
import k3.i;
import k3.c;
import k3.o;
import io.flutter.embedding.engine.FlutterJNI;

public class a
{
    public final k3.a a;
    public final FlutterJNI b;
    private a.a$b c;
    public final k3.a.d d;
    
    public a(final b3.a a, final FlutterJNI b) {
        final a$a d = new a$a(this);
        this.d = (k3.a.d)d;
        (this.a = new k3.a((c)a, "flutter/accessibility", (i)o.a)).e((k3.a.d)d);
        this.b = b;
    }
    
    public void b(final int n, final k.g g) {
        this.b.dispatchSemanticsAction(n, g);
    }
    
    public void c(final int n, final k.g g, final Object o) {
        this.b.dispatchSemanticsAction(n, g, o);
    }
    
    public void d() {
        this.b.setSemanticsEnabled(false);
    }
    
    public void e() {
        this.b.setSemanticsEnabled(true);
    }
    
    public void f(final int accessibilityFeatures) {
        this.b.setAccessibilityFeatures(accessibilityFeatures);
    }
    
    public void g(final a.a$b a$b) {
        this.c = a$b;
        this.b.setAccessibilityDelegate((FlutterJNI$a)a$b);
    }
}
