package j3;

import java.util.Arrays;
import a3.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONArray;
import k3.l;
import k3.c;
import k3.g;
import b3.a;
import k3.k;

public class o
{
    public final k3.k a;
    private h b;
    final k3.k.c c;
    
    public o(final a a) {
        final o$a c = new o$a(this);
        this.c = (k3.k.c)c;
        (this.a = new k3.k((k3.c)a, "flutter/platform", (k3.l)k3.g.a)).e((k3.k.c)c);
    }
    
    private c g(final JSONObject jsonObject) {
        int int1;
        final int n = int1 = jsonObject.getInt("primaryColor");
        if (n != 0) {
            int1 = (n | 0xFF000000);
        }
        return new c(int1, jsonObject.getString("label"));
    }
    
    private int h(final JSONArray jsonArray) {
        int i = 0;
        int n = 0;
        int n2 = 0;
        while (i < jsonArray.length()) {
            final int n3 = o$b.a[f.b(jsonArray.getString(i)).ordinal()];
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        if (n3 == 4) {
                            n |= 0x8;
                        }
                    }
                    else {
                        n |= 0x2;
                    }
                }
                else {
                    n |= 0x4;
                }
            }
            else {
                n |= 0x1;
            }
            int n4 = n2;
            if (n2 == 0) {
                n4 = n;
            }
            ++i;
            n2 = n4;
        }
        if (n != 0) {
            int n5 = 9;
            switch (n) {
                case 15: {
                    return 13;
                }
                case 11: {
                    return 2;
                }
                case 10: {
                    return 11;
                }
                case 8: {
                    return 8;
                }
                case 5: {
                    n5 = 12;
                }
                case 4: {
                    return n5;
                }
                case 3:
                case 6:
                case 7:
                case 9:
                case 12:
                case 13:
                case 14: {
                    if (n2 == 2) {
                        return 0;
                    }
                    if (n2 == 4) {
                        return 9;
                    }
                    if (n2 != 8) {
                        break;
                    }
                    return 8;
                }
                case 2: {
                    return 0;
                }
            }
            return 1;
        }
        return -1;
    }
    
    private j i(final JSONObject jsonObject) {
        final boolean null = jsonObject.isNull("statusBarColor");
        Boolean value = null;
        Integer value2;
        if (!null) {
            value2 = jsonObject.getInt("statusBarColor");
        }
        else {
            value2 = null;
        }
        d b;
        if (!jsonObject.isNull("statusBarIconBrightness")) {
            b = d.b(jsonObject.getString("statusBarIconBrightness"));
        }
        else {
            b = null;
        }
        Boolean value3;
        if (!jsonObject.isNull("systemStatusBarContrastEnforced")) {
            value3 = jsonObject.getBoolean("systemStatusBarContrastEnforced");
        }
        else {
            value3 = null;
        }
        Integer value4;
        if (!jsonObject.isNull("systemNavigationBarColor")) {
            value4 = jsonObject.getInt("systemNavigationBarColor");
        }
        else {
            value4 = null;
        }
        d b2;
        if (!jsonObject.isNull("systemNavigationBarIconBrightness")) {
            b2 = d.b(jsonObject.getString("systemNavigationBarIconBrightness"));
        }
        else {
            b2 = null;
        }
        Integer value5;
        if (!jsonObject.isNull("systemNavigationBarDividerColor")) {
            value5 = jsonObject.getInt("systemNavigationBarDividerColor");
        }
        else {
            value5 = null;
        }
        if (!jsonObject.isNull("systemNavigationBarContrastEnforced")) {
            value = jsonObject.getBoolean("systemNavigationBarContrastEnforced");
        }
        return new j(value2, b, value3, value4, b2, value5, value);
    }
    
    private k j(final String s) {
        final int n = o$b.c[k.b(s).ordinal()];
        if (n == 1) {
            return k.f;
        }
        if (n == 2) {
            return k.g;
        }
        if (n == 3) {
            return k.h;
        }
        if (n != 4) {
            return k.i;
        }
        return k.i;
    }
    
    private List k(final JSONArray jsonArray) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < jsonArray.length(); ++i) {
            final int n = o$b.b[l.b(jsonArray.getString(i)).ordinal()];
            l l;
            if (n != 1) {
                if (n != 2) {
                    continue;
                }
                l = o.l.g;
            }
            else {
                l = o.l.f;
            }
            ((List)list).add((Object)l);
        }
        return (List)list;
    }
    
    public void l(final h b) {
        this.b = b;
    }
    
    public void m(final boolean b) {
        b.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.a.c("SystemChrome.systemUIChange", Arrays.asList((Object[])new Boolean[] { b }));
    }
    
    public static class c
    {
        public final int a;
        public final String b;
        
        public c(final int a, final String b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public enum d
    {
        f("LIGHT", 0, "Brightness.light"), 
        g("DARK", 1, "Brightness.dark");
        
        private static final d[] h;
        private String e;
        
        static {
            h = a();
        }
        
        private d(final String s, final int n, final String e) {
            this.e = e;
        }
        
        private static /* synthetic */ d[] a() {
            return new d[] { d.f, d.g };
        }
        
        static d b(final String s) {
            for (final d d : values()) {
                if (d.e.equals((Object)s)) {
                    return d;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such Brightness: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
    
    public enum e
    {
        f("PLAIN_TEXT", 0, "text/plain");
        
        private static final e[] g;
        private String e;
        
        static {
            g = a();
        }
        
        private e(final String s, final int n, final String e) {
            this.e = e;
        }
        
        private static /* synthetic */ e[] a() {
            return new e[] { e.f };
        }
        
        static e b(final String s) {
            for (final e e : values()) {
                if (e.e.equals((Object)s)) {
                    return e;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such ClipboardContentFormat: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
    
    public enum f
    {
        f("PORTRAIT_UP", 0, "DeviceOrientation.portraitUp"), 
        g("PORTRAIT_DOWN", 1, "DeviceOrientation.portraitDown"), 
        h("LANDSCAPE_LEFT", 2, "DeviceOrientation.landscapeLeft"), 
        i("LANDSCAPE_RIGHT", 3, "DeviceOrientation.landscapeRight");
        
        private static final f[] j;
        private String e;
        
        static {
            j = a();
        }
        
        private f(final String s, final int n, final String e) {
            this.e = e;
        }
        
        private static /* synthetic */ f[] a() {
            return new f[] { f.f, f.g, f.h, f.i };
        }
        
        static f b(final String s) {
            for (final f f : values()) {
                if (f.e.equals((Object)s)) {
                    return f;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such DeviceOrientation: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
    
    public enum g
    {
        f("STANDARD", 0, (String)null), 
        g("LIGHT_IMPACT", 1, "HapticFeedbackType.lightImpact"), 
        h("MEDIUM_IMPACT", 2, "HapticFeedbackType.mediumImpact"), 
        i("HEAVY_IMPACT", 3, "HapticFeedbackType.heavyImpact"), 
        j("SELECTION_CLICK", 4, "HapticFeedbackType.selectionClick");
        
        private static final g[] k;
        private final String e;
        
        static {
            k = a();
        }
        
        private g(final String s, final int n, final String e) {
            this.e = e;
        }
        
        private static /* synthetic */ g[] a() {
            return new g[] { g.f, g.g, g.h, g.i, g.j };
        }
        
        static g b(final String s) {
            for (final g g : values()) {
                final String e = g.e;
                if ((e == null && s == null) || (e != null && e.equals((Object)s))) {
                    return g;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such HapticFeedbackType: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
    
    public interface h
    {
        void a();
        
        void b();
        
        void c(final j p0);
        
        void d(final i p0);
        
        CharSequence e(final e p0);
        
        void f();
        
        void g(final String p0);
        
        void h(final boolean p0);
        
        void i(final c p0);
        
        void j(final int p0);
        
        void k(final List p0);
        
        void l(final String p0);
        
        boolean m();
        
        void n(final g p0);
        
        void o(final k p0);
    }
    
    public enum i
    {
        f("CLICK", 0, "SystemSoundType.click"), 
        g("ALERT", 1, "SystemSoundType.alert");
        
        private static final i[] h;
        private final String e;
        
        static {
            h = a();
        }
        
        private i(final String s, final int n, final String e) {
            this.e = e;
        }
        
        private static /* synthetic */ i[] a() {
            return new i[] { i.f, i.g };
        }
        
        static i b(final String s) {
            for (final i j : values()) {
                if (j.e.equals((Object)s)) {
                    return j;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such SoundType: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
    
    public static class j
    {
        public final Integer a;
        public final d b;
        public final Boolean c;
        public final Integer d;
        public final d e;
        public final Integer f;
        public final Boolean g;
        
        public j(final Integer a, final d b, final Boolean c, final Integer d, final d e, final Integer f, final Boolean g) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
    }
    
    public enum k
    {
        f("LEAN_BACK", 0, "SystemUiMode.leanBack"), 
        g("IMMERSIVE", 1, "SystemUiMode.immersive"), 
        h("IMMERSIVE_STICKY", 2, "SystemUiMode.immersiveSticky"), 
        i("EDGE_TO_EDGE", 3, "SystemUiMode.edgeToEdge");
        
        private static final k[] j;
        private String e;
        
        static {
            j = a();
        }
        
        private k(final String s, final int n, final String e) {
            this.e = e;
        }
        
        private static /* synthetic */ k[] a() {
            return new k[] { k.f, k.g, k.h, k.i };
        }
        
        static k b(final String s) {
            for (final k k : values()) {
                if (k.e.equals((Object)s)) {
                    return k;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such SystemUiMode: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
    
    public enum l
    {
        f("TOP_OVERLAYS", 0, "SystemUiOverlay.top"), 
        g("BOTTOM_OVERLAYS", 1, "SystemUiOverlay.bottom");
        
        private static final l[] h;
        private String e;
        
        static {
            h = a();
        }
        
        private l(final String s, final int n, final String e) {
            this.e = e;
        }
        
        private static /* synthetic */ l[] a() {
            return new l[] { l.f, l.g };
        }
        
        static l b(final String s) {
            for (final l l : values()) {
                if (l.e.equals((Object)s)) {
                    return l;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such SystemUiOverlay: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
}
