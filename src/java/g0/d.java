package g0;

import androidx.datastore.preferences.protobuf.v;
import d0.c;
import i4.l;
import java.io.InputStream;
import i4.g;

public abstract class d
{
    public static final a a;
    
    static {
        a = new a(null);
    }
    
    public static final class a
    {
        private a() {
        }
        
        public final f a(final InputStream inputStream) {
            l.e(inputStream, "input");
            try {
                final f v = f.V(inputStream);
                l.d(v, "{\n                Prefer\u2026From(input)\n            }");
                return v;
            }
            catch (final v v2) {
                throw new c("Unable to parse preferences proto.", (Throwable)v2);
            }
        }
    }
}
