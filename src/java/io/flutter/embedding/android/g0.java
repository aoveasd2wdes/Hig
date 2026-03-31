package io.flutter.embedding.android;

import j3.i$a;
import j3.i$b;
import android.view.KeyEvent;
import j3.i;

public class g0 implements m0$d
{
    private final i a;
    private final m0$b b;
    
    public g0(final i a) {
        this.b = new m0$b();
        this.a = a;
    }
    
    public void a(final KeyEvent keyEvent, final m0$d$a m0$d$a) {
        final int action = keyEvent.getAction();
        boolean b = false;
        if (action != 0 && action != 1) {
            m0$d$a.a(false);
            return;
        }
        final i$b i$b = new i$b(keyEvent, this.b.a(keyEvent.getUnicodeChar()));
        if (action != 0) {
            b = true;
        }
        this.a.e(i$b, b, (i$a)new f0(m0$d$a));
    }
}
