package g;

import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import f.i;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$MarginLayoutParams;

public abstract class a extends ViewGroup$MarginLayoutParams
{
    public int a;
    
    public a(final int n, final int n2) {
        super(n, n2);
        this.a = 8388627;
    }
    
    public a(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, i.r);
        this.a = obtainStyledAttributes.getInt(i.s, 0);
        obtainStyledAttributes.recycle();
    }
    
    public a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.a = 0;
    }
    
    public a(final a a) {
        super((ViewGroup$MarginLayoutParams)a);
        this.a = 0;
        this.a = a.a;
    }
}
