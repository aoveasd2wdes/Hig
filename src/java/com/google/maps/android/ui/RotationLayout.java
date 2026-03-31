package com.google.maps.android.ui;

import android.view.View;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class RotationLayout extends FrameLayout
{
    private int c;
    
    public RotationLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public void dispatchDraw(final Canvas canvas) {
        final int c = this.c;
        if (c == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        Label_0138: {
            float n;
            int width;
            if (c == 1) {
                canvas.translate((float)((View)this).getWidth(), 0.0f);
                canvas.rotate(90.0f, (float)(((View)this).getWidth() / 2), 0.0f);
                n = (float)(((View)this).getHeight() / 2);
                width = ((View)this).getWidth();
            }
            else {
                if (c == 2) {
                    canvas.rotate(180.0f, (float)(((View)this).getWidth() / 2), (float)(((View)this).getHeight() / 2));
                    break Label_0138;
                }
                canvas.translate(0.0f, (float)((View)this).getHeight());
                canvas.rotate(270.0f, (float)(((View)this).getWidth() / 2), 0.0f);
                n = (float)(((View)this).getHeight() / 2);
                width = -((View)this).getWidth();
            }
            canvas.translate(n, (float)(width / 2));
        }
        super.dispatchDraw(canvas);
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int c = this.c;
        if (c != 1 && c != 3) {
            super.onMeasure(n, n2);
        }
        else {
            super.onMeasure(n, n2);
            ((View)this).setMeasuredDimension(((View)this).getMeasuredHeight(), ((View)this).getMeasuredWidth());
        }
    }
    
    public void setViewRotation(final int n) {
        this.c = (n + 360) % 360 / 90;
    }
}
