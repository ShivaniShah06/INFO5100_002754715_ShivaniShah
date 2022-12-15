package exercises.exercise6;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;

public class SecretKey {

    public static SecretKey generateKey(int n) throws NoSuchAlgorithmException {

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(n);
        javax.crypto.SecretKey key = keyGenerator.generateKey();
        return (SecretKey) key;
    }

    public static IvParameterSpec generateIv() {
        byte[] iv = new byte[256];
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }
}
