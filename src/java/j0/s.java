package j0;

import java.util.Collection;
import android.animation.LayoutTransition;
import java.util.Iterator;
import android.graphics.Canvas;
import androidx.core.view.y;
import androidx.core.view.f0;
import android.view.WindowInsets;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.os.Bundle;
import i0.c;
import java.util.ArrayList;
import i4.l;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnApplyWindowInsetsListener;
import java.util.List;
import android.widget.FrameLayout;

public final class s extends FrameLayout
{
    private final List c;
    private final List d;
    private View$OnApplyWindowInsetsListener e;
    private boolean f;
    
    public s(final Context context, final AttributeSet set, final b0 v) {
        l.e((Object)context, "context");
        l.e((Object)set, "attrs");
        l.e((Object)v, "fm");
        super(context, set);
        this.c = (List)new ArrayList();
        this.d = (List)new ArrayList();
        this.f = true;
        final String classAttribute = set.getClassAttribute();
        final int[] e = i0.c.e;
        l.d((Object)e, "FragmentContainerView");
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, e, 0, 0);
        String string = classAttribute;
        if (classAttribute == null) {
            string = obtainStyledAttributes.getString(i0.c.f);
        }
        final String string2 = obtainStyledAttributes.getString(i0.c.g);
        obtainStyledAttributes.recycle();
        final int id = ((View)this).getId();
        final o o = v.O(id);
        if (string != null && o == null) {
            if (id == -1) {
                String string3;
                if (string2 != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(" with tag ");
                    sb.append(string2);
                    string3 = sb.toString();
                }
                else {
                    string3 = "";
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("FragmentContainerView must have an android:id to add Fragment ");
                sb2.append(string);
                sb2.append(string3);
                throw new IllegalStateException(sb2.toString());
            }
            final o a = v.Z().a(context.getClassLoader(), string);
            l.d((Object)a, "fm.fragmentFactory.insta\u2026ontext.classLoader, name)");
            a.y = id;
            a.z = id;
            a.A = string2;
            (a.v = v).a0();
            a.f0(context, set, (Bundle)null);
            v.j().h(true).c((ViewGroup)this, a, string2).e();
        }
        v.y0(this);
    }
    
    private final void a(final View view) {
        if (this.d.contains((Object)view)) {
            this.c.add((Object)view);
        }
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        l.e((Object)view, "child");
        if (b0.g0(view) != null) {
            super.addView(view, n, viewGroup$LayoutParams);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append((Object)view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public WindowInsets dispatchApplyWindowInsets(final WindowInsets windowInsets) {
        l.e((Object)windowInsets, "insets");
        final f0 n = f0.n(windowInsets);
        l.d((Object)n, "toWindowInsetsCompat(insets)");
        final View$OnApplyWindowInsetsListener e = this.e;
        f0 f0;
        if (e != null) {
            final a a = s.a.a;
            l.b((Object)e);
            f0 = androidx.core.view.f0.n(a.a(e, (View)this, windowInsets));
        }
        else {
            f0 = y.y((View)this, n);
        }
        l.d((Object)f0, "if (applyWindowInsetsLis\u2026, insetsCompat)\n        }");
        if (!f0.h()) {
            for (int childCount = ((ViewGroup)this).getChildCount(), i = 0; i < childCount; ++i) {
                y.b(((ViewGroup)this).getChildAt(i), f0);
            }
        }
        return windowInsets;
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        l.e((Object)canvas, "canvas");
        if (this.f) {
            final Iterator iterator = ((Iterable)this.c).iterator();
            while (iterator.hasNext()) {
                super.drawChild(canvas, (View)iterator.next(), ((View)this).getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }
    
    protected boolean drawChild(final Canvas canvas, final View view, final long n) {
        l.e((Object)canvas, "canvas");
        l.e((Object)view, "child");
        return (!this.f || !(((Collection)this.c).isEmpty() ^ true) || !this.c.contains((Object)view)) && super.drawChild(canvas, view, n);
    }
    
    public void endViewTransition(final View view) {
        l.e((Object)view, "view");
        this.d.remove((Object)view);
        if (this.c.remove((Object)view)) {
            this.f = true;
        }
        super.endViewTransition(view);
    }
    
    public final <F extends o> F getFragment() {
        return (F)b0.Q((View)this).O(((View)this).getId());
    }
    
    public WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        l.e((Object)windowInsets, "insets");
        return windowInsets;
    }
    
    public void removeAllViewsInLayout() {
        for (int n = ((ViewGroup)this).getChildCount() - 1; -1 < n; --n) {
            final View child = ((ViewGroup)this).getChildAt(n);
            l.d((Object)child, "view");
            this.a(child);
        }
        super.removeAllViewsInLayout();
    }
    
    public void removeView(final View view) {
        l.e((Object)view, "view");
        this.a(view);
        super.removeView(view);
    }
    
    public void removeViewAt(final int n) {
        final View child = ((ViewGroup)this).getChildAt(n);
        l.d((Object)child, "view");
        this.a(child);
        super.removeViewAt(n);
    }
    
    public void removeViewInLayout(final View view) {
        l.e((Object)view, "view");
        this.a(view);
        super.removeViewInLayout(view);
    }
    
    public void removeViews(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            final View child = ((ViewGroup)this).getChildAt(i);
            l.d((Object)child, "view");
            this.a(child);
        }
        super.removeViews(n, n2);
    }
    
    public void removeViewsInLayout(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            final View child = ((ViewGroup)this).getChildAt(i);
            l.d((Object)child, "view");
            this.a(child);
        }
        super.removeViewsInLayout(n, n2);
    }
    
    public final void setDrawDisappearingViewsLast(final boolean f) {
        this.f = f;
    }
    
    public void setLayoutTransition(final LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }
    
    public void setOnApplyWindowInsetsListener(final View$OnApplyWindowInsetsListener e) {
        l.e((Object)e, "listener");
        this.e = e;
    }
    
    public void startViewTransition(final View view) {
        l.e((Object)view, "view");
        if (view.getParent() == this) {
            this.d.add((Object)view);
        }
        super.startViewTransition(view);
    }
    
    public static final class a
    {
        public static final a a;
        
        static {
            a = new a();
        }
        
        private a() {
        }
        
        public final WindowInsets a(final View$OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener, final View view, final WindowInsets windowInsets) {
            l.e((Object)view$OnApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            l.e((Object)view, "v");
            l.e((Object)windowInsets, "insets");
            final WindowInsets onApplyWindowInsets = view$OnApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            l.d((Object)onApplyWindowInsets, "onApplyWindowInsetsListe\u2026lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }
}
