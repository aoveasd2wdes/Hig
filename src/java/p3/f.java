package p3;

import h2.j;
import h2.i;
import h2.k;
import java.io.InputStream;
import java.io.IOException;
import com.google.android.gms.maps.model.LatLngBounds$a;
import java.util.Arrays;
import com.google.android.gms.maps.model.LatLngBounds;
import h2.h;
import h2.v;
import h2.t;
import h2.d;
import h2.e;
import android.graphics.Point;
import com.google.android.gms.maps.model.CameraPosition$a;
import com.google.android.gms.maps.model.CameraPosition;
import f2.e$a;
import java.util.Map;
import a3.a;
import h2.c;
import h2.b;
import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import h2.z;
import java.util.Iterator;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

abstract class f
{
    static List A(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        for (final x.i0 i0 : list) {
            ((List)list2).add((Object)new LatLng((double)i0.b(), (double)i0.c()));
        }
        return (List)list2;
    }
    
    static z B(final x.v0 v0) {
        return new z(v0.d().intValue(), v0.c().intValue(), v0.b());
    }
    
    private static Bitmap C(final byte[] array) {
        final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(array, 0, array.length);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new IllegalArgumentException("Unable to decode bytes as a valid bitmap.");
    }
    
    private static h2.b D(final x.g g, final AssetManager assetManager, final float n) {
        return E(g, assetManager, n, new b());
    }
    
    private static h2.b E(final x.g g, final AssetManager assetManager, final float n, final b b) {
        final Object b2 = g.b();
        if (b2 instanceof x.m) {
            final x.m m = (x.m)b2;
            if (m.b() == null) {
                return h2.c.a();
            }
            return h2.c.b(m.b().floatValue());
        }
        else if (b2 instanceof x.h) {
            final x.h h = (x.h)b2;
            final String b3 = h.b();
            final String c = h.c();
            if (c == null) {
                return h2.c.c(a.e().c().i(b3));
            }
            return h2.c.c(a.e().c().j(b3, c));
        }
        else {
            if (b2 instanceof x.i) {
                return h2.c.c(a.e().c().i(((x.i)b2).b()));
            }
            if (b2 instanceof x.k) {
                return h((x.k)b2);
            }
            if (b2 instanceof x.j) {
                return f((x.j)b2, assetManager, n, b, new c());
            }
            if (b2 instanceof x.l) {
                return g((x.l)b2, n, b);
            }
            throw new IllegalArgumentException("PlatformBitmap did not contain a supported subtype.");
        }
    }
    
    private static double F(final Object o) {
        return ((Number)o).doubleValue();
    }
    
    private static float G(final Object o) {
        return ((Number)o).floatValue();
    }
    
    static r2.a H(final Object o) {
        final Map m = M(o);
        final List l = L(m.get((Object)"colors"));
        final int[] array = new int[l.size()];
        final int n = 0;
        for (int i = 0; i < l.size(); ++i) {
            array[i] = J(l.get(i));
        }
        final List j = L(m.get((Object)"startPoints"));
        final float[] array2 = new float[j.size()];
        for (int k = n; k < j.size(); ++k) {
            array2[k] = G(j.get(k));
        }
        return new r2.a(array, array2, J(m.get((Object)"colorMapSize")));
    }
    
    private static List I(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((List)list2).add((Object)A((List)iterator.next()));
        }
        return (List)list2;
    }
    
    private static int J(final Object o) {
        return ((Number)o).intValue();
    }
    
    static LatLng K(final Object o) {
        final List l = L(o);
        return new LatLng(F(l.get(0)), F(l.get(1)));
    }
    
    private static List L(final Object o) {
        return (List)o;
    }
    
    private static Map M(final Object o) {
        return (Map)o;
    }
    
    static e$a N(final x.u0 u0) {
        if (u0 == null) {
            return null;
        }
        final int n = f$a.c[u0.ordinal()];
        if (n == 1) {
            return e$a.f;
        }
        if (n != 2) {
            return null;
        }
        return e$a.e;
    }
    
    static int O(final x.m0 m0) {
        final int n = f$a.b[m0.ordinal()];
        if (n == 1) {
            return 0;
        }
        if (n == 3) {
            return 2;
        }
        if (n == 4) {
            return 3;
        }
        if (n != 5) {
            return 1;
        }
        return 4;
    }
    
    private static Bitmap P(final Bitmap bitmap, final float n) {
        Bitmap q = bitmap;
        if (Math.abs(n - 1.0f) > 0.001f) {
            q = bitmap;
            if (n > 0.0f) {
                q = Q(bitmap, (int)(bitmap.getWidth() * n), (int)(bitmap.getHeight() * n));
            }
        }
        return q;
    }
    
    private static Bitmap Q(final Bitmap bitmap, final int n, final int n2) {
        Bitmap scaledBitmap = bitmap;
        if (n > 0) {
            scaledBitmap = bitmap;
            if (n2 > 0) {
                if (bitmap.getWidth() == n) {
                    scaledBitmap = bitmap;
                    if (bitmap.getHeight() == n2) {
                        return scaledBitmap;
                    }
                }
                scaledBitmap = Bitmap.createScaledBitmap(bitmap, n, n2, true);
            }
        }
        return scaledBitmap;
    }
    
    static List R(final Object o) {
        final List l = L(o);
        final ArrayList list = new ArrayList(l.size());
        final Iterator iterator = l.iterator();
        while (iterator.hasNext()) {
            ((List)list).add((Object)S(iterator.next()));
        }
        return (List)list;
    }
    
    static r2.c S(final Object o) {
        final List l = L(o);
        return new r2.c(K(l.get(0)), F(l.get(1)));
    }
    
    static CameraPosition a(final x.n n) {
        final CameraPosition$a a = CameraPosition.a();
        a.a(n.b().floatValue());
        a.c(t(n.c()));
        a.d(n.d().floatValue());
        a.e(n.e().floatValue());
        return a.b();
    }
    
    static x.n b(final CameraPosition cameraPosition) {
        return new x.n.a().b((double)cameraPosition.d).c(u(cameraPosition.a)).d((double)cameraPosition.c).e((double)cameraPosition.b).a();
    }
    
    static f2.a c(final x.p p2, float floatValue) {
        final Object b = p2.b();
        if (b instanceof x.q) {
            return f2.b.a(a(((x.q)b).b()));
        }
        if (b instanceof x.r) {
            return f2.b.b(t(((x.r)b).b()));
        }
        if (b instanceof x.t) {
            final x.t t = (x.t)b;
            return f2.b.d(t(t.b()), t.c().floatValue());
        }
        if (b instanceof x.s) {
            final x.s s = (x.s)b;
            return f2.b.c(r(s.b()), (int)(s.c() * floatValue));
        }
        if (b instanceof x.u) {
            final x.u u = (x.u)b;
            return f2.b.e(u.b().floatValue() * floatValue, u.c().floatValue() * floatValue);
        }
        if (b instanceof x.w) {
            final x.w w = (x.w)b;
            final Point x = x(w.c(), floatValue);
            floatValue = w.b().floatValue();
            f2.a a;
            if (x != null) {
                a = f2.b.g(floatValue, x);
            }
            else {
                a = f2.b.f(floatValue);
            }
            return a;
        }
        if (b instanceof x.x) {
            return f2.b.j(((x.x)b).b().floatValue());
        }
        if (b instanceof x.v) {
            f2.a a2;
            if (((x.v)b).b()) {
                a2 = f2.b.i();
            }
            else {
                a2 = f2.b.h();
            }
            return a2;
        }
        throw new IllegalArgumentException("PlatformCameraUpdate's cameraUpdate field must be one of the PlatformCameraUpdate... case classes.");
    }
    
    private static e d(final x.y y, final AssetManager assetManager, final float n) {
        final int n2 = f$a.f[y.d().ordinal()];
        if (n2 == 1) {
            return (e)new d();
        }
        if (n2 == 2) {
            return (e)new t();
        }
        if (n2 == 3) {
            return (e)new v();
        }
        if (n2 != 4) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized PlatformCap type: ");
            sb.append((Object)y.d());
            throw new IllegalArgumentException(sb.toString());
        }
        if (y.c() != null) {
            return (e)new h(D(y.b(), assetManager, n), y.c().floatValue());
        }
        throw new IllegalArgumentException("A Custom Cap must specify a refWidth value.");
    }
    
    static x.b0 e(final String s, final m2.a a) {
        final int e = a.e();
        final String[] array = new String[e];
        final p3.t[] array2 = (p3.t[])a.d().toArray((Object[])new p3.t[e]);
        final LatLngBounds$a a2 = LatLngBounds.a();
        for (int i = 0; i < e; ++i) {
            final p3.t t = array2[i];
            a2.b(t.c());
            array[i] = t.r();
        }
        return new x.b0.a().c(s).e(u(a.c())).b(s(a2.a())).d(Arrays.asList((Object[])array)).a();
    }
    
    public static h2.b f(x.j j, final AssetManager assetManager, final float n, final b b, c open) {
        final String a = open.a(j.b());
        if (f$a.a[j.c().ordinal()] != 1) {
            return b.a(a);
        }
        final Double f = j.f();
        final Double d = j.d();
        open = null;
        while (true) {
            try {
                try {
                    final InputStream inputStream = (InputStream)(open = (c)assetManager.open(a));
                    final Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                    if (f == null && d == null) {
                        open = (c)inputStream;
                        j = (x.j)b.b(P(decodeStream, n / j.e().floatValue()));
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            }
                            catch (final IOException ex) {
                                ((Throwable)ex).printStackTrace();
                            }
                        }
                        return (h2.b)j;
                    }
                    int n2;
                    if (f != null) {
                        open = (c)inputStream;
                        n2 = J(f * n);
                    }
                    else {
                        open = (c)inputStream;
                        n2 = decodeStream.getWidth();
                    }
                    int n3;
                    if (d != null) {
                        open = (c)inputStream;
                        n3 = J(d * n);
                    }
                    else {
                        open = (c)inputStream;
                        n3 = decodeStream.getHeight();
                    }
                    int n4;
                    int n5;
                    if (f != null && d == null) {
                        open = (c)inputStream;
                        n4 = (int)(n2 * (decodeStream.getHeight() / (double)decodeStream.getWidth()));
                        n5 = n2;
                    }
                    else {
                        n5 = n2;
                        n4 = n3;
                        if (d != null) {
                            n5 = n2;
                            n4 = n3;
                            if (f == null) {
                                open = (c)inputStream;
                                n5 = (int)(n3 * (decodeStream.getWidth() / (double)decodeStream.getHeight()));
                                n4 = n3;
                            }
                        }
                    }
                    open = (c)inputStream;
                    j = (x.j)b.b(Q(decodeStream, n5, n4));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (final IOException ex2) {
                            ((Throwable)ex2).printStackTrace();
                        }
                    }
                    return (h2.b)j;
                }
                finally {
                    if (open != null) {
                        final c c = open;
                        ((InputStream)c).close();
                    }
                }
            }
            catch (final Exception ex3) {}
            try {
                final c c = open;
                ((InputStream)c).close();
                continue;
            }
            catch (final IOException ex4) {}
            break;
        }
    }
    
    public static h2.b g(final x.l l, final float n, final b b) {
        try {
            final Bitmap c = C(l.c());
            if (f$a.a[l.b().ordinal()] != 1) {
                return b.b(c);
            }
            final Double f = l.f();
            final Double d = l.d();
            if (f == null && d == null) {
                return b.b(P(c, n / l.e().floatValue()));
            }
            int n2;
            if (f != null) {
                n2 = J(f * n);
            }
            else {
                n2 = c.getWidth();
            }
            int n3;
            if (d != null) {
                n3 = J(d * n);
            }
            else {
                n3 = c.getHeight();
            }
            int n4;
            int n5;
            if (f != null && d == null) {
                n4 = (int)(n2 * (c.getHeight() / (double)c.getWidth()));
                n5 = n2;
            }
            else {
                n5 = n2;
                n4 = n3;
                if (d != null) {
                    n5 = n2;
                    n4 = n3;
                    if (f == null) {
                        n5 = (int)(n3 * (c.getWidth() / (double)c.getHeight()));
                        n4 = n3;
                    }
                }
            }
            return b.b(Q(c, n5, n4));
        }
        catch (final Exception ex) {
            throw new IllegalArgumentException("Unable to interpret bytes as a valid image.", (Throwable)ex);
        }
    }
    
    private static h2.b h(final x.k k) {
        try {
            return h2.c.d(C(k.b()));
        }
        catch (final Exception ex) {
            throw new IllegalArgumentException("Unable to interpret bytes as a valid image.", (Throwable)ex);
        }
    }
    
    static String i(final x.a0 a0, final p3.c c) {
        c.b(a0.d());
        c.e(a0.e().intValue());
        c.c(a0.g().intValue());
        c.f(a0.h());
        c.a(a0.j().floatValue());
        c.h(K(a0.b().f()));
        c.g(a0.f());
        c.setVisible(a0.i());
        return a0.c();
    }
    
    static String j(final Map map, final q q) {
        final Object value = map.get((Object)"data");
        if (value != null) {
            q.a(R(value));
        }
        final Object value2 = map.get((Object)"gradient");
        if (value2 != null) {
            q.b(H(value2));
        }
        final Object value3 = map.get((Object)"maxIntensity");
        if (value3 != null) {
            q.d(F(value3));
        }
        final Object value4 = map.get((Object)"opacity");
        if (value4 != null) {
            q.e(F(value4));
        }
        final Object value5 = map.get((Object)"radius");
        if (value5 != null) {
            q.c(J(value5));
        }
        final String s = (String)map.get((Object)"heatmapId");
        if (s != null) {
            return s;
        }
        throw new IllegalArgumentException("heatmapId was null");
    }
    
    private static void k(final p3.v v, final x.g0 g0) {
        final String d = g0.d();
        if (d != null) {
            v.n(d, g0.c());
        }
        final x.d0 b = g0.b();
        v.i(b.b().floatValue(), b.c().floatValue());
    }
    
    static void l(final x.l0 l0, final m m) {
        final x.o c = l0.c();
        if (c != null) {
            final x.j0 b = c.b();
            LatLngBounds r;
            if (b == null) {
                r = null;
            }
            else {
                r = r(b);
            }
            m.J(r);
        }
        final Boolean e = l0.e();
        if (e != null) {
            m.C(e);
        }
        final Boolean h = l0.h();
        if (h != null) {
            m.F(h);
        }
        final x.m0 i = l0.i();
        if (i != null) {
            m.m(O(i));
        }
        final x.y0 j = l0.j();
        if (j != null) {
            m.w0(v(j.c()), v(j.b()));
        }
        final x.e0 k = l0.m();
        if (k != null) {
            m.f(k.e().floatValue(), k.c().floatValue(), k.b().floatValue(), k.d().floatValue());
        }
        final Boolean n = l0.n();
        if (n != null) {
            m.T(n);
        }
        final Boolean o = l0.o();
        if (o != null) {
            m.N(o);
        }
        final Boolean q = l0.q();
        if (q != null) {
            m.A(q);
        }
        final Boolean r2 = l0.r();
        if (r2 != null) {
            m.k0(r2);
        }
        final Boolean u = l0.u();
        if (u != null) {
            m.E(u);
        }
        final Boolean g = l0.g();
        if (g != null) {
            m.v0(g);
        }
        final Boolean l2 = l0.l();
        if (l2 != null) {
            m.B(l2);
        }
        final Boolean t = l0.t();
        if (t != null) {
            m.O(t);
        }
        final Boolean k2 = l0.k();
        if (k2 != null) {
            m.z(k2);
        }
        final Boolean f = l0.f();
        if (f != null) {
            m.w(f);
        }
        final Boolean s = l0.s();
        if (s != null) {
            m.Q(s);
        }
        final Boolean b2 = l0.b();
        if (b2 != null) {
            m.o(b2);
        }
        final String p2 = l0.p();
        if (p2 != null) {
            m.h0(p2);
        }
    }
    
    static void m(final x.o0 o0, final p3.v v, final AssetManager assetManager, final float n, final b b) {
        v.d(o0.b().floatValue());
        v.k(o0.c().b().floatValue(), o0.c().c().floatValue());
        v.b(o0.e());
        v.f(o0.f());
        v.g(o0.g());
        v.e(E(o0.h(), assetManager, n, b));
        k(v, o0.i());
        v.l(K(o0.k().f()));
        v.j(o0.l().floatValue());
        v.setVisible(o0.m());
        v.a(o0.n().floatValue());
    }
    
    static String n(final x.s0 s0, final e2 e2) {
        e2.b(s0.b());
        e2.d(s0.d());
        e2.setVisible(s0.j());
        e2.e(s0.c().intValue());
        e2.c(s0.h().intValue());
        e2.f(s0.i());
        e2.a(s0.k());
        e2.g(A(s0.f()));
        e2.h(I(s0.e()));
        return s0.g();
    }
    
    static String o(final x.t0 t0, final i2 i2, final AssetManager assetManager, final float n) {
        i2.b(t0.c());
        i2.h(t0.b().intValue());
        i2.c(d(t0.d(), assetManager, n));
        i2.f(d(t0.j(), assetManager, n));
        i2.d(t0.e());
        i2.i(q(t0.f()));
        i2.setVisible(t0.k());
        i2.j(t0.l());
        i2.a(t0.m());
        i2.g(A(t0.h()));
        i2.e(w(t0.g()));
        return t0.i();
    }
    
    static String p(final x.x0 x0, final m2 m2) {
        m2.b(x0.b());
        m2.c(x0.d().floatValue());
        m2.a(x0.f());
        m2.setVisible(x0.e());
        return x0.c();
    }
    
    static int q(final x.h0 h0) {
        final int n = f$a.d[h0.ordinal()];
        if (n == 2) {
            return 1;
        }
        if (n != 3) {
            return 0;
        }
        return 2;
    }
    
    static LatLngBounds r(final x.j0 j0) {
        return new LatLngBounds(t(j0.c()), t(j0.b()));
    }
    
    static x.j0 s(final LatLngBounds latLngBounds) {
        return new x.j0.a().b(u(latLngBounds.b)).c(u(latLngBounds.a)).a();
    }
    
    static LatLng t(final x.i0 i0) {
        return new LatLng((double)i0.b(), (double)i0.c());
    }
    
    static x.i0 u(final LatLng latLng) {
        return new x.i0.a().b(latLng.a).c(latLng.b).a();
    }
    
    private static Float v(final Double n) {
        Float value;
        if (n == null) {
            value = null;
        }
        else {
            value = n.floatValue();
        }
        return value;
    }
    
    private static List w(final List list) {
        if (list.isEmpty()) {
            return null;
        }
        final ArrayList list2 = new ArrayList();
        for (final x.p0 p : list) {
            final int n = f$a.e[p.c().ordinal()];
            if (n != 1) {
                Object o;
                if (n != 2) {
                    if (n != 3) {
                        continue;
                    }
                    o = new k(p.b().floatValue());
                }
                else {
                    o = new i(p.b().floatValue());
                }
                ((List)list2).add(o);
            }
            else {
                ((List)list2).add((Object)new j());
            }
        }
        return (List)list2;
    }
    
    static Point x(final x.d0 d0, final float n) {
        if (d0 == null) {
            return null;
        }
        final double doubleValue = d0.b();
        final double n2 = n;
        return new Point((int)(doubleValue * n2), (int)(d0.c() * n2));
    }
    
    static Point y(final x.r0 r0) {
        return new Point(r0.b().intValue(), r0.c().intValue());
    }
    
    static x.r0 z(final Point point) {
        return new x.r0.a().b((long)point.x).c((long)point.y).a();
    }
    
    static class b
    {
        public h2.b a(final String s) {
            return h2.c.c(s);
        }
        
        public h2.b b(final Bitmap bitmap) {
            return h2.c.d(bitmap);
        }
    }
    
    static class c
    {
        public String a(final String s) {
            return a.e().c().i(s);
        }
    }
}
