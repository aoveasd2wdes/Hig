package g0;

import androidx.datastore.preferences.protobuf.t$a;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.t$b;
import androidx.datastore.preferences.protobuf.t$d;
import java.util.Collections;
import java.io.InputStream;
import java.util.Map;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.t;

public final class f extends t implements k0
{
    private static final f DEFAULT_INSTANCE;
    private static volatile r0 PARSER;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private d0 preferences_;
    
    static {
        t.L((Class)f.class, (t)(DEFAULT_INSTANCE = new f()));
    }
    
    private f() {
        this.preferences_ = d0.d();
    }
    
    private Map Q() {
        return (Map)this.S();
    }
    
    private d0 S() {
        if (!this.preferences_.i()) {
            this.preferences_ = this.preferences_.l();
        }
        return this.preferences_;
    }
    
    private d0 T() {
        return this.preferences_;
    }
    
    public static a U() {
        return (a)f.DEFAULT_INSTANCE.p();
    }
    
    public static f V(final InputStream inputStream) {
        return (f)t.J((t)f.DEFAULT_INSTANCE, inputStream);
    }
    
    public Map R() {
        return Collections.unmodifiableMap((Map)this.T());
    }
    
    protected final Object s(final t$d t$d, final Object o, final Object o2) {
        switch (e.a[((Enum)t$d).ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                return null;
            }
            case 6: {
                return 1;
            }
            case 5: {
                final r0 parser;
                if ((parser = f.PARSER) == null) {
                    synchronized (f.class) {
                        if (f.PARSER == null) {
                            f.PARSER = (r0)new t$b((t)f.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return f.DEFAULT_INSTANCE;
            }
            case 3: {
                return t.H((j0)f.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "preferences_", f.f$b.a });
            }
            case 2: {
                return new a(null);
            }
            case 1: {
                return new f();
            }
        }
    }
    
    public static final class a extends t$a implements k0
    {
        private a() {
            super((t)f.DEFAULT_INSTANCE);
        }
        
        public a q(final String s, final h h) {
            s.getClass();
            h.getClass();
            this.l();
            ((f)super.f).Q().put((Object)s, (Object)h);
            return this;
        }
    }
}
