package j0;

import android.view.View;
import androidx.lifecycle.h$b;
import java.lang.reflect.Modifier;
import k0.c;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class j0
{
    private final t a;
    private final ClassLoader b;
    ArrayList c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    boolean j;
    String k;
    int l;
    CharSequence m;
    int n;
    CharSequence o;
    ArrayList p;
    ArrayList q;
    boolean r;
    ArrayList s;
    
    j0(final t a, final ClassLoader b) {
        this.c = new ArrayList();
        this.j = true;
        this.r = false;
        this.a = a;
        this.b = b;
    }
    
    public j0 b(final int n, final o o, final String s) {
        this.g(n, o, s, 1);
        return this;
    }
    
    j0 c(final ViewGroup i, final o o, final String s) {
        o.I = i;
        return this.b(((View)i).getId(), o, s);
    }
    
    void d(final a a) {
        this.c.add((Object)a);
        a.d = this.d;
        a.e = this.e;
        a.f = this.f;
        a.g = this.g;
    }
    
    public abstract void e();
    
    public j0 f() {
        if (!this.i) {
            this.j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
    
    void g(final int n, final o o, final String a, final int n2) {
        final String r = o.R;
        if (r != null) {
            k0.c.f(o, r);
        }
        final Class<? extends o> class1 = o.getClass();
        final int modifiers = class1.getModifiers();
        if (!class1.isAnonymousClass() && Modifier.isPublic(modifiers) && (!class1.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (a != null) {
                final String a2 = o.A;
                if (a2 != null && !a.equals((Object)a2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't change tag of fragment ");
                    sb.append((Object)o);
                    sb.append(": was ");
                    sb.append(o.A);
                    sb.append(" now ");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
                o.A = a;
            }
            if (n != 0) {
                if (n == -1) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Can't add fragment ");
                    sb2.append((Object)o);
                    sb2.append(" with tag ");
                    sb2.append(a);
                    sb2.append(" to container view with no id");
                    throw new IllegalArgumentException(sb2.toString());
                }
                final int y = o.y;
                if (y != 0 && y != n) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append((Object)o);
                    sb3.append(": was ");
                    sb3.append(o.y);
                    sb3.append(" now ");
                    sb3.append(n);
                    throw new IllegalStateException(sb3.toString());
                }
                o.y = n;
                o.z = n;
            }
            this.d(new a(n2, o));
            return;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(class1.getCanonicalName());
        sb4.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(sb4.toString());
    }
    
    public j0 h(final boolean r) {
        this.r = r;
        return this;
    }
    
    static final class a
    {
        int a;
        o b;
        boolean c;
        int d;
        int e;
        int f;
        int g;
        h$b h;
        h$b i;
        
        a() {
        }
        
        a(final int a, final o b) {
            this.a = a;
            this.b = b;
            this.c = false;
            final h$b i = h$b.i;
            this.h = i;
            this.i = i;
        }
        
        a(final int a, final o b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
            final h$b i = h$b.i;
            this.h = i;
            this.i = i;
        }
    }
}
