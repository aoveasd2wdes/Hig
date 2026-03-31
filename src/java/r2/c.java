package r2;

import com.google.android.gms.maps.model.LatLng;
import s2.b;
import t2.a$a;

public class c implements a$a
{
    private static final b c;
    private q2.b a;
    private double b;
    
    static {
        c = new b(1.0);
    }
    
    public c(final LatLng latLng, final double b) {
        this.a = r2.c.c.b(latLng);
        if (b >= 0.0) {
            this.b = b;
        }
        else {
            this.b = 1.0;
        }
    }
    
    public q2.b a() {
        return this.a;
    }
    
    public double b() {
        return this.b;
    }
}
