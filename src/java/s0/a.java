package s0;

import android.animation.Animator$AnimatorPauseListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator;

abstract class a
{
    static void a(final Animator animator, final AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener((Animator$AnimatorPauseListener)animatorListenerAdapter);
    }
    
    static void b(final Animator animator) {
        animator.pause();
    }
    
    static void c(final Animator animator) {
        animator.resume();
    }
}
