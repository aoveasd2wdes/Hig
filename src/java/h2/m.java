package h2;

import com.google.android.gms.maps.model.LatLng;
import android.os.RemoteException;
import q1.o;
import c2.d;

public class m
{
    protected final d a;
    
    public m(final d d) {
        this.a = (d)o.h((Object)d);
    }
    
    public String a() {
        try {
            return this.a.K();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public LatLng b() {
        try {
            return this.a.s();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public String c() {
        try {
            return this.a.e();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public String d() {
        try {
            return this.a.L1();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void e() {
        try {
            this.a.q();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof m)) {
            return false;
        }
        try {
            return this.a.q2(((m)o).a);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public boolean f() {
        try {
            return this.a.S0();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void g() {
        try {
            this.a.h();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void h(final float n) {
        try {
            this.a.s1(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public int hashCode() {
        try {
            return this.a.S1();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void i(final float n, final float n2) {
        try {
            this.a.k0(n, n2);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void j(final boolean b) {
        try {
            this.a.M(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void k(final boolean b) {
        try {
            this.a.U0(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void l(final b b) {
        Label_0015: {
            if (b != null) {
                break Label_0015;
            }
            try {
                this.a.X0(null);
                return;
                this.a.X0(b.a());
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
    }
    
    public void m(final float n, final float n2) {
        try {
            this.a.L0(n, n2);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void n(final LatLng latLng) {
        if (latLng != null) {
            try {
                this.a.J1(latLng);
                return;
            }
            catch (final RemoteException ex) {
                throw new u(ex);
            }
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }
    
    public void o(final float n) {
        try {
            this.a.f(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void p(final String s) {
        try {
            this.a.W0(s);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void q(final String s) {
        try {
            this.a.g0(s);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void r(final boolean b) {
        try {
            this.a.V0(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void s(final float n) {
        try {
            this.a.y(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void t() {
        try {
            this.a.j1();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
}
