package i2;

import o1.a;
import com.google.android.gms.common.api.Scope;
import o1.a$a;
import o1.a$g;

public abstract class d
{
    public static final a$g a;
    public static final a$g b;
    public static final a$a c;
    static final a$a d;
    public static final Scope e;
    public static final Scope f;
    public static final a g;
    public static final a h;
    
    static {
        final a$g a$g = a = new a$g();
        final a$g a$g2 = b = new a$g();
        final a$a a$a = c = (a$a)new b();
        final a$a a$a2 = d = (a$a)new c();
        e = new Scope("profile");
        f = new Scope("email");
        g = new a("SignIn.API", a$a, a$g);
        h = new a("SignIn.INTERNAL_API", a$a2, a$g2);
    }
}
