package u4;

public enum z
{
    e("START", 0), 
    f("STOP", 1), 
    g("STOP_AND_RESET_REPLAY_CACHE", 2);
    
    private static final z[] h;
    
    static {
        h = a();
    }
    
    private z(final String s, final int n) {
    }
    
    private static final /* synthetic */ z[] a() {
        return new z[] { z.e, z.f, z.g };
    }
}
