package i4;

public final class n implements d
{
    private final Class a;
    private final String b;
    
    public n(final Class a, final String b) {
        l.e((Object)a, "jClass");
        l.e((Object)b, "moduleName");
        this.a = a;
        this.b = b;
    }
    
    public Class c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof n && l.a((Object)this.c(), (Object)((n)o).c());
    }
    
    @Override
    public int hashCode() {
        return this.c().hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.c().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
