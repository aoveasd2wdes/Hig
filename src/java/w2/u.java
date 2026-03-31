package w2;

import android.os.Handler;
import android.os.HandlerThread;

class u implements q
{
    final String a;
    final int b;
    private HandlerThread c;
    private Handler d;
    
    u(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public void a(final m m) {
        this.d.post(m.b);
    }
    
    public void b() {
        final HandlerThread c = this.c;
        if (c != null) {
            c.quit();
            this.c = null;
            this.d = null;
        }
    }
    
    public void start() {
        ((Thread)(this.c = new HandlerThread(this.a, this.b))).start();
        this.d = new Handler(this.c.getLooper());
    }
}
