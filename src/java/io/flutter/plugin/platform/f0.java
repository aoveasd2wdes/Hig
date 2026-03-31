package io.flutter.plugin.platform;

import c1.g;
import android.view.Display;
import c1.d;
import android.view.WindowMetrics;
import a3.b;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.view.WindowManager;

abstract class f0 implements WindowManager
{
    final WindowManager c;
    a0 d;
    
    f0(final WindowManager c, final a0 d) {
        this.c = c;
        this.d = d;
    }
    
    public void addCrossWindowBlurEnabledListener(final Executor executor, final Consumer consumer) {
        e0.a(this.c, executor, consumer);
    }
    
    public void addCrossWindowBlurEnabledListener(final Consumer consumer) {
        b0.a(this.c, consumer);
    }
    
    public void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final a0 d = this.d;
        if (d == null) {
            b.g("PlatformViewsController", "Embedded view called addView while detached from presentation");
            return;
        }
        d.addView(view, viewGroup$LayoutParams);
    }
    
    public WindowMetrics getCurrentWindowMetrics() {
        return c1.d.a(this.c);
    }
    
    public Display getDefaultDisplay() {
        return this.c.getDefaultDisplay();
    }
    
    public WindowMetrics getMaximumWindowMetrics() {
        return g.a(this.c);
    }
    
    public boolean isCrossWindowBlurEnabled() {
        return c0.a(this.c);
    }
    
    public void removeCrossWindowBlurEnabledListener(final Consumer consumer) {
        d0.a(this.c, consumer);
    }
    
    public void removeView(final View view) {
        final a0 d = this.d;
        if (d == null) {
            b.g("PlatformViewsController", "Embedded view called removeView while detached from presentation");
            return;
        }
        d.removeView(view);
    }
    
    public void removeViewImmediate(final View view) {
        if (this.d == null) {
            b.g("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
            return;
        }
        view.clearAnimation();
        this.d.removeView(view);
    }
    
    public void updateViewLayout(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final a0 d = this.d;
        if (d == null) {
            b.g("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
            return;
        }
        d.updateViewLayout(view, viewGroup$LayoutParams);
    }
}
