package w;

import android.view.accessibility.AccessibilityRecord;

public abstract class f0
{
    public static void a(final AccessibilityRecord accessibilityRecord, final int maxScrollX) {
        accessibilityRecord.setMaxScrollX(maxScrollX);
    }
    
    public static void b(final AccessibilityRecord accessibilityRecord, final int maxScrollY) {
        accessibilityRecord.setMaxScrollY(maxScrollY);
    }
}
