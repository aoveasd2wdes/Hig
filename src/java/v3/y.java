package v3;

import java.util.Collection;
import java.util.Set;
import i4.l;
import java.io.Serializable;
import java.util.Map;

final class y implements Map, Serializable
{
    public static final y e;
    
    static {
        e = new y();
    }
    
    private y() {
    }
    
    public boolean a(final Void void1) {
        l.e((Object)void1, "value");
        return false;
    }
    
    public Void b(final Object o) {
        return null;
    }
    
    public Set c() {
        return (Set)z.e;
    }
    
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public boolean containsKey(final Object o) {
        return false;
    }
    
    public final /* bridge */ boolean containsValue(final Object o) {
        return o instanceof Void && this.a((Void)o);
    }
    
    public Set d() {
        return (Set)z.e;
    }
    
    public int e() {
        return 0;
    }
    
    public final /* bridge */ Set entrySet() {
        return this.c();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Map && ((Map)o).isEmpty();
    }
    
    public Collection f() {
        return (Collection)x.e;
    }
    
    public Void g(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    public boolean isEmpty() {
        return true;
    }
    
    public final /* bridge */ Set keySet() {
        return this.d();
    }
    
    public void putAll(final Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final /* bridge */ int size() {
        return this.e();
    }
    
    @Override
    public String toString() {
        return "{}";
    }
    
    public final /* bridge */ Collection values() {
        return this.f();
    }
}
