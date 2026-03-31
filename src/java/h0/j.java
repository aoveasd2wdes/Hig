package h0;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.t$a;
import u3.q;
import java.util.Iterator;
import java.util.Map;
import java.util.Map$Entry;
import b5.d;
import g0.g$a;
import g0.h$a;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.f;
import java.util.Set;
import java.util.List;
import g0.h$b;
import i4.l;
import i4.g;
import u3.i;
import g0.h;
import f0.c;

public final class j implements c
{
    public static final j a;
    
    static {
        a = new j();
    }
    
    private j() {
    }
    
    private final void d(final String s, final h h, final h0.c c) {
        final h$b g0 = h.g0();
        int n;
        if (g0 == null) {
            n = -1;
        }
        else {
            n = j.j$a.a[((Enum)g0).ordinal()];
        }
        f$a f$a = null;
        Object o = null;
        switch (n) {
            default: {
                throw new i();
            }
            case 9: {
                throw new d0.c("Value not set.", (Throwable)null, 2, (g)null);
            }
            case 8: {
                final f$a b = h.b(s);
                final byte[] v = h.Y().v();
                l.d((Object)v, "value.bytes.toByteArray()");
                c.j(b, v);
                return;
            }
            case 7: {
                f$a = h.h(s);
                final List t = h.f0().T();
                l.d((Object)t, "value.stringSet.stringsList");
                o = v3.l.I((Iterable)t);
                break;
            }
            case 6: {
                f$a = h.g(s);
                o = h.e0();
                l.d(o, "value.string");
                break;
            }
            case 5: {
                f$a = h.f(s);
                o = h.d0();
                break;
            }
            case 4: {
                f$a = h.e(s);
                o = h.c0();
                break;
            }
            case 3: {
                f$a = h.c(s);
                o = h.a0();
                break;
            }
            case 2: {
                f$a = h.d(s);
                o = h.b0();
                break;
            }
            case 1: {
                f$a = h.a(s);
                o = h.X();
                break;
            }
            case -1: {
                throw new d0.c("Value case is null.", (Throwable)null, 2, (g)null);
            }
        }
        c.j(f$a, o);
    }
    
    private final h f(final Object o) {
        t t;
        String s;
        if (o instanceof Boolean) {
            t = ((t$a)h.h0().q((boolean)o)).i();
            s = "newBuilder().setBoolean(value).build()";
        }
        else if (o instanceof Float) {
            t = ((t$a)h.h0().t(((Number)o).floatValue())).i();
            s = "newBuilder().setFloat(value).build()";
        }
        else if (o instanceof Double) {
            t = ((t$a)h.h0().s(((Number)o).doubleValue())).i();
            s = "newBuilder().setDouble(value).build()";
        }
        else if (o instanceof Integer) {
            t = ((t$a)h.h0().u(((Number)o).intValue())).i();
            s = "newBuilder().setInteger(value).build()";
        }
        else if (o instanceof Long) {
            t = ((t$a)h.h0().v(((Number)o).longValue())).i();
            s = "newBuilder().setLong(value).build()";
        }
        else if (o instanceof String) {
            t = ((t$a)h.h0().w((String)o)).i();
            s = "newBuilder().setString(value).build()";
        }
        else if (o instanceof Set) {
            final h$a h0 = h.h0();
            final g$a u = g0.g.U();
            l.c(o, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            t = ((t$a)h0.x(u.q((Iterable)o))).i();
            s = "newBuilder().setStringSe\u2026                ).build()";
        }
        else {
            if (!(o instanceof byte[])) {
                final StringBuilder sb = new StringBuilder();
                sb.append("PreferencesSerializer does not support type: ");
                sb.append(o.getClass().getName());
                throw new IllegalStateException(sb.toString());
            }
            t = ((t$a)h.h0().r(f.l((byte[])o))).i();
            s = "newBuilder().setBytes(By\u2026.copyFrom(value)).build()";
        }
        l.d((Object)t, s);
        return (h)t;
    }
    
    public Object b(final d d, final y3.d d2) {
        final g0.f a = g0.d.a.a(d.y());
        final h0.c b = h0.g.b(new f$b[0]);
        final Map r = a.R();
        l.d((Object)r, "preferencesProto.preferencesMap");
        for (final Map$Entry map$Entry : r.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final h h = (h)map$Entry.getValue();
            final j a2 = j.a;
            l.d((Object)s, "name");
            l.d((Object)h, "value");
            a2.d(s, h, b);
        }
        return b.d();
    }
    
    public h0.f e() {
        return h0.g.a();
    }
    
    public Object g(final h0.f f, final b5.c c, final y3.d d) {
        final Map a = f.a();
        final g0.f$a u = g0.f.U();
        for (final Map$Entry map$Entry : a.entrySet()) {
            u.q(((f$a)map$Entry.getKey()).a(), this.f(map$Entry.getValue()));
        }
        ((a)((t$a)u).i()).i(c.s());
        return q.a;
    }
}
