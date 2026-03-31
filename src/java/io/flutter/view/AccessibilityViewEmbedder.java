package io.flutter.view;

import java.lang.reflect.AccessibleObject;
import android.os.Parcel;
import java.lang.reflect.InvocationTargetException;
import a3.b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import android.os.Bundle;
import android.view.MotionEvent$PointerCoords;
import android.view.MotionEvent$PointerProperties;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityRecord;
import w.c;
import w.e;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashMap;
import android.util.SparseArray;
import android.graphics.Rect;
import android.view.View;
import java.util.Map;
import androidx.annotation.Keep;

@Keep
class AccessibilityViewEmbedder
{
    private static final String TAG = "AccessibilityBridge";
    private final Map<View, Rect> embeddedViewToDisplayBounds;
    private final SparseArray<c> flutterIdToOrigin;
    private int nextFlutterId;
    private final Map<c, Integer> originToFlutterId;
    private final b reflectionAccessors;
    private final View rootAccessibilityView;
    
    AccessibilityViewEmbedder(final View rootAccessibilityView, final int nextFlutterId) {
        this.reflectionAccessors = new b();
        this.flutterIdToOrigin = (SparseArray<c>)new SparseArray();
        this.rootAccessibilityView = rootAccessibilityView;
        this.nextFlutterId = nextFlutterId;
        this.originToFlutterId = (Map<c, Integer>)new HashMap();
        this.embeddedViewToDisplayBounds = (Map<View, Rect>)new HashMap();
    }
    
    private void addChildrenToFlutterNode(final AccessibilityNodeInfo accessibilityNodeInfo, final View view, final AccessibilityNodeInfo accessibilityNodeInfo2) {
        for (int i = 0; i < accessibilityNodeInfo.getChildCount(); ++i) {
            final Long d = this.reflectionAccessors.f(accessibilityNodeInfo, i);
            if (d != null) {
                final int b = j(d);
                final c c = new c(view, b);
                int intValue;
                if (this.originToFlutterId.containsKey((Object)c)) {
                    intValue = (int)this.originToFlutterId.get((Object)c);
                }
                else {
                    intValue = this.nextFlutterId++;
                    this.cacheVirtualIdMappings(view, b, intValue);
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, intValue);
            }
        }
    }
    
    private void cacheVirtualIdMappings(final View view, final int n, final int n2) {
        final c c = new c(view, n);
        this.originToFlutterId.put((Object)c, (Object)n2);
        this.flutterIdToOrigin.put(n2, (Object)c);
    }
    
    private AccessibilityNodeInfo convertToFlutterNode(final AccessibilityNodeInfo accessibilityNodeInfo, final int n, final View view) {
        final AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, n);
        obtain.setPackageName((CharSequence)this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, n);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        final Rect rect = (Rect)this.embeddedViewToDisplayBounds.get((Object)view);
        this.copyAccessibilityFields(accessibilityNodeInfo, obtain);
        this.setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        this.addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        this.setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }
    
    private void copyAccessibilityFields(final AccessibilityNodeInfo accessibilityNodeInfo, final AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 23) {
            n.a(accessibilityNodeInfo2, e.a(accessibilityNodeInfo));
        }
        if (sdk_INT >= 24) {
            p.a(accessibilityNodeInfo2, o.a(accessibilityNodeInfo));
            io.flutter.view.c.a(accessibilityNodeInfo2, w.c.a(accessibilityNodeInfo));
        }
        if (sdk_INT >= 26) {
            r.a(accessibilityNodeInfo2, q.a(accessibilityNodeInfo));
            io.flutter.view.e.a(accessibilityNodeInfo2, s.a(accessibilityNodeInfo));
            m.a(accessibilityNodeInfo2, l.a(accessibilityNodeInfo));
        }
    }
    
    private void setFlutterNodeParent(final AccessibilityNodeInfo accessibilityNodeInfo, final View view, final AccessibilityNodeInfo accessibilityNodeInfo2) {
        final Long c = this.reflectionAccessors.g(accessibilityNodeInfo);
        if (c == null) {
            return;
        }
        final Integer n = (Integer)this.originToFlutterId.get((Object)new c(view, j(c)));
        if (n != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, (int)n);
        }
    }
    
    private void setFlutterNodesTranslateBounds(final AccessibilityNodeInfo accessibilityNodeInfo, final Rect rect, final AccessibilityNodeInfo accessibilityNodeInfo2) {
        final Rect boundsInParent = new Rect();
        accessibilityNodeInfo.getBoundsInParent(boundsInParent);
        accessibilityNodeInfo2.setBoundsInParent(boundsInParent);
        final Rect boundsInScreen = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(boundsInScreen);
        boundsInScreen.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(boundsInScreen);
    }
    
    public AccessibilityNodeInfo createAccessibilityNodeInfo(final int n) {
        final c c = (c)this.flutterIdToOrigin.get(n);
        if (c == null) {
            return null;
        }
        if (!this.embeddedViewToDisplayBounds.containsKey((Object)c.a)) {
            return null;
        }
        if (c.a.getAccessibilityNodeProvider() == null) {
            return null;
        }
        final AccessibilityNodeInfo accessibilityNodeInfo = c.a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(c.b);
        if (accessibilityNodeInfo == null) {
            return null;
        }
        return this.convertToFlutterNode(accessibilityNodeInfo, n, c.a);
    }
    
    public Integer getRecordFlutterId(final View view, final AccessibilityRecord accessibilityRecord) {
        final Long e = this.reflectionAccessors.h(accessibilityRecord);
        if (e == null) {
            return null;
        }
        return (Integer)this.originToFlutterId.get((Object)new c(view, j(e)));
    }
    
    public AccessibilityNodeInfo getRootNode(final View view, final int n, final Rect rect) {
        final AccessibilityNodeInfo accessibilityNodeInfo = view.createAccessibilityNodeInfo();
        final Long a = this.reflectionAccessors.i(accessibilityNodeInfo);
        if (a == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put((Object)view, (Object)rect);
        this.cacheVirtualIdMappings(view, j(a), n);
        return this.convertToFlutterNode(accessibilityNodeInfo, n, view);
    }
    
    public boolean onAccessibilityHoverEvent(int i, MotionEvent obtain) {
        final c c = (c)this.flutterIdToOrigin.get(i);
        i = 0;
        if (c == null) {
            return false;
        }
        final Rect rect = (Rect)this.embeddedViewToDisplayBounds.get((Object)c.a);
        final int pointerCount = obtain.getPointerCount();
        final MotionEvent$PointerProperties[] array = new MotionEvent$PointerProperties[pointerCount];
        final MotionEvent$PointerCoords[] array2 = new MotionEvent$PointerCoords[pointerCount];
        while (i < obtain.getPointerCount()) {
            obtain.getPointerProperties(i, array[i] = new MotionEvent$PointerProperties());
            final MotionEvent$PointerCoords motionEvent$PointerCoords = new MotionEvent$PointerCoords();
            obtain.getPointerCoords(i, motionEvent$PointerCoords);
            final MotionEvent$PointerCoords motionEvent$PointerCoords2 = new MotionEvent$PointerCoords(motionEvent$PointerCoords);
            array2[i] = motionEvent$PointerCoords2;
            motionEvent$PointerCoords2.x -= rect.left;
            motionEvent$PointerCoords2.y -= rect.top;
            ++i;
        }
        obtain = MotionEvent.obtain(obtain.getDownTime(), obtain.getEventTime(), obtain.getAction(), obtain.getPointerCount(), array, array2, obtain.getMetaState(), obtain.getButtonState(), obtain.getXPrecision(), obtain.getYPrecision(), obtain.getDeviceId(), obtain.getEdgeFlags(), obtain.getSource(), obtain.getFlags());
        return c.a.dispatchGenericMotionEvent(obtain);
    }
    
    public boolean performAction(final int n, final int n2, final Bundle bundle) {
        final c c = (c)this.flutterIdToOrigin.get(n);
        if (c == null) {
            return false;
        }
        final AccessibilityNodeProvider accessibilityNodeProvider = c.a.getAccessibilityNodeProvider();
        return accessibilityNodeProvider != null && accessibilityNodeProvider.performAction(c.b, n2, bundle);
    }
    
    public View platformViewOfNode(final int n) {
        final c c = (c)this.flutterIdToOrigin.get(n);
        if (c == null) {
            return null;
        }
        return c.a;
    }
    
    public boolean requestSendAccessibilityEvent(final View view, final View view2, final AccessibilityEvent accessibilityEvent) {
        final AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        final Long e = this.reflectionAccessors.h((AccessibilityRecord)accessibilityEvent);
        if (e == null) {
            return false;
        }
        final int b = j(e);
        Integer value;
        if ((value = (Integer)this.originToFlutterId.get((Object)new c(view, b))) == null) {
            value = this.nextFlutterId++;
            this.cacheVirtualIdMappings(view, b, value);
        }
        ((AccessibilityRecord)obtain).setSource(this.rootAccessibilityView, (int)value);
        ((AccessibilityRecord)obtain).setClassName(((AccessibilityRecord)accessibilityEvent).getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i = 0; i < obtain.getRecordCount(); ++i) {
            final AccessibilityRecord record = obtain.getRecord(i);
            final Long e2 = this.reflectionAccessors.h(record);
            if (e2 == null) {
                return false;
            }
            final c c = new c(view, j(e2));
            if (!this.originToFlutterId.containsKey((Object)c)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, (int)this.originToFlutterId.get((Object)c));
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
    
    private static class b
    {
        private final Method a;
        private final Method b;
        private final Method c;
        private final Method d;
        private final Field e;
        private final Method f;
        
        private b() {
            Method b = null;
            Method method;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", (Class<?>[])new Class[0]);
            }
            catch (final NoSuchMethodException ex) {
                a3.b.g("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            Method method2;
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", (Class<?>[])new Class[0]);
            }
            catch (final NoSuchMethodException ex2) {
                a3.b.g("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            Method method5;
            Method d;
            Object declaredField;
            if (Build$VERSION.SDK_INT <= 26) {
                Method method3;
                try {
                    method3 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", (Class<?>[])new Class[0]);
                }
                catch (final NoSuchMethodException ex3) {
                    a3.b.g("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
                    method3 = null;
                }
                Method method4;
                try {
                    method4 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                }
                catch (final NoSuchMethodException ex4) {
                    a3.b.g("AccessibilityBridge", "can't invoke getChildId with reflection");
                    method4 = null;
                }
                final Field field = null;
                method5 = null;
                b = method3;
                d = method4;
                declaredField = field;
            }
            else {
                try {
                    declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    ((AccessibleObject)declaredField).setAccessible(true);
                    method5 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                    d = null;
                }
                catch (final NoSuchFieldException | ClassNotFoundException | NoSuchMethodException | NullPointerException ex5) {
                    a3.b.g("AccessibilityBridge", "can't access childNodeIdsField with reflection");
                    d = null;
                    declaredField = (method5 = null);
                }
            }
            this.a = method;
            this.b = b;
            this.c = method2;
            this.d = d;
            this.e = (Field)declaredField;
            this.f = method5;
        }
        
        private Long f(final AccessibilityNodeInfo ex, final int n) {
            final Method d = this.d;
            if (d == null && (this.e == null || this.f == null)) {
                return null;
            }
            String s = null;
            Label_0126: {
                if (d != null) {
                    try {
                        return (Long)d.invoke((Object)ex, new Object[] { n });
                    }
                    catch (final InvocationTargetException ex) {
                        s = "The getChildId method threw an exception when invoked.";
                        break Label_0126;
                    }
                    catch (final IllegalAccessException ex) {
                        s = "Failed to access getChildId method.";
                        break Label_0126;
                    }
                }
                try {
                    return (long)this.f.invoke(this.e.get((Object)ex), new Object[] { n });
                }
                catch (final ArrayIndexOutOfBoundsException ex) {
                    goto Label_0114;
                }
                catch (final InvocationTargetException ex2) {}
                catch (final IllegalAccessException ex) {
                    s = "Failed to access longArrayGetIndex method or the childNodeId field.";
                }
            }
            a3.b.h("AccessibilityBridge", s, (Throwable)ex);
            return null;
        }
        
        private Long g(final AccessibilityNodeInfo accessibilityNodeInfo) {
            final Method b = this.b;
            if (b != null) {
                String s;
                try {
                    return (long)b.invoke((Object)accessibilityNodeInfo, new Object[0]);
                }
                catch (final InvocationTargetException ex) {
                    s = "The getParentNodeId method threw an exception when invoked.";
                }
                catch (final IllegalAccessException ex) {
                    s = "Failed to access getParentNodeId method.";
                }
                final InvocationTargetException ex;
                a3.b.h("AccessibilityBridge", s, (Throwable)ex);
            }
            return l(accessibilityNodeInfo);
        }
        
        private Long h(final AccessibilityRecord accessibilityRecord) {
            final Method c = this.c;
            if (c == null) {
                return null;
            }
            String s;
            try {
                return (Long)c.invoke((Object)accessibilityRecord, new Object[0]);
            }
            catch (final InvocationTargetException ex) {
                s = "The getRecordSourceNodeId method threw an exception when invoked.";
            }
            catch (final IllegalAccessException ex) {
                s = "Failed to access the getRecordSourceNodeId method.";
            }
            final InvocationTargetException ex;
            a3.b.h("AccessibilityBridge", s, (Throwable)ex);
            return null;
        }
        
        private Long i(final AccessibilityNodeInfo accessibilityNodeInfo) {
            final Method a = this.a;
            if (a == null) {
                return null;
            }
            String s;
            try {
                return (Long)a.invoke((Object)accessibilityNodeInfo, new Object[0]);
            }
            catch (final InvocationTargetException ex) {
                s = "The getSourceNodeId method threw an exception when invoked.";
            }
            catch (final IllegalAccessException ex) {
                s = "Failed to access getSourceNodeId method.";
            }
            final InvocationTargetException ex;
            a3.b.h("AccessibilityBridge", s, (Throwable)ex);
            return null;
        }
        
        private static int j(final long n) {
            return (int)(n >> 32);
        }
        
        private static boolean k(final long n, final int n2) {
            return (n & 1L << n2) != 0x0L;
        }
        
        private static Long l(AccessibilityNodeInfo obtain) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            final Long n = null;
            if (sdk_INT < 26) {
                a3.b.g("AccessibilityBridge", "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            obtain = AccessibilityNodeInfo.obtain(obtain);
            final Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            final long long1 = obtain2.readLong();
            if (k(long1, 0)) {
                obtain2.readInt();
            }
            if (k(long1, 1)) {
                obtain2.readLong();
            }
            if (k(long1, 2)) {
                obtain2.readInt();
            }
            Long value = n;
            if (k(long1, 3)) {
                value = obtain2.readLong();
            }
            obtain2.recycle();
            return value;
        }
    }
    
    private static class c
    {
        final View a;
        final int b;
        
        private c(final View a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            if (this.b != c.b || !this.a.equals(c.a)) {
                b = false;
            }
            return b;
        }
        
        @Override
        public int hashCode() {
            return (this.a.hashCode() + 31) * 31 + this.b;
        }
    }
}
