package y1;

import android.os.Process;

final class c extends Thread
{
    c(final ThreadGroup threadGroup, final String s) {
        super(threadGroup, "GmsDynamite");
    }
    
    public final void run() {
        Process.setThreadPriority(19);
        monitorenter(this);
        try {
            try {
                while (true) {
                    this.wait();
                }
            }
            finally {
                monitorexit(this);
            }
        }
        catch (final InterruptedException ex) {}
    }
}
