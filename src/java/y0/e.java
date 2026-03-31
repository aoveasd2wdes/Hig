package y0;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import android.content.Context;
import android.app.Activity;
import i4.l;
import u0.a;
import v0.d;

public final class e
{
    private final ClassLoader a;
    private final d b;
    private final a c;
    
    public e(final ClassLoader a, final d b) {
        l.e((Object)a, "loader");
        l.e((Object)b, "consumerAdapter");
        this.a = a;
        this.b = b;
        this.c = new a(a);
    }
    
    private final boolean e() {
        final boolean n = this.n();
        boolean b = false;
        if (!n) {
            return false;
        }
        final int a = v0.e.a.a();
        boolean b2 = true;
        if (a == 1) {
            b = this.i();
        }
        else {
            if (2 > a || a > Integer.MAX_VALUE) {
                b2 = false;
            }
            if (b2) {
                b = this.j();
            }
        }
        return b;
    }
    
    private final Class f() {
        final Class loadClass = this.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        l.d((Object)loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        return loadClass;
    }
    
    private final Class h() {
        final Class loadClass = this.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        l.d((Object)loadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        return loadClass;
    }
    
    private final boolean k() {
        return d1.a.e("FoldingFeature class is not valid", (h4.a)new e$a(this));
    }
    
    private final boolean l() {
        final StringBuilder sb = new StringBuilder();
        sb.append("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Activity.class.getName());
        sb.append(", java.util.function.Consumer) is not valid");
        return d1.a.e(sb.toString(), (h4.a)new e$b(this));
    }
    
    private final boolean m() {
        final StringBuilder sb = new StringBuilder();
        sb.append("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return d1.a.e(sb.toString(), (h4.a)new e$c(this));
    }
    
    private final boolean o() {
        return d1.a.e("WindowExtensions#getWindowLayoutComponent is not valid", (h4.a)new e$d(this));
    }
    
    public final WindowLayoutComponent g() {
        final boolean e = this.e();
        WindowLayoutComponent windowLayoutComponent = null;
        if (!e) {
            return windowLayoutComponent;
        }
        try {
            windowLayoutComponent = WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            return windowLayoutComponent;
        }
        catch (final UnsupportedOperationException ex) {
            windowLayoutComponent = windowLayoutComponent;
            return windowLayoutComponent;
        }
    }
    
    public final boolean i() {
        return this.l();
    }
    
    public final boolean j() {
        return this.i() && this.m();
    }
    
    public final boolean n() {
        return this.c.f() && this.o() && this.k();
    }
}
