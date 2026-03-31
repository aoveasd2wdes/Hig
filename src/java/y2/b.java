package y2;

import w2.f0;
import java.util.List;

public abstract class b implements e
{
    private Boolean k(final String s) {
        final Object c = ((e)this).c(s);
        if (c instanceof Boolean) {
            return (Boolean)c;
        }
        return null;
    }
    
    private String m() {
        return (String)((e)this).c("sql");
    }
    
    private List n() {
        return (List)((e)this).c("arguments");
    }
    
    public f0 d() {
        return new f0(this.m(), this.n());
    }
    
    public boolean e() {
        return Boolean.TRUE.equals(((e)this).c("noResult"));
    }
    
    public Boolean f() {
        return this.k("inTransaction");
    }
    
    public Integer h() {
        return (Integer)((e)this).c("transactionId");
    }
    
    public boolean i() {
        return ((e)this).j("transactionId") && this.h() == null;
    }
    
    public boolean l() {
        return Boolean.TRUE.equals(((e)this).c("continueOnError"));
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(((e)this).g());
        sb.append(" ");
        sb.append(this.m());
        sb.append(" ");
        sb.append((Object)this.n());
        return sb.toString();
    }
}
