package p4;

import i4.l;
import java.nio.charset.Charset;

public final class d
{
    public static final d a;
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static final Charset f;
    public static final Charset g;
    
    static {
        a = new d();
        final Charset forName = Charset.forName("UTF-8");
        l.d((Object)forName, "forName(...)");
        b = forName;
        final Charset forName2 = Charset.forName("UTF-16");
        l.d((Object)forName2, "forName(...)");
        c = forName2;
        final Charset forName3 = Charset.forName("UTF-16BE");
        l.d((Object)forName3, "forName(...)");
        d = forName3;
        final Charset forName4 = Charset.forName("UTF-16LE");
        l.d((Object)forName4, "forName(...)");
        e = forName4;
        final Charset forName5 = Charset.forName("US-ASCII");
        l.d((Object)forName5, "forName(...)");
        f = forName5;
        final Charset forName6 = Charset.forName("ISO-8859-1");
        l.d((Object)forName6, "forName(...)");
        g = forName6;
    }
    
    private d() {
    }
}
