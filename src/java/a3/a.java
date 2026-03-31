package a3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import io.flutter.embedding.engine.FlutterJNI;
import d3.d;

public final class a
{
    private static a d;
    private static boolean e;
    private d a;
    private FlutterJNI.c b;
    private ExecutorService c;
    
    private a(final d a, final c3.a a2, final FlutterJNI.c b, final ExecutorService c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static a e() {
        a.e = true;
        if (a.d == null) {
            a.d = new b().a();
        }
        return a.d;
    }
    
    public c3.a a() {
        return null;
    }
    
    public ExecutorService b() {
        return this.c;
    }
    
    public d c() {
        return this.a;
    }
    
    public FlutterJNI.c d() {
        return this.b;
    }
    
    public static final class b
    {
        private d a;
        private FlutterJNI.c b;
        private ExecutorService c;
        
        private void b() {
            if (this.b == null) {
                this.b = new FlutterJNI.c();
            }
            if (this.c == null) {
                this.c = Executors.newCachedThreadPool((ThreadFactory)new a());
            }
            if (this.a == null) {
                this.a = new d(this.b.a(), this.c);
            }
        }
        
        public a3.a a() {
            this.b();
            return new a3.a(this.a, null, this.b, this.c, null);
        }
        
        private class a implements ThreadFactory
        {
            private int a;
            final b b;
            
            private a(final b b) {
                this.b = b;
                this.a = 0;
            }
            
            public Thread newThread(final Runnable runnable) {
                final Thread thread = new Thread(runnable);
                final StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                sb.append(this.a++);
                thread.setName(sb.toString());
                return thread;
            }
        }
    }
}
