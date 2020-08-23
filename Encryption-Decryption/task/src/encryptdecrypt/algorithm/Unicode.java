package encryptdecrypt.algorithm;

public class Unicode extends Algorithm {

    @Override
    public char encode(char c, int key) {
        return (char) (c + key);
    }

    @Override
    public char decode(char c, int key) {
        return (char) (c - key);
    }
}
