package encryptdecrypt.operations;

import encryptdecrypt.algorithm.Algorithm;

public abstract class Operation {
    protected String message;
    protected int key;
    protected Algorithm algorithm;

    public Operation(String message, int key, Algorithm algorithm) {
        this.message = message;
        this.key = key;
        this.algorithm = algorithm;
    }

    protected abstract char convert(char c);

    public String generateResultingMessage() {
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            sb.append(convert(c));
        }
        return sb.toString();
    }
}
