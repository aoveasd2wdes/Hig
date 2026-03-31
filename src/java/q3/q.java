package q3;

import java.io.IOException;
import android.graphics.BitmapFactory;
import java.io.FileOutputStream;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap;
import java.io.File;
import android.util.Log;
import v.g;
import android.graphics.BitmapFactory$Options;
import android.content.Context;

class q
{
    private final Context a;
    private final a b;
    
    q(final Context a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    private int a(final BitmapFactory$Options bitmapFactory$Options, final int n, final int n2) {
        final int outHeight = bitmapFactory$Options.outHeight;
        final int outWidth = bitmapFactory$Options.outWidth;
        int n3 = 1;
        int n4 = 1;
        if (outHeight > n2 || outWidth > n) {
            final int n5 = outHeight / 2;
            final int n6 = outWidth / 2;
            while (true) {
                n3 = n4;
                if (n5 / n4 < n2) {
                    break;
                }
                n3 = n4;
                if (n6 / n4 < n) {
                    break;
                }
                n4 *= 2;
            }
        }
        return n3;
    }
    
    private g b(double n, double n2, final Double n3, final Double n4) {
        final double n5 = n / n2;
        final boolean b = true;
        final boolean b2 = n3 != null;
        final boolean b3 = n4 != null;
        double min;
        if (b2) {
            min = Math.min(n, (double)Math.round((double)n3));
        }
        else {
            min = n;
        }
        double min2;
        if (b3) {
            min2 = Math.min(n2, (double)Math.round((double)n4));
        }
        else {
            min2 = n2;
        }
        final boolean b4 = b2 && n3 < n;
        final boolean b5 = b3 && n4 < n2;
        int n6 = b ? 1 : 0;
        if (!b4) {
            if (b5) {
                n6 = (b ? 1 : 0);
            }
            else {
                n6 = 0;
            }
        }
        n2 = min;
        n = min2;
        if (n6 != 0) {
            n = min / n5;
            if (n > min2) {
                n2 = (double)Math.round(min2 * n5);
                n = min2;
            }
            else {
                n = (double)Math.round(n);
                n2 = min;
            }
        }
        return new g((float)n2, (float)n);
    }
    
    private void c(final String s, final String s2) {
        try {
            this.b.a(new androidx.exifinterface.media.a(s), new androidx.exifinterface.media.a(s2));
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Error preserving Exif data on selected image: ");
            sb.append((Object)ex);
            Log.e("ImageResizer", sb.toString());
        }
    }
    
    private File d(File file, final String s) {
        file = new File(file, s);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        return file;
    }
    
    private File e(final String s, final Bitmap bitmap, final int n) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final boolean hasAlpha = bitmap.hasAlpha();
        if (hasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        Bitmap$CompressFormat bitmap$CompressFormat;
        if (hasAlpha) {
            bitmap$CompressFormat = Bitmap$CompressFormat.PNG;
        }
        else {
            bitmap$CompressFormat = Bitmap$CompressFormat.JPEG;
        }
        bitmap.compress(bitmap$CompressFormat, n, (OutputStream)byteArrayOutputStream);
        final File d = this.d(this.a.getCacheDir(), s);
        final FileOutputStream f = this.f(d);
        f.write(byteArrayOutputStream.toByteArray());
        f.close();
        return d;
    }
    
    private FileOutputStream f(final File file) {
        return new FileOutputStream(file);
    }
    
    private Bitmap g(final Bitmap bitmap, final int n, final int n2, final boolean b) {
        return Bitmap.createScaledBitmap(bitmap, n, n2, b);
    }
    
    private Bitmap h(final String s, final BitmapFactory$Options bitmapFactory$Options) {
        return BitmapFactory.decodeFile(s, bitmapFactory$Options);
    }
    
    private File k(Bitmap g, final Double n, final Double n2, final int n3, final String s) {
        g = this.g(g, n.intValue(), n2.intValue(), false);
        final StringBuilder sb = new StringBuilder();
        sb.append("/scaled_");
        sb.append(s);
        return this.e(sb.toString(), g, n3);
    }
    
    g i(final String s) {
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inJustDecodeBounds = true;
        this.h(s, bitmapFactory$Options);
        return new g((float)bitmapFactory$Options.outWidth, (float)bitmapFactory$Options.outHeight);
    }
    
    String j(String path, final Double n, final Double n2, final int n3) {
        final g i = this.i(path);
        if (i.b() != -1.0f) {
            if (i.a() != -1.0f) {
                if (n == null && n2 == null && n3 >= 100) {
                    return path;
                }
                try {
                    final String[] split = path.split("/");
                    final String s = split[split.length - 1];
                    final g b = this.b(i.b(), i.a(), n, n2);
                    final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
                    bitmapFactory$Options.inSampleSize = this.a(bitmapFactory$Options, (int)b.b(), (int)b.a());
                    final Bitmap h = this.h(path, bitmapFactory$Options);
                    if (h == null) {
                        return path;
                    }
                    final File k = this.k(h, (double)b.b(), (double)b.a(), n3, s);
                    this.c(path, k.getPath());
                    path = k.getPath();
                    return path;
                }
                catch (final IOException ex) {
                    throw new RuntimeException((Throwable)ex);
                }
            }
        }
        return path;
    }
}
