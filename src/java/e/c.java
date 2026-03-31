package e;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import i4.l;
import android.content.Intent;
import android.content.Context;
import i4.g;

public class c extends a
{
    public static final c.c$a b;
    private final int a;
    
    static {
        b = new c.c$a((g)null);
    }
    
    public c(int a) {
        this.a = a;
        final int n = 1;
        if (a > 1) {
            a = n;
        }
        else {
            a = 0;
        }
        if (a != 0) {
            return;
        }
        throw new IllegalArgumentException("Max items must be higher than 1".toString());
    }
    
    public Intent a(final Context context, final d.a a) {
        l.e((Object)context, "context");
        l.e((Object)a, "input");
        final e.e$a a2 = e.a;
        final boolean f = a2.f();
        boolean b = true;
        Intent intent;
        if (f) {
            intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(a2.c(a.a()));
            if (this.a > e.b.a()) {
                b = false;
            }
            if (!b) {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.a);
        }
        else if (a2.e(context)) {
            final ResolveInfo b2 = a2.b(context);
            if (b2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            final ActivityInfo activityInfo = b2.activityInfo;
            intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent.setType(a2.c(a.a()));
            intent.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", this.a);
        }
        else if (a2.d(context)) {
            final ResolveInfo a3 = a2.a(context);
            if (a3 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            final ActivityInfo activityInfo2 = a3.activityInfo;
            intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.a);
        }
        else {
            final Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(a2.c(a.a()));
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent = intent2;
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[] { "image/*", "video/*" });
                intent = intent2;
            }
        }
        return intent;
    }
}
