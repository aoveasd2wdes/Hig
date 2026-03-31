package k2;

final class n implements Runnable
{
    final g e;
    final o f;
    
    n(final o f, final g e) {
        this.f = f;
        this.e = e;
    }
    
    public final void run() {
        final Object c = o.c(this.f);
        synchronized (c) {
            final o f = this.f;
            if (o.b(f) != null) {
                o.b(f).a((Exception)q1.o.h((Object)this.e.h()));
            }
        }
    }
}
