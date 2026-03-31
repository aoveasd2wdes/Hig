package q2;

public class a
{
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    
    public a(final double a, final double c, final double b, final double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (a + c) / 2.0;
        this.f = (b + d) / 2.0;
    }
    
    public boolean a(final double n, final double n2) {
        return this.a <= n && n <= this.c && this.b <= n2 && n2 <= this.d;
    }
    
    public boolean b(final a a) {
        return a.a >= this.a && a.c <= this.c && a.b >= this.b && a.d <= this.d;
    }
    
    public boolean c(final b b) {
        return this.a(b.a, b.b);
    }
    
    public boolean d(final double n, final double n2, final double n3, final double n4) {
        return n < this.c && this.a < n2 && n3 < this.d && this.b < n4;
    }
    
    public boolean e(final a a) {
        return this.d(a.a, a.c, a.b, a.d);
    }
}
