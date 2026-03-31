package v0;

import androidx.window.extensions.WindowExtensionsProvider;
import i4.x;

public final class e
{
    public static final e a;
    private static final String b;
    
    static {
        a = new e();
        b = x.b((Class)e.class).b();
    }
    
    private e() {
    }
    
    public final int a() {
        final boolean b = false;
        int vendorApiLevel;
        try {
            vendorApiLevel = WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        }
        catch (final UnsupportedOperationException ex) {
            vendorApiLevel = (b ? 1 : 0);
            if (c.a.a() == j.f) {
                final String s = e.b;
            }
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {
            vendorApiLevel = (b ? 1 : 0);
            if (c.a.a() == j.f) {
                final String s = e.b;
                goto Label_0037;
            }
        }
        return vendorApiLevel;
    }
}
