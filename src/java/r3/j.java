package r3;

import f3.a$b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import android.util.Log;
import k3.c;
import android.content.Context;
import f3.a;

public class j implements a, i$a
{
    private Context c;
    
    private void j(final c c, final Context c2) {
        try {
            h.j(c, (i$a)this);
        }
        catch (final Exception ex) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", (Throwable)ex);
        }
        this.c = c2;
    }
    
    public String a() {
        return this.c.getCacheDir().getPath();
    }
    
    public String b() {
        return this.c.getCacheDir().getPath();
    }
    
    public String c() {
        return t3.c.c(this.c);
    }
    
    public List d() {
        final ArrayList list = new ArrayList();
        for (final File file : this.c.getExternalCacheDirs()) {
            if (file != null) {
                ((List)list).add((Object)file.getAbsolutePath());
            }
        }
        return (List)list;
    }
    
    public String e() {
        final File externalFilesDir = this.c.getExternalFilesDir((String)null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }
    
    public String f() {
        return t3.c.d(this.c);
    }
    
    public void g(final a$b a$b) {
        this.j(a$b.b(), a$b.a());
    }
    
    public List h(final i$c i$c) {
        final ArrayList list = new ArrayList();
        for (final File file : this.c.getExternalFilesDirs(this.i(i$c))) {
            if (file != null) {
                ((List)list).add((Object)file.getAbsolutePath());
            }
        }
        return (List)list;
    }
    
    String i(final i$c i$c) {
        switch (j$a.a[((Enum)i$c).ordinal()]) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized directory: ");
                sb.append((Object)i$c);
                throw new RuntimeException(sb.toString());
            }
            case 11: {
                return "documents";
            }
            case 10: {
                return "dcim";
            }
            case 9: {
                return "downloads";
            }
            case 8: {
                return "movies";
            }
            case 7: {
                return "pictures";
            }
            case 6: {
                return "notifications";
            }
            case 5: {
                return "alarms";
            }
            case 4: {
                return "ringtones";
            }
            case 3: {
                return "podcasts";
            }
            case 2: {
                return "music";
            }
            case 1: {
                return null;
            }
        }
    }
    
    public void k(final a$b a$b) {
        h.j(a$b.b(), (i$a)null);
    }
}
