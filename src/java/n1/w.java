package n1;

import java.util.Arrays;

final class w extends v
{
    private final byte[] c;
    
    w(final byte[] c) {
        super(Arrays.copyOfRange(c, 0, 25));
        this.c = c;
    }
    
    final byte[] W() {
        return this.c;
    }
}
