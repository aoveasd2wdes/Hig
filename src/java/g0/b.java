package g0;

import c0.a;
import i4.l;
import java.io.File;
import android.content.Context;

public abstract class b
{
    public static final File a(final Context context, final String s) {
        l.e(context, "<this>");
        l.e(s, "name");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(".preferences_pb");
        return a.a(context, sb.toString());
    }
}
