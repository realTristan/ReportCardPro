package Components.Lists;

import java.util.List;

import javax.swing.JScrollPane;

import org.json.simple.JSONObject;

import Components.Canvas;
import Components.Buttons.Button;

public class ResultsList {
  private JScrollPane pane;

  public ResultsList(Canvas canvas, int x, int y, int w, int h) {
    pane = new JScrollPane();
    pane.setBounds(x, y, w, h);
    canvas.add(pane);
  }

  public void setStudents(Canvas canvas, String value) {
    pane.removeAll();

    // Get the students
    List<JSONObject> students = canvas.cache.getStudents(value);

    // Iterate over the students
    for (JSONObject student : students) {
      // Get the students name
      String name = (String) student.get("name");

      // Create the button
      Button button = new Button(name, 0, 0, 300, 30);
      pane.add(button);
    }
    pane.repaint();
  }
}