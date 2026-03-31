package i;

import android.util.SparseArray;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import android.content.res.Resources$Theme;
import android.os.SystemClock;
import android.content.res.Resources;
import android.os.Build$VERSION;
import androidx.core.graphics.drawable.a;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

abstract class d extends Drawable implements Drawable$Callback
{
    private c c;
    private Rect d;
    private Drawable e;
    private Drawable f;
    private int g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private Runnable l;
    private long m;
    private long n;
    private b o;
    
    d() {
        this.g = 255;
        this.i = -1;
        this.j = -1;
    }
    
    private void d(final Drawable drawable) {
        if (this.o == null) {
            this.o = new b();
        }
        drawable.setCallback((Drawable$Callback)this.o.b(drawable.getCallback()));
        try {
            if (this.c.A <= 0 && this.h) {
                drawable.setAlpha(this.g);
            }
            final c c = this.c;
            if (c.E) {
                drawable.setColorFilter(c.D);
            }
            else {
                if (c.H) {
                    a.n(drawable, c.F);
                }
                final c c2 = this.c;
                if (c2.I) {
                    a.o(drawable, c2.G);
                }
            }
            drawable.setVisible(this.isVisible(), true);
            drawable.setDither(this.c.x);
            drawable.setState(this.getState());
            drawable.setLevel(this.getLevel());
            drawable.setBounds(this.getBounds());
            if (Build$VERSION.SDK_INT >= 23) {
                i.c.a(drawable, i.b.a(this));
            }
            drawable.setAutoMirrored(this.c.C);
            final Rect d = this.d;
            if (d != null) {
                drawable.setHotspotBounds(d.left, d.top, d.right, d.bottom);
            }
        }
        finally {
            drawable.setCallback(this.o.a());
        }
    }
    
    private boolean e() {
        if (this.isAutoMirrored()) {
            final int e = a.e((Drawable)this);
            final boolean b = true;
            if (e == 1) {
                return b;
            }
        }
        return false;
    }
    
    static int f(final Resources resources, int densityDpi) {
        if (resources != null) {
            densityDpi = resources.getDisplayMetrics().densityDpi;
        }
        int n = densityDpi;
        if (densityDpi == 0) {
            n = 160;
        }
        return n;
    }
    
    void a(final boolean b) {
        final int n = 1;
        this.h = true;
        final long uptimeMillis = SystemClock.uptimeMillis();
        final Drawable e = this.e;
        int n2 = 0;
        Label_0104: {
            Label_0102: {
                if (e != null) {
                    final long m = this.m;
                    if (m == 0L) {
                        break Label_0102;
                    }
                    if (m > uptimeMillis) {
                        e.setAlpha((255 - (int)((m - uptimeMillis) * 255L) / this.c.A) * this.g / 255);
                        n2 = 1;
                        break Label_0104;
                    }
                    e.setAlpha(this.g);
                }
                this.m = 0L;
            }
            n2 = 0;
        }
        final Drawable f = this.f;
        Label_0199: {
            if (f != null) {
                final long n3 = this.n;
                if (n3 == 0L) {
                    break Label_0199;
                }
                if (n3 > uptimeMillis) {
                    f.setAlpha((int)((n3 - uptimeMillis) * 255L) / this.c.B * this.g / 255);
                    n2 = n;
                    break Label_0199;
                }
                f.setVisible(false, false);
                this.f = null;
                this.j = -1;
            }
            this.n = 0L;
        }
        if (b && n2 != 0) {
            this.scheduleSelf(this.l, uptimeMillis + 16L);
        }
    }
    
    public void applyTheme(final Resources$Theme resources$Theme) {
        this.c.b(resources$Theme);
    }
    
    abstract c b();
    
    int c() {
        return this.i;
    }
    
    public boolean canApplyTheme() {
        return this.c.canApplyTheme();
    }
    
    public void draw(final Canvas canvas) {
        final Drawable e = this.e;
        if (e != null) {
            e.draw(canvas);
        }
        final Drawable f = this.f;
        if (f != null) {
            f.draw(canvas);
        }
    }
    
    boolean g(int a) {
        if (a == this.i) {
            return false;
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        if (this.c.B > 0) {
            final Drawable f = this.f;
            if (f != null) {
                f.setVisible(false, false);
            }
            final Drawable e = this.e;
            if (e != null) {
                this.f = e;
                this.j = this.i;
                this.n = this.c.B + uptimeMillis;
            }
            else {
                this.f = null;
                this.j = -1;
                this.n = 0L;
            }
        }
        else {
            final Drawable e2 = this.e;
            if (e2 != null) {
                e2.setVisible(false, false);
            }
        }
        Label_0204: {
            if (a >= 0) {
                final c c = this.c;
                if (a < c.h) {
                    final Drawable g = c.g(a);
                    this.e = g;
                    this.i = a;
                    if (g != null) {
                        a = this.c.A;
                        if (a > 0) {
                            this.m = uptimeMillis + a;
                        }
                        this.d(g);
                    }
                    break Label_0204;
                }
            }
            this.e = null;
            this.i = -1;
        }
        if (this.m != 0L || this.n != 0L) {
            final Runnable l = this.l;
            if (l == null) {
                this.l = (Runnable)new Runnable(this) {
                    final d e;
                    
                    public void run() {
                        this.e.a(true);
                        this.e.invalidateSelf();
                    }
                };
            }
            else {
                this.unscheduleSelf(l);
            }
            this.a(true);
        }
        this.invalidateSelf();
        return true;
    }
    
    public int getAlpha() {
        return this.g;
    }
    
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }
    
    public final Drawable$ConstantState getConstantState() {
        if (this.c.c()) {
            this.c.d = this.getChangingConfigurations();
            return this.c;
        }
        return null;
    }
    
    public Drawable getCurrent() {
        return this.e;
    }
    
    public void getHotspotBounds(final Rect rect) {
        final Rect d = this.d;
        if (d != null) {
            rect.set(d);
        }
        else {
            super.getHotspotBounds(rect);
        }
    }
    
    public int getIntrinsicHeight() {
        if (this.c.q()) {
            return this.c.i();
        }
        final Drawable e = this.e;
        int intrinsicHeight;
        if (e != null) {
            intrinsicHeight = e.getIntrinsicHeight();
        }
        else {
            intrinsicHeight = -1;
        }
        return intrinsicHeight;
    }
    
    public int getIntrinsicWidth() {
        if (this.c.q()) {
            return this.c.m();
        }
        final Drawable e = this.e;
        int intrinsicWidth;
        if (e != null) {
            intrinsicWidth = e.getIntrinsicWidth();
        }
        else {
            intrinsicWidth = -1;
        }
        return intrinsicWidth;
    }
    
    public int getMinimumHeight() {
        if (this.c.q()) {
            return this.c.j();
        }
        final Drawable e = this.e;
        int minimumHeight;
        if (e != null) {
            minimumHeight = e.getMinimumHeight();
        }
        else {
            minimumHeight = 0;
        }
        return minimumHeight;
    }
    
    public int getMinimumWidth() {
        if (this.c.q()) {
            return this.c.k();
        }
        final Drawable e = this.e;
        int minimumWidth;
        if (e != null) {
            minimumWidth = e.getMinimumWidth();
        }
        else {
            minimumWidth = 0;
        }
        return minimumWidth;
    }
    
    public int getOpacity() {
        final Drawable e = this.e;
        int n;
        if (e != null && e.isVisible()) {
            n = this.c.n();
        }
        else {
            n = -2;
        }
        return n;
    }
    
    public void getOutline(final Outline outline) {
        final Drawable e = this.e;
        if (e != null) {
            e.getOutline(outline);
        }
    }
    
    public boolean getPadding(final Rect rect) {
        final Rect l = this.c.l();
        boolean b;
        if (l != null) {
            rect.set(l);
            b = ((l.right | (l.left | l.top | l.bottom)) != 0x0);
        }
        else {
            final Drawable e = this.e;
            if (e != null) {
                b = e.getPadding(rect);
            }
            else {
                b = super.getPadding(rect);
            }
        }
        if (this.e()) {
            final int left = rect.left;
            rect.left = rect.right;
            rect.right = left;
        }
        return b;
    }
    
    void h(final c c) {
        this.c = c;
        final int i = this.i;
        if (i >= 0) {
            final Drawable g = c.g(i);
            if ((this.e = g) != null) {
                this.d(g);
            }
        }
        this.j = -1;
        this.f = null;
    }
    
    final void i(final Resources resources) {
        this.c.y(resources);
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        final c c = this.c;
        if (c != null) {
            c.p();
        }
        if (drawable == this.e && this.getCallback() != null) {
            this.getCallback().invalidateDrawable((Drawable)this);
        }
    }
    
    public boolean isAutoMirrored() {
        return this.c.C;
    }
    
    public void jumpToCurrentState() {
        final Drawable f = this.f;
        final int n = 1;
        int n2;
        if (f != null) {
            f.jumpToCurrentState();
            this.f = null;
            this.j = -1;
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final Drawable e = this.e;
        if (e != null) {
            e.jumpToCurrentState();
            if (this.h) {
                this.e.setAlpha(this.g);
            }
        }
        if (this.n != 0L) {
            this.n = 0L;
            n2 = 1;
        }
        if (this.m != 0L) {
            this.m = 0L;
            n2 = n;
        }
        if (n2 != 0) {
            this.invalidateSelf();
        }
    }
    
    public Drawable mutate() {
        if (!this.k && super.mutate() == this) {
            final c b = this.b();
            b.r();
            this.h(b);
            this.k = true;
        }
        return this;
    }
    
    protected void onBoundsChange(final Rect rect) {
        final Drawable f = this.f;
        if (f != null) {
            f.setBounds(rect);
        }
        final Drawable e = this.e;
        if (e != null) {
            e.setBounds(rect);
        }
    }
    
    public boolean onLayoutDirectionChanged(final int n) {
        return this.c.w(n, this.c());
    }
    
    protected boolean onLevelChange(final int n) {
        final Drawable f = this.f;
        if (f != null) {
            return f.setLevel(n);
        }
        final Drawable e = this.e;
        return e != null && e.setLevel(n);
    }
    
    public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        if (drawable == this.e && this.getCallback() != null) {
            this.getCallback().scheduleDrawable((Drawable)this, runnable, n);
        }
    }
    
    public void setAlpha(final int n) {
        if (!this.h || this.g != n) {
            this.h = true;
            this.g = n;
            final Drawable e = this.e;
            if (e != null) {
                if (this.m == 0L) {
                    e.setAlpha(n);
                }
                else {
                    this.a(false);
                }
            }
        }
    }
    
    public void setAutoMirrored(final boolean c) {
        final c c2 = this.c;
        if (c2.C != c) {
            c2.C = c;
            final Drawable e = this.e;
            if (e != null) {
                a.i(e, c);
            }
        }
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        final c c = this.c;
        c.E = true;
        if (c.D != colorFilter) {
            c.D = colorFilter;
            final Drawable e = this.e;
            if (e != null) {
                e.setColorFilter(colorFilter);
            }
        }
    }
    
    public void setDither(final boolean b) {
        final c c = this.c;
        if (c.x != b) {
            c.x = b;
            final Drawable e = this.e;
            if (e != null) {
                e.setDither(b);
            }
        }
    }
    
    public void setHotspot(final float n, final float n2) {
        final Drawable e = this.e;
        if (e != null) {
            a.j(e, n, n2);
        }
    }
    
    public void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
        final Rect d = this.d;
        if (d == null) {
            this.d = new Rect(n, n2, n3, n4);
        }
        else {
            d.set(n, n2, n3, n4);
        }
        final Drawable e = this.e;
        if (e != null) {
            a.k(e, n, n2, n3, n4);
        }
    }
    
    public void setTintList(final ColorStateList f) {
        final c c = this.c;
        c.H = true;
        if (c.F != f) {
            c.F = f;
            a.n(this.e, f);
        }
    }
    
    public void setTintMode(final PorterDuff$Mode g) {
        final c c = this.c;
        c.I = true;
        if (c.G != g) {
            c.G = g;
            a.o(this.e, g);
        }
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        final boolean setVisible = super.setVisible(b, b2);
        final Drawable f = this.f;
        if (f != null) {
            f.setVisible(b, b2);
        }
        final Drawable e = this.e;
        if (e != null) {
            e.setVisible(b, b2);
        }
        return setVisible;
    }
    
    public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        if (drawable == this.e && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable((Drawable)this, runnable);
        }
    }
    
    static class b implements Drawable$Callback
    {
        private Drawable$Callback c;
        
        public Drawable$Callback a() {
            final Drawable$Callback c = this.c;
            this.c = null;
            return c;
        }
        
        public b b(final Drawable$Callback c) {
            this.c = c;
            return this;
        }
        
        public void invalidateDrawable(final Drawable drawable) {
        }
        
        public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
            final Drawable$Callback c = this.c;
            if (c != null) {
                c.scheduleDrawable(drawable, runnable, n);
            }
        }
        
        public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
            final Drawable$Callback c = this.c;
            if (c != null) {
                c.unscheduleDrawable(drawable, runnable);
            }
        }
    }
    
    abstract static class c extends Drawable$ConstantState
    {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff$Mode G;
        boolean H;
        boolean I;
        final d a;
        Resources b;
        int c;
        int d;
        int e;
        SparseArray f;
        Drawable[] g;
        int h;
        boolean i;
        boolean j;
        Rect k;
        boolean l;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;
        
        c(final c c, final d a, final Resources resources) {
            this.c = 160;
            final int n = 0;
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = a;
            Resources b;
            if (resources != null) {
                b = resources;
            }
            else if (c != null) {
                b = c.b;
            }
            else {
                b = null;
            }
            this.b = b;
            int c2;
            if (c != null) {
                c2 = c.c;
            }
            else {
                c2 = 0;
            }
            final int f = d.f(resources, c2);
            this.c = f;
            if (c != null) {
                this.d = c.d;
                this.e = c.e;
                this.v = true;
                this.w = true;
                this.i = c.i;
                this.l = c.l;
                this.x = c.x;
                this.y = c.y;
                this.z = c.z;
                this.A = c.A;
                this.B = c.B;
                this.C = c.C;
                this.D = c.D;
                this.E = c.E;
                this.F = c.F;
                this.G = c.G;
                this.H = c.H;
                this.I = c.I;
                if (c.c == f) {
                    if (c.j) {
                        this.k = new Rect(c.k);
                        this.j = true;
                    }
                    if (c.m) {
                        this.n = c.n;
                        this.o = c.o;
                        this.p = c.p;
                        this.q = c.q;
                        this.m = true;
                    }
                }
                if (c.r) {
                    this.s = c.s;
                    this.r = true;
                }
                if (c.t) {
                    this.u = c.u;
                    this.t = true;
                }
                final Drawable[] g = c.g;
                this.g = new Drawable[g.length];
                this.h = c.h;
                final SparseArray f2 = c.f;
                SparseArray clone;
                if (f2 != null) {
                    clone = f2.clone();
                }
                else {
                    clone = new SparseArray(this.h);
                }
                this.f = clone;
                for (int h = this.h, i = n; i < h; ++i) {
                    final Drawable drawable = g[i];
                    if (drawable != null) {
                        final Drawable$ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f.put(i, (Object)constantState);
                        }
                        else {
                            this.g[i] = g[i];
                        }
                    }
                }
            }
            else {
                this.g = new Drawable[10];
                this.h = 0;
            }
        }
        
        private void e() {
            final SparseArray f = this.f;
            if (f != null) {
                for (int size = f.size(), i = 0; i < size; ++i) {
                    this.g[this.f.keyAt(i)] = this.s(((Drawable$ConstantState)this.f.valueAt(i)).newDrawable(this.b));
                }
                this.f = null;
            }
        }
        
        private Drawable s(Drawable mutate) {
            if (Build$VERSION.SDK_INT >= 23) {
                i.c.a(mutate, this.z);
            }
            mutate = mutate.mutate();
            mutate.setCallback((Drawable$Callback)this.a);
            return mutate;
        }
        
        public final int a(final Drawable drawable) {
            final int h = this.h;
            if (h >= this.g.length) {
                this.o(h, h + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback((Drawable$Callback)this.a);
            this.g[h] = drawable;
            ++this.h;
            this.e |= drawable.getChangingConfigurations();
            this.p();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return h;
        }
        
        final void b(final Resources$Theme resources$Theme) {
            if (resources$Theme != null) {
                this.e();
                final int h = this.h;
                final Drawable[] g = this.g;
                for (int i = 0; i < h; ++i) {
                    final Drawable drawable = g[i];
                    if (drawable != null && drawable.canApplyTheme()) {
                        g[i].applyTheme(resources$Theme);
                        this.e |= g[i].getChangingConfigurations();
                    }
                }
                this.y(resources$Theme.getResources());
            }
        }
        
        public boolean c() {
            synchronized (this) {
                if (this.v) {
                    return this.w;
                }
                this.e();
                this.v = true;
                final int h = this.h;
                final Drawable[] g = this.g;
                for (int i = 0; i < h; ++i) {
                    if (g[i].getConstantState() == null) {
                        return this.w = false;
                    }
                }
                return this.w = true;
            }
        }
        
        public boolean canApplyTheme() {
            final int h = this.h;
            final Drawable[] g = this.g;
            for (int i = 0; i < h; ++i) {
                final Drawable drawable = g[i];
                if (drawable != null) {
                    if (drawable.canApplyTheme()) {
                        return true;
                    }
                }
                else {
                    final Drawable$ConstantState drawable$ConstantState = (Drawable$ConstantState)this.f.get(i);
                    if (drawable$ConstantState != null && drawable$ConstantState.canApplyTheme()) {
                        return true;
                    }
                }
            }
            return false;
        }
        
        protected void d() {
            this.m = true;
            this.e();
            final int h = this.h;
            final Drawable[] g = this.g;
            this.o = -1;
            this.n = -1;
            int i = 0;
            this.q = 0;
            this.p = 0;
            while (i < h) {
                final Drawable drawable = g[i];
                final int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                final int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                final int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                final int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
                ++i;
            }
        }
        
        final int f() {
            return this.g.length;
        }
        
        public final Drawable g(final int n) {
            final Drawable drawable = this.g[n];
            if (drawable != null) {
                return drawable;
            }
            final SparseArray f = this.f;
            if (f != null) {
                final int indexOfKey = f.indexOfKey(n);
                if (indexOfKey >= 0) {
                    final Drawable s = this.s(((Drawable$ConstantState)this.f.valueAt(indexOfKey)).newDrawable(this.b));
                    this.g[n] = s;
                    this.f.removeAt(indexOfKey);
                    if (this.f.size() == 0) {
                        this.f = null;
                    }
                    return s;
                }
            }
            return null;
        }
        
        public int getChangingConfigurations() {
            return this.d | this.e;
        }
        
        public final int h() {
            return this.h;
        }
        
        public final int i() {
            if (!this.m) {
                this.d();
            }
            return this.o;
        }
        
        public final int j() {
            if (!this.m) {
                this.d();
            }
            return this.q;
        }
        
        public final int k() {
            if (!this.m) {
                this.d();
            }
            return this.p;
        }
        
        public final Rect l() {
            final boolean i = this.i;
            Rect k = null;
            if (i) {
                return null;
            }
            final Rect j = this.k;
            if (j == null && !this.j) {
                this.e();
                final Rect rect = new Rect();
                final int h = this.h;
                final Drawable[] g = this.g;
                Rect rect2;
                for (int l = 0; l < h; ++l, k = rect2) {
                    rect2 = k;
                    if (g[l].getPadding(rect)) {
                        Rect rect3;
                        if ((rect3 = k) == null) {
                            rect3 = new Rect(0, 0, 0, 0);
                        }
                        final int left = rect.left;
                        if (left > rect3.left) {
                            rect3.left = left;
                        }
                        final int top = rect.top;
                        if (top > rect3.top) {
                            rect3.top = top;
                        }
                        final int right = rect.right;
                        if (right > rect3.right) {
                            rect3.right = right;
                        }
                        final int bottom = rect.bottom;
                        rect2 = rect3;
                        if (bottom > rect3.bottom) {
                            rect3.bottom = bottom;
                            rect2 = rect3;
                        }
                    }
                }
                this.j = true;
                return this.k = k;
            }
            return j;
        }
        
        public final int m() {
            if (!this.m) {
                this.d();
            }
            return this.n;
        }
        
        public final int n() {
            if (this.r) {
                return this.s;
            }
            this.e();
            final int h = this.h;
            final Drawable[] g = this.g;
            int s;
            if (h > 0) {
                s = g[0].getOpacity();
            }
            else {
                s = -2;
            }
            for (int i = 1; i < h; ++i) {
                s = Drawable.resolveOpacity(s, g[i].getOpacity());
            }
            this.s = s;
            this.r = true;
            return s;
        }
        
        public void o(final int n, final int n2) {
            final Drawable[] g = new Drawable[n2];
            System.arraycopy((Object)this.g, 0, (Object)g, 0, n);
            this.g = g;
        }
        
        void p() {
            this.r = false;
            this.t = false;
        }
        
        public final boolean q() {
            return this.l;
        }
        
        abstract void r();
        
        public final void t(final boolean l) {
            this.l = l;
        }
        
        public final void u(final int a) {
            this.A = a;
        }
        
        public final void v(final int b) {
            this.B = b;
        }
        
        final boolean w(final int z, final int n) {
            final int h = this.h;
            final Drawable[] g = this.g;
            int i = 0;
            boolean b = false;
            while (i < h) {
                final Drawable drawable = g[i];
                boolean b2 = b;
                if (drawable != null) {
                    final boolean b3 = Build$VERSION.SDK_INT >= 23 && i.c.a(drawable, z);
                    b2 = b;
                    if (i == n) {
                        b2 = b3;
                    }
                }
                ++i;
                b = b2;
            }
            this.z = z;
            return b;
        }
        
        public final void x(final boolean i) {
            this.i = i;
        }
        
        final void y(final Resources b) {
            if (b != null) {
                this.b = b;
                if (this.c != (this.c = i.d.f(b, this.c))) {
                    this.m = false;
                    this.j = false;
                }
            }
        }
    }
}
