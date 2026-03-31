package y4;

import r4.n0;

public final class k extends h
{
    public final Runnable g;
    
    public k(final Runnable g, final long n, final i i) {
        super(n, i);
        this.g = g;
    }
    
    public void run() {
        try {
            this.g.run();
        }
        finally {
            super.f.b();
        }
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Task[");
        sb.append(n0.a((Object)this.g));
        sb.append('@');
        sb.append(n0.b((Object)this.g));
        sb.append(", ");
        sb.append(super.e);
        sb.append(", ");
        sb.append((Object)super.f);
        sb.append(']');
        return sb.toString();
    }
}
