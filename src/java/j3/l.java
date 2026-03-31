package j3;

import java.util.Iterator;
import java.util.Locale;
import java.util.ArrayList;
import a3.b;
import java.util.List;
import k3.c;
import k3.g;
import b3.a;
import k3.k;

public class l
{
    public final k a;
    private b b;
    public final k.c c;
    
    public l(final a a) {
        final l$a c = new l$a(this);
        this.c = (k.c)c;
        (this.a = new k((c)a, "flutter/localization", (k3.l)g.a)).e((k.c)c);
    }
    
    public void b(final List list) {
        a3.b.f("LocalizationChannel", "Sending Locales to Flutter.");
        final ArrayList list2 = new ArrayList();
        for (final Locale locale : list) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Locale (Language: ");
            sb.append(locale.getLanguage());
            sb.append(", Country: ");
            sb.append(locale.getCountry());
            sb.append(", Variant: ");
            sb.append(locale.getVariant());
            sb.append(")");
            a3.b.f("LocalizationChannel", sb.toString());
            ((List)list2).add((Object)locale.getLanguage());
            ((List)list2).add((Object)locale.getCountry());
            ((List)list2).add((Object)locale.getScript());
            ((List)list2).add((Object)locale.getVariant());
        }
        this.a.c("setLocale", list2);
    }
    
    public void c(final b b) {
        this.b = b;
    }
    
    public interface b
    {
        String a(final String p0, final String p1);
    }
}
