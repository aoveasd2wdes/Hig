package b5;

import v3.f;
import c5.d;
import i4.l;

public final class o0 extends e
{
    private final transient byte[][] j;
    private final transient int[] k;
    
    public o0(final byte[][] j, final int[] k) {
        l.e((Object)j, "segments");
        l.e((Object)k, "directory");
        super(e.i.f());
        this.j = j;
        this.k = k;
    }
    
    private final e H() {
        return new e(this.G());
    }
    
    public e A(final int n, int n2) {
        final int d = a.d((e)this, n2);
        final int n3 = 0;
        if (n >= 0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("beginIndex=");
            sb.append(n);
            sb.append(" < 0");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (d <= this.y()) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex=");
            sb2.append(d);
            sb2.append(" > length(");
            sb2.append(this.y());
            sb2.append(')');
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        final int n4 = d - n;
        if (n4 >= 0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            e i;
            if (n == 0 && d == this.y()) {
                i = this;
            }
            else if (n == d) {
                i = e.i;
            }
            else {
                final int b = c5.d.b(this, n);
                final int b2 = c5.d.b(this, d - 1);
                final byte[][] array = (byte[][])f.i((Object[])this.F(), b, b2 + 1);
                final int[] array2 = new int[array.length * 2];
                if (b <= b2) {
                    n2 = b;
                    int n5 = 0;
                    while (true) {
                        array2[n5] = Math.min(this.E()[n2] - n, n4);
                        array2[n5 + array.length] = this.E()[this.F().length + n2];
                        if (n2 == b2) {
                            break;
                        }
                        ++n2;
                        ++n5;
                    }
                }
                if (b == 0) {
                    n2 = n3;
                }
                else {
                    n2 = this.E()[b - 1];
                }
                final int length = array.length;
                array2[length] += n - n2;
                i = new o0(array, array2);
            }
            return i;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("endIndex=");
        sb3.append(d);
        sb3.append(" < beginIndex=");
        sb3.append(n);
        throw new IllegalArgumentException(sb3.toString().toString());
    }
    
    public void D(final b b, int i, final int n) {
        l.e((Object)b, "buffer");
        int n6;
        for (int n2 = i + n, b2 = d.b(this, i); i < n2; i += n6, ++b2) {
            int n3;
            if (b2 == 0) {
                n3 = 0;
            }
            else {
                n3 = this.E()[b2 - 1];
            }
            final int n4 = this.E()[b2];
            final int n5 = this.E()[this.F().length + b2];
            n6 = Math.min(n2, n4 - n3 + n3) - i;
            final int n7 = n5 + (i - n3);
            final m0 e = new m0(this.F()[b2], n7, n7 + n6, true, false);
            final m0 e2 = b.e;
            if (e2 == null) {
                e.g = e;
                e.f = e;
                b.e = e;
            }
            else {
                l.b((Object)e2);
                final m0 g = e2.g;
                l.b((Object)g);
                g.c(e);
            }
        }
        b.D(b.E() + n);
    }
    
    public final int[] E() {
        return this.k;
    }
    
    public final byte[][] F() {
        return this.j;
    }
    
    public byte[] G() {
        final byte[] array = new byte[this.y()];
        final int length = this.F().length;
        int i = 0;
        int n = 0;
        int n2 = 0;
        while (i < length) {
            final int n3 = this.E()[length + i];
            final int n4 = this.E()[i];
            final byte[] array2 = this.F()[i];
            final int n5 = n4 - n;
            f.d(array2, array, n2, n3, n3 + n5);
            n2 += n5;
            ++i;
            n = n4;
        }
        return array;
    }
    
    public boolean equals(final Object o) {
        boolean b = true;
        if (o != this) {
            if (o instanceof e) {
                final e e = (e)o;
                if (e.y() == this.y() && this.u(0, e, 0, this.y())) {
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    public int hashCode() {
        int g = this.g();
        if (g == 0) {
            final int length = this.F().length;
            int i = 0;
            g = 1;
            int n = 0;
            while (i < length) {
                final int n2 = this.E()[length + i];
                final int n3 = this.E()[i];
                final byte[] array = this.F()[i];
                for (int j = n2; j < n3 - n + n2; ++j) {
                    g = g * 31 + array[j];
                }
                ++i;
                n = n3;
            }
            this.w(g);
        }
        return g;
    }
    
    public int j() {
        return this.E()[this.F().length - 1];
    }
    
    public String l() {
        return this.H().l();
    }
    
    public int n(final byte[] array, final int n) {
        l.e((Object)array, "other");
        return this.H().n(array, n);
    }
    
    public byte[] p() {
        return this.G();
    }
    
    public byte q(final int n) {
        a.b((long)this.E()[this.F().length - 1], (long)n, 1L);
        final int b = d.b(this, n);
        int n2;
        if (b == 0) {
            n2 = 0;
        }
        else {
            n2 = this.E()[b - 1];
        }
        return this.F()[b][n - n2 + this.E()[this.F().length + b]];
    }
    
    public int s(final byte[] array, final int n) {
        l.e((Object)array, "other");
        return this.H().s(array, n);
    }
    
    public String toString() {
        return this.H().toString();
    }
    
    public boolean u(int i, final e e, int n, int n2) {
        l.e((Object)e, "other");
        boolean b2;
        final boolean b = b2 = false;
        if (i >= 0) {
            if (i > this.y() - n2) {
                b2 = b;
            }
            else {
                final int n3 = n2 + i;
                final int b3 = d.b(this, i);
                n2 = n;
                int n4;
                int n5;
                int n6;
                int n7;
                for (n = b3; i < n3; i += n7, ++n) {
                    if (n == 0) {
                        n4 = 0;
                    }
                    else {
                        n4 = this.E()[n - 1];
                    }
                    n5 = this.E()[n];
                    n6 = this.E()[this.F().length + n];
                    n7 = Math.min(n3, n5 - n4 + n4) - i;
                    if (!e.v(n2, this.F()[n], n6 + (i - n4), n7)) {
                        b2 = b;
                        return b2;
                    }
                    n2 += n7;
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    public boolean v(int n, final byte[] array, int n2, int i) {
        l.e((Object)array, "other");
        boolean b2;
        final boolean b = b2 = false;
        if (n >= 0) {
            b2 = b;
            if (n <= this.y() - i) {
                b2 = b;
                if (n2 >= 0) {
                    if (n2 > array.length - i) {
                        b2 = b;
                    }
                    else {
                        final int n3 = i + n;
                        final int b3 = d.b(this, n);
                        int n4;
                        int n5;
                        int n6;
                        int n7;
                        for (i = n, n = b3; i < n3; i += n7, ++n) {
                            if (n == 0) {
                                n4 = 0;
                            }
                            else {
                                n4 = this.E()[n - 1];
                            }
                            n5 = this.E()[n];
                            n6 = this.E()[this.F().length + n];
                            n7 = Math.min(n3, n5 - n4 + n4) - i;
                            if (!a.a(this.F()[n], n6 + (i - n4), array, n2, n7)) {
                                b2 = b;
                                return b2;
                            }
                            n2 += n7;
                        }
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
}
