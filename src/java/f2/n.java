package f2;

import java.util.Iterator;
import n1.j;
import android.os.RemoteException;
import h2.u;
import x1.c;
import x1.d;
import g2.e0;
import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.maps.GoogleMapOptions;
import x1.e;
import android.content.Context;
import android.view.ViewGroup;
import x1.a;

final class n extends a
{
    private final ViewGroup e;
    private final Context f;
    protected e g;
    private final GoogleMapOptions h;
    private final List i;
    
    n(final ViewGroup e, final Context f, final GoogleMapOptions h) {
        this.i = (List)new ArrayList();
        this.e = e;
        this.f = f;
        this.h = h;
    }
    
    @Override
    protected final void a(final e g) {
        this.g = g;
        this.q();
    }
    
    public final void p(final f f) {
        if (this.b() != null) {
            ((m)this.b()).a(f);
            return;
        }
        this.i.add((Object)f);
    }
    
    public final void q() {
        if (this.g == null || this.b() != null) {
            goto Label_0140;
        }
        try {
            f2.e.a(this.f);
            final g2.c w0 = e0.a(this.f, (e$a)null).w0(x1.d.u2((Object)this.f), this.h);
            if (w0 == null) {
                return;
            }
            this.g.a(new m(this.e, w0));
            final Iterator iterator = this.i.iterator();
            while (iterator.hasNext()) {
                ((m)this.b()).a((f)iterator.next());
            }
            this.i.clear();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
        catch (final j j) {}
    }
}
