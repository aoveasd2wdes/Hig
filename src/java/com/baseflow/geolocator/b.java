package com.baseflow.geolocator;

import android.util.Log;
import k3.c;
import androidx.core.content.a;
import android.content.IntentFilter;
import k3.d$b;
import android.content.BroadcastReceiver;
import i1.i0;
import android.content.Context;
import k3.d;
import k3.d$d;

public class b implements d$d
{
    private d a;
    private Context b;
    private i0 c;
    
    private void c() {
        final Context b = this.b;
        if (b != null) {
            final i0 c = this.c;
            if (c != null) {
                b.unregisterReceiver((BroadcastReceiver)c);
            }
        }
    }
    
    public void a(final Object o) {
        this.c();
    }
    
    public void b(final Object o, final d$b d$b) {
        if (this.b == null) {
            return;
        }
        final IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
        intentFilter.addAction("android.intent.action.PROVIDER_CHANGED");
        final i0 c = new i0(d$b);
        this.c = c;
        androidx.core.content.a.h(this.b, (BroadcastReceiver)c, intentFilter, 2);
    }
    
    void d(final Context b) {
        this.b = b;
    }
    
    void e(final Context b, final c c) {
        if (this.a != null) {
            Log.w("LocationServiceHandler", "Setting a event call handler before the last was disposed.");
            this.f();
        }
        (this.a = new d(c, "flutter.baseflow.com/geolocator_service_updates_android")).d((d$d)this);
        this.b = b;
    }
    
    void f() {
        if (this.a == null) {
            return;
        }
        this.c();
        this.a.d((d$d)null);
        this.a = null;
    }
}
