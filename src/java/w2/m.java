package w2;

final class m
{
    private final l a;
    final Runnable b;
    
    m(final l a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    public Integer a() {
        final l a = this.a;
        Integer value;
        if (a != null) {
            value = a.a();
        }
        else {
            value = null;
        }
        return value;
    }
    
    public boolean b() {
        final l a = this.a;
        return a != null && a.b();
    }
}
