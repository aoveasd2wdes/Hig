package io.flutter.embedding.android;

import java.nio.Buffer;
import android.view.InputEvent;
import java.nio.ByteOrder;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import android.view.InputDevice$MotionRange;
import android.content.Context;
import java.nio.ByteBuffer;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import android.graphics.Matrix;

public class c
{
    private static final Matrix f;
    private final FlutterRenderer a;
    private final o0 b;
    private final boolean c;
    private final Map d;
    private int e;
    
    static {
        f = new Matrix();
    }
    
    public c(final FlutterRenderer a, final boolean c) {
        this.d = (Map)new HashMap();
        this.a = a;
        this.b = o0.a();
        this.c = c;
    }
    
    private void a(final MotionEvent motionEvent, final int n, final int n2, final int n3, final Matrix matrix, final ByteBuffer byteBuffer) {
        this.b(motionEvent, n, n2, n3, matrix, byteBuffer, null);
    }
    
    private void b(final MotionEvent motionEvent, final int n, final int n2, final int n3, final Matrix matrix, final ByteBuffer byteBuffer, final Context context) {
        int e = -1;
        if (n2 == -1) {
            return;
        }
        final int pointerId = motionEvent.getPointerId(n);
        final int f = this.f(motionEvent.getToolType(n));
        final float[] array = { motionEvent.getX(n), motionEvent.getY(n) };
        matrix.mapPoints(array);
        long n5;
        if (f == 1) {
            final long n4 = n5 = (motionEvent.getButtonState() & 0x1F);
            if (n4 == 0L) {
                n5 = n4;
                if (motionEvent.getSource() == 8194) {
                    n5 = n4;
                    if (n2 == 4) {
                        this.d.put((Object)pointerId, (Object)array);
                        n5 = n4;
                    }
                }
            }
        }
        else if (f == 2) {
            n5 = (motionEvent.getButtonState() >> 4 & 0xF);
        }
        else {
            n5 = 0L;
        }
        final boolean containsKey = this.d.containsKey((Object)pointerId);
        if (containsKey) {
            e = this.e(n2);
            if (e == -1) {
                return;
            }
        }
        long d;
        if (this.c) {
            d = this.b.c(motionEvent).d();
        }
        else {
            d = 0L;
        }
        final boolean b = motionEvent.getActionMasked() == 8;
        final long eventTime = motionEvent.getEventTime();
        byteBuffer.putLong(d);
        byteBuffer.putLong(eventTime * 1000L);
        long n6;
        if (containsKey) {
            byteBuffer.putLong((long)e);
            n6 = 4L;
        }
        else {
            byteBuffer.putLong((long)n2);
            n6 = f;
        }
        byteBuffer.putLong(n6);
        byteBuffer.putLong((long)(b ? 1 : 0));
        byteBuffer.putLong((long)pointerId);
        byteBuffer.putLong(0L);
        double n7;
        if (containsKey) {
            final float[] array2 = (float[])this.d.get((Object)pointerId);
            byteBuffer.putDouble((double)array2[0]);
            n7 = array2[1];
        }
        else {
            byteBuffer.putDouble((double)array[0]);
            n7 = array[1];
        }
        byteBuffer.putDouble(n7);
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putLong(n5);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble((double)motionEvent.getPressure(n));
        double n8 = 0.0;
        double n9 = 0.0;
        Label_0494: {
            if (((InputEvent)motionEvent).getDevice() != null) {
                final InputDevice$MotionRange motionRange = ((InputEvent)motionEvent).getDevice().getMotionRange(2);
                if (motionRange != null) {
                    n8 = motionRange.getMin();
                    n9 = motionRange.getMax();
                    break Label_0494;
                }
            }
            n9 = 1.0;
            n8 = 0.0;
        }
        byteBuffer.putDouble(n8);
        byteBuffer.putDouble(n9);
        if (f == 2) {
            byteBuffer.putDouble((double)motionEvent.getAxisValue(24, n));
        }
        else {
            byteBuffer.putDouble(0.0);
        }
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble((double)motionEvent.getSize(n));
        byteBuffer.putDouble((double)motionEvent.getToolMajor(n));
        byteBuffer.putDouble((double)motionEvent.getToolMinor(n));
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble((double)motionEvent.getAxisValue(8, n));
        if (f == 2) {
            byteBuffer.putDouble((double)motionEvent.getAxisValue(25, n));
        }
        else {
            byteBuffer.putDouble(0.0);
        }
        byteBuffer.putLong((long)n3);
        if ((b ? 1 : 0) == 1) {
            double n10;
            double n11;
            if (context != null) {
                n10 = this.c(context);
                n11 = this.g(context);
            }
            else {
                n10 = 48.0;
                n11 = 48.0;
            }
            final double n12 = -motionEvent.getAxisValue(10, n);
            final double n13 = -motionEvent.getAxisValue(9, n);
            byteBuffer.putDouble(n10 * n12);
            byteBuffer.putDouble(n11 * n13);
        }
        else {
            byteBuffer.putDouble(0.0);
            byteBuffer.putDouble(0.0);
        }
        if (containsKey) {
            final float[] array3 = (float[])this.d.get((Object)pointerId);
            byteBuffer.putDouble((double)(array[0] - array3[0]));
            byteBuffer.putDouble((double)(array[1] - array3[1]));
        }
        else {
            byteBuffer.putDouble(0.0);
            byteBuffer.putDouble(0.0);
        }
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(1.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putLong(0L);
        if (containsKey && e == 9) {
            this.d.remove((Object)pointerId);
        }
    }
    
    private float c(final Context context) {
        if (Build$VERSION.SDK_INT >= 26) {
            return io.flutter.embedding.android.b.a(ViewConfiguration.get(context));
        }
        return (float)this.i(context);
    }
    
    private int d(final int n) {
        if (n == 0) {
            return 4;
        }
        if (n == 1) {
            return 6;
        }
        if (n == 5) {
            return 4;
        }
        if (n == 6) {
            return 6;
        }
        if (n == 2) {
            return 5;
        }
        if (n == 7) {
            return 3;
        }
        if (n == 3) {
            return 0;
        }
        if (n == 8) {
            return 3;
        }
        return -1;
    }
    
    private int e(final int n) {
        if (n == 4) {
            return 7;
        }
        if (n == 5) {
            return 8;
        }
        if (n != 6 && n != 0) {
            return -1;
        }
        return 9;
    }
    
    private int f(final int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 1;
        }
        if (n != 4) {
            return 5;
        }
        return 3;
    }
    
    private float g(final Context context) {
        if (Build$VERSION.SDK_INT >= 26) {
            return this.h(context);
        }
        return (float)this.i(context);
    }
    
    private float h(final Context context) {
        return io.flutter.embedding.android.a.a(ViewConfiguration.get(context));
    }
    
    private int i(final Context context) {
        if (this.e == 0) {
            final TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                return 48;
            }
            this.e = (int)typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.e;
    }
    
    public boolean j(final MotionEvent motionEvent, final Context context) {
        final boolean fromSource = ((InputEvent)motionEvent).isFromSource(2);
        final boolean b = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!fromSource || !b) {
            return false;
        }
        final int d = this.d(motionEvent.getActionMasked());
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 36 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        this.b(motionEvent, motionEvent.getActionIndex(), d, 0, io.flutter.embedding.android.c.f, allocateDirect, context);
        if (((Buffer)allocateDirect).position() % 288 == 0) {
            this.a.m(allocateDirect, ((Buffer)allocateDirect).position());
            return true;
        }
        throw new AssertionError((Object)"Packet position is not on field boundary.");
    }
    
    public boolean k(final MotionEvent motionEvent) {
        return this.l(motionEvent, io.flutter.embedding.android.c.f);
    }
    
    public boolean l(final MotionEvent motionEvent, final Matrix matrix) {
        final int pointerCount = motionEvent.getPointerCount();
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pointerCount * 36 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        final int actionMasked = motionEvent.getActionMasked();
        final int d = this.d(motionEvent.getActionMasked());
        final boolean b = actionMasked == 0 || actionMasked == 5;
        final boolean b2 = !b && (actionMasked == 1 || actionMasked == 6);
        Label_0189: {
            if (!b) {
                int i = 0;
                final int n = 0;
                if (!b2) {
                    while (i < pointerCount) {
                        this.a(motionEvent, i, d, 0, matrix, allocateDirect);
                        ++i;
                    }
                    break Label_0189;
                }
                for (int j = n; j < pointerCount; ++j) {
                    if (j != motionEvent.getActionIndex() && motionEvent.getToolType(j) == 1) {
                        this.a(motionEvent, j, 5, 1, matrix, allocateDirect);
                    }
                }
            }
            this.a(motionEvent, motionEvent.getActionIndex(), d, 0, matrix, allocateDirect);
        }
        if (((Buffer)allocateDirect).position() % 288 == 0) {
            this.a.m(allocateDirect, ((Buffer)allocateDirect).position());
            return true;
        }
        throw new AssertionError((Object)"Packet position is not on field boundary");
    }
}
