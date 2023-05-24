package Components;

import javax.swing.JButton;
import javax.swing.JScrollPane;

import org.json.simple.JSONObject;

import Components.Buttons.Button;

public class ResultsList {
  private JScrollPane scrollPane;

  public ResultsList(Canvas canvas, int x, int y, int w, int h) {
    scrollPane = new JScrollPane();
    scrollPane.setBounds(x, y, w, h);
    canvas.add(scrollPane);
  }

  public void add(JButton b) {
    scrollPane.add(b);
  }

  public void removeAll() {
    scrollPane.removeAll();
  }

  public void setStudents(Canvas canvas, String value) {
    this.removeAll();
    JSONObject[] results = canvas.cache.getStudents(value);
    
    for (JSONObject result : results) {
      // Get the students name
      String name = (String) result.get("name");

      // Create the button
      this.add(new Button(name, 0, 0, 150, 30));
    }
  }
}