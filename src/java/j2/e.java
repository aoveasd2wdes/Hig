package j2;

import n1.a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import android.os.Parcelable$Creator;
import z1.c;
import android.os.Parcel;
import z1.b;

public abstract class e extends b implements f
{
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }
    
    protected final boolean u2(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        Label_0158: {
            switch (n) {
                default: {
                    return false;
                }
                case 9: {
                    final h h = (h)c.a(parcel, (Parcelable$Creator)j2.h.CREATOR);
                    break;
                }
                case 8: {
                    final l l = (l)c.a(parcel, (Parcelable$Creator)j2.l.CREATOR);
                    c.b(parcel);
                    ((f)this).x1(l);
                    break Label_0158;
                }
                case 7: {
                    final Status status = (Status)c.a(parcel, Status.CREATOR);
                    final GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)c.a(parcel, GoogleSignInAccount.CREATOR);
                    break;
                }
                case 4:
                case 6: {
                    final Status status2 = (Status)c.a(parcel, Status.CREATOR);
                    break;
                }
                case 3: {
                    final a a = (a)c.a(parcel, (Parcelable$Creator)n1.a.CREATOR);
                    final j2.b b = (j2.b)c.a(parcel, (Parcelable$Creator)j2.b.CREATOR);
                    break;
                }
            }
            c.b(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
