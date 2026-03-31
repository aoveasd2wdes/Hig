package f4;

import i4.l;
import java.io.File;

abstract class f extends e
{
    public static String a(final File file) {
        l.e((Object)file, "<this>");
        final String name = file.getName();
        l.d((Object)name, "getName(...)");
        return p4.f.X(name, '.', "");
    }
}
