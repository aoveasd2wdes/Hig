package s1;

import android.os.Bundle;
import z1.d;
import android.os.IInterface;
import android.os.IBinder;
import p1.c;
import android.os.Looper;
import android.content.Context;
import q1.u;
import q1.h;

public final class e extends h
{
    private final u I;
    
    public e(final Context context, final Looper looper, final q1.e e, final u i, final c c, final p1.h h) {
        super(context, looper, 270, e, c, h);
        this.I = i;
    }
    
    protected final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }
    
    protected final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }
    
    protected final boolean H() {
        return true;
    }
    
    public final int p() {
        return 203400000;
    }
    
    public final n1.c[] u() {
        return d.b;
    }
    
    protected final Bundle z() {
        return this.I.b();
    }
}
