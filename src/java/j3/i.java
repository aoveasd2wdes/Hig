package j3;

import android.view.KeyEvent;
import org.json.JSONException;
import a3.b;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;
import k3.f;
import k3.c;
import k3.a;

public class i
{
    public final k3.a a;
    
    public i(final c c) {
        this.a = new k3.a(c, "flutter/keyevent", (k3.i)f.a);
    }
    
    private static k3.a.e b(final a a) {
        return (k3.a.e)new h(a);
    }
    
    private Map c(final b b, final boolean b2) {
        final HashMap hashMap = new HashMap();
        String s;
        if (b2) {
            s = "keyup";
        }
        else {
            s = "keydown";
        }
        ((Map)hashMap).put((Object)"type", (Object)s);
        ((Map)hashMap).put((Object)"keymap", (Object)"android");
        ((Map)hashMap).put((Object)"flags", (Object)b.a.getFlags());
        ((Map)hashMap).put((Object)"plainCodePoint", (Object)b.a.getUnicodeChar(0));
        ((Map)hashMap).put((Object)"codePoint", (Object)b.a.getUnicodeChar());
        ((Map)hashMap).put((Object)"keyCode", (Object)b.a.getKeyCode());
        ((Map)hashMap).put((Object)"scanCode", (Object)b.a.getScanCode());
        ((Map)hashMap).put((Object)"metaState", (Object)b.a.getMetaState());
        final Character b3 = b.b;
        if (b3 != null) {
            ((Map)hashMap).put((Object)"character", (Object)b3.toString());
        }
        ((Map)hashMap).put((Object)"source", (Object)b.a.getSource());
        ((Map)hashMap).put((Object)"deviceId", (Object)b.a.getDeviceId());
        ((Map)hashMap).put((Object)"repeatCount", (Object)b.a.getRepeatCount());
        return (Map)hashMap;
    }
    
    public void e(final b b, final boolean b2, final a a) {
        this.a.d(this.c(b, b2), b(a));
    }
    
    public interface a
    {
        void a(final boolean p0);
    }
    
    public static class b
    {
        public final KeyEvent a;
        public final Character b;
        
        public b(final KeyEvent a, final Character b) {
            this.a = a;
            this.b = b;
        }
    }
}
