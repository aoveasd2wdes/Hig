package s0;

import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

public abstract class n0 extends l
{
    private static final String[] N;
    private int M;
    
    static {
        N = new String[] { "android:visibility:visibility", "android:visibility:parent" };
    }
    
    public n0() {
        this.M = 3;
    }
    
    private void d0(final s s) {
        s.a.put((Object)"android:visibility:visibility", (Object)s.b.getVisibility());
        s.a.put((Object)"android:visibility:parent", (Object)s.b.getParent());
        final int[] array = new int[2];
        s.b.getLocationOnScreen(array);
        s.a.put((Object)"android:visibility:screenLocation", (Object)array);
    }
    
    private n0.n0$c e0(final s s, final s s2) {
        final n0.n0$c n0$c = new n0.n0$c();
        n0$c.a = false;
        n0$c.b = false;
        if (s != null && s.a.containsKey((Object)"android:visibility:visibility")) {
            n0$c.c = (int)s.a.get((Object)"android:visibility:visibility");
            n0$c.e = (ViewGroup)s.a.get((Object)"android:visibility:parent");
        }
        else {
            n0$c.c = -1;
            n0$c.e = null;
        }
        if (s2 != null && s2.a.containsKey((Object)"android:visibility:visibility")) {
            n0$c.d = (int)s2.a.get((Object)"android:visibility:visibility");
            n0$c.f = (ViewGroup)s2.a.get((Object)"android:visibility:parent");
        }
        else {
            n0$c.d = -1;
            n0$c.f = null;
        }
        while (true) {
            Label_0294: {
                if (s != null && s2 != null) {
                    final int c = n0$c.c;
                    final int d = n0$c.d;
                    if (c == d && n0$c.e == n0$c.f) {
                        return n0$c;
                    }
                    if (c != d) {
                        if (c == 0) {
                            break Label_0294;
                        }
                        if (d != 0) {
                            return n0$c;
                        }
                    }
                    else {
                        if (n0$c.f == null) {
                            break Label_0294;
                        }
                        if (n0$c.e != null) {
                            return n0$c;
                        }
                    }
                }
                else if (s != null || n0$c.d != 0) {
                    if (s2 == null && n0$c.c == 0) {
                        break Label_0294;
                    }
                    return n0$c;
                }
                n0$c.b = true;
                n0$c.a = true;
                return n0$c;
            }
            n0$c.b = false;
            continue;
        }
    }
    
    public String[] E() {
        return n0.N;
    }
    
    public boolean G(final s s, final s s2) {
        final boolean b = false;
        if (s == null && s2 == null) {
            return false;
        }
        if (s != null && s2 != null && s2.a.containsKey((Object)"android:visibility:visibility") != s.a.containsKey((Object)"android:visibility:visibility")) {
            return false;
        }
        final n0.n0$c e0 = this.e0(s, s2);
        boolean b2 = b;
        if (e0.a) {
            if (e0.c != 0) {
                b2 = b;
                if (e0.d != 0) {
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    public abstract Animator f0(final ViewGroup p0, final View p1, final s p2, final s p3);
    
    public Animator g0(final ViewGroup viewGroup, final s s, final int n, final s s2, final int n2) {
        if ((this.M & 0x1) == 0x1 && s2 != null) {
            if (s == null) {
                final View view = (View)s2.b.getParent();
                if (this.e0(this.u(view, false), this.F(view, false)).a) {
                    return null;
                }
            }
            return this.f0(viewGroup, s2.b, s, s2);
        }
        return null;
    }
    
    public void h(final s s) {
        this.d0(s);
    }
    
    public abstract Animator h0(final ViewGroup p0, final View p1, final s p2, final s p3);
    
    public Animator i0(final ViewGroup viewGroup, final s s, int n, final s s2, int n2) {
        if ((this.M & 0x2) != 0x2) {
            return null;
        }
        if (s == null) {
            return null;
        }
        final View b = s.b;
        View b2;
        if (s2 != null) {
            b2 = s2.b;
        }
        else {
            b2 = null;
        }
        View view = (View)b.getTag(i.a);
        View view2 = null;
        Label_0287: {
            if (view != null) {
                view2 = null;
                n = 1;
            }
            else {
                View view3 = null;
                Label_0133: {
                    Label_0125: {
                        if (b2 != null && b2.getParent() != null) {
                            if (n2 != 4) {
                                if (b != b2) {
                                    break Label_0125;
                                }
                            }
                            view3 = b2;
                            n = 0;
                            b2 = null;
                            break Label_0133;
                        }
                        if (b2 != null) {
                            view3 = null;
                            n = 0;
                            break Label_0133;
                        }
                    }
                    b2 = null;
                    view3 = null;
                    n = 1;
                }
                View a = b2;
                Label_0277: {
                    if (n != 0) {
                        if (b.getParent() != null) {
                            a = b2;
                            if (!(b.getParent() instanceof View)) {
                                break Label_0277;
                            }
                            final View view4 = (View)b.getParent();
                            if (!this.e0(this.F(view4, true), this.u(view4, true)).a) {
                                a = r.a(viewGroup, b, view4);
                                break Label_0277;
                            }
                            n = view4.getId();
                            a = b2;
                            if (view4.getParent() != null) {
                                break Label_0277;
                            }
                            a = b2;
                            if (n == -1) {
                                break Label_0277;
                            }
                            a = b2;
                            if (((View)viewGroup).findViewById(n) == null) {
                                break Label_0277;
                            }
                            a = b2;
                            if (!super.z) {
                                break Label_0277;
                            }
                        }
                        view2 = view3;
                        n = 0;
                        view = b;
                        break Label_0287;
                    }
                }
                n = 0;
                view2 = view3;
                view = a;
            }
        }
        if (view != null) {
            if (n == 0) {
                final int[] array = (int[])s.a.get((Object)"android:visibility:screenLocation");
                n2 = array[0];
                final int n3 = array[1];
                final int[] array2 = new int[2];
                ((View)viewGroup).getLocationOnScreen(array2);
                view.offsetLeftAndRight(n2 - array2[0] - view.getLeft());
                view.offsetTopAndBottom(n3 - array2[1] - view.getTop());
                x.a(viewGroup).a(view);
            }
            final Animator h0 = this.h0(viewGroup, view, s, s2);
            if (n == 0) {
                if (h0 == null) {
                    x.a(viewGroup).c(view);
                }
                else {
                    b.setTag(i.a, (Object)view);
                    this.a((l$f)new n0$a(this, viewGroup, view, b));
                }
            }
            return h0;
        }
        if (view2 != null) {
            n = view2.getVisibility();
            a0.h(view2, 0);
            final Animator h2 = this.h0(viewGroup, view2, s, s2);
            if (h2 != null) {
                final b b3 = new b(view2, n2, true);
                h2.addListener((Animator$AnimatorListener)b3);
                a.a(h2, (AnimatorListenerAdapter)b3);
                this.a((l$f)b3);
            }
            else {
                a0.h(view2, n);
            }
            return h2;
        }
        return null;
    }
    
    public void j0(final int m) {
        if ((m & 0xFFFFFFFC) == 0x0) {
            this.M = m;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
    
    public void k(final s s) {
        this.d0(s);
    }
    
    public Animator o(final ViewGroup viewGroup, final s s, final s s2) {
        final n0.n0$c e0 = this.e0(s, s2);
        if (!e0.a || (e0.e == null && e0.f == null)) {
            return null;
        }
        if (e0.b) {
            return this.g0(viewGroup, s, e0.c, s2, e0.d);
        }
        return this.i0(viewGroup, s, e0.c, s2, e0.d);
    }
    
    private static class b extends AnimatorListenerAdapter implements l$f
    {
        private final View a;
        private final int b;
        private final ViewGroup c;
        private final boolean d;
        private boolean e;
        boolean f;
        
        b(final View a, final int b, final boolean d) {
            this.f = false;
            this.a = a;
            this.b = b;
            this.c = (ViewGroup)a.getParent();
            this.d = d;
            this.g(true);
        }
        
        private void f() {
            if (!this.f) {
                a0.h(this.a, this.b);
                final ViewGroup c = this.c;
                if (c != null) {
                    ((View)c).invalidate();
                }
            }
            this.g(false);
        }
        
        private void g(final boolean e) {
            if (this.d && this.e != e) {
                final ViewGroup c = this.c;
                if (c != null) {
                    x.c(c, this.e = e);
                }
            }
        }
        
        public void a(final l l) {
            this.f();
            l.Q((l$f)this);
        }
        
        public void b(final l l) {
            this.g(false);
        }
        
        public void c(final l l) {
        }
        
        public void d(final l l) {
        }
        
        public void e(final l l) {
            this.g(true);
        }
        
        public void onAnimationCancel(final Animator animator) {
            this.f = true;
        }
        
        public void onAnimationEnd(final Animator animator) {
            this.f();
        }
        
        public void onAnimationPause(final Animator animator) {
            if (!this.f) {
                a0.h(this.a, this.b);
            }
        }
        
        public void onAnimationRepeat(final Animator animator) {
        }
        
        public void onAnimationResume(final Animator animator) {
            if (!this.f) {
                a0.h(this.a, 0);
            }
        }
        
        public void onAnimationStart(final Animator animator) {
        }
    }
}
