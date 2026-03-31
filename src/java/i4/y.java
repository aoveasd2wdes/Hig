package i4;

import n4.g;
import n4.f;
import n4.d;
import n4.b;
import n4.e;

public class y
{
    public e a(final i i) {
        return (e)i;
    }
    
    public b b(final Class clazz) {
        return (b)new i4.e(clazz);
    }
    
    public d c(final Class clazz, final String s) {
        return (d)new n(clazz, s);
    }
    
    public f d(final o o) {
        return (f)o;
    }
    
    public g e(final q q) {
        return (g)q;
    }
    
    public String f(final h h) {
        String s2;
        final String s = s2 = h.getClass().getGenericInterfaces()[0].toString();
        if (s.startsWith("kotlin.jvm.functions.")) {
            s2 = s.substring(21);
        }
        return s2;
    }
    
    public String g(final m m) {
        return this.f((h)m);
    }
}
