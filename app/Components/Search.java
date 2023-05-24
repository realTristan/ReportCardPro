package Components;

import javax.swing.*;
import org.json.simple.JSONObject;

public class Search {
  public static void drawBar(Canvas canvas, int x, int y) {
    // Create a new input field
    JTextField field = Input.newField(x, y, 150, 30);

    // Set the listener
    Input.setListener(field, Search.drawResults(canvas, field));

    // Add the field to the canvas
    canvas.add(field);
  }

  //
  public static Runnable drawResults(Canvas canvas, JTextField field) {
    return () -> {
      // Get the search results
      String value = field.getText();
      JSONObject[] results = canvas.cache.getStudents(value);

      // Draw a list of results to the canvas
      Search.drawButtons(canvas, results);
      System.out.println("Results: " + results.length);
    };
  }

  //
  public static void drawButtons(Canvas canvas, JSONObject[] results) {
    // Iterate over the results and create a button for each
    int seperator = 120;
    for (JSONObject result : results) {
      // Get the students name
      String name = (String) result.get("name");

      // Create the button
      JButton b = Button.make(name, 0, seperator, 150, 30);
      canvas.add(b);

      // Increment the seperator
      seperator += 40;
    }
  }
}
