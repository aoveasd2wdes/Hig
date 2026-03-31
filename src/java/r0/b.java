package r0;

import android.os.Trace;

abstract class b
{
    public static void a(final String s) {
        Trace.beginSection(s);
    }
    
    public static void b() {
        Trace.endSection();
    }
}
