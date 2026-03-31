package f1;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import android.location.Address;

public abstract class b
{
    private static Map a(final Address address) {
        final HashMap hashMap = new HashMap();
        final String a = f1.a.a(address.getAddressLine(0));
        ((Map)hashMap).put((Object)"name", (Object)address.getFeatureName());
        ((Map)hashMap).put((Object)"street", (Object)a);
        ((Map)hashMap).put((Object)"isoCountryCode", (Object)address.getCountryCode());
        ((Map)hashMap).put((Object)"country", (Object)address.getCountryName());
        ((Map)hashMap).put((Object)"thoroughfare", (Object)address.getThoroughfare());
        ((Map)hashMap).put((Object)"subThoroughfare", (Object)address.getSubThoroughfare());
        ((Map)hashMap).put((Object)"postalCode", (Object)address.getPostalCode());
        ((Map)hashMap).put((Object)"administrativeArea", (Object)address.getAdminArea());
        ((Map)hashMap).put((Object)"subAdministrativeArea", (Object)address.getSubAdminArea());
        ((Map)hashMap).put((Object)"locality", (Object)address.getLocality());
        ((Map)hashMap).put((Object)"subLocality", (Object)address.getSubLocality());
        return (Map)hashMap;
    }
    
    public static List b(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((List)list2).add((Object)a((Address)iterator.next()));
        }
        return (List)list2;
    }
    
    public static List c(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((List)list2).add((Object)d((Address)iterator.next()));
        }
        return (List)list2;
    }
    
    private static Map d(final Address address) {
        final HashMap hashMap = new HashMap();
        ((Map)hashMap).put((Object)"latitude", (Object)address.getLatitude());
        ((Map)hashMap).put((Object)"longitude", (Object)address.getLongitude());
        ((Map)hashMap).put((Object)"timestamp", (Object)Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis());
        return (Map)hashMap;
    }
}
