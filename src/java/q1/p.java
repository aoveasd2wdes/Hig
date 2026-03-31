package q1;

public final class p
{
    private static p b;
    private static final q c;
    private q a;
    
    static {
        c = new q(0, false, false, 0, 0);
    }
    
    private p() {
    }
    
    public static p b() {
        synchronized (p.class) {
            if (p.b == null) {
                p.b = new p();
            }
            return p.b;
        }
    }
    
    public q a() {
        return this.a;
    }
    
    public final void c(final q a) {
        monitorenter(this);
        Label_0020: {
            if (a != null) {
                break Label_0020;
            }
            try {
                this.a = p.c;
                return;
                final q a2 = this.a;
                iftrue(Label_0054:)(a2 == null || a2.e() < a.e());
                return;
                Label_0054: {
                    this.a = a;
                }
            }
            finally {
                monitorexit(this);
            }
        }
    }
}
