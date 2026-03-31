package c1;

import y0.k;
import android.view.WindowInsets;
import androidx.core.view.f0;
import androidx.appcompat.widget.m;
import android.view.WindowManager;
import i4.l;
import android.graphics.Rect;
import android.content.Context;

public final class h
{
    public static final h a;
    
    static {
        a = new h();
    }
    
    private h() {
    }
    
    public final Rect a(final Context context) {
        l.e(context, "context");
        final Rect a = f.a(d.a((WindowManager)m.a(context, (Class)WindowManager.class)));
        l.d(a, "wm.currentWindowMetrics.bounds");
        return a;
    }
    
    public final f0 b(final Context context) {
        l.e(context, "context");
        final WindowInsets a = e.a(d.a((WindowManager)m.a(context, (Class)WindowManager.class)));
        l.d(a, "context.getSystemService\u2026indowMetrics.windowInsets");
        final f0 n = f0.n(a);
        l.d(n, "toWindowInsetsCompat(platformInsets)");
        return n;
    }
    
    public final k c(final Context context) {
        l.e(context, "context");
        final WindowManager windowManager = (WindowManager)m.a(context, (Class)WindowManager.class);
        final f0 n = f0.n(e.a(d.a(windowManager)));
        l.d(n, "toWindowInsetsCompat(wm.\u2026ndowMetrics.windowInsets)");
        final Rect a = f.a(d.a(windowManager));
        l.d(a, "wm.currentWindowMetrics.bounds");
        return new k(a, n);
    }
    
    public final Rect d(final Context context) {
        l.e(context, "context");
        final Rect a = f.a(g.a((WindowManager)m.a(context, (Class)WindowManager.class)));
        l.d(a, "wm.maximumWindowMetrics.bounds");
        return a;
    }
}
