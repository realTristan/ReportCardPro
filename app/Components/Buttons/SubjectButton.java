package Components.Buttons;

import Components.Canvas;

public class SubjectButton extends Button {
  public SubjectButton (Canvas c, int x, int y, int w, int h) {
    super("Add Subject", x, y, w, h);
    c.add(this);
  }
}
