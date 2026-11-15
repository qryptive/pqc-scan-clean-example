import java.security.KeyPairGenerator;
import java.security.MessageDigest;

public class Legacy {
    static byte[] digest(byte[] d) throws Exception {
        return MessageDigest.getInstance("MD5").digest(d);
    }
    static Object newKey() throws Exception {
        return KeyPairGenerator.getInstance("RSA").generateKeyPair();
    }
}
