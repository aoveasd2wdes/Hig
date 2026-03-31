package io.flutter.plugin.platform;

import android.view.ViewGroup;
import android.app.Dialog;
import android.app.AlertDialog;
import android.view.inputmethod.InputMethodManager;
import android.content.ContextWrapper;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import a3.b;
import android.content.MutableContextWrapper;
import android.view.WindowManager;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.content.Context;
import android.view.View$OnFocusChangeListener;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import android.app.Presentation;

@Keep
class SingleViewPresentation extends Presentation
{
    private static final String TAG = "PlatformViewsController";
    private final io.flutter.plugin.platform.a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View$OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused;
    private final d state;
    private int viewId;
    
    public SingleViewPresentation(final Context outerContext, final Display display, final io.flutter.plugin.platform.a accessibilityEventsDelegate, final d state, final View$OnFocusChangeListener focusChangeListener, final boolean startFocused) {
        super((Context)new b(outerContext), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.state = state;
        this.focusChangeListener = focusChangeListener;
        this.outerContext = outerContext;
        ((Dialog)this).getWindow().setFlags(8, 8);
        this.startFocused = startFocused;
    }
    
    public SingleViewPresentation(final Context outerContext, final Display display, final l l, final io.flutter.plugin.platform.a accessibilityEventsDelegate, final int viewId, final View$OnFocusChangeListener focusChangeListener) {
        super((Context)new b(outerContext), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.viewId = viewId;
        this.focusChangeListener = focusChangeListener;
        this.outerContext = outerContext;
        (this.state = new d()).a = l;
        ((Dialog)this).getWindow().setFlags(8, 8);
        ((Dialog)this).getWindow().setType(2030);
    }
    
    public d detachState() {
        final FrameLayout container = this.container;
        if (container != null) {
            ((ViewGroup)container).removeAllViews();
        }
        final a rootView = this.rootView;
        if (rootView != null) {
            ((ViewGroup)rootView).removeAllViews();
        }
        return this.state;
    }
    
    public l getView() {
        return this.state.a;
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((Dialog)this).getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
        if (this.state.c == null) {
            this.state.c = new a0(((Dialog)this).getContext());
        }
        if (this.state.b == null) {
            final WindowManager windowManager = (WindowManager)((Dialog)this).getContext().getSystemService("window");
            final d state = this.state;
            state.b = new k0(windowManager, state.c);
        }
        this.container = new FrameLayout(((Dialog)this).getContext());
        final c baseContext = new c(((Dialog)this).getContext(), this.state.b, this.outerContext);
        final View x = this.state.a.X();
        if (x.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper)x.getContext()).setBaseContext((Context)baseContext);
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unexpected platform view context for view ID ");
            sb.append(this.viewId);
            sb.append("; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
            a3.b.g("PlatformViewsController", sb.toString());
        }
        ((ViewGroup)this.container).addView(x);
        ((ViewGroup)(this.rootView = new a(((Dialog)this).getContext(), this.accessibilityEventsDelegate, x))).addView((View)this.container);
        ((ViewGroup)this.rootView).addView((View)this.state.c);
        x.setOnFocusChangeListener(this.focusChangeListener);
        ((View)this.rootView).setFocusableInTouchMode(true);
        if (this.startFocused) {
            x.requestFocus();
        }
        else {
            ((View)this.rootView).requestFocus();
        }
        ((Dialog)this).setContentView((View)this.rootView);
    }
    
    private static class a extends FrameLayout
    {
        private final io.flutter.plugin.platform.a c;
        private final View d;
        
        public a(final Context context, final io.flutter.plugin.platform.a c, final View d) {
            super(context);
            this.c = c;
            this.d = d;
        }
        
        public boolean requestSendAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
            return this.c.b(this.d, view, accessibilityEvent);
        }
    }
    
    private static class b extends ContextWrapper
    {
        private final InputMethodManager a;
        
        b(final Context context) {
            this(context, null);
        }
        
        private b(final Context context, InputMethodManager a) {
            super(context);
            if (a == null) {
                a = (InputMethodManager)context.getSystemService("input_method");
            }
            this.a = a;
        }
        
        public Context createDisplayContext(final Display display) {
            return (Context)new b(super.createDisplayContext(display), this.a);
        }
        
        public Object getSystemService(final String s) {
            if ("input_method".equals((Object)s)) {
                return this.a;
            }
            return super.getSystemService(s);
        }
    }
    
    private static class c extends ContextWrapper
    {
        private final k0 a;
        private WindowManager b;
        private final Context c;
        
        c(final Context context, final k0 a, final Context c) {
            super(context);
            this.a = a;
            this.c = c;
        }
        
        private WindowManager a() {
            if (this.b == null) {
                this.b = (WindowManager)this.a;
            }
            return this.b;
        }
        
        private boolean b() {
            final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int n = 0; n < stackTrace.length && n < 11; ++n) {
                if (stackTrace[n].getClassName().equals((Object)AlertDialog.class.getCanonicalName()) && stackTrace[n].getMethodName().equals((Object)"<init>")) {
                    return true;
                }
            }
            return false;
        }
        
        public Object getSystemService(final String s) {
            if (!"window".equals((Object)s)) {
                return super.getSystemService(s);
            }
            if (this.b()) {
                return this.c.getSystemService(s);
            }
            return this.a();
        }
    }
    
    static class d
    {
        private l a;
        private k0 b;
        private a0 c;
    }
}
