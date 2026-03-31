package p1;

import android.content.Intent;
import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public interface f
{
    void c(final String p0, final LifecycleCallback p1);
    
    LifecycleCallback e(final String p0, final Class p1);
    
    Activity f();
    
    void startActivityForResult(final Intent p0, final int p1);
}
