package Utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * A class for encoding data.
 */
public class Encoding {
    /**
     * Encodes the specified string using SHA-256.
     *
     * @return the encoded string
     */
    public String SHA256() throws NoSuchAlgorithmException {
        long time = Time.getNano();

        // Convert the time into astring
        String text = Long.toString(time);
        
        // Generate a mew SHA-256 hash
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));
        
        // Convert the hash into a string
        String hex = Bytes.toHex(hash);

        // Return the hash
        return hex;
    }
}
