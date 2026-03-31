package w4;

public final class h0
{
    public final String a;
    
    public h0(final String a) {
        this.a = a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('<');
        sb.append(this.a);
        sb.append('>');
        return sb.toString();
    }
}
