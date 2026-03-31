package s3;

import java.util.Collection;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import android.util.Base64;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import i4.l;
import java.util.List;

public final class b implements d0
{
    public String a(final List list) {
        l.e((Object)list, "list");
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final ObjectOutputStream objectOutputStream = new ObjectOutputStream((OutputStream)byteArrayOutputStream);
        objectOutputStream.writeObject((Object)list);
        objectOutputStream.flush();
        final String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        l.d((Object)encodeToString, "encodeToString(byteStream.toByteArray(), 0)");
        return encodeToString;
    }
    
    public List b(final String s) {
        l.e((Object)s, "listString");
        final Object object = ((ObjectInputStream)new h0((InputStream)new ByteArrayInputStream(Base64.decode(s, 0)))).readObject();
        l.c(object, "null cannot be cast to non-null type kotlin.collections.List<*>");
        final List list = (List)object;
        final ArrayList list2 = new ArrayList();
        for (final Object next : list) {
            if (next instanceof String) {
                ((Collection)list2).add(next);
            }
        }
        return (List)list2;
    }
}
