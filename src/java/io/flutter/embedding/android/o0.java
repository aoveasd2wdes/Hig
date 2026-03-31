package io.flutter.embedding.android;

import java.util.AbstractCollection;
import java.util.concurrent.atomic.AtomicLong;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import android.util.LongSparseArray;

public final class o0
{
    private static o0 c;
    private final LongSparseArray a;
    private final PriorityQueue b;
    
    private o0() {
        this.a = new LongSparseArray();
        this.b = new PriorityQueue();
    }
    
    public static o0 a() {
        if (o0.c == null) {
            o0.c = new o0();
        }
        return o0.c;
    }
    
    public MotionEvent b(final a a) {
        while (!((AbstractCollection)this.b).isEmpty() && (long)this.b.peek() < a.a) {
            this.a.remove((long)this.b.poll());
        }
        if (!((AbstractCollection)this.b).isEmpty() && (long)this.b.peek() == a.a) {
            this.b.poll();
        }
        final MotionEvent motionEvent = (MotionEvent)this.a.get(a.a);
        this.a.remove(a.a);
        return motionEvent;
    }
    
    public a c(MotionEvent obtain) {
        final a b = o0.a.b();
        obtain = MotionEvent.obtain(obtain);
        this.a.put(b.a, (Object)obtain);
        this.b.add((Object)b.a);
        return b;
    }
    
    public static class a
    {
        private static final AtomicLong b;
        private final long a;
        
        static {
            b = new AtomicLong(0L);
        }
        
        private a(final long a) {
            this.a = a;
        }
        
        public static a b() {
            return c(a.b.incrementAndGet());
        }
        
        public static a c(final long n) {
            return new a(n);
        }
        
        public long d() {
            return this.a;
        }
    }
}
