package k0;

import i4.l;
import j0.o;

public final class a extends d
{
    private final String f;
    
    public a(final o o, final String f) {
        l.e((Object)o, "fragment");
        l.e((Object)f, "previousFragmentId");
        final StringBuilder sb = new StringBuilder();
        sb.append("Attempting to reuse fragment ");
        sb.append((Object)o);
        sb.append(" with previous ID ");
        sb.append(f);
        super(o, sb.toString());
        this.f = f;
    }
}
