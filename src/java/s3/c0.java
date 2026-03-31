package s3;

import java.util.Collection;
import android.content.SharedPreferences$Editor;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import n0.b;
import android.content.SharedPreferences;
import android.util.Log;
import i4.l;
import android.content.Context;
import k3.c;

public final class c0 implements b0
{
    private c c;
    private Context d;
    private d0 e;
    
    public c0(final c c, final Context d, final d0 e) {
        l.e((Object)c, "messenger");
        l.e((Object)d, "context");
        l.e((Object)e, "listEncoder");
        this.c = c;
        this.d = d;
        this.e = e;
        try {
            b0.b.o(c, (b0)this, "shared_preferences");
        }
        catch (final Exception ex) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", (Throwable)ex);
        }
    }
    
    private final SharedPreferences g(final e0 e0) {
        SharedPreferences sharedPreferences;
        String s;
        if (e0.a() == null) {
            sharedPreferences = b.a(this.d);
            s = "{\n      PreferenceManage\u2026references(context)\n    }";
        }
        else {
            sharedPreferences = this.d.getSharedPreferences(e0.a(), 0);
            s = "{\n      context.getShare\u2026ntext.MODE_PRIVATE)\n    }";
        }
        l.d((Object)sharedPreferences, s);
        return sharedPreferences;
    }
    
    public Map a(final List list, final e0 e0) {
        l.e((Object)e0, "options");
        final Map all = this.g(e0).getAll();
        l.d((Object)all, "preferences.all");
        final HashMap hashMap = new HashMap();
        for (final Map$Entry map$Entry : all.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final Object value = map$Entry.getValue();
            Set i;
            if (list != null) {
                i = v3.l.I((Iterable)list);
            }
            else {
                i = null;
            }
            if (g0.c(s, value, i)) {
                final Object value2 = map$Entry.getValue();
                if (value2 == null) {
                    continue;
                }
                final Object key = map$Entry.getKey();
                final Object d = g0.d(value2, this.e);
                l.c(d, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, d);
            }
        }
        return (Map)hashMap;
    }
    
    public Double b(final String s, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        final SharedPreferences g = this.g(e0);
        Double n;
        if (g.contains(s)) {
            final Object d = g0.d((Object)g.getString(s, ""), this.e);
            l.c(d, "null cannot be cast to non-null type kotlin.Double");
            n = (Double)d;
        }
        else {
            n = null;
        }
        return n;
    }
    
    public Long c(final String s, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        final SharedPreferences g = this.g(e0);
        Long value;
        if (g.contains(s)) {
            value = g.getLong(s, 0L);
        }
        else {
            value = null;
        }
        return value;
    }
    
    public void d(final String s, final List list, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)list, "value");
        l.e((Object)e0, "options");
        final String a = this.e.a(list);
        final StringBuilder sb = new StringBuilder();
        sb.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu");
        sb.append(a);
        this.g(e0).edit().putString(s, sb.toString()).apply();
    }
    
    public List e(final String s, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        final SharedPreferences g = this.g(e0);
        final boolean contains = g.contains(s);
        List list = null;
        if (contains) {
            final List list2 = (List)g0.d((Object)g.getString(s, ""), this.e);
            list = list;
            if (list2 != null) {
                final ArrayList list3 = new ArrayList();
                final Iterator iterator = ((Iterable)list2).iterator();
                while (true) {
                    list = (List)list3;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final Object next = iterator.next();
                    if (!(next instanceof String)) {
                        continue;
                    }
                    ((Collection)list3).add(next);
                }
            }
        }
        return list;
    }
    
    public void f(final String s, final String s2, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)s2, "value");
        l.e((Object)e0, "options");
        this.g(e0).edit().putString(s, s2).apply();
    }
    
    public List h(final List list, final e0 e0) {
        l.e((Object)e0, "options");
        final Map all = this.g(e0).getAll();
        l.d((Object)all, "preferences.all");
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final Map$Entry map$Entry : all.entrySet()) {
            final Object key = map$Entry.getKey();
            l.d(key, "it.key");
            final String s = (String)key;
            final Object value = map$Entry.getValue();
            Set i;
            if (list != null) {
                i = v3.l.I((Iterable)list);
            }
            else {
                i = null;
            }
            if (g0.c(s, value, i)) {
                ((Map)linkedHashMap).put(map$Entry.getKey(), map$Entry.getValue());
            }
        }
        return v3.l.F((Iterable)((Map)linkedHashMap).keySet());
    }
    
    public void i(final String s, final double n, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        final SharedPreferences$Editor edit = this.g(e0).edit();
        final StringBuilder sb = new StringBuilder();
        sb.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu");
        sb.append(n);
        edit.putString(s, sb.toString()).apply();
    }
    
    public Boolean j(final String s, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        final SharedPreferences g = this.g(e0);
        Boolean value;
        if (g.contains(s)) {
            value = g.getBoolean(s, true);
        }
        else {
            value = null;
        }
        return value;
    }
    
    public final void k() {
        b0.b.o(this.c, (b0)null, "shared_preferences");
    }
    
    public String l(String string, final e0 e0) {
        l.e((Object)string, "key");
        l.e((Object)e0, "options");
        final SharedPreferences g = this.g(e0);
        if (g.contains(string)) {
            string = g.getString(string, "");
        }
        else {
            string = null;
        }
        return string;
    }
    
    public void m(final List list, final e0 e0) {
        l.e((Object)e0, "options");
        final SharedPreferences g = this.g(e0);
        final SharedPreferences$Editor edit = g.edit();
        l.d((Object)edit, "preferences.edit()");
        final Map all = g.getAll();
        l.d((Object)all, "preferences.all");
        final ArrayList list2 = new ArrayList();
        for (final String s : all.keySet()) {
            final Object value = all.get((Object)s);
            Set i;
            if (list != null) {
                i = v3.l.I((Iterable)list);
            }
            else {
                i = null;
            }
            if (g0.c(s, value, i)) {
                list2.add((Object)s);
            }
        }
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            edit.remove((String)iterator2.next());
        }
        edit.apply();
    }
    
    public void n(final String s, final boolean b, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        this.g(e0).edit().putBoolean(s, b).apply();
    }
    
    public void o(final String s, final long n, final e0 e0) {
        l.e((Object)s, "key");
        l.e((Object)e0, "options");
        this.g(e0).edit().putLong(s, n).apply();
    }
}
