package s3;

import java.util.Set;
import v3.i0;
import java.io.ObjectStreamClass;
import i4.l;
import java.io.InputStream;
import java.io.ObjectInputStream;

public final class h0 extends ObjectInputStream
{
    public h0(final InputStream inputStream) {
        l.e((Object)inputStream, "input");
        super(inputStream);
    }
    
    protected Class resolveClass(final ObjectStreamClass objectStreamClass) {
        final Set d = i0.d((Object[])new String[] { "java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;" });
        String name;
        if (objectStreamClass != null) {
            name = objectStreamClass.getName();
        }
        else {
            name = null;
        }
        if (name != null && !d.contains((Object)name)) {
            throw new ClassNotFoundException(objectStreamClass.getName());
        }
        return super.resolveClass(objectStreamClass);
    }
}
