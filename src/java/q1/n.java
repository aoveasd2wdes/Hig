package q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public abstract class n
{
    public static boolean a(final Object o, final Object obj) {
        boolean b = true;
        if (o != obj) {
            if (o != null) {
                if (!o.equals(obj)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public static int b(final Object... array) {
        return Arrays.hashCode(array);
    }
    
    public static a c(final Object o) {
        return new a(o, null);
    }
    
    public static final class a
    {
        private final List a;
        private final Object b;
        
        public a a(String string, final Object o) {
            o.h(string);
            final String value = String.valueOf(o);
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("=");
            sb.append(value);
            string = sb.toString();
            this.a.add((Object)string);
            return this;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            for (int size = this.a.size(), i = 0; i < size; ++i) {
                sb.append((String)this.a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }
}
