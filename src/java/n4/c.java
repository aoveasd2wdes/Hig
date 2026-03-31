package n4;

import i4.l;

public abstract class c
{
    public static final Object a(final b b, final Object o) {
        l.e((Object)b, "<this>");
        if (b.d(o)) {
            l.c(o, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return o;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Value cannot be cast to ");
        sb.append(b.a());
        throw new ClassCastException(sb.toString());
    }
}
