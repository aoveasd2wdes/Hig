package x1;

import java.util.AbstractCollection;
import android.view.ViewGroup;
import android.content.Intent;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout;
import q1.z;
import n1.h;
import android.widget.FrameLayout;
import java.util.LinkedList;
import android.os.Bundle;

public abstract class a
{
    private c a;
    private Bundle b;
    private LinkedList c;
    private final e d;
    
    public a() {
        this.d = (e)new f(this);
    }
    
    public static void i(final FrameLayout frameLayout) {
        final h l = h.l();
        final Context context = ((View)frameLayout).getContext();
        final int f = l.f(context);
        final String c = z.c(context, f);
        final String b = z.b(context, f);
        final LinearLayout linearLayout = new LinearLayout(((View)frameLayout).getContext());
        linearLayout.setOrientation(1);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        ((ViewGroup)frameLayout).addView((View)linearLayout);
        final TextView textView = new TextView(((View)frameLayout).getContext());
        ((View)textView).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        textView.setText((CharSequence)c);
        ((ViewGroup)linearLayout).addView((View)textView);
        final Intent a = l.a(context, f, (String)null);
        if (a != null) {
            final Button button = new Button(context);
            ((View)button).setId(16908313);
            ((View)button).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
            ((TextView)button).setText((CharSequence)b);
            ((ViewGroup)linearLayout).addView((View)button);
            ((View)button).setOnClickListener((View$OnClickListener)new x1.h(context, a));
        }
    }
    
    private final void n(final int n) {
        while (!((AbstractCollection)this.c).isEmpty() && ((k)this.c.getLast()).b() >= n) {
            this.c.removeLast();
        }
    }
    
    private final void o(final Bundle bundle, final k k) {
        final c a = this.a;
        if (a != null) {
            k.a(a);
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add((Object)k);
        if (bundle != null) {
            final Bundle b = this.b;
            if (b == null) {
                this.b = (Bundle)bundle.clone();
            }
            else {
                b.putAll(bundle);
            }
        }
        this.a(this.d);
    }
    
    protected abstract void a(final e p0);
    
    public c b() {
        return this.a;
    }
    
    public void c(final Bundle bundle) {
        this.o(bundle, (k)new g(this, bundle));
    }
    
    public void d() {
        final c a = this.a;
        if (a != null) {
            a.R();
            return;
        }
        this.n(1);
    }
    
    public void e() {
        this.o(null, (k)new j(this));
    }
    
    public void f(final Bundle bundle) {
        final c a = this.a;
        if (a != null) {
            a.c(bundle);
            return;
        }
        final Bundle b = this.b;
        if (b != null) {
            bundle.putAll(b);
        }
    }
    
    public void g() {
        this.o(null, (k)new i(this));
    }
    
    public void h() {
        final c a = this.a;
        if (a != null) {
            a.H();
            return;
        }
        this.n(4);
    }
}
