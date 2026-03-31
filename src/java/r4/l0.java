package r4;

import h4.l;
import x4.a;
import y3.f;
import x4.b;
import u3.i;
import y3.d;
import h4.p;

public enum l0
{
    e("DEFAULT", 0), 
    f("LAZY", 1), 
    g("ATOMIC", 2), 
    h("UNDISPATCHED", 3);
    
    private static final l0[] i;
    
    static {
        i = a();
    }
    
    private l0(final String s, final int n) {
    }
    
    private static final /* synthetic */ l0[] a() {
        return new l0[] { l0.e, l0.f, l0.g, l0.h };
    }
    
    public final void b(final p p3, final Object o, final d d) {
        final int n = a.a[this.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        throw new i();
                    }
                }
                else {
                    b.a(p3, o, d);
                }
            }
            else {
                y3.f.a(p3, o, d);
            }
        }
        else {
            x4.a.d(p3, o, d, (l)null, 4, (Object)null);
        }
    }
    
    public final boolean d() {
        return this == l0.f;
    }
}
