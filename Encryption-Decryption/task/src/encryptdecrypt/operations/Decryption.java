package encryptdecrypt.operations;

import encryptdecrypt.algorithm.Algorithm;

public class Decryption extends Operation {

    public Decryption(String message, int key, Algorithm algorithm) {
        super(message, key, algorithm);

    }

    @Override
    public char convert(char c) {
        return algorithm.decode(c, key);
    }
}
