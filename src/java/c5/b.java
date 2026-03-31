package c5;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.io.IOException;
import v3.e;
import i4.l;
import b5.j0;
import b5.h;

public abstract class b
{
    public static final void a(final h h, final j0 j0, final boolean b) {
        l.e(h, "<this>");
        l.e(j0, "dir");
        final e e = new e();
        for (j0 m = j0; m != null && !h.g(m); m = m.m()) {
            e.j((Object)m);
        }
        if (b && e.isEmpty()) {
            final StringBuilder sb = new StringBuilder();
            sb.append((Object)j0);
            sb.append(" already exist.");
            throw new IOException(sb.toString());
        }
        final Iterator iterator = ((AbstractCollection)e).iterator();
        while (iterator.hasNext()) {
            h.c((j0)iterator.next());
        }
    }
    
    public static final boolean b(final h h, final j0 j0) {
        l.e(h, "<this>");
        l.e(j0, "path");
        return h.h(j0) != null;
    }
}
