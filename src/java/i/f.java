package i;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;

abstract class f extends d
{
    private a p;
    private boolean q;
    
    f(final a a) {
        if (a != null) {
            this.h(a);
        }
    }
    
    public void applyTheme(final Resources$Theme resources$Theme) {
        super.applyTheme(resources$Theme);
        this.onStateChange(((Drawable)this).getState());
    }
    
    void h(final d$c d$c) {
        super.h(d$c);
        if (d$c instanceof a) {
            this.p = (a)d$c;
        }
    }
    
    int[] j(final AttributeSet set) {
        final int attributeCount = set.getAttributeCount();
        final int[] array = new int[attributeCount];
        int i = 0;
        int n = 0;
        while (i < attributeCount) {
            final int attributeNameResource = set.getAttributeNameResource(i);
            int n2 = n;
            if (attributeNameResource != 0) {
                n2 = n;
                if (attributeNameResource != 16842960) {
                    n2 = n;
                    if (attributeNameResource != 16843161) {
                        int n3;
                        if (set.getAttributeBooleanValue(i, false)) {
                            n3 = attributeNameResource;
                        }
                        else {
                            n3 = -attributeNameResource;
                        }
                        array[n] = n3;
                        n2 = n + 1;
                    }
                }
            }
            ++i;
            n = n2;
        }
        return StateSet.trimStateSet(array, n);
    }
    
    public Drawable mutate() {
        if (!this.q && super.mutate() == this) {
            this.p.r();
            this.q = true;
        }
        return (Drawable)this;
    }
    
    protected abstract boolean onStateChange(final int[] p0);
    
    abstract static class a extends d$c
    {
        int[][] J;
        
        a(final a a, final f f, final Resources resources) {
            super((d$c)a, (d)f, resources);
            if (a != null) {
                this.J = a.J;
            }
            else {
                this.J = new int[this.f()][];
            }
        }
        
        int A(final int[] array) {
            final int[][] j = this.J;
            for (int h = this.h(), i = 0; i < h; ++i) {
                if (StateSet.stateSetMatches(j[i], array)) {
                    return i;
                }
            }
            return -1;
        }
        
        public void o(final int n, final int n2) {
            super.o(n, n2);
            final int[][] j = new int[n2][];
            System.arraycopy((Object)this.J, 0, (Object)j, 0, n);
            this.J = j;
        }
        
        abstract void r();
        
        int z(final int[] array, final Drawable drawable) {
            final int a = this.a(drawable);
            this.J[a] = array;
            return a;
        }
    }
}
