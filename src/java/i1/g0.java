package i1;

import java.util.Map;

public class g0
{
    private final o a;
    private final long b;
    private final long c;
    private final boolean d;
    
    private g0(final o a, final long b, final long c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static g0 e(final Map map) {
        if (map == null) {
            return new g0(o.i, 0L, 5000L, false);
        }
        final Integer n = (Integer)map.get((Object)"accuracy");
        final Integer n2 = (Integer)map.get((Object)"distanceFilter");
        final Integer n3 = (Integer)map.get((Object)"timeInterval");
        final Boolean b = (Boolean)map.get((Object)"useMSLAltitude");
        o o = i1.o.i;
        if (n != null) {
            final int intValue = n;
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue != 5) {
                                o = o;
                            }
                            else {
                                o = i1.o.j;
                            }
                        }
                        else {
                            o = i1.o.h;
                        }
                    }
                    else {
                        o = i1.o.g;
                    }
                }
                else {
                    o = i1.o.f;
                }
            }
            else {
                o = i1.o.e;
            }
        }
        long n4;
        if (n2 != null) {
            n4 = n2;
        }
        else {
            n4 = 0L;
        }
        long n5;
        if (n3 != null) {
            n5 = n3;
        }
        else {
            n5 = 5000L;
        }
        return new g0(o, n4, n5, b != null && b);
    }
    
    public o a() {
        return this.a;
    }
    
    public long b() {
        return this.b;
    }
    
    public long c() {
        return this.c;
    }
    
    public boolean d() {
        return this.d;
    }
}
