package b5;

import java.io.Flushable;
import java.io.Closeable;

public interface p0 extends Closeable, Flushable
{
    void close();
    
    void flush();
    
    void x(final b p0, final long p1);
}
