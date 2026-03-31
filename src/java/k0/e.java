package k0;

import i4.l;
import j0.o;
import android.view.ViewGroup;

public final class e extends d
{
    private final ViewGroup f;
    
    public e(final o o, final ViewGroup f) {
        l.e((Object)o, "fragment");
        l.e((Object)f, "container");
        final StringBuilder sb = new StringBuilder();
        sb.append("Attempting to add fragment ");
        sb.append((Object)o);
        sb.append(" to container ");
        sb.append((Object)f);
        sb.append(" which is not a FragmentContainerView");
        super(o, sb.toString());
        this.f = f;
    }
}
