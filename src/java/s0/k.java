package s0;

import android.view.View;
import l.d;
import android.view.ViewGroup;

public abstract class k
{
    public static k a(final ViewGroup viewGroup) {
        d.a(((View)viewGroup).getTag(i.b));
        return null;
    }
    
    static void b(final ViewGroup viewGroup, final k k) {
        ((View)viewGroup).setTag(i.b, (Object)k);
    }
}
