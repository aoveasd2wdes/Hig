package s0;

import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import android.view.View;
import java.util.Map;

public class s
{
    public final Map a;
    public View b;
    final ArrayList c;
    
    public s(final View b) {
        this.a = (Map)new HashMap();
        this.c = new ArrayList();
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof s) {
            final View b = this.b;
            final s s = (s)o;
            if (b == s.b && this.a.equals((Object)s.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode() * 31 + this.a.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TransitionValues@");
        sb.append(Integer.toHexString(this.hashCode()));
        sb.append(":\n");
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("    view = ");
        sb2.append((Object)this.b);
        sb2.append("\n");
        final String string2 = sb2.toString();
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(string2);
        sb3.append("    values:");
        String s = sb3.toString();
        for (final String s2 : this.a.keySet()) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(s);
            sb4.append("    ");
            sb4.append(s2);
            sb4.append(": ");
            sb4.append(this.a.get((Object)s2));
            sb4.append("\n");
            s = sb4.toString();
        }
        return s;
    }
}
