package w4;

import m4.g;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class c0
{
    private volatile AtomicReferenceArray<Object> array;
    
    public c0(final int n) {
        this.array = (AtomicReferenceArray<Object>)new AtomicReferenceArray(n);
    }
    
    public final int a() {
        return this.array.length();
    }
    
    public final Object b(final int n) {
        final AtomicReferenceArray<Object> array = this.array;
        Object value;
        if (n < array.length()) {
            value = array.get(n);
        }
        else {
            value = null;
        }
        return value;
    }
    
    public final void c(final int n, final Object o) {
        final AtomicReferenceArray<Object> array = this.array;
        final int length = array.length();
        if (n < length) {
            array.set(n, o);
            return;
        }
        final AtomicReferenceArray array2 = new AtomicReferenceArray(g.a(n + 1, length * 2));
        for (int i = 0; i < length; ++i) {
            array2.set(i, array.get(i));
        }
        array2.set(n, o);
        this.array = (AtomicReferenceArray<Object>)array2;
    }
}
