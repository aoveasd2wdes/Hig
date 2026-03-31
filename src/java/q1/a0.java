package q1;

import android.app.Activity;
import android.content.Intent;

final class a0 extends c0
{
    final Intent a;
    final Activity b;
    final int c;
    
    a0(final Intent a, final Activity b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        final Intent a = this.a;
        if (a != null) {
            this.b.startActivityForResult(a, this.c);
        }
    }
}
