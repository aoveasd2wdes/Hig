package r0;

import android.os.Trace;

abstract class c
{
    public static void a(final String s, final int n) {
        Trace.beginAsyncSection(s, n);
    }
    
    public static void b(final String s, final int n) {
        Trace.endAsyncSection(s, n);
    }
    
    public static boolean c() {
        return Trace.isEnabled();
    }
}
