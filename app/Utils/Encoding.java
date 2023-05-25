package Utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * A class for encoding data.
 */
public class Encoding {
  /**
   * Encodes the specified string using SHA-1.
   *
   * @return the encoded string
   */
  public static String SHA1() throws NoSuchAlgorithmException {
    // Get the current time in nanoseconds
    long time = Time.getNano();

    // Convert the time into astring
    String text = Long.toString(time);

    // Generate a new SHA-1 hash
    MessageDigest digest = MessageDigest.getInstance("SHA-1");
    byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));

    // Convert the hash into a string
    String hex = Encoding.toHex(hash);

    // Return the hash
    return hex;
  }

  /**
   * Converts the given byte array to a hex string.
   *
   * @param b the byte array to convert
   * @return the hex string
   */
  private static String toHex(byte[] b) {
    // Create a new StringBuffer
    StringBuffer buf = new StringBuffer();

    // Iterate over the bytes
    for (int i = 0; i < b.length; i++) {
      // Get the hex value of the byte
      String hex = Integer.toHexString(0xff & b[i]);

      // If the hex value is only one character long, append a 0
      if (hex.length() == 1)
        buf.append('0');

      // Append the hex value to the string buffer
      buf.append(hex);
    }

    // Return the string buffer
    return buf.toString();
  }
}
