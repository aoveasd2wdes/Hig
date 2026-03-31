package l4;

import i4.l;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public final class a extends k4.a
{
    @Override
    public Random c() {
        final ThreadLocalRandom current = ThreadLocalRandom.current();
        l.d((Object)current, "current(...)");
        return (Random)current;
    }
}
