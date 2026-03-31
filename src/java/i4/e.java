package i4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map$Entry;
import v3.c0;
import java.util.ArrayList;
import h4.o;
import h4.n;
import h4.m;
import h4.k;
import h4.j;
import h4.i;
import h4.h;
import h4.f;
import h4.c;
import h4.w;
import h4.v;
import h4.u;
import h4.t;
import h4.s;
import h4.r;
import h4.q;
import h4.p;
import h4.l;
import h4.a;
import java.util.HashMap;
import java.util.Map;
import n4.b;

public final class e implements b, d
{
    public static final e.e$a b;
    private static final Map c;
    private static final HashMap d;
    private static final HashMap e;
    private static final HashMap f;
    private static final Map g;
    private final Class a;
    
    static {
        b = new e.e$a((g)null);
        int n = 0;
        final List j = v3.l.j((Object[])new Class[] { a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, h4.b.class, c.class, h4.d.class, h4.e.class, f.class, h4.g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class });
        final ArrayList list = new ArrayList(v3.l.m((Iterable)j, 10));
        for (final Object next : j) {
            if (n < 0) {
                v3.l.l();
            }
            ((Collection)list).add((Object)u3.n.a((Object)next, (Object)n));
            ++n;
        }
        c = c0.j((Iterable)list);
        final HashMap d2 = new HashMap();
        d2.put((Object)"boolean", (Object)"kotlin.Boolean");
        d2.put((Object)"char", (Object)"kotlin.Char");
        d2.put((Object)"byte", (Object)"kotlin.Byte");
        d2.put((Object)"short", (Object)"kotlin.Short");
        d2.put((Object)"int", (Object)"kotlin.Int");
        d2.put((Object)"float", (Object)"kotlin.Float");
        d2.put((Object)"long", (Object)"kotlin.Long");
        d2.put((Object)"double", (Object)"kotlin.Double");
        d = d2;
        final HashMap e2 = new HashMap();
        e2.put((Object)"java.lang.Boolean", (Object)"kotlin.Boolean");
        e2.put((Object)"java.lang.Character", (Object)"kotlin.Char");
        e2.put((Object)"java.lang.Byte", (Object)"kotlin.Byte");
        e2.put((Object)"java.lang.Short", (Object)"kotlin.Short");
        e2.put((Object)"java.lang.Integer", (Object)"kotlin.Int");
        e2.put((Object)"java.lang.Float", (Object)"kotlin.Float");
        e2.put((Object)"java.lang.Long", (Object)"kotlin.Long");
        e2.put((Object)"java.lang.Double", (Object)"kotlin.Double");
        e = e2;
        final HashMap f2 = new HashMap();
        f2.put((Object)"java.lang.Object", (Object)"kotlin.Any");
        f2.put((Object)"java.lang.String", (Object)"kotlin.String");
        f2.put((Object)"java.lang.CharSequence", (Object)"kotlin.CharSequence");
        f2.put((Object)"java.lang.Throwable", (Object)"kotlin.Throwable");
        f2.put((Object)"java.lang.Cloneable", (Object)"kotlin.Cloneable");
        f2.put((Object)"java.lang.Number", (Object)"kotlin.Number");
        f2.put((Object)"java.lang.Comparable", (Object)"kotlin.Comparable");
        f2.put((Object)"java.lang.Enum", (Object)"kotlin.Enum");
        f2.put((Object)"java.lang.annotation.Annotation", (Object)"kotlin.Annotation");
        f2.put((Object)"java.lang.Iterable", (Object)"kotlin.collections.Iterable");
        f2.put((Object)"java.util.Iterator", (Object)"kotlin.collections.Iterator");
        f2.put((Object)"java.util.Collection", (Object)"kotlin.collections.Collection");
        f2.put((Object)"java.util.List", (Object)"kotlin.collections.List");
        f2.put((Object)"java.util.Set", (Object)"kotlin.collections.Set");
        f2.put((Object)"java.util.ListIterator", (Object)"kotlin.collections.ListIterator");
        f2.put((Object)"java.util.Map", (Object)"kotlin.collections.Map");
        f2.put((Object)"java.util.Map$Entry", (Object)"kotlin.collections.Map.Entry");
        f2.put((Object)"kotlin.jvm.internal.StringCompanionObject", (Object)"kotlin.String.Companion");
        f2.put((Object)"kotlin.jvm.internal.EnumCompanionObject", (Object)"kotlin.Enum.Companion");
        f2.putAll((Map)d2);
        f2.putAll((Map)e2);
        final Collection values = d2.values();
        i4.l.d((Object)values, "<get-values>(...)");
        for (final String s : values) {
            final StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            i4.l.b((Object)s);
            sb.append(p4.f.Y(s, '.', (String)null, 2, (Object)null));
            sb.append("CompanionObject");
            final String string = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s);
            sb2.append(".Companion");
            final u3.j a = u3.n.a((Object)string, (Object)sb2.toString());
            ((Map)f2).put(a.c(), a.d());
        }
        for (final Map$Entry map$Entry : i4.e.c.entrySet()) {
            final Class clazz = (Class)map$Entry.getKey();
            final int intValue = ((Number)map$Entry.getValue()).intValue();
            final String name = clazz.getName();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("kotlin.Function");
            sb3.append(intValue);
            f2.put((Object)name, (Object)sb3.toString());
        }
        f = f2;
        final LinkedHashMap g2 = new LinkedHashMap(c0.a(((Map)f2).size()));
        for (final Map$Entry map$Entry2 : ((Map)f2).entrySet()) {
            ((Map)g2).put(map$Entry2.getKey(), (Object)p4.f.Y((String)map$Entry2.getValue(), '.', (String)null, 2, (Object)null));
        }
        g = (Map)g2;
    }
    
    public e(final Class a) {
        i4.l.e((Object)a, "jClass");
        this.a = a;
    }
    
    @Override
    public String a() {
        return i4.e.b.a(this.c());
    }
    
    @Override
    public String b() {
        return i4.e.b.b(this.c());
    }
    
    public Class c() {
        return this.a;
    }
    
    @Override
    public boolean d(final Object o) {
        return i4.e.b.c(o, this.c());
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof e && i4.l.a((Object)g4.a.b((b)this), (Object)g4.a.b((b)o));
    }
    
    @Override
    public int hashCode() {
        return g4.a.b((b)this).hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.c().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
