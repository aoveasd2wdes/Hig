package m4;

import java.util.NoSuchElementException;
import v3.a0;

public final class b extends a0
{
    private final int e;
    private final int f;
    private boolean g;
    private int h;
    
    public b(int h, final int f, final int e) {
        this.e = e;
        this.f = f;
        boolean g = true;
        Label_0040: {
            if (e > 0) {
                if (h <= f) {
                    break Label_0040;
                }
            }
            else if (h >= f) {
                break Label_0040;
            }
            g = false;
        }
        this.g = g;
        if (!g) {
            h = f;
        }
        this.h = h;
    }
    
    public int b() {
        final int h = this.h;
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
