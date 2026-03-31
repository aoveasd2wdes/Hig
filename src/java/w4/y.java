package w4;

import r4.m;
import y3.g;
import u3.d;
import r4.r0;
import r4.b2;

final class y extends b2 implements r0
{
    private final Throwable g;
    private final String h;
    
    public y(final Throwable g, final String h) {
        this.g = g;
        this.h = h;
    }
    
    private final Void O() {
        if (this.g != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Module with the Main dispatcher had failed to initialize");
            final String h = this.h;
            String string = null;
            Label_0066: {
                if (h != null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(". ");
                    sb2.append(h);
                    if ((string = sb2.toString()) != null) {
                        break Label_0066;
                    }
                }
                string = "";
            }
            sb.append(string);
            throw new IllegalStateException(sb.toString(), this.g);
        }
        x.d();
        throw new d();
    }
    
    public boolean B(final g g) {
        this.O();
        throw new d();
    }
    
    @Override
    public b2 K() {
        return this;
    }
    
    public Void N(final g g, final Runnable runnable) {
        this.O();
        throw new d();
    }
    
    public Void P(final long n, final m m) {
        this.O();
        throw new d();
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        String string;
        if (this.g != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(", cause=");
            sb2.append((Object)this.g);
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
