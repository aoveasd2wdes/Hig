package p4;

import java.util.Iterator;
import i4.l;
import h4.p;
import o4.b;

final class e implements b
{
    private final CharSequence a;
    private final int b;
    private final int c;
    private final p d;
    
    public e(final CharSequence a, final int b, final int c, final p d) {
        l.e((Object)a, "input");
        l.e((Object)d, "getNextMatch");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public Iterator iterator() {
        return (Iterator)new e$a(this);
    }
}
