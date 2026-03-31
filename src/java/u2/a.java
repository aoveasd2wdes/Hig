package u2;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.PorterDuff$Mode;
import android.graphics.Canvas;
import android.content.Context;
import android.graphics.drawable.Drawable;

class a extends Drawable
{
    private final Drawable a;
    private final Drawable b;
    private int c;
    
    public a(final Context context) {
        this.c = -1;
        this.b = androidx.core.content.a.c(context, l2.a.a);
        this.a = androidx.core.content.a.c(context, l2.a.b);
    }
    
    public void a(final int c) {
        this.c = c;
    }
    
    public void draw(final Canvas canvas) {
        this.b.draw(canvas);
        canvas.drawColor(this.c, PorterDuff$Mode.SRC_IN);
        this.a.draw(canvas);
    }
    
    public int getOpacity() {
        return -3;
    }
    
    public boolean getPadding(final Rect rect) {
        return this.b.getPadding(rect);
    }
    
    public void setAlpha(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public void setBounds(final int n, final int n2, final int n3, final int n4) {
        this.b.setBounds(n, n2, n3, n4);
        this.a.setBounds(n, n2, n3, n4);
    }
    
    public void setBounds(final Rect rect) {
        this.b.setBounds(rect);
        this.a.setBounds(rect);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }
}
