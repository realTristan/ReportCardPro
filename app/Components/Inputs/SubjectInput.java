package Components.Inputs;

import Components.Canvas;

public class SubjectInput extends Input {
  public SubjectInput(Canvas canvas, int x, int y) {
    super(x, y, 150, 30);
    canvas.add(this);
  }
}
