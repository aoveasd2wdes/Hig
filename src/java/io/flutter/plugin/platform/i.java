package io.flutter.plugin.platform;

import android.content.res.AssetFileDescriptor;
import android.view.View;
import android.view.View$OnSystemUiVisibilityChangeListener;
import android.graphics.Bitmap;
import android.app.ActivityManager$TaskDescription;
import android.net.Uri;
import android.content.ClipData$Item;
import android.content.ClipData;
import java.io.FileNotFoundException;
import java.io.IOException;
import android.content.Context;
import android.os.Bundle;
import a3.b;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.view.Window;
import android.os.Build$VERSION;
import androidx.core.view.c1;
import java.util.List;
import j3.o;
import android.app.Activity;

public class i
{
    private final Activity a;
    private final o b;
    private final d c;
    private o.j d;
    private int e;
    final o.h f;
    
    public i(final Activity a, final o b, final d c) {
        final i$a f = new i$a(this);
        this.f = (o.h)f;
        this.a = a;
        (this.b = b).l((o.h)f);
        this.c = c;
        this.e = 1280;
    }
    
    private void A(final List list) {
        int e;
        if (list.size() == 0) {
            e = 5894;
        }
        else {
            e = 1798;
        }
        for (int i = 0; i < list.size(); ++i) {
            final int n = i$c.b[((o.l)list.get(i)).ordinal()];
            if (n != 1) {
                if (n == 2) {
                    e = (e & 0xFFFFFDFF & 0xFFFFFFFD);
                }
            }
            else {
                e &= 0xFFFFFFFB;
            }
        }
        this.e = e;
        this.E();
    }
    
    private void B(final int requestedOrientation) {
        this.a.setRequestedOrientation(requestedOrientation);
    }
    
    private void C(final o.j d) {
        final Window window = this.a.getWindow();
        final c1 c1 = new c1(window, window.getDecorView());
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (sdk_INT >= 23) {
            final o.d b = d.b;
            if (b != null) {
                final int n = i$c.c[b.ordinal()];
                if (n != 1) {
                    if (n == 2) {
                        c1.b(false);
                    }
                }
                else {
                    c1.b(true);
                }
            }
            final Integer a = d.a;
            if (a != null) {
                window.setStatusBarColor((int)a);
            }
        }
        final Boolean c2 = d.c;
        if (c2 != null && sdk_INT >= 29) {
            d.a(window, (boolean)c2);
        }
        if (sdk_INT >= 26) {
            final o.d e = d.e;
            if (e != null) {
                final int n2 = i$c.c[e.ordinal()];
                if (n2 != 1) {
                    if (n2 == 2) {
                        c1.a(false);
                    }
                }
                else {
                    c1.a(true);
                }
            }
            final Integer d2 = d.d;
            if (d2 != null) {
                window.setNavigationBarColor((int)d2);
            }
        }
        final Integer f = d.f;
        if (f != null && sdk_INT >= 28) {
            io.flutter.plugin.platform.e.a(window, (int)f);
        }
        final Boolean g = d.g;
        if (g != null && sdk_INT >= 29) {
            io.flutter.plugin.platform.f.a(window, (boolean)g);
        }
        this.d = d;
    }
    
    private void D(final String s) {
        final Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", s);
        this.a.startActivity(Intent.createChooser(intent, (CharSequence)null));
    }
    
    private boolean p() {
        final ClipboardManager clipboardManager = (ClipboardManager)this.a.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return false;
        }
        final ClipDescription primaryClipDescription = clipboardManager.getPrimaryClipDescription();
        return primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*");
    }
    
    private CharSequence r(o.e coerceToText) {
        final ClipboardManager clipboardManager = (ClipboardManager)this.a.getSystemService("clipboard");
        final boolean hasPrimaryClip = clipboardManager.hasPrimaryClip();
        Object o = null;
        if (!hasPrimaryClip) {
            return null;
        }
        try {
            Label_0245: {
                try {
                    final ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip == null) {
                        return null;
                    }
                    if (coerceToText != null && coerceToText != j3.o.e.f) {
                        return null;
                    }
                    final ClipData$Item item = primaryClip.getItemAt(0);
                    final Object text = item.getText();
                    if ((coerceToText = (o.e)text) == null) {
                        coerceToText = (o.e)text;
                        try {
                            final Uri uri = item.getUri();
                            if (uri == null) {
                                coerceToText = (o.e)text;
                                a3.b.g("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                                return null;
                            }
                            coerceToText = (o.e)text;
                            o = uri.getScheme();
                            coerceToText = (o.e)text;
                            if (!((String)o).equals("content")) {
                                coerceToText = (o.e)text;
                                coerceToText = (o.e)text;
                                final StringBuilder sb = new StringBuilder();
                                coerceToText = (o.e)text;
                                sb.append("Clipboard item contains a Uri with scheme '");
                                coerceToText = (o.e)text;
                                sb.append((String)o);
                                coerceToText = (o.e)text;
                                sb.append("'that is unhandled.");
                                coerceToText = (o.e)text;
                                a3.b.g("PlatformPlugin", sb.toString());
                                return null;
                            }
                            coerceToText = (o.e)text;
                            o = ((Context)this.a).getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", (Bundle)null);
                            coerceToText = (o.e)text;
                            final Object o2 = coerceToText = (o.e)item.coerceToText((Context)this.a);
                            if (o != null) {
                                coerceToText = (o.e)o2;
                                ((AssetFileDescriptor)o).close();
                                coerceToText = (o.e)o2;
                            }
                        }
                        catch (final IOException ex) {
                            break Label_0245;
                        }
                    }
                    return (CharSequence)coerceToText;
                }
                catch (final IOException ex) {
                    coerceToText = (o.e)o;
                }
            }
            final IOException ex;
            a3.b.h("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", (Throwable)ex);
            return (CharSequence)coerceToText;
        }
        catch (final FileNotFoundException ex2) {
            a3.b.g("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        }
        catch (final SecurityException ex3) {
            a3.b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", (Throwable)ex3);
            return null;
        }
    }
    
    private void s(final o.i i) {
        if (i == o.i.f) {
            this.a.getWindow().getDecorView().playSoundEffect(0);
        }
    }
    
    private void t() {
        final d c = this.c;
        if (c != null && c.b()) {
            return;
        }
        final Activity a = this.a;
        if (a instanceof c.e) {
            ((c.e)a).l().a();
        }
        else {
            a.finish();
        }
    }
    
    private void u() {
        this.E();
    }
    
    private void v(final String s) {
        ((ClipboardManager)this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"text label?", (CharSequence)s));
    }
    
    private void w(final boolean b) {
        final d c = this.c;
        if (c != null) {
            c.h(b);
        }
    }
    
    private void x(final o.c c) {
        if (Build$VERSION.SDK_INT < 28) {
            this.a.setTaskDescription(new ActivityManager$TaskDescription(c.b, (Bitmap)null, c.a));
        }
        else {
            h.a();
            this.a.setTaskDescription(g.a(c.b, 0, c.a));
        }
    }
    
    private void y() {
        final View decorView = this.a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener((View$OnSystemUiVisibilityChangeListener)new View$OnSystemUiVisibilityChangeListener(this, decorView) {
            final View a;
            final i b;
            
            public void onSystemUiVisibilityChange(final int n) {
                this.a.post((Runnable)new j(this, n));
            }
        });
    }
    
    private void z(final o.k k) {
        int e;
        if (k == o.k.f) {
            e = 1798;
        }
        else if (k == o.k.g) {
            e = 3846;
        }
        else if (k == o.k.h) {
            e = 5894;
        }
        else {
            if (k != o.k.i || Build$VERSION.SDK_INT < 29) {
                return;
            }
            e = 1792;
        }
        this.e = e;
        this.E();
    }
    
    public void E() {
        this.a.getWindow().getDecorView().setSystemUiVisibility(this.e);
        final o.j d = this.d;
        if (d != null) {
            this.C(d);
        }
    }
    
    void F(final o.g g) {
        final View decorView = this.a.getWindow().getDecorView();
        final int n = i$c.a[g.ordinal()];
        int n2 = 1;
        int n3 = 0;
        Label_0081: {
            if (n != 1) {
                if (n != 2) {
                    n2 = 3;
                    if (n != 3) {
                        n2 = 4;
                        if (n != 4) {
                            if (n != 5) {
                                return;
                            }
                        }
                        else {
                            if (Build$VERSION.SDK_INT >= 23) {
                                n3 = 6;
                                break Label_0081;
                            }
                            return;
                        }
                    }
                }
                decorView.performHapticFeedback(n2);
                return;
            }
            n3 = 0;
        }
        decorView.performHapticFeedback(n3);
    }
    
    public void q() {
        this.b.l(null);
    }
    
    public interface d
    {
        boolean b();
        
        void h(final boolean p0);
    }
}
