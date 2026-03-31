package v4;

import w4.d0;
import r4.q1;
import h4.p;
import y3.g;

public abstract class s
{
    public static final void a(final q q, final g g) {
        if (((Number)g.j(0, (p)new s$a(q))).intValue() == q.j) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Flow invariant is violated:\n\t\tFlow was collected in ");
        sb.append((Object)q.i);
        sb.append(",\n\t\tbut emission happened in ");
        sb.append((Object)g);
        sb.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public static final q1 b(q1 parent, final q1 q1) {
        while (parent != null) {
            if (parent == q1) {
                return parent;
            }
            if (!(parent instanceof d0)) {
                return parent;
            }
            parent = parent.getParent();
        }
        return null;
    }
}
