package j3;

import java.nio.ByteBuffer;
import a3.b;
import k3.l;
import k3.c;
import k3.p;
import b3.a;
import k3.k;

public class q
{
    private final k a;
    private g b;
    private final k.c c;
    
    public q(final b3.a a) {
        final q$a c = new q$a(this);
        this.c = (k.c)c;
        (this.a = new k((k3.c)a, "flutter/platform_views", (l)p.b)).e((k.c)c);
    }
    
    private static String c(final Exception ex) {
        return a3.b.d((Throwable)ex);
    }
    
    public void d(final int n) {
        final k a = this.a;
        if (a == null) {
            return;
        }
        a.c("viewFocused", n);
    }
    
    public void e(final g b) {
        this.b = b;
    }
    
    public interface b
    {
        void a(final c p0);
    }
    
    public static class c
    {
        public final int a;
        public final int b;
        
        public c(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static class d
    {
        public final int a;
        public final String b;
        public final double c;
        public final double d;
        public final double e;
        public final double f;
        public final int g;
        public final a h;
        public final ByteBuffer i;
        
        public d(final int a, final String b, final double e, final double f, final double c, final double d, final int g, final a h, final ByteBuffer i) {
            this.a = a;
            this.b = b;
            this.e = e;
            this.f = f;
            this.c = c;
            this.d = d;
            this.g = g;
            this.h = h;
            this.i = i;
        }
        
        public enum a
        {
            e("TEXTURE_WITH_VIRTUAL_FALLBACK", 0), 
            f("TEXTURE_WITH_HYBRID_FALLBACK", 1), 
            g("HYBRID_ONLY", 2);
            
            private static final a[] h;
            
            static {
                h = a();
            }
            
            private a(final String s, final int n) {
            }
            
            private static /* synthetic */ a[] a() {
                return new a[] { a.e, a.f, a.g };
            }
        }
    }
    
    public static class e
    {
        public final int a;
        public final double b;
        public final double c;
        
        public e(final int a, final double b, final double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static class f
    {
        public final int a;
        public final Number b;
        public final Number c;
        public final int d;
        public final int e;
        public final Object f;
        public final Object g;
        public final int h;
        public final int i;
        public final float j;
        public final float k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final long p;
        
        public f(final int a, final Number b, final Number c, final int d, final int e, final Object f, final Object g, final int h, final int i, final float j, final float k, final int l, final int m, final int n, final int o, final long p16) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
            this.o = o;
            this.p = p16;
        }
    }
    
    public interface g
    {
        void a(final int p0);
        
        void b(final boolean p0);
        
        void c(final int p0, final double p1, final double p2);
        
        void d(final int p0, final int p1);
        
        long e(final d p0);
        
        void f(final d p0);
        
        void g(final f p0);
        
        void h(final int p0);
        
        void i(final e p0, final b p1);
    }
}
