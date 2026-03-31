package q2;

public abstract class b
{
    public final double a;
    public final double b;
    
    public b(final double a, final double b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Point{x=");
        sb.append(this.a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
