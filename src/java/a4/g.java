package a4;

import java.lang.reflect.AccessibleObject;
import i4.l;
import java.lang.reflect.Field;

public abstract class g
{
    private static final void a(final int n, final int n2) {
        if (n2 <= n) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Debug metadata version mismatch. Expected: ");
        sb.append(n);
        sb.append(", got ");
        sb.append(n2);
        sb.append(". Please update the Kotlin standard library.");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    private static final f b(final a a) {
        return a.getClass().getAnnotation(f.class);
    }
    
    private static final int c(final a a) {
        int intValue;
        try {
            final Field declaredField = a.getClass().getDeclaredField("label");
            ((AccessibleObject)declaredField).setAccessible(true);
            final Object value = declaredField.get((Object)a);
            Integer n;
            if (value instanceof Integer) {
                n = (Integer)value;
            }
            else {
                n = null;
            }
            if (n != null) {
                intValue = n;
            }
            else {
                intValue = 0;
            }
            --intValue;
        }
        catch (final Exception ex) {
            intValue = -1;
        }
        return intValue;
    }
    
    public static final StackTraceElement d(final a a) {
        l.e(a, "<this>");
        final f b = b(a);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        final int c = c(a);
        int n;
        if (c < 0) {
            n = -1;
        }
        else {
            n = b.l()[c];
        }
        final String b2 = i.a.b(a);
        String s;
        if (b2 == null) {
            s = b.c();
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(b2);
            sb.append('/');
            sb.append(b.c());
            s = sb.toString();
        }
        return new StackTraceElement(s, b.m(), b.f(), n);
    }
}
