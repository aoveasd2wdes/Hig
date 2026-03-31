package j0;

import java.io.PrintWriter;
import android.util.Log;
import java.util.ArrayList;

final class a extends j0 implements b0$h
{
    final b0 t;
    boolean u;
    int v;
    boolean w;
    
    a(final b0 t) {
        final t z = t.Z();
        t.a0();
        super(z, (ClassLoader)null);
        this.v = -1;
        this.w = false;
        this.t = t;
    }
    
    public boolean a(final ArrayList list, final ArrayList list2) {
        if (b0.l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append((Object)this);
            Log.v("FragmentManager", sb.toString());
        }
        list.add((Object)this);
        list2.add((Object)Boolean.FALSE);
        if (super.i) {
            this.t.e(this);
        }
        return true;
    }
    
    public void e() {
        this.f();
        this.t.K((b0$h)this, true);
    }
    
    void g(final int n, final o o, final String s, final int n2) {
        super.g(n, o, s, n2);
        o.v = this.t;
    }
    
    void i(final int n) {
        if (!super.i) {
            return;
        }
        if (b0.l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Bump nesting in ");
            sb.append((Object)this);
            sb.append(" by ");
            sb.append(n);
            Log.v("FragmentManager", sb.toString());
        }
        for (int size = super.c.size(), i = 0; i < size; ++i) {
            final j0$a j0$a = (j0$a)super.c.get(i);
            final o b = j0$a.b;
            if (b != null) {
                b.u += n;
                if (b0.l0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Bump nesting of ");
                    sb2.append((Object)j0$a.b);
                    sb2.append(" to ");
                    sb2.append(j0$a.b.u);
                    Log.v("FragmentManager", sb2.toString());
                }
            }
        }
    }
    
    public void j(final String s, final PrintWriter printWriter, final boolean b) {
        if (b) {
            printWriter.print(s);
            printWriter.print("mName=");
            printWriter.print(super.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (super.h != 0) {
                printWriter.print(s);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(super.h));
            }
            if (super.d != 0 || super.e != 0) {
                printWriter.print(s);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(super.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(super.e));
            }
            if (super.f != 0 || super.g != 0) {
                printWriter.print(s);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(super.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(super.g));
            }
            if (super.l != 0 || super.m != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(super.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println((Object)super.m);
            }
            if (super.n != 0 || super.o != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(super.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println((Object)super.o);
            }
        }
        if (!super.c.isEmpty()) {
            printWriter.print(s);
            printWriter.println("Operations:");
            for (int size = super.c.size(), i = 0; i < size; ++i) {
                final j0$a j0$a = (j0$a)super.c.get(i);
                String string = null;
                switch (j0$a.a) {
                    default: {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("cmd=");
                        sb.append(j0$a.a);
                        string = sb.toString();
                        break;
                    }
                    case 10: {
                        string = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    case 9: {
                        string = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        string = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        string = "ATTACH";
                        break;
                    }
                    case 6: {
                        string = "DETACH";
                        break;
                    }
                    case 5: {
                        string = "SHOW";
                        break;
                    }
                    case 4: {
                        string = "HIDE";
                        break;
                    }
                    case 3: {
                        string = "REMOVE";
                        break;
                    }
                    case 2: {
                        string = "REPLACE";
                        break;
                    }
                    case 1: {
                        string = "ADD";
                        break;
                    }
                    case 0: {
                        string = "NULL";
                        break;
                    }
                }
                printWriter.print(s);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(string);
                printWriter.print(" ");
                printWriter.println((Object)j0$a.b);
                if (b) {
                    if (j0$a.d != 0 || j0$a.e != 0) {
                        printWriter.print(s);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(j0$a.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(j0$a.e));
                    }
                    if (j0$a.f != 0 || j0$a.g != 0) {
                        printWriter.print(s);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(j0$a.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(j0$a.g));
                    }
                }
            }
        }
    }
    
    void k() {
        for (int size = super.c.size(), i = 0; i < size; ++i) {
            final j0$a j0$a = (j0$a)super.c.get(i);
            o b = j0$a.b;
            if (b != null) {
                b.p = this.w;
                b.O0(false);
                b.N0(super.h);
                b.Q0(super.p, super.q);
            }
            b0 b2 = null;
            switch (j0$a.a) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(j0$a.a);
                    throw new IllegalArgumentException(sb.toString());
                }
                case 10: {
                    this.t.H0(b, j0$a.i);
                    continue;
                }
                case 9: {
                    b2 = this.t;
                    b = null;
                    break;
                }
                case 8: {
                    b2 = this.t;
                    break;
                }
                case 7: {
                    b.L0(j0$a.d, j0$a.e, j0$a.f, j0$a.g);
                    this.t.G0(b, false);
                    this.t.i(b);
                    continue;
                }
                case 6: {
                    b.L0(j0$a.d, j0$a.e, j0$a.f, j0$a.g);
                    this.t.q(b);
                    continue;
                }
                case 5: {
                    b.L0(j0$a.d, j0$a.e, j0$a.f, j0$a.g);
                    this.t.G0(b, false);
                    this.t.K0(b);
                    continue;
                }
                case 4: {
                    b.L0(j0$a.d, j0$a.e, j0$a.f, j0$a.g);
                    this.t.i0(b);
                    continue;
                }
                case 3: {
                    b.L0(j0$a.d, j0$a.e, j0$a.f, j0$a.g);
                    this.t.A0(b);
                    continue;
                }
                case 1: {
                    b.L0(j0$a.d, j0$a.e, j0$a.f, j0$a.g);
                    this.t.G0(b, false);
                    this.t.f(b);
                    continue;
                }
            }
            b2.I0(b);
        }
    }
    
    void l() {
        for (int i = super.c.size() - 1; i >= 0; --i) {
            final j0$a j0$a = (j0$a)super.c.get(i);
            o b = j0$a.b;
            if (b != null) {
                b.p = this.w;
                b.O0(true);
                b.N0(b0.E0(super.h));
                b.Q0(super.q, super.p);
            }
            b0 b2 = null;
            switch (j0$a.a) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(j0$a.a);
                    throw new IllegalArgumentException(sb.toString());
                }
                case 10: {
                    this.t.H0(b, j0$a.h);
                    continue;
                }
                case 9: {
                    b2 = this.t;
                    break;
                }
                case 8: {
                    b2 = this.t;
                    b = null;
                    break;
                }
                case 7: {
                    b.L0(j0$a.d, j0$a.e, j0$a.f, j0$a.g);
                    this.t.G0(b, true);
                    this.t.q(b);
                    continue;
                }
                case 6: {
                    b.L0(j0$a.d, j0$a.e, j0$a.f, j0$a.g);
                    this.t.i(b);
                    continue;
                }
                case 5: {
                    b.L0(j0$a.d, j0$a.e, j0$a.f, j0$a.g);
                    this.t.G0(b, true);
                    this.t.i0(b);
                    continue;
                }
                case 4: {
                    b.L0(j0$a.d, j0$a.e, j0$a.f, j0$a.g);
                    this.t.K0(b);
                    continue;
                }
                case 3: {
                    b.L0(j0$a.d, j0$a.e, j0$a.f, j0$a.g);
                    this.t.f(b);
                    continue;
                }
                case 1: {
                    b.L0(j0$a.d, j0$a.e, j0$a.f, j0$a.g);
                    this.t.G0(b, true);
                    this.t.A0(b);
                    continue;
                }
            }
            b2.I0(b);
        }
    }
    
    o m(final ArrayList list, o b) {
        int i = 0;
        o o = b;
        while (i < super.c.size()) {
            final j0$a j0$a = (j0$a)super.c.get(i);
            final int a = j0$a.a;
            int n = 0;
            Label_0453: {
                if (a != 1) {
                    if (a != 2) {
                        if (a != 3 && a != 6) {
                            if (a != 7) {
                                if (a != 8) {
                                    b = o;
                                    n = i;
                                    break Label_0453;
                                }
                                super.c.add(i, (Object)new j0$a(9, o, true));
                                j0$a.c = true;
                                n = i + 1;
                                b = j0$a.b;
                                break Label_0453;
                            }
                        }
                        else {
                            list.remove((Object)j0$a.b);
                            final o b2 = j0$a.b;
                            b = o;
                            n = i;
                            if (b2 == o) {
                                super.c.add(i, (Object)new j0$a(9, b2));
                                n = i + 1;
                                b = null;
                            }
                            break Label_0453;
                        }
                    }
                    else {
                        final o b3 = j0$a.b;
                        final int z = b3.z;
                        int j = list.size() - 1;
                        int n2 = 0;
                        n = i;
                        b = o;
                        while (j >= 0) {
                            final o o2 = (o)list.get(j);
                            o o3 = b;
                            int n3 = n;
                            int n4 = n2;
                            if (o2.z == z) {
                                if (o2 == b3) {
                                    n4 = 1;
                                    o3 = b;
                                    n3 = n;
                                }
                                else {
                                    o3 = b;
                                    n3 = n;
                                    if (o2 == b) {
                                        super.c.add(n, (Object)new j0$a(9, o2, true));
                                        n3 = n + 1;
                                        o3 = null;
                                    }
                                    final j0$a j0$a2 = new j0$a(3, o2, true);
                                    j0$a2.d = j0$a.d;
                                    j0$a2.f = j0$a.f;
                                    j0$a2.e = j0$a.e;
                                    j0$a2.g = j0$a.g;
                                    super.c.add(n3, (Object)j0$a2);
                                    list.remove((Object)o2);
                                    ++n3;
                                    n4 = n2;
                                }
                            }
                            --j;
                            b = o3;
                            n = n3;
                            n2 = n4;
                        }
                        if (n2 != 0) {
                            super.c.remove(n);
                            --n;
                            break Label_0453;
                        }
                        j0$a.a = 1;
                        j0$a.c = true;
                        list.add((Object)b3);
                        break Label_0453;
                    }
                }
                list.add((Object)j0$a.b);
                n = i;
                b = o;
            }
            i = n + 1;
            o = b;
        }
        return o;
    }
    
    public void n() {
        if (super.s != null) {
            for (int i = 0; i < super.s.size(); ++i) {
                ((Runnable)super.s.get(i)).run();
            }
            super.s = null;
        }
    }
    
    o o(final ArrayList list, o b) {
        for (int i = super.c.size() - 1; i >= 0; --i) {
            final j0$a j0$a = (j0$a)super.c.get(i);
            final int a = j0$a.a;
            Label_0127: {
                if (a != 1) {
                    if (a != 3) {
                        switch (a) {
                            default: {
                                continue;
                            }
                            case 10: {
                                j0$a.i = j0$a.h;
                                continue;
                            }
                            case 9: {
                                b = j0$a.b;
                                continue;
                            }
                            case 8: {
                                b = null;
                                continue;
                            }
                            case 6: {
                                break;
                            }
                            case 7: {
                                break Label_0127;
                            }
                        }
                    }
                    list.add((Object)j0$a.b);
                    continue;
                }
            }
            list.remove((Object)j0$a.b);
        }
        return b;
    }
    
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode((Object)this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (super.k != null) {
            sb.append(" ");
            sb.append(super.k);
        }
        sb.append("}");
        return sb.toString();
    }
}
