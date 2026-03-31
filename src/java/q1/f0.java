package q1;

import o1.a$f;
import android.content.Context;
import n1.i;
import android.util.SparseIntArray;

public final class f0
{
    private final SparseIntArray a;
    private i b;
    
    public f0(final i b) {
        this.a = new SparseIntArray();
        o.h(b);
        this.b = b;
    }
    
    public final int a(final Context context, final int n) {
        return this.a.get(n, -1);
    }
    
    public final int b(final Context context, final a$f a$f) {
        o.h(context);
        o.h(a$f);
        final boolean o = a$f.o();
        final int n = 0;
        if (!o) {
            return 0;
        }
        final int p2 = a$f.p();
        int n2 = this.a(context, p2);
        if (n2 == -1) {
            while (true) {
                for (int i = 0; i < this.a.size(); ++i) {
                    final int key = this.a.keyAt(i);
                    if (key > p2 && this.a.get(key) == 0) {
                        n2 = n;
                        if (n2 == -1) {
                            n2 = this.b.g(context, p2);
                        }
                        this.a.put(p2, n2);
                        return n2;
                    }
                }
                n2 = -1;
                continue;
            }
        }
        return n2;
    }
    
    public final void c() {
        this.a.clear();
    }
}
