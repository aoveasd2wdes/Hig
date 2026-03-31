package a0;

import android.widget.Filter;
import android.view.ViewGroup;
import android.database.ContentObserver;
import android.view.View;
import android.database.DataSetObserver;
import android.content.Context;
import android.database.Cursor;
import android.widget.Filterable;
import android.widget.BaseAdapter;

public abstract class a extends BaseAdapter implements Filterable, b$a
{
    protected boolean c;
    protected boolean d;
    protected Cursor e;
    protected Context f;
    protected int g;
    protected a.a$a h;
    protected DataSetObserver i;
    protected b j;
    
    public a(final Context context, final Cursor cursor, final boolean b) {
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 2;
        }
        this.f(context, cursor, n);
    }
    
    public abstract CharSequence a(final Cursor p0);
    
    public void b(Cursor j) {
        j = this.j(j);
        if (j != null) {
            j.close();
        }
    }
    
    public Cursor c() {
        return this.e;
    }
    
    public abstract void e(final View p0, final Context p1, final Cursor p2);
    
    void f(final Context f, final Cursor e, int n) {
        boolean c = false;
        if ((n & 0x1) == 0x1) {
            n |= 0x2;
            this.d = true;
        }
        else {
            this.d = false;
        }
        if (e != null) {
            c = true;
        }
        this.e = e;
        this.c = c;
        this.f = f;
        int columnIndexOrThrow;
        if (c) {
            columnIndexOrThrow = e.getColumnIndexOrThrow("_id");
        }
        else {
            columnIndexOrThrow = -1;
        }
        this.g = columnIndexOrThrow;
        Object i;
        if ((n & 0x2) == 0x2) {
            this.h = new a.a$a(this);
            i = new a.a$b(this);
        }
        else {
            i = null;
            this.h = null;
        }
        this.i = (DataSetObserver)i;
        if (c) {
            final a.a$a h = this.h;
            if (h != null) {
                e.registerContentObserver((ContentObserver)h);
            }
            final DataSetObserver j = this.i;
            if (j != null) {
                e.registerDataSetObserver(j);
            }
        }
    }
    
    public abstract View g(final Context p0, final Cursor p1, final ViewGroup p2);
    
    public int getCount() {
        if (this.c) {
            final Cursor e = this.e;
            if (e != null) {
                return e.getCount();
            }
        }
        return 0;
    }
    
    public View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        if (this.c) {
            this.e.moveToPosition(n);
            View g;
            if ((g = view) == null) {
                g = this.g(this.f, this.e, viewGroup);
            }
            this.e(g, this.f, this.e);
            return g;
        }
        return null;
    }
    
    public Filter getFilter() {
        if (this.j == null) {
            this.j = new b((b$a)this);
        }
        return (Filter)this.j;
    }
    
    public Object getItem(final int n) {
        if (this.c) {
            final Cursor e = this.e;
            if (e != null) {
                e.moveToPosition(n);
                return this.e;
            }
        }
        return null;
    }
    
    public long getItemId(final int n) {
        if (this.c) {
            final Cursor e = this.e;
            if (e != null && e.moveToPosition(n)) {
                return this.e.getLong(this.g);
            }
        }
        return 0L;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        if (!this.c) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.e.moveToPosition(n)) {
            View h;
            if ((h = view) == null) {
                h = this.h(this.f, this.e, viewGroup);
            }
            this.e(h, this.f, this.e);
            return h;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("couldn't move cursor to position ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public abstract View h(final Context p0, final Cursor p1, final ViewGroup p2);
    
    protected void i() {
        if (this.d) {
            final Cursor e = this.e;
            if (e != null && !e.isClosed()) {
                this.c = this.e.requery();
            }
        }
    }
    
    public Cursor j(final Cursor e) {
        final Cursor e2 = this.e;
        if (e == e2) {
            return null;
        }
        if (e2 != null) {
            final a.a$a h = this.h;
            if (h != null) {
                e2.unregisterContentObserver((ContentObserver)h);
            }
            final DataSetObserver i = this.i;
            if (i != null) {
                e2.unregisterDataSetObserver(i);
            }
        }
        if ((this.e = e) != null) {
            final a.a$a h2 = this.h;
            if (h2 != null) {
                e.registerContentObserver((ContentObserver)h2);
            }
            final DataSetObserver j = this.i;
            if (j != null) {
                e.registerDataSetObserver(j);
            }
            this.g = e.getColumnIndexOrThrow("_id");
            this.c = true;
            this.notifyDataSetChanged();
        }
        else {
            this.g = -1;
            this.c = false;
            this.notifyDataSetInvalidated();
        }
        return e2;
    }
}
