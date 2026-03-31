package f2;

import h2.d0;
import android.os.RemoteException;
import h2.u;
import q1.o;
import com.google.android.gms.maps.model.LatLng;
import android.graphics.Point;
import g2.d;

public final class h
{
    private final d a;
    
    h(final d a) {
        this.a = a;
    }
    
    public LatLng a(final Point point) {
        o.h((Object)point);
        try {
            return this.a.a0(x1.d.u2((Object)point));
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public d0 b() {
        try {
            return this.a.D();
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public Point c(final LatLng latLng) {
        o.h((Object)latLng);
        try {
            return (Point)x1.d.W(this.a.d0(latLng));
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
}
