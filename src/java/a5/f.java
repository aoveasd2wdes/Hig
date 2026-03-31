package a5;

import y3.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import w4.e0;

final class f extends e0
{
    private final AtomicReferenceArray i;
    
    public f(final long n, final f f, final int n2) {
        super(n, f, n2);
        this.i = new AtomicReferenceArray(e.f());
    }
    
    @Override
    public int n() {
        return e.f();
    }
    
    @Override
    public void o(final int n, final Throwable t, final g g) {
        this.r().set(n, (Object)e.c());
        this.p();
    }
    
    public final AtomicReferenceArray r() {
        return this.i;
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SemaphoreSegment[id=");
        sb.append(super.g);
        sb.append(", hashCode=");
        sb.append(this.hashCode());
        sb.append(']');
        return sb.toString();
    }
}
