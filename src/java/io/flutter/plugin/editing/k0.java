package io.flutter.plugin.editing;

import android.view.autofill.AutofillId;
import android.view.ViewStructure;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import io.flutter.embedding.android.m0;
import java.util.HashMap;
import java.util.ArrayList;
import a3.b;
import j3.w$g;
import j3.w$d;
import j3.w$c;
import j3.w$b$a;
import android.os.Bundle;
import j3.w$f;
import androidx.appcompat.widget.m;
import android.os.Build$VERSION;
import j3.w$e;
import android.graphics.Rect;
import io.flutter.plugin.platform.z;
import android.view.inputmethod.InputConnection;
import android.util.SparseArray;
import j3.w$b;
import j3.w;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import android.view.View;

public class k0 implements n$b
{
    private final View a;
    private final InputMethodManager b;
    private final AutofillManager c;
    private final w d;
    private k0.k0$c e;
    private w$b f;
    private SparseArray g;
    private n h;
    private boolean i;
    private InputConnection j;
    private z k;
    private Rect l;
    private ImeSyncDeferringInsetsCallback m;
    private w$e n;
    private boolean o;
    
    public k0(final View a, final w d, final z k) {
        this.e = new k0.k0$c(k0$c$a.e, 0);
        this.a = a;
        AutofillManager a2 = null;
        this.h = new n((w$e)null, a);
        this.b = (InputMethodManager)a.getContext().getSystemService("input_method");
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            a2 = u.a(androidx.appcompat.widget.m.a(a.getContext(), t.a()));
        }
        this.c = a2;
        if (sdk_INT >= 30) {
            (this.m = new ImeSyncDeferringInsetsCallback(a)).install();
        }
        (this.d = d).n((w$f)new w$f(this) {
            final k0 a;
            
            public void a() {
                final k0 a = this.a;
                a.E(a.a);
            }
            
            public void b(final String s, final Bundle bundle) {
                this.a.A(s, bundle);
            }
            
            public void c() {
                this.a.l();
            }
            
            public void d(final int n, final w$b w$b) {
                this.a.C(n, w$b);
            }
            
            public void e(final int n, final boolean b) {
                this.a.B(n, b);
            }
            
            public void f(final double n, final double n2, final double[] array) {
                this.a.z(n, n2, array);
            }
            
            public void g() {
                this.a.w();
            }
            
            public void h(final w$e w$e) {
                final k0 a = this.a;
                a.D(a.a, w$e);
            }
            
            public void i(final boolean b) {
                if (Build$VERSION.SDK_INT >= 26) {
                    if (this.a.c != null) {
                        if (b) {
                            i0.a(this.a.c);
                        }
                        else {
                            j0.a(this.a.c);
                        }
                    }
                }
            }
            
            public void j() {
                if (this.a.e.a == k0$c$a.h) {
                    this.a.x();
                }
                else {
                    final k0 a = this.a;
                    a.r(a.a);
                }
            }
        });
        d.k();
        (this.k = k).D(this);
    }
    
    private void B(final int n, final boolean b) {
        if (b) {
            this.a.requestFocus();
            this.e = new k0.k0$c(k0$c$a.g, n);
            this.b.restartInput(this.a);
            this.i = false;
        }
        else {
            this.e = new k0.k0$c(k0$c$a.h, n);
            this.j = null;
        }
    }
    
    private void G(final w$b w$b) {
        if (Build$VERSION.SDK_INT < 26) {
            return;
        }
        if (w$b != null && w$b.j != null) {
            final w$b[] l = w$b.l;
            final SparseArray g = new SparseArray();
            this.g = g;
            if (l == null) {
                g.put(w$b.j.a.hashCode(), (Object)w$b);
            }
            else {
                for (final w$b w$b2 : l) {
                    final w$b$a j = w$b2.j;
                    if (j != null) {
                        this.g.put(j.a.hashCode(), (Object)w$b2);
                        x.a(this.c, this.a, j.a.hashCode(), b0.a((CharSequence)j.c.a));
                    }
                }
            }
            return;
        }
        this.g = null;
    }
    
    private static boolean m(final w$e w$e, final w$e w$e2) {
        final int n = w$e.e - w$e.d;
        if (n != w$e2.e - w$e2.d) {
            return true;
        }
        for (int i = 0; i < n; ++i) {
            if (w$e.a.charAt(w$e.d + i) != w$e2.a.charAt(w$e2.d + i)) {
                return true;
            }
        }
        return false;
    }
    
    private void r(final View view) {
        this.x();
        this.b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }
    
    private static int s(final w$c w$c, final boolean b, final boolean b2, final boolean b3, final boolean b4, final w$d w$d) {
        final w$g a = w$c.a;
        if (a == w$g.g) {
            return 4;
        }
        if (a == w$g.j) {
            int n;
            if (w$c.b) {
                n = 4098;
            }
            else {
                n = 2;
            }
            int n2 = n;
            if (w$c.c) {
                n2 = (n | 0x2000);
            }
            return n2;
        }
        if (a == w$g.k) {
            return 3;
        }
        if (a == w$g.p) {
            return 0;
        }
        int n3;
        if (a == w$g.l) {
            n3 = 131073;
        }
        else if (a == w$g.m) {
            n3 = 33;
        }
        else if (a == w$g.n) {
            n3 = 17;
        }
        else if (a == w$g.o) {
            n3 = 145;
        }
        else if (a == w$g.h) {
            n3 = 97;
        }
        else if (a == w$g.i) {
            n3 = 113;
        }
        else {
            n3 = 1;
        }
        int n4;
        if (b) {
            n4 = (n3 | 0x80000 | 0x80);
        }
        else {
            int n5 = n3;
            if (b2) {
                n5 = (n3 | 0x8000);
            }
            n4 = n5;
            if (!b3) {
                n4 = (n5 | 0x80000 | 0x90);
            }
        }
        int n6;
        if (w$d == w$d.f) {
            n6 = (n4 | 0x1000);
        }
        else if (w$d == w$d.g) {
            n6 = (n4 | 0x2000);
        }
        else {
            n6 = n4;
            if (w$d == w$d.h) {
                n6 = (n4 | 0x4000);
            }
        }
        return n6;
    }
    
    private boolean u() {
        return this.g != null;
    }
    
    private void v(final String s) {
        if (Build$VERSION.SDK_INT >= 26 && this.c != null) {
            if (this.u()) {
                x.a(this.c, this.a, this.f.j.a.hashCode(), b0.a((CharSequence)s));
            }
        }
    }
    
    private void w() {
        if (Build$VERSION.SDK_INT >= 26 && this.c != null) {
            if (this.u()) {
                final String a = this.f.j.a;
                final int[] array = new int[2];
                this.a.getLocationOnScreen(array);
                final Rect rect = new Rect(this.l);
                rect.offset(array[0], array[1]);
                y.a(this.c, this.a, a.hashCode(), rect);
            }
        }
    }
    
    private void x() {
        if (Build$VERSION.SDK_INT >= 26 && this.c != null) {
            final w$b f = this.f;
            if (f != null && f.j != null) {
                if (this.u()) {
                    s.a(this.c, this.a, this.f.j.a.hashCode());
                }
            }
        }
    }
    
    private void z(final double n, final double n2, final double[] array) {
        final double[] array2 = new double[4];
        final boolean b = array[3] == 0.0 && array[7] == 0.0 && array[15] == 1.0;
        final double n3 = array[12];
        final double n4 = array[15];
        array2[0] = (array2[1] = n3 / n4);
        array2[2] = (array2[3] = array[13] / n4);
        final k0$d k0$d = (k0$d)new k0$d(this, b, array, array2) {
            final boolean a;
            final double[] b;
            final double[] c;
            final k0 d;
            
            public void a(double n, final double n2) {
                final boolean a = this.a;
                double n3 = 1.0;
                if (!a) {
                    final double[] b = this.b;
                    n3 = 1.0 / (b[3] * n + b[7] * n2 + b[15]);
                }
                final double[] b2 = this.b;
                final double n4 = (b2[0] * n + b2[4] * n2 + b2[12]) * n3;
                n = (b2[1] * n + b2[5] * n2 + b2[13]) * n3;
                final double[] c = this.c;
                if (n4 < c[0]) {
                    c[0] = n4;
                }
                else if (n4 > c[1]) {
                    c[1] = n4;
                }
                if (n < c[2]) {
                    c[2] = n;
                }
                else if (n > c[3]) {
                    c[3] = n;
                }
            }
        };
        ((k0$d)k0$d).a(n, 0.0);
        ((k0$d)k0$d).a(n, n2);
        ((k0$d)k0$d).a(0.0, n2);
        final Float value = this.a.getContext().getResources().getDisplayMetrics().density;
        this.l = new Rect((int)(array2[0] * value), (int)(array2[2] * value), (int)Math.ceil(array2[1] * value), (int)Math.ceil(array2[3] * value));
    }
    
    public void A(final String s, final Bundle bundle) {
        this.b.sendAppPrivateCommand(this.a, s, bundle);
    }
    
    void C(final int n, final w$b f) {
        this.x();
        this.f = f;
        this.e = new k0.k0$c(k0$c$a.f, n);
        this.h.l((n$b)this);
        final w$b$a j = f.j;
        w$e c;
        if (j != null) {
            c = j.c;
        }
        else {
            c = null;
        }
        this.h = new n(c, this.a);
        this.G(f);
        this.i = true;
        this.F();
        this.l = null;
        this.h.a((n$b)this);
    }
    
    void D(final View view, final w$e n) {
        if (!this.i) {
            final w$e n2 = this.n;
            if (n2 != null && n2.b() && (this.i = m(this.n, n))) {
                a3.b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.n = n;
        this.h.n(n);
        if (this.i) {
            this.b.restartInput(view);
            this.i = false;
        }
    }
    
    void E(final View view) {
        final w$b f = this.f;
        if (f != null) {
            final w$c g = f.g;
            if (g != null) {
                if (g.a == w$g.p) {
                    this.r(view);
                    return;
                }
            }
        }
        view.requestFocus();
        this.b.showSoftInput(view, 0);
    }
    
    public void F() {
        if (this.e.a == k0$c$a.g) {
            this.o = false;
        }
    }
    
    public void a(final boolean b, final boolean b2, final boolean b3) {
        if (b) {
            this.v(this.h.toString());
        }
        final int i = this.h.i();
        final int h = this.h.h();
        final int g = this.h.g();
        final int f = this.h.f();
        final ArrayList e = this.h.e();
        boolean b4 = false;
        Label_0145: {
            Label_0142: {
                if (this.n != null) {
                    if (this.h.toString().equals((Object)this.n.a)) {
                        final w$e n = this.n;
                        if (i == n.b && h == n.c && g == n.d && f == n.e) {
                            break Label_0142;
                        }
                    }
                    b4 = false;
                    break Label_0145;
                }
            }
            b4 = true;
        }
        if (!b4) {
            final StringBuilder sb = new StringBuilder();
            sb.append("send EditingState to flutter: ");
            sb.append(this.h.toString());
            b.f("TextInputPlugin", sb.toString());
            if (this.f.e) {
                this.d.q(this.e.b, e);
                this.h.c();
            }
            else {
                this.d.p(this.e.b, this.h.toString(), i, h, g, f);
            }
            this.n = new w$e(this.h.toString(), i, h, g, f);
        }
        else {
            this.h.c();
        }
    }
    
    public void j(final SparseArray sparseArray) {
        if (Build$VERSION.SDK_INT < 26) {
            return;
        }
        final w$b f = this.f;
        if (f != null && this.g != null) {
            final w$b$a j = f.j;
            if (j != null) {
                final HashMap hashMap = new HashMap();
                for (int i = 0; i < sparseArray.size(); ++i) {
                    final w$b w$b = (w$b)this.g.get(sparseArray.keyAt(i));
                    if (w$b != null) {
                        final w$b$a k = w$b.j;
                        if (k != null) {
                            final String string = io.flutter.plugin.editing.w.a(v.a(sparseArray.valueAt(i))).toString();
                            final w$e w$e = new w$e(string, string.length(), string.length(), -1, -1);
                            if (k.a.equals((Object)j.a)) {
                                this.h.n(w$e);
                            }
                            else {
                                hashMap.put((Object)k.a, (Object)w$e);
                            }
                        }
                    }
                }
                this.d.r(this.e.b, hashMap);
            }
        }
    }
    
    public void k(final int n) {
        final k0.k0$c e = this.e;
        final k0$c$a a = e.a;
        if ((a == k0$c$a.g || a == k0$c$a.h) && e.b == n) {
            this.e = new k0.k0$c(k0$c$a.e, 0);
            this.x();
            this.b.hideSoftInputFromWindow(this.a.getApplicationWindowToken(), 0);
            this.b.restartInput(this.a);
            this.i = false;
        }
    }
    
    void l() {
        if (this.e.a == k0$c$a.g) {
            return;
        }
        this.h.l((n$b)this);
        this.x();
        this.G(this.f = null);
        this.e = new k0.k0$c(k0$c$a.e, 0);
        this.F();
        this.l = null;
        this.b.restartInput(this.a);
    }
    
    public InputConnection n(final View view, final m0 m0, final EditorInfo editorInfo) {
        final k0.k0$c e = this.e;
        final k0$c$a a = e.a;
        if (a == k0$c$a.e) {
            return this.j = null;
        }
        if (a == k0$c$a.h) {
            return null;
        }
        if (a != k0$c$a.g) {
            final w$b f = this.f;
            final int s = s(f.g, f.a, f.b, f.c, f.d, f.f);
            editorInfo.inputType = s;
            editorInfo.imeOptions = 33554432;
            if (Build$VERSION.SDK_INT >= 26 && !this.f.d) {
                editorInfo.imeOptions = (0x2000000 | 0x1000000);
            }
            final Integer h = this.f.h;
            int intValue;
            if (h == null) {
                if ((s & 0x20000) != 0x0) {
                    intValue = 1;
                }
                else {
                    intValue = 6;
                }
            }
            else {
                intValue = h;
            }
            final w$b f2 = this.f;
            final String i = f2.i;
            if (i != null) {
                editorInfo.actionLabel = (CharSequence)i;
                editorInfo.actionId = intValue;
            }
            editorInfo.imeOptions |= intValue;
            final String[] k = f2.k;
            if (k != null) {
                z.b.a(editorInfo, k);
            }
            final io.flutter.plugin.editing.m j = new io.flutter.plugin.editing.m(view, this.e.b, this.d, (io.flutter.plugin.editing.m.m$a)m0, this.h, editorInfo);
            editorInfo.initialSelStart = this.h.i();
            editorInfo.initialSelEnd = this.h.h();
            return this.j = (InputConnection)j;
        }
        if (this.o) {
            return this.j;
        }
        return this.j = this.k.d(e.b).onCreateInputConnection(editorInfo);
    }
    
    public void o() {
        this.k.Q();
        this.d.n((w$f)null);
        this.x();
        this.h.l((n$b)this);
        final ImeSyncDeferringInsetsCallback m = this.m;
        if (m != null) {
            m.remove();
        }
    }
    
    public InputMethodManager p() {
        return this.b;
    }
    
    public boolean q(final KeyEvent keyEvent) {
        if (this.p().isAcceptingText()) {
            final InputConnection j = this.j;
            if (j != null) {
                boolean b;
                if (j instanceof io.flutter.plugin.editing.m) {
                    b = ((io.flutter.plugin.editing.m)j).f(keyEvent);
                }
                else {
                    b = j.sendKeyEvent(keyEvent);
                }
                return b;
            }
        }
        return false;
    }
    
    public void t() {
        if (this.e.a == k0$c$a.g) {
            this.o = true;
        }
    }
    
    public void y(final ViewStructure viewStructure, int i) {
        if (Build$VERSION.SDK_INT >= 26) {
            if (this.u()) {
                final String a = this.f.j.a;
                final AutofillId a2 = q.a(viewStructure);
                int key;
                w$b$a j;
                ViewStructure a3;
                String[] b;
                String d;
                Rect l;
                for (i = 0; i < this.g.size(); ++i) {
                    key = this.g.keyAt(i);
                    j = ((w$b)this.g.valueAt(i)).j;
                    if (j != null) {
                        c0.a(viewStructure, 1);
                        a3 = d0.a(viewStructure, i);
                        e0.a(a3, a2, key);
                        b = j.b;
                        if (b.length > 0) {
                            f0.a(a3, b);
                        }
                        g0.a(a3, 1);
                        h0.a(a3, 0);
                        d = j.d;
                        if (d != null) {
                            r.a(a3, (CharSequence)d);
                        }
                        if (a.hashCode() == key) {
                            l = this.l;
                            if (l != null) {
                                a0.a(a3, l.left, l.top, 0, 0, l.width(), this.l.height());
                                io.flutter.plugin.editing.z.a(a3, b0.a((CharSequence)this.h));
                                continue;
                            }
                        }
                        a0.a(a3, 0, 0, 0, 0, 1, 1);
                        io.flutter.plugin.editing.z.a(a3, b0.a((CharSequence)j.c.a));
                    }
                }
            }
        }
    }
}
