package w4;

final class b0
{
    public final s a;
    
    public b0(final s a) {
        this.a = a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Removed[");
        sb.append((Object)this.a);
        sb.append(']');
        return sb.toString();
    }
}
