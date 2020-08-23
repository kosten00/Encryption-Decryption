package encryptdecrypt;

import encryptdecrypt.algorithm.Algorithm;
import encryptdecrypt.algorithm.Shift;
import encryptdecrypt.algorithm.Unicode;
import encryptdecrypt.operations.Operation;
import encryptdecrypt.operations.Decryption;
import encryptdecrypt.operations.Encryption;

public class EncryptionDecryptionApp {
    private final Operation operation;
    private final Algorithm algorithm;

    public EncryptionDecryptionApp(String mode, String key, String data, String alg) {
        switch (alg) {
            case "shift":
                algorithm = new Shift();
                break;
            case "unicode":
                algorithm = new Unicode();
                break;
            default:
                throw new IllegalArgumentException("Invalid input!");
        }

        switch (mode) {
            case "enc":
                operation = new Encryption(data, Integer.parseInt(key), algorithm);
                break;
            case "dec":
                operation = new Decryption(data, Integer.parseInt(key), algorithm);
                break;
            default:
                throw new IllegalArgumentException("Invalid input!");
        }
    }

    public String getResult() {
        return operation.generateResultingMessage();
    }
}
