package b5;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.FileSystemException;
import java.util.Map;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.NoSuchFileException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import i4.l;
import java.nio.file.attribute.FileTime;

public class e0 extends m
{
    private final Long p(final FileTime fileTime) {
        Object value = u.a(fileTime);
        if (((Number)value).longValue() == 0L) {
            value = null;
        }
        return (Long)value;
    }
    
    public void a(final j0 j0, final j0 j2) {
        l.e((Object)j0, "source");
        l.e((Object)j2, "target");
        try {
            s.a(j0.r(), j2.r(), new CopyOption[] { q.a((Object)p.a()), q.a((Object)r.a()) });
        }
        catch (final UnsupportedOperationException ex) {
            throw new IOException("atomic move not supported");
        }
        catch (final NoSuchFileException ex2) {
            throw new FileNotFoundException(t.a(ex2));
        }
    }
    
    public g h(final j0 j0) {
        l.e((Object)j0, "path");
        return this.o(j0.r());
    }
    
    protected final g o(Path a) {
        l.e((Object)a, "nioPath");
        Long p = null;
        try {
            final BasicFileAttributes a2 = x.a(a, n.a(), new LinkOption[] { w.a() });
            if (y.a(a2)) {
                a = z.a(a);
            }
            else {
                a = null;
            }
            final boolean a3 = a0.a(a2);
            final boolean a4 = b0.a(a2);
            j0 f;
            if (a != null) {
                f = j0$a.f(j0.f, a, false, 1, (Object)null);
            }
            else {
                f = null;
            }
            final long a5 = c0.a(a2);
            final FileTime a6 = d0.a(a2);
            Long p2;
            if (a6 != null) {
                p2 = this.p(a6);
            }
            else {
                p2 = null;
            }
            final FileTime a7 = o.a(a2);
            Long p3;
            if (a7 != null) {
                p3 = this.p(a7);
            }
            else {
                p3 = null;
            }
            final FileTime a8 = v.a(a2);
            if (a8 != null) {
                p = this.p(a8);
            }
            return new g(a3, a4, f, Long.valueOf(a5), p2, p3, p, (Map)null, 128, (i4.g)null);
        }
        catch (final NoSuchFileException | FileSystemException ex) {
            return null;
        }
    }
    
    public String toString() {
        return "NioSystemFileSystem";
    }
}
