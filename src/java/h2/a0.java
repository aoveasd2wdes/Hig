package h2;

import android.os.RemoteException;
import q1.o;
import c2.m;

public final class a0
{
    private final m a;
    
    public a0(final m m) {
        this.a = (m)o.h((Object)m);
    }
    
    public void a() {
        try {
            this.a.u();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public boolean b() {
        try {
            return this.a.h();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public float c() {
        try {
            return this.a.b();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public float d() {
        try {
            return this.a.l();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public boolean e() {
        try {
            return this.a.r();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof a0)) {
            return false;
        }
        try {
            return this.a.m1(((a0)o).a);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void f() {
        try {
            this.a.i();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void g(final boolean b) {
        try {
            this.a.Y(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void h(final float n) {
        try {
            this.a.t0(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public int hashCode() {
        try {
            return this.a.t();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void i(final boolean b) {
        try {
            this.a.e0(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void j(final float n) {
        try {
            this.a.E0(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
}
