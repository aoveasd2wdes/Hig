package com.lyokone.location;

import f3.a$b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import f3.a;

public class b implements a, g3.a
{
    private c c;
    private d d;
    private FlutterLocationService e;
    private g3.c f;
    private final ServiceConnection g;
    
    public b() {
        this.g = (ServiceConnection)new b$a(this);
    }
    
    private void b(final g3.c f) {
        this.f = f;
        ((Context)f.e()).bindService(new Intent((Context)f.e(), (Class)FlutterLocationService.class), this.g, 1);
    }
    
    private void d() {
        this.f();
        ((Context)this.f.e()).unbindService(this.g);
        this.f = null;
    }
    
    private void f() {
        this.d.c(null);
        this.c.k(null);
        this.c.j(null);
        this.f.g(this.e.i());
        this.f.g(this.e.h());
        this.f.h(this.e.g());
        this.e.l(null);
        this.e = null;
    }
    
    private void j(final FlutterLocationService e) {
        (this.e = e).l(this.f.e());
        this.f.f(this.e.g());
        this.f.i(this.e.h());
        this.f.i(this.e.i());
        this.c.j(this.e.f());
        this.c.k(this.e);
        this.d.c(this.e.f());
    }
    
    public void c(final g3.c c) {
        this.b(c);
    }
    
    public void e() {
        this.d();
    }
    
    public void g(final a$b a$b) {
        (this.c = new c()).l(a$b.b());
        (this.d = new d()).d(a$b.b());
    }
    
    public void h(final g3.c c) {
        this.b(c);
    }
    
    public void i() {
        this.d();
    }
    
    public void k(final a$b a$b) {
        final c c = this.c;
        if (c != null) {
            c.m();
            this.c = null;
        }
        final d d = this.d;
        if (d != null) {
            d.e();
            this.d = null;
        }
    }
}
