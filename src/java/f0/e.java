package f0;

import a5.a$a;
import z3.b;
import h4.q;
import y3.d;
import h4.p;
import i4.l;
import h4.a;
import d0.n;
import b5.j0;
import b5.h;
import d0.x;

public final class e implements x
{
    private final h a;
    private final j0 b;
    private final c c;
    private final n d;
    private final a e;
    private final f0.a f;
    private final a5.a g;
    
    public e(final h a, final j0 b, final c c, final n d, final a e) {
        l.e((Object)a, "fileSystem");
        l.e((Object)b, "path");
        l.e((Object)c, "serializer");
        l.e((Object)d, "coordinator");
        l.e((Object)e, "onClose");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new f0.a(false);
        this.g = a5.c.b(false, 1, (Object)null);
    }
    
    private final void f() {
        if (this.f.a() ^ true) {
            return;
        }
        throw new IllegalStateException("StorageConnection has already been disposed.".toString());
    }
    
    public n b() {
        return this.d;
    }
    
    public void close() {
        this.f.b(true);
        this.e.e();
    }
    
    public Object d(final p p0, final d p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lf0/e$b;
        //     4: ifeq            38
        //     7: aload_2        
        //     8: checkcast       Lf0/e$b;
        //    11: astore          7
        //    13: aload           7
        //    15: getfield        f0/e$b.n:I
        //    18: istore_3       
        //    19: iload_3        
        //    20: ldc             -2147483648
        //    22: iand           
        //    23: ifeq            38
        //    26: aload           7
        //    28: iload_3        
        //    29: ldc             -2147483648
        //    31: iadd           
        //    32: putfield        f0/e$b.n:I
        //    35: goto            49
        //    38: new             Lf0/e$b;
        //    41: dup            
        //    42: aload_0        
        //    43: aload_2        
        //    44: invokespecial   f0/e$b.<init>:(Lf0/e;Ly3/d;)V
        //    47: astore          7
        //    49: aload           7
        //    51: getfield        f0/e$b.l:Ljava/lang/Object;
        //    54: astore          11
        //    56: invokestatic    z3/b.c:()Ljava/lang/Object;
        //    59: astore          10
        //    61: aload           7
        //    63: getfield        f0/e$b.n:I
        //    66: istore_3       
        //    67: iload_3        
        //    68: ifeq            216
        //    71: iload_3        
        //    72: iconst_1       
        //    73: if_icmpeq       170
        //    76: iload_3        
        //    77: iconst_2       
        //    78: if_icmpne       160
        //    81: aload           7
        //    83: getfield        f0/e$b.k:Ljava/lang/Object;
        //    86: checkcast       Ld0/b;
        //    89: astore          10
        //    91: aload           7
        //    93: getfield        f0/e$b.j:Ljava/lang/Object;
        //    96: checkcast       Lb5/j0;
        //    99: astore_2       
        //   100: aload           7
        //   102: getfield        f0/e$b.i:Ljava/lang/Object;
        //   105: checkcast       La5/a;
        //   108: astore_1       
        //   109: aload           7
        //   111: getfield        f0/e$b.h:Ljava/lang/Object;
        //   114: checkcast       Lf0/e;
        //   117: astore          5
        //   119: aload           5
        //   121: astore          9
        //   123: aload_2        
        //   124: astore          8
        //   126: aload_1        
        //   127: astore          7
        //   129: aload           10
        //   131: astore          6
        //   133: aload           11
        //   135: invokestatic    u3/l.b:(Ljava/lang/Object;)V
        //   138: goto            471
        //   141: astore          10
        //   143: aload           9
        //   145: astore          5
        //   147: aload           8
        //   149: astore_2       
        //   150: aload           7
        //   152: astore_1       
        //   153: aload           6
        //   155: astore          7
        //   157: goto            610
        //   160: new             Ljava/lang/IllegalStateException;
        //   163: dup            
        //   164: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   166: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   169: athrow         
        //   170: aload           7
        //   172: getfield        f0/e$b.k:Ljava/lang/Object;
        //   175: checkcast       La5/a;
        //   178: astore_2       
        //   179: aload           7
        //   181: getfield        f0/e$b.j:Ljava/lang/Object;
        //   184: checkcast       Lb5/j0;
        //   187: astore          6
        //   189: aload           7
        //   191: getfield        f0/e$b.i:Ljava/lang/Object;
        //   194: checkcast       Lh4/p;
        //   197: astore          9
        //   199: aload           7
        //   201: getfield        f0/e$b.h:Ljava/lang/Object;
        //   204: checkcast       Lf0/e;
        //   207: astore_1       
        //   208: aload           11
        //   210: invokestatic    u3/l.b:(Ljava/lang/Object;)V
        //   213: goto            311
        //   216: aload           11
        //   218: invokestatic    u3/l.b:(Ljava/lang/Object;)V
        //   221: aload_0        
        //   222: invokespecial   f0/e.f:()V
        //   225: aload_0        
        //   226: getfield        f0/e.b:Lb5/j0;
        //   229: invokevirtual   b5/j0.m:()Lb5/j0;
        //   232: astore          6
        //   234: aload           6
        //   236: ifnull          735
        //   239: aload_0        
        //   240: getfield        f0/e.a:Lb5/h;
        //   243: aload           6
        //   245: iconst_0       
        //   246: invokevirtual   b5/h.b:(Lb5/j0;Z)V
        //   249: aload_0        
        //   250: getfield        f0/e.g:La5/a;
        //   253: astore_2       
        //   254: aload           7
        //   256: aload_0        
        //   257: putfield        f0/e$b.h:Ljava/lang/Object;
        //   260: aload           7
        //   262: aload_1        
        //   263: putfield        f0/e$b.i:Ljava/lang/Object;
        //   266: aload           7
        //   268: aload           6
        //   270: putfield        f0/e$b.j:Ljava/lang/Object;
        //   273: aload           7
        //   275: aload_2        
        //   276: putfield        f0/e$b.k:Ljava/lang/Object;
        //   279: aload           7
        //   281: iconst_1       
        //   282: putfield        f0/e$b.n:I
        //   285: aload_2        
        //   286: aconst_null    
        //   287: aload           7
        //   289: invokeinterface a5/a.c:(Ljava/lang/Object;Ly3/d;)Ljava/lang/Object;
        //   294: aload           10
        //   296: if_acmpne       302
        //   299: aload           10
        //   301: areturn        
        //   302: aload_0        
        //   303: astore          5
        //   305: aload_1        
        //   306: astore          9
        //   308: aload           5
        //   310: astore_1       
        //   311: aload_2        
        //   312: astore          5
        //   314: new             Ljava/lang/StringBuilder;
        //   317: astore          8
        //   319: aload_2        
        //   320: astore          5
        //   322: aload           8
        //   324: invokespecial   java/lang/StringBuilder.<init>:()V
        //   327: aload_2        
        //   328: astore          5
        //   330: aload           8
        //   332: aload_1        
        //   333: getfield        f0/e.b:Lb5/j0;
        //   336: invokevirtual   b5/j0.j:()Ljava/lang/String;
        //   339: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   342: pop            
        //   343: aload_2        
        //   344: astore          5
        //   346: aload           8
        //   348: ldc             ".tmp"
        //   350: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   353: pop            
        //   354: aload_2        
        //   355: astore          5
        //   357: aload           6
        //   359: aload           8
        //   361: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   364: invokevirtual   b5/j0.p:(Ljava/lang/String;)Lb5/j0;
        //   367: astore          6
        //   369: aload_2        
        //   370: astore          5
        //   372: aload_1        
        //   373: getfield        f0/e.a:Lb5/h;
        //   376: aload           6
        //   378: iconst_0       
        //   379: invokevirtual   b5/h.f:(Lb5/j0;Z)V
        //   382: aload_2        
        //   383: astore          5
        //   385: new             Lf0/g;
        //   388: dup            
        //   389: aload_1        
        //   390: getfield        f0/e.a:Lb5/h;
        //   393: aload           6
        //   395: aload_1        
        //   396: getfield        f0/e.c:Lf0/c;
        //   399: invokespecial   f0/g.<init>:(Lb5/h;Lb5/j0;Lf0/c;)V
        //   402: astore          8
        //   404: aload           7
        //   406: aload_1        
        //   407: putfield        f0/e$b.h:Ljava/lang/Object;
        //   410: aload           7
        //   412: aload_2        
        //   413: putfield        f0/e$b.i:Ljava/lang/Object;
        //   416: aload           7
        //   418: aload           6
        //   420: putfield        f0/e$b.j:Ljava/lang/Object;
        //   423: aload           7
        //   425: aload           8
        //   427: putfield        f0/e$b.k:Ljava/lang/Object;
        //   430: aload           7
        //   432: iconst_2       
        //   433: putfield        f0/e$b.n:I
        //   436: aload           9
        //   438: aload           8
        //   440: aload           7
        //   442: invokeinterface h4/p.j:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   447: astore          5
        //   449: aload           5
        //   451: aload           10
        //   453: if_acmpne       459
        //   456: aload           10
        //   458: areturn        
        //   459: aload_1        
        //   460: astore          5
        //   462: aload_2        
        //   463: astore_1       
        //   464: aload           8
        //   466: astore          10
        //   468: aload           6
        //   470: astore_2       
        //   471: aload           5
        //   473: astore          9
        //   475: aload_2        
        //   476: astore          8
        //   478: aload_1        
        //   479: astore          7
        //   481: aload           10
        //   483: astore          6
        //   485: getstatic       u3/q.a:Lu3/q;
        //   488: astore          11
        //   490: aload           10
        //   492: invokeinterface d0/b.close:()V
        //   497: aconst_null    
        //   498: astore          10
        //   500: goto            505
        //   503: astore          10
        //   505: aload           10
        //   507: ifnonnull       580
        //   510: aload_1        
        //   511: astore          8
        //   513: aload           5
        //   515: astore          9
        //   517: aload_2        
        //   518: astore          6
        //   520: aload_1        
        //   521: astore          7
        //   523: aload           5
        //   525: getfield        f0/e.a:Lb5/h;
        //   528: aload_2        
        //   529: invokevirtual   b5/h.g:(Lb5/j0;)Z
        //   532: ifeq            562
        //   535: aload_1        
        //   536: astore          8
        //   538: aload           5
        //   540: astore          9
        //   542: aload_2        
        //   543: astore          6
        //   545: aload_1        
        //   546: astore          7
        //   548: aload           5
        //   550: getfield        f0/e.a:Lb5/h;
        //   553: aload_2        
        //   554: aload           5
        //   556: getfield        f0/e.b:Lb5/j0;
        //   559: invokevirtual   b5/h.a:(Lb5/j0;Lb5/j0;)V
        //   562: aload_1        
        //   563: astore          8
        //   565: getstatic       u3/q.a:Lu3/q;
        //   568: astore_2       
        //   569: aload_1        
        //   570: aconst_null    
        //   571: invokeinterface a5/a.a:(Ljava/lang/Object;)V
        //   576: getstatic       u3/q.a:Lu3/q;
        //   579: areturn        
        //   580: aload_1        
        //   581: astore          8
        //   583: aload           5
        //   585: astore          9
        //   587: aload_2        
        //   588: astore          6
        //   590: aload_1        
        //   591: astore          7
        //   593: aload           10
        //   595: athrow         
        //   596: astore          10
        //   598: aload_1        
        //   599: astore          5
        //   601: aload_2        
        //   602: astore_1       
        //   603: aload           8
        //   605: astore          7
        //   607: aload           6
        //   609: astore_2       
        //   610: aload           7
        //   612: invokeinterface d0/b.close:()V
        //   617: goto            642
        //   620: astore          11
        //   622: aload_1        
        //   623: astore          8
        //   625: aload           5
        //   627: astore          9
        //   629: aload_2        
        //   630: astore          6
        //   632: aload_1        
        //   633: astore          7
        //   635: aload           10
        //   637: aload           11
        //   639: invokestatic    u3/a.a:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   642: aload_1        
        //   643: astore          8
        //   645: aload           5
        //   647: astore          9
        //   649: aload_2        
        //   650: astore          6
        //   652: aload_1        
        //   653: astore          7
        //   655: aload           10
        //   657: athrow         
        //   658: astore_1       
        //   659: aload           8
        //   661: astore          5
        //   663: goto            725
        //   666: astore_1       
        //   667: aload           9
        //   669: astore          8
        //   671: aload           7
        //   673: astore_2       
        //   674: aload_1        
        //   675: astore          7
        //   677: goto            685
        //   680: astore          7
        //   682: aload_1        
        //   683: astore          8
        //   685: aload_2        
        //   686: astore          5
        //   688: aload           8
        //   690: getfield        f0/e.a:Lb5/h;
        //   693: aload           6
        //   695: invokevirtual   b5/h.g:(Lb5/j0;)Z
        //   698: istore          4
        //   700: iload           4
        //   702: ifeq            718
        //   705: aload_2        
        //   706: astore          5
        //   708: aload           8
        //   710: getfield        f0/e.a:Lb5/h;
        //   713: aload           6
        //   715: invokevirtual   b5/h.e:(Lb5/j0;)V
        //   718: aload_2        
        //   719: astore          5
        //   721: aload           7
        //   723: athrow         
        //   724: astore_1       
        //   725: aload           5
        //   727: aconst_null    
        //   728: invokeinterface a5/a.a:(Ljava/lang/Object;)V
        //   733: aload_1        
        //   734: athrow         
        //   735: new             Ljava/lang/IllegalStateException;
        //   738: dup            
        //   739: ldc             "must have a parent path"
        //   741: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   744: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   747: athrow         
        //   748: astore_1       
        //   749: goto            718
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  133    138    141    160    Any
        //  314    319    724    725    Any
        //  322    327    724    725    Any
        //  330    343    724    725    Any
        //  346    354    724    725    Any
        //  357    369    724    725    Any
        //  372    382    680    685    Ljava/io/IOException;
        //  372    382    724    725    Any
        //  385    404    680    685    Ljava/io/IOException;
        //  385    404    724    725    Any
        //  404    449    596    610    Any
        //  485    490    141    160    Any
        //  490    497    503    505    Any
        //  523    535    666    680    Ljava/io/IOException;
        //  523    535    658    666    Any
        //  548    562    666    680    Ljava/io/IOException;
        //  548    562    658    666    Any
        //  565    569    658    666    Any
        //  593    596    666    680    Ljava/io/IOException;
        //  593    596    658    666    Any
        //  610    617    620    642    Any
        //  635    642    666    680    Ljava/io/IOException;
        //  635    642    658    666    Any
        //  655    658    666    680    Ljava/io/IOException;
        //  655    658    658    666    Any
        //  688    700    724    725    Any
        //  708    718    748    752    Ljava/io/IOException;
        //  708    718    724    725    Any
        //  721    724    724    725    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0562:
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
    
    public Object e(q q, d i) {
        Object o = null;
        Label_0049: {
            if (i instanceof e$a) {
                o = i;
                final int m = ((e$a)o).m;
                if ((m & Integer.MIN_VALUE) != 0x0) {
                    ((e$a)o).m = m + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new e$a(this, i);
        }
        final Object k = ((e$a)o).k;
        final Object c = z3.b.c();
        final int j = ((e$a)o).m;
        boolean l = false;
        Label_0302: {
            if (j != 0) {
                if (j == 1) {
                    l = ((e$a)o).j;
                    i = (d)((e$a)o).i;
                    q = (q)((e$a)o).h;
                    try {
                        u3.l.b(k);
                        final boolean b = l;
                        i = (d)k;
                        break Label_0302;
                    }
                    finally {
                        break Label_0302;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u3.l.b(k);
            this.f();
            l = a$a.a(this.g, (Object)null, 1, (Object)null);
            try {
                i = (d)new f0.b(this.a, this.b, this.c);
                boolean b;
                if (l) {
                    b = true;
                }
                else {
                    b = false;
                }
                Object o2;
                try {
                    final Boolean a = a4.b.a(b);
                    ((e$a)o).h = this;
                    ((e$a)o).i = i;
                    ((e$a)o).j = l;
                    ((e$a)o).m = 1;
                    final Object i2 = q.i((Object)i, (Object)a, o);
                    if (i2 == c) {
                        return c;
                    }
                    q = (q)this;
                    o2 = i;
                    i = (d)i2;
                    b = l;
                    try {
                        ((d0.b)o2).close();
                    }
                    finally {}
                    final Throwable t;
                    if (t == null) {
                        if (b) {
                            a$a.b(((e)q).g, (Object)null, 1, (Object)null);
                        }
                        return i;
                    }
                    i = (d)q;
                }
                finally {
                    final d0.b b2;
                    o2 = b2;
                    q = (q)this;
                }
                try {
                    while (true) {
                        i = (d)q;
                        b = l;
                        throw o2;
                        try {
                            ((d0.b)i).close();
                            continue;
                        }
                        finally {
                            i = (d)q;
                            b = l;
                            final Throwable t2;
                            u3.a.a((Throwable)o2, t2);
                        }
                        break;
                    }
                }
                finally {
                    l = b;
                }
            }
            finally {}
        }
        if (l) {
            a$a.b(this.g, (Object)null, 1, (Object)null);
        }
    }
}
