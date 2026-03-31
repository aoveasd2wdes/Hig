package s0;

import p.g;
import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Iterator;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnAttachStateChangeListener;
import java.lang.ref.WeakReference;
import p.a;
import android.view.View;
import androidx.core.view.y;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class n
{
    private static l a;
    private static ThreadLocal b;
    static ArrayList c;
    
    static {
        n.a = (l)new b();
        n.b = new ThreadLocal();
        n.c = new ArrayList();
    }
    
    public static void a(final ViewGroup viewGroup, l n) {
        if (!n.c.contains((Object)viewGroup) && y.v((View)viewGroup)) {
            n.c.add((Object)viewGroup);
            l a;
            if ((a = n) == null) {
                a = n.a;
            }
            n = a.n();
            d(viewGroup, n);
            k.b(viewGroup, null);
            c(viewGroup, n);
        }
    }
    
    static p.a b() {
        final WeakReference weakReference = (WeakReference)n.b.get();
        if (weakReference != null) {
            final p.a a = (p.a)((Reference)weakReference).get();
            if (a != null) {
                return a;
            }
        }
        final p.a a2 = new p.a();
        n.b.set((Object)new WeakReference((Object)a2));
        return a2;
    }
    
    private static void c(final ViewGroup viewGroup, final l l) {
        if (l != null && viewGroup != null) {
            final a a = new a(l, viewGroup);
            ((View)viewGroup).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)a);
            ((View)viewGroup).getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)a);
        }
    }
    
    private static void d(final ViewGroup viewGroup, final l l) {
        final ArrayList list = (ArrayList)((g)b()).get((Object)viewGroup);
        if (list != null && list.size() > 0) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                ((l)iterator.next()).O((View)viewGroup);
            }
        }
        if (l != null) {
            l.l(viewGroup, true);
        }
        k.a(viewGroup);
    }
    
    private static class a implements ViewTreeObserver$OnPreDrawListener, View$OnAttachStateChangeListener
    {
        l c;
        ViewGroup d;
        
        a(final l c, final ViewGroup d) {
            this.c = c;
            this.d = d;
        }
        
        private void a() {
            ((View)this.d).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
            ((View)this.d).removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        }
        
        public boolean onPreDraw() {
            this.a();
            if (!n.c.remove((Object)this.d)) {
                return true;
            }
            final p.a b = n.b();
            final ArrayList list = (ArrayList)((g)b).get((Object)this.d);
            ArrayList list2 = null;
            ArrayList list3;
            if (list == null) {
                list3 = new ArrayList();
                ((g)b).put((Object)this.d, (Object)list3);
            }
            else {
                list3 = list;
                if (list.size() > 0) {
                    list2 = new ArrayList((Collection)list);
                    list3 = list;
                }
            }
            list3.add((Object)this.c);
            this.c.a((l.f)new n$a$a(this, b));
            this.c.l(this.d, false);
            if (list2 != null) {
                final Iterator iterator = list2.iterator();
                while (iterator.hasNext()) {
                    ((l)iterator.next()).S((View)this.d);
                }
            }
            this.c.P(this.d);
            return true;
        }
        
        public void onViewAttachedToWindow(final View view) {
        }
        
        public void onViewDetachedFromWindow(final View view) {
            this.a();
            n.c.remove((Object)this.d);
            final ArrayList list = (ArrayList)((g)n.b()).get((Object)this.d);
            if (list != null && list.size() > 0) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    ((l)iterator.next()).S((View)this.d);
                }
            }
            this.c.m(true);
        }
    }
}
