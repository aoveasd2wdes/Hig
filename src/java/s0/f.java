package s0;

import android.animation.TypeConverter;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

abstract class f
{
    static ObjectAnimator a(final Object o, final Property property, final Path path) {
        return ObjectAnimator.ofObject(o, property, (TypeConverter)null, path);
    }
}
