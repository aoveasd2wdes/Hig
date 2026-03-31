package i4;

import java.io.Serializable;

public abstract class m implements h, Serializable
{
    private final int e;
    
    public m(final int e) {
        this.e = e;
    }
    
    public int f() {
        return this.e;
    }
    
    @Override
    public String toString() {
        final String g = x.g(this);
        l.d((Object)g, "renderLambdaToString(...)");
        return g;
    }
}
