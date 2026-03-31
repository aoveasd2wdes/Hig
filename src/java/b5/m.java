package b5;

import java.io.RandomAccessFile;
import java.util.Map;
import java.io.File;
import java.io.InterruptedIOException;
import java.io.FileNotFoundException;
import i4.l;
import java.io.IOException;

public class m extends h
{
    private final void m(final j0 j0) {
        if (!this.g(j0)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)j0);
        sb.append(" already exists.");
        throw new IOException(sb.toString());
    }
    
    private final void n(final j0 j0) {
        if (this.g(j0)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)j0);
        sb.append(" doesn't exist.");
        throw new IOException(sb.toString());
    }
    
    public void a(final j0 j0, final j0 j2) {
        l.e((Object)j0, "source");
        l.e((Object)j2, "target");
        if (j0.q().renameTo(j2.q())) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("failed to move ");
        sb.append((Object)j0);
        sb.append(" to ");
        sb.append((Object)j2);
        throw new IOException(sb.toString());
    }
    
    public void d(final j0 j0, final boolean b) {
        l.e((Object)j0, "dir");
        if (j0.q().mkdir()) {
            return;
        }
        final g h = this.h(j0);
        int n = 0;
        if (h != null) {
            n = n;
            if (h.c()) {
                n = 1;
            }
        }
        if (n == 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("failed to create directory: ");
            sb.append((Object)j0);
            throw new IOException(sb.toString());
        }
        if (!b) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append((Object)j0);
        sb2.append(" already exist.");
        throw new IOException(sb2.toString());
    }
    
    public void f(final j0 j0, final boolean b) {
        l.e((Object)j0, "path");
        if (!Thread.interrupted()) {
            final File q = j0.q();
            if (!q.delete()) {
                if (q.exists()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("failed to delete ");
                    sb.append((Object)j0);
                    throw new IOException(sb.toString());
                }
                if (b) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("no such file: ");
                    sb2.append((Object)j0);
                    throw new FileNotFoundException(sb2.toString());
                }
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }
    
    public g h(final j0 j0) {
        l.e((Object)j0, "path");
        final File q = j0.q();
        final boolean file = q.isFile();
        final boolean directory = q.isDirectory();
        final long lastModified = q.lastModified();
        final long length = q.length();
        if (!file && !directory && lastModified == 0L && length == 0L && !q.exists()) {
            return null;
        }
        return new g(file, directory, (j0)null, Long.valueOf(length), (Long)null, Long.valueOf(lastModified), (Long)null, (Map)null, 128, (i4.g)null);
    }
    
    public f i(final j0 j0) {
        l.e((Object)j0, "file");
        return new b5.l(false, new RandomAccessFile(j0.q(), "r"));
    }
    
    public f k(final j0 j0, final boolean b, final boolean b2) {
        l.e((Object)j0, "file");
        if (!b || !b2) {
            if (b) {
                this.m(j0);
            }
            if (b2) {
                this.n(j0);
            }
            return new b5.l(true, new RandomAccessFile(j0.q(), "rw"));
        }
        throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
    }
    
    public q0 l(final j0 j0) {
        l.e((Object)j0, "file");
        return f0.d(j0.q());
    }
    
    public String toString() {
        return "JvmSystemFileSystem";
    }
}
