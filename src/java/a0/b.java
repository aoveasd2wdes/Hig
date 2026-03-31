package a0;

import android.widget.Filter$FilterResults;
import android.database.Cursor;
import android.widget.Filter;

class b extends Filter
{
    a a;
    
    b(final a a) {
        this.a = a;
    }
    
    public CharSequence convertResultToString(final Object o) {
        return this.a.a((Cursor)o);
    }
    
    protected Filter$FilterResults performFiltering(final CharSequence charSequence) {
        Cursor d = this.a.d(charSequence);
        final Filter$FilterResults filter$FilterResults = new Filter$FilterResults();
        if (d != null) {
            filter$FilterResults.count = d.getCount();
        }
        else {
            filter$FilterResults.count = 0;
            d = null;
        }
        filter$FilterResults.values = d;
        return filter$FilterResults;
    }
    
    protected void publishResults(final CharSequence charSequence, final Filter$FilterResults filter$FilterResults) {
        final Cursor c = this.a.c();
        final Object values = filter$FilterResults.values;
        if (values != null && values != c) {
            this.a.b((Cursor)values);
        }
    }
    
    interface a
    {
        CharSequence a(final Cursor p0);
        
        void b(final Cursor p0);
        
        Cursor c();
        
        Cursor d(final CharSequence p0);
    }
}
