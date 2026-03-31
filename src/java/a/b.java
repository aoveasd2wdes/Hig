package a;

public abstract class b
{
    private static final String a = "_COROUTINE";
    
    private static final StackTraceElement b(final Throwable t, final String s) {
        final StackTraceElement stackTraceElement = t.getStackTrace()[0];
        final StringBuilder sb = new StringBuilder();
        sb.append(b.a);
        sb.append('.');
        sb.append(s);
        return new StackTraceElement(sb.toString(), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
