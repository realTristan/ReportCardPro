package Utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * A class for storing student data
 */
public class Student {
    public Student() {

    }

    /**
     * Generates a new ID for a student.
     * 
     * @return the new ID
     * @throws NoSuchAlgorithmException
     */
    public String newID() throws NoSuchAlgorithmException {
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
