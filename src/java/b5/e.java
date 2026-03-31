package b5;

import java.util.Arrays;
import v3.f;
import i4.l;
import i4.g;
import java.io.Serializable;

public class e implements Serializable, Comparable
{
    public static final a h;
    public static final e i;
    private final byte[] e;
    private transient int f;
    private transient String g;
    
    static {
        h = new a(null);
        i = new e(new byte[0]);
    }
    
    public e(final byte[] e) {
        l.e(e, "data");
        this.e = e;
    }
    
    public e A(final int n, int n2) {
        final int d = b5.a.d(this, n2);
        final int n3 = 1;
        if (n >= 0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (d <= this.f().length) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("endIndex > length(");
            sb.append(this.f().length);
            sb.append(')');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (d - n >= 0) {
            n2 = n3;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            e e;
            if (n == 0 && d == this.f().length) {
                e = this;
            }
            else {
                e = new e(v3.f.h(this.f(), n, d));
            }
            return e;
        }
        throw new IllegalArgumentException("endIndex < beginIndex".toString());
    }
    
    public String C() {
        String s;
        if ((s = this.k()) == null) {
            s = t0.c(this.p());
            this.x(s);
        }
        return s;
    }
    
    public void D(final b b, final int n, final int n2) {
        l.e(b, "buffer");
        c5.a.c(this, b, n, n2);
    }
    
    public int a(final e e) {
        l.e(e, "other");
        final int y = this.y();
        final int y2 = e.y();
        final int min = Math.min(y, y2);
        final int n = 0;
        while (true) {
            while (true) {
                for (int i = 0; i < min; ++i) {
                    final int n2 = this.d(i) & 0xFF;
                    final int n3 = e.d(i) & 0xFF;
                    if (n2 != n3) {
                        int n4;
                        if (n2 < n3) {
                            n4 = -1;
                        }
                        else {
                            n4 = 1;
                        }
                        return n4;
                    }
                }
                if (y == y2) {
                    return n;
                }
                if (y < y2) {
                    continue;
                }
                break;
            }
            continue;
        }
    }
    
    public final boolean b(final e e) {
        l.e(e, "suffix");
        return this.u(this.y() - e.y(), e, 0, e.y());
    }
    
    public final byte d(final int n) {
        return this.q(n);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o != this) {
            if (o instanceof e) {
                final e e = (e)o;
                if (e.y() == this.f().length && e.v(0, this.f(), 0, this.f().length)) {
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    public final byte[] f() {
        return this.e;
    }
    
    public final int g() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        int n = this.g();
        if (n == 0) {
            n = Arrays.hashCode(this.f());
            this.w(n);
        }
        return n;
    }
    
    public int j() {
        return this.f().length;
    }
    
    public final String k() {
        return this.g;
    }
    
    public String l() {
        final char[] array = new char[this.f().length * 2];
        final byte[] f = this.f();
        final int length = f.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final byte b = f[i];
            final int n2 = n + 1;
            array[n] = c5.a.d()[b >> 4 & 0xF];
            n = n2 + 1;
            array[n2] = c5.a.d()[b & 0xF];
            ++i;
        }
        return p4.f.h(array);
    }
    
    public final int m(final e e, final int n) {
        l.e(e, "other");
        return this.n(e.p(), n);
    }
    
    public int n(final byte[] array, int max) {
        l.e(array, "other");
        final int n = this.f().length - array.length;
        max = Math.max(max, 0);
        if (max <= n) {
            while (!b5.a.a(this.f(), max, array, 0, array.length)) {
                if (max == n) {
                    return -1;
                }
                ++max;
            }
            return max;
        }
        max = -1;
        return max;
    }
    
    public byte[] p() {
        return this.f();
    }
    
    public byte q(final int n) {
        return this.f()[n];
    }
    
    public final int r(final e e, final int n) {
        l.e(e, "other");
        return this.s(e.p(), n);
    }
    
    public int s(final byte[] array, int min) {
        l.e(array, "other");
        for (min = Math.min(b5.a.d(this, min), this.f().length - array.length); -1 < min; --min) {
            if (b5.a.a(this.f(), min, array, 0, array.length)) {
                return min;
            }
        }
        min = -1;
        return min;
    }
    
    @Override
    public String toString() {
        final int length = this.f().length;
        final int n = 1;
        String s;
        if (length == 0) {
            s = "[size=0]";
        }
        else {
            final int a = c5.a.a(this.f(), 64);
            StringBuilder sb4 = null;
            Label_0236: {
                if (a == -1) {
                    if (this.f().length <= 64) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("[hex=");
                        sb.append(this.l());
                        sb.append(']');
                        s = sb.toString();
                        return s;
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("[size=");
                    sb2.append(this.f().length);
                    sb2.append(" hex=");
                    final int d = b5.a.d(this, 64);
                    if (d > this.f().length) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("endIndex > length(");
                        sb3.append(this.f().length);
                        sb3.append(')');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    int n2;
                    if (d + 0 >= 0) {
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                    if (n2 == 0) {
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    e e;
                    if (d == this.f().length) {
                        e = this;
                    }
                    else {
                        e = new e(v3.f.h(this.f(), 0, d));
                    }
                    sb2.append(e.l());
                    sb4 = sb2;
                }
                else {
                    final String c = this.C();
                    final String substring = c.substring(0, a);
                    l.d(substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                    final String n3 = p4.f.n(p4.f.n(p4.f.n(substring, "\\", "\\\\", false, 4, (Object)null), "\n", "\\n", false, 4, (Object)null), "\r", "\\r", false, 4, (Object)null);
                    if (a >= c.length()) {
                        sb4 = new StringBuilder();
                        sb4.append("[text=");
                        sb4.append(n3);
                        sb4.append(']');
                        break Label_0236;
                    }
                    sb4 = new StringBuilder();
                    sb4.append("[size=");
                    sb4.append(this.f().length);
                    sb4.append(" text=");
                    sb4.append(n3);
                }
                sb4.append("\u2026]");
            }
            s = sb4.toString();
        }
        return s;
    }
    
    public boolean u(final int n, final e e, final int n2, final int n3) {
        l.e(e, "other");
        return e.v(n2, this.f(), n, n3);
    }
    
    public boolean v(final int n, final byte[] array, final int n2, final int n3) {
        l.e(array, "other");
        return n >= 0 && n <= this.f().length - n3 && n2 >= 0 && n2 <= array.length - n3 && b5.a.a(this.f(), n, array, n2, n3);
    }
    
    public final void w(final int f) {
        this.f = f;
    }
    
    public final void x(final String g) {
        this.g = g;
    }
    
    public final int y() {
        return this.j();
    }
    
    public final boolean z(final e e) {
        l.e(e, "prefix");
        return this.u(0, e, 0, e.y());
    }
    
    public static final class a
    {
        private a() {
        }
        
        public final e a(final String s) {
            l.e(s, "<this>");
            final e e = new e(t0.a(s));
            e.x(s);
            return e;
        }
    }
}
