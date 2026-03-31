package io.flutter.plugin.platform;

import android.view.MotionEvent;
import io.flutter.embedding.android.r$b;
import android.content.Context;
import io.flutter.embedding.android.r;

public class c extends r
{
    private a i;
    
    public c(final Context context, final int n, final int n2, final a i) {
        super(context, n, n2, r$b.f);
        this.i = i;
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        final a i = this.i;
        return (i != null && i.a(motionEvent, true)) || super.onHoverEvent(motionEvent);
    }
}
