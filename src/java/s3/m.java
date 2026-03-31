package s3;

import java.io.ByteArrayOutputStream;
import java.util.List;
import i4.l;
import java.nio.ByteBuffer;
import k3.o;

class m extends o
{
    public m() {
    }
    
    protected Object g(final byte b, final ByteBuffer byteBuffer) {
        l.e((Object)byteBuffer, "buffer");
        if (b == -127) {
            final Object f = this.f(byteBuffer);
            final boolean b2 = f instanceof List;
            Object a = null;
            List list;
            if (b2) {
                list = (List)f;
            }
            else {
                list = null;
            }
            if (list != null) {
                a = e0.c.a(list);
            }
            return a;
        }
        return super.g(b, byteBuffer);
    }
    
    protected void p(final ByteArrayOutputStream byteArrayOutputStream, final Object o) {
        l.e((Object)byteArrayOutputStream, "stream");
        if (o instanceof e0) {
            byteArrayOutputStream.write(129);
            this.p(byteArrayOutputStream, ((e0)o).b());
        }
        else {
            super.p(byteArrayOutputStream, o);
        }
    }
}
