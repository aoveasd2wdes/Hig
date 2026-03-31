package j0;

import androidx.core.view.t;
import java.util.Map;
import androidx.core.os.a;
import android.util.Log;
import android.view.ViewParent;
import android.graphics.RectF;
import android.graphics.Rect;
import java.util.ArrayList;
import android.view.ViewGroup;
import androidx.core.view.y;
import android.view.View;
import java.util.List;

public abstract class m0
{
    protected static void f(final List list, View view) {
        final int size = list.size();
        if (i(list, view, size)) {
            return;
        }
        if (y.q(view) != null) {
            list.add((Object)view);
        }
        for (int i = size; i < list.size(); ++i) {
            view = (View)list.get(i);
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int childCount = viewGroup.getChildCount(), j = 0; j < childCount; ++j) {
                    final View child = viewGroup.getChildAt(j);
                    if (!i(list, child, size) && y.q(child) != null) {
                        list.add((Object)child);
                    }
                }
            }
        }
    }
    
    private static boolean i(final List list, final View view, final int n) {
        for (int i = 0; i < n; ++i) {
            if (list.get(i) == view) {
                return true;
            }
        }
        return false;
    }
    
    protected static boolean l(final List list) {
        return list == null || list.isEmpty();
    }
    
    public abstract Object A(final Object p0);
    
    public abstract void a(final Object p0, final View p1);
    
    public abstract void b(final Object p0, final ArrayList p1);
    
    public void c(final Object o) {
    }
    
    public void d(final Object o, final Runnable runnable) {
    }
    
    public abstract void e(final ViewGroup p0, final Object p1);
    
    public abstract boolean g(final Object p0);
    
    public abstract Object h(final Object p0);
    
    public Object j(final ViewGroup viewGroup, final Object o) {
        return null;
    }
    
    protected void k(final View view, final Rect rect) {
        if (!view.isAttachedToWindow()) {
            return;
        }
        final RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset((float)view.getLeft(), (float)view.getTop());
        View view2;
        for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = view2.getParent()) {
            view2 = (View)viewParent;
            rectF.offset((float)(-view2.getScrollX()), (float)(-view2.getScrollY()));
            view2.getMatrix().mapRect(rectF);
            rectF.offset((float)view2.getLeft(), (float)view2.getTop());
        }
        final int[] array = new int[2];
        view.getRootView().getLocationOnScreen(array);
        rectF.offset((float)array[0], (float)array[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }
    
    public boolean m() {
        if (b0.l0(4)) {
            Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        }
        return false;
    }
    
    public boolean n(final Object o) {
        return false;
    }
    
    public abstract Object o(final Object p0, final Object p1, final Object p2);
    
    public abstract Object p(final Object p0, final Object p1, final Object p2);
    
    ArrayList q(final ArrayList list) {
        final ArrayList list2 = new ArrayList();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final View view = (View)list.get(i);
            list2.add((Object)y.q(view));
            y.O(view, (String)null);
        }
        return list2;
    }
    
    public abstract void r(final Object p0, final View p1, final ArrayList p2);
    
    public abstract void s(final Object p0, final Object p1, final ArrayList p2, final Object p3, final ArrayList p4, final Object p5, final ArrayList p6);
    
    public abstract void t(final Object p0, final Rect p1);
    
    public abstract void u(final Object p0, final View p1);
    
    public abstract void v(final o p0, final Object p1, final a p2, final Runnable p3);
    
    public void w(final o o, final Object o2, final a a, final Runnable runnable, final Runnable runnable2) {
        runnable2.run();
    }
    
    void x(final View view, final ArrayList list, final ArrayList list2, final ArrayList list3, final Map map) {
        final int size = list2.size();
        final ArrayList list4 = new ArrayList();
        for (int i = 0; i < size; ++i) {
            final View view2 = (View)list.get(i);
            final String q = y.q(view2);
            list4.add((Object)q);
            if (q != null) {
                y.O(view2, (String)null);
                final String s = (String)map.get((Object)q);
                for (int j = 0; j < size; ++j) {
                    if (s.equals(list3.get(j))) {
                        y.O((View)list2.get(j), q);
                        break;
                    }
                }
            }
        }
        t.a(view, (Runnable)new Runnable(this, size, list2, list3, list, list4) {
            final int e;
            final ArrayList f;
            final ArrayList g;
            final ArrayList h;
            final ArrayList i;
            final m0 j;
            
            public void run() {
                for (int i = 0; i < this.e; ++i) {
                    y.O((View)this.f.get(i), (String)this.g.get(i));
                    y.O((View)this.h.get(i), (String)this.i.get(i));
                }
            }
        });
    }
    
    public abstract void y(final Object p0, final View p1, final ArrayList p2);
    
    public abstract void z(final Object p0, final ArrayList p1, final ArrayList p2);
}
