package f2;

import g2.p;
import x1.d;
import g2.d0;
import android.os.Bundle;
import android.os.RemoteException;
import h2.u;
import q1.o;
import android.view.View;
import android.view.ViewGroup;
import x1.c;

final class m implements c
{
    private final ViewGroup a;
    private final g2.c b;
    private View c;
    
    public m(final ViewGroup viewGroup, final g2.c c) {
        this.b = (g2.c)o.h((Object)c);
        this.a = (ViewGroup)o.h((Object)viewGroup);
    }
    
    @Override
    public final void H() {
        try {
            this.b.H();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public final void R() {
        try {
            this.b.R();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public final void S(final Bundle bundle) {
        try {
            final Bundle bundle2 = new Bundle();
            d0.b(bundle, bundle2);
            this.b.S(bundle2);
            d0.b(bundle2, bundle);
            this.c = (View)d.W(this.b.X());
            this.a.removeAllViews();
            this.a.addView(this.c);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public final void a(final f f) {
        try {
            this.b.m2((p)new l(this, f));
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public final void c(final Bundle bundle) {
        try {
            final Bundle bundle2 = new Bundle();
            d0.b(bundle, bundle2);
            this.b.c(bundle2);
            d0.b(bundle2, bundle);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public final void d() {
        try {
            this.b.d();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public final void j() {
        try {
            this.b.j();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
}
