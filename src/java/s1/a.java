package s1;

import android.os.Parcel;
import android.os.Parcelable;
import z1.c;
import q1.r;
import android.os.IBinder;

public final class a extends z1.a
{
    a(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }
    
    public final void u2(final r r) {
        final Parcel g = this.G();
        c.c(g, (Parcelable)r);
        this.W(1, g);
    }
}
