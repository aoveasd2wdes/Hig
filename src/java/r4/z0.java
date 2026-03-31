package r4;

final class z0 implements l1
{
    private final boolean e;
    
    public z0(final boolean e) {
        this.e = e;
    }
    
    public boolean c() {
        return this.e;
    }
    
    public c2 d() {
        return null;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        String s;
        if (this.c()) {
            s = "Active";
        }
        else {
            s = "New";
        }
        sb.append(s);
        sb.append('}');
        return sb.toString();
    }
}
