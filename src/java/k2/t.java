package k2;

import java.util.concurrent.Executor;

final class t implements Executor
{
    public final void execute(final Runnable runnable) {
        runnable.run();
    }
}
