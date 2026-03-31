package t;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutorService;
import v.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;

abstract class i
{
    static ThreadPoolExecutor a(final String s, final int n, final int n2) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long)n2, TimeUnit.MILLISECONDS, (BlockingQueue)new LinkedBlockingDeque(), (ThreadFactory)new a(s, n));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
    
    static void b(final Executor executor, final Callable callable, final v.a a) {
        executor.execute((Runnable)new b(t.b.a(), callable, a));
    }
    
    static Object c(final ExecutorService executorService, final Callable callable, final int n) {
        final Future submit = executorService.submit(callable);
        final long n2 = n;
        try {
            return submit.get(n2, TimeUnit.MILLISECONDS);
        }
        catch (final TimeoutException ex) {
            throw new InterruptedException("timeout");
        }
        catch (final InterruptedException ex2) {
            throw ex2;
        }
        catch (final ExecutionException ex3) {
            throw new RuntimeException((Throwable)ex3);
        }
    }
    
    private static class a implements ThreadFactory
    {
        private String a;
        private int b;
        
        a(final String a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        public Thread newThread(final Runnable runnable) {
            return new i.a.a(runnable, this.a, this.b);
        }
        
        private static class a extends Thread
        {
            private final int e;
            
            a(final Runnable runnable, final String s, final int e) {
                super(runnable, s);
                this.e = e;
            }
            
            public void run() {
                Process.setThreadPriority(this.e);
                super.run();
            }
        }
    }
    
    private static class b implements Runnable
    {
        private Callable e;
        private a f;
        private Handler g;
        
        b(final Handler g, final Callable e, final a f) {
            this.e = e;
            this.f = f;
            this.g = g;
        }
        
        public void run() {
            Object call;
            try {
                call = this.e.call();
            }
            catch (final Exception ex) {
                call = null;
            }
            this.g.post((Runnable)new Runnable(this, this.f, call) {
                final a e;
                final Object f;
                final b g;
                
                public void run() {
                    this.e.accept(this.f);
                }
            });
        }
    }
}
