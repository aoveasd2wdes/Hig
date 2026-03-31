package f3;

import io.flutter.embedding.engine.d;
import io.flutter.plugin.platform.n;
import io.flutter.view.TextureRegistry;
import k3.c;
import android.content.Context;

public interface a
{
    void g(final b p0);
    
    void k(final b p0);
    
    public interface a
    {
    }
    
    public static class b
    {
        private final Context a;
        private final a b;
        private final c c;
        private final TextureRegistry d;
        private final n e;
        private final a f;
        private final d g;
        
        public b(final Context a, final a b, final c c, final TextureRegistry d, final n e, final a f, final d g) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
        
        public Context a() {
            return this.a;
        }
        
        public c b() {
            return this.c;
        }
        
        public n c() {
            return this.e;
        }
    }
}
