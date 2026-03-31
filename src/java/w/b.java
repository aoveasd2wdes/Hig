package w;

import android.view.accessibility.AccessibilityEvent;

public abstract class b
{
    public static int a(final AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }
    
    public static void b(final AccessibilityEvent accessibilityEvent, final int contentChangeTypes) {
        accessibilityEvent.setContentChangeTypes(contentChangeTypes);
    }
}
