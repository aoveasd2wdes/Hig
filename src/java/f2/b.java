package f2;

import android.graphics.Point;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLng;
import android.os.RemoteException;
import h2.u;
import q1.o;
import com.google.android.gms.maps.model.CameraPosition;
import g2.a;

public abstract class b
{
    private static a a;
    
    public static f2.a a(final CameraPosition cameraPosition) {
        o.i((Object)cameraPosition, (Object)"cameraPosition must not be null");
        try {
            return new f2.a(l().q1(cameraPosition));
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public static f2.a b(final LatLng latLng) {
        o.i((Object)latLng, (Object)"latLng must not be null");
        try {
            return new f2.a(l().t2(latLng));
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public static f2.a c(final LatLngBounds latLngBounds, final int n) {
        o.i((Object)latLngBounds, (Object)"bounds must not be null");
        try {
            return new f2.a(l().j0(latLngBounds, n));
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public static f2.a d(final LatLng latLng, final float n) {
        o.i((Object)latLng, (Object)"latLng must not be null");
        try {
            return new f2.a(l().v1(latLng, n));
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public static f2.a e(final float n, final float n2) {
        try {
            return new f2.a(l().z1(n, n2));
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public static f2.a f(final float n) {
        try {
            return new f2.a(l().x0(n));
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public static f2.a g(final float n, final Point point) {
        o.i((Object)point, (Object)"focus must not be null");
        try {
            return new f2.a(l().a2(n, point.x, point.y));
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public static f2.a h() {
        try {
            return new f2.a(l().Q0());
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public static f2.a i() {
        try {
            return new f2.a(l().j2());
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public static f2.a j(final float n) {
        try {
            return new f2.a(l().N0(n));
        }
        catch (final RemoteException ex) {
            throw new u(ex);
        }
    }
    
    public static void k(final a a) {
        b.a = (a)o.h((Object)a);
    }
    
    private static a l() {
        return (a)o.i((Object)b.a, (Object)"CameraUpdateFactory is not initialized");
    }
}
