package v;

public final class g
{
    private final float a;
    private final float b;
    
    public g(final float n, final float n2) {
        this.a = f.b(n, "width");
        this.b = f.b(n2, "height");
    }
    
    public float a() {
        return this.b;
    }
    
    public float b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        if (g.a != this.a || g.b != this.b) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.a) ^ Float.floatToIntBits(this.b);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("x");
        sb.append(this.b);
        return sb.toString();
    }
}
