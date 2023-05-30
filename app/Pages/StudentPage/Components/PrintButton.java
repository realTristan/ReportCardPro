package Pages.StudentPage.Components;

import java.util.List;
import java.util.Map;

import Components.Button;
import Pages.Manager;
import Pages.StudentPage.StudentPage.Panel;

/**
 * A class for creating buttons.
 */
public class PrintButton extends Button {
  /**
   * Constructs a new PrintReport object.
   *
   * @param panel the panel to add the component to
   */
  public PrintButton(Manager manager, Panel panel, String id) {
    super("Print", 0, 220);
    super.setSize(300, 30);

    // Add the action listener
    super.addActionListener(e -> printReport(manager, id));

    // Add the component to the panel
    panel.add(this);
  }

  /**
   * Prints the report for the student with the specified id.
   *
   * @param manager the manager to use for getting the student's courses
   * @param id      the id of the student to print the report for
   */
  public void printReport(Manager manager, String id) {
    // Get the courses
    List<Map<String, Object>> courses = manager.cache.getStudentCourses(id);

    // Print the id
    System.out.println("\nStudent ID:");
    System.out.println("--------------------");
    System.out.println(id);

    // Print the courses
    System.out.println("\nCourses:");
    System.out.println("--------------------");

    // Iterate over the courses
    double average = 0;
    for (Map<String, Object> course : courses) {
      // Get the course name
      String subject = (String) course.get("subject");
      double courseGrade = (double) course.get("grade");

      // Print the course info
      System.out.println(subject + ": " + courseGrade + "%");

      // Add the grade to the average
      average += courseGrade;
    }

    // Print the average
    System.out.println("\nAverage:");
    System.out.println("--------------------");
    System.out.println(average / courses.size() + "%");
  }
}
