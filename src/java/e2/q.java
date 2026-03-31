package e2;

import android.os.BaseBundle;
import java.text.NumberFormat;
import android.os.Bundle;
import b2.m0;
import android.os.SystemClock;
import androidx.core.location.a;
import android.location.Location;
import java.math.RoundingMode;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.text.DecimalFormat;

public abstract class q
{
    private static final DecimalFormat a;
    private static final DecimalFormat b;
    private static final StringBuilder c;
    public static final int d = 0;
    
    static {
        final Locale root = Locale.ROOT;
        a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(root));
        (b = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(root))).setRoundingMode(RoundingMode.DOWN);
        c = new StringBuilder();
    }
    
    public static StringBuilder a(final Location location, final StringBuilder sb) {
        sb.ensureCapacity(100);
        final String s = null;
        if (location == null) {
            sb.append((String)null);
            return sb;
        }
        sb.append("{");
        sb.append(location.getProvider());
        sb.append(", ");
        if (androidx.core.location.a.m(location)) {
            sb.append("mock, ");
        }
        final DecimalFormat a = q.a;
        sb.append(((NumberFormat)a).format(location.getLatitude()));
        sb.append(",");
        sb.append(((NumberFormat)a).format(location.getLongitude()));
        if (location.hasAccuracy()) {
            sb.append("±");
            sb.append(((NumberFormat)q.b).format((double)location.getAccuracy()));
            sb.append("m");
        }
        if (location.hasAltitude()) {
            sb.append(", alt=");
            final DecimalFormat b = q.b;
            sb.append(((NumberFormat)b).format(location.getAltitude()));
            if (androidx.core.location.a.l(location)) {
                sb.append("±");
                sb.append(((NumberFormat)b).format((double)androidx.core.location.a.i(location)));
            }
            sb.append("m");
        }
        if (location.hasSpeed()) {
            sb.append(", spd=");
            final DecimalFormat b2 = q.b;
            sb.append(((NumberFormat)b2).format((double)location.getSpeed()));
            if (androidx.core.location.a.k(location)) {
                sb.append("±");
                sb.append(((NumberFormat)b2).format((double)androidx.core.location.a.h(location)));
            }
            sb.append("m/s");
        }
        if (location.hasBearing()) {
            sb.append(", brg=");
            final DecimalFormat b3 = q.b;
            sb.append(((NumberFormat)b3).format((double)location.getBearing()));
            if (androidx.core.location.a.j(location)) {
                sb.append("±");
                sb.append(((NumberFormat)b3).format((double)androidx.core.location.a.b(location)));
            }
            sb.append("°");
        }
        final Bundle extras = location.getExtras();
        String string;
        if (extras != null) {
            string = ((BaseBundle)extras).getString("floorLabel");
        }
        else {
            string = null;
        }
        if (string != null) {
            sb.append(", fl=");
            sb.append(string);
        }
        final Bundle extras2 = location.getExtras();
        String string2 = s;
        if (extras2 != null) {
            string2 = ((BaseBundle)extras2).getString("levelId");
        }
        if (string2 != null) {
            sb.append(", lv=");
            sb.append(string2);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        sb.append(", ert=");
        sb.append(m0.a(androidx.core.location.a.c(location) + (currentTimeMillis - elapsedRealtime)));
        sb.append('}');
        return sb;
    }
}
