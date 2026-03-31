package u;

import android.graphics.Paint;
import android.text.TextDirectionHeuristics;
import v.c;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.text.PrecomputedText$Params;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.Spannable;

public abstract class l implements Spannable
{
    public static final class a
    {
        private final TextPaint a;
        private final TextDirectionHeuristic b;
        private final int c;
        private final int d;
        final PrecomputedText$Params e;
        
        public a(PrecomputedText$Params e) {
            this.a = d.a(e);
            this.b = e.a(e);
            this.c = f.a(e);
            this.d = g.a(e);
            if (Build$VERSION.SDK_INT < 29) {
                e = null;
            }
            this.e = e;
        }
        
        a(final TextPaint a, final TextDirectionHeuristic b, final int c, final int d) {
            PrecomputedText$Params a2;
            if (Build$VERSION.SDK_INT >= 29) {
                a2 = k.a(j.a(i.a(h.a(b.a(a), c), d), b));
            }
            else {
                a2 = null;
            }
            this.e = a2;
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public boolean a(final l.a a) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 23) {
                if (this.c != a.b()) {
                    return false;
                }
                if (this.d != a.c()) {
                    return false;
                }
            }
            if (((Paint)this.a).getTextSize() != ((Paint)a.e()).getTextSize()) {
                return false;
            }
            if (((Paint)this.a).getTextScaleX() != ((Paint)a.e()).getTextScaleX()) {
                return false;
            }
            if (((Paint)this.a).getTextSkewX() != ((Paint)a.e()).getTextSkewX()) {
                return false;
            }
            if (((Paint)this.a).getLetterSpacing() != ((Paint)a.e()).getLetterSpacing()) {
                return false;
            }
            if (!TextUtils.equals((CharSequence)((Paint)this.a).getFontFeatureSettings(), (CharSequence)((Paint)a.e()).getFontFeatureSettings())) {
                return false;
            }
            if (((Paint)this.a).getFlags() != ((Paint)a.e()).getFlags()) {
                return false;
            }
            if (sdk_INT >= 24) {
                if (!androidx.core.os.h.a(a.a(this.a), (Object)a.a(a.e()))) {
                    return false;
                }
            }
            else if (!((Paint)this.a).getTextLocale().equals((Object)((Paint)a.e()).getTextLocale())) {
                return false;
            }
            if (((Paint)this.a).getTypeface() == null) {
                if (((Paint)a.e()).getTypeface() != null) {
                    return false;
                }
            }
            else if (!((Paint)this.a).getTypeface().equals((Object)((Paint)a.e()).getTypeface())) {
                return false;
            }
            return true;
        }
        
        public int b() {
            return this.c;
        }
        
        public int c() {
            return this.d;
        }
        
        public TextDirectionHeuristic d() {
            return this.b;
        }
        
        public TextPaint e() {
            return this.a;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (o == this) {
                return true;
            }
            if (!(o instanceof l.a)) {
                return false;
            }
            final l.a a = (l.a)o;
            if (!this.a(a)) {
                return false;
            }
            if (this.b != a.d()) {
                b = false;
            }
            return b;
        }
        
        @Override
        public int hashCode() {
            if (Build$VERSION.SDK_INT >= 24) {
                return v.c.b(((Paint)this.a).getTextSize(), ((Paint)this.a).getTextScaleX(), ((Paint)this.a).getTextSkewX(), ((Paint)this.a).getLetterSpacing(), ((Paint)this.a).getFlags(), u.a.a(this.a), ((Paint)this.a).getTypeface(), ((Paint)this.a).isElegantTextHeight(), this.b, this.c, this.d);
            }
            return v.c.b(((Paint)this.a).getTextSize(), ((Paint)this.a).getTextScaleX(), ((Paint)this.a).getTextSkewX(), ((Paint)this.a).getLetterSpacing(), ((Paint)this.a).getFlags(), ((Paint)this.a).getTextLocale(), ((Paint)this.a).getTypeface(), ((Paint)this.a).isElegantTextHeight(), this.b, this.c, this.d);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("{");
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("textSize=");
            sb2.append(((Paint)this.a).getTextSize());
            sb.append(sb2.toString());
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(", textScaleX=");
            sb3.append(((Paint)this.a).getTextScaleX());
            sb.append(sb3.toString());
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(", textSkewX=");
            sb4.append(((Paint)this.a).getTextSkewX());
            sb.append(sb4.toString());
            final int sdk_INT = Build$VERSION.SDK_INT;
            final StringBuilder sb5 = new StringBuilder();
            sb5.append(", letterSpacing=");
            sb5.append(((Paint)this.a).getLetterSpacing());
            sb.append(sb5.toString());
            final StringBuilder sb6 = new StringBuilder();
            sb6.append(", elegantTextHeight=");
            sb6.append(((Paint)this.a).isElegantTextHeight());
            sb.append(sb6.toString());
            StringBuilder sb7;
            Object o;
            if (sdk_INT >= 24) {
                sb7 = new StringBuilder();
                sb7.append(", textLocale=");
                o = u.a.a(this.a);
            }
            else {
                sb7 = new StringBuilder();
                sb7.append(", textLocale=");
                o = ((Paint)this.a).getTextLocale();
            }
            sb7.append(o);
            sb.append(sb7.toString());
            final StringBuilder sb8 = new StringBuilder();
            sb8.append(", typeface=");
            sb8.append((Object)((Paint)this.a).getTypeface());
            sb.append(sb8.toString());
            if (sdk_INT >= 26) {
                final StringBuilder sb9 = new StringBuilder();
                sb9.append(", variationSettings=");
                sb9.append(u.c.a(this.a));
                sb.append(sb9.toString());
            }
            final StringBuilder sb10 = new StringBuilder();
            sb10.append(", textDir=");
            sb10.append((Object)this.b);
            sb.append(sb10.toString());
            final StringBuilder sb11 = new StringBuilder();
            sb11.append(", breakStrategy=");
            sb11.append(this.c);
            sb.append(sb11.toString());
            final StringBuilder sb12 = new StringBuilder();
            sb12.append(", hyphenationFrequency=");
            sb12.append(this.d);
            sb.append(sb12.toString());
            sb.append("}");
            return sb.toString();
        }
        
        public static class a
        {
            private final TextPaint a;
            private TextDirectionHeuristic b;
            private int c;
            private int d;
            
            public a(final TextPaint a) {
                this.a = a;
                if (Build$VERSION.SDK_INT >= 23) {
                    this.c = 1;
                    this.d = 1;
                }
                else {
                    this.d = 0;
                    this.c = 0;
                }
                this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            
            public l.a a() {
                return new l.a(this.a, this.b, this.c, this.d);
            }
            
            public a b(final int c) {
                this.c = c;
                return this;
            }
            
            public a c(final int d) {
                this.d = d;
                return this;
            }
            
            public a d(final TextDirectionHeuristic b) {
                this.b = b;
                return this;
            }
        }
    }
}
