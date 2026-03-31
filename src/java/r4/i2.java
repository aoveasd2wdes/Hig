package r4;

import u3.q;

final class i2 implements Runnable
{
    private final g0 e;
    private final m f;
    
    public i2(final g0 e, final m f) {
        this.e = e;
        this.f = f;
    }
    
    public void run() {
        this.f.m(this.e, (Object)q.a);
    }
}
