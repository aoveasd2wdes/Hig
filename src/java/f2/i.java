package f2;

import android.os.RemoteException;
import h2.u;
import g2.e;

public final class i
{
    private final e a;
    
    i(final e a) {
        this.a = a;
    }
    
    public boolean a() {
        try {
            return this.a.v();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public boolean b() {
        try {
            return this.a.n();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public boolean c() {
        try {
            return this.a.x();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public boolean d() {
        try {
            return this.a.H1();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public boolean e() {
        try {
            return this.a.G0();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public boolean f() {
        try {
            return this.a.n2();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public boolean g() {
        try {
            return this.a.F1();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public boolean h() {
        try {
            return this.a.s2();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void i(final boolean b) {
        try {
            this.a.C(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void j(final boolean b) {
        try {
            this.a.F(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void k(final boolean b) {
        try {
            this.a.z(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void l(final boolean b) {
        try {
            this.a.T(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void m(final boolean b) {
        try {
            this.a.N(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void n(final boolean b) {
        try {
            this.a.A(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void o(final boolean b) {
        try {
            this.a.O(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public void p(final boolean b) {
        try {
            this.a.E(b);
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
}
