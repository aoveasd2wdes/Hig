package k3;

import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONTokener;
import java.nio.ByteBuffer;

public final class f implements i
{
    public static final f a;
    
    static {
        a = new f();
    }
    
    private f() {
    }
    
    public Object a(final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            final JSONTokener jsonTokener = new JSONTokener(q.b.c(byteBuffer));
            final Object nextValue = jsonTokener.nextValue();
            if (!jsonTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        }
        catch (final JSONException ex) {
            throw new IllegalArgumentException("Invalid JSON", (Throwable)ex);
        }
    }
    
    public ByteBuffer b(final Object o) {
        if (o == null) {
            return null;
        }
        final Object a = h.a(o);
        q q;
        String s;
        if (a instanceof String) {
            q = k3.q.b;
            s = JSONObject.quote((String)a);
        }
        else {
            q = k3.q.b;
            s = a.toString();
        }
        return q.d(s);
    }
}
