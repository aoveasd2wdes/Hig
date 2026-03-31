package i1;

import java.util.Map;

public class g
{
    private final String a;
    private final String b;
    private final String c;
    private final a d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final Integer h;
    
    private g(final String a, final String b, final String c, final a d, final boolean e, final boolean f, final boolean g, final Integer h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static g i(final Map map) {
        final Integer n = null;
        if (map == null) {
            return null;
        }
        final a c = a.c((Map)map.get((Object)"notificationIcon"));
        final String s = (String)map.get((Object)"notificationTitle");
        final String s2 = (String)map.get((Object)"notificationChannelName");
        final String s3 = (String)map.get((Object)"notificationText");
        final Boolean b = (Boolean)map.get((Object)"enableWifiLock");
        final Boolean b2 = (Boolean)map.get((Object)"enableWakeLock");
        final Boolean b3 = (Boolean)map.get((Object)"setOngoing");
        final Object value = map.get((Object)"color");
        Integer value2 = n;
        if (value != null) {
            value2 = ((Number)value).intValue();
        }
        return new g(s, s3, s2, c, b, b2, b3, value2);
    }
    
    public Integer a() {
        return this.h;
    }
    
    public String b() {
        return this.c;
    }
    
    public a c() {
        return this.d;
    }
    
    public String d() {
        return this.b;
    }
    
    public String e() {
        return this.a;
    }
    
    public boolean f() {
        return this.f;
    }
    
    public boolean g() {
        return this.e;
    }
    
    public boolean h() {
        return this.g;
    }
}
