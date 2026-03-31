package v0;

import u3.q;
import n4.c;
import java.lang.reflect.Method;
import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import n4.b;
import i4.l;

public final class d
{
    private final ClassLoader a;
    
    public d(final ClassLoader a) {
        l.e((Object)a, "loader");
        this.a = a;
    }
    
    private final Object a(final n4.b b, final h4.l l) {
        final Object proxyInstance = Proxy.newProxyInstance(this.a, new Class[] { this.d() }, (InvocationHandler)new a(b, l));
        l.d(proxyInstance, "newProxyInstance(loader,\u2026onsumerClass()), handler)");
        return proxyInstance;
    }
    
    private final Class d() {
        final Class loadClass = this.a.loadClass("java.util.function.Consumer");
        l.d((Object)loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
    
    public final Class b() {
        Class d;
        try {
            d = this.d();
        }
        catch (final ClassNotFoundException ex) {
            d = null;
        }
        return d;
    }
    
    public final b c(final Object o, final n4.b b, final String name, final String name2, final Activity activity, final h4.l l) {
        l.e(o, "obj");
        l.e((Object)b, "clazz");
        l.e((Object)name, "addMethodName");
        l.e((Object)name2, "removeMethodName");
        l.e((Object)activity, "activity");
        l.e((Object)l, "consumer");
        final Object a = this.a(b, l);
        o.getClass().getMethod(name, Activity.class, this.d()).invoke(o, new Object[] { activity, a });
        return (b)new d$c(o.getClass().getMethod(name2, this.d()), o, a);
    }
    
    private static final class a implements InvocationHandler
    {
        private final n4.b a;
        private final h4.l b;
        
        public a(final n4.b a, final h4.l b) {
            l.e((Object)a, "clazz");
            l.e((Object)b, "consumer");
            this.a = a;
            this.b = b;
        }
        
        private final boolean b(final Method method, final Object[] array) {
            final boolean a = l.a((Object)method.getName(), (Object)"accept");
            boolean b = false;
            if (a) {
                final boolean b2 = array != null && array.length == 1;
                b = b;
                if (b2) {
                    b = true;
                }
            }
            return b;
        }
        
        private final boolean c(final Method method, final Object[] array) {
            final boolean a = l.a((Object)method.getName(), (Object)"equals");
            boolean b2;
            final boolean b = b2 = false;
            if (a) {
                b2 = b;
                if (method.getReturnType().equals(Boolean.TYPE)) {
                    final boolean b3 = array != null && array.length == 1;
                    b2 = b;
                    if (b3) {
                        b2 = true;
                    }
                }
            }
            return b2;
        }
        
        private final boolean d(final Method method, final Object[] array) {
            return l.a((Object)method.getName(), (Object)"hashCode") && method.getReturnType().equals(Integer.TYPE) && array == null;
        }
        
        private final boolean e(final Method method, final Object[] array) {
            return l.a((Object)method.getName(), (Object)"toString") && method.getReturnType().equals(String.class) && array == null;
        }
        
        public final void a(final Object o) {
            l.e(o, "parameter");
            this.b.p(o);
        }
        
        public Object invoke(Object o, final Method method, final Object[] array) {
            l.e(o, "obj");
            l.e((Object)method, "method");
            final boolean b = this.b(method, array);
            final Object o2 = null;
            final Object o3 = null;
            boolean b2 = false;
            Object o4;
            if (b) {
                final n4.b a = this.a;
                o = o3;
                if (array != null) {
                    o = array[0];
                }
                this.a(c.a(a, o));
                o4 = q.a;
            }
            else if (this.c(method, array)) {
                Object o5 = o2;
                if (array != null) {
                    o5 = array[0];
                }
                if (o == o5) {
                    b2 = true;
                }
                o4 = b2;
            }
            else if (this.d(method, array)) {
                o4 = this.b.hashCode();
            }
            else {
                if (!this.e(method, array)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected method call object:");
                    sb.append(o);
                    sb.append(", method: ");
                    sb.append((Object)method);
                    sb.append(", args: ");
                    sb.append((Object)array);
                    throw new UnsupportedOperationException(sb.toString());
                }
                o4 = this.b.toString();
            }
            return o4;
        }
    }
    
    public interface b
    {
        void a();
    }
}
