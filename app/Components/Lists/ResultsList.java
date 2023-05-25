package Components.Lists;

import java.util.List;

import javax.swing.JScrollPane;

import org.json.simple.JSONObject;

import Components.Canvas;
import Components.Buttons.Button;

/**
 * A class representing a list of results.
 */
public class ResultsList {
  private JScrollPane pane;

  /**
   * Constructs a new ResultsList object and adds it to the given canvas at the
   * specified location and size.
   *
   * @param canvas the canvas to add the results list to
   * @param x      the x-coordinate of the results list
   * @param y      the y-coordinate of the results list
   * @param w      the width of the results list
   * @param h      the height of the results list
   */
  public ResultsList(Canvas canvas, int x, int y, int w, int h) {
    pane = new JScrollPane();
    pane.setBounds(x, y, w, h);
    this.setStudents(canvas, "");
    canvas.add(pane);
  }

  /**
   * Sets the students in the results list based on the given search value.
   *
   * @param canvas the canvas to use for the results list
   * @param value  the search value to use for filtering the students
   */
  public void setStudents(Canvas canvas, String value) {
    pane.removeAll();

    // Get the students
    List<JSONObject> students = canvas.cache.getStudents(value);

    // Iterate over the students
    int sep = 0;
    for (JSONObject student : students) {
      // Get the students name
      String name = (String) student.get("last_name");

      // Create the button
      Button button = new Button(name, 0, sep);
      button.setSize(300, 30);
      pane.add(button);

      // Increment the separator
      sep += 30;
    }
    pane.repaint();
  }
}