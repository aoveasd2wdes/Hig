package p4;

import h4.l;

abstract class g
{
    public static void a(final Appendable appendable, Object p3, final l l) {
        i4.l.e((Object)appendable, "<this>");
        Object value = null;
        Label_0023: {
            if (l != null) {
                p3 = l.p(p3);
            }
            else if (p3 != null && !(p3 instanceof CharSequence)) {
                if (p3 instanceof Character) {
                    appendable.append((char)p3);
                    return;
                }
                value = String.valueOf(p3);
                break Label_0023;
            }
            value = p3;
        }
        appendable.append((CharSequence)value);
    }
}
