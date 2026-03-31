package h;

import android.content.res.Configuration;
import android.content.res.XmlResourceParser;
import android.content.res.Resources;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import androidx.core.content.res.c;
import android.util.TypedValue;
import androidx.appcompat.widget.j1;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.SparseArray;
import android.content.res.ColorStateList;
import android.content.Context;
import java.util.WeakHashMap;

public abstract class b
{
    private static final ThreadLocal a;
    private static final WeakHashMap b;
    private static final Object c;
    
    static {
        a = new ThreadLocal();
        b = new WeakHashMap(0);
        c = new Object();
    }
    
    private static void a(final Context context, final int n, final ColorStateList list) {
        final Object c = h.b.c;
        synchronized (c) {
            final WeakHashMap b = h.b.b;
            SparseArray sparseArray;
            if ((sparseArray = (SparseArray)b.get((Object)context)) == null) {
                sparseArray = new SparseArray();
                b.put((Object)context, (Object)sparseArray);
            }
            sparseArray.append(n, (Object)new a(list, context.getResources().getConfiguration()));
        }
    }
    
    private static ColorStateList b(final Context context, final int n) {
        final Object c = h.b.c;
        synchronized (c) {
            final SparseArray sparseArray = (SparseArray)h.b.b.get((Object)context);
            if (sparseArray != null && sparseArray.size() > 0) {
                final a a = (a)sparseArray.get(n);
                if (a != null) {
                    if (a.b.equals(context.getResources().getConfiguration())) {
                        return a.a;
                    }
                    sparseArray.remove(n);
                }
            }
            return null;
        }
    }
    
    public static ColorStateList c(final Context context, final int n) {
        if (Build$VERSION.SDK_INT >= 23) {
            return h.a.a(context, n);
        }
        final ColorStateList b = b(context, n);
        if (b != null) {
            return b;
        }
        final ColorStateList f = f(context, n);
        if (f != null) {
            a(context, n, f);
            return f;
        }
        return androidx.core.content.a.b(context, n);
    }
    
    public static Drawable d(final Context context, final int n) {
        return j1.h().j(context, n);
    }
    
    private static TypedValue e() {
        final ThreadLocal a = h.b.a;
        TypedValue typedValue;
        if ((typedValue = (TypedValue)a.get()) == null) {
            typedValue = new TypedValue();
            a.set((Object)typedValue);
        }
        return typedValue;
    }
    
    private static ColorStateList f(final Context context, final int n) {
        if (g(context, n)) {
            return null;
        }
        final Resources resources = context.getResources();
        final XmlResourceParser xml = resources.getXml(n);
        try {
            return androidx.core.content.res.c.a(resources, (XmlPullParser)xml, context.getTheme());
        }
        catch (final Exception ex) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", (Throwable)ex);
            return null;
        }
    }
    
    private static boolean g(final Context context, int type) {
        final Resources resources = context.getResources();
        final TypedValue e = e();
        boolean b = true;
        resources.getValue(type, e, true);
        type = e.type;
        if (type < 28 || type > 31) {
            b = false;
        }
        return b;
    }
    
    private static class a
    {
        final ColorStateList a;
        final Configuration b;
        
        a(final ColorStateList a, final Configuration b) {
            this.a = a;
            this.b = b;
        }
    }
}
