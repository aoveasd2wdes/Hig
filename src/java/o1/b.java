package o1;

import com.google.android.gms.common.api.Status;

public class b extends Exception
{
    protected final Status e;
    
    public b(final Status e) {
        final int b = e.b();
        String c;
        if (e.c() != null) {
            c = e.c();
        }
        else {
            c = "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(": ");
        sb.append(c);
        super(sb.toString());
        this.e = e;
    }
    
    public Status a() {
        return this.e;
    }
    
    public int b() {
        return this.e.b();
    }
}
