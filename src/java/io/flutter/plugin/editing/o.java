package io.flutter.plugin.editing;

import android.view.textservice.SuggestionsInfo;
import java.util.HashMap;
import java.util.ArrayList;
import android.view.textservice.SentenceSuggestionsInfo;
import java.util.Locale;
import android.view.textservice.TextInfo;
import android.os.Bundle;
import l3.f;
import k3.k$d;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import j3.u;
import android.view.textservice.SpellCheckerSession$SpellCheckerSessionListener;
import j3.u$b;

public class o implements u$b, SpellCheckerSession$SpellCheckerSessionListener
{
    private final u a;
    private final TextServicesManager b;
    private SpellCheckerSession c;
    k$d d;
    
    public o(final TextServicesManager b, final u a) {
        this.b = b;
        (this.a = a).b((u$b)this);
    }
    
    public void a(final String s, final String s2, final k$d d) {
        if (this.d != null) {
            d.b("error", "Previous spell check request still pending.", (Object)null);
            return;
        }
        this.d = d;
        this.c(s, s2);
    }
    
    public void b() {
        this.a.b((u$b)null);
        final SpellCheckerSession c = this.c;
        if (c != null) {
            c.close();
        }
    }
    
    public void c(final String s, final String s2) {
        final Locale b = f.b(s);
        if (this.c == null) {
            this.c = this.b.newSpellCheckerSession((Bundle)null, b, (SpellCheckerSession$SpellCheckerSessionListener)this, true);
        }
        this.c.getSentenceSuggestions(new TextInfo[] { new TextInfo(s2) }, 5);
    }
    
    public void onGetSentenceSuggestions(final SentenceSuggestionsInfo[] array) {
        k$d k$d;
        ArrayList list;
        if (array.length == 0) {
            k$d = this.d;
            list = new ArrayList();
        }
        else {
            final ArrayList list2 = new ArrayList();
            final SentenceSuggestionsInfo sentenceSuggestionsInfo = array[0];
            if (sentenceSuggestionsInfo == null) {
                k$d = this.d;
                list = new ArrayList();
            }
            else {
                for (int i = 0; i < sentenceSuggestionsInfo.getSuggestionsCount(); ++i) {
                    final SuggestionsInfo suggestionsInfo = sentenceSuggestionsInfo.getSuggestionsInfoAt(i);
                    final int suggestionsCount = suggestionsInfo.getSuggestionsCount();
                    if (suggestionsCount > 0) {
                        final HashMap hashMap = new HashMap();
                        final int offset = sentenceSuggestionsInfo.getOffsetAt(i);
                        final int length = sentenceSuggestionsInfo.getLengthAt(i);
                        hashMap.put((Object)"startIndex", (Object)offset);
                        hashMap.put((Object)"endIndex", (Object)(length + offset));
                        final ArrayList list3 = new ArrayList();
                        int j = 0;
                        boolean b = false;
                        while (j < suggestionsCount) {
                            final String suggestion = suggestionsInfo.getSuggestionAt(j);
                            if (!suggestion.equals((Object)"")) {
                                list3.add((Object)suggestion);
                                b = true;
                            }
                            ++j;
                        }
                        if (b) {
                            hashMap.put((Object)"suggestions", (Object)list3);
                            list2.add((Object)hashMap);
                        }
                    }
                }
                final k$d d = this.d;
                list = list2;
                k$d = d;
            }
        }
        k$d.a((Object)list);
        this.d = null;
    }
    
    public void onGetSuggestions(final SuggestionsInfo[] array) {
    }
}
