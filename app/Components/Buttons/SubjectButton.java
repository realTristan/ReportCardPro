package Components.Buttons;

import Components.Canvas;

public class SubjectButton {
  public SubjectButton (Canvas c, int x, int y, int w, int h) {
    Button b = new Button("Add Subject", x, y, w, h);
    c.add(b);
  }
}
