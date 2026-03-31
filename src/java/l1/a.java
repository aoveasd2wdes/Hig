package l1;

import org.json.JSONException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import q1.o;
import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;
import android.content.SharedPreferences;
import java.util.concurrent.locks.Lock;

public class a
{
    private static final Lock c;
    private static a d;
    private final Lock a;
    private final SharedPreferences b;
    
    static {
        c = (Lock)new ReentrantLock();
    }
    
    a(final Context context) {
        this.a = (Lock)new ReentrantLock();
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }
    
    public static a a(final Context context) {
        o.h((Object)context);
        final Lock c = a.c;
        c.lock();
        try {
            if (a.d == null) {
                a.d = new a(context.getApplicationContext());
            }
            final a d = a.d;
            c.unlock();
            return d;
        }
        finally {
            a.c.unlock();
        }
    }
    
    private static final String d(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(":");
        sb.append(s2);
        return sb.toString();
    }
    
    public GoogleSignInAccount b() {
        final String c = this.c("defaultGoogleSignInAccount");
        final boolean empty = TextUtils.isEmpty((CharSequence)c);
        final GoogleSignInAccount googleSignInAccount = null;
        if (empty) {
            return googleSignInAccount;
        }
        final String c2 = this.c(d("googleSignInAccount", c));
        GoogleSignInAccount k = googleSignInAccount;
        if (c2 == null) {
            return k;
        }
        try {
            k = GoogleSignInAccount.k(c2);
            return k;
        }
        catch (final JSONException ex) {
            k = googleSignInAccount;
            return k;
        }
    }
    
    protected final String c(String string) {
        this.a.lock();
        try {
            string = this.b.getString(string, (String)null);
            return string;
        }
        finally {
            this.a.unlock();
        }
    }
}
