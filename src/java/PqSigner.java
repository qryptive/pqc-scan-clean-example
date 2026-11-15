package example.clean;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;

/** Post-quantum signing with ML-DSA-65 through the JDK's own provider (JDK 24 and later). */
public final class PqSigner {
    private PqSigner() {}

    public static KeyPair newKeyPair() throws Exception {
        return KeyPairGenerator.getInstance("ML-DSA-65").generateKeyPair();
    }

    public static byte[] sign(KeyPair pair, byte[] message) throws Exception {
        Signature s = Signature.getInstance("ML-DSA-65");
        s.initSign(pair.getPrivate());
        s.update(message);
        return s.sign();
    }
}
