package b1;

import java.util.Collection;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import android.graphics.Rect;
import y0.d;
import v0.b;
import y0.c$b;
import y0.d$b;
import v0.h$a;
import v0.h;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import androidx.window.sidecar.SidecarDeviceState;
import java.util.List;
import androidx.window.sidecar.SidecarDisplayFeature;
import i4.l;
import i4.g;
import v0.j;

public final class a
{
    public static final a b;
    private static final String c;
    private final j a;
    
    static {
        b = new a(null);
        c = a.class.getSimpleName();
    }
    
    public a(final j a) {
        l.e(a, "verificationMode");
        this.a = a;
    }
    
    private final boolean b(final SidecarDisplayFeature sidecarDisplayFeature, final SidecarDisplayFeature sidecarDisplayFeature2) {
        return l.a(sidecarDisplayFeature, sidecarDisplayFeature2) || (sidecarDisplayFeature != null && sidecarDisplayFeature2 != null && sidecarDisplayFeature.getType() == sidecarDisplayFeature2.getType() && l.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect()));
    }
    
    private final boolean c(final List list, final List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null) {
            return false;
        }
        if (list2 == null) {
            return false;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (!this.b((SidecarDisplayFeature)list.get(i), (SidecarDisplayFeature)list2.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean a(final SidecarDeviceState sidecarDeviceState, final SidecarDeviceState sidecarDeviceState2) {
        final boolean a = l.a(sidecarDeviceState, sidecarDeviceState2);
        boolean b = true;
        if (a) {
            return true;
        }
        if (sidecarDeviceState == null) {
            return false;
        }
        if (sidecarDeviceState2 == null) {
            return false;
        }
        final a b2 = b1.a.b;
        if (b2.b(sidecarDeviceState) != b2.b(sidecarDeviceState2)) {
            b = false;
        }
        return b;
    }
    
    public final boolean d(final SidecarWindowLayoutInfo sidecarWindowLayoutInfo, final SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (l.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null) {
            return false;
        }
        if (sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        final a b = b1.a.b;
        return this.c(b.c(sidecarWindowLayoutInfo), b.c(sidecarWindowLayoutInfo2));
    }
    
    public final List e(final List list, final SidecarDeviceState sidecarDeviceState) {
        l.e(list, "sidecarDisplayFeatures");
        l.e(sidecarDeviceState, "deviceState");
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = ((Iterable)list).iterator();
        while (iterator.hasNext()) {
            final a g = this.g((SidecarDisplayFeature)iterator.next(), sidecarDeviceState);
            if (g != null) {
                ((Collection)list2).add((Object)g);
            }
        }
        return (List)list2;
    }
    
    public final y0.j f(final SidecarWindowLayoutInfo sidecarWindowLayoutInfo, final SidecarDeviceState sidecarDeviceState) {
        l.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new y0.j(v3.l.h());
        }
        final SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        final a b = b1.a.b;
        b.d(sidecarDeviceState2, b.b(sidecarDeviceState));
        return new y0.j(this.e(b.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }
    
    public final a g(final SidecarDisplayFeature sidecarDisplayFeature, final SidecarDeviceState sidecarDeviceState) {
        l.e(sidecarDisplayFeature, "feature");
        l.e(sidecarDeviceState, "deviceState");
        final h$a a = h.a;
        final String c = b1.a.c;
        l.d(c, "TAG");
        final SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature)h$a.b(a, (Object)sidecarDisplayFeature, c, this.a, (v0.g)null, 4, (Object)null).c("Type must be either TYPE_FOLD or TYPE_HINGE", (h4.l)a$b.f).c("Feature bounds must not be 0", (h4.l)a$c.f).c("TYPE_FOLD must have 0 area", (h4.l)a$d.f).c("Feature be pinned to either left or top", (h4.l)a$e.f).a();
        final a a2 = null;
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        final int type = sidecarDisplayFeature2.getType();
        d$b d$b;
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            d$b = y0.d$b.b.b();
        }
        else {
            d$b = y0.d$b.b.a();
        }
        final int b = b1.a.b.b(sidecarDeviceState);
        Object o = a2;
        if (b != 0) {
            o = a2;
            if (b != 1) {
                c$b c$b;
                if (b != 2) {
                    if (b != 3) {
                        o = a2;
                        if (b == 4) {
                            return (a)o;
                        }
                    }
                    c$b = y0.c$b.c;
                }
                else {
                    c$b = y0.c$b.d;
                }
                final Rect rect = sidecarDisplayFeature.getRect();
                l.d(rect, "feature.rect");
                o = new d(new b(rect), d$b, c$b);
            }
        }
        return (a)o;
    }
    
    public static final class a
    {
        private a() {
        }
        
        public final int a(final SidecarDeviceState sidecarDeviceState) {
            l.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            }
            catch (final NoSuchFieldError noSuchFieldError) {
                try {
                    final Object invoke = SidecarDeviceState.class.getMethod("getPosture", (Class<?>[])new Class[0]).invoke((Object)sidecarDeviceState, new Object[0]);
                    l.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                    return (int)invoke;
                }
                catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
                    return 0;
                }
            }
        }
        
        public final int b(final SidecarDeviceState sidecarDeviceState) {
            l.e(sidecarDeviceState, "sidecarDeviceState");
            final int a = this.a(sidecarDeviceState);
            int n;
            if (a < 0 || (n = a) > 4) {
                n = 0;
            }
            return n;
        }
        
        public final List c(final SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            l.e(sidecarWindowLayoutInfo, "info");
            try {
                List list;
                if ((list = sidecarWindowLayoutInfo.displayFeatures) == null) {
                    list = v3.l.h();
                }
                return list;
            }
            catch (final NoSuchFieldError noSuchFieldError) {
                try {
                    final Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", (Class<?>[])new Class[0]).invoke((Object)sidecarWindowLayoutInfo, new Object[0]);
                    l.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                    return (List)invoke;
                }
                catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
                    return v3.l.h();
                }
            }
        }
        
        public final void d(final SidecarDeviceState sidecarDeviceState, final int posture) {
            l.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                sidecarDeviceState.posture = posture;
                return;
            }
            catch (final NoSuchFieldError noSuchFieldError) {
                final Class<SidecarDeviceState> clazz = SidecarDeviceState.class;
                final String s = "setPosture";
                final int n = 1;
                final Class[] array = new Class[n];
                final int n2 = 0;
                final Class clazz2 = Integer.TYPE;
                array[n2] = clazz2;
                final Method method = clazz.getMethod(s, (Class[])array);
                final SidecarDeviceState sidecarDeviceState2 = sidecarDeviceState;
                final int n3 = 1;
                final Object[] array2 = new Object[n3];
                final int n4 = 0;
                final int n5 = posture;
                final Integer n6 = n5;
                array2[n4] = n6;
                method.invoke((Object)sidecarDeviceState2, array2);
            }
            try {
                final Class<SidecarDeviceState> clazz = SidecarDeviceState.class;
                final String s = "setPosture";
                final int n = 1;
                final Class[] array = new Class[n];
                final int n2 = 0;
                final Class clazz2 = Integer.TYPE;
                array[n2] = clazz2;
                final Method method = clazz.getMethod(s, (Class[])array);
                final SidecarDeviceState sidecarDeviceState2 = sidecarDeviceState;
                final int n3 = 1;
                final Object[] array2 = new Object[n3];
                final int n4 = 0;
                final int n5 = posture;
                final Integer n6 = n5;
                array2[n4] = n6;
                method.invoke((Object)sidecarDeviceState2, array2);
            }
            catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {}
        }
    }
}
