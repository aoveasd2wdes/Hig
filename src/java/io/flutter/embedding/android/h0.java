package io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public class h0
{
    long a;
    b b;
    long c;
    long d;
    boolean e;
    a f;
    String g;
    
    ByteBuffer a() {
        try {
            final String g = this.g;
            byte[] bytes;
            if (g == null) {
                bytes = null;
            }
            else {
                bytes = g.getBytes("UTF-8");
            }
            int length;
            if (bytes == null) {
                length = 0;
            }
            else {
                length = bytes.length;
            }
            final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong((long)length);
            allocateDirect.putLong(this.a);
            allocateDirect.putLong(this.b.b());
            allocateDirect.putLong(this.c);
            allocateDirect.putLong(this.d);
            long n;
            if (this.e) {
                n = 1L;
            }
            else {
                n = 0L;
            }
            allocateDirect.putLong(n);
            allocateDirect.putLong(this.f.b());
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        }
        catch (final UnsupportedEncodingException ex) {
            throw new AssertionError((Object)"UTF-8 not supported");
        }
    }
    
    public enum a
    {
        f("kKeyboard", 0, 0L), 
        g("kDirectionalPad", 1, 1L), 
        h("kGamepad", 2, 2L), 
        i("kJoystick", 3, 3L), 
        j("kHdmi", 4, 4L);
        
        private static final a[] k;
        private final long e;
        
        static {
            k = a();
        }
        
        private a(final String s, final int n, final long e) {
            this.e = e;
        }
        
        private static /* synthetic */ a[] a() {
            return new a[] { a.f, a.g, a.h, a.i, a.j };
        }
        
        public long b() {
            return this.e;
        }
    }
    
    public enum b
    {
        f("kDown", 0, 0L), 
        g("kUp", 1, 1L), 
        h("kRepeat", 2, 2L);
        
        private static final b[] i;
        private long e;
        
        static {
            i = a();
        }
        
        private b(final String s, final int n, final long e) {
            this.e = e;
        }
        
        private static /* synthetic */ b[] a() {
            return new b[] { b.f, b.g, b.h };
        }
        
        public long b() {
            return this.e;
        }
    }
}
