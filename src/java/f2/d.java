package f2;

import android.view.View;
import android.os.StrictMode$ThreadPolicy;
import x1.a;
import android.os.StrictMode$ThreadPolicy$Builder;
import android.os.StrictMode;
import android.os.Bundle;
import q1.o;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import android.content.Context;
import android.widget.FrameLayout;

public class d extends FrameLayout
{
    private final n c;
    
    public d(final Context context, final GoogleMapOptions googleMapOptions) {
        super(context);
        this.c = new n((ViewGroup)this, context, googleMapOptions);
        ((View)this).setClickable(true);
    }
    
    public void a(final f f) {
        o.e("getMapAsync() must be called on the main thread");
        o.i((Object)f, (Object)"callback must not be null.");
        this.c.p(f);
    }
    
    public void b(final Bundle bundle) {
        final StrictMode$ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode$ThreadPolicy$Builder(threadPolicy).permitAll().build());
        try {
            ((a)this.c).c(bundle);
            if (((a)this.c).b() == null) {
                a.i((FrameLayout)this);
            }
        }
        finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
    
    public void c() {
        ((a)this.c).d();
    }
    
    public void d() {
        ((a)this.c).e();
    }
    
    public void e(final Bundle bundle) {
        ((a)this.c).f(bundle);
    }
    
    public void f() {
        ((a)this.c).g();
    }
    
    public void g() {
        ((a)this.c).h();
    }
}
