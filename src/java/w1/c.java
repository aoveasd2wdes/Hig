package w1;

import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import android.content.Context;

public class c
{
    protected final Context a;
    
    public c(final Context a) {
        this.a = a;
    }
    
    public ApplicationInfo a(final String s, final int n) {
        return this.a.getPackageManager().getApplicationInfo(s, n);
    }
    
    public CharSequence b(final String s) {
        final Context a = this.a;
        return a.getPackageManager().getApplicationLabel(a.getPackageManager().getApplicationInfo(s, 0));
    }
    
    public PackageInfo c(final String s, final int n) {
        return this.a.getPackageManager().getPackageInfo(s, n);
    }
}
