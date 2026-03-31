package l3;

import android.content.res.Configuration;
import java.util.Iterator;
import android.os.LocaleList;
import java.util.Collection;
import androidx.core.os.g;
import java.util.ArrayList;
import android.os.Build$VERSION;
import java.util.List;
import java.util.Locale;
import android.content.Context;
import j3.l;

public class f
{
    private final l a;
    private final Context b;
    final l.b c;
    
    public f(final Context b, final l a) {
        final f$a c = new f$a(this);
        this.c = (l.b)c;
        this.b = b;
        (this.a = a).c((l.b)c);
    }
    
    public static Locale b(String s) {
        final String[] split = s.replace('_', '-').split("-", -1);
        final String s2 = split[0];
        final int length = split.length;
        final String s3 = "";
        int n = 1;
        if (length > 1 && split[1].length() == 4) {
            s = split[1];
            n = 2;
        }
        else {
            s = "";
        }
        String s4 = s3;
        if (split.length > n) {
            s4 = s3;
            if (split[n].length() >= 2) {
                s4 = s3;
                if (split[n].length() <= 3) {
                    s4 = split[n];
                }
            }
        }
        return new Locale(s2, s4, s);
    }
    
    public Locale c(final List list) {
        if (list != null && !list.isEmpty()) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 26) {
                final ArrayList list2 = new ArrayList();
                final LocaleList a = l3.a.a(this.b.getResources().getConfiguration());
                for (int a2 = l3.b.a(a), i = 0; i < a2; ++i) {
                    final Locale a3 = g.a(a, i);
                    String s2;
                    final String s = s2 = a3.getLanguage();
                    if (!a3.getScript().isEmpty()) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(s);
                        sb.append("-");
                        sb.append(a3.getScript());
                        s2 = sb.toString();
                    }
                    String string = s2;
                    if (!a3.getCountry().isEmpty()) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(s2);
                        sb2.append("-");
                        sb2.append(a3.getCountry());
                        string = sb2.toString();
                    }
                    ((List)list2).add((Object)d.a(string));
                    e.a();
                    ((List)list2).add((Object)d.a(a3.getLanguage()));
                    e.a();
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(a3.getLanguage());
                    sb3.append("-*");
                    ((List)list2).add((Object)d.a(sb3.toString()));
                }
                final Locale a4 = l3.c.a((List)list2, (Collection)list);
                if (a4 != null) {
                    return a4;
                }
            }
            else if (sdk_INT >= 24) {
                final LocaleList a5 = l3.a.a(this.b.getResources().getConfiguration());
                for (int j = 0; j < l3.b.a(a5); ++j) {
                    final Locale a6 = g.a(a5, j);
                    for (final Locale locale : list) {
                        if (a6.equals((Object)locale)) {
                            return locale;
                        }
                    }
                    for (final Locale locale2 : list) {
                        if (a6.getLanguage().equals((Object)locale2.toLanguageTag())) {
                            return locale2;
                        }
                    }
                    for (final Locale locale3 : list) {
                        if (a6.getLanguage().equals((Object)locale3.getLanguage())) {
                            return locale3;
                        }
                    }
                }
            }
            else {
                final Locale locale4 = this.b.getResources().getConfiguration().locale;
                if (locale4 != null) {
                    for (final Locale locale5 : list) {
                        if (locale4.equals((Object)locale5)) {
                            return locale5;
                        }
                    }
                    for (final Locale locale6 : list) {
                        if (locale4.getLanguage().equals((Object)locale6.toString())) {
                            return locale6;
                        }
                    }
                }
            }
            return (Locale)list.get(0);
        }
        return null;
    }
    
    public void d(final Configuration configuration) {
        final ArrayList list = new ArrayList();
        if (Build$VERSION.SDK_INT >= 24) {
            final LocaleList a = l3.a.a(configuration);
            for (int a2 = l3.b.a(a), i = 0; i < a2; ++i) {
                ((List)list).add((Object)g.a(a, i));
            }
        }
        else {
            ((List)list).add((Object)configuration.locale);
        }
        this.a.b((List)list);
    }
}
