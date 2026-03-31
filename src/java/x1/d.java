package x1;

import java.lang.reflect.AccessibleObject;
import android.os.IInterface;
import java.lang.reflect.Field;
import android.os.IBinder;
import q1.o;

public final class d extends b$a
{
    private final Object b;
    
    private d(final Object b) {
        this.b = b;
    }
    
    public static Object W(final b b) {
        if (b instanceof d) {
            return ((d)b).b;
        }
        final IBinder binder = ((IInterface)b).asBinder();
        final Field[] declaredFields = binder.getClass().getDeclaredFields();
        final int length = declaredFields.length;
        int i = 0;
        Field field = null;
        int n = 0;
        while (i < length) {
            final Field field2 = declaredFields[i];
            int n2 = n;
            if (!field2.isSynthetic()) {
                n2 = n + 1;
                field = field2;
            }
            ++i;
            n = n2;
        }
        if (n == 1) {
            o.h((Object)field);
            if (!((AccessibleObject)field).isAccessible()) {
                ((AccessibleObject)field).setAccessible(true);
                try {
                    return field.get((Object)binder);
                }
                catch (final IllegalAccessException ex) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", (Throwable)ex);
                }
                catch (final NullPointerException ex2) {
                    throw new IllegalArgumentException("Binder object is null.", (Throwable)ex2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        final int length2 = declaredFields.length;
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected number of IObjectWrapper declared fields: ");
        sb.append(length2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static b u2(final Object o) {
        return (b)new d(o);
    }
}
