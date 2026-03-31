package t;

import android.database.Cursor;
import android.net.Uri;
import android.content.ContentUris;
import android.net.Uri$Builder;
import java.util.Collection;
import java.util.Collections;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.CancellationSignal;
import android.content.Context;
import android.content.res.Resources;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import android.content.pm.Signature;
import java.util.Comparator;

abstract class e
{
    private static final Comparator a;
    
    static {
        a = (Comparator)new c();
    }
    
    private static List b(final Signature[] array) {
        final ArrayList list = new ArrayList();
        for (int length = array.length, i = 0; i < length; ++i) {
            ((List)list).add((Object)array[i].toByteArray());
        }
        return (List)list;
    }
    
    private static boolean c(final List list, final List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); ++i) {
            if (!Arrays.equals((byte[])list.get(i), (byte[])list2.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    private static List d(final f f, final Resources resources) {
        if (f.b() != null) {
            return f.b();
        }
        return androidx.core.content.res.e.c(resources, f.c());
    }
    
    static h.a e(final Context context, final f f, final CancellationSignal cancellationSignal) {
        final ProviderInfo f2 = f(context.getPackageManager(), f, context.getResources());
        if (f2 == null) {
            return h.a.a(1, null);
        }
        return h.a.a(0, h(context, f, f2.authority, cancellationSignal));
    }
    
    static ProviderInfo f(final PackageManager packageManager, final f f, final Resources resources) {
        final String e = f.e();
        int i = 0;
        final ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No package found for authority: ");
            sb.append(e);
            throw new PackageManager$NameNotFoundException(sb.toString());
        }
        if (resolveContentProvider.packageName.equals((Object)f.f())) {
            final List b = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b, t.e.a);
            for (List d = d(f, resources); i < d.size(); ++i) {
                final ArrayList list = new ArrayList((Collection)d.get(i));
                Collections.sort((List)list, t.e.a);
                if (c(b, (List)list)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Found content provider ");
        sb2.append(e);
        sb2.append(", but package was not ");
        sb2.append(f.f());
        throw new PackageManager$NameNotFoundException(sb2.toString());
    }
    
    static h.b[] h(Context context, final f f, String a, final CancellationSignal cancellationSignal) {
        final Object o = new ArrayList();
        final Uri build = new Uri$Builder().scheme("content").authority(a).build();
        final Uri build2 = new Uri$Builder().scheme("content").authority(a).appendPath("file").build();
        final a a2 = d.a(context, build);
        context = null;
        try {
            a = (String)a2.a(build, new String[] { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" }, "query = ?", new String[] { f.g() }, null, cancellationSignal);
            Label_0392: {
                if (a != null) {
                    try {
                        if (((Cursor)a).getCount() > 0) {
                            final int columnIndex = ((Cursor)a).getColumnIndex("result_code");
                            final ArrayList list = new ArrayList();
                            final int columnIndex2 = ((Cursor)a).getColumnIndex("_id");
                            final int columnIndex3 = ((Cursor)a).getColumnIndex("file_id");
                            final int columnIndex4 = ((Cursor)a).getColumnIndex("font_ttc_index");
                            final int columnIndex5 = ((Cursor)a).getColumnIndex("font_weight");
                            final int columnIndex6 = ((Cursor)a).getColumnIndex("font_italic");
                            while (((Cursor)a).moveToNext()) {
                                int int1;
                                if (columnIndex != -1) {
                                    int1 = ((Cursor)a).getInt(columnIndex);
                                }
                                else {
                                    int1 = 0;
                                }
                                int int2;
                                if (columnIndex4 != -1) {
                                    int2 = ((Cursor)a).getInt(columnIndex4);
                                }
                                else {
                                    int2 = 0;
                                }
                                Uri uri;
                                if (columnIndex3 == -1) {
                                    uri = ContentUris.withAppendedId(build, ((Cursor)a).getLong(columnIndex2));
                                }
                                else {
                                    uri = ContentUris.withAppendedId(build2, ((Cursor)a).getLong(columnIndex3));
                                }
                                int int3;
                                if (columnIndex5 != -1) {
                                    int3 = ((Cursor)a).getInt(columnIndex5);
                                }
                                else {
                                    int3 = 400;
                                }
                                list.add((Object)h.b.a(uri, int2, int3, columnIndex6 != -1 && ((Cursor)a).getInt(columnIndex6) == 1, int1));
                            }
                            break Label_0392;
                        }
                    }
                    finally {
                        context = (Context)a;
                    }
                }
                context = (Context)o;
            }
            if (a != null) {
                ((Cursor)a).close();
            }
            a2.close();
            return (h.b[])((ArrayList)context).toArray((Object[])new h.b[0]);
        }
        finally {}
        if (context != null) {
            ((Cursor)context).close();
        }
        a2.close();
    }
    
    private interface a
    {
        Cursor a(final Uri p0, final String[] p1, final String p2, final String[] p3, final String p4, final CancellationSignal p5);
        
        void close();
    }
}
