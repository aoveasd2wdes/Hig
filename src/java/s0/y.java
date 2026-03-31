package s0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

class y implements z
{
    private final ViewOverlay a;
    
    y(final View view) {
        this.a = view.getOverlay();
    }
    
    public void b(final Drawable drawable) {
        this.a.add(drawable);
    }
    
    public void d(final Drawable drawable) {
        this.a.remove(drawable);
    }
}
