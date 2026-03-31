package p;

import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map$Entry;
import java.util.LinkedHashMap;

public class e
{
    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    
    public e(final int c) {
        if (c > 0) {
            this.c = c;
            this.a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
    
    private int f(final Object o, final Object o2) {
        final int g = this.g(o, o2);
        if (g >= 0) {
            return g;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(o);
        sb.append("=");
        sb.append(o2);
        throw new IllegalStateException(sb.toString());
    }
    
    protected Object a(final Object o) {
        return null;
    }
    
    protected void b(final boolean b, final Object o, final Object o2, final Object o3) {
    }
    
    public final void c() {
        this.h(-1);
    }
    
    public final Object d(final Object o) {
        if (o != null) {
            synchronized (this) {
                final Object value = this.a.get(o);
                if (value != null) {
                    ++this.g;
                    return value;
                }
                ++this.h;
                monitorexit(this);
                final Object a = this.a(o);
                if (a == null) {
                    return null;
                }
                synchronized (this) {
                    ++this.e;
                    final Object put = ((AbstractMap)this.a).put(o, a);
                    if (put != null) {
                        ((AbstractMap)this.a).put(o, put);
                    }
                    else {
                        this.b += this.f(o, a);
                    }
                    monitorexit(this);
                    if (put != null) {
                        this.b(false, o, a, put);
                        return put;
                    }
                    this.h(this.c);
                    return a;
                }
            }
        }
        throw new NullPointerException("key == null");
    }
    
    public final Object e(final Object o, final Object o2) {
        if (o != null && o2 != null) {
            synchronized (this) {
                ++this.d;
                this.b += this.f(o, o2);
                final Object put = ((AbstractMap)this.a).put(o, o2);
                if (put != null) {
                    this.b -= this.f(o, put);
                }
                monitorexit(this);
                if (put != null) {
                    this.b(false, o, put, o2);
                }
                this.h(this.c);
                return put;
            }
        }
        throw new NullPointerException("key == null || value == null");
    }
    
    protected int g(final Object o, final Object o2) {
        return 1;
    }
    
    public void h(final int n) {
        while (true) {
            synchronized (this) {
                if (this.b < 0 || (((AbstractMap)this.a).isEmpty() && this.b != 0)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.getClass().getName());
                    sb.append(".sizeOf() is reporting inconsistent results!");
                    throw new IllegalStateException(sb.toString());
                }
                if (this.b <= n || ((AbstractMap)this.a).isEmpty()) {
                    return;
                }
                final Map$Entry map$Entry = (Map$Entry)this.a.entrySet().iterator().next();
                final Object key = map$Entry.getKey();
                final Object value = map$Entry.getValue();
                ((AbstractMap)this.a).remove(key);
                this.b -= this.f(key, value);
                ++this.f;
                monitorexit(this);
                this.b(true, key, value, null);
            }
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final int g = this.g;
            final int n = this.h + g;
            int n2;
            if (n != 0) {
                n2 = g * 100 / n;
            }
            else {
                n2 = 0;
            }
            return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { this.c, this.g, this.h, n2 });
        }
    }
}
