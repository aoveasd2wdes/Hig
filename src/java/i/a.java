package i;

import android.util.StateSet;
import p.h;
import p.d;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.g;
import androidx.appcompat.widget.j1;
import androidx.core.content.res.k;
import org.xmlpull.v1.XmlPullParserException;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import android.content.res.Resources;
import androidx.core.graphics.drawable.b;

public class a extends f implements b
{
    private c r;
    private a.a$g s;
    private int t;
    private int u;
    private boolean v;
    
    public a() {
        this(null, null);
    }
    
    a(final c c, final Resources resources) {
        super((f$a)null);
        this.t = -1;
        this.u = -1;
        this.h((d$c)new c(c, this, resources));
        this.onStateChange(((Drawable)this).getState());
        this.jumpToCurrentState();
    }
    
    public static a l(final Context context, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final String name = xmlPullParser.getName();
        if (name.equals((Object)"animated-selector")) {
            final a a = new a();
            a.m(context, resources, xmlPullParser, set, resources$Theme);
            return a;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
    
    private void n(final Context context, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final int n = xmlPullParser.getDepth() + 1;
        while (true) {
            final int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            final int depth = xmlPullParser.getDepth();
            if (depth < n && next == 3) {
                break;
            }
            if (next != 2) {
                continue;
            }
            if (depth > n) {
                continue;
            }
            if (xmlPullParser.getName().equals((Object)"item")) {
                this.p(context, resources, xmlPullParser, set, resources$Theme);
            }
            else {
                if (!xmlPullParser.getName().equals((Object)"transition")) {
                    continue;
                }
                this.q(context, resources, xmlPullParser, set, resources$Theme);
            }
        }
    }
    
    private void o() {
        this.onStateChange(((Drawable)this).getState());
    }
    
    private int p(final Context context, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final TypedArray s = k.s(resources, resources$Theme, set, j.b.h);
        final int resourceId = s.getResourceId(j.b.i, 0);
        final int resourceId2 = s.getResourceId(j.b.j, -1);
        Drawable j;
        if (resourceId2 > 0) {
            j = j1.h().j(context, resourceId2);
        }
        else {
            j = null;
        }
        s.recycle();
        final int[] i = this.j(set);
        Object o = j;
        if (j == null) {
            int next;
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            }
            if (xmlPullParser.getName().equals((Object)"vector")) {
                o = g.c(resources, xmlPullParser, set, resources$Theme);
            }
            else {
                o = Drawable.createFromXmlInner(resources, xmlPullParser, set, resources$Theme);
            }
        }
        if (o != null) {
            return this.r.B(i, (Drawable)o, resourceId);
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(sb2.toString());
    }
    
    private int q(final Context context, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final TypedArray s = k.s(resources, resources$Theme, set, j.b.k);
        final int resourceId = s.getResourceId(j.b.n, -1);
        final int resourceId2 = s.getResourceId(j.b.m, -1);
        final int resourceId3 = s.getResourceId(j.b.l, -1);
        Drawable j;
        if (resourceId3 > 0) {
            j = j1.h().j(context, resourceId3);
        }
        else {
            j = null;
        }
        final boolean boolean1 = s.getBoolean(j.b.o, false);
        s.recycle();
        Object o = j;
        if (j == null) {
            int next;
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            }
            if (xmlPullParser.getName().equals((Object)"animated-vector")) {
                o = androidx.vectordrawable.graphics.drawable.b.a(context, resources, xmlPullParser, set, resources$Theme);
            }
            else {
                o = Drawable.createFromXmlInner(resources, xmlPullParser, set, resources$Theme);
            }
        }
        if (o == null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new XmlPullParserException(sb2.toString());
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.r.C(resourceId, resourceId2, (Drawable)o, boolean1);
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(xmlPullParser.getPositionDescription());
        sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
        throw new XmlPullParserException(sb3.toString());
    }
    
    private boolean r(final int n) {
        final a.a$g s = this.s;
        int u;
        if (s != null) {
            if (n == this.t) {
                return true;
            }
            if (n == this.u && s.a()) {
                s.b();
                this.t = this.u;
                this.u = n;
                return true;
            }
            u = this.t;
            s.d();
        }
        else {
            u = ((i.d)this).c();
        }
        this.s = null;
        this.u = -1;
        this.t = -1;
        final c r = this.r;
        final int e = r.E(u);
        final int e2 = r.E(n);
        if (e2 != 0) {
            if (e != 0) {
                final int g = r.G(e, e2);
                if (g < 0) {
                    return false;
                }
                final boolean i = r.I(e, e2);
                ((i.d)this).g(g);
                final Drawable current = this.getCurrent();
                Object s2;
                if (current instanceof AnimationDrawable) {
                    s2 = new a.a$e((AnimationDrawable)current, r.H(e, e2), i);
                }
                else if (current instanceof androidx.vectordrawable.graphics.drawable.b) {
                    s2 = new a.a$d((androidx.vectordrawable.graphics.drawable.b)current);
                }
                else {
                    if (!(current instanceof Animatable)) {
                        return false;
                    }
                    s2 = new a.a$b((Animatable)current);
                }
                ((a.a$g)s2).c();
                this.s = (a.a$g)s2;
                this.u = u;
                this.t = n;
                return true;
            }
        }
        return false;
    }
    
    private void s(final TypedArray typedArray) {
        final c r = this.r;
        ((d$c)r).d |= typedArray.getChangingConfigurations();
        ((d$c)r).x(typedArray.getBoolean(j.b.d, ((d$c)r).i));
        ((d$c)r).t(typedArray.getBoolean(j.b.e, ((d$c)r).l));
        ((d$c)r).u(typedArray.getInt(j.b.f, ((d$c)r).A));
        ((d$c)r).v(typedArray.getInt(j.b.g, ((d$c)r).B));
        this.setDither(typedArray.getBoolean(j.b.b, ((d$c)r).x));
    }
    
    void h(final d$c d$c) {
        super.h(d$c);
        if (d$c instanceof c) {
            this.r = (c)d$c;
        }
    }
    
    public boolean isStateful() {
        return true;
    }
    
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        final a.a$g s = this.s;
        if (s != null) {
            s.d();
            this.s = null;
            ((i.d)this).g(this.t);
            this.t = -1;
            this.u = -1;
        }
    }
    
    c k() {
        return new c(this.r, this, null);
    }
    
    public void m(final Context context, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final TypedArray s = k.s(resources, resources$Theme, set, j.b.a);
        this.setVisible(s.getBoolean(j.b.c, true), true);
        this.s(s);
        ((i.d)this).i(resources);
        s.recycle();
        this.n(context, resources, xmlPullParser, set, resources$Theme);
        this.o();
    }
    
    public Drawable mutate() {
        if (!this.v && super.mutate() == this) {
            this.r.r();
            this.v = true;
        }
        return (Drawable)this;
    }
    
    protected boolean onStateChange(final int[] state) {
        final int f = this.r.F(state);
        final boolean b = f != ((i.d)this).c() && (this.r(f) || ((i.d)this).g(f));
        final Drawable current = this.getCurrent();
        boolean b2 = b;
        if (current != null) {
            b2 = (b | current.setState(state));
        }
        return b2;
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        final boolean setVisible = super.setVisible(b, b2);
        final a.a$g s = this.s;
        if (s != null && (setVisible || b2)) {
            if (b) {
                s.c();
            }
            else {
                this.jumpToCurrentState();
            }
        }
        return setVisible;
    }
    
    static class c extends f$a
    {
        d K;
        h L;
        
        c(final c c, final a a, final Resources resources) {
            super((f$a)c, (f)a, resources);
            h l;
            if (c != null) {
                this.K = c.K;
                l = c.L;
            }
            else {
                this.K = new d();
                l = new h();
            }
            this.L = l;
        }
        
        private static long D(final int n, final int n2) {
            return (long)n2 | (long)n << 32;
        }
        
        int B(final int[] array, final Drawable drawable, final int n) {
            final int z = super.z(array, drawable);
            this.L.i(z, (Object)n);
            return z;
        }
        
        int C(final int n, final int n2, final Drawable drawable, final boolean b) {
            final int a = super.a(drawable);
            final long d = D(n, n2);
            long n3;
            if (b) {
                n3 = 8589934592L;
            }
            else {
                n3 = 0L;
            }
            final d k = this.K;
            final long n4 = a;
            k.a(d, (Object)(n4 | n3));
            if (b) {
                this.K.a(D(n2, n), (Object)(0x100000000L | n4 | n3));
            }
            return a;
        }
        
        int E(int intValue) {
            final int n = 0;
            if (intValue < 0) {
                intValue = n;
            }
            else {
                intValue = (int)this.L.g(intValue, (Object)0);
            }
            return intValue;
        }
        
        int F(final int[] array) {
            final int a = super.A(array);
            if (a >= 0) {
                return a;
            }
            return super.A(StateSet.WILD_CARD);
        }
        
        int G(final int n, final int n2) {
            return (int)(long)this.K.h(D(n, n2), (Object)(-1L));
        }
        
        boolean H(final int n, final int n2) {
            return ((long)this.K.h(D(n, n2), (Object)(-1L)) & 0x100000000L) != 0x0L;
        }
        
        boolean I(final int n, final int n2) {
            return ((long)this.K.h(D(n, n2), (Object)(-1L)) & 0x200000000L) != 0x0L;
        }
        
        public Drawable newDrawable() {
            return (Drawable)new a(this, null);
        }
        
        public Drawable newDrawable(final Resources resources) {
            return (Drawable)new a(this, resources);
        }
        
        void r() {
            this.K = this.K.c();
            this.L = this.L.c();
        }
    }
}
