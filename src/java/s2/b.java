package s2;

import com.google.android.gms.maps.model.LatLng;

public class b
{
    final double a;
    
    public b(final double a) {
        this.a = a;
    }
    
    public LatLng a(final q2.b b) {
        final double a = b.a;
        final double a2 = this.a;
        return new LatLng(90.0 - Math.toDegrees(Math.atan(Math.exp(-(0.5 - b.b / a2) * 2.0 * 3.141592653589793)) * 2.0), (a / a2 - 0.5) * 360.0);
    }
    
    public a b(final LatLng latLng) {
        final double n = latLng.b / 360.0;
        final double sin = Math.sin(Math.toRadians(latLng.a));
        final double n2 = Math.log((sin + 1.0) / (1.0 - sin)) * 0.5 / -6.283185307179586;
        final double a = this.a;
        return new a((n + 0.5) * a, (n2 + 0.5) * a);
    }
}
