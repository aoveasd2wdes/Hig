package n3;

import f3.a$b;
import android.content.pm.ActivityInfo;
import k3.k$d;
import java.util.Iterator;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.os.Build$VERSION;
import java.util.HashMap;
import java.util.Map;
import android.content.pm.PackageManager;
import j3.r;
import j3.r$b;
import k3.m;
import f3.a;

public class c implements a, g3.a, m, r$b
{
    private final r c;
    private final PackageManager d;
    private g3.c e;
    private Map f;
    private Map g;
    
    public c(final r c) {
        this.g = (Map)new HashMap();
        this.c = c;
        this.d = c.b;
        c.b((r$b)this);
    }
    
    private void f() {
        this.f = (Map)new HashMap();
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 23) {
            return;
        }
        final Intent setType = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        List list;
        if (sdk_INT >= 33) {
            list = b.a(this.d, setType, n3.a.a(0L));
        }
        else {
            list = this.d.queryIntentActivities(setType, 0);
        }
        for (final ResolveInfo resolveInfo : list) {
            final String name = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.d).toString();
            this.f.put((Object)name, (Object)resolveInfo);
        }
    }
    
    public boolean a(final int n, final int n2, final Intent intent) {
        if (!this.g.containsKey((Object)n)) {
            return false;
        }
        String stringExtra;
        if (n2 == -1) {
            stringExtra = intent.getStringExtra("android.intent.extra.PROCESS_TEXT");
        }
        else {
            stringExtra = null;
        }
        ((k$d)this.g.remove((Object)n)).a((Object)stringExtra);
        return true;
    }
    
    public void b(final String s, final String s2, final boolean b, final k$d k$d) {
        if (this.e == null) {
            k$d.b("error", "Plugin not bound to an Activity", (Object)null);
            return;
        }
        if (Build$VERSION.SDK_INT < 23) {
            k$d.b("error", "Android version not supported", (Object)null);
            return;
        }
        final Map f = this.f;
        if (f == null) {
            k$d.b("error", "Can not process text actions before calling queryTextActions", (Object)null);
            return;
        }
        final ResolveInfo resolveInfo = (ResolveInfo)f.get((Object)s);
        if (resolveInfo == null) {
            k$d.b("error", "Text processing activity not found", (Object)null);
            return;
        }
        final Integer value = k$d.hashCode();
        this.g.put((Object)value, (Object)k$d);
        final Intent intent = new Intent();
        final ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", s2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", b);
        this.e.e().startActivityForResult(intent, (int)value);
    }
    
    public void c(final g3.c e) {
        (this.e = e).f((m)this);
    }
    
    public Map d() {
        if (this.f == null) {
            this.f();
        }
        final HashMap hashMap = new HashMap();
        for (final String s : this.f.keySet()) {
            ((Map)hashMap).put((Object)s, (Object)((ResolveInfo)this.f.get((Object)s)).loadLabel(this.d).toString());
        }
        return (Map)hashMap;
    }
    
    public void e() {
        this.e.h((m)this);
        this.e = null;
    }
    
    public void g(final a$b a$b) {
    }
    
    public void h(final g3.c e) {
        (this.e = e).f((m)this);
    }
    
    public void i() {
        this.e.h((m)this);
        this.e = null;
    }
    
    public void k(final a$b a$b) {
    }
}
