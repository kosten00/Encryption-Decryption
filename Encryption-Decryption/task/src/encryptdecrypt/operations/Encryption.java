package encryptdecrypt.operations;

import encryptdecrypt.algorithm.Algorithm;

public class Encryption extends Operation {

    public Encryption(String message, int key, Algorithm algorithm) {
        super(message, key, algorithm);
    }

    @Override
    public char convert(char c) {
        return algorithm.encode(c, key);
    }
}