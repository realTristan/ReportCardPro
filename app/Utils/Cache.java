package Utils;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

public class Cache {
	public JSONObject students = new JSONObject();
	public Cache() {
		// Read the students.json file
		try {
			students = Json.read("students.json");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void export() {
		try {
			Json.write("students.json", students);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public JSONObject[] getStudents(String value) {
    // Create a dynamic array
    List<JSONObject> res = new ArrayList<JSONObject>();

    // Iterate over the cache and check if the value is in the name
    for (Object key : students.keySet()) {
      // Get the student
      JSONObject student = (JSONObject) students.get(key);

      // Get the students name
      String name = (String) student.get("name");

      // Check if the name contains the value
      if (name.toLowerCase().startsWith(value.toLowerCase())) {
        res.add(student);
      }
    }

    // Return the results
    JSONObject[] arr = new JSONObject[res.size()];
    return res.toArray(arr);
  }
}
