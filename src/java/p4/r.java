package p4;

import java.util.NoSuchElementException;
import m4.g;
import i4.l;

abstract class r extends q
{
    public static final String e0(String substring, final int n) {
        i4.l.e((Object)substring, "<this>");
        if (n >= 0) {
            substring = substring.substring(g.c(n, substring.length()));
            i4.l.d((Object)substring, "substring(...)");
            return substring;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Requested character count ");
        sb.append(n);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static char f0(final CharSequence charSequence) {
        i4.l.e((Object)charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(p.x(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
