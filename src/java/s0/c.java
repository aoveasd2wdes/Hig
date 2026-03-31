package s0;

import android.graphics.Path;
import java.util.Map;
import android.animation.PropertyValuesHolder;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.animation.TypeEvaluator;
import android.animation.ObjectAnimator;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Rect;
import androidx.core.view.y;
import android.graphics.PointF;
import android.util.Property;

public class c extends l
{
    private static final String[] P;
    private static final Property Q;
    private static final Property R;
    private static final Property S;
    private static final Property T;
    private static final Property U;
    private static final Property V;
    private static j W;
    private int[] M;
    private boolean N;
    private boolean O;
    
    static {
        P = new String[] { "android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY" };
        Q = (Property)new c$b((Class)PointF.class, "boundsOrigin");
        R = (Property)new c$c((Class)PointF.class, "topLeft");
        S = (Property)new c$d((Class)PointF.class, "bottomRight");
        T = (Property)new c$e((Class)PointF.class, "bottomRight");
        U = (Property)new c$f((Class)PointF.class, "topLeft");
        V = (Property)new c$g((Class)PointF.class, "position");
        c.W = new j();
    }
    
    public c() {
        this.M = new int[2];
        this.N = false;
        this.O = false;
    }
    
    private void d0(final s s) {
        final View b = s.b;
        if (y.v(b) || b.getWidth() != 0 || b.getHeight() != 0) {
            s.a.put((Object)"android:changeBounds:bounds", (Object)new Rect(b.getLeft(), b.getTop(), b.getRight(), b.getBottom()));
            s.a.put((Object)"android:changeBounds:parent", (Object)s.b.getParent());
            if (this.O) {
                s.b.getLocationInWindow(this.M);
                s.a.put((Object)"android:changeBounds:windowX", (Object)this.M[0]);
                s.a.put((Object)"android:changeBounds:windowY", (Object)this.M[1]);
            }
            if (this.N) {
                s.a.put((Object)"android:changeBounds:clip", (Object)y.h(b));
            }
        }
    }
    
    private boolean e0(final View view, final View view2) {
        final boolean o = this.O;
        boolean b = true;
        if (o) {
            final s u = this.u(view, true);
            b = (((u != null) ? (view2 == u.b) : (view == view2)) && b);
        }
        return b;
    }
    
    public String[] E() {
        return c.P;
    }
    
    public void h(final s s) {
        this.d0(s);
    }
    
    public void k(final s s) {
        this.d0(s);
    }
    
    public Animator o(final ViewGroup viewGroup, final s s, final s s2) {
        if (s == null || s2 == null) {
            return null;
        }
        final Map a = s.a;
        final Map a2 = s2.a;
        final ViewGroup viewGroup2 = (ViewGroup)a.get((Object)"android:changeBounds:parent");
        final ViewGroup viewGroup3 = (ViewGroup)a2.get((Object)"android:changeBounds:parent");
        if (viewGroup2 != null && viewGroup3 != null) {
            final View b = s2.b;
            if (this.e0((View)viewGroup2, (View)viewGroup3)) {
                final Rect rect = (Rect)s.a.get((Object)"android:changeBounds:bounds");
                final Rect rect2 = (Rect)s2.a.get((Object)"android:changeBounds:bounds");
                final int left = rect.left;
                final int left2 = rect2.left;
                final int top = rect.top;
                final int top2 = rect2.top;
                final int right = rect.right;
                final int right2 = rect2.right;
                final int bottom = rect.bottom;
                final int bottom2 = rect2.bottom;
                final int n = right - left;
                final int n2 = bottom - top;
                final int n3 = right2 - left2;
                final int n4 = bottom2 - top2;
                Object o = s.a.get((Object)"android:changeBounds:clip");
                final Rect rect3 = (Rect)s2.a.get((Object)"android:changeBounds:clip");
                int n6 = 0;
                Label_0299: {
                    if ((n != 0 && n2 != 0) || (n3 != 0 && n4 != 0)) {
                        int n5;
                        if (left == left2 && top == top2) {
                            n5 = 0;
                        }
                        else {
                            n5 = 1;
                        }
                        if (right == right2) {
                            n6 = n5;
                            if (bottom == bottom2) {
                                break Label_0299;
                            }
                        }
                        n6 = n5 + 1;
                    }
                    else {
                        n6 = 0;
                    }
                }
                int n7 = 0;
                Label_0335: {
                    if (o == null || ((Rect)o).equals(rect3)) {
                        n7 = n6;
                        if (o != null) {
                            break Label_0335;
                        }
                        n7 = n6;
                        if (rect3 == null) {
                            break Label_0335;
                        }
                    }
                    n7 = n6 + 1;
                }
                if (n7 > 0) {
                    Object o2 = null;
                    Label_0795: {
                        if (!this.N) {
                            a0.f(b, left, top, right, bottom);
                            Path path;
                            Property property;
                            if (n7 == 2) {
                                if (n != n3 || n2 != n4) {
                                    final c.c$k c$k = new c.c$k(b);
                                    final ObjectAnimator a3 = f.a((Object)c$k, c.R, this.w().a((float)left, (float)top, (float)left2, (float)top2));
                                    final ObjectAnimator a4 = f.a((Object)c$k, c.S, this.w().a((float)right, (float)bottom, (float)right2, (float)bottom2));
                                    o2 = new AnimatorSet();
                                    ((AnimatorSet)o2).playTogether(new Animator[] { (Animator)a3, (Animator)a4 });
                                    ((Animator)o2).addListener((Animator$AnimatorListener)new c$h(this, c$k));
                                    break Label_0795;
                                }
                                path = this.w().a((float)left, (float)top, (float)left2, (float)top2);
                                property = c.V;
                            }
                            else if (left == left2 && top == top2) {
                                path = this.w().a((float)right, (float)bottom, (float)right2, (float)bottom2);
                                property = c.T;
                            }
                            else {
                                path = this.w().a((float)left, (float)top, (float)left2, (float)top2);
                                property = c.U;
                            }
                            o2 = f.a((Object)b, property, path);
                        }
                        else {
                            a0.f(b, left, top, Math.max(n, n3) + left, Math.max(n2, n4) + top);
                            Object a5;
                            if (left == left2 && top == top2) {
                                a5 = null;
                            }
                            else {
                                a5 = f.a((Object)b, c.V, this.w().a((float)left, (float)top, (float)left2, (float)top2));
                            }
                            if (o == null) {
                                o = new Rect(0, 0, n, n2);
                            }
                            Rect rect4;
                            if (rect3 == null) {
                                rect4 = new Rect(0, 0, n3, n4);
                            }
                            else {
                                rect4 = rect3;
                            }
                            Object ofObject;
                            if (!((Rect)o).equals(rect4)) {
                                y.J(b, (Rect)o);
                                ofObject = ObjectAnimator.ofObject((Object)b, "clipBounds", (TypeEvaluator)c.W, new Object[] { o, rect4 });
                                ((Animator)ofObject).addListener((Animator$AnimatorListener)new c$i(this, b, rect3, left2, top2, right2, bottom2));
                            }
                            else {
                                ofObject = null;
                            }
                            o2 = r.c((Animator)a5, (Animator)ofObject);
                        }
                    }
                    if (b.getParent() instanceof ViewGroup) {
                        final ViewGroup viewGroup4 = (ViewGroup)b.getParent();
                        x.c(viewGroup4, true);
                        this.a((l$f)new c$j(this, viewGroup4));
                    }
                    return (Animator)o2;
                }
            }
            else {
                final int intValue = (int)s.a.get((Object)"android:changeBounds:windowX");
                final int intValue2 = (int)s.a.get((Object)"android:changeBounds:windowY");
                final int intValue3 = (int)s2.a.get((Object)"android:changeBounds:windowX");
                final int intValue4 = (int)s2.a.get((Object)"android:changeBounds:windowY");
                if (intValue != intValue3 || intValue2 != intValue4) {
                    ((View)viewGroup).getLocationInWindow(this.M);
                    final Bitmap bitmap = Bitmap.createBitmap(b.getWidth(), b.getHeight(), Bitmap$Config.ARGB_8888);
                    b.draw(new Canvas(bitmap));
                    final BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                    final float c = a0.c(b);
                    a0.g(b, 0.0f);
                    a0.b((View)viewGroup).b((Drawable)bitmapDrawable);
                    final g w = this.w();
                    final int[] m = this.M;
                    final int n8 = m[0];
                    final float n9 = (float)(intValue - n8);
                    final int n10 = m[1];
                    final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)bitmapDrawable, new PropertyValuesHolder[] { h.a(s0.c.Q, w.a(n9, (float)(intValue2 - n10), (float)(intValue3 - n8), (float)(intValue4 - n10))) });
                    ((Animator)ofPropertyValuesHolder).addListener((Animator$AnimatorListener)new c$a(this, viewGroup, bitmapDrawable, b, c));
                    return (Animator)ofPropertyValuesHolder;
                }
            }
            return null;
        }
        return null;
    }
}
