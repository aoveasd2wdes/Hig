package s3;

import v3.l;
import android.util.Log;
import java.util.List;

public abstract class n
{
    private static final List b(final Throwable t) {
        final String simpleName = t.getClass().getSimpleName();
        final String string = t.toString();
        final Throwable cause = t.getCause();
        final String stackTraceString = Log.getStackTraceString(t);
        final StringBuilder sb = new StringBuilder();
        sb.append("Cause: ");
        sb.append((Object)cause);
        sb.append(", Stacktrace: ");
        sb.append(stackTraceString);
        return l.j((Object[])new String[] { simpleName, string, sb.toString() });
    }
}
