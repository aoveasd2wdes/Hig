package c0;

import i4.l;
import java.io.File;
import android.content.Context;

public abstract class a
{
    public static final File a(final Context context, final String s) {
        l.e(context, "<this>");
        l.e(s, "fileName");
        final File filesDir = context.getApplicationContext().getFilesDir();
        final StringBuilder sb = new StringBuilder();
        sb.append("datastore/");
        sb.append(s);
        return new File(filesDir, sb.toString());
    }
}
