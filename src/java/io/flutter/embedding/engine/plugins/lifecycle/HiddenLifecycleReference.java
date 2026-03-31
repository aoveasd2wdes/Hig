package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.lifecycle.h;
import androidx.annotation.Keep;

@Keep
public class HiddenLifecycleReference
{
    private final h lifecycle;
    
    public HiddenLifecycleReference(final h lifecycle) {
        this.lifecycle = lifecycle;
    }
    
    public h getLifecycle() {
        return this.lifecycle;
    }
}
