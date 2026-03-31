package j2;

import android.os.BaseBundle;
import android.os.IInterface;
import android.os.IBinder;
import q1.c$c;
import q1.c;
import q1.c$d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.accounts.Account;
import android.os.RemoteException;
import q1.j0;
import android.app.PendingIntent;
import android.util.Log;
import q1.h0;
import q1.o;
import android.os.Parcelable;
import o1.f$b;
import o1.f$a;
import android.os.Looper;
import android.content.Context;
import android.os.Bundle;
import i2.e;
import q1.h;

public class a extends h implements e
{
    public static final int M = 0;
    private final boolean I;
    private final q1.e J;
    private final Bundle K;
    private final Integer L;
    
    public a(final Context context, final Looper looper, final boolean b, final q1.e j, final Bundle k, final f$a f$a, final f$b f$b) {
        super(context, looper, 44, j, f$a, f$b);
        this.I = true;
        this.J = j;
        this.K = k;
        this.L = j.g();
    }
    
    public static Bundle j0(final q1.e e) {
        e.f();
        final Integer g = e.g();
        final Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable)e.a());
        if (g != null) {
            ((BaseBundle)bundle).putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", (int)g);
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        ((BaseBundle)bundle).putString("com.google.android.gms.signin.internal.serverClientId", (String)null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        ((BaseBundle)bundle).putString("com.google.android.gms.signin.internal.hostedDomain", (String)null);
        ((BaseBundle)bundle).putString("com.google.android.gms.signin.internal.logSessionId", (String)null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }
    
    protected final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }
    
    protected final String E() {
        return "com.google.android.gms.signin.service.START";
    }
    
    public final boolean k() {
        return this.I;
    }
    
    public final void l(final f f) {
        o.i((Object)f, (Object)"Expecting a valid ISignInCallbacks");
        try {
            final Account b = this.J.b();
            GoogleSignInAccount b2;
            if ("<<default account>>".equals((Object)b.name)) {
                b2 = l1.a.a(this.x()).b();
            }
            else {
                b2 = null;
            }
            ((g)this.C()).u2(new j(1, new h0(b, (int)o.h((Object)this.L), b2)), f);
        }
        catch (final RemoteException ex) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                f.x1(new l(1, new n1.a(8, (PendingIntent)null), (j0)null));
            }
            catch (final RemoteException ex2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", (Throwable)ex);
            }
        }
    }
    
    public final void n() {
        this.e((c$c)new c$d((c)this));
    }
    
    public final int p() {
        return 12451000;
    }
    
    protected final Bundle z() {
        if (!this.x().getPackageName().equals((Object)this.J.d())) {
            ((BaseBundle)this.K).putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.d());
        }
        return this.K;
    }
}
