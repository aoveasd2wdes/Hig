package b5;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

public interface d extends q0, ReadableByteChannel
{
    String d(final long p0);
    
    short g();
    
    long k();
    
    void n(final long p0);
    
    int o();
    
    b q();
    
    boolean r();
    
    byte readByte();
    
    void skip(final long p0);
    
    InputStream y();
}
