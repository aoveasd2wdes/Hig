package v2;

import i4.g;
import i4.l;

public final class i
{
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Integer f;
    private final boolean g;
    
    public i(final String a, final String b, final String c, final String d, final String e, final Integer f, final boolean g) {
        l.e((Object)a, "channelName");
        l.e((Object)b, "title");
        l.e((Object)c, "iconName");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final String a() {
        return this.a;
    }
    
    public final Integer b() {
        return this.f;
    }
    
    public final String c() {
        return this.e;
    }
    
    public final String d() {
        return this.c;
    }
    
    public final boolean e() {
        return this.g;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final i i = (i)o;
        return l.a((Object)this.a, (Object)i.a) && l.a((Object)this.b, (Object)i.b) && l.a((Object)this.c, (Object)i.c) && l.a((Object)this.d, (Object)i.d) && l.a((Object)this.e, (Object)i.e) && l.a((Object)this.f, (Object)i.f) && this.g == i.g;
    }
    
    public final String f() {
        return this.d;
    }
    
    public final String g() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final String d = this.d;
        int hashCode4 = 0;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final Integer f = this.f;
        if (f != null) {
            hashCode4 = f.hashCode();
        }
        int g;
        if ((g = (this.g ? 1 : 0)) != 0) {
            g = 1;
        }
        return (((((hashCode * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode4) * 31 + g;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("NotificationOptions(channelName=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", iconName=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", color=");
        sb.append((Object)this.f);
        sb.append(", onTapBringToFront=");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }
}
