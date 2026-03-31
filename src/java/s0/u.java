package s0;

import android.view.ViewOverlay;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

class u implements v
{
    private final ViewGroupOverlay a;
    
    u(final ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }
    
    public void a(final View view) {
        this.a.add(view);
    }
    
    public void b(final Drawable drawable) {
        ((ViewOverlay)this.a).add(drawable);
    }
    
    public void c(final View view) {
        this.a.remove(view);
    }
    
    public void d(final Drawable drawable) {
        ((ViewOverlay)this.a).remove(drawable);
    }
}
