package t;

import android.util.Base64;
import java.util.List;

public final class f
{
    private final String a;
    private final String b;
    private final String c;
    private final List d;
    private final int e;
    private final String f;
    
    public f(final String s, final String s2, final String s3, final List list) {
        this.a = (String)v.f.f(s);
        this.b = (String)v.f.f(s2);
        this.c = (String)v.f.f(s3);
        this.d = (List)v.f.f(list);
        this.e = 0;
        this.f = this.a(s, s2, s3);
    }
    
    private String a(final String s, final String s2, final String s3) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("-");
        sb.append(s2);
        sb.append("-");
        sb.append(s3);
        return sb.toString();
    }
    
    public List b() {
        return this.d;
    }
    
    public int c() {
        return this.e;
    }
    
    String d() {
        return this.f;
    }
    
    public String e() {
        return this.a;
    }
    
    public String f() {
        return this.b;
    }
    
    public String g() {
        return this.c;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: ");
        sb2.append(this.a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.b);
        sb2.append(", mQuery: ");
        sb2.append(this.c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.d.size(); ++i) {
            sb.append(" [");
            final List list = (List)this.d.get(i);
            for (int j = 0; j < list.size(); ++j) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[])list.get(j), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("mCertificatesArray: ");
        sb3.append(this.e);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
