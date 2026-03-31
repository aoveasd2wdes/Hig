package y0;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import c1.i;
import android.content.res.Configuration;
import android.graphics.Point;
import i4.g;
import android.view.WindowManager;
import android.inputmethodservice.InputMethodService;
import c1.c;
import androidx.core.view.f0;
import v0.b;
import androidx.core.view.f0$b;
import c1.h;
import android.os.Build$VERSION;
import android.graphics.Rect;
import android.app.Activity;
import android.content.res.Resources;
import android.content.Context;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.view.DisplayCutout;
import android.view.Display;
import androidx.core.view.f0$m;
import i4.l;
import java.util.ArrayList;

public final class p implements m
{
    public static final p b;
    private static final String c;
    private static final ArrayList d;
    
    static {
        b = new p();
        final String simpleName = p.class.getSimpleName();
        l.d((Object)simpleName, "WindowMetricsCalculatorC\u2026at::class.java.simpleName");
        c = simpleName;
        d = v3.l.f((Object[])new Integer[] { f0$m.g(), f0$m.f(), f0$m.a(), f0$m.c(), f0$m.h(), f0$m.e(), f0$m.i(), f0$m.b() });
    }
    
    private p() {
    }
    
    private final DisplayCutout j(Display ex) {
        try {
            final java.lang.reflect.Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor((Class<?>[])new Class[0]);
            ((AccessibleObject)constructor).setAccessible(true);
            final Object instance = constructor.newInstance(new Object[0]);
            final Method declaredMethod = ex.getClass().getDeclaredMethod("getDisplayInfo", instance.getClass());
            ((AccessibleObject)declaredMethod).setAccessible(true);
            declaredMethod.invoke((Object)ex, new Object[] { instance });
            ex = (InstantiationException)instance.getClass().getDeclaredField("displayCutout");
            ((AccessibleObject)ex).setAccessible(true);
            ex = (InstantiationException)((Field)ex).get(instance);
            if (n.a((Object)ex)) {
                ex = (InstantiationException)o.a((Object)ex);
                return (DisplayCutout)ex;
            }
            return null;
        }
        catch (final InstantiationException ex) {}
        catch (final InvocationTargetException ex) {}
        catch (final IllegalAccessException ex) {}
        catch (final NoSuchFieldException ex) {}
        catch (final NoSuchMethodException ex) {}
        catch (final ClassNotFoundException ex2) {}
        Log.w(p.c, (Throwable)ex);
        ex = null;
        return (DisplayCutout)ex;
    }
    
    private final int k(final Context context) {
        final Resources resources = context.getResources();
        final int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        int dimensionPixelSize;
        if (identifier > 0) {
            dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        }
        else {
            dimensionPixelSize = 0;
        }
        return dimensionPixelSize;
    }
    
    private final void m(final Activity activity, final Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
    
    public k a(final Activity activity) {
        l.e((Object)activity, "activity");
        return this.d((Context)activity);
    }
    
    public k b(final Activity activity) {
        l.e((Object)activity, "activity");
        final int sdk_INT = Build$VERSION.SDK_INT;
        Rect rect;
        if (sdk_INT >= 30) {
            rect = h.a.a((Context)activity);
        }
        else if (sdk_INT >= 29) {
            rect = this.h(activity);
        }
        else if (sdk_INT >= 28) {
            rect = this.g(activity);
        }
        else if (sdk_INT >= 24) {
            rect = this.f(activity);
        }
        else {
            rect = this.e(activity);
        }
        f0 f0;
        if (sdk_INT >= 30) {
            f0 = this.i((Context)activity);
        }
        else {
            f0 = new f0$b().a();
            l.d((Object)f0, "{\n            WindowInse\u2026ilder().build()\n        }");
        }
        return new k(new b(rect), f0);
    }
    
    public k c(final Context context) {
        l.e((Object)context, "context");
        if (Build$VERSION.SDK_INT >= 30) {
            return h.a.c(context);
        }
        final Context a = c1.c.a.a(context);
        if (a instanceof Activity) {
            return this.b((Activity)context);
        }
        if (a instanceof InputMethodService) {
            final Object systemService = context.getSystemService("window");
            l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            final Display defaultDisplay = ((WindowManager)systemService).getDefaultDisplay();
            l.d((Object)defaultDisplay, "wm.defaultDisplay");
            final Point l = this.l(defaultDisplay);
            return new k(new Rect(0, 0, l.x, l.y), (f0)null, 2, (g)null);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)context);
        sb.append(" is not a UiContext");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public k d(final Context context) {
        l.e((Object)context, "context");
        final int sdk_INT = Build$VERSION.SDK_INT;
        Rect d;
        if (sdk_INT >= 30) {
            d = h.a.d(context);
        }
        else {
            final Object systemService = context.getSystemService("window");
            l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            final Display defaultDisplay = ((WindowManager)systemService).getDefaultDisplay();
            l.d((Object)defaultDisplay, "display");
            final Point l = this.l(defaultDisplay);
            d = new Rect(0, 0, l.x, l.y);
        }
        f0 f0;
        if (sdk_INT >= 30) {
            f0 = this.i(context);
        }
        else {
            f0 = new f0$b().a();
            l.d((Object)f0, "{\n            WindowInse\u2026ilder().build()\n        }");
        }
        return new k(new b(d), f0);
    }
    
    public final Rect e(final Activity activity) {
        l.e((Object)activity, "activity");
        final Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        l.d((Object)defaultDisplay, "defaultDisplay");
        final Point l = this.l(defaultDisplay);
        final Rect rect = new Rect();
        final int x = l.x;
        if (x != 0) {
            final int y = l.y;
            if (y != 0) {
                rect.right = x;
                rect.bottom = y;
                return rect;
            }
        }
        defaultDisplay.getRectSize(rect);
        return rect;
    }
    
    public final Rect f(final Activity activity) {
        l.e((Object)activity, "activity");
        final Rect rect = new Rect();
        final Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!c1.b.a.a(activity)) {
            l.d((Object)defaultDisplay, "defaultDisplay");
            final Point l = this.l(defaultDisplay);
            final int k = this.k((Context)activity);
            final int bottom = rect.bottom;
            if (bottom + k == l.y) {
                rect.bottom = bottom + k;
            }
            else {
                final int right = rect.right;
                if (right + k == l.x) {
                    rect.right = right + k;
                }
            }
        }
        return rect;
    }
    
    public final Rect g(final Activity activity) {
        l.e((Object)activity, "activity");
        final Rect rect = new Rect();
        Object o = ((Context)activity).getResources().getConfiguration();
        Label_0192: {
            try {
                final Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                ((AccessibleObject)declaredField).setAccessible(true);
                o = declaredField.get(o);
                if (c1.b.a.a(activity)) {
                    o = ((Rect)o).getClass().getDeclaredMethod("getBounds", (Class<?>[])new Class[0]).invoke(o, new Object[0]);
                    l.c(o, "null cannot be cast to non-null type android.graphics.Rect");
                    o = o;
                }
                else {
                    o = ((Rect)o).getClass().getDeclaredMethod("getAppBounds", (Class<?>[])new Class[0]).invoke(o, new Object[0]);
                    l.c(o, "null cannot be cast to non-null type android.graphics.Rect");
                    o = o;
                }
                rect.set((Rect)o);
                break Label_0192;
            }
            catch (final InvocationTargetException o) {}
            catch (final IllegalAccessException o) {}
            catch (final NoSuchMethodException o) {}
            catch (final NoSuchFieldException ex) {}
            Log.w(p.c, (Throwable)o);
            this.m(activity, rect);
        }
        final Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        final Point point = new Point();
        final i a = i.a;
        l.d((Object)defaultDisplay, "currentDisplay");
        a.a(defaultDisplay, point);
        final c1.b a2 = c1.b.a;
        if (!a2.a(activity)) {
            final int k = this.k((Context)activity);
            final int bottom = rect.bottom;
            if (bottom + k == point.y) {
                rect.bottom = bottom + k;
            }
            else {
                final int right = rect.right;
                if (right + k == point.x) {
                    rect.right = right + k;
                }
                else if (rect.left == k) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !a2.a(activity)) {
            final DisplayCutout j = this.j(defaultDisplay);
            if (j != null) {
                final int left = rect.left;
                final c1.n a3 = c1.n.a;
                if (left == a3.b(j)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == a3.c(j)) {
                    rect.right += a3.c(j);
                }
                if (rect.top == a3.d(j)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == a3.a(j)) {
                    rect.bottom += a3.a(j);
                }
            }
        }
        return rect;
    }
    
    public final Rect h(Activity g) {
        l.e((Object)g, "activity");
        final Configuration configuration = ((Context)g).getResources().getConfiguration();
        Object declaredField = null;
        try {
            declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            ((AccessibleObject)declaredField).setAccessible(true);
            final Object value = ((Field)declaredField).get((Object)configuration);
            final Method declaredMethod = value.getClass().getDeclaredMethod("getBounds", (Class<?>[])new Class[0]);
            declaredField = new(android.graphics.Rect.class)();
            final Object invoke = declaredMethod.invoke(value, new Object[0]);
            l.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            new Rect((Rect)invoke);
            g = (Activity)declaredField;
            return (Rect)g;
        }
        catch (final InvocationTargetException declaredField) {}
        catch (final IllegalAccessException declaredField) {}
        catch (final NoSuchMethodException declaredField) {}
        catch (final NoSuchFieldException ex) {}
        Log.w(p.c, (Throwable)declaredField);
        g = (Activity)this.g(g);
        return (Rect)g;
    }
    
    public final f0 i(final Context context) {
        l.e((Object)context, "context");
        if (Build$VERSION.SDK_INT >= 30) {
            return h.a.b(context);
        }
        throw new Exception("Incompatible SDK version");
    }
    
    public final Point l(final Display display) {
        l.e((Object)display, "display");
        final Point point = new Point();
        i.a.a(display, point);
        return point;
    }
}
