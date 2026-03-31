package a0;

import android.view.View;
import android.view.ViewGroup;
import android.database.Cursor;
import android.content.Context;
import android.view.LayoutInflater;

public abstract class c extends a
{
    private int k;
    private int l;
    private LayoutInflater m;
    
    public c(final Context context, final int n, final Cursor cursor, final boolean b) {
        super(context, cursor, b);
        this.l = n;
        this.k = n;
        this.m = (LayoutInflater)context.getSystemService("layout_inflater");
    }
    
    public View g(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return this.m.inflate(this.l, viewGroup, false);
    }
    
    public View h(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return this.m.inflate(this.k, viewGroup, false);
    }
}
