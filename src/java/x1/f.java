package x1;

import java.util.AbstractCollection;
import java.util.Iterator;
import android.os.Bundle;

final class f implements e
{
    final a a;
    
    f(final a a) {
        this.a = a;
    }
    
    public final void a(final c c) {
        x1.a.l(this.a, c);
        final Iterator iterator = ((AbstractCollection)x1.a.k(this.a)).iterator();
        while (iterator.hasNext()) {
            ((k)iterator.next()).a(x1.a.j(this.a));
        }
        x1.a.k(this.a).clear();
        x1.a.m(this.a, (Bundle)null);
    }
}
