package u2;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.view.View$MeasureSpec;
import android.graphics.Bitmap;
import l2.d;
import l2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.maps.android.ui.RotationLayout;
import android.view.ViewGroup;
import android.content.Context;

public class b
{
    private final Context a;
    private ViewGroup b;
    private RotationLayout c;
    private TextView d;
    private View e;
    private int f;
    private float g;
    private float h;
    private a i;
    
    public b(final Context a) {
        this.g = 0.5f;
        this.h = 1.0f;
        this.a = a;
        this.i = new a(a);
        final ViewGroup b = (ViewGroup)LayoutInflater.from(a).inflate(l2.c.a, (ViewGroup)null);
        this.b = b;
        final RotationLayout c = (RotationLayout)b.getChildAt(0);
        this.c = c;
        final TextView textView = (TextView)((View)c).findViewById(l2.b.a);
        this.d = textView;
        this.e = (View)textView;
        this.h(1);
    }
    
    private static int a(final int n) {
        if (n == 3) {
            return -3407872;
        }
        if (n == 4) {
            return -16737844;
        }
        if (n == 5) {
            return -10053376;
        }
        if (n == 6) {
            return -6736948;
        }
        if (n != 7) {
            return -1;
        }
        return -30720;
    }
    
    private static int b(final int n) {
        if (n != 3 && n != 4 && n != 5 && n != 6 && n != 7) {
            return d.a;
        }
        return d.b;
    }
    
    public Bitmap c() {
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        ((View)this.b).measure(measureSpec, measureSpec);
        int n = ((View)this.b).getMeasuredWidth();
        int n2 = ((View)this.b).getMeasuredHeight();
        this.b.layout(0, 0, n, n2);
        final int f = this.f;
        if (f == 1 || f == 3) {
            n2 = ((View)this.b).getMeasuredWidth();
            n = ((View)this.b).getMeasuredHeight();
        }
        final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        bitmap.eraseColor(0);
        final Canvas canvas = new Canvas(bitmap);
        final int f2 = this.f;
        Label_0179: {
            float n3;
            if (f2 != 1) {
                if (f2 == 2) {
                    canvas.rotate(180.0f, (float)(n / 2), (float)(n2 / 2));
                    break Label_0179;
                }
                if (f2 != 3) {
                    break Label_0179;
                }
                canvas.translate(0.0f, (float)n2);
                n3 = 270.0f;
            }
            else {
                canvas.translate((float)n, 0.0f);
                n3 = 90.0f;
            }
            canvas.rotate(n3);
        }
        ((View)this.b).draw(canvas);
        return bitmap;
    }
    
    public Bitmap d(final CharSequence text) {
        final TextView d = this.d;
        if (d != null) {
            d.setText(text);
        }
        return this.c();
    }
    
    public void e(final Drawable backgroundDrawable) {
        ((View)this.b).setBackgroundDrawable(backgroundDrawable);
        if (backgroundDrawable != null) {
            final Rect rect = new Rect();
            backgroundDrawable.getPadding(rect);
            ((View)this.b).setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        else {
            ((View)this.b).setPadding(0, 0, 0, 0);
        }
    }
    
    public void f(final int n) {
        this.i.a(n);
        this.e(this.i);
    }
    
    public void g(View viewById) {
        ((ViewGroup)this.c).removeAllViews();
        ((ViewGroup)this.c).addView(viewById);
        this.e = viewById;
        viewById = ((View)this.c).findViewById(l2.b.a);
        TextView d;
        if (viewById instanceof TextView) {
            d = (TextView)viewById;
        }
        else {
            d = null;
        }
        this.d = d;
    }
    
    public void h(final int n) {
        this.f(a(n));
        this.j(this.a, b(n));
    }
    
    public void i(final int n) {
        this.j(this.a, n);
    }
    
    public void j(final Context context, final int n) {
        final TextView d = this.d;
        if (d != null) {
            d.setTextAppearance(context, n);
        }
    }
}
