package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

class a
{
    private final FlutterJNI a;
    
    public a(final FlutterJNI a) {
        this.a = a;
    }
    
    public int a(final CharSequence charSequence, final int n) {
        final int length = charSequence.length();
        final int n2 = length - 1;
        if (n >= n2) {
            return length;
        }
        final int codePoint = Character.codePointAt(charSequence, n);
        final int charCount = Character.charCount(codePoint);
        int n3 = n + charCount;
        int n4 = 0;
        if (n3 == 0) {
            return 0;
        }
        if (codePoint == 10) {
            int n5 = charCount;
            if (Character.codePointAt(charSequence, n3) == 13) {
                n5 = charCount + 1;
            }
            return n + n5;
        }
        if (this.g(codePoint)) {
            if (n3 < n2 && this.g(Character.codePointAt(charSequence, n3))) {
                for (int n6 = n; n6 > 0 && this.g(Character.codePointBefore(charSequence, n)); n6 -= Character.charCount(Character.codePointBefore(charSequence, n)), ++n4) {}
                int n7 = charCount;
                if (n4 % 2 == 0) {
                    n7 = charCount + 2;
                }
                return n + n7;
            }
            return n3;
        }
        else {
            int n8 = charCount;
            if (this.f(codePoint)) {
                n8 = charCount + Character.charCount(codePoint);
            }
            if (codePoint == 8419) {
                final int codePointBefore = Character.codePointBefore(charSequence, n3);
                final int n9 = n3 + Character.charCount(codePointBefore);
                int n10;
                if (n9 < length && this.i(codePointBefore)) {
                    final int codePoint2 = Character.codePointAt(charSequence, n9);
                    n10 = n8;
                    if (this.f(codePoint2)) {
                        n10 = n8 + (Character.charCount(codePointBefore) + Character.charCount(codePoint2));
                    }
                }
                else {
                    n10 = n8;
                    if (this.f(codePointBefore)) {
                        n10 = n8 + Character.charCount(codePointBefore);
                    }
                }
                return n + n10;
            }
            int n11 = n8;
            if (this.c(codePoint)) {
                int n12 = 0;
                int n13 = 0;
                int n14 = n8;
                int n15 = codePoint;
                int n16;
                int n17;
                do {
                    n17 = n14;
                    int n18;
                    if ((n18 = n12) != 0) {
                        n17 = n14 + (Character.charCount(n15) + n13 + 1);
                        n18 = 0;
                    }
                    if (this.d(n15)) {
                        n11 = n17;
                        return n + n11;
                    }
                    n16 = n15;
                    int n19 = n3;
                    n12 = n18;
                    int charCount2 = 0;
                    Label_0646: {
                        if (n3 < length) {
                            final int codePoint3 = Character.codePointAt(charSequence, n3);
                            final int n20 = n3 + Character.charCount(codePoint3);
                            if (codePoint3 == 8419) {
                                final int codePointBefore2 = Character.codePointBefore(charSequence, n20);
                                final int n21 = n20 + Character.charCount(codePointBefore2);
                                int n22;
                                if (n21 < length && this.i(codePointBefore2)) {
                                    final int codePoint4 = Character.codePointAt(charSequence, n21);
                                    n22 = n17;
                                    if (this.f(codePoint4)) {
                                        n22 = n17 + (Character.charCount(codePointBefore2) + Character.charCount(codePoint4));
                                    }
                                }
                                else {
                                    n22 = n17;
                                    if (this.f(codePointBefore2)) {
                                        n22 = n17 + Character.charCount(codePointBefore2);
                                    }
                                }
                                return n + n22;
                            }
                            if (this.d(codePoint3) || this.i(codePoint3)) {
                                n11 = n17 + (Character.charCount(codePoint3) + 0);
                                return n + n11;
                            }
                            n16 = codePoint3;
                            n19 = n20;
                            n12 = n18;
                            if (codePoint3 == 8205) {
                                n16 = Character.codePointAt(charSequence, n20);
                                n19 = n20 + Character.charCount(n16);
                                if (n19 < length && this.i(n16)) {
                                    n16 = Character.codePointAt(charSequence, n19);
                                    charCount2 = Character.charCount(n16);
                                    n3 = n19 + Character.charCount(n16);
                                    n12 = 1;
                                    break Label_0646;
                                }
                                n12 = 1;
                            }
                        }
                        charCount2 = 0;
                        n3 = n19;
                    }
                    if (n3 >= length) {
                        n11 = n17;
                        return n + n11;
                    }
                    n11 = n17;
                    if (n12 == 0) {
                        return n + n11;
                    }
                    n15 = n16;
                    n14 = n17;
                    n13 = charCount2;
                } while (this.c(n16));
                n11 = n17;
            }
            return n + n11;
        }
    }
    
    public int b(final CharSequence charSequence, final int n) {
        final int n2 = 0;
        final int n3 = 1;
        if (n <= 1) {
            return 0;
        }
        final int codePointBefore = Character.codePointBefore(charSequence, n);
        int charCount = Character.charCount(codePointBefore);
        int n4 = n - charCount;
        if (n4 == 0) {
            return 0;
        }
        if (codePointBefore == 10) {
            int n5 = charCount;
            if (Character.codePointBefore(charSequence, n4) == 13) {
                n5 = charCount + 1;
            }
            return n - n5;
        }
        if (this.g(codePointBefore)) {
            final int codePointBefore2 = Character.codePointBefore(charSequence, n4);
            int n6 = n4 - Character.charCount(codePointBefore2);
            int n7 = n3;
            for (int codePointBefore3 = codePointBefore2; n6 > 0 && this.g(codePointBefore3); codePointBefore3 = Character.codePointBefore(charSequence, n6), n6 -= Character.charCount(codePointBefore3), ++n7) {}
            int n8 = charCount;
            if (n7 % 2 == 0) {
                n8 = charCount + 2;
            }
            return n - n8;
        }
        if (codePointBefore == 8419) {
            final int codePointBefore4 = Character.codePointBefore(charSequence, n4);
            final int n9 = n4 - Character.charCount(codePointBefore4);
            int n10;
            if (n9 > 0 && this.i(codePointBefore4)) {
                final int codePointBefore5 = Character.codePointBefore(charSequence, n9);
                n10 = charCount;
                if (this.f(codePointBefore5)) {
                    n10 = charCount + (Character.charCount(codePointBefore4) + Character.charCount(codePointBefore5));
                }
            }
            else {
                n10 = charCount;
                if (this.f(codePointBefore4)) {
                    n10 = charCount + Character.charCount(codePointBefore4);
                }
            }
            return n - n10;
        }
        int codePointBefore6 = codePointBefore;
        int n11 = charCount;
        int n12 = n4;
        if (codePointBefore == 917631) {
            while (true) {
                codePointBefore6 = Character.codePointBefore(charSequence, n4);
                n12 = n4 - Character.charCount(codePointBefore6);
                if (n12 <= 0 || !this.h(codePointBefore6)) {
                    break;
                }
                charCount += Character.charCount(codePointBefore6);
                n4 = n12;
            }
            if (!this.c(codePointBefore6)) {
                return n - 2;
            }
            n11 = charCount + Character.charCount(codePointBefore6);
        }
        int codePointBefore7 = codePointBefore6;
        int n13 = n11;
        int n14 = n12;
        if (this.i(codePointBefore6)) {
            codePointBefore7 = Character.codePointBefore(charSequence, n12);
            if (!this.c(codePointBefore7)) {
                return n - n11;
            }
            n13 = n11 + Character.charCount(codePointBefore7);
            n14 = n12 - n13;
        }
        int n15 = n13;
        if (this.c(codePointBefore7)) {
            int n16 = 0;
            int n17 = 0;
            int n18 = n13;
            int n19 = codePointBefore7;
            int n20;
            int n21;
            do {
                n21 = n18;
                int n22;
                if ((n22 = n16) != 0) {
                    n21 = n18 + (Character.charCount(n19) + n17 + 1);
                    n22 = 0;
                }
                if (this.d(n19)) {
                    final int codePointBefore8 = Character.codePointBefore(charSequence, n14);
                    final int n23 = n14 - Character.charCount(codePointBefore8);
                    int charCount2 = n2;
                    int codePointBefore9 = codePointBefore8;
                    if (n23 > 0) {
                        charCount2 = n2;
                        codePointBefore9 = codePointBefore8;
                        if (this.i(codePointBefore8)) {
                            codePointBefore9 = Character.codePointBefore(charSequence, n23);
                            if (!this.c(codePointBefore9)) {
                                return n - n21;
                            }
                            charCount2 = Character.charCount(codePointBefore9);
                            Character.charCount(codePointBefore9);
                        }
                    }
                    n15 = n21;
                    if (this.e(codePointBefore9)) {
                        n15 = n21 + (charCount2 + Character.charCount(codePointBefore9));
                        return n - n15;
                    }
                    return n - n15;
                }
                else {
                    n20 = n19;
                    int n24 = n14;
                    n16 = n22;
                    int charCount3 = 0;
                    Label_0696: {
                        if (n14 > 0) {
                            final int codePointBefore10 = Character.codePointBefore(charSequence, n14);
                            final int n25 = n14 - Character.charCount(codePointBefore10);
                            n20 = codePointBefore10;
                            n24 = n25;
                            n16 = n22;
                            if (codePointBefore10 == 8205) {
                                n20 = Character.codePointBefore(charSequence, n25);
                                n24 = n25 - Character.charCount(n20);
                                if (n24 > 0 && this.i(n20)) {
                                    n20 = Character.codePointBefore(charSequence, n24);
                                    charCount3 = Character.charCount(n20);
                                    n14 = n24 - Character.charCount(n20);
                                    n16 = 1;
                                    break Label_0696;
                                }
                                n16 = 1;
                            }
                        }
                        charCount3 = 0;
                        n14 = n24;
                    }
                    if (n14 == 0) {
                        n15 = n21;
                        return n - n15;
                    }
                    n15 = n21;
                    if (n16 == 0) {
                        return n - n15;
                    }
                    n19 = n20;
                    n18 = n21;
                    n17 = charCount3;
                }
            } while (this.c(n20));
            n15 = n21;
        }
        return n - n15;
    }
    
    public boolean c(final int n) {
        return this.a.isCodePointEmoji(n);
    }
    
    public boolean d(final int n) {
        return this.a.isCodePointEmojiModifier(n);
    }
    
    public boolean e(final int n) {
        return this.a.isCodePointEmojiModifierBase(n);
    }
    
    public boolean f(final int n) {
        return (48 <= n && n <= 57) || n == 35 || n == 42;
    }
    
    public boolean g(final int n) {
        return this.a.isCodePointRegionalIndicator(n);
    }
    
    public boolean h(final int n) {
        return 917536 <= n && n <= 917630;
    }
    
    public boolean i(final int n) {
        return this.a.isCodePointVariantSelector(n);
    }
}
