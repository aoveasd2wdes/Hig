package c1;

import android.inputmethodservice.InputMethodService;
import android.app.Activity;
import android.content.ContextWrapper;
import i4.l;
import android.content.Context;

public final class c
{
    public static final c a;
    
    static {
        a = new c();
    }
    
    private c() {
    }
    
    public final Context a(final Context context) {
        l.e(context, "context");
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof Activity) {
                return baseContext;
            }
            if (baseContext instanceof InputMethodService) {
                return baseContext;
            }
            final ContextWrapper contextWrapper = (ContextWrapper)baseContext;
            if (contextWrapper.getBaseContext() == null) {
                return baseContext;
            }
            baseContext = contextWrapper.getBaseContext();
            l.d(baseContext, "iterator.baseContext");
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Context ");
        sb.append((Object)context);
        sb.append(" is not a UiContext");
        throw new IllegalArgumentException(sb.toString());
    }
}
