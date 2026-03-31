package s3;

import java.util.Map;
import java.util.List;
import android.util.Log;
import java.util.ArrayList;

public abstract class l
{
    protected static ArrayList a(final Throwable t) {
        final ArrayList list = new ArrayList(3);
        list.add((Object)t.toString());
        list.add((Object)t.getClass().getSimpleName());
        final StringBuilder sb = new StringBuilder();
        sb.append("Cause: ");
        sb.append((Object)t.getCause());
        sb.append(", Stacktrace: ");
        sb.append(Log.getStackTraceString(t));
        list.add((Object)sb.toString());
        return list;
    }
    
    public interface a
    {
        Boolean a(final String p0, final Boolean p1);
        
        Boolean b(final String p0, final Double p1);
        
        Boolean c(final String p0);
        
        Boolean d(final String p0, final Long p1);
        
        Map e(final String p0, final List p1);
        
        Boolean f(final String p0, final String p1);
        
        Boolean h(final String p0, final List p1);
        
        Boolean i(final String p0, final List p1);
    }
}
