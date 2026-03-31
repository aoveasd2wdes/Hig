package c5;

import i4.g;
import java.util.ArrayList;
import i4.l;
import java.util.List;
import b5.j0;

public final class h
{
    private final j0 a;
    private final boolean b;
    private final String c;
    private final long d;
    private final long e;
    private final long f;
    private final int g;
    private final Long h;
    private final long i;
    private final List j;
    
    public h(final j0 a, final boolean b, final String c, final long d, final long e, final long f, final int g, final Long h, final long i) {
        l.e(a, "canonicalPath");
        l.e(c, "comment");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = (List)new ArrayList();
    }
    
    public final j0 a() {
        return this.a;
    }
    
    public final List b() {
        return this.j;
    }
    
    public final long c() {
        return this.e;
    }
    
    public final int d() {
        return this.g;
    }
    
    public final Long e() {
        return this.h;
    }
    
    public final long f() {
        return this.i;
    }
    
    public final long g() {
        return this.f;
    }
    
    public final boolean h() {
        return this.b;
    }
}
