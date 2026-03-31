package s3;

import java.io.ObjectInputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import android.util.Base64;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import f3.a$b;
import java.util.HashSet;
import android.content.SharedPreferences$Editor;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.math.BigInteger;
import android.util.Log;
import android.content.Context;
import k3.c;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import android.content.SharedPreferences;

public class a implements a, l$a
{
    private SharedPreferences c;
    private d0 d;
    
    public a() {
        this((d0)new a());
    }
    
    a(final d0 d) {
        this.d = d;
    }
    
    private Map j(final String s, final Set set) {
        final Map all = this.c.getAll();
        final HashMap hashMap = new HashMap();
        for (final String s2 : all.keySet()) {
            if (s2.startsWith(s) && (set == null || set.contains((Object)s2))) {
                ((Map)hashMap).put((Object)s2, this.m(s2, all.get((Object)s2)));
            }
        }
        return (Map)hashMap;
    }
    
    private void l(final c c, final Context context) {
        this.c = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            k.j(c, (l$a)this);
        }
        catch (final Exception ex) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", (Throwable)ex);
        }
    }
    
    private Object m(String s, final Object o) {
        if (o instanceof String) {
            s = (String)o;
            if (s.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                return this.d.b(s.substring(40));
            }
            if (s.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                return new BigInteger(s.substring(44), 36);
            }
            if (s.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return Double.valueOf(s.substring(40));
            }
        }
        else if (o instanceof Set) {
            final ArrayList list = new ArrayList((Collection)o);
            final SharedPreferences$Editor remove = this.c.edit().remove(s);
            final StringBuilder sb = new StringBuilder();
            sb.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu");
            sb.append(this.d.a((List)list));
            remove.putString(s, sb.toString()).apply();
            return list;
        }
        return o;
    }
    
    public Boolean a(final String s, final Boolean b) {
        return this.c.edit().putBoolean(s, (boolean)b).commit();
    }
    
    public Boolean b(final String s, final Double n) {
        final String string = Double.toString((double)n);
        final SharedPreferences$Editor edit = this.c.edit();
        final StringBuilder sb = new StringBuilder();
        sb.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu");
        sb.append(string);
        return edit.putString(s, sb.toString()).commit();
    }
    
    public Boolean c(final String s) {
        return this.c.edit().remove(s).commit();
    }
    
    public Boolean d(final String s, final Long n) {
        return this.c.edit().putLong(s, (long)n).commit();
    }
    
    public Map e(final String s, final List list) {
        Object o;
        if (list == null) {
            o = null;
        }
        else {
            o = new HashSet((Collection)list);
        }
        return this.j(s, (Set)o);
    }
    
    public Boolean f(final String s, final String s2) {
        if (!s2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !s2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") && !s2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return this.c.edit().putString(s, s2).commit();
        }
        throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
    }
    
    public void g(final a$b a$b) {
        this.l(a$b.b(), a$b.a());
    }
    
    public Boolean h(final String s, final List list) {
        final SharedPreferences$Editor edit = this.c.edit();
        final Map all = this.c.getAll();
        final ArrayList list2 = new ArrayList();
        for (final String s2 : all.keySet()) {
            if (s2.startsWith(s) && (list == null || list.contains((Object)s2))) {
                list2.add((Object)s2);
            }
        }
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            edit.remove((String)iterator2.next());
        }
        return edit.commit();
    }
    
    public Boolean i(final String s, final List list) {
        final SharedPreferences$Editor edit = this.c.edit();
        final StringBuilder sb = new StringBuilder();
        sb.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu");
        sb.append(this.d.a(list));
        return edit.putString(s, sb.toString()).commit();
    }
    
    public void k(final a$b a$b) {
        k.j(a$b.b(), (l$a)null);
    }
    
    static class a implements d0
    {
        public String a(final List list) {
            try {
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                final ObjectOutputStream objectOutputStream = new ObjectOutputStream((OutputStream)byteArrayOutputStream);
                objectOutputStream.writeObject((Object)list);
                objectOutputStream.flush();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            catch (final IOException ex) {
                throw new RuntimeException((Throwable)ex);
            }
        }
        
        public List b(String ex) {
            try {
                ex = (ClassNotFoundException)((ObjectInputStream)new h0((InputStream)new ByteArrayInputStream(Base64.decode((String)ex, 0)))).readObject();
                return (List)ex;
            }
            catch (final ClassNotFoundException ex) {}
            catch (final IOException ex2) {}
            throw new RuntimeException((Throwable)ex);
        }
    }
}
