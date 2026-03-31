package q4;

import b4.b;
import java.util.concurrent.TimeUnit;
import b4.a;

public enum d
{
    f("NANOSECONDS", 0, TimeUnit.NANOSECONDS), 
    g("MICROSECONDS", 1, TimeUnit.MICROSECONDS), 
    h("MILLISECONDS", 2, TimeUnit.MILLISECONDS), 
    i("SECONDS", 3, TimeUnit.SECONDS), 
    j("MINUTES", 4, TimeUnit.MINUTES), 
    k("HOURS", 5, TimeUnit.HOURS), 
    l("DAYS", 6, TimeUnit.DAYS);
    
    private static final d[] m;
    private static final a n;
    private final TimeUnit e;
    
    static {
        n = b.a((Enum[])(m = a()));
    }
    
    private d(final String s, final int n, final TimeUnit e) {
        this.e = e;
    }
    
    private static final /* synthetic */ d[] a() {
        return new d[] { d.f, d.g, d.h, d.i, d.j, d.k, d.l };
    }
    
    public final TimeUnit b() {
        return this.e;
    }
}
