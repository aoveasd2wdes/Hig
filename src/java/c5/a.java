package c5;

import i4.l;
import b5.b;
import b5.e;
import u3.q;

public abstract class a
{
    private static final char[] a;
    
    static {
        a = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    }
    
    private static final int b(final byte[] array, final int n) {
        final int length = array.length;
        int i = 0;
        int n2 = 0;
        int n3 = 0;
    Label_0011:
        while (i < length) {
            final byte b = array[i];
            if (b >= 0) {
                final int n4 = n3 + 1;
                if (n3 == n) {
                    return n2;
                }
                if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (127 <= b && b < 160))) || b == 65533) {
                    return -1;
                }
                int n5;
                if (b < 65536) {
                    n5 = 1;
                }
                else {
                    n5 = 2;
                }
                final int n6 = n2 + n5;
                int n7 = i + 1;
                int n8 = n4;
                int n9 = n6;
                while (true) {
                    final int n10 = n8;
                    i = n7;
                    n2 = n9;
                    n3 = n10;
                    if (n7 >= length) {
                        continue Label_0011;
                    }
                    final byte b2 = array[n7];
                    i = n7;
                    n2 = n9;
                    n3 = n10;
                    if (b2 < 0) {
                        continue Label_0011;
                    }
                    ++n7;
                    final int n11 = n10 + 1;
                    if (n10 == n) {
                        break;
                    }
                    if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                        return -1;
                    }
                    int n12;
                    if (b2 < 65536) {
                        n12 = 1;
                    }
                    else {
                        n12 = 2;
                    }
                    n9 += n12;
                    n8 = n11;
                }
                return n9;
            }
            else if (b >> 5 == -2) {
                final int n13 = i + 1;
                if (length <= n13) {
                    if (n3 == n) {
                        return n2;
                    }
                    return -1;
                }
                else {
                    final byte b3 = array[n13];
                    if ((b3 & 0xC0) != 0x80) {
                        if (n3 == n) {
                            return n2;
                        }
                        return -1;
                    }
                    else {
                        final int n14 = b3 ^ 0xF80 ^ b << 6;
                        if (n14 < 128) {
                            if (n3 == n) {
                                return n2;
                            }
                            return -1;
                        }
                        else {
                            final int n15 = n3 + 1;
                            if (n3 == n) {
                                return n2;
                            }
                            if ((n14 != 10 && n14 != 13 && ((n14 >= 0 && n14 < 32) || (127 <= n14 && n14 < 160))) || n14 == 65533) {
                                return -1;
                            }
                            int n16;
                            if (n14 < 65536) {
                                n16 = 1;
                            }
                            else {
                                n16 = 2;
                            }
                            n2 += n16;
                            final q a = q.a;
                            i += 2;
                            n3 = n15;
                        }
                    }
                }
            }
            else if (b >> 4 == -2) {
                final int n17 = i + 2;
                if (length <= n17) {
                    if (n3 == n) {
                        return n2;
                    }
                    return -1;
                }
                else {
                    final byte b4 = array[i + 1];
                    if ((b4 & 0xC0) != 0x80) {
                        if (n3 == n) {
                            return n2;
                        }
                        return -1;
                    }
                    else {
                        final byte b5 = array[n17];
                        if ((b5 & 0xC0) != 0x80) {
                            if (n3 == n) {
                                return n2;
                            }
                            return -1;
                        }
                        else {
                            final int n18 = b5 ^ 0xFFFE1F80 ^ b4 << 6 ^ b << 12;
                            if (n18 < 2048) {
                                if (n3 == n) {
                                    return n2;
                                }
                                return -1;
                            }
                            else if (55296 <= n18 && n18 < 57344) {
                                if (n3 == n) {
                                    return n2;
                                }
                                return -1;
                            }
                            else {
                                final int n19 = n3 + 1;
                                if (n3 == n) {
                                    return n2;
                                }
                                if ((n18 != 10 && n18 != 13 && ((n18 >= 0 && n18 < 32) || (127 <= n18 && n18 < 160))) || n18 == 65533) {
                                    return -1;
                                }
                                int n20;
                                if (n18 < 65536) {
                                    n20 = 1;
                                }
                                else {
                                    n20 = 2;
                                }
                                n2 += n20;
                                final q a2 = q.a;
                                i += 3;
                                n3 = n19;
                            }
                        }
                    }
                }
            }
            else if (b >> 3 == -2) {
                final int n21 = i + 3;
                if (length <= n21) {
                    if (n3 == n) {
                        return n2;
                    }
                    return -1;
                }
                else {
                    final byte b6 = array[i + 1];
                    if ((b6 & 0xC0) != 0x80) {
                        if (n3 == n) {
                            return n2;
                        }
                        return -1;
                    }
                    else {
                        final byte b7 = array[i + 2];
                        if ((b7 & 0xC0) != 0x80) {
                            if (n3 == n) {
                                return n2;
                            }
                            return -1;
                        }
                        else {
                            final byte b8 = array[n21];
                            if ((b8 & 0xC0) != 0x80) {
                                if (n3 == n) {
                                    return n2;
                                }
                                return -1;
                            }
                            else {
                                final int n22 = b8 ^ 0x381F80 ^ b7 << 6 ^ b6 << 12 ^ b << 18;
                                if (n22 > 1114111) {
                                    if (n3 == n) {
                                        return n2;
                                    }
                                    return -1;
                                }
                                else if (55296 <= n22 && n22 < 57344) {
                                    if (n3 == n) {
                                        return n2;
                                    }
                                    return -1;
                                }
                                else if (n22 < 65536) {
                                    if (n3 == n) {
                                        return n2;
                                    }
                                    return -1;
                                }
                                else {
                                    final int n23 = n3 + 1;
                                    if (n3 == n) {
                                        return n2;
                                    }
                                    if ((n22 != 10 && n22 != 13 && ((n22 >= 0 && n22 < 32) || (127 <= n22 && n22 < 160))) || n22 == 65533) {
                                        return -1;
                                    }
                                    int n24;
                                    if (n22 < 65536) {
                                        n24 = 1;
                                    }
                                    else {
                                        n24 = 2;
                                    }
                                    n2 += n24;
                                    final q a3 = q.a;
                                    i += 4;
                                    n3 = n23;
                                }
                            }
                        }
                    }
                }
            }
            else {
                if (n3 == n) {
                    return n2;
                }
                return -1;
            }
        }
        return n2;
    }
    
    public static final void c(final e e, final b b, final int n, final int n2) {
        l.e(e, "<this>");
        l.e(b, "buffer");
        b.J(e.f(), n, n2);
    }
    
    public static final char[] d() {
        return c5.a.a;
    }
}
