package w;

import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.text.style.ClickableSpan;

public final class a extends ClickableSpan
{
    private final int a;
    private final d0 b;
    private final int c;
    
    public a(final int a, final d0 b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void onClick(final View view) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.T(this.c, bundle);
    }
}
