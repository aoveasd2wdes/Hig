package com.baseflow.geolocator;

import f3.a$b;
import android.app.Activity;
import android.content.Intent;
import android.content.Context;
import g3.c;
import android.content.ServiceConnection;
import i1.p;
import i1.n;
import j1.b;

public class a implements f3.a, g3.a
{
    private final b c;
    private final n d;
    private final p e;
    private GeolocatorLocationService f;
    private j g;
    private m h;
    private final ServiceConnection i;
    private com.baseflow.geolocator.b j;
    private c k;
    
    public a() {
        this.i = (ServiceConnection)new a$a(this);
        this.c = b.b();
        this.d = n.c();
        this.e = p.a();
    }
    
    private void f(final Context context) {
        context.bindService(new Intent(context, (Class)GeolocatorLocationService.class), this.i, 1);
    }
    
    private void j() {
        final c k = this.k;
        if (k != null) {
            k.h((k3.m)this.d);
            this.k.g((k3.n)this.c);
        }
    }
    
    private void l() {
        a3.b.a("FlutterGeolocator", "Disposing Geolocator services");
        final j g = this.g;
        if (g != null) {
            g.y();
            this.g.w(null);
            this.g = null;
        }
        final m h = this.h;
        if (h != null) {
            h.k();
            this.h.i(null);
            this.h = null;
        }
        final com.baseflow.geolocator.b j = this.j;
        if (j != null) {
            j.d(null);
            this.j.f();
            this.j = null;
        }
        final GeolocatorLocationService f = this.f;
        if (f != null) {
            f.n((Activity)null);
        }
    }
    
    private void m(final GeolocatorLocationService f) {
        a3.b.a("FlutterGeolocator", "Initializing Geolocator services");
        (this.f = f).o(this.d);
        this.f.g();
        final m h = this.h;
        if (h != null) {
            h.i(f);
        }
    }
    
    private void n() {
        final c k = this.k;
        if (k != null) {
            k.f((k3.m)this.d);
            this.k.i((k3.n)this.c);
        }
    }
    
    private void o(final Context context) {
        final GeolocatorLocationService f = this.f;
        if (f != null) {
            f.h();
        }
        context.unbindService(this.i);
    }
    
    public void c(final c c) {
        this.h(c);
    }
    
    public void e() {
        a3.b.a("FlutterGeolocator", "Detaching Geolocator from activity");
        this.j();
        final j g = this.g;
        if (g != null) {
            g.w(null);
        }
        final m h = this.h;
        if (h != null) {
            h.h(null);
        }
        final GeolocatorLocationService f = this.f;
        if (f != null) {
            f.n((Activity)null);
        }
        if (this.k != null) {
            this.k = null;
        }
    }
    
    public void g(final a$b a$b) {
        (this.g = new j(this.c, this.d, this.e)).x(a$b.a(), a$b.b());
        (this.h = new m(this.c, this.d)).j(a$b.a(), a$b.b());
        (this.j = new com.baseflow.geolocator.b()).d(a$b.a());
        this.j.e(a$b.a(), a$b.b());
        this.f(a$b.a());
    }
    
    public void h(final c k) {
        a3.b.a("FlutterGeolocator", "Attaching Geolocator to activity");
        this.k = k;
        this.n();
        final j g = this.g;
        if (g != null) {
            g.w(k.e());
        }
        final m h = this.h;
        if (h != null) {
            h.h(k.e());
        }
        final GeolocatorLocationService f = this.f;
        if (f != null) {
            f.n(this.k.e());
        }
    }
    
    public void i() {
        this.e();
    }
    
    public void k(final a$b a$b) {
        this.o(a$b.a());
        this.l();
    }
}
