package a4;

import y3.g;
import y3.d;

public final class c implements d
{
    public static final c e;
    
    static {
        e = new c();
    }
    
    private c() {
    }
    
    @Override
    public g d() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
    
    @Override
    public String toString() {
        return "This continuation is already complete";
    }
    
    @Override
    public void u(final Object o) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}
