package Utils;

import java.io.FileReader;
import java.io.PrintWriter;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Json {
  public static JSONObject read(String fileName) throws Exception {
    Object obj = new JSONParser().parse(new FileReader(fileName));
    return (JSONObject) obj;
  }

  public static void write(String fileName, JSONObject obj) throws Exception {
    PrintWriter pw = new PrintWriter(fileName);
    pw.write(obj.toJSONString());
    pw.flush();
    pw.close();
  }
}
