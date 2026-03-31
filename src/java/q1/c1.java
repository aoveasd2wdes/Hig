package q1;

import android.os.BaseBundle;
import android.util.Log;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.net.Uri$Builder;
import android.content.ComponentName;
import android.net.Uri;

public final class c1
{
    private static final Uri f;
    private final String a;
    private final String b;
    private final ComponentName c;
    private final int d;
    private final boolean e;
    
    static {
        f = new Uri$Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }
    
    public c1(final String a, final String b, final int n, final boolean e) {
        o.f(a);
        this.a = a;
        o.f(b);
        this.b = b;
        this.c = null;
        this.d = 4225;
        this.e = e;
    }
    
    public final ComponentName a() {
        return this.c;
    }
    
    public final Intent b(final Context context) {
        Intent setComponent;
        if (this.a != null) {
            final boolean e = this.e;
            Intent intent = null;
            final Intent intent2 = null;
            if (e) {
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putString("serviceActionBundleKey", this.a);
                Bundle call;
                try {
                    call = context.getContentResolver().call(c1.f, "serviceIntentCall", (String)null, bundle);
                }
                catch (final IllegalArgumentException ex) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(ex.toString()));
                    call = null;
                }
                Intent intent3;
                if (call == null) {
                    intent3 = intent2;
                }
                else {
                    intent3 = (Intent)call.getParcelable("serviceResponseIntentKey");
                }
                intent = intent3;
                if (intent3 == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf((Object)this.a)));
                    intent = intent3;
                }
            }
            if ((setComponent = intent) == null) {
                return new Intent(this.a).setPackage(this.b);
            }
        }
        else {
            setComponent = new Intent().setComponent(this.c);
        }
        return setComponent;
    }
    
    public final String c() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c1)) {
            return false;
        }
        final c1 c1 = (c1)o;
        return n.a(this.a, c1.a) && n.a(this.b, c1.b) && n.a(this.c, c1.c) && this.e == c1.e;
    }
    
    @Override
    public final int hashCode() {
        return n.b(this.a, this.b, this.c, 4225, this.e);
    }
    
    @Override
    public final String toString() {
        String s;
        if ((s = this.a) == null) {
            o.h(this.c);
            s = this.c.flattenToString();
        }
        return s;
    }
}
