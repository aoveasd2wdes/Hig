package w2;

import android.os.Handler;
import android.os.HandlerThread;

class o
{
    private final String a;
    private final int b;
    private HandlerThread c;
    private Handler d;
    protected Runnable e;
    private m f;
    
    o(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    boolean b() {
        final m f = this.f;
        return f != null && f.b();
    }
    
    Integer d() {
        final m f = this.f;
        Integer a;
        if (f != null) {
            a = f.a();
        }
        else {
            a = null;
        }
        return a;
    }
    
    void e(final m m) {
        this.d.post((Runnable)new n(this, m));
    }
    
    void f() {
        synchronized (this) {
            final HandlerThread c = this.c;
            if (c != null) {
                c.quit();
                this.c = null;
                this.d = null;
            }
        }
    }
    
    void g(final Runnable e) {
        synchronized (this) {
            ((Thread)(this.c = new HandlerThread(this.a, this.b))).start();
            this.d = new Handler(this.c.getLooper());
            this.e = e;
        }
    }
    
    void h(final m f) {
        f.b.run();
        this.f = f;
        this.e.run();
    }
}
