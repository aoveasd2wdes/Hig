package c4;

import v3.f;
import k4.b;
import k4.c;
import java.lang.reflect.Method;
import i4.l;

public abstract class a
{
    public void a(final Throwable t, final Throwable t2) {
        l.e(t, "cause");
        l.e(t2, "exception");
        final Method b = a.b;
        if (b != null) {
            b.invoke((Object)t, new Object[] { t2 });
        }
    }
    
    public c b() {
        return (c)new b();
    }
    
    private static final class a
    {
        public static final a a;
        public static final Method b;
        public static final Method c;
        
        static {
            a = new a();
            final Method[] methods = Throwable.class.getMethods();
            l.b(methods);
            final int length = methods.length;
            final int n = 0;
            int n2 = 0;
            Method method;
            Method b2;
            while (true) {
                method = null;
                if (n2 >= length) {
                    b2 = null;
                    break;
                }
                b2 = methods[n2];
                boolean b3 = false;
                Label_0091: {
                    if (l.a(b2.getName(), "addSuppressed")) {
                        final Class[] parameterTypes = b2.getParameterTypes();
                        l.d(parameterTypes, "getParameterTypes(...)");
                        if (l.a(f.u((Object[])parameterTypes), Throwable.class)) {
                            b3 = true;
                            break Label_0091;
                        }
                    }
                    b3 = false;
                }
                if (b3) {
                    break;
                }
                ++n2;
            }
            b = b2;
            final int length2 = methods.length;
            int n3 = n;
            Method c2;
            while (true) {
                c2 = method;
                if (n3 >= length2) {
                    break;
                }
                c2 = methods[n3];
                if (l.a(c2.getName(), "getSuppressed")) {
                    break;
                }
                ++n3;
            }
            c = c2;
        }
    }
}
