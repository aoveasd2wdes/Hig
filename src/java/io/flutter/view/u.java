package io.flutter.view;

import android.view.Choreographer$FrameCallback;
import android.os.Handler;
import android.hardware.display.DisplayManager$DisplayListener;
import java.util.Objects;
import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI$b;
import io.flutter.embedding.engine.FlutterJNI;

public class u
{
    private static u e;
    private static b f;
    private long a;
    private FlutterJNI b;
    private c c;
    private final FlutterJNI$b d;
    
    private u(final FlutterJNI b) {
        this.a = -1L;
        this.c = new c(0L);
        this.d = (FlutterJNI$b)new u$a(this);
        this.b = b;
    }
    
    public static u f(final DisplayManager displayManager, final FlutterJNI flutterJNI) {
        if (u.e == null) {
            u.e = new u(flutterJNI);
        }
        if (u.f == null) {
            final u e = u.e;
            Objects.requireNonNull((Object)e);
            (u.f = e.new b(displayManager)).a();
        }
        if (u.e.a == -1L) {
            final float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            u.e.a = (long)(1.0E9 / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return u.e;
    }
    
    public void g() {
        this.b.setAsyncWaitForVsyncDelegate(this.d);
    }
    
    class b implements DisplayManager$DisplayListener
    {
        private DisplayManager a;
        final u b;
        
        b(final u b, final DisplayManager a) {
            this.b = b;
            this.a = a;
        }
        
        void a() {
            this.a.registerDisplayListener((DisplayManager$DisplayListener)this, (Handler)null);
        }
        
        public void onDisplayAdded(final int n) {
        }
        
        public void onDisplayChanged(final int n) {
            if (n == 0) {
                final float refreshRate = this.a.getDisplay(0).getRefreshRate();
                this.b.a = (long)(1.0E9 / refreshRate);
                this.b.b.setRefreshRateFPS(refreshRate);
            }
        }
        
        public void onDisplayRemoved(final int n) {
        }
    }
    
    private class c implements Choreographer$FrameCallback
    {
        private long a;
        final u b;
        
        c(final u b, final long a) {
            this.b = b;
            this.a = a;
        }
        
        public void doFrame(long n) {
            n = System.nanoTime() - n;
            if (n < 0L) {
                n = 0L;
            }
            this.b.b.onVsync(n, this.b.a, this.a);
            this.b.c = this;
        }
    }
}
