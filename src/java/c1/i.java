package c1;

import i4.l;
import android.graphics.Point;
import android.view.Display;

public final class i
{
    public static final i a;
    
    static {
        a = new i();
    }
    
    private i() {
    }
    
    public final void a(final Display display, final Point point) {
        l.e(display, "display");
        l.e(point, "point");
        display.getRealSize(point);
    }
}
