package v0;

import java.util.Collection;
import u3.i;

final class f extends h
{
    private final Object b;
    private final String c;
    private final String d;
    private final g e;
    private final j f;
    private final l g;
    
    public f(final Object b, final String c, final String d, final g e, final j f) {
        i4.l.e(b, "value");
        i4.l.e((Object)c, "tag");
        i4.l.e((Object)d, "message");
        i4.l.e((Object)e, "logger");
        i4.l.e((Object)f, "verificationMode");
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        final l g = new l(this.b(b, d));
        final StackTraceElement[] stackTrace = ((Throwable)g).getStackTrace();
        i4.l.d((Object)stackTrace, "stackTrace");
        ((Throwable)g).setStackTrace((StackTraceElement[])((Collection)v3.f.m((Object[])stackTrace, 2)).toArray((Object[])new StackTraceElement[0]));
        this.g = g;
    }
    
    public Object a() {
        final int n = v0.f.f$a.a[((Enum)this.f).ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new i();
                }
            }
            else {
                this.e.a(this.c, this.b(this.b, this.d));
            }
            return null;
        }
        throw this.g;
    }
    
    public h c(final String s, final h4.l l) {
        i4.l.e((Object)s, "message");
        i4.l.e((Object)l, "condition");
        return this;
    }
}
