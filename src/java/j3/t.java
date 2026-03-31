package j3;

import java.util.HashMap;
import java.util.Map;
import a3.b;
import java.util.concurrent.ConcurrentLinkedQueue;
import android.os.Build$VERSION;
import android.util.DisplayMetrics;
import k3.i;
import k3.c;
import k3.f;
import k3.a;

public class t
{
    private static final a b;
    public final k3.a a;
    
    static {
        b = new a();
    }
    
    public t(final b3.a a) {
        this.a = new k3.a((k3.c)a, "flutter/settings", (i)f.a);
    }
    
    public static DisplayMetrics b(final int n) {
        final a.b c = t.b.c(n);
        DisplayMetrics a;
        if (c == null) {
            a = null;
        }
        else {
            a = c.b;
        }
        return a;
    }
    
    public static boolean c() {
        return Build$VERSION.SDK_INT >= 34;
    }
    
    public b d() {
        return new b(this.a);
    }
    
    public static class a
    {
        private final ConcurrentLinkedQueue a;
        private b b;
        private b c;
        
        public a() {
            this.a = new ConcurrentLinkedQueue();
        }
        
        public k3.a.e b(final b c) {
            this.a.add((Object)c);
            final b c2 = this.c;
            this.c = c;
            Object o;
            if (c2 == null) {
                o = null;
            }
            else {
                o = new t$a$a(this, c2);
            }
            return (k3.a.e)o;
        }
        
        public b c(final int n) {
            b b;
            while (true) {
                Label_0021: {
                    if (this.b != null) {
                        break Label_0021;
                    }
                    this.b = (b)this.a.poll();
                }
                b = this.b;
                if (b != null && b.a < n) {
                    continue;
                }
                break;
            }
            StringBuilder sb;
            String value;
            if (b == null) {
                sb = new StringBuilder();
                sb.append("Cannot find config with generation: ");
                sb.append(String.valueOf(n));
                value = ", after exhausting the queue.";
            }
            else {
                if (b.a == n) {
                    return b;
                }
                sb = new StringBuilder();
                sb.append("Cannot find config with generation: ");
                sb.append(String.valueOf(n));
                sb.append(", the oldest config is now: ");
                value = String.valueOf(this.b.a);
            }
            sb.append(value);
            a3.b.b("SettingsChannel", sb.toString());
            return null;
        }
        
        public static class b
        {
            private static int c = Integer.MIN_VALUE;
            public final int a;
            private final DisplayMetrics b;
            
            public b(final DisplayMetrics b) {
                final int c = b.c;
                b.c = c + 1;
                this.a = c;
                this.b = b;
            }
        }
    }
    
    public static class b
    {
        private final k3.a a;
        private Map b;
        private DisplayMetrics c;
        
        b(final k3.a a) {
            this.b = (Map)new HashMap();
            this.a = a;
        }
        
        public void a() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Sending message: \ntextScaleFactor: ");
            sb.append(this.b.get((Object)"textScaleFactor"));
            sb.append("\nalwaysUse24HourFormat: ");
            sb.append(this.b.get((Object)"alwaysUse24HourFormat"));
            sb.append("\nplatformBrightness: ");
            sb.append(this.b.get((Object)"platformBrightness"));
            a3.b.f("SettingsChannel", sb.toString());
            final DisplayMetrics c = this.c;
            if (t.c() && c != null) {
                final a.b b = new a.b(c);
                final k3.a.e b2 = t.b.b(b);
                this.b.put((Object)"configurationId", (Object)b.a);
                this.a.d(this.b, b2);
                return;
            }
            this.a.c(this.b);
        }
        
        public b b(final boolean b) {
            this.b.put((Object)"brieflyShowPassword", (Object)b);
            return this;
        }
        
        public b c(final DisplayMetrics c) {
            this.c = c;
            return this;
        }
        
        public b d(final boolean b) {
            this.b.put((Object)"nativeSpellCheckServiceDefined", (Object)b);
            return this;
        }
        
        public b e(final c c) {
            this.b.put((Object)"platformBrightness", (Object)c.e);
            return this;
        }
        
        public b f(final float n) {
            this.b.put((Object)"textScaleFactor", (Object)n);
            return this;
        }
        
        public b g(final boolean b) {
            this.b.put((Object)"alwaysUse24HourFormat", (Object)b);
            return this;
        }
    }
    
    public enum c
    {
        f("light", 0, "light"), 
        g("dark", 1, "dark");
        
        private static final c[] h;
        public String e;
        
        static {
            h = a();
        }
        
        private c(final String s, final int n, final String e) {
            this.e = e;
        }
        
        private static /* synthetic */ c[] a() {
            return new c[] { c.f, c.g };
        }
    }
}
