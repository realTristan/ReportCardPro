package Components.Buttons;

import org.json.simple.JSONObject;

import Components.Canvas;

public class StudentButton extends Button {
  public StudentButton(Canvas canvas, String name, String id, int ysep) {
    // Create the button
    super(name, 0, ysep);

    // Set the button size
    super.setSize(300, 30);

    // Add the action listener
    super.addActionListener(e -> {
      // Get the student
      JSONObject student = (JSONObject) canvas.cache.students.get(id);

      // Create the student page
      new Pages.StudentPage(canvas.frame, canvas.cache, student);
    });

    // Add the button to the canvas
    canvas.add(this);
  }
}
