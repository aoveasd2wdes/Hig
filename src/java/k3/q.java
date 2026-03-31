package k3;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class q implements i
{
    private static final Charset a;
    public static final q b;
    
    static {
        a = Charset.forName("UTF8");
        b = new q();
    }
    
    private q() {
    }
    
    public String c(final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        final int remaining = ((Buffer)byteBuffer).remaining();
        int arrayOffset;
        byte[] array2;
        if (byteBuffer.hasArray()) {
            final byte[] array = byteBuffer.array();
            arrayOffset = byteBuffer.arrayOffset();
            array2 = array;
        }
        else {
            final byte[] array3 = new byte[remaining];
            byteBuffer.get(array3);
            arrayOffset = 0;
            array2 = array3;
        }
        return new String(array2, arrayOffset, remaining, q.a);
    }
    
    public ByteBuffer d(final String s) {
        if (s == null) {
            return null;
        }
        final byte[] bytes = s.getBytes(q.a);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
