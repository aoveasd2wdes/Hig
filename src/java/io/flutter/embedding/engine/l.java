package io.flutter.embedding.engine;

import java.util.ArrayList;
import android.content.Intent;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class l
{
    private Set a;
    
    public l(final List list) {
        this.a = (Set)new HashSet((Collection)list);
    }
    
    public static l a(final Intent intent) {
        final ArrayList list = new ArrayList();
        if (intent.getBooleanExtra("trace-startup", false)) {
            list.add((Object)"--trace-startup");
        }
        if (intent.getBooleanExtra("start-paused", false)) {
            list.add((Object)"--start-paused");
        }
        int n = intent.getIntExtra("vm-service-port", 0);
        Label_0113: {
            StringBuilder sb;
            if (n > 0) {
                sb = new StringBuilder();
            }
            else {
                n = intent.getIntExtra("observatory-port", 0);
                if (n <= 0) {
                    break Label_0113;
                }
                sb = new StringBuilder();
            }
            sb.append("--vm-service-port=");
            sb.append(Integer.toString(n));
            list.add((Object)sb.toString());
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            list.add((Object)"--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("endless-trace-buffer", false)) {
            list.add((Object)"--endless-trace-buffer");
        }
        if (intent.getBooleanExtra("use-test-fonts", false)) {
            list.add((Object)"--use-test-fonts");
        }
        if (intent.getBooleanExtra("enable-dart-profiling", false)) {
            list.add((Object)"--enable-dart-profiling");
        }
        if (intent.getBooleanExtra("enable-software-rendering", false)) {
            list.add((Object)"--enable-software-rendering");
        }
        if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
            list.add((Object)"--skia-deterministic-rendering");
        }
        if (intent.getBooleanExtra("trace-skia", false)) {
            list.add((Object)"--trace-skia");
        }
        final String stringExtra = intent.getStringExtra("trace-skia-allowlist");
        if (stringExtra != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("--trace-skia-allowlist=");
            sb2.append(stringExtra);
            list.add((Object)sb2.toString());
        }
        if (intent.getBooleanExtra("trace-systrace", false)) {
            list.add((Object)"--trace-systrace");
        }
        if (intent.hasExtra("trace-to-file")) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("--trace-to-file=");
            sb3.append(intent.getStringExtra("trace-to-file"));
            list.add((Object)sb3.toString());
        }
        if (intent.getBooleanExtra("enable-impeller", false)) {
            list.add((Object)"--enable-impeller");
        }
        if (intent.getBooleanExtra("enable-vulkan-validation", false)) {
            list.add((Object)"--enable-vulkan-validation");
        }
        if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
            list.add((Object)"--dump-skp-on-shader-compilation");
        }
        if (intent.getBooleanExtra("cache-sksl", false)) {
            list.add((Object)"--cache-sksl");
        }
        if (intent.getBooleanExtra("purge-persistent-cache", false)) {
            list.add((Object)"--purge-persistent-cache");
        }
        if (intent.getBooleanExtra("verbose-logging", false)) {
            list.add((Object)"--verbose-logging");
        }
        if (intent.hasExtra("dart-flags")) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("--dart-flags=");
            sb4.append(intent.getStringExtra("dart-flags"));
            list.add((Object)sb4.toString());
        }
        return new l((List)list);
    }
    
    public String[] b() {
        return (String[])this.a.toArray((Object[])new String[this.a.size()]);
    }
}
