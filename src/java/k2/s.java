package k2;

import java.util.ArrayDeque;
import java.util.Queue;

final class s
{
    private final Object a;
    private Queue b;
    private boolean c;
    
    s() {
        this.a = new Object();
    }
    
    public final void a(final r r) {
        final Object a = this.a;
        synchronized (a) {
            if (this.b == null) {
                this.b = (Queue)new ArrayDeque();
            }
            this.b.add((Object)r);
        }
    }
    
    public final void b(final g g) {
        final Object a = this.a;
        synchronized (a) {
            if (this.b != null) {
                if (!this.c) {
                    this.c = true;
                    monitorexit(a);
                    while (true) {
                        synchronized (this.a) {
                            final r r = (r)this.b.poll();
                            if (r == null) {
                                this.c = false;
                                return;
                            }
                            monitorexit(a);
                            r.a(g);
                            continue;
                        }
                        break;
                    }
                }
            }
        }
    }
}
