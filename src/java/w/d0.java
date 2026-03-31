package w;

import android.text.Spannable;
import android.os.BaseBundle;
import java.lang.ref.Reference;
import java.time.Duration;
import android.view.accessibility.AccessibilityNodeInfo$ExtraRenderingInfo;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo$Builder;
import android.view.accessibility.AccessibilityNodeInfo$RangeInfo;
import android.text.SpannableString;
import android.text.TextUtils;
import android.graphics.Rect;
import java.util.Collections;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.os.Build$VERSION;
import q.b;
import java.util.List;
import android.text.Spanned;
import android.os.Bundle;
import java.util.ArrayList;
import android.view.View;
import java.lang.ref.WeakReference;
import android.util.SparseArray;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;

public class d0
{
    private static int d;
    private final AccessibilityNodeInfo a;
    public int b;
    private int c;
    
    private d0(final AccessibilityNodeInfo a) {
        this.b = -1;
        this.c = -1;
        this.a = a;
    }
    
    public d0(final Object o) {
        this.b = -1;
        this.c = -1;
        this.a = (AccessibilityNodeInfo)o;
    }
    
    private boolean B() {
        return this.f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() ^ true;
    }
    
    private int C(final ClickableSpan clickableSpan, final SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); ++i) {
                if (clickableSpan.equals(((Reference)sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        final int d = d0.d;
        d0.d = d + 1;
        return d;
    }
    
    private void U(final View view) {
        final SparseArray v = this.v(view);
        if (v != null) {
            final ArrayList list = new ArrayList();
            final int n = 0;
            int n2 = 0;
            int i;
            while (true) {
                i = n;
                if (n2 >= v.size()) {
                    break;
                }
                if (((Reference)v.valueAt(n2)).get() == null) {
                    ((List)list).add((Object)n2);
                }
                ++n2;
            }
            while (i < ((List)list).size()) {
                v.remove((int)((List)list).get(i));
                ++i;
            }
        }
    }
    
    private void V(final int n, final boolean b) {
        final Bundle r = this.r();
        if (r != null) {
            final int int1 = ((BaseBundle)r).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
            int n2;
            if (b) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            ((BaseBundle)r).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", n2 | (int1 & ~n));
        }
    }
    
    private void c(final ClickableSpan clickableSpan, final Spanned spanned, final int n) {
        this.f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add((Object)spanned.getSpanStart((Object)clickableSpan));
        this.f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add((Object)spanned.getSpanEnd((Object)clickableSpan));
        this.f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add((Object)spanned.getSpanFlags((Object)clickableSpan));
        this.f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add((Object)n);
    }
    
    private void e() {
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }
    
    public static d0 e0(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return new d0(accessibilityNodeInfo);
    }
    
    private List f(final String s) {
        ArrayList integerArrayList;
        if ((integerArrayList = this.a.getExtras().getIntegerArrayList(s)) == null) {
            integerArrayList = new ArrayList();
            this.a.getExtras().putIntegerArrayList(s, integerArrayList);
        }
        return (List)integerArrayList;
    }
    
    static d0 f0(final Object o) {
        if (o != null) {
            return new d0(o);
        }
        return null;
    }
    
    static String h(final int n) {
        if (n == 1) {
            return "ACTION_FOCUS";
        }
        if (n == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        return "ACTION_UNKNOWN";
                                    }
                                    case 16908375: {
                                        return "ACTION_DRAG_CANCEL";
                                    }
                                    case 16908374: {
                                        return "ACTION_DRAG_DROP";
                                    }
                                    case 16908373: {
                                        return "ACTION_DRAG_START";
                                    }
                                    case 16908372: {
                                        return "ACTION_IME_ENTER";
                                    }
                                }
                                break;
                            }
                            case 16908362: {
                                return "ACTION_PRESS_AND_HOLD";
                            }
                            case 16908361: {
                                return "ACTION_PAGE_RIGHT";
                            }
                            case 16908360: {
                                return "ACTION_PAGE_LEFT";
                            }
                            case 16908359: {
                                return "ACTION_PAGE_DOWN";
                            }
                            case 16908358: {
                                return "ACTION_PAGE_UP";
                            }
                            case 16908357: {
                                return "ACTION_HIDE_TOOLTIP";
                            }
                            case 16908356: {
                                return "ACTION_SHOW_TOOLTIP";
                            }
                        }
                        break;
                    }
                    case 16908349: {
                        return "ACTION_SET_PROGRESS";
                    }
                    case 16908348: {
                        return "ACTION_CONTEXT_CLICK";
                    }
                    case 16908347: {
                        return "ACTION_SCROLL_RIGHT";
                    }
                    case 16908346: {
                        return "ACTION_SCROLL_DOWN";
                    }
                    case 16908345: {
                        return "ACTION_SCROLL_LEFT";
                    }
                    case 16908344: {
                        return "ACTION_SCROLL_UP";
                    }
                    case 16908343: {
                        return "ACTION_SCROLL_TO_POSITION";
                    }
                    case 16908342: {
                        return "ACTION_SHOW_ON_SCREEN";
                    }
                }
                break;
            }
            case 16908382: {
                return "ACTION_SCROLL_IN_DIRECTION";
            }
            case 16908354: {
                return "ACTION_MOVE_WINDOW";
            }
            case 2097152: {
                return "ACTION_SET_TEXT";
            }
            case 524288: {
                return "ACTION_COLLAPSE";
            }
            case 262144: {
                return "ACTION_EXPAND";
            }
            case 131072: {
                return "ACTION_SET_SELECTION";
            }
            case 65536: {
                return "ACTION_CUT";
            }
            case 32768: {
                return "ACTION_PASTE";
            }
            case 16384: {
                return "ACTION_COPY";
            }
            case 8192: {
                return "ACTION_SCROLL_BACKWARD";
            }
            case 4096: {
                return "ACTION_SCROLL_FORWARD";
            }
            case 2048: {
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            }
            case 1024: {
                return "ACTION_NEXT_HTML_ELEMENT";
            }
            case 512: {
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            }
            case 256: {
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            }
            case 128: {
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            }
            case 64: {
                return "ACTION_ACCESSIBILITY_FOCUS";
            }
            case 32: {
                return "ACTION_LONG_CLICK";
            }
            case 16: {
                return "ACTION_CLICK";
            }
            case 8: {
                return "ACTION_CLEAR_SELECTION";
            }
            case 4: {
                return "ACTION_SELECT";
            }
        }
    }
    
    private boolean i(final int n) {
        final Bundle r = this.r();
        boolean b = false;
        if (r == null) {
            return false;
        }
        if ((((BaseBundle)r).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & n) == n) {
            b = true;
        }
        return b;
    }
    
    public static ClickableSpan[] n(final CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[])((Spanned)charSequence).getSpans(0, charSequence.length(), (Class)ClickableSpan.class);
        }
        return null;
    }
    
    private SparseArray t(final View view) {
        SparseArray v;
        if ((v = this.v(view)) == null) {
            v = new SparseArray();
            view.setTag(q.b.I, (Object)v);
        }
        return v;
    }
    
    private SparseArray v(final View view) {
        return (SparseArray)view.getTag(q.b.I);
    }
    
    public String A() {
        return this.a.getViewIdResourceName();
    }
    
    public boolean D() {
        if (Build$VERSION.SDK_INT >= 34) {
            return d0.d.f(this.a);
        }
        return this.i(64);
    }
    
    public boolean E() {
        return this.a.isCheckable();
    }
    
    public boolean F() {
        return this.a.isChecked();
    }
    
    public boolean G() {
        return this.a.isClickable();
    }
    
    public boolean H() {
        return Build$VERSION.SDK_INT >= 23 && w.e.a(this.a);
    }
    
    public boolean I() {
        return this.a.isEnabled();
    }
    
    public boolean J() {
        return this.a.isFocusable();
    }
    
    public boolean K() {
        return this.a.isFocused();
    }
    
    public boolean L() {
        return this.i(67108864);
    }
    
    public boolean M() {
        return Build$VERSION.SDK_INT < 24 || w.c.a(this.a);
    }
    
    public boolean N() {
        return this.a.isLongClickable();
    }
    
    public boolean O() {
        return this.a.isPassword();
    }
    
    public boolean P() {
        return this.a.isScrollable();
    }
    
    public boolean Q() {
        return this.a.isSelected();
    }
    
    public boolean R() {
        if (Build$VERSION.SDK_INT >= 33) {
            return d0.c.h(this.a);
        }
        return this.i(8388608);
    }
    
    public boolean S() {
        return this.a.isVisibleToUser();
    }
    
    public boolean T(final int n, final Bundle bundle) {
        return this.a.performAction(n, bundle);
    }
    
    public void W(final CharSequence className) {
        this.a.setClassName(className);
    }
    
    public void X(final Object o) {
        final AccessibilityNodeInfo a = this.a;
        AccessibilityNodeInfo$CollectionInfo collectionInfo;
        if (o == null) {
            collectionInfo = null;
        }
        else {
            collectionInfo = (AccessibilityNodeInfo$CollectionInfo)((e)o).a;
        }
        a.setCollectionInfo(collectionInfo);
    }
    
    public void Y(final boolean b) {
        if (Build$VERSION.SDK_INT >= 28) {
            h.a(this.a, b);
        }
        else {
            this.V(2, b);
        }
    }
    
    public void Z(final CharSequence charSequence) {
        if (Build$VERSION.SDK_INT >= 28) {
            w.f.a(this.a, charSequence);
        }
        else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }
    
    public void a(final int n) {
        this.a.addAction(n);
    }
    
    public void a0(final boolean b) {
        if (Build$VERSION.SDK_INT >= 28) {
            w.d.a(this.a, b);
        }
        else {
            this.V(1, b);
        }
    }
    
    public void b(final a a) {
        this.a.addAction((AccessibilityNodeInfo$AccessibilityAction)a.a);
    }
    
    public void b0(final boolean scrollable) {
        this.a.setScrollable(scrollable);
    }
    
    public void c0(final CharSequence charSequence) {
        if (Build$VERSION.SDK_INT >= 30) {
            d0.b.c(this.a, charSequence);
        }
        else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }
    
    public void d(final CharSequence charSequence, final View view) {
        if (Build$VERSION.SDK_INT < 26) {
            this.e();
            this.U(view);
            final ClickableSpan[] n = n(charSequence);
            if (n != null && n.length > 0) {
                ((BaseBundle)this.r()).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", q.b.a);
                final SparseArray t = this.t(view);
                for (int i = 0; i < n.length; ++i) {
                    final int c = this.C(n[i], t);
                    t.put(c, (Object)new WeakReference((Object)n[i]));
                    this.c(n[i], (Spanned)charSequence, c);
                }
            }
        }
    }
    
    public AccessibilityNodeInfo d0() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof d0)) {
            return false;
        }
        final d0 d0 = (d0)o;
        final AccessibilityNodeInfo a = this.a;
        if (a == null) {
            if (d0.a != null) {
                return false;
            }
        }
        else if (!a.equals((Object)d0.a)) {
            return false;
        }
        return this.c == d0.c && this.b == d0.b;
    }
    
    public List g() {
        final List actionList = this.a.getActionList();
        if (actionList != null) {
            final ArrayList list = new ArrayList();
            for (int size = actionList.size(), i = 0; i < size; ++i) {
                ((List)list).add((Object)new a(actionList.get(i)));
            }
            return (List)list;
        }
        return Collections.emptyList();
    }
    
    @Override
    public int hashCode() {
        final AccessibilityNodeInfo a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    public void j(final Rect rect) {
        this.a.getBoundsInParent(rect);
    }
    
    public void k(final Rect rect) {
        this.a.getBoundsInScreen(rect);
    }
    
    public void l(final Rect rect) {
        if (Build$VERSION.SDK_INT >= 34) {
            d0.d.b(this.a, rect);
        }
        else {
            final Rect rect2 = (Rect)this.a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
    }
    
    public CharSequence m() {
        return this.a.getClassName();
    }
    
    public CharSequence o() {
        if (Build$VERSION.SDK_INT >= 34) {
            return d0.d.c(this.a);
        }
        return this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }
    
    public CharSequence p() {
        return this.a.getContentDescription();
    }
    
    public CharSequence q() {
        return this.a.getError();
    }
    
    public Bundle r() {
        return this.a.getExtras();
    }
    
    public int s() {
        return this.a.getMaxTextLength();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        final Rect rect = new Rect();
        this.j(rect);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append((Object)rect);
        sb.append(sb2.toString());
        this.k(rect);
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append((Object)rect);
        sb.append(sb3.toString());
        this.l(rect);
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("; boundsInWindow: ");
        sb4.append((Object)rect);
        sb.append(sb4.toString());
        sb.append("; packageName: ");
        sb.append(this.u());
        sb.append("; className: ");
        sb.append(this.m());
        sb.append("; text: ");
        sb.append(this.x());
        sb.append("; error: ");
        sb.append(this.q());
        sb.append("; maxTextLength: ");
        sb.append(this.s());
        sb.append("; stateDescription: ");
        sb.append(this.w());
        sb.append("; contentDescription: ");
        sb.append(this.p());
        sb.append("; tooltipText: ");
        sb.append(this.y());
        sb.append("; viewIdResName: ");
        sb.append(this.A());
        sb.append("; uniqueId: ");
        sb.append(this.z());
        sb.append("; checkable: ");
        sb.append(this.E());
        sb.append("; checked: ");
        sb.append(this.F());
        sb.append("; focusable: ");
        sb.append(this.J());
        sb.append("; focused: ");
        sb.append(this.K());
        sb.append("; selected: ");
        sb.append(this.Q());
        sb.append("; clickable: ");
        sb.append(this.G());
        sb.append("; longClickable: ");
        sb.append(this.N());
        sb.append("; contextClickable: ");
        sb.append(this.H());
        sb.append("; enabled: ");
        sb.append(this.I());
        sb.append("; password: ");
        sb.append(this.O());
        final StringBuilder sb5 = new StringBuilder();
        sb5.append("; scrollable: ");
        sb5.append(this.P());
        sb.append(sb5.toString());
        sb.append("; containerTitle: ");
        sb.append(this.o());
        sb.append("; granularScrollingSupported: ");
        sb.append(this.L());
        sb.append("; importantForAccessibility: ");
        sb.append(this.M());
        sb.append("; visible: ");
        sb.append(this.S());
        sb.append("; isTextSelectable: ");
        sb.append(this.R());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(this.D());
        sb.append("; [");
        final List g = this.g();
        for (int i = 0; i < g.size(); ++i) {
            final a a = (a)g.get(i);
            String s2;
            final String s = s2 = h(a.a());
            if (s.equals((Object)"ACTION_UNKNOWN")) {
                s2 = s;
                if (a.b() != null) {
                    s2 = a.b().toString();
                }
            }
            sb.append(s2);
            if (i != g.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public CharSequence u() {
        return this.a.getPackageName();
    }
    
    public CharSequence w() {
        if (Build$VERSION.SDK_INT >= 30) {
            return d0.b.b(this.a);
        }
        return this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }
    
    public CharSequence x() {
        if (this.B()) {
            final List f = this.f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            final List f2 = this.f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            final List f3 = this.f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            final List f4 = this.f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            final CharSequence text = this.a.getText();
            final int length = this.a.getText().length();
            int i = 0;
            final SpannableString spannableString = new SpannableString((CharSequence)TextUtils.substring(text, 0, length));
            while (i < f.size()) {
                ((Spannable)spannableString).setSpan((Object)new w.a((int)f4.get(i), this, ((BaseBundle)this.r()).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), (int)f.get(i), (int)f2.get(i), (int)f3.get(i));
                ++i;
            }
            return (CharSequence)spannableString;
        }
        return this.a.getText();
    }
    
    public CharSequence y() {
        if (Build$VERSION.SDK_INT >= 28) {
            return g.a(this.a);
        }
        return this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }
    
    public String z() {
        if (Build$VERSION.SDK_INT >= 33) {
            return d0.c.g(this.a);
        }
        return ((BaseBundle)this.a.getExtras()).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }
    
    public static class a
    {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;
        public static final a q;
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;
        final Object a;
        private final int b;
        private final Class c;
        
        static {
            final Object o2 = null;
            d = new a(1, null);
            e = new a(2, null);
            f = new a(4, null);
            g = new a(8, null);
            h = new a(16, null);
            i = new a(32, null);
            j = new a(64, null);
            k = new a(128, null);
            l = new a(256, null, g0$b.class);
            m = new a(512, null, g0$b.class);
            n = new a(1024, null, g0$c.class);
            o = new a(2048, null, g0$c.class);
            p = new a(4096, null);
            q = new a(8192, null);
            r = new a(16384, null);
            s = new a(32768, null);
            t = new a(65536, null);
            u = new a(131072, null, g0$g.class);
            v = new a(262144, null);
            w = new a(524288, null);
            x = new a(1048576, null);
            y = new a(2097152, null, g0$h.class);
            final int sdk_INT = Build$VERSION.SDK_INT;
            AccessibilityNodeInfo$AccessibilityAction a;
            if (sdk_INT >= 23) {
                a = w.i.a();
            }
            else {
                a = null;
            }
            z = new a(a, 16908342, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a2;
            if (sdk_INT >= 23) {
                a2 = w.k.a();
            }
            else {
                a2 = null;
            }
            A = new a(a2, 16908343, null, null, g0$e.class);
            AccessibilityNodeInfo$AccessibilityAction a3;
            if (sdk_INT >= 23) {
                a3 = w.m.a();
            }
            else {
                a3 = null;
            }
            B = new a(a3, 16908344, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a4;
            if (sdk_INT >= 23) {
                a4 = w.n.a();
            }
            else {
                a4 = null;
            }
            C = new a(a4, 16908345, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a5;
            if (sdk_INT >= 23) {
                a5 = w.o.a();
            }
            else {
                a5 = null;
            }
            D = new a(a5, 16908346, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a6;
            if (sdk_INT >= 23) {
                a6 = w.p.a();
            }
            else {
                a6 = null;
            }
            E = new a(a6, 16908347, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a7;
            if (sdk_INT >= 29) {
                a7 = w.q.a();
            }
            else {
                a7 = null;
            }
            F = new a(a7, 16908358, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a8;
            if (sdk_INT >= 29) {
                a8 = w.r.a();
            }
            else {
                a8 = null;
            }
            G = new a(a8, 16908359, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a9;
            if (sdk_INT >= 29) {
                a9 = w.s.a();
            }
            else {
                a9 = null;
            }
            H = new a(a9, 16908360, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a10;
            if (sdk_INT >= 29) {
                a10 = w.u.a();
            }
            else {
                a10 = null;
            }
            I = new a(a10, 16908361, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a11;
            if (sdk_INT >= 23) {
                a11 = w.t.a();
            }
            else {
                a11 = null;
            }
            J = new a(a11, 16908348, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a12;
            if (sdk_INT >= 24) {
                a12 = w.v.a();
            }
            else {
                a12 = null;
            }
            K = new a(a12, 16908349, null, null, g0$f.class);
            AccessibilityNodeInfo$AccessibilityAction a13;
            if (sdk_INT >= 26) {
                a13 = w.w.a();
            }
            else {
                a13 = null;
            }
            L = new a(a13, 16908354, null, null, g0$d.class);
            AccessibilityNodeInfo$AccessibilityAction a14;
            if (sdk_INT >= 28) {
                a14 = w.x.a();
            }
            else {
                a14 = null;
            }
            M = new a(a14, 16908356, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a15;
            if (sdk_INT >= 28) {
                a15 = w.y.a();
            }
            else {
                a15 = null;
            }
            N = new a(a15, 16908357, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a16;
            if (sdk_INT >= 30) {
                a16 = w.z.a();
            }
            else {
                a16 = null;
            }
            O = new a(a16, 16908362, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a17;
            if (sdk_INT >= 30) {
                a17 = a0.a();
            }
            else {
                a17 = null;
            }
            P = new a(a17, 16908372, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a18;
            if (sdk_INT >= 32) {
                a18 = b0.a();
            }
            else {
                a18 = null;
            }
            Q = new a(a18, 16908373, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a19;
            if (sdk_INT >= 32) {
                a19 = c0.a();
            }
            else {
                a19 = null;
            }
            R = new a(a19, 16908374, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a20;
            if (sdk_INT >= 32) {
                a20 = w.j.a();
            }
            else {
                a20 = null;
            }
            S = new a(a20, 16908375, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction a21;
            if (sdk_INT >= 33) {
                a21 = w.l.a();
            }
            else {
                a21 = null;
            }
            T = new a(a21, 16908376, null, null, null);
            Object a22 = o2;
            if (sdk_INT >= 34) {
                a22 = d0.d.a();
            }
            U = new a(a22, 16908382, null, null, null);
        }
        
        public a(final int n, final CharSequence charSequence) {
            this(null, n, charSequence, null, null);
        }
        
        private a(final int n, final CharSequence charSequence, final Class clazz) {
            this(null, n, charSequence, null, clazz);
        }
        
        a(final Object o) {
            this(o, 0, null, null, null);
        }
        
        a(final Object o, final int b, final CharSequence charSequence, final g0 g0, final Class c) {
            this.b = b;
            Object a = o;
            if (o == null) {
                a = new AccessibilityNodeInfo$AccessibilityAction(b, charSequence);
            }
            this.a = a;
            this.c = c;
        }
        
        public int a() {
            return ((AccessibilityNodeInfo$AccessibilityAction)this.a).getId();
        }
        
        public CharSequence b() {
            return ((AccessibilityNodeInfo$AccessibilityAction)this.a).getLabel();
        }
        
        public boolean c(final View view, final Bundle bundle) {
            return false;
        }
        
        @Override
        public boolean equals(Object a) {
            if (a == null) {
                return false;
            }
            if (!(a instanceof a)) {
                return false;
            }
            final a a2 = (a)a;
            a = this.a;
            final Object a3 = a2.a;
            if (a == null) {
                if (a3 != null) {
                    return false;
                }
            }
            else if (!a.equals(a3)) {
                return false;
            }
            return true;
        }
        
        @Override
        public int hashCode() {
            final Object a = this.a;
            int hashCode;
            if (a != null) {
                hashCode = a.hashCode();
            }
            else {
                hashCode = 0;
            }
            return hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String s2;
            final String s = s2 = d0.h(this.b);
            if (s.equals((Object)"ACTION_UNKNOWN")) {
                s2 = s;
                if (this.b() != null) {
                    s2 = this.b().toString();
                }
            }
            sb.append(s2);
            return sb.toString();
        }
    }
    
    private abstract static class b
    {
        public static Object a(final int n, final float n2, final float n3, final float n4) {
            return new AccessibilityNodeInfo$RangeInfo(n, n2, n3, n4);
        }
        
        public static CharSequence b(final AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }
        
        public static void c(final AccessibilityNodeInfo accessibilityNodeInfo, final CharSequence stateDescription) {
            accessibilityNodeInfo.setStateDescription(stateDescription);
        }
    }
    
    private abstract static class c
    {
        public static f a(final boolean heading, final int columnIndex, final int rowIndex, final int columnSpan, final int rowSpan, final boolean selected, final String rowTitle, final String columnTitle) {
            return new f(new AccessibilityNodeInfo$CollectionItemInfo$Builder().setHeading(heading).setColumnIndex(columnIndex).setRowIndex(rowIndex).setColumnSpan(columnSpan).setRowSpan(rowSpan).setSelected(selected).setRowTitle(rowTitle).setColumnTitle(columnTitle).build());
        }
        
        public static d0 b(final AccessibilityNodeInfo accessibilityNodeInfo, final int n, final int n2) {
            return d0.f0(accessibilityNodeInfo.getChild(n, n2));
        }
        
        public static String c(final Object o) {
            return ((AccessibilityNodeInfo$CollectionItemInfo)o).getColumnTitle();
        }
        
        public static String d(final Object o) {
            return ((AccessibilityNodeInfo$CollectionItemInfo)o).getRowTitle();
        }
        
        public static AccessibilityNodeInfo$ExtraRenderingInfo e(final AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }
        
        public static d0 f(final AccessibilityNodeInfo accessibilityNodeInfo, final int n) {
            return d0.f0(accessibilityNodeInfo.getParent(n));
        }
        
        public static String g(final AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }
        
        public static boolean h(final AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
        
        public static void i(final AccessibilityNodeInfo accessibilityNodeInfo, final boolean textSelectable) {
            accessibilityNodeInfo.setTextSelectable(textSelectable);
        }
        
        public static void j(final AccessibilityNodeInfo accessibilityNodeInfo, final String uniqueId) {
            accessibilityNodeInfo.setUniqueId(uniqueId);
        }
    }
    
    private abstract static class d
    {
        public static AccessibilityNodeInfo$AccessibilityAction a() {
            return AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }
        
        public static void b(final AccessibilityNodeInfo accessibilityNodeInfo, final Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }
        
        public static CharSequence c(final AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }
        
        public static long d(final AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }
        
        public static boolean e(final AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }
        
        public static boolean f(final AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
        
        public static void g(final AccessibilityNodeInfo accessibilityNodeInfo, final boolean accessibilityDataSensitive) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(accessibilityDataSensitive);
        }
        
        public static void h(final AccessibilityNodeInfo accessibilityNodeInfo, final Rect boundsInWindow) {
            accessibilityNodeInfo.setBoundsInWindow(boundsInWindow);
        }
        
        public static void i(final AccessibilityNodeInfo accessibilityNodeInfo, final CharSequence containerTitle) {
            accessibilityNodeInfo.setContainerTitle(containerTitle);
        }
        
        public static void j(final AccessibilityNodeInfo accessibilityNodeInfo, final long n) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(n));
        }
        
        public static void k(final AccessibilityNodeInfo accessibilityNodeInfo, final View view, final boolean b) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, b);
        }
        
        public static void l(final AccessibilityNodeInfo accessibilityNodeInfo, final boolean requestInitialAccessibilityFocus) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(requestInitialAccessibilityFocus);
        }
    }
    
    public static class e
    {
        final Object a;
        
        e(final Object a) {
            this.a = a;
        }
        
        public static e a(final int n, final int n2, final boolean b, final int n3) {
            return new e(AccessibilityNodeInfo$CollectionInfo.obtain(n, n2, b, n3));
        }
    }
    
    public static class f
    {
        final Object a;
        
        f(final Object a) {
            this.a = a;
        }
    }
}
