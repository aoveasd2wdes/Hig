package h2;

import q1.o;

public final class h extends e
{
    public final b e;
    public final float f;
    
    public h(final b e, final float f) {
        final b b = (b)o.i((Object)e, (Object)"bitmapDescriptor must not be null");
        if (f > 0.0f) {
            super(b, f);
            this.e = e;
            this.f = f;
            return;
        }
        throw new IllegalArgumentException("refWidth must be positive");
    }
    
    public String toString() {
        final String value = String.valueOf((Object)this.e);
        final StringBuilder sb = new StringBuilder();
        sb.append("[CustomCap: bitmapDescriptor=");
        sb.append(value);
        sb.append(" refWidth=");
        sb.append(this.f);
        sb.append("]");
        return sb.toString();
    }
}
