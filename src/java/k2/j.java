package k2;

final class j implements Runnable
{
    final g e;
    final k f;
    
    j(final k f, final g e) {
        this.f = f;
        this.e = e;
    }
    
    public final void run() {
        if (this.e.j()) {
            k.c(this.f).q();
            return;
        }
        try {
            k.c(this.f).p(k.b(this.f).a(this.e));
        }
        catch (final Exception ex) {
            k.c(this.f).o(ex);
        }
        catch (final f f) {
            if (((Throwable)f).getCause() instanceof Exception) {
                k.c(this.f).o((Exception)((Throwable)f).getCause());
                return;
            }
            k.c(this.f).o((Exception)f);
        }
    }
}
