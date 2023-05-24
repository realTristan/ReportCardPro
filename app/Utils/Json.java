package Utils;

import java.io.FileReader;
import java.io.PrintWriter;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

/**
 * A class for reading and writing JSON files.
 */
public class Json {
  /**
   * Reads a JSON file and returns its contents as a JSONObject.
   *
   * @param fileName the name of the file to read
   * @return the contents of the file as a JSONObject
   * @throws Exception if there is an error reading the file
   */
  public static JSONObject read(String fileName) throws Exception {
    Object obj = new JSONParser().parse(new FileReader(fileName));
    return (JSONObject) obj;
  }

  /**
   * Writes the given JSONObject to the specified file in JSON format.
   *
   * @param fileName the name of the file to write to
   * @param obj      the JSONObject to write to the file
   * @throws Exception if there is an error writing to the file
   */
  public static void write(String fileName, JSONObject obj) throws Exception {
    PrintWriter pw = new PrintWriter(fileName);
    pw.write(obj.toJSONString());
    pw.flush();
    pw.close();
  }
}
