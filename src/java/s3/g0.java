package s3;

import p4.f;
import java.util.Set;
import android.content.Context;
import r4.j0;
import h4.l;
import e0.b;
import i4.q;
import i4.x;
import i4.r;
import j4.a;
import n4.h;

public abstract class g0
{
    static final h[] a;
    private static final a b;
    
    static {
        a = new h[] { (h)x.e((q)new r((Class)g0.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)) };
        b = g0.a.b("FlutterSharedPreferences", (b)null, (l)null, (j0)null, 14, (Object)null);
    }
    
    private static final d0.h b(final Context context) {
        return (d0.h)g0.b.a((Object)context, g0.a[0]);
    }
    
    public static final boolean c(final String s, final Object o, final Set set) {
        i4.l.e((Object)s, "key");
        if (set == null) {
            return o instanceof Boolean || o instanceof Long || o instanceof String || o instanceof Double;
        }
        return set.contains((Object)s);
    }
    
    public static final Object d(final Object o, final d0 d0) {
        i4.l.e((Object)d0, "listEncoder");
        Object value = o;
        if (o instanceof String) {
            final String s = (String)o;
            if (f.p(s, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, (Object)null)) {
                final String substring = s.substring(40);
                i4.l.d((Object)substring, "substring(...)");
                return d0.b(substring);
            }
            value = o;
            if (f.p(s, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu", false, 2, (Object)null)) {
                final String substring2 = s.substring(40);
                i4.l.d((Object)substring2, "substring(...)");
                value = Double.parseDouble(substring2);
            }
        }
        return value;
    }
}
