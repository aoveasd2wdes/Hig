package h2;

import java.util.List;
import android.os.RemoteException;
import q1.o;
import c2.g;

public final class p
{
    private final g a;
    
    public p(final g g) {
        this.a = (g)o.h((Object)g);
    }
    
    public String a() {
        try {
            return this.a.K();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void b() {
        try {
            this.a.h();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void c(final boolean b) {
        try {
            this.a.V(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void d(final int n) {
        try {
            this.a.p(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void e(final boolean b) {
        try {
            this.a.M(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof p)) {
            return false;
        }
        try {
            return this.a.p2(((p)o).a);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void f(final List list) {
        try {
            this.a.k2(list);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void g(final List list) {
        try {
            o.i((Object)list, (Object)"points must not be null.");
            this.a.R0(list);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void h(final int n) {
        try {
            this.a.U(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    @Override
    public int hashCode() {
        try {
            return this.a.i();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void i(final float n) {
        try {
            this.a.f(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void j(final boolean b) {
        try {
            this.a.r1(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void k(final float n) {
        try {
            this.a.C1(n);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
}
