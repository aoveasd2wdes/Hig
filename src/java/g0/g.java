package g0;

import androidx.datastore.preferences.protobuf.t$a;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.t$b;
import androidx.datastore.preferences.protobuf.t$d;
import java.util.List;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.u$b;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.t;

public final class g extends t implements k0
{
    private static final g DEFAULT_INSTANCE;
    private static volatile r0 PARSER;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private u$b strings_;
    
    static {
        t.L((Class)g.class, (t)(DEFAULT_INSTANCE = new g()));
    }
    
    private g() {
        this.strings_ = t.t();
    }
    
    private void Q(final Iterable iterable) {
        this.R();
        androidx.datastore.preferences.protobuf.a.f(iterable, (List)this.strings_);
    }
    
    private void R() {
        final u$b strings_ = this.strings_;
        if (!strings_.g()) {
            this.strings_ = t.F(strings_);
        }
    }
    
    public static g S() {
        return g.DEFAULT_INSTANCE;
    }
    
    public static a U() {
        return (a)g.DEFAULT_INSTANCE.p();
    }
    
    public List T() {
        return (List)this.strings_;
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
                if ((parser = g.PARSER) == null) {
                    synchronized (g.class) {
                        if (g.PARSER == null) {
                            g.PARSER = (r0)new t$b((t)g.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return g.DEFAULT_INSTANCE;
            }
            case 3: {
                return t.H((j0)g.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "strings_" });
            }
            case 2: {
                return new a(null);
            }
            case 1: {
                return new g();
            }
        }
    }
    
    public static final class a extends t$a implements k0
    {
        private a() {
            super((t)g.DEFAULT_INSTANCE);
        }
        
        public a q(final Iterable iterable) {
            this.l();
            ((g)super.f).Q(iterable);
            return this;
        }
    }
}
