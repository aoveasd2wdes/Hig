package p3;

import android.util.Log;
import java.util.concurrent.CountDownLatch;
import h2.z;
import android.os.Looper;
import android.os.Handler;
import h2.c0;

class p2 implements c0
{
    protected final String b;
    protected final x$c c;
    protected final Handler d;
    
    p2(final x$c c, final String b) {
        this.d = new Handler(Looper.getMainLooper());
        this.b = b;
        this.c = c;
    }
    
    public z a(final int n, final int n2, final int n3) {
        return new a(n, n2, n3).d();
    }
    
    private final class a implements x$z0
    {
        private final CountDownLatch a;
        private final int b;
        private final int c;
        private final int d;
        private x$v0 e;
        final p2 f;
        
        a(final p2 f, final int b, final int c, final int d) {
            this.f = f;
            this.a = new CountDownLatch(1);
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public void b(final Throwable t) {
            StringBuilder sb;
            Object f;
            if (t instanceof x$a) {
                final x$a x$a = (x$a)t;
                sb = new StringBuilder();
                sb.append("Can't get tile: errorCode = ");
                sb.append(x$a.e);
                sb.append(", errorMessage = ");
                sb.append(((Throwable)x$a).getMessage());
                sb.append(", date = ");
                f = x$a.f;
            }
            else {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't get tile: ");
                f = t;
                sb = sb2;
            }
            sb.append(f);
            Log.e("TileProviderController", sb.toString());
            this.e = null;
            this.a.countDown();
        }
        
        z d() {
            this.f.d.post((Runnable)new o2(this, new x$r0$a().b(Long.valueOf((long)this.b)).c(Long.valueOf((long)this.c)).a()));
            try {
                this.a.await();
                try {
                    final x$v0 e = this.e;
                    if (e == null) {
                        Log.e("TileProviderController", String.format("Did not receive tile data for tile: x = %d, y= %d, zoom = %d", new Object[] { this.b, this.c, this.d }));
                        return c0.a;
                    }
                    return p3.f.B(e);
                }
                catch (final Exception ex) {
                    Log.e("TileProviderController", "Can't parse tile data", (Throwable)ex);
                }
                return c0.a;
            }
            catch (final InterruptedException ex2) {
                Log.e("TileProviderController", String.format("countDownLatch: can't get tile: x = %d, y= %d, zoom = %d", new Object[] { this.b, this.c, this.d }), (Throwable)ex2);
                return c0.a;
            }
        }
        
        public void f(final x$v0 e) {
            this.e = e;
            this.a.countDown();
        }
    }
}
