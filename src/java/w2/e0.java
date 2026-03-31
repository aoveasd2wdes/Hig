package w2;

import f3.a$b;
import android.os.Build$VERSION;
import y2.e;
import y2.d;
import java.util.Iterator;
import java.util.Map$Entry;
import android.util.Log;
import k3.k$d;
import k3.j;
import k3.l;
import k3.p;
import k3.c;
import java.util.HashMap;
import k3.k;
import android.content.Context;
import java.util.Map;
import k3.k$c;
import f3.a;

public class e0 implements a, k$c
{
    static final Map e;
    static final Map f;
    private static final Object g;
    private static final Object h;
    static int i;
    static String j;
    private static int k;
    private static int l;
    private static int m;
    private static q n;
    private Context c;
    private k d;
    
    static {
        e = (Map)new HashMap();
        f = (Map)new HashMap();
        g = new Object();
        h = new Object();
        e0.i = 0;
        e0.k = 0;
        e0.l = 1;
        e0.m = 0;
    }
    
    static Map A(final int n, final boolean b, final boolean b2) {
        final HashMap hashMap = new HashMap();
        ((Map)hashMap).put((Object)"id", (Object)n);
        if (b) {
            ((Map)hashMap).put((Object)"recovered", (Object)Boolean.TRUE);
        }
        if (b2) {
            ((Map)hashMap).put((Object)"recoveredInTransaction", (Object)Boolean.TRUE);
        }
        return (Map)hashMap;
    }
    
    private void B(final Context c, final c c2) {
        this.c = c;
        (this.d = new k(c2, "com.tekartik.sqflite", (l)p.b, c2.f())).e((k$c)this);
    }
    
    private void C(final j j, final k$d k$d) {
        final w2.k q = this.q(j, k$d);
        if (q == null) {
            return;
        }
        e0.n.c(q, (Runnable)new d0(q, j, k$d));
    }
    
    private void D(final j j, final k$d k$d) {
        final int intValue = (int)j.a("id");
        final w2.k q = this.q(j, k$d);
        if (q == null) {
            return;
        }
        if (t.b(q.d)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(q.A());
            sb.append("closing ");
            sb.append(intValue);
            sb.append(" ");
            sb.append(q.b);
            Log.d("Sqflite", sb.toString());
        }
        final String b = q.b;
        final Object g = e0.g;
        synchronized (g) {
            e0.f.remove((Object)intValue);
            if (q.a) {
                e0.e.remove((Object)b);
            }
            monitorexit(g);
            e0.n.c(q, (Runnable)new e0$a(this, q, k$d));
        }
    }
    
    private void E(final j j, final k$d k$d) {
        k$d.a((Object)w2.k.x((String)j.a("path")));
    }
    
    private void F(final j j, final k$d k$d) {
        final String s = (String)j.a("cmd");
        final HashMap hashMap = new HashMap();
        if ("get".equals((Object)s)) {
            final int i = e0.i;
            if (i > 0) {
                ((Map)hashMap).put((Object)"logLevel", (Object)i);
            }
            final Map f = e0.f;
            if (!f.isEmpty()) {
                final HashMap hashMap2 = new HashMap();
                for (final Map$Entry map$Entry : f.entrySet()) {
                    final w2.k k = (w2.k)map$Entry.getValue();
                    final HashMap hashMap3 = new HashMap();
                    ((Map)hashMap3).put((Object)"path", (Object)k.b);
                    ((Map)hashMap3).put((Object)"singleInstance", (Object)k.a);
                    final int d = k.d;
                    if (d > 0) {
                        ((Map)hashMap3).put((Object)"logLevel", (Object)d);
                    }
                    ((Map)hashMap2).put((Object)((Integer)map$Entry.getKey()).toString(), (Object)hashMap3);
                }
                ((Map)hashMap).put((Object)"databases", (Object)hashMap2);
            }
        }
        k$d.a((Object)hashMap);
    }
    
    private void G(final j j, final k$d k$d) {
        x2.a.a = Boolean.TRUE.equals(j.b());
        x2.a.c = (x2.a.b && x2.a.a);
        if (x2.a.a) {
            if (x2.a.c) {
                e0.i = 2;
            }
            else if (x2.a.a) {
                e0.i = 1;
            }
        }
        else {
            e0.i = 0;
        }
        k$d.a((Object)null);
    }
    
    private void H(final j j, final k$d k$d) {
        final String s = (String)j.a("path");
        final Object g = e0.g;
        synchronized (g) {
            if (t.c(e0.i)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Look for ");
                sb.append(s);
                sb.append(" in ");
                sb.append((Object)e0.e.keySet());
                Log.d("Sqflite", sb.toString());
            }
            final Map e = e0.e;
            final Integer n = (Integer)e.get((Object)s);
            w2.k i = null;
            Label_0266: {
                if (n != null) {
                    final Map f = e0.f;
                    final w2.k k = (w2.k)f.get((Object)n);
                    if (k != null && k.i.isOpen()) {
                        if (t.c(e0.i)) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(k.A());
                            sb2.append("found single instance ");
                            String s2;
                            if (k.F()) {
                                s2 = "(in transaction) ";
                            }
                            else {
                                s2 = "";
                            }
                            sb2.append(s2);
                            sb2.append((Object)n);
                            sb2.append(" ");
                            sb2.append(s);
                            Log.d("Sqflite", sb2.toString());
                        }
                        f.remove((Object)n);
                        e.remove((Object)s);
                        i = k;
                        break Label_0266;
                    }
                }
                i = null;
            }
            monitorexit(g);
            final e0$b e0$b = new e0$b(this, i, s, k$d);
            final q n2 = e0.n;
            if (n2 != null) {
                n2.c(i, (Runnable)e0$b);
            }
            else {
                ((Runnable)e0$b).run();
            }
        }
    }
    
    private void I(final j j, final k$d k$d) {
        final w2.k q = this.q(j, k$d);
        if (q == null) {
            return;
        }
        e0.n.c(q, (Runnable)new z(j, k$d, q));
    }
    
    private void K(final j j, final k$d k$d) {
        final w2.k q = this.q(j, k$d);
        if (q == null) {
            return;
        }
        e0.n.c(q, (Runnable)new w(j, k$d, q));
    }
    
    private void L(final j j, final k$d k$d) {
        final String s = (String)j.a("path");
        Object o = j.a("readOnly");
        final boolean r = r(s);
        final boolean b = !Boolean.FALSE.equals(j.a("singleInstance")) && !r;
        if (b) {
            final Object g = e0.g;
            synchronized (g) {
                if (t.c(e0.i)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Look for ");
                    sb.append(s);
                    sb.append(" in ");
                    sb.append((Object)e0.e.keySet());
                    Log.d("Sqflite", sb.toString());
                }
                final Integer n = (Integer)e0.e.get((Object)s);
                if (n != null) {
                    final w2.k k = (w2.k)e0.f.get((Object)n);
                    if (k != null) {
                        if (k.i.isOpen()) {
                            if (t.c(e0.i)) {
                                o = new StringBuilder();
                                ((StringBuilder)o).append(k.A());
                                ((StringBuilder)o).append("re-opened single instance ");
                                String s2;
                                if (k.F()) {
                                    s2 = "(in transaction) ";
                                }
                                else {
                                    s2 = "";
                                }
                                ((StringBuilder)o).append(s2);
                                ((StringBuilder)o).append((Object)n);
                                ((StringBuilder)o).append(" ");
                                ((StringBuilder)o).append(s);
                                Log.d("Sqflite", ((StringBuilder)o).toString());
                            }
                            k$d.a((Object)A(n, true, k.F()));
                            return;
                        }
                        if (t.c(e0.i)) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(k.A());
                            sb2.append("single instance database of ");
                            sb2.append(s);
                            sb2.append(" not opened");
                            Log.d("Sqflite", sb2.toString());
                        }
                    }
                }
            }
        }
        final Object g2 = e0.g;
        synchronized (g2) {
            final int n2 = ++e0.m;
            monitorexit(g2);
            final w2.k i = new w2.k(this.c, s, n2, b, e0.i);
            synchronized (g2) {
                if (e0.n == null) {
                    (e0.n = w2.p.b("Sqflite", e0.l, e0.k)).start();
                    if (t.b(i.d)) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append(i.A());
                        sb3.append("starting worker pool with priority ");
                        sb3.append(e0.k);
                        Log.d("Sqflite", sb3.toString());
                    }
                }
                i.h = e0.n;
                if (t.b(i.d)) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(i.A());
                    sb4.append("opened ");
                    sb4.append(n2);
                    sb4.append(" ");
                    sb4.append(s);
                    Log.d("Sqflite", sb4.toString());
                }
                e0.n.c(i, (Runnable)new b0(r, s, k$d, (Boolean)o, i, j, b, n2));
            }
        }
    }
    
    private void N(final j j, final k$d k$d) {
        final w2.k q = this.q(j, k$d);
        if (q == null) {
            return;
        }
        e0.n.c(q, (Runnable)new a0(j, k$d, q));
    }
    
    private void O(final j j, final k$d k$d) {
        final w2.k q = this.q(j, k$d);
        if (q == null) {
            return;
        }
        e0.n.c(q, (Runnable)new x(j, k$d, q));
    }
    
    private void P(final j j, final k$d k$d) {
        final w2.k q = this.q(j, k$d);
        if (q == null) {
            return;
        }
        e0.n.c(q, (Runnable)new c0(j, q, k$d));
    }
    
    private void Q(final j j, final k$d k$d) {
        final w2.k q = this.q(j, k$d);
        if (q == null) {
            return;
        }
        e0.n.c(q, (Runnable)new y(j, k$d, q));
    }
    
    private void o(final w2.k k) {
        try {
            if (t.b(k.d)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(k.A());
                sb.append("closing database ");
                Log.d("Sqflite", sb.toString());
            }
            k.k();
        }
        catch (final Exception ex) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("error ");
            sb2.append((Object)ex);
            sb2.append(" while closing database ");
            sb2.append(e0.m);
            Log.e("Sqflite", sb2.toString());
        }
        final Object g = e0.g;
        synchronized (g) {
            if (e0.f.isEmpty() && e0.n != null) {
                if (t.b(k.d)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(k.A());
                    sb3.append("stopping thread");
                    Log.d("Sqflite", sb3.toString());
                }
                e0.n.b();
                e0.n = null;
            }
        }
    }
    
    private w2.k p(final int n) {
        return (w2.k)e0.f.get((Object)n);
    }
    
    private w2.k q(final j j, final k$d k$d) {
        final int intValue = (int)j.a("id");
        final w2.k p2 = this.p(intValue);
        if (p2 != null) {
            return p2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("database_closed ");
        sb.append(intValue);
        k$d.b("sqlite_error", sb.toString(), (Object)null);
        return null;
    }
    
    static boolean r(final String s) {
        return s == null || s.equals((Object)":memory:");
    }
    
    void J(final j j, final k$d k$d) {
        if (e0.j == null) {
            e0.j = this.c.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        k$d.a((Object)e0.j);
    }
    
    void M(final j j, final k$d k$d) {
        final Object a = j.a("androidThreadPriority");
        if (a != null) {
            e0.k = (int)a;
        }
        final Object a2 = j.a("androidThreadCount");
        if (a2 != null && !a2.equals(e0.l)) {
            e0.l = (int)a2;
            final q n = e0.n;
            if (n != null) {
                n.b();
                e0.n = null;
            }
        }
        final Integer a3 = t.a(j);
        if (a3 != null) {
            e0.i = a3;
        }
        k$d.a((Object)null);
    }
    
    public void a(final j j, final k$d k$d) {
        final String a = j.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1863829223: {
                if (!a.equals((Object)"getDatabasesPath")) {
                    break;
                }
                n = 15;
                break;
            }
            case 1385449135: {
                if (!a.equals((Object)"getPlatformVersion")) {
                    break;
                }
                n = 14;
                break;
            }
            case 1193546321: {
                if (!a.equals((Object)"queryCursorNext")) {
                    break;
                }
                n = 13;
                break;
            }
            case 956410295: {
                if (!a.equals((Object)"databaseExists")) {
                    break;
                }
                n = 12;
                break;
            }
            case 107944136: {
                if (!a.equals((Object)"query")) {
                    break;
                }
                n = 11;
                break;
            }
            case 95458899: {
                if (!a.equals((Object)"debug")) {
                    break;
                }
                n = 10;
                break;
            }
            case 93509434: {
                if (!a.equals((Object)"batch")) {
                    break;
                }
                n = 9;
                break;
            }
            case -17190427: {
                if (!a.equals((Object)"openDatabase")) {
                    break;
                }
                n = 8;
                break;
            }
            case -198450538: {
                if (!a.equals((Object)"debugMode")) {
                    break;
                }
                n = 7;
                break;
            }
            case -263511994: {
                if (!a.equals((Object)"deleteDatabase")) {
                    break;
                }
                n = 6;
                break;
            }
            case -396289107: {
                if (!a.equals((Object)"androidSetLocale")) {
                    break;
                }
                n = 5;
                break;
            }
            case -838846263: {
                if (!a.equals((Object)"update")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1183792455: {
                if (!a.equals((Object)"insert")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1249474914: {
                if (!a.equals((Object)"options")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1253581933: {
                if (!a.equals((Object)"closeDatabase")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1319569547: {
                if (!a.equals((Object)"execute")) {
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
            case 15: {
                this.J(j, k$d);
                break;
            }
            case 14: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Android ");
                sb.append(Build$VERSION.RELEASE);
                k$d.a((Object)sb.toString());
                break;
            }
            case 13: {
                this.O(j, k$d);
                break;
            }
            case 12: {
                this.E(j, k$d);
                break;
            }
            case 11: {
                this.N(j, k$d);
                break;
            }
            case 10: {
                this.F(j, k$d);
                break;
            }
            case 9: {
                this.C(j, k$d);
                break;
            }
            case 8: {
                this.L(j, k$d);
                break;
            }
            case 7: {
                this.G(j, k$d);
                break;
            }
            case 6: {
                this.H(j, k$d);
                break;
            }
            case 5: {
                this.P(j, k$d);
                break;
            }
            case 4: {
                this.Q(j, k$d);
                break;
            }
            case 3: {
                this.K(j, k$d);
                break;
            }
            case 2: {
                this.M(j, k$d);
                break;
            }
            case 1: {
                this.D(j, k$d);
                break;
            }
            case 0: {
                this.I(j, k$d);
                break;
            }
        }
    }
    
    public void g(final a$b a$b) {
        this.B(a$b.a(), a$b.b());
    }
    
    public void k(final a$b a$b) {
        this.c = null;
        this.d.e((k$c)null);
        this.d = null;
    }
}
