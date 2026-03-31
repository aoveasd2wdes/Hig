package q1;

import p1.f;
import android.content.Intent;

final class b0 extends c0
{
    final Intent a;
    final f b;
    
    b0(final Intent a, final f b, final int n) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final Intent a = this.a;
        if (a != null) {
            this.b.startActivityForResult(a, 2);
        }
    }
}
