package q3;

import java.io.IOException;
import java.io.FileOutputStream;
import java.util.UUID;
import android.database.Cursor;
import java.io.File;
import android.webkit.MimeTypeMap;
import android.net.Uri;
import android.content.Context;
import java.io.OutputStream;
import java.io.InputStream;

class b
{
    private static void a(final InputStream inputStream, final OutputStream outputStream) {
        final byte[] array = new byte[4096];
        while (true) {
            final int read = inputStream.read(array);
            if (read == -1) {
                break;
            }
            outputStream.write(array, 0, read);
        }
        outputStream.flush();
    }
    
    private static String b(final String s) {
        final int lastIndex = s.lastIndexOf(46);
        if (lastIndex < 0) {
            return s;
        }
        return s.substring(0, lastIndex);
    }
    
    private static String c(final Context context, final Uri uri) {
        try {
            String s;
            if (uri.getScheme().equals((Object)"content")) {
                s = MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
            }
            else {
                s = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            }
            if (s != null) {
                if (!s.isEmpty()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(".");
                    sb.append(h(s));
                    return sb.toString();
                }
            }
            return null;
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    private static String d(final Context context, Uri f) {
        f = (Uri)f(context, f);
        if (f != null) {
            try {
                if (((Cursor)f).moveToFirst()) {
                    if (((Cursor)f).getColumnCount() >= 1) {
                        final String h = h(((Cursor)f).getString(0));
                        ((Cursor)f).close();
                        return h;
                    }
                }
            }
            finally {
                try {
                    ((Cursor)f).close();
                }
                finally {
                    ((Throwable)context).addSuppressed((Throwable)f);
                }
            }
        }
        if (f != null) {
            ((Cursor)f).close();
        }
        return null;
    }
    
    private static Cursor f(final Context context, final Uri uri) {
        return context.getContentResolver().query(uri, new String[] { "_display_name" }, (String)null, (String[])null, (String)null);
    }
    
    protected static File g(final String s, final String s2) {
        final File file = new File(s);
        if (file.getCanonicalPath().startsWith(s2)) {
            return file;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Trying to open path outside of the expected directory. File: ");
        sb.append(file.getCanonicalPath());
        sb.append(" was expected to be within directory: ");
        sb.append(s2);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }
    
    protected static String h(String replace) {
        if (replace == null) {
            return null;
        }
        final String[] split = replace.split("/");
        replace = split[split.length - 1];
        for (int i = 0; i < 2; ++i) {
            replace = replace.replace((CharSequence)(new String[] { "..", "/" })[i], (CharSequence)"_");
        }
        return replace;
    }
    
    String e(Context context, final Uri uri) {
        try {
            final InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                final File file = new File(context.getCacheDir(), UUID.randomUUID().toString());
                file.mkdir();
                file.deleteOnExit();
                final String d = d(context, uri);
                final String c = c(context, uri);
                String string = null;
                Label_0165: {
                    StringBuilder sb3;
                    if (d == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Cannot get file name for ");
                        sb.append((Object)uri);
                        a3.b.g("FileUtils", sb.toString());
                        String s;
                        if ((s = c) == null) {
                            s = ".jpg";
                        }
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("image_picker");
                        sb2.append(s);
                        sb3 = sb2;
                    }
                    else {
                        string = d;
                        if (c == null) {
                            break Label_0165;
                        }
                        sb3 = new StringBuilder();
                        sb3.append(b(d));
                        sb3.append(c);
                    }
                    string = sb3.toString();
                }
                final File g = g(new File(file, string).getPath(), file.getCanonicalPath());
                context = (Context)new FileOutputStream(g);
                try {
                    a(openInputStream, (OutputStream)context);
                    final String path = g.getPath();
                    ((OutputStream)context).close();
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                    return path;
                }
                finally {
                    try {
                        ((OutputStream)context).close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)uri).addSuppressed(t);
                    }
                }
            }
            finally {
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    }
                    finally {
                        final Throwable t2;
                        ((Throwable)context).addSuppressed(t2);
                    }
                }
            }
        }
        catch (final IOException | SecurityException | IllegalArgumentException ex) {
            return null;
        }
    }
}
