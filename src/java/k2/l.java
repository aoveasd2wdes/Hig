package k2;

final class l implements Runnable
{
    final g e;
    final m f;
    
    l(final m f, final g e) {
        this.f = f;
        this.e = e;
    }
    
    public final void run() {
        final Object c = m.c(this.f);
        synchronized (c) {
            final m f = this.f;
            if (m.b(f) != null) {
                m.b(f).a(this.e);
            }
        }
    }
}
