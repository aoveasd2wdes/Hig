package r;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.MenuItem;

public interface b extends MenuItem
{
    MenuItem setAlphabeticShortcut(final char p0, final int p1);
    
    b setContentDescription(final CharSequence p0);
    
    MenuItem setIconTintList(final ColorStateList p0);
    
    MenuItem setIconTintMode(final PorterDuff$Mode p0);
    
    MenuItem setNumericShortcut(final char p0, final int p1);
    
    b setTooltipText(final CharSequence p0);
}
