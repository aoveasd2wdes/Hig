package b5;

import java.io.RandomAccessFile;

public final class l extends f
{
    private final RandomAccessFile i;
    
    public l(final boolean b, final RandomAccessFile i) {
        i4.l.e((Object)i, "randomAccessFile");
        super(b);
        this.i = i;
    }
    
    protected void i() {
        synchronized (this) {
            this.i.close();
        }
    }
    
    protected void j() {
        synchronized (this) {
            this.i.getFD().sync();
        }
    }
    
    protected int l(final long n, final byte[] array, final int n2, final int n3) {
        synchronized (this) {
            i4.l.e((Object)array, "array");
            this.i.seek(n);
            int i = 0;
            while (i < n3) {
                final int read = this.i.read(array, n2, n3 - i);
                if (read == -1) {
                    if (i == 0) {
                        return -1;
                    }
                    break;
                }
                else {
                    i += read;
                }
            }
            return i;
        }
    }
    
    protected long p() {
        synchronized (this) {
            return this.i.length();
        }
    }
    
    protected void t(final long n, final byte[] array, final int n2, final int n3) {
        synchronized (this) {
            i4.l.e((Object)array, "array");
            this.i.seek(n);
            this.i.write(array, n2, n3);
        }
    }
}
