package d0;

import h4.p;
import y3.g$c;
import y3.g$b$a;
import i4.l;
import y3.g;

public final class a0 implements b
{
    public static final a0.a0$a g;
    private static final String h;
    private final a0 e;
    private final j f;
    
    static {
        g = new a0.a0$a((i4.g)null);
        h = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";
    }
    
    public a0(final a0 e, final j f) {
        l.e((Object)f, "instance");
        this.e = e;
        this.f = f;
    }
    
    public g A(final g g) {
        return g$b$a.d((b)this, g);
    }
    
    @Override
    public b a(final g$c g$c) {
        return g$b$a.b((b)this, g$c);
    }
    
    public final void d(final h h) {
        l.e((Object)h, "candidate");
        if (this.f != h) {
            final a0 e = this.e;
            if (e != null) {
                e.d(h);
            }
            return;
        }
        throw new IllegalStateException(a0.h.toString());
    }
    
    @Override
    public g$c getKey() {
        return (g$c)a0$a$a.e;
    }
    
    public g h(final g$c g$c) {
        return g$b$a.c((b)this, g$c);
    }
    
    public Object j(final Object o, final p p2) {
        return g$b$a.a((b)this, o, p2);
    }
}
