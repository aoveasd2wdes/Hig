package e;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import i4.l;
import android.content.Intent;
import android.content.Context;
import i4.g;

public class e extends a
{
    public static final e.e$a a;
    
    static {
        a = new e.e$a((g)null);
    }
    
    public static final boolean b() {
        return e.a.f();
    }
    
    public Intent a(final Context context, final d.a a) {
        l.e((Object)context, "context");
        l.e((Object)a, "input");
        final e.e$a a2 = e.a;
        Intent intent;
        if (a2.f()) {
            intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(a2.c(a.a()));
        }
        else {
            ActivityInfo activityInfo;
            if (a2.e(context)) {
                final ResolveInfo b = a2.b(context);
                if (b == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                activityInfo = b.activityInfo;
                intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            }
            else if (a2.d(context)) {
                final ResolveInfo a3 = a2.a(context);
                if (a3 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                activityInfo = a3.activityInfo;
                intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            }
            else {
                final Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.setType(a2.c(a.a()));
                intent = intent2;
                if (intent2.getType() == null) {
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[] { "image/*", "video/*" });
                    intent = intent2;
                    return intent;
                }
                return intent;
            }
            intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent.setType(a2.c(a.a()));
        }
        return intent;
    }
    
    public static final class b implements e$e
    {
        public static final b a;
        
        static {
            a = new b();
        }
        
        private b() {
        }
    }
    
    public static final class c implements e$e
    {
        public static final c a;
        
        static {
            a = new c();
        }
        
        private c() {
        }
    }
    
    public static final class d implements e$e
    {
        public static final d a;
        
        static {
            a = new d();
        }
        
        private d() {
        }
    }
}
