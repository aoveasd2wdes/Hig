package u1;

import q1.o;
import android.util.Log;
import android.os.WorkSource;
import java.lang.reflect.Method;

public abstract class g
{
    private static final int a;
    private static final Method b;
    private static final Method c;
    private static final Method d;
    private static final Method e;
    private static final Method f;
    private static final Method g;
    private static final Method h;
    private static final Method i;
    private static Boolean j;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: putstatic       u1/g.a:I
        //     6: ldc             Landroid/os/WorkSource;.class
        //     8: ldc             "add"
        //    10: iconst_1       
        //    11: anewarray       Ljava/lang/Class;
        //    14: dup            
        //    15: iconst_0       
        //    16: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    19: aastore        
        //    20: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    23: astore_0       
        //    24: goto            30
        //    27: astore_0       
        //    28: aconst_null    
        //    29: astore_0       
        //    30: aload_0        
        //    31: putstatic       u1/g.b:Ljava/lang/reflect/Method;
        //    34: invokestatic    u1/f.b:()Z
        //    37: ifeq            66
        //    40: ldc             Landroid/os/WorkSource;.class
        //    42: ldc             "add"
        //    44: iconst_2       
        //    45: anewarray       Ljava/lang/Class;
        //    48: dup            
        //    49: iconst_0       
        //    50: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    53: aastore        
        //    54: dup            
        //    55: iconst_1       
        //    56: ldc             Ljava/lang/String;.class
        //    58: aastore        
        //    59: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    62: astore_0       
        //    63: goto            68
        //    66: aconst_null    
        //    67: astore_0       
        //    68: aload_0        
        //    69: putstatic       u1/g.c:Ljava/lang/reflect/Method;
        //    72: ldc             Landroid/os/WorkSource;.class
        //    74: ldc             "size"
        //    76: iconst_0       
        //    77: anewarray       Ljava/lang/Class;
        //    80: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    83: astore_0       
        //    84: goto            90
        //    87: astore_0       
        //    88: aconst_null    
        //    89: astore_0       
        //    90: aload_0        
        //    91: putstatic       u1/g.d:Ljava/lang/reflect/Method;
        //    94: ldc             Landroid/os/WorkSource;.class
        //    96: ldc             "get"
        //    98: iconst_1       
        //    99: anewarray       Ljava/lang/Class;
        //   102: dup            
        //   103: iconst_0       
        //   104: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   107: aastore        
        //   108: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   111: astore_0       
        //   112: goto            118
        //   115: astore_0       
        //   116: aconst_null    
        //   117: astore_0       
        //   118: aload_0        
        //   119: putstatic       u1/g.e:Ljava/lang/reflect/Method;
        //   122: invokestatic    u1/f.b:()Z
        //   125: ifeq            150
        //   128: ldc             Landroid/os/WorkSource;.class
        //   130: ldc             "getName"
        //   132: iconst_1       
        //   133: anewarray       Ljava/lang/Class;
        //   136: dup            
        //   137: iconst_0       
        //   138: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   141: aastore        
        //   142: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   145: astore_0       
        //   146: goto            152
        //   149: astore_0       
        //   150: aconst_null    
        //   151: astore_0       
        //   152: aload_0        
        //   153: putstatic       u1/g.f:Ljava/lang/reflect/Method;
        //   156: invokestatic    u1/f.g:()Z
        //   159: ifeq            187
        //   162: ldc             Landroid/os/WorkSource;.class
        //   164: ldc             "createWorkChain"
        //   166: iconst_0       
        //   167: anewarray       Ljava/lang/Class;
        //   170: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   173: astore_0       
        //   174: goto            189
        //   177: astore_0       
        //   178: ldc             "WorkSourceUtil"
        //   180: ldc             "Missing WorkChain API createWorkChain"
        //   182: aload_0        
        //   183: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   186: pop            
        //   187: aconst_null    
        //   188: astore_0       
        //   189: aload_0        
        //   190: putstatic       u1/g.g:Ljava/lang/reflect/Method;
        //   193: invokestatic    u1/f.g:()Z
        //   196: ifeq            238
        //   199: ldc             "android.os.WorkSource$WorkChain"
        //   201: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   204: ldc             "addNode"
        //   206: iconst_2       
        //   207: anewarray       Ljava/lang/Class;
        //   210: dup            
        //   211: iconst_0       
        //   212: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   215: aastore        
        //   216: dup            
        //   217: iconst_1       
        //   218: ldc             Ljava/lang/String;.class
        //   220: aastore        
        //   221: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   224: astore_0       
        //   225: goto            240
        //   228: astore_0       
        //   229: ldc             "WorkSourceUtil"
        //   231: ldc             "Missing WorkChain class"
        //   233: aload_0        
        //   234: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   237: pop            
        //   238: aconst_null    
        //   239: astore_0       
        //   240: aload_0        
        //   241: putstatic       u1/g.h:Ljava/lang/reflect/Method;
        //   244: invokestatic    u1/f.g:()Z
        //   247: ifeq            270
        //   250: ldc             Landroid/os/WorkSource;.class
        //   252: ldc             "isEmpty"
        //   254: iconst_0       
        //   255: anewarray       Ljava/lang/Class;
        //   258: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   261: astore_0       
        //   262: aload_0        
        //   263: iconst_1       
        //   264: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   267: goto            272
        //   270: aconst_null    
        //   271: astore_0       
        //   272: aload_0        
        //   273: putstatic       u1/g.i:Ljava/lang/reflect/Method;
        //   276: aconst_null    
        //   277: putstatic       u1/g.j:Ljava/lang/Boolean;
        //   280: return         
        //   281: astore_0       
        //   282: goto            66
        //   285: astore_0       
        //   286: goto            270
        //   289: astore_1       
        //   290: goto            272
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      24     27     30     Ljava/lang/Exception;
        //  40     63     281    285    Ljava/lang/Exception;
        //  72     84     87     90     Ljava/lang/Exception;
        //  94     112    115    118    Ljava/lang/Exception;
        //  128    146    149    150    Ljava/lang/Exception;
        //  162    174    177    187    Ljava/lang/Exception;
        //  199    225    228    238    Ljava/lang/Exception;
        //  250    262    285    289    Ljava/lang/Exception;
        //  262    267    289    293    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 157 out of bounds for length 157
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:391)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2125)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:21)
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
    
    public static void a(final WorkSource workSource, final int n, final String s) {
        final Method c = u1.g.c;
        if (c != null) {
            String s2;
            if ((s2 = s) == null) {
                s2 = "";
            }
            try {
                c.invoke((Object)workSource, new Object[] { n, s2 });
                return;
            }
            catch (final Exception ex) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", (Throwable)ex);
                return;
            }
        }
        final Method b = u1.g.b;
        if (b != null) {
            try {
                b.invoke((Object)workSource, new Object[] { n });
            }
            catch (final Exception ex2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", (Throwable)ex2);
            }
        }
    }
    
    public static boolean b(final WorkSource workSource) {
        final Method i = u1.g.i;
        if (i != null) {
            try {
                final Object invoke = i.invoke((Object)workSource, new Object[0]);
                o.h(invoke);
                return (boolean)invoke;
            }
            catch (final Exception ex) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", (Throwable)ex);
            }
        }
        return c(workSource) == 0;
    }
    
    public static int c(final WorkSource workSource) {
        final Method d = u1.g.d;
        if (d != null) {
            try {
                final Object invoke = d.invoke((Object)workSource, new Object[0]);
                o.h(invoke);
                return (int)invoke;
            }
            catch (final Exception ex) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", (Throwable)ex);
            }
        }
        return 0;
    }
}
