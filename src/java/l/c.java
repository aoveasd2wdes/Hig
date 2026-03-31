package l;

import java.lang.reflect.AccessibleObject;
import androidx.appcompat.widget.v0;
import androidx.appcompat.widget.t1;
import android.content.res.TypedArray;
import f.i;
import android.view.SubMenu;
import androidx.core.view.k;
import android.view.View;
import androidx.appcompat.view.menu.e;
import java.lang.reflect.Constructor;
import android.util.Log;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.Xml;
import r.a;
import android.view.Menu;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;
import android.view.MenuInflater;

public class c extends MenuInflater
{
    static final Class[] e;
    static final Class[] f;
    final Object[] a;
    final Object[] b;
    Context c;
    private Object d;
    
    static {
        f = (e = new Class[] { Context.class });
    }
    
    public c(final Context c) {
        super(c);
        this.c = c;
        final Object[] array = { c };
        this.a = array;
        this.b = array;
    }
    
    private Object a(final Object o) {
        if (o instanceof Activity) {
            return o;
        }
        Object a = o;
        if (o instanceof ContextWrapper) {
            a = this.a(((ContextWrapper)o).getBaseContext());
        }
        return a;
    }
    
    private void c(final XmlPullParser xmlPullParser, final AttributeSet set, final Menu menu) {
        final b b = new b(menu);
        int i = xmlPullParser.getEventType();
        String name3;
        while (true) {
            while (i != 2) {
                int n = xmlPullParser.next();
                if ((i = n) == 1) {
                    String s = null;
                    int j = 0;
                    int n2 = 0;
                    while (j == 0) {
                        if (n == 1) {
                            throw new RuntimeException("Unexpected end of document");
                        }
                        int n3;
                        int n4;
                        String name;
                        if (n != 2) {
                            if (n != 3) {
                                n3 = j;
                                n4 = n2;
                                name = s;
                            }
                            else {
                                final String name2 = xmlPullParser.getName();
                                if (n2 != 0 && name2.equals((Object)s)) {
                                    name = null;
                                    n4 = 0;
                                    n3 = j;
                                }
                                else if (name2.equals((Object)"group")) {
                                    b.h();
                                    n3 = j;
                                    n4 = n2;
                                    name = s;
                                }
                                else if (name2.equals((Object)"item")) {
                                    n3 = j;
                                    n4 = n2;
                                    name = s;
                                    if (!b.d()) {
                                        b.a();
                                        n3 = j;
                                        n4 = n2;
                                        name = s;
                                    }
                                }
                                else {
                                    n3 = j;
                                    n4 = n2;
                                    name = s;
                                    if (name2.equals((Object)"menu")) {
                                        n3 = 1;
                                        n4 = n2;
                                        name = s;
                                    }
                                }
                            }
                        }
                        else if (n2 != 0) {
                            n3 = j;
                            n4 = n2;
                            name = s;
                        }
                        else {
                            name = xmlPullParser.getName();
                            if (name.equals((Object)"group")) {
                                b.f(set);
                                n3 = j;
                                n4 = n2;
                                name = s;
                            }
                            else if (name.equals((Object)"item")) {
                                b.g(set);
                                n3 = j;
                                n4 = n2;
                                name = s;
                            }
                            else if (name.equals((Object)"menu")) {
                                this.c(xmlPullParser, set, (Menu)b.b());
                                n3 = j;
                                n4 = n2;
                                name = s;
                            }
                            else {
                                n4 = 1;
                                n3 = j;
                            }
                        }
                        final int next = xmlPullParser.next();
                        j = n3;
                        n2 = n4;
                        s = name;
                        n = next;
                    }
                    return;
                }
            }
            name3 = xmlPullParser.getName();
            if (name3.equals((Object)"menu")) {
                final int n = xmlPullParser.next();
                continue;
            }
            break;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expecting menu, got ");
        sb.append(name3);
        throw new RuntimeException(sb.toString());
    }
    
    Object b() {
        if (this.d == null) {
            this.d = this.a(this.c);
        }
        return this.d;
    }
    
    public void inflate(final int n, final Menu menu) {
        if (!(menu instanceof r.a)) {
            super.inflate(n, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                final XmlResourceParser xmlResourceParser = layout = this.c.getResources().getLayout(n);
                this.c((XmlPullParser)xmlResourceParser, Xml.asAttributeSet((XmlPullParser)xmlResourceParser), menu);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
            finally {
                if (layout != null) {
                    layout.close();
                }
            }
        }
        catch (final IOException ex) {}
        catch (final XmlPullParserException ex2) {}
    }
    
    private static class a implements MenuItem$OnMenuItemClickListener
    {
        private static final Class[] c;
        private Object a;
        private Method b;
        
        static {
            c = new Class[] { MenuItem.class };
        }
        
        public a(final Object a, final String name) {
            this.a = a;
            final Class<?> class1 = a.getClass();
            try {
                this.b = class1.getMethod(name, (Class<?>[])a.c);
            }
            catch (final Exception ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(name);
                sb.append(" in class ");
                sb.append(class1.getName());
                final InflateException ex2 = new InflateException(sb.toString());
                ((Throwable)ex2).initCause((Throwable)ex);
                throw ex2;
            }
        }
        
        public boolean onMenuItemClick(final MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return (boolean)this.b.invoke(this.a, new Object[] { menuItem });
                }
                this.b.invoke(this.a, new Object[] { menuItem });
                return true;
            }
            catch (final Exception ex) {
                throw new RuntimeException((Throwable)ex);
            }
        }
    }
    
    private class b
    {
        private CharSequence A;
        private CharSequence B;
        private ColorStateList C;
        private PorterDuff$Mode D;
        final c E;
        private Menu a;
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;
        
        public b(final c e, final Menu a) {
            this.E = e;
            this.C = null;
            this.D = null;
            this.a = a;
            this.h();
        }
        
        private char c(final String s) {
            if (s == null) {
                return '\0';
            }
            return s.charAt(0);
        }
        
        private Object e(final String name, final Class[] parameterTypes, final Object[] array) {
            try {
                final java.lang.reflect.Constructor<?> constructor = Class.forName(name, false, this.E.c.getClassLoader()).getConstructor((Class<?>[])parameterTypes);
                ((AccessibleObject)constructor).setAccessible(true);
                return constructor.newInstance(array);
            }
            catch (final Exception ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(name);
                Log.w("SupportMenuInflater", sb.toString(), (Throwable)ex);
                return null;
            }
        }
        
        private void i(final MenuItem menuItem) {
            final MenuItem setEnabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
            final int r = this.r;
            boolean b = false;
            setEnabled.setCheckable(r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            final int v = this.v;
            if (v >= 0) {
                menuItem.setShowAsAction(v);
            }
            if (this.z != null) {
                if (this.E.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)new a(this.E.b(), this.z));
            }
            final boolean b2 = menuItem instanceof e;
            if (b2) {
                final e e = (e)menuItem;
            }
            if (this.r >= 2 && b2) {
                ((e)menuItem).s(true);
            }
            final String x = this.x;
            if (x != null) {
                menuItem.setActionView((View)this.e(x, l.c.e, this.E.a));
                b = true;
            }
            final int w = this.w;
            if (w > 0) {
                if (!b) {
                    menuItem.setActionView(w);
                }
                else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            androidx.core.view.k.b(menuItem, this.A);
            androidx.core.view.k.f(menuItem, this.B);
            androidx.core.view.k.a(menuItem, this.n, this.o);
            androidx.core.view.k.e(menuItem, this.p, this.q);
            final PorterDuff$Mode d = this.D;
            if (d != null) {
                androidx.core.view.k.d(menuItem, d);
            }
            final ColorStateList c = this.C;
            if (c != null) {
                androidx.core.view.k.c(menuItem, c);
            }
        }
        
        public void a() {
            this.h = true;
            this.i(this.a.add(this.b, this.i, this.j, this.k));
        }
        
        public SubMenu b() {
            this.h = true;
            final SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            this.i(addSubMenu.getItem());
            return addSubMenu;
        }
        
        public boolean d() {
            return this.h;
        }
        
        public void f(final AttributeSet set) {
            final TypedArray obtainStyledAttributes = this.E.c.obtainStyledAttributes(set, f.i.L0);
            this.b = obtainStyledAttributes.getResourceId(f.i.N0, 0);
            this.c = obtainStyledAttributes.getInt(f.i.P0, 0);
            this.d = obtainStyledAttributes.getInt(f.i.Q0, 0);
            this.e = obtainStyledAttributes.getInt(f.i.R0, 0);
            this.f = obtainStyledAttributes.getBoolean(f.i.O0, true);
            this.g = obtainStyledAttributes.getBoolean(f.i.M0, true);
            obtainStyledAttributes.recycle();
        }
        
        public void g(final AttributeSet set) {
            final t1 q = t1.q(this.E.c, set, f.i.S0);
            this.i = q.l(f.i.V0, 0);
            this.j = ((q.i(f.i.Y0, this.c) & 0xFFFF0000) | (q.i(f.i.Z0, this.d) & 0xFFFF));
            this.k = q.n(f.i.a1);
            this.l = q.n(f.i.b1);
            this.m = q.l(f.i.T0, 0);
            this.n = this.c(q.m(f.i.c1));
            this.o = q.i(f.i.j1, 4096);
            this.p = this.c(q.m(f.i.d1));
            this.q = q.i(f.i.n1, 4096);
            int r;
            if (q.o(f.i.e1)) {
                r = (q.a(f.i.e1, false) ? 1 : 0);
            }
            else {
                r = this.e;
            }
            this.r = r;
            this.s = q.a(f.i.W0, false);
            this.t = q.a(f.i.X0, this.f);
            this.u = q.a(f.i.U0, this.g);
            this.v = q.i(f.i.o1, -1);
            this.z = q.m(f.i.f1);
            this.w = q.l(f.i.g1, 0);
            this.x = q.m(f.i.i1);
            final String m = q.m(f.i.h1);
            this.y = m;
            final boolean b = m != null;
            if (b && this.w == 0 && this.x == null) {
                l.d.a(this.e(m, l.c.f, this.E.b));
            }
            else if (b) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }
            this.A = q.n(f.i.k1);
            this.B = q.n(f.i.p1);
            if (q.o(f.i.m1)) {
                this.D = v0.e(q.i(f.i.m1, -1), this.D);
            }
            else {
                this.D = null;
            }
            if (q.o(f.i.l1)) {
                this.C = q.c(f.i.l1);
            }
            else {
                this.C = null;
            }
            q.s();
            this.h = false;
        }
        
        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
    }
}
