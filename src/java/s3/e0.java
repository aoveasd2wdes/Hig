package s3;

import v3.l;
import java.util.List;
import i4.g;

public final class e0
{
    public static final a c;
    private final String a;
    private final boolean b;
    
    static {
        c = new a(null);
    }
    
    public e0(final String a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final String a() {
        return this.a;
    }
    
    public final List b() {
        return l.j(new Object[] { this.a, this.b });
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e0)) {
            return false;
        }
        final e0 e0 = (e0)o;
        return i4.l.a((Object)this.a, (Object)e0.a) && this.b == e0.b;
    }
    
    @Override
    public int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    @Override
    public String toString() {
        final String a = this.a;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("SharedPreferencesPigeonOptions(fileName=");
        sb.append(a);
        sb.append(", useDataStore=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        private a() {
        }
        
        public final e0 a(final List list) {
            i4.l.e((Object)list, "pigeonVar_list");
            final String s = (String)list.get(0);
            final Object value = list.get(1);
            i4.l.c(value, "null cannot be cast to non-null type kotlin.Boolean");
            return new e0(s, (boolean)value);
        }
    }
}
