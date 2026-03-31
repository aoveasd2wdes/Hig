package i4;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collection;

public abstract class f
{
    private static final Object[] a;
    
    static {
        a = new Object[0];
    }
    
    public static final Object[] a(final Collection collection) {
        l.e(collection, "collection");
        final int size = collection.size();
        if (size != 0) {
            final Iterator iterator = collection.iterator();
            if (iterator.hasNext()) {
                Object[] array = new Object[size];
                int n = 0;
                while (true) {
                    final int n2 = n + 1;
                    array[n] = iterator.next();
                    Object[] copy;
                    if (n2 >= array.length) {
                        if (!iterator.hasNext()) {
                            return array;
                        }
                        int n3;
                        if ((n3 = n2 * 3 + 1 >>> 1) <= n2) {
                            n3 = 2147483645;
                            if (n2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        copy = Arrays.copyOf(array, n3);
                        l.d(copy, "copyOf(...)");
                    }
                    else {
                        copy = array;
                        if (!iterator.hasNext()) {
                            array = Arrays.copyOf(array, n2);
                            l.d(array, "copyOf(...)");
                            return array;
                        }
                    }
                    n = n2;
                    array = copy;
                }
            }
        }
        return f.a;
    }
    
    public static final Object[] b(final Collection collection, final Object[] array) {
        l.e(collection, "collection");
        array.getClass();
        final int size = collection.size();
        int n = 0;
        Object[] copy;
        if (size == 0) {
            copy = array;
            if (array.length > 0) {
                array[0] = null;
                copy = array;
            }
        }
        else {
            final Iterator iterator = collection.iterator();
            if (!iterator.hasNext()) {
                copy = array;
                if (array.length > 0) {
                    array[0] = null;
                    copy = array;
                }
            }
            else {
                if (size <= array.length) {
                    copy = array;
                }
                else {
                    final Object instance = Array.newInstance((Class)array.getClass().getComponentType(), size);
                    l.c(instance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    copy = (Object[])instance;
                }
                while (true) {
                    final int n2 = n + 1;
                    copy[n] = iterator.next();
                    Object[] copy2;
                    if (n2 >= copy.length) {
                        if (!iterator.hasNext()) {
                            break;
                        }
                        int n3;
                        if ((n3 = n2 * 3 + 1 >>> 1) <= n2) {
                            n3 = 2147483645;
                            if (n2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        copy2 = Arrays.copyOf(copy, n3);
                        l.d(copy2, "copyOf(...)");
                    }
                    else {
                        copy2 = copy;
                        if (!iterator.hasNext()) {
                            if (copy == array) {
                                array[n2] = null;
                                copy = array;
                                break;
                            }
                            copy = Arrays.copyOf(copy, n2);
                            l.d(copy, "copyOf(...)");
                            break;
                        }
                    }
                    n = n2;
                    copy = copy2;
                }
            }
        }
        return copy;
    }
}
