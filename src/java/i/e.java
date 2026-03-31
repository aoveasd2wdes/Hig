package i;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import androidx.core.graphics.drawable.a;
import android.graphics.Region;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

public abstract class e extends Drawable implements Drawable$Callback
{
    private Drawable c;
    
    public e(final Drawable drawable) {
        this.b(drawable);
    }
    
    public Drawable a() {
        return this.c;
    }
    
    public void b(final Drawable c) {
        final Drawable c2 = this.c;
        if (c2 != null) {
            c2.setCallback((Drawable$Callback)null);
        }
        if ((this.c = c) != null) {
            c.setCallback((Drawable$Callback)this);
        }
    }
    
    public void draw(final Canvas canvas) {
        this.c.draw(canvas);
    }
    
    public int getChangingConfigurations() {
        return this.c.getChangingConfigurations();
    }
    
    public Drawable getCurrent() {
        return this.c.getCurrent();
    }
    
    public int getIntrinsicHeight() {
        return this.c.getIntrinsicHeight();
    }
    
    public int getIntrinsicWidth() {
        return this.c.getIntrinsicWidth();
    }
    
    public int getMinimumHeight() {
        return this.c.getMinimumHeight();
    }
    
    public int getMinimumWidth() {
        return this.c.getMinimumWidth();
    }
    
    public int getOpacity() {
        return this.c.getOpacity();
    }
    
    public boolean getPadding(final Rect rect) {
        return this.c.getPadding(rect);
    }
    
    public int[] getState() {
        return this.c.getState();
    }
    
    public Region getTransparentRegion() {
        return this.c.getTransparentRegion();
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        this.invalidateSelf();
    }
    
    public boolean isAutoMirrored() {
        return a.g(this.c);
    }
    
    public boolean isStateful() {
        return this.c.isStateful();
    }
    
    public void jumpToCurrentState() {
        a.h(this.c);
    }
    
    protected void onBoundsChange(final Rect bounds) {
        this.c.setBounds(bounds);
    }
    
    protected boolean onLevelChange(final int level) {
        return this.c.setLevel(level);
    }
    
    public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        this.scheduleSelf(runnable, n);
    }
    
    public void setAlpha(final int alpha) {
        this.c.setAlpha(alpha);
    }
    
    public void setAutoMirrored(final boolean b) {
        a.i(this.c, b);
    }
    
    public void setChangingConfigurations(final int changingConfigurations) {
        this.c.setChangingConfigurations(changingConfigurations);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }
    
    public void setDither(final boolean dither) {
        this.c.setDither(dither);
    }
    
    public void setFilterBitmap(final boolean filterBitmap) {
        this.c.setFilterBitmap(filterBitmap);
    }
    
    public void setHotspot(final float n, final float n2) {
        a.j(this.c, n, n2);
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        a.k(this.c, n, n2, n3, n4);
    }
    
    public boolean setState(final int[] state) {
        return this.c.setState(state);
    }
    
    public void setTint(final int n) {
        a.m(this.c, n);
    }
    
    public void setTintList(final ColorStateList list) {
        a.n(this.c, list);
    }
    
    public void setTintMode(final PorterDuff$Mode porterDuff$Mode) {
        a.o(this.c, porterDuff$Mode);
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        return super.setVisible(b, b2) || this.c.setVisible(b, b2);
    }
    
    public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}
