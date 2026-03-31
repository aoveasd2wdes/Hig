package k3;

import java.nio.Buffer;
import java.io.OutputStream;
import a3.b;
import java.nio.ByteOrder;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

public final class p implements l
{
    public static final p b;
    private final o a;
    
    static {
        b = new p(o.a);
    }
    
    public p(final o a) {
        this.a = a;
    }
    
    public ByteBuffer a(final Object o) {
        final o$a o$a = new o$a();
        ((OutputStream)o$a).write(0);
        this.a.p((ByteArrayOutputStream)o$a, o);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((ByteArrayOutputStream)o$a).size());
        allocateDirect.put(o$a.a(), 0, ((ByteArrayOutputStream)o$a).size());
        return allocateDirect;
    }
    
    public j b(final ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        final Object f = this.a.f(byteBuffer);
        final Object f2 = this.a.f(byteBuffer);
        if (f instanceof String && !((Buffer)byteBuffer).hasRemaining()) {
            return new j((String)f, f2);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }
    
    public Object c(final ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        final byte value = byteBuffer.get();
        if (value != 0) {
            if (value != 1) {
                throw new IllegalArgumentException("Envelope corrupted");
            }
        }
        else {
            final Object f = this.a.f(byteBuffer);
            if (!((Buffer)byteBuffer).hasRemaining()) {
                return f;
            }
        }
        final Object f2 = this.a.f(byteBuffer);
        final Object f3 = this.a.f(byteBuffer);
        final Object f4 = this.a.f(byteBuffer);
        if (f2 instanceof String && (f3 == null || f3 instanceof String) && !((Buffer)byteBuffer).hasRemaining()) {
            throw new e((String)f2, (String)f3, f4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
    
    public ByteBuffer d(final String s, final String s2, final Object o, final String s3) {
        final o$a o$a = new o$a();
        ((OutputStream)o$a).write(1);
        this.a.p((ByteArrayOutputStream)o$a, s);
        this.a.p((ByteArrayOutputStream)o$a, s2);
        if (o instanceof Throwable) {
            this.a.p((ByteArrayOutputStream)o$a, a3.b.d((Throwable)o));
        }
        else {
            this.a.p((ByteArrayOutputStream)o$a, o);
        }
        this.a.p((ByteArrayOutputStream)o$a, s3);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((ByteArrayOutputStream)o$a).size());
        allocateDirect.put(o$a.a(), 0, ((ByteArrayOutputStream)o$a).size());
        return allocateDirect;
    }
    
    public ByteBuffer e(final j j) {
        final o$a o$a = new o$a();
        this.a.p((ByteArrayOutputStream)o$a, j.a);
        this.a.p((ByteArrayOutputStream)o$a, j.b);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((ByteArrayOutputStream)o$a).size());
        allocateDirect.put(o$a.a(), 0, ((ByteArrayOutputStream)o$a).size());
        return allocateDirect;
    }
    
    public ByteBuffer f(final String s, final String s2, final Object o) {
        final o$a o$a = new o$a();
        ((OutputStream)o$a).write(1);
        this.a.p((ByteArrayOutputStream)o$a, s);
        this.a.p((ByteArrayOutputStream)o$a, s2);
        if (o instanceof Throwable) {
            this.a.p((ByteArrayOutputStream)o$a, a3.b.d((Throwable)o));
        }
        else {
            this.a.p((ByteArrayOutputStream)o$a, o);
        }
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((ByteArrayOutputStream)o$a).size());
        allocateDirect.put(o$a.a(), 0, ((ByteArrayOutputStream)o$a).size());
        return allocateDirect;
    }
}
