package i1;

import java.util.Map;

public class a
{
    private final String a;
    private final String b;
    
    private a(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static a c(final Map map) {
        if (map == null) {
            return null;
        }
        return new a((String)map.get((Object)"name"), (String)map.get((Object)"defType"));
    }
    
    public String a() {
        return this.b;
    }
    
    public String b() {
        return this.a;
    }
}
