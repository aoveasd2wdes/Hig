package m;

import android.view.MenuItem$OnActionExpandListener;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ActionProvider;
import android.view.View;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import r.b;

public class a implements b
{
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private int i;
    private char j;
    private int k;
    private Drawable l;
    private int m;
    private Context n;
    private MenuItem$OnMenuItemClickListener o;
    private CharSequence p;
    private CharSequence q;
    private ColorStateList r;
    private PorterDuff$Mode s;
    private boolean t;
    private boolean u;
    private int v;
    
    public a(final Context n, final int b, final int a, final int c, final int d, final CharSequence e) {
        this.i = 4096;
        this.k = 4096;
        this.m = 0;
        this.r = null;
        this.s = null;
        this.t = false;
        this.u = false;
        this.v = 16;
        this.n = n;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private void a() {
        final Drawable l = this.l;
        if (l != null && (this.t || this.u)) {
            final Drawable q = androidx.core.graphics.drawable.a.q(l);
            this.l = q;
            final Drawable mutate = q.mutate();
            this.l = mutate;
            if (this.t) {
                androidx.core.graphics.drawable.a.n(mutate, this.r);
            }
            if (this.u) {
                androidx.core.graphics.drawable.a.o(this.l, this.s);
            }
        }
    }
    
    public b b(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public b c(final View view) {
        throw new UnsupportedOperationException();
    }
    
    public boolean collapseActionView() {
        return false;
    }
    
    public b d(final int showAsAction) {
        this.setShowAsAction(showAsAction);
        return (b)this;
    }
    
    public boolean expandActionView() {
        return false;
    }
    
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }
    
    public View getActionView() {
        return null;
    }
    
    public int getAlphabeticModifiers() {
        return this.k;
    }
    
    public char getAlphabeticShortcut() {
        return this.j;
    }
    
    public CharSequence getContentDescription() {
        return this.p;
    }
    
    public int getGroupId() {
        return this.b;
    }
    
    public Drawable getIcon() {
        return this.l;
    }
    
    public ColorStateList getIconTintList() {
        return this.r;
    }
    
    public PorterDuff$Mode getIconTintMode() {
        return this.s;
    }
    
    public Intent getIntent() {
        return this.g;
    }
    
    public int getItemId() {
        return this.a;
    }
    
    public ContextMenu$ContextMenuInfo getMenuInfo() {
        return null;
    }
    
    public int getNumericModifiers() {
        return this.i;
    }
    
    public char getNumericShortcut() {
        return this.h;
    }
    
    public int getOrder() {
        return this.d;
    }
    
    public SubMenu getSubMenu() {
        return null;
    }
    
    public CharSequence getTitle() {
        return this.e;
    }
    
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            charSequence = this.e;
        }
        return charSequence;
    }
    
    public CharSequence getTooltipText() {
        return this.q;
    }
    
    public boolean hasSubMenu() {
        return false;
    }
    
    public boolean isActionViewExpanded() {
        return false;
    }
    
    public boolean isCheckable() {
        final int v = this.v;
        boolean b = true;
        if ((v & 0x1) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public boolean isChecked() {
        return (this.v & 0x2) != 0x0;
    }
    
    public boolean isEnabled() {
        return (this.v & 0x10) != 0x0;
    }
    
    public boolean isVisible() {
        return (this.v & 0x8) == 0x0;
    }
    
    public MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }
    
    public MenuItem setAlphabeticShortcut(final char c) {
        this.j = Character.toLowerCase(c);
        return (MenuItem)this;
    }
    
    public MenuItem setAlphabeticShortcut(final char c, final int n) {
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(n);
        return (MenuItem)this;
    }
    
    public MenuItem setCheckable(final boolean b) {
        this.v = ((b ? 1 : 0) | (this.v & 0xFFFFFFFE));
        return (MenuItem)this;
    }
    
    public MenuItem setChecked(final boolean b) {
        final int v = this.v;
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        this.v = (n | (v & 0xFFFFFFFD));
        return (MenuItem)this;
    }
    
    public b setContentDescription(final CharSequence p) {
        this.p = p;
        return (b)this;
    }
    
    public MenuItem setEnabled(final boolean b) {
        final int v = this.v;
        int n;
        if (b) {
            n = 16;
        }
        else {
            n = 0;
        }
        this.v = (n | (v & 0xFFFFFFEF));
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final int m) {
        this.m = m;
        this.l = androidx.core.content.a.c(this.n, m);
        this.a();
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final Drawable l) {
        this.l = l;
        this.m = 0;
        this.a();
        return (MenuItem)this;
    }
    
    public MenuItem setIconTintList(final ColorStateList r) {
        this.r = r;
        this.t = true;
        this.a();
        return (MenuItem)this;
    }
    
    public MenuItem setIconTintMode(final PorterDuff$Mode s) {
        this.s = s;
        this.u = true;
        this.a();
        return (MenuItem)this;
    }
    
    public MenuItem setIntent(final Intent g) {
        this.g = g;
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char h) {
        this.h = h;
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char h, final int n) {
        this.h = h;
        this.i = KeyEvent.normalizeMetaState(n);
        return (MenuItem)this;
    }
    
    public MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        throw new UnsupportedOperationException();
    }
    
    public MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener o) {
        this.o = o;
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char h, final char c) {
        this.h = h;
        this.j = Character.toLowerCase(c);
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char h, final char c, final int n, final int n2) {
        this.h = h;
        this.i = KeyEvent.normalizeMetaState(n);
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(n2);
        return (MenuItem)this;
    }
    
    public void setShowAsAction(final int n) {
    }
    
    public MenuItem setTitle(final int n) {
        this.e = (CharSequence)this.n.getResources().getString(n);
        return (MenuItem)this;
    }
    
    public MenuItem setTitle(final CharSequence e) {
        this.e = e;
        return (MenuItem)this;
    }
    
    public MenuItem setTitleCondensed(final CharSequence f) {
        this.f = f;
        return (MenuItem)this;
    }
    
    public b setTooltipText(final CharSequence q) {
        this.q = q;
        return (b)this;
    }
    
    public MenuItem setVisible(final boolean b) {
        final int v = this.v;
        int n = 8;
        if (b) {
            n = 0;
        }
        this.v = ((v & 0x8) | n);
        return (MenuItem)this;
    }
}
