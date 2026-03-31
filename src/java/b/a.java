package b;

import android.os.Parcelable;
import android.os.Parcel;
import android.app.Notification;
import android.os.IInterface;

public interface a extends IInterface
{
    public static final String a = "android$support$v4$app$INotificationSideChannel".replace('$', '.');
    
    void E1(final String p0, final int p1, final String p2, final Notification p3);
    
    public abstract static class b
    {
        private static void b(final Parcel parcel, final Parcelable parcelable, final int n) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, n);
            }
            else {
                parcel.writeInt(0);
            }
        }
    }
}
