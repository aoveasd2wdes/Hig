package u2;

import android.view.View;
import android.graphics.Canvas;
import android.content.Context;
import android.widget.TextView;

public class c extends TextView
{
    private int c;
    private int d;
    
    public c(final Context context) {
        super(context);
        this.c = 0;
        this.d = 0;
    }
    
    public void draw(final Canvas canvas) {
        canvas.translate((float)(this.d / 2), (float)(this.c / 2));
        super.draw(canvas);
    }
    
    protected void onMeasure(int max, int measuredHeight) {
        super.onMeasure(max, measuredHeight);
        final int measuredWidth = ((View)this).getMeasuredWidth();
        measuredHeight = ((View)this).getMeasuredHeight();
        max = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.c = measuredWidth - measuredHeight;
            this.d = 0;
        }
        else {
            this.c = 0;
            this.d = measuredHeight - measuredWidth;
        }
        ((View)this).setMeasuredDimension(max, max);
    }
}
