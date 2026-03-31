package k0;

import i4.l;
import j0.o;

public final class f extends d
{
    private final o f;
    private final int g;
    
    public f(final o o, final o f, final int g) {
        l.e((Object)o, "fragment");
        l.e((Object)f, "expectedParentFragment");
        final StringBuilder sb = new StringBuilder();
        sb.append("Attempting to nest fragment ");
        sb.append((Object)o);
        sb.append(" within the view of parent fragment ");
        sb.append((Object)f);
        sb.append(" via container with ID ");
        sb.append(g);
        sb.append(" without using parent's childFragmentManager");
        super(o, sb.toString());
        this.f = f;
        this.g = g;
    }
}
