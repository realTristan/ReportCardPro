package Utils;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

/**
 * A class for caching students.
 */
public class Cache {
  public JSONObject students = new JSONObject();

  /**
 * Constructs a new Cache object and initializes it with the contents of the "students.json" file.
 */
  public Cache() {
    try {
      students = Json.read("students.json");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  /**
   * Exports the current cache of students to a JSON file.
   */
  public void export() {
    try {
      Json.write("students.json", students);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  /**
   * Returns a list of all the students in the cache.
   *
   * @return a list of JSONObjects representing the students
   */
  public List<JSONObject> allStudents() {
    // Create a new array
      List<JSONObject> res = new ArrayList<JSONObject>();

      // Iterate over the cache and add all the students
      for (Object key : students.keySet()) {
        res.add((JSONObject) students.get(key));
      }
      return res;
  }

  /**
   * Returns a list of students whose name starts with the given value.
   *
   * @param value the value to search for in the student names
   * @return a list of JSONObjects representing the matching students
   */
  public List<JSONObject> getStudents(String value) {
    // Return all the students if the value is empty
    if (value.length() == 0) {
      return this.allStudents();
    }

    // Create a dynamic array
    List<JSONObject> res = new ArrayList<JSONObject>();

    // Iterate over the cache and check if the value is in the name
    for (Object key : students.keySet()) {
      // Get the student
      JSONObject student = (JSONObject) students.get(key);

      // Get the students name
      String name = (String) student.get("last_name");

      // Check if the name contains the value
      if (name.toLowerCase().startsWith(value.toLowerCase())) {
        res.add(student);
      }
    }

    // Return the results
    return res;
  }

}
