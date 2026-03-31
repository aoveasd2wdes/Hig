package n1;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

abstract class x extends v
{
    private static final WeakReference d;
    private WeakReference c;
    
    static {
        d = new WeakReference((Object)null);
    }
    
    x(final byte[] array) {
        super(array);
        this.c = x.d;
    }
    
    final byte[] W() {
        synchronized (this) {
            byte[] u2;
            if ((u2 = (byte[])((Reference)this.c).get()) == null) {
                u2 = this.u2();
                this.c = new WeakReference((Object)u2);
            }
            return u2;
        }
    }
    
    protected abstract byte[] u2();
}
