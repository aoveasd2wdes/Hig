package b3;

import t3.f;
import java.util.List;
import k3.b;
import k3.c$c;
import k3.c$d;
import k3.q;
import k3.c$b;
import java.nio.ByteBuffer;
import k3.c$a;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import k3.c;

public class a implements k3.c
{
    private final FlutterJNI a;
    private final AssetManager b;
    private final b3.c c;
    private final k3.c d;
    private boolean e;
    private String f;
    private final c$a g;
    
    public a(final FlutterJNI a, final AssetManager b) {
        this.e = false;
        final c$a g = (c$a)new c$a() {
            final a a;
            
            public void a(final ByteBuffer byteBuffer, final c$b c$b) {
                this.a.f = q.b.c(byteBuffer);
                b3.a.g(this.a);
            }
        };
        this.g = (c$a)g;
        this.a = a;
        this.b = b;
        final b3.c c = new b3.c(a);
        (this.c = c).c("flutter/isolate", (c$a)g);
        this.d = (k3.c)new c(c);
        if (a.isAttached()) {
            this.e = true;
        }
    }
    
    static /* synthetic */ a.a$d g(final a a) {
        a.getClass();
        return null;
    }
    
    public c$c a(final c$d c$d) {
        return this.d.a(c$d);
    }
    
    public void b(final String s, final ByteBuffer byteBuffer) {
        this.d.b(s, byteBuffer);
    }
    
    public void c(final String s, final c$a c$a) {
        this.d.c(s, c$a);
    }
    
    public void e(final String s, final c$a c$a, final c$c c$c) {
        this.d.e(s, c$a, c$c);
    }
    
    public void h(final String s, final ByteBuffer byteBuffer, final c$b c$b) {
        this.d.h(s, byteBuffer, c$b);
    }
    
    public void i(final a.a$b a$b, final List list) {
        if (this.e) {
            a3.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        final f h = t3.f.h("DartExecutor#executeDartEntrypoint");
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append("Executing Dart entrypoint: ");
            sb.append((Object)a$b);
            a3.b.f("DartExecutor", sb.toString());
            this.a.runBundleAndSnapshotFromLibrary(a$b.a, a$b.c, a$b.b, this.b, list);
            this.e = true;
            if (h != null) {
                h.close();
            }
        }
        finally {
            if (h != null) {
                try {
                    h.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)a$b).addSuppressed(t);
                }
            }
        }
    }
    
    public boolean j() {
        return this.e;
    }
    
    public void k() {
        if (this.a.isAttached()) {
            this.a.notifyLowMemoryWarning();
        }
    }
    
    public void l() {
        a3.b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.a.setPlatformMessageHandler((b3.f)this.c);
    }
    
    public void m() {
        a3.b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.a.setPlatformMessageHandler((b3.f)null);
    }
    
    private static class c implements k3.c
    {
        private final b3.c a;
        
        private c(final b3.c a) {
            this.a = a;
        }
        
        public c$c a(final c$d c$d) {
            return this.a.a(c$d);
        }
        
        public void b(final String s, final ByteBuffer byteBuffer) {
            this.a.h(s, byteBuffer, null);
        }
        
        public void c(final String s, final c$a c$a) {
            this.a.c(s, c$a);
        }
        
        public void e(final String s, final c$a c$a, final c$c c$c) {
            this.a.e(s, c$a, c$c);
        }
        
        public void h(final String s, final ByteBuffer byteBuffer, final c$b c$b) {
            this.a.h(s, byteBuffer, c$b);
        }
    }
}
