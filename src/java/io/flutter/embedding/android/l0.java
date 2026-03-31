package io.flutter.embedding.android;

import java.nio.Buffer;
import java.util.Collections;
import java.util.Map;
import k3.c$b;
import a3.b;
import java.util.Iterator;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import android.view.KeyEvent;
import java.util.HashMap;
import k3.c;

public class l0 implements m0$d
{
    private final c a;
    private final HashMap b;
    private final HashMap c;
    private final m0$b d;
    
    public l0(final c a) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new m0$b();
        this.a = a;
        for (final n0$e n0$e : n0.a()) {
            this.c.put((Object)n0$e.c, (Object)n0$e);
        }
    }
    
    private static h0$b e(final KeyEvent keyEvent) {
        final boolean b = keyEvent.getRepeatCount() > 0;
        final int action = keyEvent.getAction();
        if (action == 0) {
            h0$b h0$b;
            if (b) {
                h0$b = io.flutter.embedding.android.h0$b.h;
            }
            else {
                h0$b = io.flutter.embedding.android.h0$b.f;
            }
            return h0$b;
        }
        if (action == 1) {
            return h0$b.g;
        }
        throw new AssertionError((Object)"Unexpected event type");
    }
    
    private Long f(final KeyEvent keyEvent) {
        final Long n = (Long)n0.b.get((Object)(long)keyEvent.getKeyCode());
        if (n != null) {
            return n;
        }
        return j(keyEvent.getKeyCode(), 73014444032L);
    }
    
    private Long g(final KeyEvent keyEvent) {
        final long n = keyEvent.getScanCode();
        int n2;
        if (n == 0L) {
            n2 = keyEvent.getKeyCode();
        }
        else {
            final Long n3 = (Long)n0.a.get((Object)n);
            if (n3 != null) {
                return n3;
            }
            n2 = keyEvent.getScanCode();
        }
        return j(n2, 73014444032L);
    }
    
    private boolean i(final KeyEvent keyEvent, final m0$d$a m0$d$a) {
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            return false;
        }
        final Long g = this.g(keyEvent);
        final Long f = this.f(keyEvent);
        final ArrayList list = new ArrayList();
        for (final n0$d n0$d : n0.c) {
            this.o(n0$d, (keyEvent.getMetaState() & n0$d.a) != 0x0, f, g, keyEvent, list);
        }
        for (final n0$e n0$e : this.c.values()) {
            this.p(n0$e, (keyEvent.getMetaState() & n0$e.a) != 0x0, f, keyEvent);
        }
        final int action = keyEvent.getAction();
        boolean b;
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            b = false;
        }
        else {
            b = true;
        }
        final Long n = (Long)this.b.get((Object)g);
        final Long n2 = null;
        h0$b g2 = null;
        String string = null;
        Label_0360: {
            if (b) {
                h0$b h0$b = null;
                Label_0284: {
                    if (n != null) {
                        if (keyEvent.getRepeatCount() > 0) {
                            h0$b = io.flutter.embedding.android.h0$b.h;
                            break Label_0284;
                        }
                        this.q(false, n, g, keyEvent.getEventTime());
                    }
                    h0$b = io.flutter.embedding.android.h0$b.f;
                }
                final char charValue = this.d.a(keyEvent.getUnicodeChar());
                g2 = h0$b;
                if (charValue != '\0') {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(charValue);
                    string = sb.toString();
                    g2 = h0$b;
                    break Label_0360;
                }
            }
            else {
                if (n == null) {
                    return false;
                }
                g2 = h0$b.g;
            }
            string = null;
        }
        if (g2 != h0$b.h) {
            Long n3 = n2;
            if (b) {
                n3 = f;
            }
            this.r(g, n3);
        }
        if (g2 == h0$b.f) {
            final n0$e n0$e2 = (n0$e)this.c.get((Object)f);
            if (n0$e2 != null) {
                n0$e2.d ^= true;
            }
        }
        final h0 h0 = new h0();
        final int source = keyEvent.getSource();
        h0$a f2;
        if (source != 513) {
            if (source != 1025) {
                if (source != 16777232) {
                    if (source != 33554433) {
                        f2 = h0$a.f;
                    }
                    else {
                        f2 = h0$a.j;
                    }
                }
                else {
                    f2 = h0$a.i;
                }
            }
            else {
                f2 = h0$a.h;
            }
        }
        else {
            f2 = h0$a.g;
        }
        h0.f = f2;
        h0.a = keyEvent.getEventTime();
        h0.b = g2;
        h0.d = f;
        h0.c = g;
        h0.g = string;
        h0.e = false;
        h0.f = h0$a.f;
        this.n(h0, m0$d$a);
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            ((Runnable)iterator2.next()).run();
        }
        return true;
    }
    
    private static long j(final long n, final long n2) {
        return (n & 0xFFFFFFFFL) | n2;
    }
    
    private void n(final h0 h0, final m0$d$a m0$d$a) {
        Object o;
        if (m0$d$a == null) {
            o = null;
        }
        else {
            o = new i0(m0$d$a);
        }
        this.a.h("flutter/keydata", h0.a(), (c$b)o);
    }
    
    private void q(final boolean b, Long n, final Long n2, final long a) {
        final h0 h0 = new h0();
        h0.a = a;
        h0$b b2;
        if (b) {
            b2 = h0$b.f;
        }
        else {
            b2 = h0$b.g;
        }
        h0.b = b2;
        h0.d = n;
        h0.c = n2;
        h0.g = null;
        h0.e = true;
        h0.f = h0$a.f;
        if (n2 != 0L && n != 0L) {
            if (!b) {
                n = null;
            }
            this.r(n2, n);
        }
        this.n(h0, null);
    }
    
    public void a(final KeyEvent keyEvent, final m0$d$a m0$d$a) {
        if (!this.i(keyEvent, m0$d$a)) {
            this.q(true, 0L, 0L, 0L);
            m0$d$a.a(true);
        }
    }
    
    public Map h() {
        return Collections.unmodifiableMap((Map)this.b);
    }
    
    void o(final n0$d n0$d, final boolean b, final long n, final long n2, final KeyEvent keyEvent, final ArrayList list) {
        final n0$c[] b2 = n0$d.b;
        final boolean[] array = new boolean[b2.length];
        final Boolean[] array2 = new Boolean[b2.length];
        final int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        while (true) {
            final n0$c[] b3 = n0$d.b;
            final int length = b3.length;
            final boolean b4 = true;
            if (n5 >= length) {
                break;
            }
            final n0$c n0$c = b3[n5];
            final boolean containsKey = this.b.containsKey((Object)n0$c.a);
            array[n5] = containsKey;
            Label_0250: {
                if (n0$c.b == n) {
                    final int n6 = l0$a.a[((Enum)e(keyEvent)).ordinal()];
                    if (n6 != 1) {
                        if (n6 == 2) {
                            array2[n5] = array[n5];
                            break Label_0250;
                        }
                        if (n6 != 3) {
                            break Label_0250;
                        }
                        if (!b) {
                            list.add((Object)new k0(this, n0$c, keyEvent));
                        }
                        array2[n5] = array[n5];
                    }
                    else {
                        array2[n5] = Boolean.FALSE;
                        if (!b) {
                            list.add((Object)new j0(this, n0$c, n2, keyEvent));
                        }
                    }
                    n4 = 1;
                }
                else {
                    int n7 = b4 ? 1 : 0;
                    if (n4 == 0) {
                        if (containsKey) {
                            n7 = (b4 ? 1 : 0);
                        }
                        else {
                            n7 = 0;
                        }
                    }
                    n4 = n7;
                }
            }
            ++n5;
        }
        int j;
        if (b) {
            for (int i = 0; i < n0$d.b.length; ++i) {
                if (array2[i] == null) {
                    if (n4 != 0) {
                        array2[i] = array[i];
                    }
                    else {
                        array2[i] = Boolean.TRUE;
                        n4 = 1;
                    }
                }
            }
            j = n3;
            if (n4 == 0) {
                array2[0] = Boolean.TRUE;
                j = n3;
            }
        }
        else {
            int n8 = 0;
            while (true) {
                j = n3;
                if (n8 >= n0$d.b.length) {
                    break;
                }
                if (array2[n8] == null) {
                    array2[n8] = Boolean.FALSE;
                }
                ++n8;
            }
        }
        while (j < n0$d.b.length) {
            if (array[j] != array2[j]) {
                final n0$c n0$c2 = n0$d.b[j];
                this.q(array2[j], n0$c2.b, n0$c2.a, keyEvent.getEventTime());
            }
            ++j;
        }
    }
    
    void p(final n0$e n0$e, final boolean b, final long n, final KeyEvent keyEvent) {
        if (n0$e.c == n) {
            return;
        }
        if (n0$e.d != b) {
            final boolean b2 = this.b.containsKey((Object)n0$e.b) ^ true;
            if (b2) {
                n0$e.d ^= true;
            }
            this.q(b2, n0$e.c, n0$e.b, keyEvent.getEventTime());
            if (!b2) {
                n0$e.d ^= true;
            }
            this.q(b2 ^ true, n0$e.c, n0$e.b, keyEvent.getEventTime());
        }
    }
    
    void r(final Long n, final Long n2) {
        if (n2 != null) {
            if (this.b.put((Object)n, (Object)n2) != null) {
                throw new AssertionError((Object)"The key was not empty");
            }
        }
        else if (this.b.remove((Object)n) == null) {
            throw new AssertionError((Object)"The key was empty");
        }
    }
}
