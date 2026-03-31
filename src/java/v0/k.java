package v0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import i4.l;
import java.math.BigInteger;
import h4.a;
import u3.f;
import i4.g;
import u3.e;

public final class k implements Comparable
{
    public static final a j;
    private static final k k;
    private static final k l;
    private static final k m;
    private static final k n;
    private final int e;
    private final int f;
    private final int g;
    private final String h;
    private final e i;
    
    static {
        j = new a(null);
        k = new k(0, 0, 0, "");
        l = new k(0, 1, 0, "");
        n = (m = new k(1, 0, 0, ""));
    }
    
    private k(final int e, final int f, final int g, final String h) {
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = u3.f.a((h4.a)new k$b(this));
    }
    
    public static final /* synthetic */ k a() {
        return v0.k.l;
    }
    
    private final BigInteger d() {
        final Object value = this.i.getValue();
        i4.l.d(value, "<get-bigInteger>(...)");
        return (BigInteger)value;
    }
    
    public int b(final k k) {
        i4.l.e((Object)k, "other");
        return this.d().compareTo(k.d());
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof k;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final int e = this.e;
        final k k = (k)o;
        boolean b3 = b2;
        if (e == k.e) {
            b3 = b2;
            if (this.f == k.f) {
                b3 = b2;
                if (this.g == k.g) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public final int f() {
        return this.e;
    }
    
    public final int g() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        return ((527 + this.e) * 31 + this.f) * 31 + this.g;
    }
    
    public final int j() {
        return this.g;
    }
    
    @Override
    public String toString() {
        String string;
        if (p4.f.k((CharSequence)this.h) ^ true) {
            final StringBuilder sb = new StringBuilder();
            sb.append('-');
            sb.append(this.h);
            string = sb.toString();
        }
        else {
            string = "";
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.e);
        sb2.append('.');
        sb2.append(this.f);
        sb2.append('.');
        sb2.append(this.g);
        sb2.append(string);
        return sb2.toString();
    }
    
    public static final class a
    {
        private a() {
        }
        
        public final k a() {
            return v0.k.a();
        }
        
        public final k b(String group) {
            if (group != null) {
                if (!p4.f.k((CharSequence)group)) {
                    final Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher((CharSequence)group);
                    if (!matcher.matches()) {
                        return null;
                    }
                    final String group2 = matcher.group(1);
                    if (group2 != null) {
                        final int int1 = Integer.parseInt(group2);
                        final String group3 = matcher.group(2);
                        if (group3 != null) {
                            final int int2 = Integer.parseInt(group3);
                            final String group4 = matcher.group(3);
                            if (group4 != null) {
                                final int int3 = Integer.parseInt(group4);
                                if (matcher.group(4) != null) {
                                    group = matcher.group(4);
                                }
                                else {
                                    group = "";
                                }
                                i4.l.d((Object)group, "description");
                                return new k(int1, int2, int3, group, null);
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
