package a4;

import i4.l;
import i4.x;
import i4.h;

public abstract class k extends d implements h
{
    private final int h;
    
    public k(final int h, final y3.d d) {
        super(d);
        this.h = h;
    }
    
    public int f() {
        return this.h;
    }
    
    public String toString() {
        String s;
        if (((a)this).q() == null) {
            s = x.f((h)this);
            l.d((Object)s, "renderLambdaToString(...)");
        }
        else {
            s = super.toString();
        }
        return s;
    }
}
