package n2;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReadWriteLock;

public abstract class a implements b
{
    private final ReadWriteLock a;
    
    public a() {
        this.a = (ReadWriteLock)new ReentrantReadWriteLock();
    }
    
    public void g() {
        this.a.writeLock().unlock();
    }
    
    public void i() {
        this.a.writeLock().lock();
    }
}
