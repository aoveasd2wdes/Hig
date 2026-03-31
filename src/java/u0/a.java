package u0;

import i4.l;

public final class a
{
    private final ClassLoader a;
    
    public a(final ClassLoader a) {
        l.e((Object)a, "loader");
        this.a = a;
    }
    
    private final Class d() {
        final Class loadClass = this.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        l.d((Object)loadClass, "loader.loadClass(WindowE\u2026XTENSIONS_PROVIDER_CLASS)");
        return loadClass;
    }
    
    private final boolean e() {
        return d1.a.a.a((h4.a)new a$a(this));
    }
    
    public final Class c() {
        final Class loadClass = this.a.loadClass("androidx.window.extensions.WindowExtensions");
        l.d((Object)loadClass, "loader.loadClass(WindowE\u2026.WINDOW_EXTENSIONS_CLASS)");
        return loadClass;
    }
    
    public final boolean f() {
        return this.e() && d1.a.e("WindowExtensionsProvider#getWindowExtensions is not valid", (h4.a)new a$b(this));
    }
}
