package s0;

import android.view.ViewGroup;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.View;

public class d extends n0
{
    public d(final int n) {
        this.j0(n);
    }
    
    private Animator k0(final View view, final float n, final float n2) {
        if (n == n2) {
            return null;
        }
        a0.g(view, n);
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, a0.b, new float[] { n2 });
        ((Animator)ofFloat).addListener((Animator$AnimatorListener)new d.d$b(view));
        ((l)this).a((l$f)new m(this, view) {
            final View a;
            final d b;
            
            public void a(final l l) {
                a0.g(this.a, 1.0f);
                a0.a(this.a);
                l.Q((l$f)this);
            }
        });
        return (Animator)ofFloat;
    }
    
    private static float l0(final s s, final float n) {
        float floatValue = n;
        if (s != null) {
            final Float n2 = (Float)s.a.get((Object)"android:fade:transitionAlpha");
            floatValue = n;
            if (n2 != null) {
                floatValue = n2;
            }
        }
        return floatValue;
    }
    
    public Animator f0(final ViewGroup viewGroup, final View view, final s s, final s s2) {
        float n = 0.0f;
        final float l0 = l0(s, 0.0f);
        if (l0 != 1.0f) {
            n = l0;
        }
        return this.k0(view, n, 1.0f);
    }
    
    public Animator h0(final ViewGroup viewGroup, final View view, final s s, final s s2) {
        a0.e(view);
        return this.k0(view, l0(s, 1.0f), 0.0f);
    }
    
    public void k(final s s) {
        super.k(s);
        s.a.put((Object)"android:fade:transitionAlpha", (Object)a0.c(s.b));
    }
}
