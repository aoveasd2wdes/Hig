package l;

import android.content.res.Configuration;
import android.content.Context;

public class a
{
    private Context a;
    
    private a(final Context a) {
        this.a = a;
    }
    
    public static a a(final Context context) {
        return new a(context);
    }
    
    public int b() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }
    
    public int c() {
        final Configuration configuration = this.a.getResources().getConfiguration();
        final int screenWidthDp = configuration.screenWidthDp;
        final int screenHeightDp = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || screenWidthDp > 600 || (screenWidthDp > 960 && screenHeightDp > 720) || (screenWidthDp > 720 && screenHeightDp > 960)) {
            return 5;
        }
        if (screenWidthDp >= 500 || (screenWidthDp > 640 && screenHeightDp > 480) || (screenWidthDp > 480 && screenHeightDp > 640)) {
            return 4;
        }
        if (screenWidthDp >= 360) {
            return 3;
        }
        return 2;
    }
    
    public boolean d() {
        return true;
    }
}
