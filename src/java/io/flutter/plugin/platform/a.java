package io.flutter.plugin.platform;

import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.MotionEvent;
import io.flutter.view.k;

class a
{
    private k a;
    
    public boolean a(final MotionEvent motionEvent, final boolean b) {
        final k a = this.a;
        return a != null && a.M(motionEvent, b);
    }
    
    public boolean b(final View view, final View view2, final AccessibilityEvent accessibilityEvent) {
        final k a = this.a;
        return a != null && a.w(view, view2, accessibilityEvent);
    }
    
    void c(final k a) {
        this.a = a;
    }
}
