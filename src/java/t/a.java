package t;

import android.graphics.Typeface;
import android.os.Handler;

class a
{
    private final h.c a;
    private final Handler b;
    
    a(final h.c a, final Handler b) {
        this.a = a;
        this.b = b;
    }
    
    private void a(final int n) {
        this.b.post((Runnable)new Runnable(this, this.a, n) {
            final h.c e;
            final int f;
            final a g;
            
            public void run() {
                this.e.a(this.f);
            }
        });
    }
    
    private void c(final Typeface typeface) {
        this.b.post((Runnable)new Runnable(this, this.a, typeface) {
            final h.c e;
            final Typeface f;
            final a g;
            
            public void run() {
                this.e.b(this.f);
            }
        });
    }
    
    void b(final g.e e) {
        if (e.a()) {
            this.c(e.a);
        }
        else {
            this.a(e.b);
        }
    }
}
