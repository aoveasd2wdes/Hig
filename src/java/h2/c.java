package h2;

import android.graphics.Bitmap;
import q1.o;
import android.os.RemoteException;
import c2.u;

public abstract class c
{
    private static u a;
    
    public static b a() {
        try {
            return new b(f().b());
        }
        catch (final RemoteException ex) {
            throw new h2.u(ex);
        }
    }
    
    public static b b(final float n) {
        try {
            return new b(f().n1(n));
        }
        catch (final RemoteException ex) {
            throw new h2.u(ex);
        }
    }
    
    public static b c(final String s) {
        o.i((Object)s, (Object)"assetName must not be null");
        try {
            return new b(f().G1(s));
        }
        catch (final RemoteException ex) {
            throw new h2.u(ex);
        }
    }
    
    public static b d(final Bitmap bitmap) {
        o.i((Object)bitmap, (Object)"image must not be null");
        try {
            return new b(f().f2(bitmap));
        }
        catch (final RemoteException ex) {
            throw new h2.u(ex);
        }
    }
    
    public static void e(final u u) {
        if (c.a != null) {
            return;
        }
        c.a = (u)o.i((Object)u, (Object)"delegate must not be null");
    }
    
    private static u f() {
        return (u)o.i((Object)c.a, (Object)"IBitmapDescriptorFactory is not initialized");
    }
}
