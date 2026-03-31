package j0;

import androidx.core.view.t;
import android.view.animation.Transformation;
import android.view.View;
import android.view.animation.AnimationSet;
import android.animation.AnimatorSet;
import i0.a;
import android.content.res.TypedArray;
import android.animation.Animator;
import android.view.animation.Animation;
import android.view.ViewGroup;
import android.animation.AnimatorInflater;
import android.content.res.Resources$NotFoundException;
import android.view.animation.AnimationUtils;
import i0.b;
import android.content.Context;

abstract class q
{
    private static int a(final o o, final boolean b, final boolean b2) {
        if (b2) {
            if (b) {
                return o.E();
            }
            return o.F();
        }
        else {
            if (b) {
                return o.r();
            }
            return o.u();
        }
    }
    
    static a b(final Context context, final o o, boolean equals, final boolean b) {
        final int a = o.A();
        final int a2 = a(o, equals, b);
        final boolean b2 = false;
        o.L0(0, 0, 0, 0);
        final ViewGroup i = o.I;
        if (i != null && ((View)i).getTag(b.c) != null) {
            ((View)o.I).setTag(b.c, (Object)null);
        }
        final ViewGroup j = o.I;
        if (j != null && j.getLayoutTransition() != null) {
            return null;
        }
        final Animation y = o.Y(a, equals, a2);
        if (y != null) {
            return new a(y);
        }
        final Animator z = o.Z(a, equals, a2);
        if (z != null) {
            return new a(z);
        }
        int d;
        if ((d = a2) == 0) {
            d = a2;
            if (a != 0) {
                d = d(context, a, equals);
            }
        }
        if (d != 0) {
            equals = "anim".equals((Object)context.getResources().getResourceTypeName(d));
            int n = b2 ? 1 : 0;
            if (equals) {
                try {
                    final Animation loadAnimation = AnimationUtils.loadAnimation(context, d);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                    n = 1;
                }
                catch (final RuntimeException ex) {
                    n = (b2 ? 1 : 0);
                }
                catch (final Resources$NotFoundException ex2) {
                    throw ex2;
                }
            }
            if (n == 0) {
                try {
                    final Animator loadAnimator = AnimatorInflater.loadAnimator(context, d);
                    if (loadAnimator != null) {
                        return new a(loadAnimator);
                    }
                }
                catch (final RuntimeException ex3) {
                    if (equals) {
                        throw ex3;
                    }
                    final Animation loadAnimation2 = AnimationUtils.loadAnimation(context, d);
                    if (loadAnimation2 != null) {
                        return new a(loadAnimation2);
                    }
                }
            }
        }
        return null;
    }
    
    private static int c(final Context context, int resourceId) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[] { resourceId });
        resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
    
    private static int d(final Context context, int n, final boolean b) {
        if (n != 4097) {
            if (n != 8194) {
                if (n != 8197) {
                    if (n != 4099) {
                        if (n != 4100) {
                            n = -1;
                            return n;
                        }
                        if (b) {
                            n = 16842936;
                        }
                        else {
                            n = 16842937;
                        }
                    }
                    else {
                        if (b) {
                            n = i0.a.c;
                            return n;
                        }
                        n = i0.a.d;
                        return n;
                    }
                }
                else if (b) {
                    n = 16842938;
                }
                else {
                    n = 16842939;
                }
                n = c(context, n);
            }
            else if (b) {
                n = i0.a.a;
            }
            else {
                n = i0.a.b;
            }
        }
        else if (b) {
            n = i0.a.e;
        }
        else {
            n = i0.a.f;
        }
        return n;
    }
    
    static class a
    {
        public final Animation a;
        public final AnimatorSet b;
        
        a(final Animator animator) {
            this.a = null;
            (this.b = new AnimatorSet()).play(animator);
            if (animator != null) {
                return;
            }
            throw new IllegalStateException("Animator cannot be null");
        }
        
        a(final Animation a) {
            this.a = a;
            this.b = null;
            if (a != null) {
                return;
            }
            throw new IllegalStateException("Animation cannot be null");
        }
    }
    
    static class b extends AnimationSet implements Runnable
    {
        private final ViewGroup e;
        private final View f;
        private boolean g;
        private boolean h;
        private boolean i;
        
        b(final Animation animation, final ViewGroup e, final View f) {
            super(false);
            this.i = true;
            this.e = e;
            this.f = f;
            this.addAnimation(animation);
            ((View)e).post((Runnable)this);
        }
        
        public boolean getTransformation(final long n, final Transformation transformation) {
            this.i = true;
            if (this.g) {
                return this.h ^ true;
            }
            if (!super.getTransformation(n, transformation)) {
                this.g = true;
                t.a((View)this.e, (Runnable)this);
            }
            return true;
        }
        
        public boolean getTransformation(final long n, final Transformation transformation, final float n2) {
            this.i = true;
            if (this.g) {
                return this.h ^ true;
            }
            if (!super.getTransformation(n, transformation, n2)) {
                this.g = true;
                t.a((View)this.e, (Runnable)this);
            }
            return true;
        }
        
        public void run() {
            if (!this.g && this.i) {
                this.i = false;
                ((View)this.e).post((Runnable)this);
            }
            else {
                this.e.endViewTransition(this.f);
                this.h = true;
            }
        }
    }
}
