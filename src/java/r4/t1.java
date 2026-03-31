package r4;

public class t1 extends y1 implements y
{
    private final boolean g;
    
    public t1(final q1 q1) {
        super(true);
        this.o0(q1);
        this.g = this.S0();
    }
    
    private final boolean S0() {
        final s k0 = this.k0();
        t t;
        if (k0 instanceof t) {
            t = (t)k0;
        }
        else {
            t = null;
        }
        if (t != null) {
            y1 y1;
            if ((y1 = t.z()) != null) {
                while (!y1.h0()) {
                    final s k2 = y1.k0();
                    t t2;
                    if (k2 instanceof t) {
                        t2 = (t)k2;
                    }
                    else {
                        t2 = null;
                    }
                    if (t2 == null || (y1 = t2.z()) == null) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean h0() {
        return this.g;
    }
    
    @Override
    public boolean i0() {
        return true;
    }
}
