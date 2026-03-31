package g4;

import i4.x;
import i4.d;
import i4.l;
import n4.b;

public abstract class a
{
    public static final Class a(final b b) {
        l.e(b, "<this>");
        final Class c = ((d)b).c();
        l.c(c, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return c;
    }
    
    public static final Class b(final b b) {
        l.e(b, "<this>");
        Object c = ((d)b).c();
        if (!((Class)c).isPrimitive()) {
            l.c(c, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return (Class)c;
        }
        final String name = ((Class)c).getName();
        switch (name.hashCode()) {
            case 109413500: {
                if (!name.equals((Object)"short")) {
                    break;
                }
                c = Short.class;
                break;
            }
            case 97526364: {
                if (!name.equals((Object)"float")) {
                    break;
                }
                c = Float.class;
                break;
            }
            case 64711720: {
                if (!name.equals((Object)"boolean")) {
                    break;
                }
                c = Boolean.class;
                break;
            }
            case 3625364: {
                if (!name.equals((Object)"void")) {
                    break;
                }
                c = Void.class;
                break;
            }
            case 3327612: {
                if (!name.equals((Object)"long")) {
                    break;
                }
                c = Long.class;
                break;
            }
            case 3052374: {
                if (!name.equals((Object)"char")) {
                    break;
                }
                c = Character.class;
                break;
            }
            case 3039496: {
                if (!name.equals((Object)"byte")) {
                    break;
                }
                c = Byte.class;
                break;
            }
            case 104431: {
                if (!name.equals((Object)"int")) {
                    break;
                }
                c = Integer.class;
                break;
            }
            case -1325958191: {
                if (!name.equals((Object)"double")) {
                    break;
                }
                c = Double.class;
                break;
            }
        }
        l.c(c, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return (Class)c;
    }
    
    public static final b c(final Class clazz) {
        l.e(clazz, "<this>");
        return x.b(clazz);
    }
}
