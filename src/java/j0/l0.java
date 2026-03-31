package j0;

import androidx.core.os.a;
import android.transition.Transition$EpicenterCallback;
import android.graphics.Rect;
import android.transition.Transition$TransitionListener;
import android.util.Log;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import java.util.List;
import android.view.View;
import java.util.Collection;
import java.util.ArrayList;
import android.transition.TransitionSet;
import android.transition.Transition;

class l0 extends m0
{
    private static boolean B(final Transition transition) {
        return !m0.l(transition.getTargetIds()) || !m0.l(transition.getTargetNames()) || !m0.l(transition.getTargetTypes());
    }
    
    public Object A(final Object o) {
        if (o == null) {
            return null;
        }
        final TransitionSet set = new TransitionSet();
        set.addTransition((Transition)o);
        return set;
    }
    
    public void C(final Object o, final ArrayList list, final ArrayList list2) {
        final Transition transition = (Transition)o;
        final boolean b = transition instanceof TransitionSet;
        int i = 0;
        int j = 0;
        if (b) {
            for (TransitionSet set = (TransitionSet)transition; j < set.getTransitionCount(); ++j) {
                this.C(set.getTransitionAt(j), list, list2);
            }
        }
        else if (!B(transition)) {
            final List targets = transition.getTargets();
            if (targets != null && targets.size() == list.size() && targets.containsAll((Collection)list)) {
                int size;
                if (list2 == null) {
                    size = 0;
                }
                else {
                    size = list2.size();
                }
                while (i < size) {
                    transition.addTarget((View)list2.get(i));
                    ++i;
                }
                for (int k = list.size() - 1; k >= 0; --k) {
                    transition.removeTarget((View)list.get(k));
                }
            }
        }
    }
    
    public void a(final Object o, final View view) {
        if (o != null) {
            ((Transition)o).addTarget(view);
        }
    }
    
    public void b(final Object o, final ArrayList list) {
        final Transition transition = (Transition)o;
        if (transition == null) {
            return;
        }
        final boolean b = transition instanceof TransitionSet;
        final int n = 0;
        int i = 0;
        if (b) {
            for (TransitionSet set = (TransitionSet)transition; i < set.getTransitionCount(); ++i) {
                this.b(set.getTransitionAt(i), list);
            }
        }
        else if (!B(transition) && m0.l(transition.getTargets())) {
            for (int size = list.size(), j = n; j < size; ++j) {
                transition.addTarget((View)list.get(j));
            }
        }
    }
    
    public void e(final ViewGroup viewGroup, final Object o) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition)o);
    }
    
    public boolean g(final Object o) {
        return o instanceof Transition;
    }
    
    public Object h(final Object o) {
        Transition clone;
        if (o != null) {
            clone = ((Transition)o).clone();
        }
        else {
            clone = null;
        }
        return clone;
    }
    
    public boolean m() {
        if (b0.l0(4)) {
            Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        }
        return false;
    }
    
    public boolean n(final Object o) {
        if (b0.l0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Predictive back not available for framework transition ");
            sb.append(o);
            sb.append(". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
            Log.v("FragmentManager", sb.toString());
        }
        return false;
    }
    
    public Object o(final Object o, Object o2, final Object o3) {
        Object setOrdering = o;
        final Transition transition = (Transition)o2;
        final Transition transition2 = (Transition)o3;
        if (setOrdering != null && transition != null) {
            setOrdering = new TransitionSet().addTransition((Transition)setOrdering).addTransition(transition).setOrdering(1);
        }
        else if (setOrdering == null) {
            if (transition != null) {
                setOrdering = transition;
            }
            else {
                setOrdering = null;
            }
        }
        if (transition2 != null) {
            o2 = new TransitionSet();
            if (setOrdering != null) {
                ((TransitionSet)o2).addTransition((Transition)setOrdering);
            }
            ((TransitionSet)o2).addTransition(transition2);
            return o2;
        }
        return setOrdering;
    }
    
    public Object p(final Object o, final Object o2, final Object o3) {
        final TransitionSet set = new TransitionSet();
        if (o != null) {
            set.addTransition((Transition)o);
        }
        if (o2 != null) {
            set.addTransition((Transition)o2);
        }
        if (o3 != null) {
            set.addTransition((Transition)o3);
        }
        return set;
    }
    
    public void r(final Object o, final View view, final ArrayList list) {
        ((Transition)o).addListener((Transition$TransitionListener)new l0$b(this, view, list));
    }
    
    public void s(final Object o, final Object o2, final ArrayList list, final Object o3, final ArrayList list2, final Object o4, final ArrayList list3) {
        ((Transition)o).addListener((Transition$TransitionListener)new l0$c(this, o2, list, o3, list2, o4, list3));
    }
    
    public void t(final Object o, final Rect rect) {
        if (o != null) {
            ((Transition)o).setEpicenterCallback((Transition$EpicenterCallback)new l0$e(this, rect));
        }
    }
    
    public void u(final Object o, final View view) {
        if (view != null) {
            final Transition transition = (Transition)o;
            final Rect rect = new Rect();
            this.k(view, rect);
            transition.setEpicenterCallback((Transition$EpicenterCallback)new l0$a(this, rect));
        }
    }
    
    public void v(final o o, final Object o2, final a a, final Runnable runnable) {
        ((Transition)o2).addListener((Transition$TransitionListener)new l0$d(this, runnable));
    }
    
    public void y(final Object o, final View view, final ArrayList list) {
        final TransitionSet set = (TransitionSet)o;
        final List targets = ((Transition)set).getTargets();
        targets.clear();
        for (int size = list.size(), i = 0; i < size; ++i) {
            m0.f(targets, (View)list.get(i));
        }
        targets.add((Object)view);
        list.add((Object)view);
        this.b(set, list);
    }
    
    public void z(final Object o, final ArrayList list, final ArrayList list2) {
        final TransitionSet set = (TransitionSet)o;
        if (set != null) {
            ((Transition)set).getTargets().clear();
            ((Transition)set).getTargets().addAll((Collection)list2);
            this.C(set, list, list2);
        }
    }
}
