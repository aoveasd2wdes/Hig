package h2;

public final class i extends o
{
    public final float c;
    
    public i(final float n) {
        super(0, Float.valueOf(Math.max(n, 0.0f)));
        this.c = Math.max(n, 0.0f);
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[Dash: length=");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
