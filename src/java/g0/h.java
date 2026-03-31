package g0;

import androidx.datastore.preferences.protobuf.t$a;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.t$b;
import androidx.datastore.preferences.protobuf.t$d;
import androidx.datastore.preferences.protobuf.f;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.t;

public final class h extends t implements k0
{
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile r0 PARSER;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_;
    private Object value_;
    
    static {
        t.L((Class)h.class, (t)(DEFAULT_INSTANCE = new h()));
    }
    
    private h() {
        this.valueCase_ = 0;
    }
    
    public static h Z() {
        return h.DEFAULT_INSTANCE;
    }
    
    public static a h0() {
        return (a)h.DEFAULT_INSTANCE.p();
    }
    
    private void i0(final boolean b) {
        this.valueCase_ = 1;
        this.value_ = b;
    }
    
    private void j0(final f value_) {
        value_.getClass();
        this.valueCase_ = 8;
        this.value_ = value_;
    }
    
    private void k0(final double n) {
        this.valueCase_ = 7;
        this.value_ = n;
    }
    
    private void l0(final float n) {
        this.valueCase_ = 2;
        this.value_ = n;
    }
    
    private void m0(final int n) {
        this.valueCase_ = 3;
        this.value_ = n;
    }
    
    private void n0(final long n) {
        this.valueCase_ = 4;
        this.value_ = n;
    }
    
    private void o0(final String value_) {
        value_.getClass();
        this.valueCase_ = 5;
        this.value_ = value_;
    }
    
    private void p0(final g value_) {
        value_.getClass();
        this.value_ = value_;
        this.valueCase_ = 6;
    }
    
    public boolean X() {
        return this.valueCase_ == 1 && (boolean)this.value_;
    }
    
    public f Y() {
        if (this.valueCase_ == 8) {
            return (f)this.value_;
        }
        return f.f;
    }
    
    public double a0() {
        if (this.valueCase_ == 7) {
            return (double)this.value_;
        }
        return 0.0;
    }
    
    public float b0() {
        if (this.valueCase_ == 2) {
            return (float)this.value_;
        }
        return 0.0f;
    }
    
    public int c0() {
        if (this.valueCase_ == 3) {
            return (int)this.value_;
        }
        return 0;
    }
    
    public long d0() {
        if (this.valueCase_ == 4) {
            return (long)this.value_;
        }
        return 0L;
    }
    
    public String e0() {
        String s;
        if (this.valueCase_ == 5) {
            s = (String)this.value_;
        }
        else {
            s = "";
        }
        return s;
    }
    
    public g f0() {
        if (this.valueCase_ == 6) {
            return (g)this.value_;
        }
        return g.S();
    }
    
    public h.h$b g0() {
        return h.h$b.b(this.valueCase_);
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
                if ((parser = h.PARSER) == null) {
                    synchronized (h.class) {
                        if (h.PARSER == null) {
                            h.PARSER = (r0)new t$b((t)h.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return h.DEFAULT_INSTANCE;
            }
            case 3: {
                return t.H((j0)h.DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u103a\u0000\u0002\u1034\u0000\u0003\u1037\u0000\u0004\u1035\u0000\u0005\u103b\u0000\u0006\u103c\u0000\u0007\u1033\u0000\b\u103d\u0000", new Object[] { "value_", "valueCase_", "bitField0_", g.class });
            }
            case 2: {
                return new a(null);
            }
            case 1: {
                return new h();
            }
        }
    }
    
    public static final class a extends t$a implements k0
    {
        private a() {
            super((t)h.DEFAULT_INSTANCE);
        }
        
        public a q(final boolean b) {
            this.l();
            ((h)super.f).i0(b);
            return this;
        }
        
        public a r(final f f) {
            this.l();
            ((h)super.f).j0(f);
            return this;
        }
        
        public a s(final double n) {
            this.l();
            ((h)super.f).k0(n);
            return this;
        }
        
        public a t(final float n) {
            this.l();
            ((h)super.f).l0(n);
            return this;
        }
        
        public a u(final int n) {
            this.l();
            ((h)super.f).m0(n);
            return this;
        }
        
        public a v(final long n) {
            this.l();
            ((h)super.f).n0(n);
            return this;
        }
        
        public a w(final String s) {
            this.l();
            ((h)super.f).o0(s);
            return this;
        }
        
        public a x(final g.a a) {
            this.l();
            ((h)super.f).p0((g)a.i());
            return this;
        }
    }
}
