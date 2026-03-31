package w4;

import java.util.zip.ZipFile;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.io.Closeable;
import f4.a;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.jar.JarFile;
import p4.f;
import java.net.URL;
import java.util.ServiceLoader;
import java.util.List;

public final class l
{
    public static final l a;
    
    static {
        a = new l();
    }
    
    private l() {
    }
    
    private final Object a(final String name, final ClassLoader loader, final Class clazz) {
        final Class<?> forName = Class.forName(name, false, loader);
        if (clazz.isAssignableFrom(forName)) {
            return clazz.cast(forName.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected service of class ");
        sb.append((Object)clazz);
        sb.append(", but found ");
        sb.append((Object)forName);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    private final List b(Class d, final ClassLoader classLoader) {
        List f;
        try {
            d = this.d((Class)d, classLoader);
        }
        finally {
            f = v3.l.F((Iterable)ServiceLoader.load((Class)d, classLoader));
        }
        return f;
    }
    
    private final List e(URL url) {
        final String string = url.toString();
        if (f.p(string, "jar", false, 2, (Object)null)) {
            final String b0 = f.b0(f.W(string, "jar:file:", (String)null, 2, (Object)null), '!', (String)null, 2, (Object)null);
            final String w = f.W(string, "!/", (String)null, 2, (Object)null);
            url = (URL)new JarFile(b0, false);
            try {
                final BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader(((JarFile)url).getInputStream(new ZipEntry(w)), "UTF-8"));
                try {
                    final List f = l.a.f(bufferedReader);
                    f4.a.a((Closeable)bufferedReader, (Throwable)null);
                    ((ZipFile)url).close();
                    return f;
                }
                finally {
                    try {}
                    finally {
                        final Throwable t;
                        f4.a.a((Closeable)bufferedReader, t);
                    }
                }
            }
            finally {
                try {}
                finally {
                    try {
                        ((ZipFile)url).close();
                    }
                    finally {
                        final Throwable t2;
                        final Throwable t3;
                        u3.a.a(t2, t3);
                    }
                }
            }
        }
        url = (URL)new BufferedReader((Reader)new InputStreamReader(url.openStream()));
        try {
            final List f2 = l.a.f((BufferedReader)url);
            f4.a.a((Closeable)url, (Throwable)null);
            return f2;
        }
        finally {
            try {}
            finally {
                final Throwable t4;
                f4.a.a((Closeable)url, t4);
            }
        }
    }
    
    private final List f(final BufferedReader bufferedReader) {
        final LinkedHashSet set = new LinkedHashSet();
    Label_0009:
        while (true) {
            final String line = bufferedReader.readLine();
            if (line == null) {
                return v3.l.F((Iterable)set);
            }
            final String string = f.d0((CharSequence)f.c0(line, "#", (String)null, 2, (Object)null)).toString();
            final int n = 0;
            int i = 0;
            while (true) {
                while (i < ((CharSequence)string).length()) {
                    final char char1 = ((CharSequence)string).charAt(i);
                    if (char1 != '.' && !Character.isJavaIdentifierPart(char1)) {
                        final boolean b = false;
                        if (!b) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Illegal service provider class name: ");
                            sb.append(string);
                            throw new IllegalArgumentException(sb.toString().toString());
                        }
                        int n2 = n;
                        if (((CharSequence)string).length() > 0) {
                            n2 = 1;
                        }
                        if (n2 != 0) {
                            ((Set)set).add((Object)string);
                            continue Label_0009;
                        }
                        continue Label_0009;
                    }
                    else {
                        ++i;
                    }
                }
                final boolean b = true;
                continue;
            }
        }
    }
    
    public final List c() {
        if (!m.a()) {
            return this.b(v.class, v.class.getClassLoader());
        }
        List b = null;
        try {
            final ArrayList list = new ArrayList(2);
            Object o = null;
            v v;
            try {
                v = v.class.cast(Class.forName("s4.a", true, v.class.getClassLoader()).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
            }
            catch (final ClassNotFoundException ex) {
                v = null;
            }
            if (v != null) {
                list.add((Object)v);
            }
            try {
                o = v.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, v.class.getClassLoader()).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
            }
            catch (final ClassNotFoundException ex2) {}
            if (o != null) {
                list.add(o);
            }
        }
        finally {
            b = this.b(v.class, v.class.getClassLoader());
        }
        return b;
    }
    
    public final List d(final Class clazz, final ClassLoader classLoader) {
        final StringBuilder sb = new StringBuilder();
        sb.append("META-INF/services/");
        sb.append(clazz.getName());
        final ArrayList list = Collections.list(classLoader.getResources(sb.toString()));
        i4.l.d((Object)list, "list(this)");
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = ((Iterable)list).iterator();
        while (iterator.hasNext()) {
            v3.l.o((Collection)list2, (Iterable)l.a.e((URL)iterator.next()));
        }
        final Set i = v3.l.I((Iterable)list2);
        if (((Collection)i).isEmpty() ^ true) {
            final ArrayList list3 = new ArrayList(v3.l.m((Iterable)i, 10));
            final Iterator iterator2 = ((Iterable)i).iterator();
            while (iterator2.hasNext()) {
                ((Collection)list3).add(l.a.a((String)iterator2.next(), classLoader, clazz));
            }
            return (List)list3;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
