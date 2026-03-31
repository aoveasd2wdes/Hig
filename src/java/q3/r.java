package q3;

import java.util.List;
import java.util.Objects;
import android.util.Log;
import java.util.ArrayList;

public abstract class r
{
    protected static ArrayList a(final Throwable t) {
        final ArrayList list = new ArrayList(3);
        Object o;
        if (t instanceof d) {
            final d d = (d)t;
            list.add((Object)d.e);
            list.add((Object)((Throwable)d).getMessage());
            o = d.f;
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
    
    public static final class a
    {
        private String a;
        private String b;
        
        a() {
        }
        
        static r.a a(final ArrayList list) {
            final r.a a = new r.a();
            a.b((String)list.get(0));
            a.c((String)list.get(1));
            return a;
        }
        
        public void b(final String a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"code\" is null.");
        }
        
        public void c(final String b) {
            this.b = b;
        }
        
        ArrayList d() {
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
            if (o != null && r.a.class == o.getClass()) {
                final r.a a = (r.a)o;
                if (!this.a.equals((Object)a.a) || !Objects.equals((Object)this.b, (Object)a.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b });
        }
        
        public static final class a
        {
            private String a;
            private String b;
            
            public r.a a() {
                final r.a a = new r.a();
                a.b(this.a);
                a.c(this.b);
                return a;
            }
            
            public a b(final String a) {
                this.a = a;
                return this;
            }
            
            public a c(final String b) {
                this.b = b;
                return this;
            }
        }
    }
    
    public static final class b
    {
        private c a;
        private r.a b;
        private List c;
        
        b() {
        }
        
        static b a(final ArrayList list) {
            final b b = new b();
            b.d((c)list.get(0));
            b.b((r.a)list.get(1));
            b.c((List)list.get(2));
            return b;
        }
        
        public void b(final r.a b) {
            this.b = b;
        }
        
        public void c(final List c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"paths\" is null.");
        }
        
        public void d(final c a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }
        
        ArrayList e() {
            final ArrayList list = new ArrayList(3);
            list.add((Object)this.a);
            list.add((Object)this.b);
            list.add((Object)this.c);
            return list;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && b.class == o.getClass()) {
                final b b2 = (b)o;
                if (!this.a.equals(b2.a) || !Objects.equals((Object)this.b, (Object)b2.b) || !this.c.equals((Object)b2.c)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a, this.b, this.c });
        }
        
        public static final class a
        {
            private c a;
            private r.a b;
            private List c;
            
            public b a() {
                final b b = new b();
                b.d(this.a);
                b.b(this.b);
                b.c(this.c);
                return b;
            }
            
            public a b(final r.a b) {
                this.b = b;
                return this;
            }
            
            public a c(final List c) {
                this.c = c;
                return this;
            }
            
            public a d(final c a) {
                this.a = a;
                return this;
            }
        }
    }
    
    public enum c
    {
        f("IMAGE", 0, 0), 
        g("VIDEO", 1, 1);
        
        private static final c[] h;
        final int e;
        
        static {
            h = a();
        }
        
        private c(final String s, final int n, final int e) {
            this.e = e;
        }
        
        private static /* synthetic */ c[] a() {
            return new c[] { c.f, c.g };
        }
    }
    
    public static class d extends RuntimeException
    {
        public final String e;
        public final Object f;
        
        public d(final String e, final String s, final Object f) {
            super(s);
            this.e = e;
            this.f = f;
        }
    }
    
    public static final class e
    {
        private Boolean a;
        private Boolean b;
        private Long c;
        
        e() {
        }
        
        static e a(final ArrayList list) {
            final e e = new e();
            e.e((Boolean)list.get(0));
            e.g((Boolean)list.get(1));
            e.f((Long)list.get(2));
            return e;
        }
        
        public Boolean b() {
            return this.a;
        }
        
        public Long c() {
            return this.c;
        }
        
        public Boolean d() {
            return this.b;
        }
        
        public void e(final Boolean a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"allowMultiple\" is null.");
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && e.class == o.getClass()) {
                final e e = (e)o;
                if (!this.a.equals((Object)e.a) || !this.b.equals((Object)e.b) || !Objects.equals((Object)this.c, (Object)e.c)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public void f(final Long c) {
            this.c = c;
        }
        
        public void g(final Boolean b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"usePhotoPicker\" is null.");
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
    
    public interface f
    {
        void a(final h p0, final e p1, final j p2);
        
        void b(final l p0, final g p1, final e p2, final j p3);
        
        b d();
        
        void f(final l p0, final n p1, final e p2, final j p3);
    }
    
    public static final class g
    {
        private Double a;
        private Double b;
        private Long c;
        
        g() {
        }
        
        static g a(final ArrayList list) {
            final g g = new g();
            g.f((Double)list.get(0));
            g.e((Double)list.get(1));
            g.g((Long)list.get(2));
            return g;
        }
        
        public Double b() {
            return this.b;
        }
        
        public Double c() {
            return this.a;
        }
        
        public Long d() {
            return this.c;
        }
        
        public void e(final Double b) {
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && g.class == o.getClass()) {
                final g g = (g)o;
                if (!Objects.equals((Object)this.a, (Object)g.a) || !Objects.equals((Object)this.b, (Object)g.b) || !this.c.equals((Object)g.c)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        public void f(final Double a) {
            this.a = a;
        }
        
        public void g(final Long c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"quality\" is null.");
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
        private g a;
        
        h() {
        }
        
        static h a(final ArrayList list) {
            final h h = new h();
            h.c((g)list.get(0));
            return h;
        }
        
        public g b() {
            return this.a;
        }
        
        public void c(final g a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"imageSelectionOptions\" is null.");
        }
        
        ArrayList d() {
            final ArrayList list = new ArrayList(1);
            list.add((Object)this.a);
            return list;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && h.class == o.getClass() && this.a.equals(((h)o).a));
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a });
        }
    }
    
    public interface j
    {
        void a(final Object p0);
        
        void b(final Throwable p0);
    }
    
    public enum k
    {
        f("REAR", 0, 0), 
        g("FRONT", 1, 1);
        
        private static final k[] h;
        final int e;
        
        static {
            h = a();
        }
        
        private k(final String s, final int n, final int e) {
            this.e = e;
        }
        
        private static /* synthetic */ k[] a() {
            return new k[] { k.f, k.g };
        }
    }
    
    public static final class l
    {
        private m a;
        private k b;
        
        l() {
        }
        
        static l a(final ArrayList list) {
            final l l = new l();
            l.e((m)list.get(0));
            l.d((k)list.get(1));
            return l;
        }
        
        public k b() {
            return this.b;
        }
        
        public m c() {
            return this.a;
        }
        
        public void d(final k b) {
            this.b = b;
        }
        
        public void e(final m a) {
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
            if (o != null && l.class == o.getClass()) {
                final l l = (l)o;
                if (!this.a.equals(l.a) || !Objects.equals((Object)this.b, (Object)l.b)) {
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
    
    public enum m
    {
        f("CAMERA", 0, 0), 
        g("GALLERY", 1, 1);
        
        private static final m[] h;
        final int e;
        
        static {
            h = a();
        }
        
        private m(final String s, final int n, final int e) {
            this.e = e;
        }
        
        private static /* synthetic */ m[] a() {
            return new m[] { m.f, m.g };
        }
    }
    
    public static final class n
    {
        private Long a;
        
        static n a(final ArrayList list) {
            final n n = new n();
            n.c((Long)list.get(0));
            return n;
        }
        
        public Long b() {
            return this.a;
        }
        
        public void c(final Long a) {
            this.a = a;
        }
        
        ArrayList d() {
            final ArrayList list = new ArrayList(1);
            list.add((Object)this.a);
            return list;
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o != null && n.class == o.getClass() && Objects.equals((Object)this.a, (Object)((n)o).a));
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(new Object[] { this.a });
        }
    }
}
