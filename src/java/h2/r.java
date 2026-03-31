package h2;

import java.util.List;
import android.os.RemoteException;
import q1.o;
import c2.j;

public final class r
{
    private final j a;
    
    public r(final j j) {
        this.a = (j)o.h((Object)j);
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
            this.a.r();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void c(final boolean b) {
        try {
            this.a.M0(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void d(final int n) {
        try {
            this.a.w1(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void e(final e e) {
        o.i((Object)e, (Object)"endCap must not be null");
        try {
            this.a.o1(e);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof r)) {
            return false;
        }
        try {
            return this.a.f0(((r)o).a);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void f(final boolean b) {
        try {
            this.a.Z1(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void g(final int n) {
        try {
            this.a.U(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void h(final List list) {
        try {
            this.a.F0(list);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public int hashCode() {
        try {
            return this.a.u();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void i(final List list) {
        o.i((Object)list, (Object)"points must not be null");
        try {
            this.a.U1(list);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void j(final e e) {
        o.i((Object)e, (Object)"startCap must not be null");
        try {
            this.a.y0(e);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void k(final boolean b) {
        try {
            this.a.Q1(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void l(final float n) {
        try {
            this.a.i0(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void m(final float n) {
        try {
            this.a.y(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
}
