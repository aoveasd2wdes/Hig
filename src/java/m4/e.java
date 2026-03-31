package m4;

import java.util.NoSuchElementException;
import v3.b0;

public final class e extends b0
{
    private final long e;
    private final long f;
    private boolean g;
    private long h;
    
    public e(long h, final long f, final long e) {
        this.e = e;
        this.f = f;
        boolean g = true;
        final long n = lcmp(h, f);
        Label_0049: {
            if (e > 0L) {
                if (n <= 0) {
                    break Label_0049;
                }
            }
            else if (n >= 0) {
                break Label_0049;
            }
            g = false;
        }
        this.g = g;
        if (!g) {
            h = f;
        }
        this.h = h;
    }
    
    public long b() {
        final long h = this.h;
        if (h == this.f) {
            if (!this.g) {
                throw new NoSuchElementException();
            }
            this.g = false;
        }
        else {
            this.h = this.e + h;
        }
        return h;
    }
    
    public boolean hasNext() {
        return this.g;
    }
}
