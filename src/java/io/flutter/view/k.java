package io.flutter.view;

import java.nio.Buffer;
import android.os.BaseBundle;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.Arrays;
import android.text.style.TtsSpan$Builder;
import android.text.style.LocaleSpan;
import java.util.Locale;
import android.text.SpannableString;
import android.view.accessibility.AccessibilityRecord;
import android.view.WindowInsets;
import java.util.Map$Entry;
import java.util.Set;
import android.opengl.Matrix;
import java.util.HashSet;
import java.util.Iterator;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import java.nio.ByteBuffer;
import a3.b;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.graphics.Rect;
import android.app.Activity;
import t3.e;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.os.Build$VERSION;
import android.provider.Settings$Global;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import android.database.ContentObserver;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;
import j3.a$b;
import java.util.List;
import java.util.Map;
import android.content.ContentResolver;
import io.flutter.plugin.platform.t;
import android.view.accessibility.AccessibilityManager;
import j3.a;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

public class k extends AccessibilityNodeProvider
{
    private static final int A;
    private static int B;
    static int C;
    private static final int z;
    private final View a;
    private final a b;
    private final AccessibilityManager c;
    private final AccessibilityViewEmbedder d;
    private final t e;
    private final ContentResolver f;
    private final Map g;
    private final Map h;
    private l i;
    private Integer j;
    private Integer k;
    private int l;
    private l m;
    private l n;
    private l o;
    private final List p;
    private int q;
    private Integer r;
    private k s;
    private boolean t;
    private boolean u;
    private final a$b v;
    private final AccessibilityManager$AccessibilityStateChangeListener w;
    private final AccessibilityManager$TouchExplorationStateChangeListener x;
    private final ContentObserver y;
    
    static {
        z = (g.i.e | g.h.e | g.j.e | g.k.e);
        A = (i.f.e | i.g.e | i.h.e | i.j.e | i.k.e | i.l.e | i.m.e | i.n.e | i.v.e | i.w.e | i.A.e | i.C.e);
        k.B = 267386881;
        k.C = (g.u.e & g.v.e & g.n.e);
    }
    
    public k(final View view, final a a, final AccessibilityManager accessibilityManager, final ContentResolver contentResolver, final t t) {
        this(view, a, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), t);
    }
    
    public k(final View a, final a b, final AccessibilityManager c, final ContentResolver f, final AccessibilityViewEmbedder d, final t e) {
        this.g = (Map)new HashMap();
        this.h = (Map)new HashMap();
        this.l = 0;
        this.p = (List)new ArrayList();
        this.q = 0;
        this.r = 0;
        this.t = false;
        this.u = false;
        this.v = (a$b)new k$a(this);
        final AccessibilityManager$AccessibilityStateChangeListener w = (AccessibilityManager$AccessibilityStateChangeListener)new AccessibilityManager$AccessibilityStateChangeListener() {
            final k a;
            
            public void onAccessibilityStateChanged(final boolean b) {
                if (this.a.u) {
                    return;
                }
                final k a = this.a;
                if (b) {
                    a.b.g(this.a.v);
                    this.a.b.e();
                }
                else {
                    a.Y(false);
                    this.a.b.g(null);
                    this.a.b.d();
                }
                if (this.a.s != null) {
                    this.a.s.a(b, this.a.c.isTouchExplorationEnabled());
                }
            }
        };
        this.w = (AccessibilityManager$AccessibilityStateChangeListener)w;
        final ContentObserver y = new ContentObserver(new Handler()) {
            final k a;
            
            public void onChange(final boolean b) {
                this.onChange(b, null);
            }
            
            public void onChange(final boolean b, final Uri uri) {
                if (this.a.u) {
                    return;
                }
                if (Settings$Global.getFloat(this.a.f, "transition_animation_scale", 1.0f) == 0.0f) {
                    io.flutter.view.k.f(this.a, io.flutter.view.k.f.h.e);
                }
                else {
                    io.flutter.view.k.e(this.a, ~io.flutter.view.k.f.h.e);
                }
                this.a.V();
            }
        };
        this.y = y;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        this.e = e;
        ((AccessibilityManager$AccessibilityStateChangeListener)w).onAccessibilityStateChanged(c.isEnabled());
        c.addAccessibilityStateChangeListener((AccessibilityManager$AccessibilityStateChangeListener)w);
        final AccessibilityManager$TouchExplorationStateChangeListener x = (AccessibilityManager$TouchExplorationStateChangeListener)new AccessibilityManager$TouchExplorationStateChangeListener(this, c) {
            final AccessibilityManager a;
            final k b;
            
            public void onTouchExplorationStateChanged(final boolean b) {
                if (this.b.u) {
                    return;
                }
                if (!b) {
                    this.b.Y(false);
                    this.b.N();
                }
                if (this.b.s != null) {
                    this.b.s.a(this.a.isEnabled(), b);
                }
            }
        };
        (this.x = (AccessibilityManager$TouchExplorationStateChangeListener)x).onTouchExplorationStateChanged(c.isTouchExplorationEnabled());
        c.addTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)x);
        y.onChange(false);
        f.registerContentObserver(Settings$Global.getUriFor("transition_animation_scale"), false, (ContentObserver)y);
        if (Build$VERSION.SDK_INT >= 31) {
            this.Z();
        }
        e.b(this);
    }
    
    private l A() {
        return (l)this.g.get((Object)0);
    }
    
    private void B(final float n, final float n2, final boolean b) {
        if (this.g.isEmpty()) {
            return;
        }
        final l l = this.A().y0(new float[] { n, n2, 0.0f, 1.0f }, b);
        if (l != this.o) {
            if (l != null) {
                this.T(l.b, 128);
            }
            final l o = this.o;
            if (o != null) {
                this.T(o.b, 256);
            }
            this.o = l;
        }
    }
    
    private boolean D(final l l) {
        final boolean i = l.x0(io.flutter.view.k.i.q);
        boolean b = false;
        if (i) {
            return false;
        }
        if (l.t0() != null) {
            return true;
        }
        if ((l.d & ~io.flutter.view.k.C) != 0x0) {
            b = true;
        }
        return b;
    }
    
    private AccessibilityEvent I(final int n, final int n2) {
        final AccessibilityEvent h = this.H(n2);
        h.setPackageName((CharSequence)this.a.getContext().getPackageName());
        ((AccessibilityRecord)h).setSource(this.a, n);
        return h;
    }
    
    private void N() {
        final l o = this.o;
        if (o != null) {
            this.T(o.b, 256);
            this.o = null;
        }
    }
    
    private void O(final l l) {
        String f0;
        if ((f0 = l.p0()) == null) {
            f0 = " ";
        }
        if (Build$VERSION.SDK_INT >= 28) {
            this.X(f0);
        }
        else {
            final AccessibilityEvent i = this.I(l.b, 32);
            ((AccessibilityRecord)i).getText().add((Object)f0);
            this.U(i);
        }
    }
    
    private boolean P(final l l, final int n, final Bundle bundle, final boolean b) {
        final int int1 = ((BaseBundle)bundle).getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        final boolean boolean1 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        final int j = l.g;
        final int i = l.h;
        this.R(l, int1, b, boolean1);
        if (j != l.g || i != l.h) {
            String r;
            if (l.r != null) {
                r = l.r;
            }
            else {
                r = "";
            }
            final AccessibilityEvent k = this.I(l.b, 8192);
            ((AccessibilityRecord)k).getText().add((Object)r);
            ((AccessibilityRecord)k).setFromIndex(l.g);
            ((AccessibilityRecord)k).setToIndex(l.h);
            ((AccessibilityRecord)k).setItemCount(r.length());
            this.U(k);
        }
        if (int1 != 1) {
            if (int1 != 2) {
                if (int1 == 4 || int1 == 8 || int1 == 16) {
                    return true;
                }
            }
            else {
                if (b) {
                    final g y = io.flutter.view.k.g.y;
                    if (l.w0(y)) {
                        this.b.c(n, y, boolean1);
                        return true;
                    }
                }
                if (!b) {
                    final g z = io.flutter.view.k.g.z;
                    if (l.w0(z)) {
                        this.b.c(n, z, boolean1);
                        return true;
                    }
                }
            }
        }
        else {
            if (b) {
                final g o = io.flutter.view.k.g.o;
                if (l.w0(o)) {
                    this.b.c(n, o, boolean1);
                    return true;
                }
            }
            if (!b) {
                final g p4 = io.flutter.view.k.g.p;
                if (l.w0(p4)) {
                    this.b.c(n, p4, boolean1);
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean Q(final l l, final int n, final Bundle bundle) {
        String string;
        if (bundle != null && ((BaseBundle)bundle).containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) {
            string = ((BaseBundle)bundle).getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        }
        else {
            string = "";
        }
        this.b.c(n, io.flutter.view.k.g.A, string);
        l.r = string;
        l.s = null;
        return true;
    }
    
    private void R(final l l, int n, final boolean b, final boolean b2) {
        if (l.h >= 0) {
            if (l.g >= 0) {
                Label_0337: {
                    if (n != 1) {
                        while (true) {
                            Matcher matcher2 = null;
                            Label_0181: {
                                Matcher matcher = null;
                                Label_0125: {
                                    Label_0051: {
                                        if (n != 2) {
                                            if (n != 4) {
                                                if (n != 8 && n != 16) {
                                                    break Label_0337;
                                                }
                                                if (b) {
                                                    break Label_0051;
                                                }
                                            }
                                            else if (b && l.h < l.r.length()) {
                                                matcher = Pattern.compile("(?!^)(\\n)").matcher((CharSequence)l.r.substring(l.h));
                                                if (matcher.find()) {
                                                    break Label_0125;
                                                }
                                                break Label_0051;
                                            }
                                            else {
                                                if (b || l.h <= 0) {
                                                    break Label_0337;
                                                }
                                                matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher((CharSequence)l.r.substring(0, l.h));
                                                if (matcher2.find()) {
                                                    break Label_0181;
                                                }
                                            }
                                            l.h = 0;
                                            break Label_0337;
                                        }
                                        if (b && l.h < l.r.length()) {
                                            matcher = Pattern.compile("\\p{L}(\\b)").matcher((CharSequence)l.r.substring(l.h));
                                            matcher.find();
                                            if (matcher.find()) {
                                                break Label_0125;
                                            }
                                        }
                                        else {
                                            if (b || l.h <= 0) {
                                                break Label_0337;
                                            }
                                            matcher2 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher((CharSequence)l.r.substring(0, l.h));
                                            if (matcher2.find()) {
                                                break Label_0181;
                                            }
                                            break Label_0337;
                                        }
                                    }
                                    n = l.r.length();
                                    l.h = n;
                                    break Label_0337;
                                }
                                io.flutter.view.k.l.n(l, matcher.start(1));
                                break Label_0337;
                            }
                            n = matcher2.start(1);
                            continue;
                        }
                    }
                    if (b && l.h < l.r.length()) {
                        io.flutter.view.k.l.n(l, 1);
                    }
                    else if (!b && l.h > 0) {
                        io.flutter.view.k.l.o(l, 1);
                    }
                }
                if (!b2) {
                    l.g = l.h;
                }
            }
        }
    }
    
    private void U(final AccessibilityEvent accessibilityEvent) {
        if (!this.c.isEnabled()) {
            return;
        }
        this.a.getParent().requestSendAccessibilityEvent(this.a, accessibilityEvent);
    }
    
    private void V() {
        this.b.f(this.l);
    }
    
    private void W(final int n) {
        final AccessibilityEvent i = this.I(n, 2048);
        i.setContentChangeTypes(1);
        this.U(i);
    }
    
    private void X(final String s) {
        io.flutter.view.g.a(this.a, (CharSequence)s);
    }
    
    private void Y(final boolean t) {
        if (this.t == t) {
            return;
        }
        this.t = t;
        int l;
        if (t) {
            l = (this.l | io.flutter.view.k.f.f.e);
        }
        else {
            l = (this.l & ~io.flutter.view.k.f.f.e);
        }
        this.l = l;
        this.V();
    }
    
    private void Z() {
        final View a = this.a;
        if (a != null) {
            if (a.getResources() != null) {
                final int a2 = io.flutter.view.a.a(this.a.getResources().getConfiguration());
                int l;
                if (a2 != Integer.MAX_VALUE && a2 >= 300) {
                    l = (this.l | io.flutter.view.k.f.i.e);
                }
                else {
                    l = (this.l & ~io.flutter.view.k.f.i.e);
                }
                this.l = l;
                this.V();
            }
        }
    }
    
    private boolean b0(final l l) {
        return l.j > 0 && (C0(this.i, (e)new io.flutter.view.i(l)) || !C0(this.i, (e)new j()));
    }
    
    static /* synthetic */ int e(final k k, int l) {
        l &= k.l;
        return k.l = l;
    }
    
    private void e0(final l l) {
        l.R = null;
        if (l.i != -1) {
            final Integer j = this.j;
            if (j != null && this.d.platformViewOfNode(j) == this.e.d(l.i)) {
                this.T(this.j, 65536);
                this.j = null;
            }
        }
        if (l.i != -1) {
            final View d = this.e.d(l.i);
            if (d != null) {
                d.setImportantForAccessibility(4);
            }
        }
        final l i = this.i;
        if (i == l) {
            this.T(i.b, 65536);
            this.i = null;
        }
        if (this.m == l) {
            this.m = null;
        }
        if (this.o == l) {
            this.o = null;
        }
    }
    
    static /* synthetic */ int f(final k k, int l) {
        l |= k.l;
        return k.l = l;
    }
    
    private AccessibilityEvent u(int fromIndex, final String beforeText, final String s) {
        final AccessibilityEvent i = this.I(fromIndex, 16);
        ((AccessibilityRecord)i).setBeforeText((CharSequence)beforeText);
        ((AccessibilityRecord)i).getText().add((Object)s);
        for (fromIndex = 0; fromIndex < beforeText.length() && fromIndex < s.length() && beforeText.charAt(fromIndex) == s.charAt(fromIndex); ++fromIndex) {}
        if (fromIndex >= beforeText.length() && fromIndex >= s.length()) {
            return null;
        }
        ((AccessibilityRecord)i).setFromIndex(fromIndex);
        int n;
        int n2;
        for (n = beforeText.length() - 1, n2 = s.length() - 1; n >= fromIndex && n2 >= fromIndex && beforeText.charAt(n) == s.charAt(n2); --n, --n2) {}
        ((AccessibilityRecord)i).setRemovedCount(n - fromIndex + 1);
        ((AccessibilityRecord)i).setAddedCount(n2 - fromIndex + 1);
        return i;
    }
    
    private boolean v() {
        final Activity e = t3.i.e(this.a.getContext());
        boolean b2;
        final boolean b = b2 = false;
        if (e != null) {
            if (e.getWindow() == null) {
                b2 = b;
            }
            else {
                final int a = io.flutter.view.h.a(e.getWindow().getAttributes());
                if (a != 2) {
                    b2 = b;
                    if (a != 0) {
                        return b2;
                    }
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    private Rect x(final Rect rect) {
        final Rect rect2 = new Rect(rect);
        final int[] array = new int[2];
        this.a.getLocationOnScreen(array);
        rect2.offset(array[0], array[1]);
        return rect2;
    }
    
    private h y(final int n) {
        h h;
        if ((h = (h)this.h.get((Object)n)) == null) {
            h = new h();
            h.b = n;
            h.a = io.flutter.view.k.B + n;
            this.h.put((Object)n, (Object)h);
        }
        return h;
    }
    
    private l z(final int n) {
        l l;
        if ((l = (l)this.g.get((Object)n)) == null) {
            l = new l(this);
            l.b = n;
            this.g.put((Object)n, (Object)l);
        }
        return l;
    }
    
    public boolean C() {
        return this.c.isEnabled();
    }
    
    public boolean E() {
        return this.c.isTouchExplorationEnabled();
    }
    
    public AccessibilityEvent H(final int n) {
        return AccessibilityEvent.obtain(n);
    }
    
    public AccessibilityNodeInfo J(final View view) {
        return AccessibilityNodeInfo.obtain(view);
    }
    
    public AccessibilityNodeInfo K(final View view, final int n) {
        return AccessibilityNodeInfo.obtain(view, n);
    }
    
    public boolean L(final MotionEvent motionEvent) {
        return this.M(motionEvent, false);
    }
    
    public boolean M(final MotionEvent motionEvent, final boolean b) {
        if (!this.c.isTouchExplorationEnabled()) {
            return false;
        }
        if (this.g.isEmpty()) {
            return false;
        }
        final l l = this.A().y0(new float[] { motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f }, b);
        if (l != null && l.i != -1) {
            return !b && this.d.onAccessibilityHoverEvent(l.b, motionEvent);
        }
        if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
            if (motionEvent.getAction() != 10) {
                final StringBuilder sb = new StringBuilder();
                sb.append("unexpected accessibility hover event: ");
                sb.append((Object)motionEvent);
                b.a("flutter", sb.toString());
                return false;
            }
            this.N();
        }
        else {
            this.B(motionEvent.getX(), motionEvent.getY(), b);
        }
        return true;
    }
    
    public void S() {
        this.u = true;
        this.e.a();
        this.a0(null);
        this.c.removeAccessibilityStateChangeListener(this.w);
        this.c.removeTouchExplorationStateChangeListener(this.x);
        this.f.unregisterContentObserver(this.y);
        this.b.g(null);
    }
    
    public void T(final int n, final int n2) {
        if (!this.c.isEnabled()) {
            return;
        }
        this.U(this.I(n, n2));
    }
    
    public void a0(final k s) {
        this.s = s;
    }
    
    void c0(final ByteBuffer byteBuffer, final String[] array) {
        while (((Buffer)byteBuffer).hasRemaining()) {
            final h y = this.y(byteBuffer.getInt());
            y.c = byteBuffer.getInt();
            final int int1 = byteBuffer.getInt();
            final String s = null;
            String s2;
            if (int1 == -1) {
                s2 = null;
            }
            else {
                s2 = array[int1];
            }
            y.d = s2;
            final int int2 = byteBuffer.getInt();
            String s3;
            if (int2 == -1) {
                s3 = s;
            }
            else {
                s3 = array[int2];
            }
            y.e = s3;
        }
    }
    
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int n) {
        final boolean b = true;
        this.Y(true);
        if (n >= 65536) {
            return this.d.createAccessibilityNodeInfo(n);
        }
        if (n == -1) {
            final AccessibilityNodeInfo j = this.J(this.a);
            this.a.onInitializeAccessibilityNodeInfo(j);
            if (this.g.containsKey((Object)0)) {
                j.addChild(this.a, 0);
            }
            if (Build$VERSION.SDK_INT >= 24) {
                io.flutter.view.c.a(j, false);
            }
            return j;
        }
        final l l = (l)this.g.get((Object)n);
        if (l == null) {
            return null;
        }
        if (l.i == -1 || !this.e.c(l.i)) {
            final AccessibilityNodeInfo k = this.K(this.a, n);
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 24) {
                io.flutter.view.c.a(k, this.D(l));
            }
            final String s = "";
            k.setViewIdResourceName("");
            if (l.o != null) {
                k.setViewIdResourceName(l.o);
            }
            k.setPackageName((CharSequence)this.a.getContext().getPackageName());
            k.setClassName((CharSequence)"android.view.View");
            k.setSource(this.a, n);
            k.setFocusable(l.z0());
            final l m = this.m;
            if (m != null) {
                k.setFocused(m.b == n);
            }
            final l i = this.i;
            if (i != null) {
                k.setAccessibilityFocused(i.b == n);
            }
            final i j2 = io.flutter.view.k.i.j;
            if (l.x0(j2)) {
                k.setPassword(l.x0(io.flutter.view.k.i.p));
                final i z = io.flutter.view.k.i.z;
                if (!l.x0(z)) {
                    k.setClassName((CharSequence)"android.widget.EditText");
                }
                k.setEditable(l.x0(z) ^ true);
                if (l.g != -1 && l.h != -1) {
                    k.setTextSelection(l.g, l.h);
                }
                final l i2 = this.i;
                if (i2 != null && i2.b == n) {
                    k.setLiveRegion(1);
                }
                boolean b2;
                if (l.w0(io.flutter.view.k.g.o)) {
                    k.addAction(256);
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                int n2 = b2 ? 1 : 0;
                if (l.w0(io.flutter.view.k.g.p)) {
                    k.addAction(512);
                    n2 = ((b2 ? 1 : 0) | 0x1);
                }
                int n3 = n2;
                if (l.w0(io.flutter.view.k.g.y)) {
                    k.addAction(256);
                    n3 = (n2 | 0x2);
                }
                int movementGranularities = n3;
                if (l.w0(io.flutter.view.k.g.z)) {
                    k.addAction(512);
                    movementGranularities = (n3 | 0x2);
                }
                k.setMovementGranularities(movementGranularities);
                if (l.e >= 0) {
                    int length;
                    if (l.r == null) {
                        length = 0;
                    }
                    else {
                        length = l.r.length();
                    }
                    l.f;
                    l.e;
                    k.setMaxTextLength(length - l.f + l.e);
                }
            }
            if (l.w0(io.flutter.view.k.g.q)) {
                k.addAction(131072);
            }
            if (l.w0(io.flutter.view.k.g.r)) {
                k.addAction(16384);
            }
            if (l.w0(io.flutter.view.k.g.s)) {
                k.addAction(65536);
            }
            if (l.w0(io.flutter.view.k.g.t)) {
                k.addAction(32768);
            }
            if (l.w0(io.flutter.view.k.g.A)) {
                k.addAction(2097152);
            }
            if (l.x0(io.flutter.view.k.i.i) || l.x0(io.flutter.view.k.i.B)) {
                k.setClassName((CharSequence)"android.widget.Button");
            }
            if (l.x0(io.flutter.view.k.i.t)) {
                k.setClassName((CharSequence)"android.widget.ImageView");
            }
            if (l.w0(io.flutter.view.k.g.x)) {
                k.setDismissable(true);
                k.addAction(1048576);
            }
            if (l.R != null) {
                k.setParent(this.a, l.R.b);
            }
            else {
                k.setParent(this.a);
            }
            if (l.A != -1 && sdk_INT >= 22) {
                io.flutter.view.d.a(k, this.a, l.A);
            }
            final Rect f = l.m0();
            if (l.R != null) {
                final Rect f2 = l.R.m0();
                final Rect boundsInParent = new Rect(f);
                boundsInParent.offset(-f2.left, -f2.top);
                k.setBoundsInParent(boundsInParent);
            }
            else {
                k.setBoundsInParent(f);
            }
            k.setBoundsInScreen(this.x(f));
            k.setVisibleToUser(true);
            k.setEnabled(!l.x0(io.flutter.view.k.i.l) || l.x0(io.flutter.view.k.i.m));
            if (l.w0(io.flutter.view.k.g.f)) {
                if (l.V != null) {
                    k.addAction(new AccessibilityNodeInfo$AccessibilityAction(16, (CharSequence)l.V.e));
                }
                else {
                    k.addAction(16);
                }
                k.setClickable(true);
            }
            if (l.w0(io.flutter.view.k.g.g)) {
                if (l.W != null) {
                    k.addAction(new AccessibilityNodeInfo$AccessibilityAction(32, (CharSequence)l.W.e));
                }
                else {
                    k.addAction(32);
                }
                k.setLongClickable(true);
            }
            final g h = io.flutter.view.k.g.h;
            if (l.w0(h) || l.w0(io.flutter.view.k.g.j) || l.w0(io.flutter.view.k.g.i) || l.w0(io.flutter.view.k.g.k)) {
                k.setScrollable(true);
                Label_1300: {
                    if (l.x0(io.flutter.view.k.i.x)) {
                        String className = null;
                        Label_1293: {
                            AccessibilityNodeInfo$CollectionInfo collectionInfo;
                            if (!l.w0(h) && !l.w0(io.flutter.view.k.g.i)) {
                                if (!this.b0(l)) {
                                    className = "android.widget.ScrollView";
                                    break Label_1293;
                                }
                                collectionInfo = AccessibilityNodeInfo$CollectionInfo.obtain(l.j, 0, false);
                            }
                            else {
                                if (!this.b0(l)) {
                                    className = "android.widget.HorizontalScrollView";
                                    break Label_1293;
                                }
                                collectionInfo = AccessibilityNodeInfo$CollectionInfo.obtain(0, l.j, false);
                            }
                            k.setCollectionInfo(collectionInfo);
                            break Label_1300;
                        }
                        k.setClassName((CharSequence)className);
                    }
                }
                if (l.w0(h) || l.w0(io.flutter.view.k.g.j)) {
                    k.addAction(4096);
                }
                if (l.w0(io.flutter.view.k.g.i) || l.w0(io.flutter.view.k.g.k)) {
                    k.addAction(8192);
                }
            }
            final g l2 = io.flutter.view.k.g.l;
            if (l.w0(l2) || l.w0(io.flutter.view.k.g.m)) {
                k.setClassName((CharSequence)"android.widget.SeekBar");
                if (l.w0(l2)) {
                    k.addAction(4096);
                }
                if (l.w0(io.flutter.view.k.g.m)) {
                    k.addAction(8192);
                }
            }
            if (l.x0(io.flutter.view.k.i.u)) {
                k.setLiveRegion(1);
            }
            if (l.x0(j2)) {
                k.setText(l.s0());
                if (sdk_INT >= 28) {
                    io.flutter.view.e.a(k, l.r0());
                }
            }
            else if (!l.x0(io.flutter.view.k.i.q)) {
                Object contentDescription;
                final CharSequence charSequence = (CharSequence)(contentDescription = l.t0());
                if (sdk_INT < 28) {
                    contentDescription = charSequence;
                    if (l.z != null) {
                        Object o = s;
                        if (charSequence != null) {
                            o = charSequence;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append(o);
                        sb.append("\n");
                        sb.append(l.z);
                        contentDescription = sb.toString();
                    }
                }
                if (contentDescription != null) {
                    k.setContentDescription((CharSequence)contentDescription);
                }
            }
            if (sdk_INT >= 28 && l.z != null) {
                io.flutter.view.f.a(k, (CharSequence)l.z);
            }
            final boolean i3 = l.x0(io.flutter.view.k.i.f);
            final boolean i4 = l.x0(io.flutter.view.k.i.v);
            boolean checkable = b;
            if (!i3) {
                checkable = (i4 && b);
            }
            k.setCheckable(checkable);
            Label_1748: {
                String className2;
                if (i3) {
                    k.setChecked(l.x0(io.flutter.view.k.i.g));
                    if (l.x0(io.flutter.view.k.i.n)) {
                        className2 = "android.widget.RadioButton";
                    }
                    else {
                        className2 = "android.widget.CheckBox";
                    }
                }
                else {
                    if (!i4) {
                        break Label_1748;
                    }
                    k.setChecked(l.x0(io.flutter.view.k.i.w));
                    className2 = "android.widget.Switch";
                }
                k.setClassName((CharSequence)className2);
            }
            k.setSelected(l.x0(io.flutter.view.k.i.h));
            if (sdk_INT >= 28) {
                w.h.a(k, l.x0(io.flutter.view.k.i.o));
            }
            final l i5 = this.i;
            if (i5 != null && i5.b == n) {
                n = 128;
            }
            else {
                n = 64;
            }
            k.addAction(n);
            if (l.U != null) {
                for (final h h2 : l.U) {
                    k.addAction(new AccessibilityNodeInfo$AccessibilityAction(h2.a, (CharSequence)h2.d));
                }
            }
            for (final l l3 : l.S) {
                if (l3.x0(io.flutter.view.k.i.s)) {
                    continue;
                }
                if (l3.i != -1) {
                    final View d = this.e.d(l3.i);
                    if (!this.e.c(l3.i)) {
                        k.addChild(d);
                        continue;
                    }
                }
                k.addChild(this.a, l3.b);
            }
            return k;
        }
        final View d2 = this.e.d(l.i);
        if (d2 == null) {
            return null;
        }
        return this.d.getRootNode(d2, l.b, l.m0());
    }
    
    void d0(final ByteBuffer byteBuffer, final String[] array, final ByteBuffer[] array2) {
        final ArrayList list = new ArrayList();
        while (((Buffer)byteBuffer).hasRemaining()) {
            final l z = this.z(byteBuffer.getInt());
            z.F0(byteBuffer, array, array2);
            if (z.x0(io.flutter.view.k.i.s)) {
                continue;
            }
            if (z.x0(io.flutter.view.k.i.k)) {
                this.m = z;
            }
            if (z.C) {
                list.add((Object)z);
            }
            if (z.i == -1 || this.e.c(z.i)) {
                continue;
            }
            final View d = this.e.d(z.i);
            if (d == null) {
                continue;
            }
            d.setImportantForAccessibility(0);
        }
        final HashSet set = new HashSet();
        final l a = this.A();
        final ArrayList list2 = new ArrayList();
        if (a != null) {
            final float[] array3 = new float[16];
            Matrix.setIdentityM(array3, 0);
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 23 && (sdk_INT < 28 || this.v())) {
                final WindowInsets a2 = io.flutter.view.b.a(this.a);
                if (a2 != null) {
                    if (!this.r.equals((Object)a2.getSystemWindowInsetLeft())) {
                        a.Z = true;
                        a.X = true;
                    }
                    final Integer value = a2.getSystemWindowInsetLeft();
                    this.r = value;
                    Matrix.translateM(array3, 0, (float)value, 0.0f, 0.0f);
                }
            }
            a.E0(array3, (Set)set, false);
            a.g0((List)list2);
        }
        final Iterator iterator = ((List)list2).iterator();
        l l = null;
        while (iterator.hasNext()) {
            final l i = (l)iterator.next();
            if (!this.p.contains((Object)i.b)) {
                l = i;
            }
        }
        l j;
        if ((j = l) == null) {
            j = l;
            if (((List)list2).size() > 0) {
                j = (l)((List)list2).get(((List)list2).size() - 1);
            }
        }
        if (j != null && (j.b != this.q || ((List)list2).size() != this.p.size())) {
            this.q = j.b;
            this.O(j);
        }
        this.p.clear();
        final Iterator iterator2 = ((List)list2).iterator();
        while (iterator2.hasNext()) {
            this.p.add((Object)((l)iterator2.next()).b);
        }
        final Iterator iterator3 = this.g.entrySet().iterator();
        while (iterator3.hasNext()) {
            final l k = (l)((Map$Entry)iterator3.next()).getValue();
            if (!((Set)set).contains((Object)k)) {
                this.e0(k);
                iterator3.remove();
            }
        }
        this.W(0);
        for (final l m : list) {
            if (m.j0()) {
                final AccessibilityEvent i2 = this.I(m.b, 4096);
                final float t = m.l;
                float u = m.m;
                float n = t;
                if (Float.isInfinite(m.m)) {
                    n = t;
                    if (t > 70000.0f) {
                        n = 70000.0f;
                    }
                    u = 100000.0f;
                }
                float n4;
                float n5;
                if (Float.isInfinite(m.n)) {
                    final float n2 = u + 100000.0f;
                    float n3 = n;
                    if (n < -70000.0f) {
                        n3 = -70000.0f;
                    }
                    n4 = n3 + 100000.0f;
                    n5 = n2;
                }
                else {
                    n5 = u - m.n;
                    n4 = n - m.n;
                }
                if (!m.u0(io.flutter.view.k.g.j) && !m.u0(io.flutter.view.k.g.k)) {
                    if (m.u0(io.flutter.view.k.g.h) || m.u0(io.flutter.view.k.g.i)) {
                        ((AccessibilityRecord)i2).setScrollX((int)n4);
                        ((AccessibilityRecord)i2).setMaxScrollX((int)n5);
                    }
                }
                else {
                    ((AccessibilityRecord)i2).setScrollY((int)n4);
                    ((AccessibilityRecord)i2).setMaxScrollY((int)n5);
                }
                if (m.j > 0) {
                    ((AccessibilityRecord)i2).setItemCount(m.j);
                    ((AccessibilityRecord)i2).setFromIndex(m.k);
                    final Iterator iterator5 = m.T.iterator();
                    int n6 = 0;
                    while (iterator5.hasNext()) {
                        if (!((l)iterator5.next()).x0(io.flutter.view.k.i.s)) {
                            ++n6;
                        }
                    }
                    ((AccessibilityRecord)i2).setToIndex(m.k + n6 - 1);
                }
                this.U(i2);
            }
            if (m.x0(io.flutter.view.k.i.u) && m.i0()) {
                this.W(m.b);
            }
            final l i3 = this.i;
            if (i3 != null && i3.b == m.b) {
                final i h = io.flutter.view.k.i.h;
                if (!m.v0(h) && m.x0(h)) {
                    final AccessibilityEvent i4 = this.I(m.b, 4);
                    ((AccessibilityRecord)i4).getText().add((Object)m.p);
                    this.U(i4);
                }
            }
            final l m2 = this.m;
            Label_1063: {
                if (m2 != null && m2.b == m.b) {
                    final l n7 = this.n;
                    if (n7 == null || n7.b != this.m.b) {
                        this.n = this.m;
                        this.U(this.I(m.b, 8));
                        break Label_1063;
                    }
                }
                if (this.m == null) {
                    this.n = null;
                }
            }
            final l m3 = this.m;
            if (m3 != null && m3.b == m.b) {
                final i j2 = io.flutter.view.k.i.j;
                if (!m.v0(j2) || !m.x0(j2)) {
                    continue;
                }
                final l i5 = this.i;
                if (i5 != null && i5.b != this.m.b) {
                    continue;
                }
                final String c0 = m.K;
                String r = "";
                String c2;
                if (c0 != null) {
                    c2 = m.K;
                }
                else {
                    c2 = "";
                }
                if (m.r != null) {
                    r = m.r;
                }
                final AccessibilityEvent u2 = this.u(m.b, c2, r);
                if (u2 != null) {
                    this.U(u2);
                }
                if (m.F == m.g && m.G == m.h) {
                    continue;
                }
                final AccessibilityEvent i6 = this.I(m.b, 8192);
                ((AccessibilityRecord)i6).getText().add((Object)r);
                ((AccessibilityRecord)i6).setFromIndex(m.g);
                ((AccessibilityRecord)i6).setToIndex(m.h);
                ((AccessibilityRecord)i6).setItemCount(r.length());
                this.U(i6);
            }
        }
    }
    
    public AccessibilityNodeInfo findFocus(int n) {
    Label_0022_Outer:
        while (true) {
            while (true) {
                Label_0050: {
                    l l;
                    if (n != 1) {
                        if (n != 2) {
                            return null;
                        }
                        break Label_0050;
                    }
                    else {
                        l = this.m;
                        if (l == null) {
                            final Integer n2 = this.k;
                            if (n2 != null) {
                                break Label_0042;
                            }
                            break Label_0050;
                        }
                    }
                    n = l.b;
                    return this.createAccessibilityNodeInfo(n);
                    Integer n2 = null;
                    n = n2;
                    return this.createAccessibilityNodeInfo(n);
                }
                l l = this.i;
                if (l != null) {
                    continue;
                }
                break;
            }
            final Integer n2 = this.j;
            if (n2 != null) {
                continue Label_0022_Outer;
            }
            break;
        }
        return null;
    }
    
    public boolean performAction(final int n, int n2, final Bundle bundle) {
        if (n >= 65536) {
            final boolean performAction = this.d.performAction(n, n2, bundle);
            if (performAction && n2 == 128) {
                this.j = null;
            }
            return performAction;
        }
        final l i = (l)this.g.get((Object)n);
        final int n3 = 0;
        if (i == null) {
            return false;
        }
        switch (n2) {
            default: {
                final h h = (h)this.h.get((Object)(n2 - io.flutter.view.k.B));
                if (h != null) {
                    this.b.c(n, io.flutter.view.k.g.w, h.b);
                    return true;
                }
                return false;
            }
            case 16908342: {
                this.b.b(n, io.flutter.view.k.g.n);
                return true;
            }
            case 2097152: {
                return this.Q(i, n, bundle);
            }
            case 1048576: {
                this.b.b(n, io.flutter.view.k.g.x);
                return true;
            }
            case 131072: {
                final HashMap hashMap = new HashMap();
                n2 = n3;
                if (bundle != null) {
                    n2 = n3;
                    if (((BaseBundle)bundle).containsKey("ACTION_ARGUMENT_SELECTION_START_INT")) {
                        n2 = n3;
                        if (((BaseBundle)bundle).containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                            n2 = 1;
                        }
                    }
                }
                if (n2 != 0) {
                    ((Map)hashMap).put((Object)"base", (Object)((BaseBundle)bundle).getInt("ACTION_ARGUMENT_SELECTION_START_INT"));
                    n2 = ((BaseBundle)bundle).getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                }
                else {
                    ((Map)hashMap).put((Object)"base", (Object)i.h);
                    n2 = i.h;
                }
                ((Map)hashMap).put((Object)"extent", (Object)n2);
                this.b.c(n, io.flutter.view.k.g.q, hashMap);
                final l l = (l)this.g.get((Object)n);
                l.g = (int)((Map)hashMap).get((Object)"base");
                l.h = (int)((Map)hashMap).get((Object)"extent");
                return true;
            }
            case 65536: {
                this.b.b(n, io.flutter.view.k.g.s);
                return true;
            }
            case 32768: {
                this.b.b(n, io.flutter.view.k.g.t);
                return true;
            }
            case 16384: {
                this.b.b(n, io.flutter.view.k.g.r);
                return true;
            }
            case 8192: {
                g g = io.flutter.view.k.g.k;
                if (!i.w0(g)) {
                    g = io.flutter.view.k.g.i;
                    if (!i.w0(g)) {
                        g = io.flutter.view.k.g.m;
                        if (!i.w0(g)) {
                            return false;
                        }
                        i.r = i.v;
                        i.s = i.w;
                        this.T(n, 4);
                    }
                }
                this.b.b(n, g);
                return true;
            }
            case 4096: {
                g g2 = io.flutter.view.k.g.j;
                if (!i.w0(g2)) {
                    g2 = io.flutter.view.k.g.h;
                    if (!i.w0(g2)) {
                        g2 = io.flutter.view.k.g.l;
                        if (!i.w0(g2)) {
                            return false;
                        }
                        i.r = i.t;
                        i.s = i.u;
                        this.T(n, 4);
                    }
                }
                this.b.b(n, g2);
                return true;
            }
            case 512: {
                return this.P(i, n, bundle, false);
            }
            case 256: {
                return this.P(i, n, bundle, true);
            }
            case 128: {
                final l j = this.i;
                if (j != null && j.b == n) {
                    this.i = null;
                }
                final Integer k = this.j;
                if (k != null && k == n) {
                    this.j = null;
                }
                this.b.b(n, io.flutter.view.k.g.v);
                this.T(n, 65536);
                return true;
            }
            case 64: {
                if (this.i == null) {
                    this.a.invalidate();
                }
                this.i = i;
                this.b.b(n, io.flutter.view.k.g.u);
                final HashMap hashMap2 = new HashMap();
                hashMap2.put((Object)"type", (Object)"didGainFocus");
                hashMap2.put((Object)"nodeId", (Object)i.b);
                this.b.a.c(hashMap2);
                this.T(n, 32768);
                if (i.w0(io.flutter.view.k.g.l) || i.w0(io.flutter.view.k.g.m)) {
                    this.T(n, 4);
                }
                return true;
            }
            case 32: {
                this.b.b(n, io.flutter.view.k.g.g);
                return true;
            }
            case 16: {
                this.b.b(n, io.flutter.view.k.g.f);
                return true;
            }
        }
    }
    
    public boolean w(final View view, final View view2, final AccessibilityEvent accessibilityEvent) {
        if (!this.d.requestSendAccessibilityEvent(view, view2, accessibilityEvent)) {
            return false;
        }
        final Integer recordFlutterId = this.d.getRecordFlutterId(view, (AccessibilityRecord)accessibilityEvent);
        if (recordFlutterId == null) {
            return false;
        }
        final int eventType = accessibilityEvent.getEventType();
        if (eventType != 8) {
            if (eventType != 128) {
                if (eventType != 32768) {
                    if (eventType == 65536) {
                        this.k = null;
                        this.j = null;
                    }
                }
                else {
                    this.j = recordFlutterId;
                    this.i = null;
                }
            }
            else {
                this.o = null;
            }
        }
        else {
            this.k = recordFlutterId;
            this.m = null;
        }
        return true;
    }
    
    private enum f
    {
        f("ACCESSIBLE_NAVIGATION", 0, 1), 
        g("INVERT_COLORS", 1, 2), 
        h("DISABLE_ANIMATIONS", 2, 4), 
        i("BOLD_TEXT", 3, 8), 
        j("REDUCE_MOTION", 4, 16), 
        k("HIGH_CONTRAST", 5, 32), 
        l("ON_OFF_SWITCH_LABELS", 6, 64);
        
        private static final f[] m;
        final int e;
        
        static {
            m = a();
        }
        
        private f(final String s, final int n, final int e) {
            this.e = e;
        }
        
        private static /* synthetic */ f[] a() {
            return new f[] { f.f, f.g, f.h, f.i, f.j, f.k, f.l };
        }
    }
    
    public enum g
    {
        A("SET_TEXT", 21, 2097152), 
        B("FOCUS", 22, 4194304);
        
        private static final g[] C;
        
        f("TAP", 0, 1), 
        g("LONG_PRESS", 1, 2), 
        h("SCROLL_LEFT", 2, 4), 
        i("SCROLL_RIGHT", 3, 8), 
        j("SCROLL_UP", 4, 16), 
        k("SCROLL_DOWN", 5, 32), 
        l("INCREASE", 6, 64), 
        m("DECREASE", 7, 128), 
        n("SHOW_ON_SCREEN", 8, 256), 
        o("MOVE_CURSOR_FORWARD_BY_CHARACTER", 9, 512), 
        p("MOVE_CURSOR_BACKWARD_BY_CHARACTER", 10, 1024), 
        q("SET_SELECTION", 11, 2048), 
        r("COPY", 12, 4096), 
        s("CUT", 13, 8192), 
        t("PASTE", 14, 16384), 
        u("DID_GAIN_ACCESSIBILITY_FOCUS", 15, 32768), 
        v("DID_LOSE_ACCESSIBILITY_FOCUS", 16, 65536), 
        w("CUSTOM_ACTION", 17, 131072), 
        x("DISMISS", 18, 262144), 
        y("MOVE_CURSOR_FORWARD_BY_WORD", 19, 524288), 
        z("MOVE_CURSOR_BACKWARD_BY_WORD", 20, 1048576);
        
        public final int e;
        
        static {
            C = a();
        }
        
        private g(final String s, final int n, final int e) {
            this.e = e;
        }
        
        private static /* synthetic */ g[] a() {
            return new g[] { g.f, g.g, g.h, g.i, g.j, g.k, g.l, g.m, g.n, g.o, g.p, g.q, g.r, g.s, g.t, g.u, g.v, g.w, g.x, g.y, g.z, g.A, g.B };
        }
    }
    
    private static class h
    {
        private int a;
        private int b;
        private int c;
        private String d;
        private String e;
        
        h() {
            this.a = -1;
            this.b = -1;
            this.c = -1;
        }
    }
    
    enum i
    {
        A("IS_FOCUSABLE", 21, 2097152), 
        B("IS_LINK", 22, 4194304), 
        C("IS_SLIDER", 23, 8388608), 
        D("IS_KEYBOARD_KEY", 24, 16777216), 
        E("IS_CHECK_STATE_MIXED", 25, 33554432), 
        F("HAS_EXPANDED_STATE", 26, 67108864), 
        G("IS_EXPANDED", 27, 134217728);
        
        private static final i[] H;
        
        f("HAS_CHECKED_STATE", 0, 1), 
        g("IS_CHECKED", 1, 2), 
        h("IS_SELECTED", 2, 4), 
        i("IS_BUTTON", 3, 8), 
        j("IS_TEXT_FIELD", 4, 16), 
        k("IS_FOCUSED", 5, 32), 
        l("HAS_ENABLED_STATE", 6, 64), 
        m("IS_ENABLED", 7, 128), 
        n("IS_IN_MUTUALLY_EXCLUSIVE_GROUP", 8, 256), 
        o("IS_HEADER", 9, 512), 
        p("IS_OBSCURED", 10, 1024), 
        q("SCOPES_ROUTE", 11, 2048), 
        r("NAMES_ROUTE", 12, 4096), 
        s("IS_HIDDEN", 13, 8192), 
        t("IS_IMAGE", 14, 16384), 
        u("IS_LIVE_REGION", 15, 32768), 
        v("HAS_TOGGLED_STATE", 16, 65536), 
        w("IS_TOGGLED", 17, 131072), 
        x("HAS_IMPLICIT_SCROLLING", 18, 262144), 
        y("IS_MULTILINE", 19, 524288), 
        z("IS_READ_ONLY", 20, 1048576);
        
        final int e;
        
        static {
            H = a();
        }
        
        private i(final String s, final int n, final int e) {
            this.e = e;
        }
        
        private static /* synthetic */ i[] a() {
            return new i[] { i.f, i.g, i.h, i.i, i.j, i.k, i.l, i.m, i.n, i.o, i.p, i.q, i.r, i.s, i.t, i.u, i.v, i.w, i.x, i.y, i.z, i.A, i.B, i.C, i.D, i.E, i.F, i.G };
        }
    }
    
    public interface k
    {
        void a(final boolean p0, final boolean p1);
    }
    
    private static class l
    {
        private int A;
        private p B;
        private boolean C;
        private int D;
        private int E;
        private int F;
        private int G;
        private float H;
        private float I;
        private float J;
        private String K;
        private String L;
        private float M;
        private float N;
        private float O;
        private float P;
        private float[] Q;
        private l R;
        private List S;
        private List T;
        private List U;
        private h V;
        private h W;
        private boolean X;
        private float[] Y;
        private boolean Z;
        final k a;
        private float[] a0;
        private int b;
        private Rect b0;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private float l;
        private float m;
        private float n;
        private String o;
        private String p;
        private List q;
        private String r;
        private List s;
        private String t;
        private List u;
        private String v;
        private List w;
        private String x;
        private List y;
        private String z;
        
        l(final k a) {
            this.b = -1;
            this.A = -1;
            this.C = false;
            this.S = (List)new ArrayList();
            this.T = (List)new ArrayList();
            this.X = true;
            this.Z = true;
            this.a = a;
        }
        
        private float A0(final float n, final float n2, final float n3, final float n4) {
            return Math.max(n, Math.max(n2, Math.max(n3, n4)));
        }
        
        private float B0(final float n, final float n2, final float n3, final float n4) {
            return Math.min(n, Math.min(n2, Math.min(n3, n4)));
        }
        
        private static boolean C0(final l l, final e e) {
            return l != null && l.l0(e) != null;
        }
        
        private void D0(final float[] array, final float[] array2, final float[] array3) {
            Matrix.multiplyMV(array, 0, array2, 0, array3, 0);
            final float n = array[3];
            array[0] /= n;
            array[1] /= n;
            array[2] /= n;
            array[3] = 0.0f;
        }
        
        private void E0(float[] array, final Set set, boolean b) {
            set.add((Object)this);
            if (this.Z) {
                b = true;
            }
            if (b) {
                if (this.a0 == null) {
                    this.a0 = new float[16];
                }
                if (this.Q == null) {
                    this.Q = new float[16];
                }
                Matrix.multiplyMM(this.a0, 0, array, 0, this.Q, 0);
                array = new float[] { 0.0f, 0.0f, 0.0f, 1.0f };
                final float[] array2 = new float[4];
                final float[] array3 = new float[4];
                final float[] array4 = new float[4];
                final float[] array5 = new float[4];
                array[0] = this.M;
                array[1] = this.N;
                this.D0(array2, this.a0, array);
                array[0] = this.O;
                array[1] = this.N;
                this.D0(array3, this.a0, array);
                array[0] = this.O;
                array[1] = this.P;
                this.D0(array4, this.a0, array);
                array[0] = this.M;
                array[1] = this.P;
                this.D0(array5, this.a0, array);
                if (this.b0 == null) {
                    this.b0 = new Rect();
                }
                this.b0.set(Math.round(this.B0(array2[0], array3[0], array4[0], array5[0])), Math.round(this.B0(array2[1], array3[1], array4[1], array5[1])), Math.round(this.A0(array2[0], array3[0], array4[0], array5[0])), Math.round(this.A0(array2[1], array3[1], array4[1], array5[1])));
                this.Z = false;
            }
            final Iterator iterator = this.S.iterator();
            int b2 = -1;
            while (iterator.hasNext()) {
                final l l = (l)iterator.next();
                l.A = b2;
                b2 = l.b;
                l.E0(this.a0, set, b);
            }
        }
        
        private void F0(final ByteBuffer byteBuffer, final String[] array, final ByteBuffer[] array2) {
            this.C = true;
            this.K = this.r;
            this.L = this.p;
            this.D = this.c;
            this.E = this.d;
            this.F = this.g;
            this.G = this.h;
            this.H = this.l;
            this.I = this.m;
            this.J = this.n;
            this.c = byteBuffer.getInt();
            this.d = byteBuffer.getInt();
            this.e = byteBuffer.getInt();
            this.f = byteBuffer.getInt();
            this.g = byteBuffer.getInt();
            this.h = byteBuffer.getInt();
            this.i = byteBuffer.getInt();
            this.j = byteBuffer.getInt();
            this.k = byteBuffer.getInt();
            this.l = byteBuffer.getFloat();
            this.m = byteBuffer.getFloat();
            this.n = byteBuffer.getFloat();
            final int int1 = byteBuffer.getInt();
            String o;
            if (int1 == -1) {
                o = null;
            }
            else {
                o = array[int1];
            }
            this.o = o;
            final int int2 = byteBuffer.getInt();
            String p3;
            if (int2 == -1) {
                p3 = null;
            }
            else {
                p3 = array[int2];
            }
            this.p = p3;
            this.q = this.q0(byteBuffer, array2);
            final int int3 = byteBuffer.getInt();
            String r;
            if (int3 == -1) {
                r = null;
            }
            else {
                r = array[int3];
            }
            this.r = r;
            this.s = this.q0(byteBuffer, array2);
            final int int4 = byteBuffer.getInt();
            String t;
            if (int4 == -1) {
                t = null;
            }
            else {
                t = array[int4];
            }
            this.t = t;
            this.u = this.q0(byteBuffer, array2);
            final int int5 = byteBuffer.getInt();
            String v;
            if (int5 == -1) {
                v = null;
            }
            else {
                v = array[int5];
            }
            this.v = v;
            this.w = this.q0(byteBuffer, array2);
            final int int6 = byteBuffer.getInt();
            String x;
            if (int6 == -1) {
                x = null;
            }
            else {
                x = array[int6];
            }
            this.x = x;
            this.y = this.q0(byteBuffer, array2);
            final int int7 = byteBuffer.getInt();
            String z;
            if (int7 == -1) {
                z = null;
            }
            else {
                z = array[int7];
            }
            this.z = z;
            this.B = io.flutter.view.k.p.b(byteBuffer.getInt());
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            this.P = byteBuffer.getFloat();
            if (this.Q == null) {
                this.Q = new float[16];
            }
            final int n = 0;
            for (int i = 0; i < 16; ++i) {
                this.Q[i] = byteBuffer.getFloat();
            }
            this.X = true;
            this.Z = true;
            final int int8 = byteBuffer.getInt();
            this.S.clear();
            this.T.clear();
            for (int j = 0; j < int8; ++j) {
                final l o2 = this.a.z(byteBuffer.getInt());
                o2.R = this;
                this.S.add((Object)o2);
            }
            for (int k = 0; k < int8; ++k) {
                final l o3 = this.a.z(byteBuffer.getInt());
                o3.R = this;
                this.T.add((Object)o3);
            }
            final int int9 = byteBuffer.getInt();
            if (int9 == 0) {
                this.U = null;
            }
            else {
                final List u = this.U;
                int l;
                if (u == null) {
                    this.U = (List)new ArrayList(int9);
                    l = n;
                }
                else {
                    u.clear();
                    l = n;
                }
                while (l < int9) {
                    final h p4 = this.a.y(byteBuffer.getInt());
                    if (p4.c == io.flutter.view.k.g.f.e) {
                        this.V = p4;
                    }
                    else if (p4.c == io.flutter.view.k.g.g.e) {
                        this.W = p4;
                    }
                    else {
                        this.U.add((Object)p4);
                    }
                    this.U.add((Object)p4);
                    ++l;
                }
            }
        }
        
        private void g0(final List list) {
            if (this.x0(io.flutter.view.k.i.q)) {
                list.add((Object)this);
            }
            final Iterator iterator = this.S.iterator();
            while (iterator.hasNext()) {
                ((l)iterator.next()).g0(list);
            }
        }
        
        private SpannableString h0(final String s, final List list) {
            if (s == null) {
                return null;
            }
            final SpannableString spannableString = new SpannableString((CharSequence)s);
            if (list != null) {
                for (final n n : list) {
                    final int n2 = k$e.a[n.c.ordinal()];
                    if (n2 != 1) {
                        if (n2 != 2) {
                            continue;
                        }
                        spannableString.setSpan((Object)new LocaleSpan(Locale.forLanguageTag(((k$j)n).d)), n.a, n.b, 0);
                    }
                    else {
                        spannableString.setSpan((Object)new TtsSpan$Builder("android.type.verbatim").build(), n.a, n.b, 0);
                    }
                }
            }
            return spannableString;
        }
        
        private boolean i0() {
            final String p = this.p;
            boolean b = false;
            if (p == null && this.L == null) {
                return false;
            }
            if (p != null) {
                final String l = this.L;
                if (l != null && p.equals((Object)l)) {
                    return b;
                }
            }
            b = true;
            return b;
        }
        
        private boolean j0() {
            return !Float.isNaN(this.l) && !Float.isNaN(this.H) && this.H != this.l;
        }
        
        private void k0() {
            if (!this.X) {
                return;
            }
            this.X = false;
            if (this.Y == null) {
                this.Y = new float[16];
            }
            if (!Matrix.invertM(this.Y, 0, this.Q, 0)) {
                Arrays.fill(this.Y, 0.0f);
            }
        }
        
        private l l0(final e e) {
            for (l l = this.R; l != null; l = l.R) {
                if (e.test((Object)l)) {
                    return l;
                }
            }
            return null;
        }
        
        private Rect m0() {
            return this.b0;
        }
        
        static /* synthetic */ int n(final l l, int h) {
            h += l.h;
            return l.h = h;
        }
        
        private CharSequence n0() {
            return (CharSequence)this.h0(this.x, this.y);
        }
        
        static /* synthetic */ int o(final l l, int h) {
            h = l.h - h;
            return l.h = h;
        }
        
        private CharSequence o0() {
            return (CharSequence)this.h0(this.p, this.q);
        }
        
        private String p0() {
            if (this.x0(io.flutter.view.k.i.r)) {
                final String p = this.p;
                if (p != null && !p.isEmpty()) {
                    return this.p;
                }
            }
            final Iterator iterator = this.S.iterator();
            while (iterator.hasNext()) {
                final String p2 = ((l)iterator.next()).p0();
                if (p2 != null && !p2.isEmpty()) {
                    return p2;
                }
            }
            return null;
        }
        
        private List q0(final ByteBuffer byteBuffer, final ByteBuffer[] array) {
            final int int1 = byteBuffer.getInt();
            if (int1 == -1) {
                return null;
            }
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i < int1; ++i) {
                final int int2 = byteBuffer.getInt();
                final int int3 = byteBuffer.getInt();
                final o o = io.flutter.view.k.o.values()[byteBuffer.getInt()];
                final int n = k$e.a[o.ordinal()];
                if (n != 1) {
                    if (n == 2) {
                        final ByteBuffer byteBuffer2 = array[byteBuffer.getInt()];
                        final k$j k$j = new k$j((k$a)null);
                        ((n)k$j).a = int2;
                        ((n)k$j).b = int3;
                        ((n)k$j).c = o;
                        k$j.d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                        ((List)list).add((Object)k$j);
                    }
                }
                else {
                    byteBuffer.getInt();
                    final k$m k$m = new k$m((k$a)null);
                    ((n)k$m).a = int2;
                    ((n)k$m).b = int3;
                    ((n)k$m).c = o;
                    ((List)list).add((Object)k$m);
                }
            }
            return (List)list;
        }
        
        private CharSequence r0() {
            final CharSequence o0 = this.o0();
            final CharSequence n0 = this.n0();
            CharSequence charSequence = null;
            CharSequence concat;
            for (int i = 0; i < 2; ++i, charSequence = concat) {
                final CharSequence charSequence2 = (new CharSequence[] { o0, n0 })[i];
                concat = charSequence;
                if (charSequence2 != null) {
                    concat = charSequence;
                    if (charSequence2.length() > 0) {
                        if (charSequence != null && charSequence.length() != 0) {
                            concat = TextUtils.concat(new CharSequence[] { charSequence, (CharSequence)", ", charSequence2 });
                        }
                        else {
                            concat = charSequence2;
                        }
                    }
                }
            }
            return charSequence;
        }
        
        private CharSequence s0() {
            return (CharSequence)this.h0(this.r, this.s);
        }
        
        private CharSequence t0() {
            final CharSequence s0 = this.s0();
            final CharSequence o0 = this.o0();
            final CharSequence n0 = this.n0();
            CharSequence charSequence = null;
            CharSequence concat;
            for (int i = 0; i < 3; ++i, charSequence = concat) {
                final CharSequence charSequence2 = (new CharSequence[] { s0, o0, n0 })[i];
                concat = charSequence;
                if (charSequence2 != null) {
                    concat = charSequence;
                    if (charSequence2.length() > 0) {
                        if (charSequence != null && charSequence.length() != 0) {
                            concat = TextUtils.concat(new CharSequence[] { charSequence, (CharSequence)", ", charSequence2 });
                        }
                        else {
                            concat = charSequence2;
                        }
                    }
                }
            }
            return charSequence;
        }
        
        private boolean u0(final g g) {
            return (g.e & this.E) != 0x0;
        }
        
        private boolean v0(final i i) {
            return (i.e & this.D) != 0x0;
        }
        
        private boolean w0(final g g) {
            return (g.e & this.d) != 0x0;
        }
        
        private boolean x0(final i i) {
            return (i.e & this.c) != 0x0;
        }
        
        private l y0(final float[] array, final boolean b) {
            final float n = array[3];
            final boolean b2 = false;
            final float n2 = array[0] / n;
            final float n3 = array[1] / n;
            final float m = this.M;
            l i;
            final l l = i = null;
            if (n2 >= m) {
                i = l;
                if (n2 < this.O) {
                    i = l;
                    if (n3 >= this.N) {
                        if (n3 >= this.P) {
                            i = l;
                        }
                        else {
                            final float[] array2 = new float[4];
                            for (final l j : this.T) {
                                if (j.x0(io.flutter.view.k.i.s)) {
                                    continue;
                                }
                                j.k0();
                                Matrix.multiplyMV(array2, 0, j.Y, 0, array, 0);
                                final l y0 = j.y0(array2, b);
                                if (y0 != null) {
                                    return y0;
                                }
                            }
                            int n4 = b2 ? 1 : 0;
                            if (b) {
                                n4 = (b2 ? 1 : 0);
                                if (this.i != -1) {
                                    n4 = 1;
                                }
                            }
                            if (!this.z0()) {
                                i = l;
                                if (n4 == 0) {
                                    return i;
                                }
                            }
                            i = this;
                        }
                    }
                }
            }
            return i;
        }
        
        private boolean z0() {
            final boolean x0 = this.x0(io.flutter.view.k.i.q);
            final boolean b = false;
            if (x0) {
                return false;
            }
            if (this.x0(io.flutter.view.k.i.A)) {
                return true;
            }
            if ((this.d & ~io.flutter.view.k.z) == 0x0 && (this.c & io.flutter.view.k.A) == 0x0) {
                final String p = this.p;
                if (p == null || p.isEmpty()) {
                    final String r = this.r;
                    if (r == null || r.isEmpty()) {
                        final String x2 = this.x;
                        boolean b2 = b;
                        if (x2 == null) {
                            return b2;
                        }
                        b2 = b;
                        if (x2.isEmpty()) {
                            return b2;
                        }
                    }
                }
            }
            return true;
        }
    }
    
    private abstract static class n
    {
        int a;
        int b;
        o c;
    }
    
    private enum o
    {
        e("SPELLOUT", 0), 
        f("LOCALE", 1);
        
        private static final o[] g;
        
        static {
            g = a();
        }
        
        private o(final String s, final int n) {
        }
        
        private static /* synthetic */ o[] a() {
            return new o[] { o.e, o.f };
        }
    }
    
    private enum p
    {
        e("UNKNOWN", 0), 
        f("LTR", 1), 
        g("RTL", 2);
        
        private static final p[] h;
        
        static {
            h = a();
        }
        
        private p(final String s, final int n) {
        }
        
        private static /* synthetic */ p[] a() {
            return new p[] { p.e, p.f, p.g };
        }
        
        public static p b(final int n) {
            if (n == 1) {
                return p.g;
            }
            if (n != 2) {
                return p.e;
            }
            return p.f;
        }
    }
}
