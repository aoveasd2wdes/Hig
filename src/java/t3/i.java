package t3;

import android.view.ViewGroup;
import android.content.ContextWrapper;
import y0.k;
import android.app.Activity;
import y0.l;
import android.content.Context;
import android.view.View;

public abstract class i
{
    public static void c(final Context context, final a a) {
        final Activity e = e(context);
        if (e != null) {
            final k a2 = l.a().a(e);
            a.a((float)a2.a().width(), (float)a2.a().height(), context.getResources().getDisplayMetrics().density);
        }
    }
    
    public static boolean d(final View view) {
        return i(view, (b)new g());
    }
    
    public static Activity e(final Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity)context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper)context).getBaseContext());
        }
        return null;
    }
    
    public static boolean f(final View view, final Class[] array) {
        return i(view, (b)new h(array));
    }
    
    public static boolean i(final View view, final b b) {
        if (view == null) {
            return false;
        }
        if (b.a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                if (i(viewGroup.getChildAt(i), b)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public interface a
    {
        void a(final float p0, final float p1, final float p2);
    }
    
    public interface b
    {
        boolean a(final View p0);
    }
}
