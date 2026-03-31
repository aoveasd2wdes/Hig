package io.flutter.plugin.editing;

import androidx.core.view.s0;
import android.view.WindowInsets$Builder;
import java.util.Iterator;
import androidx.core.view.l0;
import androidx.appcompat.widget.u0;
import androidx.core.view.t0;
import androidx.core.view.v0;
import java.util.List;
import android.view.WindowInsetsAnimation;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.WindowInsetsAnimation$Callback;
import androidx.core.view.x0;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.Keep;
import android.annotation.TargetApi;
import android.annotation.SuppressLint;

@SuppressLint({ "NewApi", "Override" })
@TargetApi(30)
@Keep
class ImeSyncDeferringInsetsCallback
{
    private boolean animating;
    private AnimationCallback animationCallback;
    private final int deferredInsetTypes;
    private b insetsListener;
    private WindowInsets lastWindowInsets;
    private boolean needsSave;
    private View view;
    
    ImeSyncDeferringInsetsCallback(final View view) {
        this.deferredInsetTypes = x0.a();
        this.animating = false;
        this.needsSave = false;
        this.view = view;
        this.animationCallback = new AnimationCallback();
        this.insetsListener = new b();
    }
    
    WindowInsetsAnimation$Callback getAnimationCallback() {
        return this.animationCallback;
    }
    
    View$OnApplyWindowInsetsListener getInsetsListener() {
        return (View$OnApplyWindowInsetsListener)this.insetsListener;
    }
    
    void install() {
        io.flutter.plugin.editing.b.a(this.view, (WindowInsetsAnimation$Callback)this.animationCallback);
        this.view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)this.insetsListener);
    }
    
    void remove() {
        io.flutter.plugin.editing.b.a(this.view, (WindowInsetsAnimation$Callback)null);
        this.view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)null);
    }
    
    @Keep
    private class AnimationCallback extends WindowInsetsAnimation$Callback
    {
        final ImeSyncDeferringInsetsCallback this$0;
        
        AnimationCallback(final ImeSyncDeferringInsetsCallback this$0) {
            this.this$0 = this$0;
            super(1);
        }
        
        public void onEnd(final WindowInsetsAnimation windowInsetsAnimation) {
            if (this.this$0.animating && (c.a(windowInsetsAnimation) & this.this$0.deferredInsetTypes) != 0x0) {
                this.this$0.animating = false;
                if (this.this$0.lastWindowInsets != null && this.this$0.view != null) {
                    this.this$0.view.dispatchApplyWindowInsets(this.this$0.lastWindowInsets);
                }
            }
        }
        
        public void onPrepare(final WindowInsetsAnimation windowInsetsAnimation) {
            this.this$0.needsSave = true;
            if ((c.a(windowInsetsAnimation) & this.this$0.deferredInsetTypes) != 0x0) {
                this.this$0.animating = true;
            }
        }
        
        public WindowInsets onProgress(final WindowInsets windowInsets, final List<WindowInsetsAnimation> list) {
            if (this.this$0.animating) {
                if (!this.this$0.needsSave) {
                    final Iterator iterator = list.iterator();
                    boolean b = false;
                    while (iterator.hasNext()) {
                        if ((c.a(d.a(iterator.next())) & this.this$0.deferredInsetTypes) != 0x0) {
                            b = true;
                        }
                    }
                    if (!b) {
                        return windowInsets;
                    }
                    final int windowSystemUiVisibility = this.this$0.view.getWindowSystemUiVisibility();
                    int a;
                    if ((windowSystemUiVisibility & 0x200) == 0x0 && (windowSystemUiVisibility & 0x2) == 0x0) {
                        a = u0.a(t0.a(windowInsets, v0.a()));
                    }
                    else {
                        a = 0;
                    }
                    h.a();
                    final WindowInsets$Builder a2 = g.a(this.this$0.lastWindowInsets);
                    f.a(a2, this.this$0.deferredInsetTypes, e.a(0, 0, 0, Math.max(u0.a(t0.a(windowInsets, this.this$0.deferredInsetTypes)) - a, 0)));
                    this.this$0.view.onApplyWindowInsets(l0.a(a2));
                }
            }
            return windowInsets;
        }
    }
    
    private class b implements View$OnApplyWindowInsetsListener
    {
        final ImeSyncDeferringInsetsCallback a;
        
        private b(final ImeSyncDeferringInsetsCallback a) {
            this.a = a;
        }
        
        public WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
            this.a.view = view;
            if (this.a.needsSave) {
                this.a.lastWindowInsets = windowInsets;
                this.a.needsSave = false;
            }
            if (this.a.animating) {
                return s0.a();
            }
            return view.onApplyWindowInsets(windowInsets);
        }
    }
}
