package lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

import utils.Json;

/**
 * A class for caching students.
 */
public class StudentsCache {
  // The cache of students
  private JSONObject students = new JSONObject();

  /**
   * Constructs a new Cache object and initializes it with the contents of the
   * "students.json" file.
   */
  public StudentsCache() {
    try {
      students = Json.read("students.json");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  /**
   * Exports the current cache of students to a JSON file.
   * @return void
   */
  public void export() {
    try {
      Json.write("students.json", students);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  /**
   * Returns a list of students whose name starts with the given value.
   *
   * @param value the value to search for in the student names
   * @return a list of JSONObjects representing the matching students
   */
  public List<JSONObject> searchStudents(String value) {
    // Return all the students if the value is empty
    if (value.length() == 0) {
      return new ArrayList<JSONObject>();
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

  /**
   * Update the student courses
   *
   * @param id the id of the student
   * @param subjects the list of subject maps
   * @return void
   */
  public void updateStudentCourses(String id, List<Map<String, Object>> subjects) {
    // Get the student
    JSONObject student = (JSONObject) students.get(id);

    // Update the courses
    student.put("courses", subjects);
    students.put(id, student);

    // Export the cache
    this.export();
  }

  /**
   * Returns a list of courses for the given student.
   *
   * @param id the id of the student
   * @return a list of courses
   */
  public List<Map<String, Object>> getStudentCourses(String id) {
    JSONObject student = (JSONObject) students.get(id);
    return (List<Map<String, Object>>) student.get("courses");
  }

  /**
   * Returns the name of the student with the given id.
   *
   * @param id the id of the student
   * @return the name of the student
   */
  public String getStudentName(String id) {
    // Get the student
    JSONObject student = (JSONObject) students.get(id);

    // Get the name
    String first_name = (String) student.get("first_name");
    String last_name = (String) student.get("last_name");

    // Return the name
    return last_name + ", " + first_name;
  }

  /**
   * Returns the average of the student with the given id.
   *
   * @param id the id of the student
   * @return the average of the student
   */
  public double getStudentAverage(String id) {
    // Get the student
    JSONObject student = (JSONObject) students.get(id);

    // Get the courses
    List<Map<String, Object>> courses = (List<Map<String, Object>>) student.get("courses");

    // Calculate the average
    double sum = 0;
    for (Map<String, Object> course : courses) {
      sum += (double) course.get("grade");
    }
    return sum / courses.size();
  }

  /**
   * Delete the student with the given id.
   *
   * @param id the id of the student
   */
  public void deleteStudent(String id) {
    // delete the student
    students.remove(id);

    // Export the cache data to the json file
    this.export();
  }

  /**
   * Adds a student to the cache.
   *
   * @param name the name of the student
   * @return the id of the student
   */
  public String addStudent(String name) throws Exception {
    // Create the student
    JSONObject student = new JSONObject();

    // Name split
    name = name.replaceAll(" ", "");
    String[] nameSplit = name.split(";");
    if (nameSplit.length != 2) {
      throw new IllegalArgumentException("Invalid name");
    }

    // Generate a random id
    String id = utils.Encoding.SHA1();

    // Create an array of couses
    List<Map<String, Object>> courses = new ArrayList<Map<String, Object>>();
    for (int i = 0; i < 4; i++) {
      courses.add(Map.of("subject", "Subject", "grade", 0.0));
    }

    // Set the student properties
    student.put("first_name", nameSplit[1]);
    student.put("last_name", nameSplit[0]);
    student.put("id", id);
    student.put("courses", courses);

    // Add the student to the cache
    students.put(id, student);

    // Export the cache
    this.export();

    // Return the id
    return id;
  }
}
