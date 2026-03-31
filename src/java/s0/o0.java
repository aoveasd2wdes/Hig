package s0;

import android.view.View;
import android.view.WindowId;

class o0 implements p0
{
    private final WindowId a;
    
    o0(final View view) {
        this.a = view.getWindowId();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof o0 && ((o0)o).a.equals((Object)this.a);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}
