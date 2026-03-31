package s4;

import i4.g;
import android.os.Looper;
import r4.b2;
import java.util.List;
import w4.v;

public final class a implements v
{
    public int a() {
        return 1073741823;
    }
    
    public String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
    
    public b2 c(final List list) {
        final Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return (b2)new c(e.a(mainLooper, true), (String)null, 2, (g)null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
