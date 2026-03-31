package s0;

import android.animation.TypeConverter;
import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.util.Property;

abstract class h
{
    static PropertyValuesHolder a(final Property property, final Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter)null, path);
    }
}
