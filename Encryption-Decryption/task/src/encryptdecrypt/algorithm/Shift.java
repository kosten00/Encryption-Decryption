package encryptdecrypt.algorithm;

public class Shift extends Algorithm {

    @Override
    public char encode(char c, int key) {
        if (c >= 'a' && c <= 'z') {
            if ((c + key) > 'z') {
                return (char) ('a' + ((c + key - 1) - 'z'));
            } else {
                return (char) (c + key);
            }
        }
        if (c >= 'A' && c <= 'Z') {
            if ((c + key) > 'Z') {
                return (char) ('A' + ((c + key - 1) - 'Z'));
            } else {
                return (char) (c + key);
            }
        }
        return c;
    }

    @Override
    public char decode(char c, int key) {
        if (c >= 'a' && c <= 'z') {
            if ((c - key) < 'a') {
                return (char) ('z' - ('a' - (c - key + 1)));
            } else {
                return (char) (c - key);
            }
        }
        if (c >= 'A' && c <= 'Z') {
            if ((c - key) < 'A') {
                return (char) ('Z' - ('A' - (c - key + 1)));
            } else {
                return (char) (c - key);
            }
        }
        return c;
    }
}
