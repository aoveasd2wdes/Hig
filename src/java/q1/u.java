package q1;

import android.os.BaseBundle;
import android.os.Bundle;
import o1.a$d;

public class u implements a$d
{
    public static final u c;
    private final String b = b;
    
    static {
        c = a().a();
    }
    
    public static u.u$a a() {
        return new u.u$a((x)null);
    }
    
    public final Bundle b() {
        final Bundle bundle = new Bundle();
        final String b = this.b;
        if (b != null) {
            ((BaseBundle)bundle).putString("api", b);
        }
        return bundle;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof u && n.a((Object)this.b, (Object)((u)o).b));
    }
    
    @Override
    public final int hashCode() {
        return n.b(new Object[] { this.b });
    }
}
