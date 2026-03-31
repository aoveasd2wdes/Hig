package v3;

import java.util.List;
import java.util.Collection;
import i4.l;
import java.util.ArrayList;

abstract class n extends m
{
    public static ArrayList f(final Object... array) {
        l.e((Object)array, "elements");
        ArrayList list;
        if (array.length == 0) {
            list = new ArrayList();
        }
        else {
            list = new ArrayList((Collection)new d(array, true));
        }
        return list;
    }
    
    public static final Collection g(final Object[] array) {
        l.e((Object)array, "<this>");
        return (Collection)new d(array, false);
    }
    
    public static List h() {
        return (List)x.e;
    }
    
    public static int i(final List list) {
        l.e((Object)list, "<this>");
        return list.size() - 1;
    }
    
    public static List j(final Object... array) {
        l.e((Object)array, "elements");
        List list;
        if (array.length > 0) {
            list = f.c(array);
        }
        else {
            list = v3.l.h();
        }
        return list;
    }
    
    public static final List k(List list) {
        l.e((Object)list, "<this>");
        final int size = list.size();
        if (size != 0) {
            if (size == 1) {
                list = v3.l.d(list.get(0));
            }
        }
        else {
            list = v3.l.h();
        }
        return list;
    }
    
    public static void l() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
