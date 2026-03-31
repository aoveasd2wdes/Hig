package b5;

import java.nio.Buffer;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import v3.f;
import java.nio.charset.Charset;
import java.io.EOFException;
import i4.l;
import java.nio.channels.ByteChannel;

public final class b implements d, c, Cloneable, ByteChannel
{
    public m0 e;
    private long f;
    
    public long A() {
        if (this.E() >= 8L) {
            final m0 e = this.e;
            l.b((Object)e);
            final int b = e.b;
            final int c = e.c;
            long n;
            if (c - b < 8L) {
                n = (((long)this.z() & 0xFFFFFFFFL) << 32 | (0xFFFFFFFFL & (long)this.z()));
            }
            else {
                final byte[] a = e.a;
                final int n2 = b + 1;
                final long n3 = a[b];
                final int n4 = n2 + 1;
                final long n5 = a[n2];
                final int n6 = n4 + 1;
                final long n7 = a[n4];
                final int n8 = n6 + 1;
                final long n9 = a[n6];
                final int n10 = n8 + 1;
                final long n11 = a[n8];
                final int n12 = n10 + 1;
                final long n13 = a[n10];
                final int n14 = n12 + 1;
                final long n15 = a[n12];
                final int b2 = n14 + 1;
                final long n16 = a[n14];
                this.D(this.E() - 8L);
                if (b2 == c) {
                    this.e = e.b();
                    n0.b(e);
                }
                else {
                    e.b = b2;
                }
                n = ((n9 & 0xFFL) << 32 | ((n3 & 0xFFL) << 56 | (n5 & 0xFFL) << 48 | (n7 & 0xFFL) << 40) | (n11 & 0xFFL) << 24 | (n13 & 0xFFL) << 16 | (n15 & 0xFFL) << 8 | (n16 & 0xFFL));
            }
            return n;
        }
        throw new EOFException();
    }
    
    public short B() {
        if (this.E() >= 2L) {
            final m0 e = this.e;
            l.b((Object)e);
            final int b = e.b;
            final int c = e.c;
            short n;
            if (c - b < 2) {
                n = (short)((this.readByte() & 0xFF) << 8 | (this.readByte() & 0xFF));
            }
            else {
                final byte[] a = e.a;
                final int n2 = b + 1;
                final byte b2 = a[b];
                final int b3 = n2 + 1;
                final byte b4 = a[n2];
                this.D(this.E() - 2L);
                if (b3 == c) {
                    this.e = e.b();
                    n0.b(e);
                }
                else {
                    e.b = b3;
                }
                n = (short)((b2 & 0xFF) << 8 | (b4 & 0xFF));
            }
            return n;
        }
        throw new EOFException();
    }
    
    public String C(final long n, final Charset charset) {
        l.e((Object)charset, "charset");
        final long n2 = lcmp(n, 0L);
        if (n2 < 0 || n > 2147483647L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (this.f < n) {
            throw new EOFException();
        }
        if (n2 == 0) {
            return "";
        }
        final m0 e = this.e;
        l.b((Object)e);
        final int b = e.b;
        if (b + n > e.c) {
            return new String(this.t(n), charset);
        }
        final byte[] a = e.a;
        final int n3 = (int)n;
        final String s = new String(a, b, n3, charset);
        final int b2 = e.b + n3;
        e.b = b2;
        this.f -= n;
        if (b2 == e.c) {
            this.e = e.b();
            n0.b(e);
        }
        return s;
    }
    
    public final void D(final long f) {
        this.f = f;
    }
    
    public final long E() {
        return this.f;
    }
    
    public final e F() {
        if (this.E() <= 2147483647L) {
            return this.G((int)this.E());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("size > Int.MAX_VALUE: ");
        sb.append(this.E());
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final e G(final int n) {
        Object i;
        if (n == 0) {
            i = b5.e.i;
        }
        else {
            a.b(this.E(), 0L, (long)n);
            m0 m0 = this.e;
            int j = 0;
            int k;
            int n2;
            int c;
            int b;
            for (k = 0, n2 = 0; k < n; k += c - b, ++n2, m0 = m0.f) {
                l.b((Object)m0);
                c = m0.c;
                b = m0.b;
                if (c == b) {
                    throw new AssertionError((Object)"s.limit == s.pos");
                }
            }
            final byte[][] array = new byte[n2][];
            final int[] array2 = new int[n2 * 2];
            m0 m2 = this.e;
            for (int n3 = 0; j < n; j += m2.c - m2.b, array2[n3] = Math.min(j, n), array2[n3 + n2] = m2.b, m2.d = true, ++n3, m2 = m2.f) {
                l.b((Object)m2);
                array[n3] = m2.a;
            }
            i = new o0(array, array2);
        }
        return (e)i;
    }
    
    public final m0 H(final int n) {
        boolean b = true;
        if (n < 1 || n > 8192) {
            b = false;
        }
        if (b) {
            final m0 e = this.e;
            m0 f;
            if (e == null) {
                f = n0.c();
                this.e = f;
                f.g = f;
                f.f = f;
            }
            else {
                l.b((Object)e);
                f = e.g;
                l.b((Object)f);
                if (f.c + n > 8192 || !f.e) {
                    f = f.c(n0.c());
                }
            }
            return f;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }
    
    public b I(final e e) {
        l.e((Object)e, "byteString");
        e.D(this, 0, e.y());
        return this;
    }
    
    public b J(final byte[] array, int i, int n) {
        l.e((Object)array, "source");
        final long n2 = array.length;
        final long n3 = i;
        final long n4 = n;
        a.b(n2, n3, n4);
        for (int n5 = n + i; i < n5; i = n) {
            final m0 h = this.H(1);
            final int min = Math.min(n5 - i, 8192 - h.c);
            final byte[] a = h.a;
            final int c = h.c;
            n = i + min;
            v3.f.d(array, a, c, i, n);
            h.c += min;
        }
        this.D(this.E() + n4);
        return this;
    }
    
    public long K(final q0 q0) {
        l.e((Object)q0, "source");
        long n = 0L;
        while (true) {
            final long m = q0.m(this, 8192L);
            if (m == -1L) {
                break;
            }
            n += m;
        }
        return n;
    }
    
    public b L(final int n) {
        final m0 h = this.H(1);
        h.a[h.c++] = (byte)n;
        this.D(this.E() + 1L);
        return this;
    }
    
    public b M(final String s) {
        l.e((Object)s, "string");
        return this.N(s, 0, s.length());
    }
    
    public b N(final String s, int i, final int n) {
        l.e((Object)s, "string");
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (n < i) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(n);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (n <= s.length()) {
            while (i < n) {
                final char char1 = s.charAt(i);
                if (char1 < '\u0080') {
                    final m0 h = this.H(1);
                    final byte[] a = h.a;
                    final int n2 = h.c - i;
                    final int min = Math.min(n, 8192 - n2);
                    final int n3 = i + 1;
                    a[i + n2] = (byte)char1;
                    char char2;
                    int n4;
                    for (i = n3; i < min; i = n4) {
                        char2 = s.charAt(i);
                        if (char2 >= '\u0080') {
                            break;
                        }
                        n4 = i + 1;
                        a[i + n2] = (byte)char2;
                    }
                    final int c = h.c;
                    final int n5 = n2 + i - c;
                    h.c = c + n5;
                    this.D(this.E() + n5);
                }
                else {
                    long n6;
                    long n7;
                    if (char1 < '\u0800') {
                        final m0 h2 = this.H(2);
                        final byte[] a2 = h2.a;
                        final int c2 = h2.c;
                        a2[c2] = (byte)(char1 >> 6 | 0xC0);
                        a2[c2 + 1] = (byte)((char1 & '?') | 0x80);
                        h2.c = c2 + 2;
                        n6 = this.E();
                        n7 = 2L;
                    }
                    else if (char1 >= '\ud800' && char1 <= '\udfff') {
                        final int n8 = i + 1;
                        char char3;
                        if (n8 < n) {
                            char3 = s.charAt(n8);
                        }
                        else {
                            char3 = '\0';
                        }
                        if (char1 <= '\udbff' && ('\udc00' <= char3 && char3 < '\ue000')) {
                            final int n9 = ((char1 & '\u03ff') << 10 | (char3 & '\u03ff')) + 65536;
                            final m0 h3 = this.H(4);
                            final byte[] a3 = h3.a;
                            final int c3 = h3.c;
                            a3[c3] = (byte)(n9 >> 18 | 0xF0);
                            a3[c3 + 1] = (byte)((n9 >> 12 & 0x3F) | 0x80);
                            a3[c3 + 2] = (byte)((n9 >> 6 & 0x3F) | 0x80);
                            a3[c3 + 3] = (byte)((n9 & 0x3F) | 0x80);
                            h3.c = c3 + 4;
                            this.D(this.E() + 4L);
                            i += 2;
                            continue;
                        }
                        this.L(63);
                        i = n8;
                        continue;
                    }
                    else {
                        final m0 h4 = this.H(3);
                        final byte[] a4 = h4.a;
                        final int c4 = h4.c;
                        a4[c4] = (byte)(char1 >> 12 | 0xE0);
                        a4[c4 + 1] = (byte)((0x3F & char1 >> 6) | 0x80);
                        a4[c4 + 2] = (byte)((char1 & '?') | 0x80);
                        h4.c = c4 + 3;
                        n6 = this.E();
                        n7 = 3L;
                    }
                    this.D(n6 + n7);
                    ++i;
                }
            }
            return this;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("endIndex > string.length: ");
        sb3.append(n);
        sb3.append(" > ");
        sb3.append(s.length());
        throw new IllegalArgumentException(sb3.toString().toString());
    }
    
    public final void a() {
        this.skip(this.E());
    }
    
    public b b() {
        return this.f();
    }
    
    public final long c() {
        final long e = this.E();
        long n = 0L;
        if (e != 0L) {
            final m0 e2 = this.e;
            l.b((Object)e2);
            final m0 g = e2.g;
            l.b((Object)g);
            final int c = g.c;
            n = e;
            if (c < 8192) {
                n = e;
                if (g.e) {
                    n = e - (c - g.b);
                }
            }
        }
        return n;
    }
    
    public void close() {
    }
    
    public String d(final long n) {
        return this.C(n, p4.d.b);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        boolean b2;
        if (this == o) {
            b2 = b;
        }
        else {
            Label_0022: {
                if (o instanceof b) {
                    final long e = this.E();
                    final b b3 = (b)o;
                    if (e == b3.E()) {
                        if (this.E() == 0L) {
                            b2 = b;
                            return b2;
                        }
                        m0 e2 = this.e;
                        l.b((Object)e2);
                        m0 e3 = b3.e;
                        l.b((Object)e3);
                        int n = e2.b;
                        int b4 = e3.b;
                        long n2 = 0L;
                        while (true) {
                            b2 = b;
                            if (n2 >= this.E()) {
                                return b2;
                            }
                            long n3;
                            long n4;
                            int n5;
                            for (n3 = Math.min(e2.c - n, e3.c - b4), n4 = 0L, n5 = n; n4 < n3; ++n4, ++n5, ++b4) {
                                if (e2.a[n5] != e3.a[b4]) {
                                    break Label_0022;
                                }
                            }
                            m0 f = e2;
                            if ((n = n5) == e2.c) {
                                f = e2.f;
                                l.b((Object)f);
                                n = f.b;
                            }
                            m0 f2 = e3;
                            int b5;
                            if ((b5 = b4) == e3.c) {
                                f2 = e3.f;
                                l.b((Object)f2);
                                b5 = f2.b;
                            }
                            n2 += n3;
                            e3 = f2;
                            e2 = f;
                            b4 = b5;
                        }
                    }
                }
            }
            b2 = false;
        }
        return b2;
    }
    
    public final b f() {
        final b b = new b();
        if (this.E() != 0L) {
            final m0 e = this.e;
            l.b((Object)e);
            final m0 d = e.d();
            b.e = d;
            d.g = d;
            d.f = d;
            for (m0 m0 = e.f; m0 != e; m0 = m0.f) {
                final m0 g = d.g;
                l.b((Object)g);
                l.b((Object)m0);
                g.c(m0.d());
            }
            b.D(this.E());
        }
        return b;
    }
    
    public void flush() {
    }
    
    public short g() {
        return a.g(this.B());
    }
    
    public final byte h(final long n) {
        a.b(this.E(), n, 1L);
        m0 m0 = this.e;
        if (m0 != null) {
            byte b;
            if (this.E() - n < n) {
                long e;
                for (e = this.E(); e > n; e -= m0.c - m0.b) {
                    m0 = m0.g;
                    l.b((Object)m0);
                }
                l.b((Object)m0);
                b = m0.a[(int)(m0.b + n - e)];
            }
            else {
                long n2 = 0L;
                while (true) {
                    final long n3 = m0.c - m0.b + n2;
                    if (n3 > n) {
                        break;
                    }
                    m0 = m0.f;
                    l.b((Object)m0);
                    n2 = n3;
                }
                l.b((Object)m0);
                b = m0.a[(int)(m0.b + n - n2)];
            }
            return b;
        }
        l.b((Object)null);
        throw null;
    }
    
    @Override
    public int hashCode() {
        m0 e = this.e;
        int n;
        if (e == null) {
            n = 0;
        }
        else {
            int n2 = 1;
            m0 f;
            do {
                int i = e.b;
                final int c = e.c;
                n = n2;
                while (i < c) {
                    n = n * 31 + e.a[i];
                    ++i;
                }
                f = e.f;
                l.b((Object)f);
                e = f;
                n2 = n;
            } while (f != this.e);
        }
        return n;
    }
    
    public long i(final e e) {
        l.e((Object)e, "targetBytes");
        return this.j(e, 0L);
    }
    
    public boolean isOpen() {
        return true;
    }
    
    public long j(final e e, long n) {
        l.e((Object)e, "targetBytes");
        long n2 = 0L;
        if (n >= 0L) {
            final m0 e2 = this.e;
            final long n3 = -1L;
            long n4;
            if (e2 == null) {
                n4 = n3;
            }
            else {
                m0 m0 = e2;
                m0 m3 = null;
                int j = 0;
                Label_0572: {
                    if (this.E() - n < n) {
                        long e3;
                        m0 m2;
                        for (e3 = this.E(), m2 = e2; e3 > n; e3 -= m2.c - m2.b) {
                            m2 = m2.g;
                            l.b((Object)m2);
                        }
                        if (e.y() == 2) {
                            final byte d = e.d(0);
                            final byte d2 = e.d(1);
                            int i = 0;
                        Block_10:
                            while (true) {
                                n4 = n3;
                                if (e3 >= this.E()) {
                                    return n4;
                                }
                                final byte[] a = m2.a;
                                for (i = (int)(m2.b + n - e3); i < m2.c; ++i) {
                                    final byte b = a[i];
                                    n = e3;
                                    m3 = m2;
                                    j = i;
                                    if (b == d) {
                                        break Label_0572;
                                    }
                                    if (b == d2) {
                                        break Block_10;
                                    }
                                }
                                e3 += m2.c - m2.b;
                                m2 = m2.f;
                                l.b((Object)m2);
                                n = e3;
                            }
                            n = e3;
                            m3 = m2;
                            j = i;
                        }
                        else {
                            final byte[] p2 = e.p();
                            long n5 = n;
                            m3 = m2;
                            n = e3;
                            while (true) {
                                n4 = n3;
                                if (n >= this.E()) {
                                    return n4;
                                }
                                final byte[] a2 = m3.a;
                                for (j = (int)(m3.b + n5 - n); j < m3.c; ++j) {
                                    final byte b2 = a2[j];
                                    for (int length = p2.length, k = 0; k < length; ++k) {
                                        if (b2 == p2[k]) {
                                            break Label_0572;
                                        }
                                    }
                                }
                                n += m3.c - m3.b;
                                m3 = m3.f;
                                l.b((Object)m3);
                                n5 = n;
                            }
                        }
                    }
                    else {
                        while (true) {
                            final long n6 = m0.c - m0.b + n2;
                            if (n6 > n) {
                                break;
                            }
                            m0 = m0.f;
                            l.b((Object)m0);
                            n2 = n6;
                        }
                        if (e.y() == 2) {
                            final byte d3 = e.d(0);
                            final byte d4 = e.d(1);
                            int l = 0;
                        Block_20:
                            while (true) {
                                n4 = n3;
                                if (n2 >= this.E()) {
                                    return n4;
                                }
                                final byte[] a3 = m0.a;
                                for (l = (int)(m0.b + n - n2); l < m0.c; ++l) {
                                    final byte b3 = a3[l];
                                    n = n2;
                                    m3 = m0;
                                    j = l;
                                    if (b3 == d3) {
                                        break Label_0572;
                                    }
                                    if (b3 == d4) {
                                        break Block_20;
                                    }
                                }
                                n2 += m0.c - m0.b;
                                m0 = m0.f;
                                i4.l.b((Object)m0);
                                n = n2;
                            }
                            n = n2;
                            m3 = m0;
                            j = l;
                        }
                        else {
                            final byte[] p3 = e.p();
                            long n7 = n;
                            m3 = m0;
                            n = n2;
                            while (true) {
                                n4 = n3;
                                if (n >= this.E()) {
                                    return n4;
                                }
                                final byte[] a4 = m3.a;
                                for (j = (int)(m3.b + n7 - n); j < m3.c; ++j) {
                                    final byte b4 = a4[j];
                                    for (int length2 = p3.length, n8 = 0; n8 < length2; ++n8) {
                                        if (b4 == p3[n8]) {
                                            break Label_0572;
                                        }
                                    }
                                }
                                n += m3.c - m3.b;
                                m3 = m3.f;
                                l.b((Object)m3);
                                n7 = n;
                            }
                        }
                    }
                }
                n4 = j - m3.b + n;
            }
            return n4;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("fromIndex < 0: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public long k() {
        return a.f(this.A());
    }
    
    public boolean l(final long n, final e e) {
        l.e((Object)e, "bytes");
        return this.p(n, e, 0, e.y());
    }
    
    public long m(final b b, long n) {
        l.e((Object)b, "sink");
        if (n >= 0L) {
            if (this.E() == 0L) {
                n = -1L;
            }
            else {
                long e = n;
                if (n > this.E()) {
                    e = this.E();
                }
                b.x(this, e);
                n = e;
            }
            return n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("byteCount < 0: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public void n(final long n) {
        if (this.f >= n) {
            return;
        }
        throw new EOFException();
    }
    
    public int o() {
        return a.e(this.z());
    }
    
    public boolean p(final long n, final e e, final int n2, final int n3) {
        l.e((Object)e, "bytes");
        boolean b2;
        final boolean b = b2 = false;
        if (n >= 0L) {
            b2 = b;
            if (n2 >= 0) {
                b2 = b;
                if (n3 >= 0) {
                    b2 = b;
                    if (this.E() - n >= n3) {
                        if (e.y() - n2 < n3) {
                            b2 = b;
                        }
                        else {
                            for (int i = 0; i < n3; ++i) {
                                if (this.h(i + n) != e.d(n2 + i)) {
                                    b2 = b;
                                    return b2;
                                }
                            }
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public b q() {
        return this;
    }
    
    public boolean r() {
        return this.f == 0L;
    }
    
    public int read(final ByteBuffer byteBuffer) {
        l.e((Object)byteBuffer, "sink");
        final m0 e = this.e;
        if (e == null) {
            return -1;
        }
        final int min = Math.min(((Buffer)byteBuffer).remaining(), e.c - e.b);
        byteBuffer.put(e.a, e.b, min);
        final int b = e.b + min;
        e.b = b;
        this.f -= min;
        if (b == e.c) {
            this.e = e.b();
            n0.b(e);
        }
        return min;
    }
    
    public int read(final byte[] array, int n, int min) {
        l.e((Object)array, "sink");
        a.b((long)array.length, (long)n, (long)min);
        final m0 e = this.e;
        if (e == null) {
            n = -1;
        }
        else {
            min = Math.min(min, e.c - e.b);
            final byte[] a = e.a;
            final int b = e.b;
            v3.f.d(a, array, n, b, b + min);
            e.b += min;
            this.D(this.E() - min);
            if (e.b == e.c) {
                this.e = e.b();
                n0.b(e);
            }
            n = min;
        }
        return n;
    }
    
    public byte readByte() {
        if (this.E() != 0L) {
            final m0 e = this.e;
            l.b((Object)e);
            final int b = e.b;
            final int c = e.c;
            final byte[] a = e.a;
            final int b2 = b + 1;
            final byte b3 = a[b];
            this.D(this.E() - 1L);
            if (b2 == c) {
                this.e = e.b();
                n0.b(e);
            }
            else {
                e.b = b2;
            }
            return b3;
        }
        throw new EOFException();
    }
    
    public OutputStream s() {
        return (OutputStream)new b$c(this);
    }
    
    public void skip(long n) {
        while (n > 0L) {
            final m0 e = this.e;
            if (e == null) {
                throw new EOFException();
            }
            final int n2 = (int)Math.min(n, (long)(e.c - e.b));
            final long e2 = this.E();
            final long n3 = n2;
            this.D(e2 - n3);
            final long n4 = n - n3;
            final int b = e.b + n2;
            e.b = b;
            n = n4;
            if (b != e.c) {
                continue;
            }
            this.e = e.b();
            n0.b(e);
            n = n4;
        }
    }
    
    public byte[] t(final long n) {
        if (n < 0L || n > 2147483647L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (this.E() >= n) {
            final byte[] array = new byte[(int)n];
            this.w(array);
            return array;
        }
        throw new EOFException();
    }
    
    @Override
    public String toString() {
        return this.F().toString();
    }
    
    public e u() {
        return this.v(this.E());
    }
    
    public e v(final long n) {
        if (n < 0L || n > 2147483647L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (this.E() >= n) {
            e g;
            if (n >= 4096L) {
                g = this.G((int)n);
                this.skip(n);
            }
            else {
                g = new e(this.t(n));
            }
            return g;
        }
        throw new EOFException();
    }
    
    public void w(final byte[] array) {
        l.e((Object)array, "sink");
        int read;
        for (int i = 0; i < array.length; i += read) {
            read = this.read(array, i, array.length - i);
            if (read == -1) {
                throw new EOFException();
            }
        }
    }
    
    public int write(final ByteBuffer byteBuffer) {
        l.e((Object)byteBuffer, "source");
        int i;
        int n;
        m0 h;
        int min;
        for (n = (i = ((Buffer)byteBuffer).remaining()); i > 0; i -= min, h.c += min) {
            h = this.H(1);
            min = Math.min(i, 8192 - h.c);
            byteBuffer.get(h.a, h.c, min);
        }
        this.f += n;
        return n;
    }
    
    public void x(final b b, long n) {
        l.e((Object)b, "source");
        if (b != this) {
            a.b(b.E(), 0L, n);
            while (n > 0L) {
                final m0 e = b.e;
                l.b((Object)e);
                final int c = e.c;
                final m0 e2 = b.e;
                l.b((Object)e2);
                if (n < c - e2.b) {
                    final m0 e3 = this.e;
                    m0 g;
                    if (e3 != null) {
                        l.b((Object)e3);
                        g = e3.g;
                    }
                    else {
                        g = null;
                    }
                    if (g != null && g.e) {
                        final long n2 = g.c;
                        int b2;
                        if (g.d) {
                            b2 = 0;
                        }
                        else {
                            b2 = g.b;
                        }
                        if (n2 + n - b2 <= 8192L) {
                            final m0 e4 = b.e;
                            l.b((Object)e4);
                            e4.f(g, (int)n);
                            b.D(b.E() - n);
                            this.D(this.E() + n);
                            break;
                        }
                    }
                    final m0 e5 = b.e;
                    l.b((Object)e5);
                    b.e = e5.e((int)n);
                }
                final m0 e6 = b.e;
                l.b((Object)e6);
                final long n3 = e6.c - e6.b;
                b.e = e6.b();
                final m0 e7 = this.e;
                if (e7 == null) {
                    this.e = e6;
                    e6.g = e6;
                    e6.f = e6;
                }
                else {
                    l.b((Object)e7);
                    final m0 g2 = e7.g;
                    l.b((Object)g2);
                    g2.c(e6).a();
                }
                b.D(b.E() - n3);
                this.D(this.E() + n3);
                n -= n3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }
    
    public InputStream y() {
        return (InputStream)new b$b(this);
    }
    
    public int z() {
        if (this.E() >= 4L) {
            final m0 e = this.e;
            l.b((Object)e);
            final int b = e.b;
            final int c = e.c;
            int n;
            if (c - b < 4L) {
                n = ((this.readByte() & 0xFF) << 24 | (this.readByte() & 0xFF) << 16 | (this.readByte() & 0xFF) << 8 | (this.readByte() & 0xFF));
            }
            else {
                final byte[] a = e.a;
                final int n2 = b + 1;
                final byte b2 = a[b];
                final int n3 = n2 + 1;
                final byte b3 = a[n2];
                final int n4 = n3 + 1;
                final byte b4 = a[n3];
                final int b5 = n4 + 1;
                final byte b6 = a[n4];
                this.D(this.E() - 4L);
                if (b5 == c) {
                    this.e = e.b();
                    n0.b(e);
                }
                else {
                    e.b = b5;
                }
                n = ((b2 & 0xFF) << 24 | (b3 & 0xFF) << 16 | (b4 & 0xFF) << 8 | (b6 & 0xFF));
            }
            return n;
        }
        throw new EOFException();
    }
}
