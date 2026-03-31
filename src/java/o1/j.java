package o1;

import n1.c;

public final class j extends UnsupportedOperationException
{
    private final c e;
    
    public j(final c e) {
        this.e = e;
    }
    
    public String getMessage() {
        return "Missing ".concat(String.valueOf((Object)this.e));
    }
}
