package p3;

import java.util.Map;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import k3.a$e;
import k3.a;
import k3.i;
import k3.c;
import java.util.List;
import java.util.Objects;
import android.util.Log;
import java.util.ArrayList;

public abstract class x
{
    protected static a a(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to establish connection on channel: ");
        sb.append(s);
        sb.append(".");
        return new a("channel-error", sb.toString(), "");
    }
    
    protected static ArrayList b(final Throwable t) {
        final ArrayList list = new ArrayList(3);
        Object o;
        if (t instanceof a) {
            final a a = (a)t;
            list.add((Object)a.e);
            list.add((Object)((Throwable)a).getMessage());
            o = a.f;
        }
        else {
            list.add((Object)t.toString());
            list.add((Object)t.getClass().getSimpleName());
            final StringBuilder sb = new StringBuilder();
            sb.append("Cause: ");
            sb.append((Object)t.getCause());
            sb.append(", Stacktrace: ");
            sb.append(Log.getStackTraceString(t));
            o = sb.toString();
        }
        list.add(o);
        return list;
    }
    
    public static class a extends RuntimeException
    {
        public final String e;
        public final Object f;
        
        public a(final String e, final String s, final Object f) {
            super(s);
            this.e = e;
            this.f = f;
        }
    }
    
    public static final class a0
    {
        private Boolean a;
        private Long b;
        private Long c;
        private Boolean d;
        private Long e;
        private Double f;
        private i0 g;
        private Double h;
        private String i;
        
        a0() {
        }
        
        static a0 a(final ArrayList list) {
            final a0 a0 = new a0();
            a0.m((Boolean)list.get(0));
            a0.n((Long)list.get(1));
            a0.p((Long)list.get(2));
            a0.r((Boolean)list.get(3));
            a0.q((Long)list.get(4));
            a0.s((Double)list.get(5));
            a0.k((i0)list.get(6));
            a0.o((Double)list.get(7));
            a0.l((String)list.get(8));
            return a0;
        }
        
        public i0 b() {
            return this.g;
        }
        
        public String c() {
            return this.i;
        }
        
        public Boolean d() {
            return this.a;
        }
        
        public Long e() {
            return this.b;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && a0.class == o.getClass()) {
                final a0 a0 = (a0)o;
                if (!this.a.equals((Object)a0.a) || !this.b.equals((Object)a0.b) || !this.c.equals((Object)a0.c) || !this.d.equals((Object)a0.d) || !this.e.equals((Object)a0.e) || !this.f.equals((Object)a0.f) || !this.g.equals(a0.g) || !this.h.equals((Object)a0.h) || !this.i.equals((Object)a0.i)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public Double f() {
            return this.h;
        }
        
        public Long g() {
            return this.c;
        }
        
        public Long h() {
            return this.e;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i });
        }
        
        public Boolean i() {
            return this.d;
        }
        
        public Double j() {
            return this.f;
        }
        
        public void k(final i0 g) {
            if (g != null) {
                this.g = g;
                return;
            }
            throw new IllegalStateException("Nonnull field \"center\" is null.");
        }
        
        public void l(final String i) {
            if (i != null) {
                this.i = i;
                return;
            }
            throw new IllegalStateException("Nonnull field \"circleId\" is null.");
        }
        
        public void m(final Boolean a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"consumeTapEvents\" is null.");
        }
        
        public void n(final Long b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"fillColor\" is null.");
        }
        
        public void o(final Double h) {
            if (h != null) {
                this.h = h;
                return;
            }
            throw new IllegalStateException("Nonnull field \"radius\" is null.");
        }
        
        public void p(final Long c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"strokeColor\" is null.");
        }
        
        public void q(final Long e) {
            if (e != null) {
                this.e = e;
                return;
            }
            throw new IllegalStateException("Nonnull field \"strokeWidth\" is null.");
        }
        
        public void r(final Boolean d) {
            if (d != null) {
                this.d = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"visible\" is null.");
        }
        
        public void s(final Double f) {
            if (f != null) {
                this.f = f;
                return;
            }
            throw new IllegalStateException("Nonnull field \"zIndex\" is null.");
        }
        
        ArrayList t() {
            final ArrayList list = new ArrayList(9);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            list.add((Object)this.d);
            list.add((Object)this.e);
            list.add((Object)this.f);
            list.add((Object)this.g);
            list.add((Object)this.h);
            list.add((Object)this.i);
            return list;
        }
    }
    
    public interface a1
    {
        void a();
        
        void b(final Throwable p0);
    }
    
    public interface b
    {
        void A0(final String p0);
        
        void B0(final p p0);
        
        void C0(final List p0, final List p1, final List p2);
        
        j0 D();
        
        void H(final List p0, final List p1, final List p2);
        
        void P(final List p0, final List p1, final List p2);
        
        Boolean S(final String p0);
        
        void Y(final List p0, final List p1, final List p2);
        
        void Z(final a1 p0);
        
        void a0(final List p0, final List p1);
        
        void d0(final String p0);
        
        void e0(final p p0);
        
        Boolean g0();
        
        void j(final z0 p0);
        
        void j0(final List p0, final List p1, final List p2);
        
        i0 p(final r0 p0);
        
        void q(final String p0);
        
        Double q0();
        
        r0 r0(final i0 p0);
        
        Boolean s0(final String p0);
        
        void t0(final List p0, final List p1, final List p2);
        
        void y(final l0 p0);
    }
    
    public static final class b0
    {
        private String a;
        private i0 b;
        private j0 c;
        private List d;
        
        b0() {
        }
        
        static b0 a(final ArrayList list) {
            final b0 b0 = new b0();
            b0.c((String)list.get(0));
            b0.e((i0)list.get(1));
            b0.b((j0)list.get(2));
            b0.d((List)list.get(3));
            return b0;
        }
        
        public void b(final j0 c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"bounds\" is null.");
        }
        
        public void c(final String a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"clusterManagerId\" is null.");
        }
        
        public void d(final List d) {
            if (d != null) {
                this.d = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"markerIds\" is null.");
        }
        
        public void e(final i0 b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"position\" is null.");
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && b0.class == o.getClass()) {
                final b0 b2 = (b0)o;
                if (!this.a.equals((Object)b2.a) || !this.b.equals(b2.b) || !this.c.equals(b2.c) || !this.d.equals((Object)b2.d)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        ArrayList f() {
            final ArrayList list = new ArrayList(4);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            list.add((Object)this.d);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c, this.d });
        }
        
        public static final class a
        {
            private String a;
            private i0 b;
            private j0 c;
            private List d;
            
            public b0 a() {
                final b0 b0 = new b0();
                b0.c(this.a);
                b0.e(this.b);
                b0.b(this.c);
                b0.d(this.d);
                return b0;
            }
            
            public a b(final j0 c) {
                this.c = c;
                return this;
            }
            
            public a c(final String a) {
                this.a = a;
                return this;
            }
            
            public a d(final List d) {
                this.d = d;
                return this;
            }
            
            public a e(final i0 b) {
                this.b = b;
                return this;
            }
        }
    }
    
    public static class c
    {
        private final k3.c a;
        private final String b;
        
        public c(final k3.c a, final String s) {
            this.a = a;
            String string;
            if (s.isEmpty()) {
                string = "";
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(".");
                sb.append(s);
                string = sb.toString();
            }
            this.b = string;
        }
        
        static k3.i p() {
            return (k3.i)x$f.d;
        }
        
        public void G(final a1 a1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onCameraIdle");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)null, (a$e)new p3.v0(a1, string));
        }
        
        public void H(final n n, final a1 a1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onCameraMove");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)new ArrayList((Collection)Collections.singletonList((Object)n)), (a$e)new f1(a1, string));
        }
        
        public void I(final a1 a1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onCameraMoveStarted");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)null, (a$e)new p3.x0(a1, string));
        }
        
        public void J(final String s, final a1 a1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onCircleTap");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)new ArrayList((Collection)Collections.singletonList((Object)s)), (a$e)new e1(a1, string));
        }
        
        public void K(final b0 b0, final a1 a1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onClusterTap");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)new ArrayList((Collection)Collections.singletonList((Object)b0)), (a$e)new p3.z0(a1, string));
        }
        
        public void L(final String s, final a1 a1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onInfoWindowTap");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)new ArrayList((Collection)Collections.singletonList((Object)s)), (a$e)new c1(a1, string));
        }
        
        public void M(final i0 i0, final a1 a1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onLongPress");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)new ArrayList((Collection)Collections.singletonList((Object)i0)), (a$e)new p3.y0(a1, string));
        }
        
        public void N(final String s, final i0 i0, final a1 a1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onMarkerDrag");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)new ArrayList((Collection)Arrays.asList(new Object[] { s, i0 })), (a$e)new b1(a1, string));
        }
        
        public void O(final String s, final i0 i0, final a1 a1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onMarkerDragEnd");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)new ArrayList((Collection)Arrays.asList(new Object[] { s, i0 })), (a$e)new i1(a1, string));
        }
        
        public void P(final String s, final i0 i0, final a1 a1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onMarkerDragStart");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)new ArrayList((Collection)Arrays.asList(new Object[] { s, i0 })), (a$e)new d1(a1, string));
        }
        
        public void Q(final String s, final a1 a1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onMarkerTap");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)new ArrayList((Collection)Collections.singletonList((Object)s)), (a$e)new h1(a1, string));
        }
        
        public void R(final String s, final a1 a1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onPolygonTap");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)new ArrayList((Collection)Collections.singletonList((Object)s)), (a$e)new p3.w0(a1, string));
        }
        
        public void S(final String s, final a1 a1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onPolylineTap");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)new ArrayList((Collection)Collections.singletonList((Object)s)), (a$e)new j1(a1, string));
        }
        
        public void T(final i0 i0, final a1 a1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onTap");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)new ArrayList((Collection)Collections.singletonList((Object)i0)), (a$e)new g1(a1, string));
        }
        
        public void q(final String s, final r0 r0, final Long n, final z0 z0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.getTileOverlayTile");
            sb.append(this.b);
            final String string = sb.toString();
            new a(this.a, string, p()).d((Object)new ArrayList((Collection)Arrays.asList(new Object[] { s, r0, n })), (a$e)new p3.a1(z0, string));
        }
    }
    
    public static final class c0
    {
        private String a;
        
        c0() {
        }
        
        static c0 a(final ArrayList list) {
            final c0 c0 = new c0();
            c0.c((String)list.get(0));
            return c0;
        }
        
        public String b() {
            return this.a;
        }
        
        public void c(final String a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"identifier\" is null.");
        }
        
        ArrayList d() {
            final ArrayList list = new ArrayList(1);
            list.add((Object)this.a);
            return list;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && c0.class == o.getClass() && this.a.equals((Object)((c0)o).a));
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a });
        }
    }
    
    public interface d
    {
        void b(final u0 p0, final z0 p1);
    }
    
    public static final class d0
    {
        private Double a;
        private Double b;
        
        d0() {
        }
        
        static d0 a(final ArrayList list) {
            final d0 d0 = new d0();
            d0.d((Double)list.get(0));
            d0.e((Double)list.get(1));
            return d0;
        }
        
        public Double b() {
            return this.a;
        }
        
        public Double c() {
            return this.b;
        }
        
        public void d(final Double a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"x\" is null.");
        }
        
        public void e(final Double b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"y\" is null.");
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && d0.class == o.getClass()) {
                final d0 d0 = (d0)o;
                if (!this.a.equals((Object)d0.a) || !this.b.equals((Object)d0.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        ArrayList f() {
            final ArrayList list = new ArrayList(2);
            list.add((Object)this.a);
            list.add((Object)this.b);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b });
        }
    }
    
    public interface e
    {
        Boolean D0();
        
        y0 E0();
        
        Boolean F0();
        
        Boolean I();
        
        Boolean K();
        
        Boolean L();
        
        w0 U(final String p0);
        
        Boolean i();
        
        List k(final String p0);
        
        Boolean m0();
        
        Boolean n();
        
        Boolean t();
        
        Boolean v();
        
        Boolean x();
    }
    
    public static final class e0
    {
        private Double a;
        private Double b;
        private Double c;
        private Double d;
        
        e0() {
        }
        
        static e0 a(final ArrayList list) {
            final e0 e0 = new e0();
            e0.i((Double)list.get(0));
            e0.f((Double)list.get(1));
            e0.g((Double)list.get(2));
            e0.h((Double)list.get(3));
            return e0;
        }
        
        public Double b() {
            return this.b;
        }
        
        public Double c() {
            return this.c;
        }
        
        public Double d() {
            return this.d;
        }
        
        public Double e() {
            return this.a;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && e0.class == o.getClass()) {
                final e0 e0 = (e0)o;
                if (!this.a.equals((Object)e0.a) || !this.b.equals((Object)e0.b) || !this.c.equals((Object)e0.c) || !this.d.equals((Object)e0.d)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public void f(final Double b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"bottom\" is null.");
        }
        
        public void g(final Double c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"left\" is null.");
        }
        
        public void h(final Double d) {
            if (d != null) {
                this.d = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"right\" is null.");
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c, this.d });
        }
        
        public void i(final Double a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"top\" is null.");
        }
        
        ArrayList j() {
            final ArrayList list = new ArrayList(4);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            list.add((Object)this.d);
            return list;
        }
    }
    
    public static final class f0
    {
        private Map a;
        
        f0() {
        }
        
        static f0 a(final ArrayList list) {
            final f0 f0 = new f0();
            f0.c((Map)list.get(0));
            return f0;
        }
        
        public Map b() {
            return this.a;
        }
        
        public void c(final Map a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"json\" is null.");
        }
        
        ArrayList d() {
            final ArrayList list = new ArrayList(1);
            list.add((Object)this.a);
            return list;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && f0.class == o.getClass() && this.a.equals((Object)((f0)o).a));
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a });
        }
    }
    
    public static final class g
    {
        private Object a;
        
        g() {
        }
        
        static g a(final ArrayList list) {
            final g g = new g();
            g.c(list.get(0));
            return g;
        }
        
        public Object b() {
            return this.a;
        }
        
        public void c(final Object a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"bitmap\" is null.");
        }
        
        ArrayList d() {
            final ArrayList list = new ArrayList(1);
            list.add(this.a);
            return list;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && g.class == o.getClass() && this.a.equals(((g)o).a));
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a });
        }
    }
    
    public static final class g0
    {
        private String a;
        private String b;
        private d0 c;
        
        g0() {
        }
        
        static g0 a(final ArrayList list) {
            final g0 g0 = new g0();
            g0.g((String)list.get(0));
            g0.f((String)list.get(1));
            g0.e((d0)list.get(2));
            return g0;
        }
        
        public d0 b() {
            return this.c;
        }
        
        public String c() {
            return this.b;
        }
        
        public String d() {
            return this.a;
        }
        
        public void e(final d0 c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"anchor\" is null.");
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && g0.class == o.getClass()) {
                final g0 g0 = (g0)o;
                if (!Objects.equals((Object)this.a, (Object)g0.a) || !Objects.equals((Object)this.b, (Object)g0.b) || !this.c.equals(g0.c)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public void f(final String b) {
            this.b = b;
        }
        
        public void g(final String a) {
            this.a = a;
        }
        
        ArrayList h() {
            final ArrayList list = new ArrayList(3);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c });
        }
    }
    
    public static final class h
    {
        private String a;
        private String b;
        
        h() {
        }
        
        static h a(final ArrayList list) {
            final h h = new h();
            h.d((String)list.get(0));
            h.e((String)list.get(1));
            return h;
        }
        
        public String b() {
            return this.a;
        }
        
        public String c() {
            return this.b;
        }
        
        public void d(final String a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }
        
        public void e(final String b) {
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && h.class == o.getClass()) {
                final h h = (h)o;
                if (!this.a.equals((Object)h.a) || !Objects.equals((Object)this.b, (Object)h.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        ArrayList f() {
            final ArrayList list = new ArrayList(2);
            list.add((Object)this.a);
            list.add((Object)this.b);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b });
        }
    }
    
    public enum h0
    {
        f("MITERED", 0, 0), 
        g("BEVEL", 1, 1), 
        h("ROUND", 2, 2);
        
        private static final h0[] i;
        final int e;
        
        static {
            i = a();
        }
        
        private h0(final String s, final int n, final int e) {
            this.e = e;
        }
        
        private static /* synthetic */ h0[] a() {
            return new h0[] { h0.f, h0.g, h0.h };
        }
    }
    
    public static final class i
    {
        private String a;
        private Double b;
        private d0 c;
        
        i() {
        }
        
        static i a(final ArrayList list) {
            final i i = new i();
            i.c((String)list.get(0));
            i.d((Double)list.get(1));
            i.e((d0)list.get(2));
            return i;
        }
        
        public String b() {
            return this.a;
        }
        
        public void c(final String a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }
        
        public void d(final Double b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"scale\" is null.");
        }
        
        public void e(final d0 c) {
            this.c = c;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && i.class == o.getClass()) {
                final i i = (i)o;
                if (!this.a.equals((Object)i.a) || !this.b.equals((Object)i.b) || !Objects.equals((Object)this.c, (Object)i.c)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        ArrayList f() {
            final ArrayList list = new ArrayList(3);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c });
        }
    }
    
    public static final class i0
    {
        private Double a;
        private Double b;
        
        i0() {
        }
        
        static i0 a(final ArrayList list) {
            final i0 i0 = new i0();
            i0.d((Double)list.get(0));
            i0.e((Double)list.get(1));
            return i0;
        }
        
        public Double b() {
            return this.a;
        }
        
        public Double c() {
            return this.b;
        }
        
        public void d(final Double a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"latitude\" is null.");
        }
        
        public void e(final Double b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"longitude\" is null.");
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && i0.class == o.getClass()) {
                final i0 i0 = (i0)o;
                if (!this.a.equals((Object)i0.a) || !this.b.equals((Object)i0.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        ArrayList f() {
            final ArrayList list = new ArrayList(2);
            list.add((Object)this.a);
            list.add((Object)this.b);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b });
        }
        
        public static final class a
        {
            private Double a;
            private Double b;
            
            public i0 a() {
                final i0 i0 = new i0();
                i0.d(this.a);
                i0.e(this.b);
                return i0;
            }
            
            public a b(final Double a) {
                this.a = a;
                return this;
            }
            
            public a c(final Double b) {
                this.b = b;
                return this;
            }
        }
    }
    
    public static final class j
    {
        private String a;
        private k0 b;
        private Double c;
        private Double d;
        private Double e;
        
        j() {
        }
        
        static j a(final ArrayList list) {
            final j j = new j();
            j.g((String)list.get(0));
            j.h((k0)list.get(1));
            j.j((Double)list.get(2));
            j.k((Double)list.get(3));
            j.i((Double)list.get(4));
            return j;
        }
        
        public String b() {
            return this.a;
        }
        
        public k0 c() {
            return this.b;
        }
        
        public Double d() {
            return this.e;
        }
        
        public Double e() {
            return this.c;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && j.class == o.getClass()) {
                final j j = (j)o;
                if (!this.a.equals((Object)j.a) || !this.b.equals(j.b) || !this.c.equals((Object)j.c) || !Objects.equals((Object)this.d, (Object)j.d) || !Objects.equals((Object)this.e, (Object)j.e)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public Double f() {
            return this.d;
        }
        
        public void g(final String a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"assetName\" is null.");
        }
        
        public void h(final k0 b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"bitmapScaling\" is null.");
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c, this.d, this.e });
        }
        
        public void i(final Double e) {
            this.e = e;
        }
        
        public void j(final Double c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"imagePixelRatio\" is null.");
        }
        
        public void k(final Double d) {
            this.d = d;
        }
        
        ArrayList l() {
            final ArrayList list = new ArrayList(5);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            list.add((Object)this.d);
            list.add((Object)this.e);
            return list;
        }
    }
    
    public static final class j0
    {
        private i0 a;
        private i0 b;
        
        j0() {
        }
        
        static j0 a(final ArrayList list) {
            final j0 j0 = new j0();
            j0.d((i0)list.get(0));
            j0.e((i0)list.get(1));
            return j0;
        }
        
        public i0 b() {
            return this.a;
        }
        
        public i0 c() {
            return this.b;
        }
        
        public void d(final i0 a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"northeast\" is null.");
        }
        
        public void e(final i0 b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"southwest\" is null.");
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && j0.class == o.getClass()) {
                final j0 j0 = (j0)o;
                if (!this.a.equals(j0.a) || !this.b.equals(j0.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        ArrayList f() {
            final ArrayList list = new ArrayList(2);
            list.add((Object)this.a);
            list.add((Object)this.b);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b });
        }
        
        public static final class a
        {
            private i0 a;
            private i0 b;
            
            public j0 a() {
                final j0 j0 = new j0();
                j0.d(this.a);
                j0.e(this.b);
                return j0;
            }
            
            public a b(final i0 a) {
                this.a = a;
                return this;
            }
            
            public a c(final i0 b) {
                this.b = b;
                return this;
            }
        }
    }
    
    public static final class k
    {
        private byte[] a;
        private d0 b;
        
        k() {
        }
        
        static k a(final ArrayList list) {
            final k k = new k();
            k.c((byte[])list.get(0));
            k.d((d0)list.get(1));
            return k;
        }
        
        public byte[] b() {
            return this.a;
        }
        
        public void c(final byte[] a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"byteData\" is null.");
        }
        
        public void d(final d0 b) {
            this.b = b;
        }
        
        ArrayList e() {
            final ArrayList list = new ArrayList(2);
            list.add((Object)this.a);
            list.add((Object)this.b);
            return list;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && k.class == o.getClass()) {
                final k k = (k)o;
                if (!Arrays.equals(this.a, k.a) || !Objects.equals((Object)this.b, (Object)k.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.b }) * 31 + Arrays.hashCode(this.a);
        }
    }
    
    public enum k0
    {
        f("AUTO", 0, 0), 
        g("NONE", 1, 1);
        
        private static final k0[] h;
        final int e;
        
        static {
            h = a();
        }
        
        private k0(final String s, final int n, final int e) {
            this.e = e;
        }
        
        private static /* synthetic */ k0[] a() {
            return new k0[] { k0.f, k0.g };
        }
    }
    
    public static final class l
    {
        private byte[] a;
        private k0 b;
        private Double c;
        private Double d;
        private Double e;
        
        l() {
        }
        
        static l a(final ArrayList list) {
            final l l = new l();
            l.h((byte[])list.get(0));
            l.g((k0)list.get(1));
            l.j((Double)list.get(2));
            l.k((Double)list.get(3));
            l.i((Double)list.get(4));
            return l;
        }
        
        public k0 b() {
            return this.b;
        }
        
        public byte[] c() {
            return this.a;
        }
        
        public Double d() {
            return this.e;
        }
        
        public Double e() {
            return this.c;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && l.class == o.getClass()) {
                final l l = (l)o;
                if (!Arrays.equals(this.a, l.a) || !this.b.equals(l.b) || !this.c.equals((Object)l.c) || !Objects.equals((Object)this.d, (Object)l.d) || !Objects.equals((Object)this.e, (Object)l.e)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public Double f() {
            return this.d;
        }
        
        public void g(final k0 b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"bitmapScaling\" is null.");
        }
        
        public void h(final byte[] a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"byteData\" is null.");
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.b, this.c, this.d, this.e }) * 31 + Arrays.hashCode(this.a);
        }
        
        public void i(final Double e) {
            this.e = e;
        }
        
        public void j(final Double c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"imagePixelRatio\" is null.");
        }
        
        public void k(final Double d) {
            this.d = d;
        }
        
        ArrayList l() {
            final ArrayList list = new ArrayList(5);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            list.add((Object)this.d);
            list.add((Object)this.e);
            return list;
        }
    }
    
    public static final class l0
    {
        private Boolean a;
        private o b;
        private m0 c;
        private y0 d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private Boolean k;
        private Boolean l;
        private Boolean m;
        private e0 n;
        private Boolean o;
        private Boolean p;
        private Boolean q;
        private Boolean r;
        private String s;
        private String t;
        
        static l0 a(final ArrayList list) {
            final l0 l0 = new l0();
            l0.y((Boolean)list.get(0));
            l0.w((o)list.get(1));
            l0.C((m0)list.get(2));
            l0.D((y0)list.get(3));
            l0.B((Boolean)list.get(4));
            l0.H((Boolean)list.get(5));
            l0.I((Boolean)list.get(6));
            l0.K((Boolean)list.get(7));
            l0.L((Boolean)list.get(8));
            l0.N((Boolean)list.get(9));
            l0.O((Boolean)list.get(10));
            l0.F((Boolean)list.get(11));
            l0.E((Boolean)list.get(12));
            l0.G((e0)list.get(13));
            l0.z((Boolean)list.get(14));
            l0.M((Boolean)list.get(15));
            l0.v((Boolean)list.get(16));
            l0.A((Boolean)list.get(17));
            l0.x((String)list.get(18));
            l0.J((String)list.get(19));
            return l0;
        }
        
        public void A(final Boolean r) {
            this.r = r;
        }
        
        public void B(final Boolean e) {
            this.e = e;
        }
        
        public void C(final m0 c) {
            this.c = c;
        }
        
        public void D(final y0 d) {
            this.d = d;
        }
        
        public void E(final Boolean m) {
            this.m = m;
        }
        
        public void F(final Boolean l) {
            this.l = l;
        }
        
        public void G(final e0 n) {
            this.n = n;
        }
        
        public void H(final Boolean f) {
            this.f = f;
        }
        
        public void I(final Boolean g) {
            this.g = g;
        }
        
        public void J(final String t) {
            this.t = t;
        }
        
        public void K(final Boolean h) {
            this.h = h;
        }
        
        public void L(final Boolean i) {
            this.i = i;
        }
        
        public void M(final Boolean p) {
            this.p = p;
        }
        
        public void N(final Boolean j) {
            this.j = j;
        }
        
        public void O(final Boolean k) {
            this.k = k;
        }
        
        ArrayList P() {
            final ArrayList list = new ArrayList(20);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            list.add((Object)this.d);
            list.add((Object)this.e);
            list.add((Object)this.f);
            list.add((Object)this.g);
            list.add((Object)this.h);
            list.add((Object)this.i);
            list.add((Object)this.j);
            list.add((Object)this.k);
            list.add((Object)this.l);
            list.add((Object)this.m);
            list.add((Object)this.n);
            list.add((Object)this.o);
            list.add((Object)this.p);
            list.add((Object)this.q);
            list.add((Object)this.r);
            list.add((Object)this.s);
            list.add((Object)this.t);
            return list;
        }
        
        public Boolean b() {
            return this.q;
        }
        
        public o c() {
            return this.b;
        }
        
        public String d() {
            return this.s;
        }
        
        public Boolean e() {
            return this.a;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && l0.class == o.getClass()) {
                final l0 l0 = (l0)o;
                if (!Objects.equals((Object)this.a, (Object)l0.a) || !Objects.equals((Object)this.b, (Object)l0.b) || !Objects.equals((Object)this.c, (Object)l0.c) || !Objects.equals((Object)this.d, (Object)l0.d) || !Objects.equals((Object)this.e, (Object)l0.e) || !Objects.equals((Object)this.f, (Object)l0.f) || !Objects.equals((Object)this.g, (Object)l0.g) || !Objects.equals((Object)this.h, (Object)l0.h) || !Objects.equals((Object)this.i, (Object)l0.i) || !Objects.equals((Object)this.j, (Object)l0.j) || !Objects.equals((Object)this.k, (Object)l0.k) || !Objects.equals((Object)this.l, (Object)l0.l) || !Objects.equals((Object)this.m, (Object)l0.m) || !Objects.equals((Object)this.n, (Object)l0.n) || !Objects.equals((Object)this.o, (Object)l0.o) || !Objects.equals((Object)this.p, (Object)l0.p) || !Objects.equals((Object)this.q, (Object)l0.q) || !Objects.equals((Object)this.r, (Object)l0.r) || !Objects.equals((Object)this.s, (Object)l0.s) || !Objects.equals((Object)this.t, (Object)l0.t)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public Boolean f() {
            return this.o;
        }
        
        public Boolean g() {
            return this.r;
        }
        
        public Boolean h() {
            return this.e;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t });
        }
        
        public m0 i() {
            return this.c;
        }
        
        public y0 j() {
            return this.d;
        }
        
        public Boolean k() {
            return this.m;
        }
        
        public Boolean l() {
            return this.l;
        }
        
        public e0 m() {
            return this.n;
        }
        
        public Boolean n() {
            return this.f;
        }
        
        public Boolean o() {
            return this.g;
        }
        
        public String p() {
            return this.t;
        }
        
        public Boolean q() {
            return this.h;
        }
        
        public Boolean r() {
            return this.i;
        }
        
        public Boolean s() {
            return this.p;
        }
        
        public Boolean t() {
            return this.j;
        }
        
        public Boolean u() {
            return this.k;
        }
        
        public void v(final Boolean q) {
            this.q = q;
        }
        
        public void w(final o b) {
            this.b = b;
        }
        
        public void x(final String s) {
            this.s = s;
        }
        
        public void y(final Boolean a) {
            this.a = a;
        }
        
        public void z(final Boolean o) {
            this.o = o;
        }
    }
    
    public static final class m
    {
        private Double a;
        
        static m a(final ArrayList list) {
            final m m = new m();
            m.c((Double)list.get(0));
            return m;
        }
        
        public Double b() {
            return this.a;
        }
        
        public void c(final Double a) {
            this.a = a;
        }
        
        ArrayList d() {
            final ArrayList list = new ArrayList(1);
            list.add((Object)this.a);
            return list;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && m.class == o.getClass() && Objects.equals((Object)this.a, (Object)((m)o).a));
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a });
        }
    }
    
    public enum m0
    {
        f("NONE", 0, 0), 
        g("NORMAL", 1, 1), 
        h("SATELLITE", 2, 2), 
        i("TERRAIN", 3, 3), 
        j("HYBRID", 4, 4);
        
        private static final m0[] k;
        final int e;
        
        static {
            k = a();
        }
        
        private m0(final String s, final int n, final int e) {
            this.e = e;
        }
        
        private static /* synthetic */ m0[] a() {
            return new m0[] { m0.f, m0.g, m0.h, m0.i, m0.j };
        }
    }
    
    public static final class n
    {
        private Double a;
        private i0 b;
        private Double c;
        private Double d;
        
        n() {
        }
        
        static n a(final ArrayList list) {
            final n n = new n();
            n.f((Double)list.get(0));
            n.g((i0)list.get(1));
            n.h((Double)list.get(2));
            n.i((Double)list.get(3));
            return n;
        }
        
        public Double b() {
            return this.a;
        }
        
        public i0 c() {
            return this.b;
        }
        
        public Double d() {
            return this.c;
        }
        
        public Double e() {
            return this.d;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && n.class == o.getClass()) {
                final n n = (n)o;
                if (!this.a.equals((Object)n.a) || !this.b.equals(n.b) || !this.c.equals((Object)n.c) || !this.d.equals((Object)n.d)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public void f(final Double a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"bearing\" is null.");
        }
        
        public void g(final i0 b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"target\" is null.");
        }
        
        public void h(final Double c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"tilt\" is null.");
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c, this.d });
        }
        
        public void i(final Double d) {
            if (d != null) {
                this.d = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"zoom\" is null.");
        }
        
        ArrayList j() {
            final ArrayList list = new ArrayList(4);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            list.add((Object)this.d);
            return list;
        }
        
        public static final class a
        {
            private Double a;
            private i0 b;
            private Double c;
            private Double d;
            
            public n a() {
                final n n = new n();
                n.f(this.a);
                n.g(this.b);
                n.h(this.c);
                n.i(this.d);
                return n;
            }
            
            public a b(final Double a) {
                this.a = a;
                return this;
            }
            
            public a c(final i0 b) {
                this.b = b;
                return this;
            }
            
            public a d(final Double c) {
                this.c = c;
                return this;
            }
            
            public a e(final Double d) {
                this.d = d;
                return this;
            }
        }
    }
    
    public static final class n0
    {
        private n a;
        private l0 b;
        private List c;
        private List d;
        private List e;
        private List f;
        private List g;
        private List h;
        private List i;
        
        n0() {
        }
        
        static n0 a(final ArrayList list) {
            final n0 n0 = new n0();
            n0.k((n)list.get(0));
            n0.s((l0)list.get(1));
            n0.l((List)list.get(2));
            n0.o((List)list.get(3));
            n0.p((List)list.get(4));
            n0.q((List)list.get(5));
            n0.n((List)list.get(6));
            n0.r((List)list.get(7));
            n0.m((List)list.get(8));
            return n0;
        }
        
        public n b() {
            return this.a;
        }
        
        public List c() {
            return this.c;
        }
        
        public List d() {
            return this.i;
        }
        
        public List e() {
            return this.g;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && n0.class == o.getClass()) {
                final n0 n0 = (n0)o;
                if (!this.a.equals(n0.a) || !this.b.equals(n0.b) || !this.c.equals((Object)n0.c) || !this.d.equals((Object)n0.d) || !this.e.equals((Object)n0.e) || !this.f.equals((Object)n0.f) || !this.g.equals((Object)n0.g) || !this.h.equals((Object)n0.h) || !this.i.equals((Object)n0.i)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public List f() {
            return this.d;
        }
        
        public List g() {
            return this.e;
        }
        
        public List h() {
            return this.f;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i });
        }
        
        public List i() {
            return this.h;
        }
        
        public l0 j() {
            return this.b;
        }
        
        public void k(final n a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"initialCameraPosition\" is null.");
        }
        
        public void l(final List c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"initialCircles\" is null.");
        }
        
        public void m(final List i) {
            if (i != null) {
                this.i = i;
                return;
            }
            throw new IllegalStateException("Nonnull field \"initialClusterManagers\" is null.");
        }
        
        public void n(final List g) {
            if (g != null) {
                this.g = g;
                return;
            }
            throw new IllegalStateException("Nonnull field \"initialHeatmaps\" is null.");
        }
        
        public void o(final List d) {
            if (d != null) {
                this.d = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"initialMarkers\" is null.");
        }
        
        public void p(final List e) {
            if (e != null) {
                this.e = e;
                return;
            }
            throw new IllegalStateException("Nonnull field \"initialPolygons\" is null.");
        }
        
        public void q(final List f) {
            if (f != null) {
                this.f = f;
                return;
            }
            throw new IllegalStateException("Nonnull field \"initialPolylines\" is null.");
        }
        
        public void r(final List h) {
            if (h != null) {
                this.h = h;
                return;
            }
            throw new IllegalStateException("Nonnull field \"initialTileOverlays\" is null.");
        }
        
        public void s(final l0 b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"mapConfiguration\" is null.");
        }
        
        ArrayList t() {
            final ArrayList list = new ArrayList(9);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            list.add((Object)this.d);
            list.add((Object)this.e);
            list.add((Object)this.f);
            list.add((Object)this.g);
            list.add((Object)this.h);
            list.add((Object)this.i);
            return list;
        }
    }
    
    public static final class o
    {
        private j0 a;
        
        static o a(final ArrayList list) {
            final o o = new o();
            o.c((j0)list.get(0));
            return o;
        }
        
        public j0 b() {
            return this.a;
        }
        
        public void c(final j0 a) {
            this.a = a;
        }
        
        ArrayList d() {
            final ArrayList list = new ArrayList(1);
            list.add((Object)this.a);
            return list;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && o.class == o.getClass() && Objects.equals((Object)this.a, (Object)((o)o).a));
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a });
        }
    }
    
    public static final class o0
    {
        private Double a;
        private d0 b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private g f;
        private g0 g;
        private i0 h;
        private Double i;
        private Boolean j;
        private Double k;
        private String l;
        private String m;
        
        o0() {
        }
        
        static o0 a(final ArrayList list) {
            final o0 o0 = new o0();
            o0.o((Double)list.get(0));
            o0.p((d0)list.get(1));
            o0.r((Boolean)list.get(2));
            o0.s((Boolean)list.get(3));
            o0.t((Boolean)list.get(4));
            o0.u((g)list.get(5));
            o0.v((g0)list.get(6));
            o0.x((i0)list.get(7));
            o0.y((Double)list.get(8));
            o0.z((Boolean)list.get(9));
            o0.A((Double)list.get(10));
            o0.w((String)list.get(11));
            o0.q((String)list.get(12));
            return o0;
        }
        
        public void A(final Double k) {
            if (k != null) {
                this.k = k;
                return;
            }
            throw new IllegalStateException("Nonnull field \"zIndex\" is null.");
        }
        
        ArrayList B() {
            final ArrayList list = new ArrayList(13);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            list.add((Object)this.d);
            list.add((Object)this.e);
            list.add((Object)this.f);
            list.add((Object)this.g);
            list.add((Object)this.h);
            list.add((Object)this.i);
            list.add((Object)this.j);
            list.add((Object)this.k);
            list.add((Object)this.l);
            list.add((Object)this.m);
            return list;
        }
        
        public Double b() {
            return this.a;
        }
        
        public d0 c() {
            return this.b;
        }
        
        public String d() {
            return this.m;
        }
        
        public Boolean e() {
            return this.c;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && o0.class == o.getClass()) {
                final o0 o2 = (o0)o;
                if (!this.a.equals((Object)o2.a) || !this.b.equals(o2.b) || !this.c.equals((Object)o2.c) || !this.d.equals((Object)o2.d) || !this.e.equals((Object)o2.e) || !this.f.equals(o2.f) || !this.g.equals(o2.g) || !this.h.equals(o2.h) || !this.i.equals((Object)o2.i) || !this.j.equals((Object)o2.j) || !this.k.equals((Object)o2.k) || !this.l.equals((Object)o2.l) || !Objects.equals((Object)this.m, (Object)o2.m)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public Boolean f() {
            return this.d;
        }
        
        public Boolean g() {
            return this.e;
        }
        
        public g h() {
            return this.f;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m });
        }
        
        public g0 i() {
            return this.g;
        }
        
        public String j() {
            return this.l;
        }
        
        public i0 k() {
            return this.h;
        }
        
        public Double l() {
            return this.i;
        }
        
        public Boolean m() {
            return this.j;
        }
        
        public Double n() {
            return this.k;
        }
        
        public void o(final Double a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"alpha\" is null.");
        }
        
        public void p(final d0 b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"anchor\" is null.");
        }
        
        public void q(final String m) {
            this.m = m;
        }
        
        public void r(final Boolean c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"consumeTapEvents\" is null.");
        }
        
        public void s(final Boolean d) {
            if (d != null) {
                this.d = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"draggable\" is null.");
        }
        
        public void t(final Boolean e) {
            if (e != null) {
                this.e = e;
                return;
            }
            throw new IllegalStateException("Nonnull field \"flat\" is null.");
        }
        
        public void u(final g f) {
            if (f != null) {
                this.f = f;
                return;
            }
            throw new IllegalStateException("Nonnull field \"icon\" is null.");
        }
        
        public void v(final g0 g) {
            if (g != null) {
                this.g = g;
                return;
            }
            throw new IllegalStateException("Nonnull field \"infoWindow\" is null.");
        }
        
        public void w(final String l) {
            if (l != null) {
                this.l = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"markerId\" is null.");
        }
        
        public void x(final i0 h) {
            if (h != null) {
                this.h = h;
                return;
            }
            throw new IllegalStateException("Nonnull field \"position\" is null.");
        }
        
        public void y(final Double i) {
            if (i != null) {
                this.i = i;
                return;
            }
            throw new IllegalStateException("Nonnull field \"rotation\" is null.");
        }
        
        public void z(final Boolean j) {
            if (j != null) {
                this.j = j;
                return;
            }
            throw new IllegalStateException("Nonnull field \"visible\" is null.");
        }
    }
    
    public static final class p
    {
        private Object a;
        
        p() {
        }
        
        static p a(final ArrayList list) {
            final p p = new p();
            p.c(list.get(0));
            return p;
        }
        
        public Object b() {
            return this.a;
        }
        
        public void c(final Object a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"cameraUpdate\" is null.");
        }
        
        ArrayList d() {
            final ArrayList list = new ArrayList(1);
            list.add(this.a);
            return list;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && p.class == o.getClass() && this.a.equals(((p)o).a));
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a });
        }
    }
    
    public static final class p0
    {
        private q0 a;
        private Double b;
        
        p0() {
        }
        
        static p0 a(final ArrayList list) {
            final p0 p = new p0();
            p.e((q0)list.get(0));
            p.d((Double)list.get(1));
            return p;
        }
        
        public Double b() {
            return this.b;
        }
        
        public q0 c() {
            return this.a;
        }
        
        public void d(final Double b) {
            this.b = b;
        }
        
        public void e(final q0 a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && p0.class == o.getClass()) {
                final p0 p = (p0)o;
                if (!this.a.equals(p.a) || !Objects.equals((Object)this.b, (Object)p.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        ArrayList f() {
            final ArrayList list = new ArrayList(2);
            list.add((Object)this.a);
            list.add((Object)this.b);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b });
        }
    }
    
    public static final class q
    {
        private n a;
        
        q() {
        }
        
        static q a(final ArrayList list) {
            final q q = new q();
            q.c((n)list.get(0));
            return q;
        }
        
        public n b() {
            return this.a;
        }
        
        public void c(final n a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"cameraPosition\" is null.");
        }
        
        ArrayList d() {
            final ArrayList list = new ArrayList(1);
            list.add((Object)this.a);
            return list;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && q.class == o.getClass() && this.a.equals(((q)o).a));
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a });
        }
    }
    
    public enum q0
    {
        f("DOT", 0, 0), 
        g("DASH", 1, 1), 
        h("GAP", 2, 2);
        
        private static final q0[] i;
        final int e;
        
        static {
            i = a();
        }
        
        private q0(final String s, final int n, final int e) {
            this.e = e;
        }
        
        private static /* synthetic */ q0[] a() {
            return new q0[] { q0.f, q0.g, q0.h };
        }
    }
    
    public static final class r
    {
        private i0 a;
        
        r() {
        }
        
        static r a(final ArrayList list) {
            final r r = new r();
            r.c((i0)list.get(0));
            return r;
        }
        
        public i0 b() {
            return this.a;
        }
        
        public void c(final i0 a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"latLng\" is null.");
        }
        
        ArrayList d() {
            final ArrayList list = new ArrayList(1);
            list.add((Object)this.a);
            return list;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && r.class == o.getClass() && this.a.equals(((r)o).a));
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a });
        }
    }
    
    public static final class r0
    {
        private Long a;
        private Long b;
        
        r0() {
        }
        
        static r0 a(final ArrayList list) {
            final r0 r0 = new r0();
            r0.d((Long)list.get(0));
            r0.e((Long)list.get(1));
            return r0;
        }
        
        public Long b() {
            return this.a;
        }
        
        public Long c() {
            return this.b;
        }
        
        public void d(final Long a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"x\" is null.");
        }
        
        public void e(final Long b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"y\" is null.");
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && r0.class == o.getClass()) {
                final r0 r0 = (r0)o;
                if (!this.a.equals((Object)r0.a) || !this.b.equals((Object)r0.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        ArrayList f() {
            final ArrayList list = new ArrayList(2);
            list.add((Object)this.a);
            list.add((Object)this.b);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b });
        }
        
        public static final class a
        {
            private Long a;
            private Long b;
            
            public r0 a() {
                final r0 r0 = new r0();
                r0.d(this.a);
                r0.e(this.b);
                return r0;
            }
            
            public a b(final Long a) {
                this.a = a;
                return this;
            }
            
            public a c(final Long b) {
                this.b = b;
                return this;
            }
        }
    }
    
    public static final class s
    {
        private j0 a;
        private Double b;
        
        s() {
        }
        
        static s a(final ArrayList list) {
            final s s = new s();
            s.d((j0)list.get(0));
            s.e((Double)list.get(1));
            return s;
        }
        
        public j0 b() {
            return this.a;
        }
        
        public Double c() {
            return this.b;
        }
        
        public void d(final j0 a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"bounds\" is null.");
        }
        
        public void e(final Double b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"padding\" is null.");
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && s.class == o.getClass()) {
                final s s = (s)o;
                if (!this.a.equals(s.a) || !this.b.equals((Object)s.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        ArrayList f() {
            final ArrayList list = new ArrayList(2);
            list.add((Object)this.a);
            list.add((Object)this.b);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b });
        }
    }
    
    public static final class s0
    {
        private String a;
        private Boolean b;
        private Long c;
        private Boolean d;
        private List e;
        private List f;
        private Boolean g;
        private Long h;
        private Long i;
        private Long j;
        
        s0() {
        }
        
        static s0 a(final ArrayList list) {
            final s0 s0 = new s0();
            s0.q((String)list.get(0));
            s0.l((Boolean)list.get(1));
            s0.m((Long)list.get(2));
            s0.n((Boolean)list.get(3));
            s0.p((List)list.get(4));
            s0.o((List)list.get(5));
            s0.t((Boolean)list.get(6));
            s0.r((Long)list.get(7));
            s0.s((Long)list.get(8));
            s0.u((Long)list.get(9));
            return s0;
        }
        
        public Boolean b() {
            return this.b;
        }
        
        public Long c() {
            return this.c;
        }
        
        public Boolean d() {
            return this.d;
        }
        
        public List e() {
            return this.f;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && s0.class == o.getClass()) {
                final s0 s0 = (s0)o;
                if (!this.a.equals((Object)s0.a) || !this.b.equals((Object)s0.b) || !this.c.equals((Object)s0.c) || !this.d.equals((Object)s0.d) || !this.e.equals((Object)s0.e) || !this.f.equals((Object)s0.f) || !this.g.equals((Object)s0.g) || !this.h.equals((Object)s0.h) || !this.i.equals((Object)s0.i) || !this.j.equals((Object)s0.j)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public List f() {
            return this.e;
        }
        
        public String g() {
            return this.a;
        }
        
        public Long h() {
            return this.h;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j });
        }
        
        public Long i() {
            return this.i;
        }
        
        public Boolean j() {
            return this.g;
        }
        
        public Long k() {
            return this.j;
        }
        
        public void l(final Boolean b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"consumesTapEvents\" is null.");
        }
        
        public void m(final Long c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"fillColor\" is null.");
        }
        
        public void n(final Boolean d) {
            if (d != null) {
                this.d = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"geodesic\" is null.");
        }
        
        public void o(final List f) {
            if (f != null) {
                this.f = f;
                return;
            }
            throw new IllegalStateException("Nonnull field \"holes\" is null.");
        }
        
        public void p(final List e) {
            if (e != null) {
                this.e = e;
                return;
            }
            throw new IllegalStateException("Nonnull field \"points\" is null.");
        }
        
        public void q(final String a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"polygonId\" is null.");
        }
        
        public void r(final Long h) {
            if (h != null) {
                this.h = h;
                return;
            }
            throw new IllegalStateException("Nonnull field \"strokeColor\" is null.");
        }
        
        public void s(final Long i) {
            if (i != null) {
                this.i = i;
                return;
            }
            throw new IllegalStateException("Nonnull field \"strokeWidth\" is null.");
        }
        
        public void t(final Boolean g) {
            if (g != null) {
                this.g = g;
                return;
            }
            throw new IllegalStateException("Nonnull field \"visible\" is null.");
        }
        
        public void u(final Long j) {
            if (j != null) {
                this.j = j;
                return;
            }
            throw new IllegalStateException("Nonnull field \"zIndex\" is null.");
        }
        
        ArrayList v() {
            final ArrayList list = new ArrayList(10);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            list.add((Object)this.d);
            list.add((Object)this.e);
            list.add((Object)this.f);
            list.add((Object)this.g);
            list.add((Object)this.h);
            list.add((Object)this.i);
            list.add((Object)this.j);
            return list;
        }
    }
    
    public static final class t
    {
        private i0 a;
        private Double b;
        
        t() {
        }
        
        static t a(final ArrayList list) {
            final t t = new t();
            t.d((i0)list.get(0));
            t.e((Double)list.get(1));
            return t;
        }
        
        public i0 b() {
            return this.a;
        }
        
        public Double c() {
            return this.b;
        }
        
        public void d(final i0 a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"latLng\" is null.");
        }
        
        public void e(final Double b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"zoom\" is null.");
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && t.class == o.getClass()) {
                final t t = (t)o;
                if (!this.a.equals(t.a) || !this.b.equals((Object)t.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        ArrayList f() {
            final ArrayList list = new ArrayList(2);
            list.add((Object)this.a);
            list.add((Object)this.b);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b });
        }
    }
    
    public static final class t0
    {
        private String a;
        private Boolean b;
        private Long c;
        private Boolean d;
        private h0 e;
        private List f;
        private List g;
        private y h;
        private y i;
        private Boolean j;
        private Long k;
        private Long l;
        
        t0() {
        }
        
        static t0 a(final ArrayList list) {
            final t0 t0 = new t0();
            t0.u((String)list.get(0));
            t0.o((Boolean)list.get(1));
            t0.n((Long)list.get(2));
            t0.q((Boolean)list.get(3));
            t0.r((h0)list.get(4));
            t0.s((List)list.get(5));
            t0.t((List)list.get(6));
            t0.v((y)list.get(7));
            t0.p((y)list.get(8));
            t0.w((Boolean)list.get(9));
            t0.x((Long)list.get(10));
            t0.y((Long)list.get(11));
            return t0;
        }
        
        public Long b() {
            return this.c;
        }
        
        public Boolean c() {
            return this.b;
        }
        
        public y d() {
            return this.i;
        }
        
        public Boolean e() {
            return this.d;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && t0.class == o.getClass()) {
                final t0 t0 = (t0)o;
                if (!this.a.equals((Object)t0.a) || !this.b.equals((Object)t0.b) || !this.c.equals((Object)t0.c) || !this.d.equals((Object)t0.d) || !this.e.equals(t0.e) || !this.f.equals((Object)t0.f) || !this.g.equals((Object)t0.g) || !this.h.equals(t0.h) || !this.i.equals(t0.i) || !this.j.equals((Object)t0.j) || !this.k.equals((Object)t0.k) || !this.l.equals((Object)t0.l)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public h0 f() {
            return this.e;
        }
        
        public List g() {
            return this.f;
        }
        
        public List h() {
            return this.g;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l });
        }
        
        public String i() {
            return this.a;
        }
        
        public y j() {
            return this.h;
        }
        
        public Boolean k() {
            return this.j;
        }
        
        public Long l() {
            return this.k;
        }
        
        public Long m() {
            return this.l;
        }
        
        public void n(final Long c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"color\" is null.");
        }
        
        public void o(final Boolean b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"consumesTapEvents\" is null.");
        }
        
        public void p(final y i) {
            if (i != null) {
                this.i = i;
                return;
            }
            throw new IllegalStateException("Nonnull field \"endCap\" is null.");
        }
        
        public void q(final Boolean d) {
            if (d != null) {
                this.d = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"geodesic\" is null.");
        }
        
        public void r(final h0 e) {
            if (e != null) {
                this.e = e;
                return;
            }
            throw new IllegalStateException("Nonnull field \"jointType\" is null.");
        }
        
        public void s(final List f) {
            if (f != null) {
                this.f = f;
                return;
            }
            throw new IllegalStateException("Nonnull field \"patterns\" is null.");
        }
        
        public void t(final List g) {
            if (g != null) {
                this.g = g;
                return;
            }
            throw new IllegalStateException("Nonnull field \"points\" is null.");
        }
        
        public void u(final String a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"polylineId\" is null.");
        }
        
        public void v(final y h) {
            if (h != null) {
                this.h = h;
                return;
            }
            throw new IllegalStateException("Nonnull field \"startCap\" is null.");
        }
        
        public void w(final Boolean j) {
            if (j != null) {
                this.j = j;
                return;
            }
            throw new IllegalStateException("Nonnull field \"visible\" is null.");
        }
        
        public void x(final Long k) {
            if (k != null) {
                this.k = k;
                return;
            }
            throw new IllegalStateException("Nonnull field \"width\" is null.");
        }
        
        public void y(final Long l) {
            if (l != null) {
                this.l = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"zIndex\" is null.");
        }
        
        ArrayList z() {
            final ArrayList list = new ArrayList(12);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            list.add((Object)this.d);
            list.add((Object)this.e);
            list.add((Object)this.f);
            list.add((Object)this.g);
            list.add((Object)this.h);
            list.add((Object)this.i);
            list.add((Object)this.j);
            list.add((Object)this.k);
            list.add((Object)this.l);
            return list;
        }
    }
    
    public static final class u
    {
        private Double a;
        private Double b;
        
        u() {
        }
        
        static u a(final ArrayList list) {
            final u u = new u();
            u.d((Double)list.get(0));
            u.e((Double)list.get(1));
            return u;
        }
        
        public Double b() {
            return this.a;
        }
        
        public Double c() {
            return this.b;
        }
        
        public void d(final Double a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"dx\" is null.");
        }
        
        public void e(final Double b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"dy\" is null.");
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && u.class == o.getClass()) {
                final u u = (u)o;
                if (!this.a.equals((Object)u.a) || !this.b.equals((Object)u.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        ArrayList f() {
            final ArrayList list = new ArrayList(2);
            list.add((Object)this.a);
            list.add((Object)this.b);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b });
        }
    }
    
    public enum u0
    {
        f("LEGACY", 0, 0), 
        g("LATEST", 1, 1);
        
        private static final u0[] h;
        final int e;
        
        static {
            h = a();
        }
        
        private u0(final String s, final int n, final int e) {
            this.e = e;
        }
        
        private static /* synthetic */ u0[] a() {
            return new u0[] { u0.f, u0.g };
        }
    }
    
    public static final class v
    {
        private Boolean a;
        
        v() {
        }
        
        static v a(final ArrayList list) {
            final v v = new v();
            v.c((Boolean)list.get(0));
            return v;
        }
        
        public Boolean b() {
            return this.a;
        }
        
        public void c(final Boolean a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"out\" is null.");
        }
        
        ArrayList d() {
            final ArrayList list = new ArrayList(1);
            list.add((Object)this.a);
            return list;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && v.class == o.getClass() && this.a.equals((Object)((v)o).a));
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a });
        }
    }
    
    public static final class v0
    {
        private Long a;
        private Long b;
        private byte[] c;
        
        v0() {
        }
        
        static v0 a(final ArrayList list) {
            final v0 v0 = new v0();
            v0.g((Long)list.get(0));
            v0.f((Long)list.get(1));
            v0.e((byte[])list.get(2));
            return v0;
        }
        
        public byte[] b() {
            return this.c;
        }
        
        public Long c() {
            return this.b;
        }
        
        public Long d() {
            return this.a;
        }
        
        public void e(final byte[] c) {
            this.c = c;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && v0.class == o.getClass()) {
                final v0 v0 = (v0)o;
                if (!this.a.equals((Object)v0.a) || !this.b.equals((Object)v0.b) || !Arrays.equals(this.c, v0.c)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public void f(final Long b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"height\" is null.");
        }
        
        public void g(final Long a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"width\" is null.");
        }
        
        ArrayList h() {
            final ArrayList list = new ArrayList(3);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b }) * 31 + Arrays.hashCode(this.c);
        }
    }
    
    public static final class w
    {
        private Double a;
        private d0 b;
        
        w() {
        }
        
        static w a(final ArrayList list) {
            final w w = new w();
            w.d((Double)list.get(0));
            w.e((d0)list.get(1));
            return w;
        }
        
        public Double b() {
            return this.a;
        }
        
        public d0 c() {
            return this.b;
        }
        
        public void d(final Double a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"amount\" is null.");
        }
        
        public void e(final d0 b) {
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && w.class == o.getClass()) {
                final w w = (w)o;
                if (!this.a.equals((Object)w.a) || !Objects.equals((Object)this.b, (Object)w.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        ArrayList f() {
            final ArrayList list = new ArrayList(2);
            list.add((Object)this.a);
            list.add((Object)this.b);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b });
        }
    }
    
    public static final class w0
    {
        private Boolean a;
        private Boolean b;
        private Double c;
        private Double d;
        
        w0() {
        }
        
        static w0 a(final ArrayList list) {
            final w0 w0 = new w0();
            w0.d((Boolean)list.get(0));
            w0.b((Boolean)list.get(1));
            w0.c((Double)list.get(2));
            w0.e((Double)list.get(3));
            return w0;
        }
        
        public void b(final Boolean b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"fadeIn\" is null.");
        }
        
        public void c(final Double c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"transparency\" is null.");
        }
        
        public void d(final Boolean a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"visible\" is null.");
        }
        
        public void e(final Double d) {
            if (d != null) {
                this.d = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"zIndex\" is null.");
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && w0.class == o.getClass()) {
                final w0 w0 = (w0)o;
                if (!this.a.equals((Object)w0.a) || !this.b.equals((Object)w0.b) || !this.c.equals((Object)w0.c) || !this.d.equals((Object)w0.d)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        ArrayList f() {
            final ArrayList list = new ArrayList(4);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            list.add((Object)this.d);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c, this.d });
        }
        
        public static final class a
        {
            private Boolean a;
            private Boolean b;
            private Double c;
            private Double d;
            
            public w0 a() {
                final w0 w0 = new w0();
                w0.d(this.a);
                w0.b(this.b);
                w0.c(this.c);
                w0.e(this.d);
                return w0;
            }
            
            public a b(final Boolean b) {
                this.b = b;
                return this;
            }
            
            public a c(final Double c) {
                this.c = c;
                return this;
            }
            
            public a d(final Boolean a) {
                this.a = a;
                return this;
            }
            
            public a e(final Double d) {
                this.d = d;
                return this;
            }
        }
    }
    
    public static final class x
    {
        private Double a;
        
        x() {
        }
        
        static x a(final ArrayList list) {
            final x x = new x();
            x.c((Double)list.get(0));
            return x;
        }
        
        public Double b() {
            return this.a;
        }
        
        public void c(final Double a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"zoom\" is null.");
        }
        
        ArrayList d() {
            final ArrayList list = new ArrayList(1);
            list.add((Object)this.a);
            return list;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && x.class == o.getClass() && this.a.equals((Object)((x)o).a));
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a });
        }
    }
    
    public static final class x0
    {
        private String a;
        private Boolean b;
        private Double c;
        private Long d;
        private Boolean e;
        private Long f;
        
        x0() {
        }
        
        static x0 a(final ArrayList list) {
            final x0 x0 = new x0();
            x0.h((String)list.get(0));
            x0.g((Boolean)list.get(1));
            x0.j((Double)list.get(2));
            x0.l((Long)list.get(3));
            x0.k((Boolean)list.get(4));
            x0.i((Long)list.get(5));
            return x0;
        }
        
        public Boolean b() {
            return this.b;
        }
        
        public String c() {
            return this.a;
        }
        
        public Double d() {
            return this.c;
        }
        
        public Boolean e() {
            return this.e;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && x0.class == o.getClass()) {
                final x0 x0 = (x0)o;
                if (!this.a.equals((Object)x0.a) || !this.b.equals((Object)x0.b) || !this.c.equals((Object)x0.c) || !this.d.equals((Object)x0.d) || !this.e.equals((Object)x0.e) || !this.f.equals((Object)x0.f)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public Long f() {
            return this.d;
        }
        
        public void g(final Boolean b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"fadeIn\" is null.");
        }
        
        public void h(final String a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"tileOverlayId\" is null.");
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f });
        }
        
        public void i(final Long f) {
            if (f != null) {
                this.f = f;
                return;
            }
            throw new IllegalStateException("Nonnull field \"tileSize\" is null.");
        }
        
        public void j(final Double c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"transparency\" is null.");
        }
        
        public void k(final Boolean e) {
            if (e != null) {
                this.e = e;
                return;
            }
            throw new IllegalStateException("Nonnull field \"visible\" is null.");
        }
        
        public void l(final Long d) {
            if (d != null) {
                this.d = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"zIndex\" is null.");
        }
        
        ArrayList m() {
            final ArrayList list = new ArrayList(6);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            list.add((Object)this.d);
            list.add((Object)this.e);
            list.add((Object)this.f);
            return list;
        }
    }
    
    public static final class y
    {
        private z a;
        private g b;
        private Double c;
        
        y() {
        }
        
        static y a(final ArrayList list) {
            final y y = new y();
            y.g((z)list.get(0));
            y.e((g)list.get(1));
            y.f((Double)list.get(2));
            return y;
        }
        
        public g b() {
            return this.b;
        }
        
        public Double c() {
            return this.c;
        }
        
        public z d() {
            return this.a;
        }
        
        public void e(final g b) {
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && y.class == o.getClass()) {
                final y y = (y)o;
                if (!this.a.equals(y.a) || !Objects.equals((Object)this.b, (Object)y.b) || !Objects.equals((Object)this.c, (Object)y.c)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public void f(final Double c) {
            this.c = c;
        }
        
        public void g(final z a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }
        
        ArrayList h() {
            final ArrayList list = new ArrayList(3);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c });
        }
    }
    
    public static final class y0
    {
        private Double a;
        private Double b;
        
        static y0 a(final ArrayList list) {
            final y0 y0 = new y0();
            y0.e((Double)list.get(0));
            y0.d((Double)list.get(1));
            return y0;
        }
        
        public Double b() {
            return this.b;
        }
        
        public Double c() {
            return this.a;
        }
        
        public void d(final Double b) {
            this.b = b;
        }
        
        public void e(final Double a) {
            this.a = a;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && y0.class == o.getClass()) {
                final y0 y0 = (y0)o;
                if (!Objects.equals((Object)this.a, (Object)y0.a) || !Objects.equals((Object)this.b, (Object)y0.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        ArrayList f() {
            final ArrayList list = new ArrayList(2);
            list.add((Object)this.a);
            list.add((Object)this.b);
            return list;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b });
        }
        
        public static final class a
        {
            private Double a;
            private Double b;
            
            public y0 a() {
                final y0 y0 = new y0();
                y0.e(this.a);
                y0.d(this.b);
                return y0;
            }
            
            public a b(final Double b) {
                this.b = b;
                return this;
            }
            
            public a c(final Double a) {
                this.a = a;
                return this;
            }
        }
    }
    
    public enum z
    {
        f("BUTT_CAP", 0, 0), 
        g("ROUND_CAP", 1, 1), 
        h("SQUARE_CAP", 2, 2), 
        i("CUSTOM_CAP", 3, 3);
        
        private static final z[] j;
        final int e;
        
        static {
            j = a();
        }
        
        private z(final String s, final int n, final int e) {
            this.e = e;
        }
        
        private static /* synthetic */ z[] a() {
            return new z[] { z.f, z.g, z.h, z.i };
        }
    }
    
    public interface z0
    {
        void a(final Object p0);
        
        void b(final Throwable p0);
    }
}
