package q3;

import java.util.concurrent.Executor;
import java.util.Map;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import java.io.IOException;
import java.util.UUID;
import android.os.Build$VERSION;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.ActivityNotFoundException;
import android.os.Parcelable;
import e.e$d;
import java.io.Serializable;
import e.e$b;
import e.e;
import e.e$e;
import e.e$c;
import d.a$a;
import java.util.ArrayList;
import android.content.Intent;
import java.util.concurrent.Executors;
import android.media.MediaScannerConnection$OnScanCompletedListener;
import android.media.MediaScannerConnection;
import java.io.File;
import androidx.core.content.a;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ExecutorService;
import android.app.Activity;
import k3.n;
import k3.m;

public class l implements m, n
{
    final String c;
    private final Activity d;
    private final q e;
    private final c f;
    private final l$h g;
    private final l$d h;
    private final b i;
    private final ExecutorService j;
    private l.l$c k;
    private Uri l;
    private l.l$g m;
    private final Object n;
    
    public l(final Activity activity, final q q, final c c) {
        this(activity, q, null, null, null, c, (l$h)new l$h(activity) {
            final Activity a;
            
            public boolean a() {
                return p.e((Context)this.a);
            }
            
            public boolean b(final String s) {
                return androidx.core.content.a.a((Context)this.a, s) == 0;
            }
            
            public void c(final String s, final int n) {
                androidx.core.app.a.j(this.a, new String[] { s }, n);
            }
        }, (l$d)new l$d(activity) {
            final Activity a;
            
            public Uri a(final String s, final File file) {
                return androidx.core.content.b.h((Context)this.a, s, file);
            }
            
            public void b(final Uri uri, final l$f l$f) {
                final Activity a = this.a;
                String path;
                if (uri != null) {
                    path = uri.getPath();
                }
                else {
                    path = "";
                }
                MediaScannerConnection.scanFile((Context)a, new String[] { path }, (String[])null, (MediaScannerConnection$OnScanCompletedListener)new q3.m(l$f));
            }
        }, new b(), Executors.newSingleThreadExecutor());
    }
    
    l(final Activity d, final q e, final r$g r$g, final r$n r$n, final r$j r$j, final c f, final l$h g, final l$d h, final b i, final ExecutorService j) {
        this.n = new Object();
        this.d = d;
        this.e = e;
        final StringBuilder sb = new StringBuilder();
        sb.append(((Context)d).getPackageName());
        sb.append(".flutter.image_provider");
        this.c = sb.toString();
        if (r$j != null) {
            this.m = new l.l$g(r$g, r$n, r$j);
        }
        this.g = g;
        this.h = h;
        this.i = i;
        this.f = f;
        this.j = j;
    }
    
    private void A(final int n, final Intent intent) {
        if (n != -1 || intent == null) {
            this.u(null);
            return;
        }
        final ArrayList v = this.v(intent, false);
        if (v == null) {
            this.s("no_valid_image_uri", "Cannot find the selected image.");
            return;
        }
        this.F(v);
    }
    
    private void B(final int n, final Intent intent) {
        if (n != -1 || intent == null) {
            this.u(null);
            return;
        }
        final ArrayList v = this.v(intent, true);
        if (v == null) {
            this.s("no_valid_media_uri", "Cannot find the selected media.");
            return;
        }
        this.F(v);
    }
    
    private void C(final int n, final Intent intent) {
        if (n != -1 || intent == null) {
            this.u(null);
            return;
        }
        final ArrayList v = this.v(intent, false);
        if (v == null) {
            this.s("missing_valid_image_uri", "Cannot find at least one of the selected images.");
            return;
        }
        this.F(v);
    }
    
    private void D(final int n, final Intent intent) {
        if (n != -1 || intent == null) {
            this.u(null);
            return;
        }
        final ArrayList v = this.v(intent, false);
        if (v != null && v.size() >= 1) {
            this.u(((l.l$e)v.get(0)).a);
            return;
        }
        this.s("no_valid_video_uri", "Cannot find the selected video.");
    }
    
    private void F(final ArrayList list) {
        final Object n = this.n;
        synchronized (n) {
            final l.l$g m = this.m;
            r$g a;
            if (m != null) {
                a = m.a;
            }
            else {
                a = null;
            }
            monitorexit(n);
            final ArrayList list2 = new ArrayList();
            int i = 0;
            final int n2 = 0;
            if (a != null) {
                for (int j = n2; j < list.size(); ++j) {
                    final l.l$e l$e = (l.l$e)list.get(j);
                    String s = l$e.a;
                    final String b = l$e.b;
                    if (b == null || !b.startsWith("video/")) {
                        s = this.w(l$e.a, a);
                    }
                    list2.add((Object)s);
                }
            }
            else {
                while (i < list.size()) {
                    list2.add((Object)((l.l$e)list.get(i)).a);
                    ++i;
                }
            }
            this.t(list2);
        }
    }
    
    private void N(final Boolean b, final int n) {
        Intent a;
        if (b) {
            a = new e.c(n).a((Context)this.d, new a$a().b((e$e)e$c.a).a());
        }
        else {
            a = new Intent("android.intent.action.GET_CONTENT");
            a.setType("image/*");
            a.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        this.d.startActivityForResult(a, 2346);
    }
    
    private void O(final Boolean b) {
        Intent a;
        if (b) {
            a = new e().a((Context)this.d, new a$a().b((e$e)e$c.a).a());
        }
        else {
            a = new Intent("android.intent.action.GET_CONTENT");
            a.setType("image/*");
        }
        this.d.startActivityForResult(a, 2342);
    }
    
    private void P(final r$e r$e) {
        Intent intent;
        if (r$e.d()) {
            if (r$e.b()) {
                intent = new e.c(p.a(r$e)).a((Context)this.d, new a$a().b((e$e)e$b.a).a());
            }
            else {
                intent = new e().a((Context)this.d, new a$a().b((e$e)e$b.a).a());
            }
        }
        else {
            final Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.setType("*/*");
            intent2.putExtra("CONTENT_TYPE", new String[] { "video/*", "image/*" });
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", (Serializable)r$e.b());
            intent = intent2;
        }
        this.d.startActivityForResult(intent, 2347);
    }
    
    private void Q(final Boolean b) {
        Intent a;
        if (b) {
            a = new e().a((Context)this.d, new a$a().b((e$e)e$d.a).a());
        }
        else {
            a = new Intent("android.intent.action.GET_CONTENT");
            a.setType("video/*");
        }
        this.d.startActivityForResult(a, 2352);
    }
    
    private void R() {
        final Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.k == q3.l.l$c.f) {
            this.b0(intent);
        }
        final File p = this.p();
        final StringBuilder sb = new StringBuilder();
        sb.append("file:");
        sb.append(p.getAbsolutePath());
        this.l = Uri.parse(sb.toString());
        final Uri a = this.h.a(this.c, p);
        intent.putExtra("output", (Parcelable)a);
        this.x(intent, a);
        try {
            this.d.startActivityForResult(intent, 2343);
        }
        catch (final ActivityNotFoundException ex) {
            try {
                p.delete();
            }
            catch (final SecurityException ex2) {
                ((Throwable)ex2).printStackTrace();
            }
            this.s("no_available_camera", "No cameras available for taking pictures.");
        }
    }
    
    private void S() {
        final Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        final Object n = this.n;
        synchronized (n) {
            final l.l$g m = this.m;
            r$n b;
            if (m != null) {
                b = m.b;
            }
            else {
                b = null;
            }
            monitorexit(n);
            if (b != null && b.b() != null) {
                intent.putExtra("android.intent.extra.durationLimit", b.b().intValue());
            }
            if (this.k == q3.l.l$c.f) {
                this.b0(intent);
            }
            final File q = this.q();
            final StringBuilder sb = new StringBuilder();
            sb.append("file:");
            sb.append(q.getAbsolutePath());
            this.l = Uri.parse(sb.toString());
            final Uri a = this.h.a(this.c, q);
            intent.putExtra("output", (Parcelable)a);
            this.x(intent, a);
            try {
                this.d.startActivityForResult(intent, 2353);
            }
            catch (final ActivityNotFoundException ex) {
                try {
                    q.delete();
                }
                catch (final SecurityException ex2) {
                    ((Throwable)ex2).printStackTrace();
                }
                this.s("no_available_camera", "No cameras available for taking pictures.");
            }
        }
    }
    
    private boolean T() {
        final l$h g = this.g;
        return g != null && g.a();
    }
    
    private static List U(final PackageManager packageManager, final Intent intent) {
        return packageManager.queryIntentActivities(intent, 65536);
    }
    
    private boolean Y(final r$g r$g, final r$n r$n, final r$j r$j) {
        final Object n = this.n;
        synchronized (n) {
            if (this.m != null) {
                return false;
            }
            this.m = new l.l$g(r$g, r$n, r$j);
            monitorexit(n);
            this.f.a();
            return true;
        }
    }
    
    private void b0(final Intent intent) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 22) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            if (sdk_INT >= 26) {
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
        }
        else {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
        }
    }
    
    private File o(final String s) {
        final String string = UUID.randomUUID().toString();
        final File cacheDir = ((Context)this.d).getCacheDir();
        try {
            cacheDir.mkdirs();
            return File.createTempFile(string, s, cacheDir);
        }
        catch (final IOException ex) {
            throw new RuntimeException((Throwable)ex);
        }
    }
    
    private File p() {
        return this.o(".jpg");
    }
    
    private File q() {
        return this.o(".mp4");
    }
    
    private void r(final r$j r$j) {
        r$j.b((Throwable)new r$d("already_active", "Image picker is already active", (Object)null));
    }
    
    private void s(final String s, final String s2) {
        final Object n = this.n;
        synchronized (n) {
            final l.l$g m = this.m;
            r$j c;
            if (m != null) {
                c = m.c;
            }
            else {
                c = null;
            }
            this.m = null;
            monitorexit(n);
            if (c == null) {
                this.f.f((ArrayList)null, s, s2);
            }
            else {
                c.b((Throwable)new r$d(s, s2, (Object)null));
            }
        }
    }
    
    private void t(final ArrayList list) {
        final Object n = this.n;
        synchronized (n) {
            final l.l$g m = this.m;
            r$j c;
            if (m != null) {
                c = m.c;
            }
            else {
                c = null;
            }
            this.m = null;
            monitorexit(n);
            if (c == null) {
                this.f.f(list, (String)null, (String)null);
            }
            else {
                c.a((Object)list);
            }
        }
    }
    
    private void u(final String s) {
        final ArrayList list = new ArrayList();
        if (s != null) {
            list.add((Object)s);
        }
        final Object n = this.n;
        synchronized (n) {
            final l.l$g m = this.m;
            r$j c;
            if (m != null) {
                c = m.c;
            }
            else {
                c = null;
            }
            this.m = null;
            monitorexit(n);
            if (c == null) {
                if (!list.isEmpty()) {
                    this.f.f(list, (String)null, (String)null);
                }
            }
            else {
                c.a((Object)list);
            }
        }
    }
    
    private ArrayList v(final Intent intent, final boolean b) {
        final ArrayList list = new ArrayList();
        final Uri data = intent.getData();
        if (data == null) {
            if (intent.getClipData() == null) {
                return null;
            }
            for (int i = 0; i < intent.getClipData().getItemCount(); ++i) {
                final Uri uri = intent.getClipData().getItemAt(i).getUri();
                if (uri == null) {
                    return null;
                }
                final String e = this.i.e((Context)this.d, uri);
                if (e == null) {
                    return null;
                }
                String type;
                if (b) {
                    type = ((Context)this.d).getContentResolver().getType(uri);
                }
                else {
                    type = null;
                }
                list.add((Object)new l.l$e(this, e, type));
            }
        }
        else {
            final String e2 = this.i.e((Context)this.d, data);
            if (e2 == null) {
                return null;
            }
            list.add((Object)new l.l$e(this, e2, (String)null));
        }
        return list;
    }
    
    private String w(final String s, final r$g r$g) {
        return this.e.j(s, r$g.c(), r$g.b(), r$g.d().intValue());
    }
    
    private void x(final Intent intent, final Uri uri) {
        final PackageManager packageManager = ((Context)this.d).getPackageManager();
        List list;
        if (Build$VERSION.SDK_INT >= 33) {
            list = n3.b.a(packageManager, intent, n3.a.a(65536L));
        }
        else {
            list = U(packageManager, intent);
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((Context)this.d).grantUriPermission(((ResolveInfo)iterator.next()).activityInfo.packageName, uri, 3);
        }
    }
    
    private void y(final int n) {
        if (n == -1) {
            Uri uri = this.l;
            final l$d h = this.h;
            if (uri == null) {
                uri = Uri.parse(this.f.c());
            }
            h.b(uri, (l$f)new j(this));
            return;
        }
        this.u(null);
    }
    
    private void z(final int n) {
        if (n == -1) {
            Uri uri = this.l;
            final l$d h = this.h;
            if (uri == null) {
                uri = Uri.parse(this.f.c());
            }
            h.b(uri, (l$f)new k(this));
            return;
        }
        this.u(null);
    }
    
    void E(final String s, final boolean b) {
        final Object n = this.n;
        synchronized (n) {
            final l.l$g m = this.m;
            r$g a;
            if (m != null) {
                a = m.a;
            }
            else {
                a = null;
            }
            monitorexit(n);
            if (a != null) {
                final String w = this.w(s, a);
                if (w != null && !w.equals((Object)s) && b) {
                    new File(s).delete();
                }
                this.u(w);
            }
            else {
                this.u(s);
            }
        }
    }
    
    r$b V() {
        final Map b = this.f.b();
        if (b.isEmpty()) {
            return null;
        }
        final r$b$a r$b$a = new r$b$a();
        final r$c r$c = (r$c)b.get((Object)"type");
        if (r$c != null) {
            r$b$a.d(r$c);
        }
        r$b$a.b((r$a)b.get((Object)"error"));
        final ArrayList list = (ArrayList)b.get((Object)"pathList");
        if (list != null) {
            final ArrayList list2 = new ArrayList();
            for (final String s : list) {
                final Double n = (Double)b.get((Object)"maxWidth");
                final Double n2 = (Double)b.get((Object)"maxHeight");
                final Integer n3 = (Integer)b.get((Object)"imageQuality");
                int intValue;
                if (n3 == null) {
                    intValue = 100;
                }
                else {
                    intValue = n3;
                }
                list2.add((Object)this.e.j(s, n, n2, intValue));
            }
            r$b$a.c((List)list2);
        }
        this.f.a();
        return r$b$a.a();
    }
    
    void W() {
        final Object n = this.n;
        synchronized (n) {
            final l.l$g m = this.m;
            if (m == null) {
                return;
            }
            final r$g a = m.a;
            monitorexit(n);
            final c f = this.f;
            c$b c$b;
            if (a != null) {
                c$b = q3.c$b.e;
            }
            else {
                c$b = q3.c$b.f;
            }
            f.g(c$b);
            if (a != null) {
                this.f.d(a);
            }
            final Uri l = this.l;
            if (l != null) {
                this.f.e(l);
            }
        }
    }
    
    void X(final l.l$c k) {
        this.k = k;
    }
    
    public void Z(final r$g r$g, final r$j r$j) {
        if (!this.Y(r$g, null, r$j)) {
            this.r(r$j);
            return;
        }
        if (this.T() && !this.g.b("android.permission.CAMERA")) {
            this.g.c("android.permission.CAMERA", 2345);
            return;
        }
        this.R();
    }
    
    public boolean a(final int n, final int n2, final Intent intent) {
        Object o;
        if (n != 2342) {
            if (n != 2343) {
                if (n != 2346) {
                    if (n != 2347) {
                        if (n != 2352) {
                            if (n != 2353) {
                                return false;
                            }
                            o = new i(this, n2);
                        }
                        else {
                            o = new h(this, n2, intent);
                        }
                    }
                    else {
                        o = new g(this, n2, intent);
                    }
                }
                else {
                    o = new q3.e(this, n2, intent);
                }
            }
            else {
                o = new f(this, n2);
            }
        }
        else {
            o = new d(this, n2, intent);
        }
        ((Executor)this.j).execute((Runnable)o);
        return true;
    }
    
    public void a0(final r$n r$n, final r$j r$j) {
        if (!this.Y(null, r$n, r$j)) {
            this.r(r$j);
            return;
        }
        if (this.T() && !this.g.b("android.permission.CAMERA")) {
            this.g.c("android.permission.CAMERA", 2355);
            return;
        }
        this.S();
    }
    
    public boolean d(final int n, final String[] array, final int[] array2) {
        final boolean b = array2.length > 0 && array2[0] == 0;
        if (n != 2345) {
            if (n != 2355) {
                return false;
            }
            if (b) {
                this.S();
            }
        }
        else if (b) {
            this.R();
        }
        if (!b) {
            if (n == 2345 || n == 2355) {
                this.s("camera_access_denied", "The user did not allow camera access.");
            }
        }
        return true;
    }
    
    public void k(final r$g r$g, final boolean b, final r$j r$j) {
        if (!this.Y(r$g, null, r$j)) {
            this.r(r$j);
            return;
        }
        this.O(b);
    }
    
    public void l(final r$h r$h, final r$e r$e, final r$j r$j) {
        if (!this.Y(r$h.b(), null, r$j)) {
            this.r(r$j);
            return;
        }
        this.P(r$e);
    }
    
    public void m(final r$g r$g, final boolean b, final int n, final r$j r$j) {
        if (!this.Y(r$g, null, r$j)) {
            this.r(r$j);
            return;
        }
        this.N(b, n);
    }
    
    public void n(final r$n r$n, final boolean b, final r$j r$j) {
        if (!this.Y(null, r$n, r$j)) {
            this.r(r$j);
            return;
        }
        this.Q(b);
    }
}
