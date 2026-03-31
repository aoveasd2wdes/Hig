package v0;

import i4.l;

final class i extends h
{
    private final Object b;
    private final String c;
    private final j d;
    private final g e;
    
    public i(final Object b, final String c, final j d, final g e) {
        l.e(b, "value");
        l.e((Object)c, "tag");
        l.e((Object)d, "verificationMode");
        l.e((Object)e, "logger");
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public Object a() {
        return this.b;
    }
    
    public h c(final String s, final h4.l l) {
        l.e((Object)s, "message");
        l.e((Object)l, "condition");
        h h;
        if (l.p(this.b)) {
            h = this;
        }
        else {
            h = new f(this.b, this.c, s, this.e, this.d);
        }
        return h;
    }
}
