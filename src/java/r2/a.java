package r2;

import android.graphics.Color;
import java.util.HashMap;

public class a
{
    public final int a;
    public int[] b;
    public float[] c;
    
    public a(final int[] array, final float[] array2) {
        this(array, array2, 1000);
    }
    
    public a(final int[] array, final float[] array2, final int a) {
        if (array.length != array2.length) {
            throw new IllegalArgumentException("colors and startPoints should be same length");
        }
        if (array.length != 0) {
            for (int i = 1; i < array2.length; ++i) {
                if (array2[i] <= array2[i - 1]) {
                    throw new IllegalArgumentException("startPoints should be in increasing order");
                }
            }
            this.a = a;
            final int[] b = new int[array.length];
            this.b = b;
            this.c = new float[array2.length];
            System.arraycopy((Object)array, 0, (Object)b, 0, array.length);
            System.arraycopy((Object)array2, 0, (Object)this.c, 0, array2.length);
            return;
        }
        throw new IllegalArgumentException("No colors have been defined");
    }
    
    private HashMap a() {
        final HashMap hashMap = new HashMap();
        if (this.c[0] != 0.0f) {
            hashMap.put((Object)0, (Object)new b(Color.argb(0, Color.red(this.b[0]), Color.green(this.b[0]), Color.blue(this.b[0])), this.b[0], this.a * this.c[0]));
        }
        for (int i = 1; i < this.b.length; ++i) {
            final float n = (float)this.a;
            final float[] c = this.c;
            final int n2 = i - 1;
            final int n3 = (int)(n * c[n2]);
            final int[] b = this.b;
            final int n4 = b[n2];
            final int n5 = b[i];
            final float n6 = (float)this.a;
            final float[] c2 = this.c;
            hashMap.put((Object)n3, (Object)new b(n4, n5, (c2[i] - c2[n2]) * n6));
        }
        final float[] c3 = this.c;
        if (c3[c3.length - 1] != 1.0f) {
            final int n7 = c3.length - 1;
            final int n8 = (int)(this.a * c3[n7]);
            final int n9 = this.b[n7];
            hashMap.put((Object)n8, (Object)new b(n9, n9, this.a * (1.0f - this.c[n7])));
        }
        return hashMap;
    }
    
    static int c(int i, final int n, final float n2) {
        final int n3 = (int)((Color.alpha(n) - Color.alpha(i)) * n2 + Color.alpha(i));
        final float[] array = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), array);
        final float[] array2 = new float[3];
        Color.RGBToHSV(Color.red(n), Color.green(n), Color.blue(n), array2);
        i = 0;
        final float n4 = array[0];
        final float n5 = array2[0];
        if (n4 - n5 > 180.0f) {
            array2[0] = n5 + 360.0f;
        }
        else if (n5 - n4 > 180.0f) {
            array[0] = n4 + 360.0f;
        }
        final float[] array3 = new float[3];
        while (i < 3) {
            final float n6 = array2[i];
            final float n7 = array[i];
            array3[i] = (n6 - n7) * n2 + n7;
            ++i;
        }
        return Color.HSVToColor(n3, array3);
    }
    
    int[] b(final double n) {
        final HashMap a = this.a();
        final int[] array = new int[this.a];
        final int n2 = 0;
        b b = (b)a.get((Object)0);
        int i = 0;
        int n3 = 0;
        while (i < this.a) {
            if (a.containsKey((Object)i)) {
                b = (b)a.get((Object)i);
                n3 = i;
            }
            array[i] = c(b.a, b.b, (i - n3) / b.c);
            ++i;
        }
        if (n != 1.0) {
            for (int j = n2; j < this.a; ++j) {
                final int n4 = array[j];
                array[j] = Color.argb((int)(Color.alpha(n4) * n), Color.red(n4), Color.green(n4), Color.blue(n4));
            }
        }
        return array;
    }
    
    private class b
    {
        private final int a;
        private final int b;
        private final float c;
        final a d;
        
        private b(final a d, final int a, final int b, final float c) {
            this.d = d;
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
