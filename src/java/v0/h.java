package v0;

import i4.l;
import i4.g;

public abstract class h
{
    public static final a a;
    
    static {
        a = new a(null);
    }
    
    public abstract Object a();
    
    protected final String b(final Object o, final String s) {
        l.e(o, "value");
        l.e((Object)s, "message");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" value: ");
        sb.append(o);
        return sb.toString();
    }
    
    public abstract h c(final String p0, final h4.l p1);
    
    public static final class a
    {
        private a() {
        }
        
        public final h a(final Object o, final String s, final j j, final v0.g g) {
            l.e(o, "<this>");
            l.e((Object)s, "tag");
            l.e((Object)j, "verificationMode");
            l.e((Object)g, "logger");
            return (h)new i(o, s, j, g);
        }
    }
}
