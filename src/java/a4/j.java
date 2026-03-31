package a4;

import y3.g;
import y3.h;
import y3.d;

public abstract class j extends a
{
    public j(final d d) {
        super(d);
        if (d != null && d.d() != h.e) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }
    
    public g d() {
        return (g)h.e;
    }
}
