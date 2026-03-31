package z1;

import android.os.Build$VERSION;

public abstract class h
{
    public static final int a;
    
    static {
        int a2;
        if (Build$VERSION.SDK_INT >= 31) {
            a2 = 33554432;
        }
        else {
            a2 = 0;
        }
        a = a2;
    }
}
