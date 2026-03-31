package s3;

import k3.c$c;
import k3.a$d;
import k3.c;
import k3.i;
import i4.l;
import k3.a$e;
import h4.a;
import u3.f;
import u3.e;
import java.util.Map;
import java.util.List;

public interface b0
{
    public static final a b = a.a;
    
    Map a(final List p0, final e0 p1);
    
    Double b(final String p0, final e0 p1);
    
    Long c(final String p0, final e0 p1);
    
    void d(final String p0, final List p1, final e0 p2);
    
    List e(final String p0, final e0 p1);
    
    void f(final String p0, final String p1, final e0 p2);
    
    List h(final List p0, final e0 p1);
    
    void i(final String p0, final double p1, final e0 p2);
    
    Boolean j(final String p0, final e0 p1);
    
    String l(final String p0, final e0 p1);
    
    void m(final List p0, final e0 p1);
    
    void n(final String p0, final boolean p1, final e0 p2);
    
    void o(final String p0, final long p1, final e0 p2);
    
    public static final class a
    {
        static final a a;
        private static final e b;
        
        static {
            a = new a();
            b = f.a((h4.a)b0$a$a.f);
        }
        
        private a() {
        }
        
        private static final void A(final b0 b0, Object value, final a$e a$e) {
            l.e((Object)a$e, "reply");
            l.c(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            final List list = (List)value;
            value = list.get(0);
            l.c(value, "null cannot be cast to non-null type kotlin.String");
            final String s = (String)value;
            final Object value2 = list.get(1);
            l.c(value2, "null cannot be cast to non-null type kotlin.Double");
            final double doubleValue = (double)value2;
            final Object value3 = list.get(2);
            l.c(value3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            final e0 e0 = (e0)value3;
            List a;
            try {
                b0.i(s, doubleValue, e0);
                v3.l.d((Object)null);
            }
            finally {
                final Throwable t;
                a = n.a(t);
            }
            a$e.a((Object)a);
        }
        
        private static final void B(final b0 b0, Object value, final a$e a$e) {
            l.e((Object)a$e, "reply");
            l.c(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            final List list = (List)value;
            value = list.get(0);
            l.c(value, "null cannot be cast to non-null type kotlin.String");
            final String s = (String)value;
            final Object value2 = list.get(1);
            l.c(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            final List list2 = (List)value2;
            final Object value3 = list.get(2);
            l.c(value3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            final e0 e0 = (e0)value3;
            List a;
            try {
                b0.d(s, list2, e0);
                v3.l.d((Object)null);
            }
            finally {
                final Throwable t;
                a = n.a(t);
            }
            a$e.a((Object)a);
        }
        
        private static final void p(final b0 b0, Object value, final a$e a$e) {
            l.e((Object)a$e, "reply");
            l.c(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            final List list = (List)value;
            value = list.get(0);
            l.c(value, "null cannot be cast to non-null type kotlin.String");
            final String s = (String)value;
            final Object value2 = list.get(1);
            l.c(value2, "null cannot be cast to non-null type kotlin.Boolean");
            final boolean booleanValue = (boolean)value2;
            final Object value3 = list.get(2);
            l.c(value3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            final e0 e0 = (e0)value3;
            List a;
            try {
                b0.n(s, booleanValue, e0);
                v3.l.d((Object)null);
            }
            finally {
                final Throwable t;
                a = n.a(t);
            }
            a$e.a((Object)a);
        }
        
        private static final void q(final b0 b0, Object value, final a$e a$e) {
            l.e((Object)a$e, "reply");
            l.c(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            final List list = (List)value;
            value = list.get(0);
            l.c(value, "null cannot be cast to non-null type kotlin.String");
            final String s = (String)value;
            final Object value2 = list.get(1);
            l.c(value2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            final e0 e0 = (e0)value2;
            List a = null;
            try {
                v3.l.d((Object)b0.l(s, e0));
            }
            finally {
                final Throwable t;
                a = n.a(t);
            }
            a$e.a((Object)a);
        }
        
        private static final void r(final b0 b0, Object value, final a$e a$e) {
            l.e((Object)a$e, "reply");
            l.c(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            final List list = (List)value;
            value = list.get(0);
            l.c(value, "null cannot be cast to non-null type kotlin.String");
            final String s = (String)value;
            final Object value2 = list.get(1);
            l.c(value2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            final e0 e0 = (e0)value2;
            List a = null;
            try {
                v3.l.d((Object)b0.j(s, e0));
            }
            finally {
                final Throwable t;
                a = n.a(t);
            }
            a$e.a((Object)a);
        }
        
        private static final void s(final b0 b0, Object value, final a$e a$e) {
            l.e((Object)a$e, "reply");
            l.c(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            final List list = (List)value;
            value = list.get(0);
            l.c(value, "null cannot be cast to non-null type kotlin.String");
            final String s = (String)value;
            final Object value2 = list.get(1);
            l.c(value2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            final e0 e0 = (e0)value2;
            List a = null;
            try {
                v3.l.d((Object)b0.b(s, e0));
            }
            finally {
                final Throwable t;
                a = n.a(t);
            }
            a$e.a((Object)a);
        }
        
        private static final void t(final b0 b0, Object value, final a$e a$e) {
            l.e((Object)a$e, "reply");
            l.c(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            final List list = (List)value;
            value = list.get(0);
            l.c(value, "null cannot be cast to non-null type kotlin.String");
            final String s = (String)value;
            final Object value2 = list.get(1);
            l.c(value2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            final e0 e0 = (e0)value2;
            List a = null;
            try {
                v3.l.d((Object)b0.c(s, e0));
            }
            finally {
                final Throwable t;
                a = n.a(t);
            }
            a$e.a((Object)a);
        }
        
        private static final void u(final b0 b0, Object value, final a$e a$e) {
            l.e((Object)a$e, "reply");
            l.c(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            final List list = (List)value;
            value = list.get(0);
            l.c(value, "null cannot be cast to non-null type kotlin.String");
            final String s = (String)value;
            final Object value2 = list.get(1);
            l.c(value2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            final e0 e0 = (e0)value2;
            List a = null;
            try {
                v3.l.d((Object)b0.e(s, e0));
            }
            finally {
                final Throwable t;
                a = n.a(t);
            }
            a$e.a((Object)a);
        }
        
        private static final void v(final b0 b0, final Object o, final a$e a$e) {
            l.e((Object)a$e, "reply");
            l.c(o, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            final List list = (List)o;
            final List list2 = (List)list.get(0);
            final Object value = list.get(1);
            l.c(value, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            final e0 e0 = (e0)value;
            List a;
            try {
                b0.m(list2, e0);
                v3.l.d((Object)null);
            }
            finally {
                final Throwable t;
                a = n.a(t);
            }
            a$e.a((Object)a);
        }
        
        private static final void w(final b0 b0, final Object o, final a$e a$e) {
            l.e((Object)a$e, "reply");
            l.c(o, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            final List list = (List)o;
            final List list2 = (List)list.get(0);
            final Object value = list.get(1);
            l.c(value, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            final e0 e0 = (e0)value;
            List a = null;
            try {
                v3.l.d((Object)b0.a(list2, e0));
            }
            finally {
                final Throwable t;
                a = n.a(t);
            }
            a$e.a((Object)a);
        }
        
        private static final void x(final b0 b0, final Object o, final a$e a$e) {
            l.e((Object)a$e, "reply");
            l.c(o, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            final List list = (List)o;
            final List list2 = (List)list.get(0);
            final Object value = list.get(1);
            l.c(value, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            final e0 e0 = (e0)value;
            List a = null;
            try {
                v3.l.d((Object)b0.h(list2, e0));
            }
            finally {
                final Throwable t;
                a = n.a(t);
            }
            a$e.a((Object)a);
        }
        
        private static final void y(final b0 b0, Object value, final a$e a$e) {
            l.e((Object)a$e, "reply");
            l.c(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            final List list = (List)value;
            value = list.get(0);
            l.c(value, "null cannot be cast to non-null type kotlin.String");
            final String s = (String)value;
            final Object value2 = list.get(1);
            l.c(value2, "null cannot be cast to non-null type kotlin.String");
            final String s2 = (String)value2;
            final Object value3 = list.get(2);
            l.c(value3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            final e0 e0 = (e0)value3;
            List a;
            try {
                b0.f(s, s2, e0);
                v3.l.d((Object)null);
            }
            finally {
                final Throwable t;
                a = n.a(t);
            }
            a$e.a((Object)a);
        }
        
        private static final void z(final b0 b0, Object value, final a$e a$e) {
            l.e((Object)a$e, "reply");
            l.c(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            final List list = (List)value;
            value = list.get(0);
            l.c(value, "null cannot be cast to non-null type kotlin.String");
            final String s = (String)value;
            final Object value2 = list.get(1);
            l.c(value2, "null cannot be cast to non-null type kotlin.Long");
            final long longValue = (long)value2;
            final Object value3 = list.get(2);
            l.c(value3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            final e0 e0 = (e0)value3;
            List a;
            try {
                b0.o(s, longValue, e0);
                v3.l.d((Object)null);
            }
            finally {
                final Throwable t;
                a = n.a(t);
            }
            a$e.a((Object)a);
        }
        
        public final i n() {
            return (i)b0.a.b.getValue();
        }
        
        public final void o(final c c, final b0 b0, String string) {
            l.e((Object)c, "binaryMessenger");
            l.e((Object)string, "messageChannelSuffix");
            if (((CharSequence)string).length() > 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append(".");
                sb.append(string);
                string = sb.toString();
            }
            else {
                string = "";
            }
            final c$c f = c.f();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool");
            sb2.append(string);
            final k3.a a = new k3.a(c, sb2.toString(), this.n(), f);
            if (b0 != null) {
                a.e((a$d)new o(b0));
            }
            else {
                a.e((a$d)null);
            }
            final c$c f2 = c.f();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString");
            sb3.append(string);
            final k3.a a2 = new k3.a(c, sb3.toString(), this.n(), f2);
            if (b0 != null) {
                a2.e((a$d)new v(b0));
            }
            else {
                a2.e((a$d)null);
            }
            final c$c f3 = c.f();
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt");
            sb4.append(string);
            final k3.a a3 = new k3.a(c, sb4.toString(), this.n(), f3);
            if (b0 != null) {
                a3.e((a$d)new w(b0));
            }
            else {
                a3.e((a$d)null);
            }
            final c$c f4 = c.f();
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble");
            sb5.append(string);
            final k3.a a4 = new k3.a(c, sb5.toString(), this.n(), f4);
            if (b0 != null) {
                a4.e((a$d)new x(b0));
            }
            else {
                a4.e((a$d)null);
            }
            final c$c f5 = c.f();
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setStringList");
            sb6.append(string);
            final k3.a a5 = new k3.a(c, sb6.toString(), this.n(), f5);
            if (b0 != null) {
                a5.e((a$d)new y(b0));
            }
            else {
                a5.e((a$d)null);
            }
            final c$c f6 = c.f();
            final StringBuilder sb7 = new StringBuilder();
            sb7.append("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString");
            sb7.append(string);
            final k3.a a6 = new k3.a(c, sb7.toString(), this.n(), f6);
            if (b0 != null) {
                a6.e((a$d)new z(b0));
            }
            else {
                a6.e((a$d)null);
            }
            final c$c f7 = c.f();
            final StringBuilder sb8 = new StringBuilder();
            sb8.append("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool");
            sb8.append(string);
            final k3.a a7 = new k3.a(c, sb8.toString(), this.n(), f7);
            if (b0 != null) {
                a7.e((a$d)new a0(b0));
            }
            else {
                a7.e((a$d)null);
            }
            final c$c f8 = c.f();
            final StringBuilder sb9 = new StringBuilder();
            sb9.append("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble");
            sb9.append(string);
            final k3.a a8 = new k3.a(c, sb9.toString(), this.n(), f8);
            if (b0 != null) {
                a8.e((a$d)new p(b0));
            }
            else {
                a8.e((a$d)null);
            }
            final c$c f9 = c.f();
            final StringBuilder sb10 = new StringBuilder();
            sb10.append("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt");
            sb10.append(string);
            final k3.a a9 = new k3.a(c, sb10.toString(), this.n(), f9);
            if (b0 != null) {
                a9.e((a$d)new q(b0));
            }
            else {
                a9.e((a$d)null);
            }
            final c$c f10 = c.f();
            final StringBuilder sb11 = new StringBuilder();
            sb11.append("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList");
            sb11.append(string);
            final k3.a a10 = new k3.a(c, sb11.toString(), this.n(), f10);
            if (b0 != null) {
                a10.e((a$d)new r(b0));
            }
            else {
                a10.e((a$d)null);
            }
            final c$c f11 = c.f();
            final StringBuilder sb12 = new StringBuilder();
            sb12.append("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear");
            sb12.append(string);
            final k3.a a11 = new k3.a(c, sb12.toString(), this.n(), f11);
            if (b0 != null) {
                a11.e((a$d)new s(b0));
            }
            else {
                a11.e((a$d)null);
            }
            final c$c f12 = c.f();
            final StringBuilder sb13 = new StringBuilder();
            sb13.append("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll");
            sb13.append(string);
            final k3.a a12 = new k3.a(c, sb13.toString(), this.n(), f12);
            if (b0 != null) {
                a12.e((a$d)new t(b0));
            }
            else {
                a12.e((a$d)null);
            }
            final c$c f13 = c.f();
            final StringBuilder sb14 = new StringBuilder();
            sb14.append("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys");
            sb14.append(string);
            final k3.a a13 = new k3.a(c, sb14.toString(), this.n(), f13);
            if (b0 != null) {
                a13.e((a$d)new u(b0));
            }
            else {
                a13.e((a$d)null);
            }
        }
    }
}
