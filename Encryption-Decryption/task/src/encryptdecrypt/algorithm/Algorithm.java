package encryptdecrypt.algorithm;

public abstract class Algorithm {

    public abstract char encode(char c, int key);

    public abstract char decode(char c, int key);
}