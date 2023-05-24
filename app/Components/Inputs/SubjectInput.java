package Components.Inputs;

import Components.Canvas;

public class SubjectInput {
  public SubjectInput(Canvas canvas, int x, int y) {
    Input field = new Input(x, y, 150, 30);
    canvas.add(field);
  }
}
