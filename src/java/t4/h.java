package t4;

import i4.g;

public abstract class h
{
    public static final b a;
    private static final c b;
    
    static {
        a = new b(null);
        b = new c();
    }
    
    public static final /* synthetic */ c a() {
        return h.b;
    }
    
    public static Object b(final Object o) {
        return o;
    }
    
    public static final Throwable c(final Object o) {
        final boolean b = o instanceof h$a;
        Throwable a = null;
        h$a h$a;
        if (b) {
            h$a = (h$a)o;
        }
        else {
            h$a = null;
        }
        if (h$a != null) {
            a = h$a.a;
        }
        return a;
    }
    
    public static final Object d(Object o) {
        if (o instanceof c) {
            o = null;
        }
        return o;
    }
    
    public static final boolean e(final Object o) {
        return o instanceof h$a;
    }
    
    public static final boolean f(final Object o) {
        return o instanceof c ^ true;
    }
    
    public static final class b
    {
        private b() {
        }
        
        public final Object a(final Throwable t) {
            return h.b(new h$a(t));
        }
        
        public final Object b() {
            return h.b(h.a());
        }
        
        public final Object c(final Object o) {
            return h.b(o);
        }
    }
    
    public static class c
    {
        @Override
        public String toString() {
            return "Failed";
        }
    }
}
