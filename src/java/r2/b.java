package r2;

import t2.a$a;
import java.util.ArrayList;
import p.d;
import java.util.Iterator;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import h2.z;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.Collection;
import h2.c0;

public class b implements c0
{
    private static final int[] l;
    private static final float[] m;
    public static final a n;
    private t2.a b;
    private Collection c;
    private q2.a d;
    private int e;
    private a f;
    private int[] g;
    private double[] h;
    private double i;
    private double[] j;
    private double k;
    
    static {
        final int[] array = l = new int[] { Color.rgb(102, 225, 0), Color.rgb(255, 0, 0) };
        final float[] array2;
        final float[] i = array2 = new float[2];
        array2[0] = 0.2f;
        array2[1] = 1.0f;
        m = i;
        n = new a(array, i);
    }
    
    private b(final b.b$b b$b) {
        this.c = r2.b.b$b.a(b$b);
        this.e = r2.b.b$b.b(b$b);
        this.f = r2.b.b$b.c(b$b);
        this.i = r2.b.b$b.d(b$b);
        this.k = r2.b.b$b.e(b$b);
        final int e = this.e;
        this.h = e(e, e / 3.0);
        this.i(this.f);
        this.m(this.c);
    }
    
    static Bitmap b(final double[][] array, final int[] array2, double n) {
        final int n2 = array2[array2.length - 1];
        n = (array2.length - 1) / n;
        final int length = array.length;
        final int[] array3 = new int[length * length];
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length; ++j) {
                final double n3 = array[j][i];
                final int n4 = i * length + j;
                final int n5 = (int)(n3 * n);
                if (n3 != 0.0) {
                    if (n5 < array2.length) {
                        array3[n4] = array2[n5];
                    }
                    else {
                        array3[n4] = n2;
                    }
                }
                else {
                    array3[n4] = 0;
                }
            }
        }
        final Bitmap bitmap = Bitmap.createBitmap(length, length, Bitmap$Config.ARGB_8888);
        bitmap.setPixels(array3, 0, length, 0, 0, length, length);
        return bitmap;
    }
    
    private static z c(final Bitmap bitmap) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap$CompressFormat.PNG, 100, (OutputStream)byteArrayOutputStream);
        return new z(512, 512, byteArrayOutputStream.toByteArray());
    }
    
    static double[][] d(double[][] array, final double[] array2) {
        final int n = (int)Math.floor(array2.length / 2.0);
        final int length = array.length;
        final int n2 = length - n * 2;
        final int n3 = n + n2 - 1;
        final double[][] array3 = new double[length][length];
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length; ++j) {
                final double n4 = array[i][j];
                if (n4 != 0.0) {
                    int n5;
                    if (n3 < (n5 = i + n)) {
                        n5 = n3;
                    }
                    final int n6 = i - n;
                    int k;
                    if (n > n6) {
                        k = n;
                    }
                    else {
                        k = n6;
                    }
                    while (k < n5 + 1) {
                        final double[] array4 = array3[k];
                        array4[j] += array2[k - n6] * n4;
                        ++k;
                    }
                }
            }
        }
        array = new double[n2][n2];
        for (int l = n; l < n3 + 1; ++l) {
            for (int n7 = 0; n7 < length; ++n7) {
                final double n8 = array3[l][n7];
                if (n8 != 0.0) {
                    int n9;
                    if (n3 < (n9 = n7 + n)) {
                        n9 = n3;
                    }
                    final int n10 = n7 - n;
                    int n11;
                    if (n > n10) {
                        n11 = n;
                    }
                    else {
                        n11 = n10;
                    }
                    while (n11 < n9 + 1) {
                        final double[] array5 = array[l - n];
                        final int n12 = n11 - n;
                        array5[n12] += array2[n11 - n10] * n8;
                        ++n11;
                    }
                }
            }
        }
        return array;
    }
    
    static double[] e(final int n, final double n2) {
        final double[] array = new double[n * 2 + 1];
        for (int i = -n; i <= n; ++i) {
            array[i + n] = Math.exp(-i * i / (2.0 * n2 * n2));
        }
        return array;
    }
    
    static q2.a f(final Collection collection) {
        final Iterator iterator = collection.iterator();
        final c c = (c)iterator.next();
        double a = c.a().a;
        double a2 = c.a().a;
        double b = c.a().b;
        double b2 = c.a().b;
        while (iterator.hasNext()) {
            final c c2 = (c)iterator.next();
            final double a3 = c2.a().a;
            final double b3 = c2.a().b;
            double n = a;
            if (a3 < a) {
                n = a3;
            }
            double n2 = a2;
            if (a3 > a2) {
                n2 = a3;
            }
            double n3 = b;
            if (b3 < b) {
                n3 = b3;
            }
            a = n;
            a2 = n2;
            b = n3;
            if (b3 > b2) {
                b2 = b3;
                a = n;
                a2 = n2;
                b = n3;
            }
        }
        return new q2.a(a, a2, b, b2);
    }
    
    private double[] g(int i) {
        final double[] array = new double[22];
        final double k = this.k;
        final int n = 0;
        if (k != 0.0) {
            for (i = n; i < 22; ++i) {
                array[i] = this.k;
            }
            return array;
        }
        int n2 = 5;
        int j;
        while (true) {
            j = 11;
            if (n2 >= 11) {
                break;
            }
            array[n2] = h(this.c, this.d, i, (int)(Math.pow(2.0, (double)(n2 - 3)) * 1280.0));
            if (n2 == 5) {
                for (int l = 0; l < n2; ++l) {
                    array[l] = array[n2];
                }
            }
            ++n2;
        }
        while (j < 22) {
            array[j] = array[10];
            ++j;
        }
        return array;
    }
    
    static double h(final Collection collection, final q2.a a, int n, int n2) {
        final double a2 = a.a;
        final double c = a.c;
        final double b = a.b;
        final double d = a.d;
        double n3 = c - a2;
        final double n4 = d - b;
        if (n3 <= n4) {
            n3 = n4;
        }
        final double n5 = (int)(n2 / (n * 2) + 0.5) / n3;
        final d d2 = new d();
        final Iterator iterator = collection.iterator();
        double doubleValue = 0.0;
        while (iterator.hasNext()) {
            final c c2 = (c)iterator.next();
            final double a3 = c2.a().a;
            final double b2 = c2.a().b;
            n = (int)((a3 - a2) * n5);
            n2 = (int)((b2 - b) * n5);
            final long n6 = n;
            d d3;
            if ((d3 = (d)d2.g(n6)) == null) {
                d3 = new d();
                d2.k(n6, (Object)d3);
            }
            final long n7 = n2;
            Double value;
            if ((value = (Double)d3.g(n7)) == null) {
                value = 0.0;
            }
            final Double value2 = value + c2.b();
            d3.k(n7, (Object)value2);
            if (value2 > doubleValue) {
                doubleValue = value2;
            }
        }
        return doubleValue;
    }
    
    public z a(int e, int n, final int n2) {
        final double n3 = 1.0 / Math.pow(2.0, (double)n2);
        final int e2 = this.e;
        final double n4 = e2 * n3 / 512.0;
        final double n5 = (2.0 * n4 + n3) / (e2 * 2 + 512);
        final double n6 = e * n3 - n4;
        final double n7 = (e + 1) * n3 + n4;
        final double n8 = n * n3 - n4;
        final double n9 = (n + 1) * n3 + n4;
        Object o = new ArrayList();
        double n10;
        if (n6 < 0.0) {
            o = this.b.f(new q2.a(n6 + 1.0, 1.0, n8, n9));
            n10 = -1.0;
        }
        else {
            n10 = 1.0;
            if (n7 > 1.0) {
                o = this.b.f(new q2.a(0.0, n7 - 1.0, n8, n9));
            }
            else {
                n10 = 0.0;
            }
        }
        final q2.a a = new q2.a(n6, n7, n8, n9);
        final q2.a d = this.d;
        if (!a.e(new q2.a(d.a - n4, d.c + n4, d.b - n4, d.d + n4))) {
            return c0.a;
        }
        final Collection f = this.b.f(a);
        if (f.isEmpty()) {
            return c0.a;
        }
        e = this.e;
        final double[][] array = new double[e * 2 + 512][e * 2 + 512];
        for (final c c : f) {
            final q2.b a2 = c.a();
            e = (int)((a2.a - n6) / n5);
            n = (int)((a2.b - n8) / n5);
            final double[] array2 = array[e];
            array2[n] += c.b();
        }
        for (final c c2 : o) {
            final q2.b a3 = c2.a();
            n = (int)((a3.a + n10 - n6) / n5);
            e = (int)((a3.b - n8) / n5);
            final double[] array3 = array[n];
            array3[e] += c2.b();
        }
        return c(b(d(array, this.h), this.g, this.j[n2]));
    }
    
    public void i(final a f) {
        this.f = f;
        this.g = f.b(this.i);
    }
    
    public void j(final double k) {
        this.k = k;
        this.m(this.c);
    }
    
    public void k(final double i) {
        this.i = i;
        this.i(this.f);
    }
    
    public void l(final int e) {
        this.e = e;
        this.h = e(e, e / 3.0);
        this.j = this.g(this.e);
    }
    
    public void m(final Collection c) {
        this.c = c;
        if (!c.isEmpty()) {
            final q2.a f = f(this.c);
            this.d = f;
            this.b = new t2.a(f);
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                this.b.a((a$a)iterator.next());
            }
            this.j = this.g(this.e);
            return;
        }
        throw new IllegalArgumentException("No input points.");
    }
}
