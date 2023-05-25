package Utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * A class for encoding data.
 */
public class Encoding {
    /**
     * Returns the SHA-256 hash of the current time.
     *
     * @return the SHA-256 hash of the current time
     */
    public static String SHA256() throws NoSuchAlgorithmException {
        // Get the current time in nanoseconds
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
