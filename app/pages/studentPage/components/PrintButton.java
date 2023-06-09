package pages.studentPage.components;

import java.util.List;
import java.util.Map;

import components.Button;
import pages.Manager;
import pages.studentPage.StudentPage.Panel;

/**
 * A class for creating buttons.
 */
public class PrintButton extends Button {
  /**
   * Constructs a new PrintReport object.
   *
   * @param manager the page manager
   * @param panel   the panel to use for adding the button to the canvas
   * @param id      the id of the student to print the report for
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
   * Prints the report card for the student with the specified id.
   *
   * @param manager the page manager
   * @param id      the id of the student to print the report for
   * @return void
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
