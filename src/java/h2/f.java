package h2;

import com.google.android.gms.maps.model.LatLng;
import android.os.RemoteException;
import q1.o;
import c2.x;

public final class f
{
    private final x a;
    
    public f(final x x) {
        this.a = (x)o.h((Object)x);
    }
    
    public String a() {
        try {
            return this.a.e();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void b() {
        try {
            this.a.q();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void c(final LatLng latLng) {
        try {
            o.i((Object)latLng, (Object)"center must not be null.");
            this.a.o2(latLng);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void d(final boolean b) {
        try {
            this.a.V(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void e(final int n) {
        try {
            this.a.p(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof f)) {
            return false;
        }
        try {
            return this.a.T1(((f)o).a);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void f(final double n) {
        try {
            this.a.c1(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void g(final int n) {
        try {
            this.a.p0(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void h(final float n) {
        try {
            this.a.i2(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public final int hashCode() {
        try {
            return this.a.i();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void i(final boolean b) {
        try {
            this.a.D0(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void j(final float n) {
        try {
            this.a.f(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
}
