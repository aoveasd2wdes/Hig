package a1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import androidx.window.extensions.layout.DisplayFeature;
import java.util.ArrayList;
import android.app.Activity;
import y0.p;
import android.os.Build$VERSION;
import y0.j;
import androidx.window.extensions.layout.WindowLayoutInfo;
import android.content.Context;
import y0.d;
import y0.c$b;
import y0.d$b;
import i4.l;
import y0.c;
import androidx.window.extensions.layout.FoldingFeature;
import android.graphics.Rect;
import v0.b;
import y0.k;

public final class f
{
    public static final f a;
    
    static {
        a = new f();
    }
    
    private f() {
    }
    
    private final boolean d(final k k, final b b) {
        final Rect a = k.a();
        return !b.e() && (b.d() == a.width() || b.a() == a.height()) && (b.d() >= a.width() || b.a() >= a.height()) && (b.d() != a.width() || b.a() != a.height());
    }
    
    public final c a(final k k, final FoldingFeature foldingFeature) {
        l.e(k, "windowMetrics");
        l.e(foldingFeature, "oemFeature");
        final int type = foldingFeature.getType();
        Object o = null;
        d$b d$b;
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            d$b = y0.d$b.b.b();
        }
        else {
            d$b = y0.d$b.b.a();
        }
        final int state = foldingFeature.getState();
        c$b c$b;
        if (state != 1) {
            if (state != 2) {
                return null;
            }
            c$b = y0.c$b.d;
        }
        else {
            c$b = y0.c$b.c;
        }
        final Rect bounds = foldingFeature.getBounds();
        l.d(bounds, "oemFeature.bounds");
        if (this.d(k, new b(bounds))) {
            final Rect bounds2 = foldingFeature.getBounds();
            l.d(bounds2, "oemFeature.bounds");
            o = new d(new b(bounds2), d$b, c$b);
        }
        return (c)o;
    }
    
    public final j b(final Context context, final WindowLayoutInfo windowLayoutInfo) {
        l.e(context, "context");
        l.e(windowLayoutInfo, "info");
        final int sdk_INT = Build$VERSION.SDK_INT;
        k k;
        if (sdk_INT >= 30) {
            k = p.b.c(context);
        }
        else {
            if (sdk_INT < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            k = p.b.b((Activity)context);
        }
        return this.c(k, windowLayoutInfo);
    }
    
    public final j c(final k k, final WindowLayoutInfo windowLayoutInfo) {
        l.e(k, "windowMetrics");
        l.e(windowLayoutInfo, "info");
        final List displayFeatures = windowLayoutInfo.getDisplayFeatures();
        l.d(displayFeatures, "info.displayFeatures");
        final ArrayList list = new ArrayList();
        for (final DisplayFeature displayFeature : displayFeatures) {
            c a2;
            if (displayFeature instanceof FoldingFeature) {
                final f a = f.a;
                l.d(displayFeature, "feature");
                a2 = a.a(k, (FoldingFeature)displayFeature);
            }
            else {
                a2 = null;
            }
            if (a2 != null) {
                ((Collection)list).add((Object)a2);
            }
        }
        return new j((List)list);
    }
}
