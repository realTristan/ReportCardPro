package Utils;

/**
 * A class for converting bytes to hex.
 */
public class Bytes {
  /**
   * Converts the given byte array to a hex string.
   *
   * @param b the byte array to convert
   * @return the hex string
   */
  public static String toHex(byte[] b) {
    // Create a new StringBuffer
    StringBuffer hexString = new StringBuffer();

    // Iterate over the bytes
    for (int i = 0; i < b.length; i++) {
      // Get the hex value of the byte
      String hex = Integer.toHexString(0xff & b[i]);

      // If the hex value is only one character long, append a 0
      if (hex.length() == 1)
        hexString.append('0');

      // Append the hex value to the string buffer
      hexString.append(hex);
    }

    // Return the string buffer
    return hexString.toString();
  }
}
