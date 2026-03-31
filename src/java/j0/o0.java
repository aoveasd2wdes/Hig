package j0;

import android.util.Log;
import java.io.Writer;

final class o0 extends Writer
{
    private final String e;
    private StringBuilder f;
    
    o0(final String e) {
        this.f = new StringBuilder(128);
        this.e = e;
    }
    
    private void a() {
        if (this.f.length() > 0) {
            Log.d(this.e, this.f.toString());
            final StringBuilder f = this.f;
            f.delete(0, f.length());
        }
    }
    
    public void close() {
        this.a();
    }
    
    public void flush() {
        this.a();
    }
    
    public void write(final char[] array, final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            final char c = array[n + i];
            if (c == '\n') {
                this.a();
            }
            else {
                this.f.append(c);
            }
        }
    }
}
