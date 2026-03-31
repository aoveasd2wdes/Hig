package q1;

import p.b;
import java.util.Iterator;
import l.d;
import java.util.Collection;
import java.util.HashSet;
import java.util.Collections;
import i2.a;
import android.view.View;
import java.util.Map;
import java.util.Set;
import android.accounts.Account;

public final class e
{
    private final Account a;
    private final Set b;
    private final Set c;
    private final Map d;
    private final int e;
    private final View f;
    private final String g;
    private final String h;
    private final i2.a i;
    private Integer j;
    
    public e(final Account a, Set b, final Map map, final int e, final View f, final String g, final String h, final i2.a a2, final boolean b2) {
        this.a = a;
        if (b == null) {
            b = Collections.emptySet();
        }
        else {
            b = Collections.unmodifiableSet(b);
        }
        this.b = b;
        Map emptyMap = map;
        if (map == null) {
            emptyMap = Collections.emptyMap();
        }
        this.d = emptyMap;
        this.f = f;
        this.e = e;
        this.g = g;
        this.h = h;
        i2.a k;
        if ((k = a2) == null) {
            k = i2.a.k;
        }
        this.i = k;
        final HashSet set = new HashSet((Collection)b);
        final Iterator iterator = emptyMap.values().iterator();
        if (!iterator.hasNext()) {
            this.c = Collections.unmodifiableSet((Set)set);
            return;
        }
        l.d.a(iterator.next());
        throw null;
    }
    
    public Account a() {
        return this.a;
    }
    
    public Account b() {
        final Account a = this.a;
        if (a != null) {
            return a;
        }
        return new Account("<<default account>>", "com.google");
    }
    
    public Set c() {
        return this.c;
    }
    
    public String d() {
        return this.g;
    }
    
    public Set e() {
        return this.b;
    }
    
    public final i2.a f() {
        return this.i;
    }
    
    public final Integer g() {
        return this.j;
    }
    
    public final String h() {
        return this.h;
    }
    
    public final void i(final Integer j) {
        this.j = j;
    }
    
    public static final class a
    {
        private Account a;
        private b b;
        private String c;
        private String d;
        private final i2.a e;
        
        public a() {
            this.e = i2.a.k;
        }
        
        public e a() {
            return new e(this.a, (Set)this.b, null, 0, null, this.c, this.d, this.e, false);
        }
        
        public a b(final String c) {
            this.c = c;
            return this;
        }
        
        public final a c(final Collection collection) {
            if (this.b == null) {
                this.b = new b();
            }
            this.b.addAll(collection);
            return this;
        }
        
        public final a d(final Account a) {
            this.a = a;
            return this;
        }
        
        public final a e(final String d) {
            this.d = d;
            return this;
        }
    }
}
