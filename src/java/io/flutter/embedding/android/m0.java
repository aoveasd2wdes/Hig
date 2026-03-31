package io.flutter.embedding.android;

import java.util.Map;
import a3.b;
import android.view.KeyEvent;
import j3.j;
import j3.i;
import java.util.HashSet;
import j3.j$b;
import io.flutter.plugin.editing.m$a;

public class m0 implements m$a, j$b
{
    protected final m0.m0$d[] a;
    private final HashSet b;
    private final m0.m0$e c;
    
    public m0(final m0.m0$e c) {
        this.b = new HashSet();
        this.c = c;
        this.a = new m0.m0$d[] { (m0.m0$d)new l0(c.getBinaryMessenger()), (m0.m0$d)new g0(new i(c.getBinaryMessenger())) };
        new j(c.getBinaryMessenger()).b((j$b)this);
    }
    
    private void e(final KeyEvent keyEvent) {
        final m0.m0$e c = this.c;
        if (c != null) {
            if (!c.b(keyEvent)) {
                this.b.add((Object)keyEvent);
                this.c.a(keyEvent);
                if (this.b.remove((Object)keyEvent)) {
                    a3.b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
                }
            }
        }
    }
    
    public Map a() {
        return ((l0)this.a[0]).h();
    }
    
    public boolean b(final KeyEvent keyEvent) {
        final boolean remove = this.b.remove((Object)keyEvent);
        int i = 0;
        if (remove) {
            return false;
        }
        if (this.a.length > 0) {
            final m0.m0$c m0$c = new m0.m0$c(this, keyEvent);
            for (m0.m0$d[] a = this.a; i < a.length; ++i) {
                a[i].a(keyEvent, m0$c.a());
            }
        }
        else {
            this.e(keyEvent);
        }
        return true;
    }
    
    public void d() {
        final int size = this.b.size();
        if (size > 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("A KeyboardManager was destroyed with ");
            sb.append(String.valueOf(size));
            sb.append(" unhandled redispatch event(s).");
            a3.b.g("KeyboardManager", sb.toString());
        }
    }
}
