package q1;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.HashMap;
import android.content.ComponentName;
import android.os.IBinder;
import java.util.Map;
import android.content.ServiceConnection;

final class e1 implements ServiceConnection, i1
{
    private final Map a;
    private int b;
    private boolean c;
    private IBinder d;
    private final c1 e;
    private ComponentName f;
    final h1 g;
    
    public e1(final h1 g, final c1 e) {
        this.g = g;
        this.e = e;
        this.a = (Map)new HashMap();
        this.b = 2;
    }
    
    public final int a() {
        return this.b;
    }
    
    public final ComponentName b() {
        return this.f;
    }
    
    public final IBinder c() {
        return this.d;
    }
    
    public final void d(final ServiceConnection serviceConnection, final ServiceConnection serviceConnection2, final String s) {
        this.a.put((Object)serviceConnection, (Object)serviceConnection2);
    }
    
    public final void e(final String p0, final Executor p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_3       
        //     2: putfield        q1/e1.b:I
        //     5: invokestatic    android/os/StrictMode.getVmPolicy:()Landroid/os/StrictMode$VmPolicy;
        //     8: astore          4
        //    10: invokestatic    u1/f.j:()Z
        //    13: ifeq            34
        //    16: new             Landroid/os/StrictMode$VmPolicy$Builder;
        //    19: dup            
        //    20: aload           4
        //    22: invokespecial   android/os/StrictMode$VmPolicy$Builder.<init>:(Landroid/os/StrictMode$VmPolicy;)V
        //    25: invokestatic    q1/d1.a:(Landroid/os/StrictMode$VmPolicy$Builder;)Landroid/os/StrictMode$VmPolicy$Builder;
        //    28: invokevirtual   android/os/StrictMode$VmPolicy$Builder.build:()Landroid/os/StrictMode$VmPolicy;
        //    31: invokestatic    android/os/StrictMode.setVmPolicy:(Landroid/os/StrictMode$VmPolicy;)V
        //    34: aload_0        
        //    35: getfield        q1/e1.g:Lq1/h1;
        //    38: astore          5
        //    40: aload           5
        //    42: invokestatic    q1/h1.i:(Lq1/h1;)Lt1/b;
        //    45: aload           5
        //    47: invokestatic    q1/h1.g:(Lq1/h1;)Landroid/content/Context;
        //    50: aload_1        
        //    51: aload_0        
        //    52: getfield        q1/e1.e:Lq1/c1;
        //    55: aload           5
        //    57: invokestatic    q1/h1.g:(Lq1/h1;)Landroid/content/Context;
        //    60: invokevirtual   q1/c1.b:(Landroid/content/Context;)Landroid/content/Intent;
        //    63: aload_0        
        //    64: sipush          4225
        //    67: aload_2        
        //    68: invokevirtual   t1/b.c:(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/content/ServiceConnection;ILjava/util/concurrent/Executor;)Z
        //    71: istore_3       
        //    72: aload_0        
        //    73: iload_3        
        //    74: putfield        q1/e1.c:Z
        //    77: iload_3        
        //    78: ifeq            119
        //    81: aload_0        
        //    82: getfield        q1/e1.g:Lq1/h1;
        //    85: invokestatic    q1/h1.h:(Lq1/h1;)Landroid/os/Handler;
        //    88: iconst_1       
        //    89: aload_0        
        //    90: getfield        q1/e1.e:Lq1/c1;
        //    93: invokevirtual   android/os/Handler.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
        //    96: astore_1       
        //    97: aload_0        
        //    98: getfield        q1/e1.g:Lq1/h1;
        //   101: invokestatic    q1/h1.h:(Lq1/h1;)Landroid/os/Handler;
        //   104: aload_1        
        //   105: aload_0        
        //   106: getfield        q1/e1.g:Lq1/h1;
        //   109: invokestatic    q1/h1.f:(Lq1/h1;)J
        //   112: invokevirtual   android/os/Handler.sendMessageDelayed:(Landroid/os/Message;J)Z
        //   115: pop            
        //   116: goto            141
        //   119: aload_0        
        //   120: iconst_2       
        //   121: putfield        q1/e1.b:I
        //   124: aload_0        
        //   125: getfield        q1/e1.g:Lq1/h1;
        //   128: astore_1       
        //   129: aload_1        
        //   130: invokestatic    q1/h1.i:(Lq1/h1;)Lt1/b;
        //   133: aload_1        
        //   134: invokestatic    q1/h1.g:(Lq1/h1;)Landroid/content/Context;
        //   137: aload_0        
        //   138: invokevirtual   t1/b.b:(Landroid/content/Context;Landroid/content/ServiceConnection;)V
        //   141: aload           4
        //   143: invokestatic    android/os/StrictMode.setVmPolicy:(Landroid/os/StrictMode$VmPolicy;)V
        //   146: return         
        //   147: astore_1       
        //   148: aload           4
        //   150: invokestatic    android/os/StrictMode.setVmPolicy:(Landroid/os/StrictMode$VmPolicy;)V
        //   153: aload_1        
        //   154: athrow         
        //   155: astore_1       
        //   156: goto            141
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  34     77     147    155    Any
        //  81     116    147    155    Any
        //  119    124    147    155    Any
        //  124    141    155    159    Ljava/lang/IllegalArgumentException;
        //  124    141    147    155    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0141:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1154)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:652)
        //     at java.lang.Thread.run(Thread.java:1564)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void f(final ServiceConnection serviceConnection, final String s) {
        this.a.remove((Object)serviceConnection);
    }
    
    public final void g(final String s) {
        h1.h(this.g).removeMessages(1, (Object)this.e);
        final h1 g = this.g;
        h1.i(g).b(h1.g(g), (ServiceConnection)this);
        this.c = false;
        this.b = 2;
    }
    
    public final boolean h(final ServiceConnection serviceConnection) {
        return this.a.containsKey((Object)serviceConnection);
    }
    
    public final boolean i() {
        return this.a.isEmpty();
    }
    
    public final boolean j() {
        return this.c;
    }
    
    public final void onBindingDied(final ComponentName componentName) {
        this.onServiceDisconnected(componentName);
    }
    
    public final void onServiceConnected(final ComponentName f, final IBinder d) {
        final HashMap j = h1.j(this.g);
        synchronized (j) {
            h1.h(this.g).removeMessages(1, (Object)this.e);
            this.d = d;
            this.f = f;
            final Iterator iterator = this.a.values().iterator();
            while (iterator.hasNext()) {
                ((ServiceConnection)iterator.next()).onServiceConnected(f, d);
            }
            this.b = 1;
        }
    }
    
    public final void onServiceDisconnected(final ComponentName f) {
        final HashMap j = h1.j(this.g);
        synchronized (j) {
            h1.h(this.g).removeMessages(1, (Object)this.e);
            this.d = null;
            this.f = f;
            final Iterator iterator = this.a.values().iterator();
            while (iterator.hasNext()) {
                ((ServiceConnection)iterator.next()).onServiceDisconnected(f);
            }
            this.b = 2;
        }
    }
}
