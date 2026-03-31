package com.lyokone.location;

import android.util.Log;
import android.os.Build$VERSION;
import v2.i;
import android.graphics.Color;
import k3.k$d;
import k3.j;
import k3.k;
import k3.k$c;

final class c implements k$c
{
    private a c;
    private FlutterLocationService d;
    private k e;
    
    private void b(final j j, final k$d k$d) {
        final Boolean b = (Boolean)j.a("enable");
        final FlutterLocationService d = this.d;
        if (d != null && b != null) {
            final boolean b2 = d.b();
            final boolean booleanValue = b;
            if (b2) {
                if (booleanValue) {
                    this.d.e();
                    k$d.a((Object)1);
                    return;
                }
            }
            else if (booleanValue) {
                this.d.m(k$d);
                this.d.k();
                return;
            }
            this.d.c();
        }
        k$d.a((Object)0);
    }
    
    private void c(final k$d k$d) {
        final FlutterLocationService d = this.d;
        k$d.a((Object)(int)((d != null && d.j()) ? 1 : 0));
    }
    
    private void d(final j j, final k$d k$d) {
        try {
            String s = (String)j.a("channelName");
            if (s == null) {
                s = "Location background service";
            }
            String s2 = (String)j.a("title");
            if (s2 == null) {
                s2 = "Location background service running";
            }
            String s3 = (String)j.a("iconName");
            if (s3 == null) {
                s3 = "navigation_empty_icon";
            }
            final String s4 = (String)j.a("subtitle");
            final String s5 = (String)j.a("description");
            Boolean false;
            if ((false = (Boolean)j.a("onTapBringToFront")) == null) {
                false = Boolean.FALSE;
            }
            final String s6 = (String)j.a("color");
            Integer value;
            if (s6 != null) {
                value = Color.parseColor(s6);
            }
            else {
                value = null;
            }
            k$d.a((Object)this.d.a(new i(s, s2, s3, s4, s5, value, (boolean)false)));
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("An unexpected error happened during notification options change:");
            sb.append(((Throwable)ex).getMessage());
            k$d.b("CHANGE_NOTIFICATION_OPTIONS_ERROR", sb.toString(), (Object)null);
        }
    }
    
    private void e(final j j, final k$d k$d) {
        try {
            final Integer n = (Integer)this.c.t.get((int)j.a("accuracy"));
            final Long n2 = new Long((long)(int)j.a("interval"));
            this.c.i(n, n2, n2 / 2L, new Float((double)j.a("distanceFilter")));
            k$d.a((Object)1);
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("An unexcepted error happened during location settings change:");
            sb.append(((Throwable)ex).getMessage());
            k$d.b("CHANGE_SETTINGS_ERROR", sb.toString(), (Object)null);
        }
    }
    
    private void f(final k$d r) {
        final a c = this.c;
        c.r = r;
        if (!c.j()) {
            this.c.s();
        }
        else {
            this.c.x();
        }
    }
    
    private void g(final k$d k$d) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final Integer value = 1;
        if (sdk_INT < 23) {
            k$d.a((Object)value);
            return;
        }
        if (this.c.j()) {
            k$d.a((Object)value);
        }
        else {
            k$d.a((Object)0);
        }
    }
    
    private void h(final k$d p) {
        if (Build$VERSION.SDK_INT < 23) {
            p.a((Object)1);
            return;
        }
        final a c = this.c;
        c.p = p;
        c.s();
    }
    
    private void i(final k$d k$d) {
        try {
            int n;
            if (this.c.k()) {
                n = 1;
            }
            else {
                n = 0;
            }
            k$d.a((Object)n);
        }
        catch (final Exception ex) {
            k$d.b("SERVICE_STATUS_ERROR", "Location service status couldn't be determined", (Object)null);
        }
    }
    
    public void a(final j j, final k$d k$d) {
        final String a = j.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1149076467: {
                if (!a.equals((Object)"changeSettings")) {
                    break;
                }
                n = 8;
                break;
            }
            case 746581438: {
                if (!a.equals((Object)"requestPermission")) {
                    break;
                }
                n = 7;
                break;
            }
            case 646862540: {
                if (!a.equals((Object)"serviceEnabled")) {
                    break;
                }
                n = 6;
                break;
            }
            case 473496931: {
                if (!a.equals((Object)"changeNotificationOptions")) {
                    break;
                }
                n = 5;
                break;
            }
            case 171850761: {
                if (!a.equals((Object)"hasPermission")) {
                    break;
                }
                n = 4;
                break;
            }
            case 128007462: {
                if (!a.equals((Object)"requestService")) {
                    break;
                }
                n = 3;
                break;
            }
            case -316023509: {
                if (!a.equals((Object)"getLocation")) {
                    break;
                }
                n = 2;
                break;
            }
            case -724480940: {
                if (!a.equals((Object)"enableBackgroundMode")) {
                    break;
                }
                n = 1;
                break;
            }
            case -972798202: {
                if (!a.equals((Object)"isBackgroundModeEnabled")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                k$d.c();
                break;
            }
            case 8: {
                this.e(j, k$d);
                break;
            }
            case 7: {
                this.h(k$d);
                break;
            }
            case 6: {
                this.i(k$d);
                break;
            }
            case 5: {
                this.d(j, k$d);
                break;
            }
            case 4: {
                this.g(k$d);
                break;
            }
            case 3: {
                this.c.t(k$d);
                break;
            }
            case 2: {
                this.f(k$d);
                break;
            }
            case 1: {
                this.b(j, k$d);
                break;
            }
            case 0: {
                this.c(k$d);
                break;
            }
        }
    }
    
    void j(final a c) {
        this.c = c;
    }
    
    void k(final FlutterLocationService d) {
        this.d = d;
    }
    
    void l(final k3.c c) {
        if (this.e != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            this.m();
        }
        (this.e = new k(c, "lyokone/location")).e((k$c)this);
    }
    
    void m() {
        final k e = this.e;
        if (e == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        e.e((k$c)null);
        this.e = null;
    }
}
