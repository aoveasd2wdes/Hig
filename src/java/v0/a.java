package v0;

import android.util.Log;
import i4.l;

public final class a implements g
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    private a() {
    }
    
    public void a(final String s, final String s2) {
        l.e((Object)s, "tag");
        l.e((Object)s2, "message");
        Log.d(s, s2);
    }
}
