package d3;

import java.util.concurrent.Executor;
import android.os.BaseBundle;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.Callable;
import io.flutter.view.u;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.os.SystemClock;
import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import t3.f;
import android.os.Looper;
import android.os.Bundle;
import java.io.File;
import android.content.Context;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import io.flutter.embedding.engine.FlutterJNI;

public class d
{
    private boolean a;
    private c b;
    private long c;
    private d3.b d;
    private FlutterJNI e;
    private ExecutorService f;
    Future g;
    
    public d(final FlutterJNI e, final ExecutorService f) {
        this.a = false;
        this.e = e;
        this.f = f;
    }
    
    static /* synthetic */ e a(final d d, final Context context) {
        d.k(context);
        return null;
    }
    
    private String h(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.d.d);
        sb.append(File.separator);
        sb.append(s);
        return sb.toString();
    }
    
    private e k(final Context context) {
        return null;
    }
    
    private static boolean m(final Bundle bundle) {
        return bundle == null || bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }
    
    public boolean e() {
        return this.d.g;
    }
    
    public void f(final Context context, final String[] array) {
        if (this.a) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.b != null) {
                try {
                    final f h = t3.f.h("FlutterLoader#ensureInitializationComplete");
                    try {
                        final b b = (b)this.g.get();
                        final ArrayList list = new ArrayList();
                        ((List)list).add((Object)"--icu-symbol-prefix=_binary_icudtl_dat");
                        final StringBuilder sb = new StringBuilder();
                        sb.append("--icu-native-lib-path=");
                        sb.append(this.d.f);
                        final String separator = File.separator;
                        sb.append(separator);
                        sb.append("libflutter.so");
                        ((List)list).add((Object)sb.toString());
                        if (array != null) {
                            Collections.addAll((Collection)list, (Object[])array);
                        }
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("--aot-shared-library-name=");
                        sb2.append(this.d.a);
                        ((List)list).add((Object)sb2.toString());
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("--aot-shared-library-name=");
                        sb3.append(this.d.f);
                        sb3.append(separator);
                        sb3.append(this.d.a);
                        ((List)list).add((Object)sb3.toString());
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("--cache-dir-path=");
                        sb4.append(b.b);
                        ((List)list).add((Object)sb4.toString());
                        if (this.d.e != null) {
                            final StringBuilder sb5 = new StringBuilder();
                            sb5.append("--domain-network-policy=");
                            sb5.append(this.d.e);
                            ((List)list).add((Object)sb5.toString());
                        }
                        if (this.b.a() != null) {
                            final StringBuilder sb6 = new StringBuilder();
                            sb6.append("--log-tag=");
                            sb6.append(this.b.a());
                            ((List)list).add((Object)sb6.toString());
                        }
                        final Bundle metaData = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        int int1;
                        if (metaData != null) {
                            int1 = ((BaseBundle)metaData).getInt("io.flutter.embedding.android.OldGenHeapSize");
                        }
                        else {
                            int1 = 0;
                        }
                        int n = int1;
                        if (int1 == 0) {
                            final ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
                            final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
                            activityManager.getMemoryInfo(activityManager$MemoryInfo);
                            n = (int)(activityManager$MemoryInfo.totalMem / 1000000.0 / 2.0);
                        }
                        final StringBuilder sb7 = new StringBuilder();
                        sb7.append("--old-gen-heap-size=");
                        sb7.append(n);
                        ((List)list).add((Object)sb7.toString());
                        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        final int widthPixels = displayMetrics.widthPixels;
                        final int heightPixels = displayMetrics.heightPixels;
                        final StringBuilder sb8 = new StringBuilder();
                        sb8.append("--resource-cache-max-bytes-threshold=");
                        sb8.append(widthPixels * heightPixels * 12 * 4);
                        ((List)list).add((Object)sb8.toString());
                        ((List)list).add((Object)"--prefetched-default-font-manager");
                        if (metaData != null) {
                            if (metaData.getBoolean("io.flutter.embedding.android.EnableImpeller", false)) {
                                ((List)list).add((Object)"--enable-impeller");
                            }
                            if (metaData.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                                ((List)list).add((Object)"--enable-vulkan-validation");
                            }
                            if (metaData.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                                ((List)list).add((Object)"--enable-opengl-gpu-tracing");
                            }
                            if (metaData.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                                ((List)list).add((Object)"--enable-vulkan-gpu-tracing");
                            }
                            final String string = ((BaseBundle)metaData).getString("io.flutter.embedding.android.ImpellerBackend");
                            if (string != null) {
                                final StringBuilder sb9 = new StringBuilder();
                                sb9.append("--impeller-backend=");
                                sb9.append(string);
                                ((List)list).add((Object)sb9.toString());
                            }
                        }
                        String s;
                        if (m(metaData)) {
                            s = "true";
                        }
                        else {
                            s = "false";
                        }
                        final StringBuilder sb10 = new StringBuilder();
                        sb10.append("--leak-vm=");
                        sb10.append(s);
                        ((List)list).add((Object)sb10.toString());
                        this.e.init(context, (String[])((List)list).toArray((Object[])new String[0]), null, b.a, b.b, SystemClock.uptimeMillis() - this.c);
                        this.a = true;
                        if (h != null) {
                            h.close();
                        }
                        return;
                    }
                    finally {
                        if (h != null) {
                            try {
                                h.close();
                            }
                            finally {
                                final Throwable t;
                                ((Throwable)context).addSuppressed(t);
                            }
                        }
                    }
                }
                catch (final Exception ex) {
                    a3.b.c("FlutterLoader", "Flutter initialization failed.", (Throwable)ex);
                    throw new RuntimeException((Throwable)ex);
                }
            }
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
    }
    
    public String g() {
        return this.d.d;
    }
    
    public String i(final String s) {
        return this.h(s);
    }
    
    public String j(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("packages");
        final String separator = File.separator;
        sb.append(separator);
        sb.append(s2);
        sb.append(separator);
        sb.append(s);
        return this.i(sb.toString());
    }
    
    public boolean l() {
        return this.a;
    }
    
    public void n(final Context context) {
        this.o(context, new c());
    }
    
    public void o(Context applicationContext, final c b) {
        if (this.b != null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            final f h = t3.f.h("FlutterLoader#startInitialization");
            try {
                applicationContext = ((Context)applicationContext).getApplicationContext();
                this.b = b;
                this.c = SystemClock.uptimeMillis();
                this.d = d3.a.e((Context)applicationContext);
                u.f((DisplayManager)((Context)applicationContext).getSystemService("display"), this.e).g();
                this.g = this.f.submit((Callable)new Callable(this, applicationContext) {
                    final Context a;
                    final d b;
                    
                    public b b() {
                        final f h = t3.f.h("FlutterLoader initTask");
                        try {
                            d3.d.a(this.b, this.a);
                            try {
                                this.b.e.loadLibrary();
                                this.b.e.updateRefreshRate();
                                ((Executor)this.b.f).execute((Runnable)new d3.c(this));
                                final b b = new b(t3.c.d(this.a), t3.c.a(this.a), t3.c.c(this.a));
                                if (h != null) {
                                    h.close();
                                }
                                return b;
                            }
                            catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
                                if (!unsatisfiedLinkError.toString().contains((CharSequence)"couldn't find \"libflutter.so\"") && !unsatisfiedLinkError.toString().contains((CharSequence)"dlopen failed: library \"libflutter.so\" not found")) {
                                    throw unsatisfiedLinkError;
                                }
                                final String property = System.getProperty("os.arch");
                                final File file = new File(this.b.d.f);
                                final String[] list = file.list();
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                                sb.append(property);
                                sb.append(", and the native libraries directory (with path ");
                                sb.append(file.getAbsolutePath());
                                sb.append(") contains the following files: ");
                                sb.append(Arrays.toString((Object[])list));
                                throw new UnsupportedOperationException(sb.toString(), (Throwable)unsatisfiedLinkError);
                            }
                        }
                        finally {
                            if (h != null) {
                                try {
                                    h.close();
                                }
                                finally {
                                    final Throwable t;
                                    final Throwable t2;
                                    t.addSuppressed(t2);
                                }
                            }
                        }
                    }
                });
                if (h != null) {
                    h.close();
                }
                return;
            }
            finally {
                if (h != null) {
                    try {
                        h.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)applicationContext).addSuppressed(t);
                    }
                }
            }
        }
        throw new IllegalStateException("startInitialization must be called on the main thread");
    }
    
    private static class b
    {
        final String a;
        final String b;
        final String c;
        
        private b(final String a, final String b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static class c
    {
        private String a;
        
        public String a() {
            return this.a;
        }
    }
}
