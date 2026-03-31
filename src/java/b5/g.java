package b5;

import java.util.Collection;
import java.util.ArrayList;
import v3.c0;
import i4.l;
import java.util.Map;

public final class g
{
    private final boolean a;
    private final boolean b;
    private final j0 c;
    private final Long d;
    private final Long e;
    private final Long f;
    private final Long g;
    private final Map h;
    
    public g(final boolean a, final boolean b, final j0 c, final Long d, final Long e, final Long f, final Long g, final Map map) {
        l.e(map, "extras");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = c0.l(map);
    }
    
    public final Long a() {
        return this.f;
    }
    
    public final Long b() {
        return this.d;
    }
    
    public final boolean c() {
        return this.b;
    }
    
    public final boolean d() {
        return this.a;
    }
    
    @Override
    public String toString() {
        final ArrayList list = new ArrayList();
        if (this.a) {
            ((Collection)list).add((Object)"isRegularFile");
        }
        if (this.b) {
            ((Collection)list).add((Object)"isDirectory");
        }
        if (this.d != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount=");
            sb.append((Object)this.d);
            ((Collection)list).add((Object)sb.toString());
        }
        if (this.e != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("createdAt=");
            sb2.append((Object)this.e);
            ((Collection)list).add((Object)sb2.toString());
        }
        if (this.f != null) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("lastModifiedAt=");
            sb3.append((Object)this.f);
            ((Collection)list).add((Object)sb3.toString());
        }
        if (this.g != null) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("lastAccessedAt=");
            sb4.append((Object)this.g);
            ((Collection)list).add((Object)sb4.toString());
        }
        if (this.h.isEmpty() ^ true) {
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("extras=");
            sb5.append((Object)this.h);
            ((Collection)list).add((Object)sb5.toString());
        }
        return v3.l.x((Iterable)list, (CharSequence)", ", (CharSequence)"FileMetadata(", (CharSequence)")", 0, (CharSequence)null, (h4.l)null, 56, (Object)null);
    }
}
