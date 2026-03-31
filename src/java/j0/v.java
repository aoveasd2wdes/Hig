package j0;

import android.content.res.TypedArray;
import i0.c;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater$Factory2;

class v implements LayoutInflater$Factory2
{
    final b0 c;
    
    v(final b0 c) {
        this.c = c;
    }
    
    public View onCreateView(final View view, String attributeValue, final Context context, final AttributeSet set) {
        if (s.class.getName().equals((Object)attributeValue)) {
            return (View)new s(context, set, this.c);
        }
        if (!"fragment".equals((Object)attributeValue)) {
            return null;
        }
        attributeValue = set.getAttributeValue((String)null, "class");
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, i0.c.a);
        String string;
        if ((string = attributeValue) == null) {
            string = obtainStyledAttributes.getString(i0.c.b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(i0.c.c, -1);
        final String string2 = obtainStyledAttributes.getString(i0.c.d);
        obtainStyledAttributes.recycle();
        if (string == null || !t.b(context.getClassLoader(), string)) {
            return null;
        }
        int id;
        if (view != null) {
            id = view.getId();
        }
        else {
            id = 0;
        }
        if (id == -1 && resourceId == -1 && string2 == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(set.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(string);
            throw new IllegalArgumentException(sb.toString());
        }
        o o;
        if (resourceId != -1) {
            o = this.c.O(resourceId);
        }
        else {
            o = null;
        }
        o p4 = o;
        if (o == null) {
            p4 = o;
            if (string2 != null) {
                p4 = this.c.P(string2);
            }
        }
        o o2;
        if ((o2 = p4) == null) {
            o2 = p4;
            if (id != -1) {
                o2 = this.c.O(id);
            }
        }
        if (o2 == null) {
            final o a = this.c.Z().a(context.getClassLoader(), string);
            a.q = true;
            if (resourceId == 0) {
                resourceId = id;
            }
            a.y = resourceId;
            a.z = id;
            a.A = string2;
            a.r = true;
            (a.v = this.c).a0();
            this.c.a0();
            throw null;
        }
        if (o2.r) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(set.getPositionDescription());
            sb2.append(": Duplicate id 0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(", tag ");
            sb2.append(string2);
            sb2.append(", or parent id 0x");
            sb2.append(Integer.toHexString(id));
            sb2.append(" with another fragment for ");
            sb2.append(string);
            throw new IllegalArgumentException(sb2.toString());
        }
        o2.r = true;
        (o2.v = this.c).a0();
        this.c.a0();
        throw null;
    }
    
    public View onCreateView(final String s, final Context context, final AttributeSet set) {
        return this.onCreateView(null, s, context, set);
    }
}
