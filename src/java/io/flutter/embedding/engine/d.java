package io.flutter.embedding.engine;

import b3.a$b;
import io.flutter.plugin.platform.z;
import a3.a;
import java.util.ArrayList;
import android.content.Context;
import java.util.List;

public class d
{
    final List a;
    
    public d(final Context context, final String[] array) {
        this.a = (List)new ArrayList();
        final d3.d c = a3.a.e().c();
        if (!c.l()) {
            c.n(context.getApplicationContext());
            c.f(context.getApplicationContext(), array);
        }
    }
    
    public io.flutter.embedding.engine.a a(final b b) {
        final Context b2 = b.b();
        final a$b c = b.c();
        final String e = b.e();
        final List d = b.d();
        z f = b.f();
        if (f == null) {
            f = new z();
        }
        final boolean a = b.a();
        final boolean g = b.g();
        a$b a2;
        if (c == null) {
            a2 = a$b.a();
        }
        else {
            a2 = c;
        }
        io.flutter.embedding.engine.a a3;
        if (this.a.size() == 0) {
            final io.flutter.embedding.engine.a b3 = this.b(b2, f, a, g);
            if (e != null) {
                b3.o().c(e);
            }
            b3.k().i(a2, d);
            a3 = b3;
        }
        else {
            a3 = ((io.flutter.embedding.engine.a)this.a.get(0)).A(b2, a2, e, d, f, a, g);
        }
        this.a.add((Object)a3);
        a3.e((io.flutter.embedding.engine.a.b)new d$a(this, a3));
        return a3;
    }
    
    io.flutter.embedding.engine.a b(final Context context, final z z, final boolean b, final boolean b2) {
        return new io.flutter.embedding.engine.a(context, (d3.d)null, (FlutterJNI)null, z, (String[])null, b, b2, this);
    }
    
    public static class b
    {
        private Context a;
        private a$b b;
        private String c;
        private List d;
        private z e;
        private boolean f;
        private boolean g;
        
        public b(final Context a) {
            this.f = true;
            this.g = false;
            this.a = a;
        }
        
        public boolean a() {
            return this.f;
        }
        
        public Context b() {
            return this.a;
        }
        
        public a$b c() {
            return this.b;
        }
        
        public List d() {
            return this.d;
        }
        
        public String e() {
            return this.c;
        }
        
        public z f() {
            return this.e;
        }
        
        public boolean g() {
            return this.g;
        }
        
        public b h(final boolean f) {
            this.f = f;
            return this;
        }
        
        public b i(final a$b b) {
            this.b = b;
            return this;
        }
        
        public b j(final List d) {
            this.d = d;
            return this;
        }
        
        public b k(final String c) {
            this.c = c;
            return this;
        }
        
        public b l(final boolean g) {
            this.g = g;
            return this;
        }
    }
}
