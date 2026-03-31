package h2;

public final class k extends o
{
    public final float c;
    
    public k(final float n) {
        super(2, Float.valueOf(Math.max(n, 0.0f)));
        this.c = Math.max(n, 0.0f);
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[Gap: length=");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
