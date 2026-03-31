package p0;

import java.util.List;
import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.lifecycle.h$a;
import java.lang.reflect.Constructor;
import l.d;
import i4.l;
import i4.g;
import androidx.lifecycle.j;

public final class b implements j
{
    public static final b.b$a d;
    private final f c;
    
    static {
        d = new b.b$a((g)null);
    }
    
    public b(final f c) {
        l.e((Object)c, "owner");
        this.c = c;
    }
    
    private final void a(final String name) {
        try {
            Object o = Class.forName((String)name, false, b.class.getClassLoader()).asSubclass(d$a.class);
            l.d(o, "{\n                Class.\u2026class.java)\n            }");
            try {
                final Constructor declaredConstructor = ((Class)o).getDeclaredConstructor((Class[])new Class[0]);
                ((AccessibleObject)declaredConstructor).setAccessible(true);
                try {
                    o = declaredConstructor.newInstance(new Object[0]);
                    l.d(o, "{\n                constr\u2026wInstance()\n            }");
                    l.d.a(o);
                    throw null;
                }
                catch (final Exception ex) {
                    o = new StringBuilder();
                    ((StringBuilder)o).append("Failed to instantiate ");
                    ((StringBuilder)o).append((String)name);
                    throw new RuntimeException(((StringBuilder)o).toString(), (Throwable)ex);
                }
            }
            catch (final NoSuchMethodException name) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Class ");
                sb.append(((Class)o).getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(sb.toString(), (Throwable)name);
            }
        }
        catch (final ClassNotFoundException ex2) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Class ");
            sb2.append((String)name);
            sb2.append(" wasn't found");
            throw new RuntimeException(sb2.toString(), (Throwable)ex2);
        }
    }
    
    public void W(final androidx.lifecycle.l l, final h$a h$a) {
        l.e((Object)l, "source");
        l.e((Object)h$a, "event");
        if (h$a != h$a.ON_CREATE) {
            throw new AssertionError((Object)"Next event must be ON_CREATE");
        }
        l.a().c((k)this);
        final Bundle b = this.c.m().b("androidx.savedstate.Restarter");
        if (b == null) {
            return;
        }
        final ArrayList stringArrayList = b.getStringArrayList("classes_to_restore");
        if (stringArrayList != null) {
            final Iterator iterator = ((List)stringArrayList).iterator();
            while (iterator.hasNext()) {
                this.a((String)iterator.next());
            }
            return;
        }
        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    }
}
