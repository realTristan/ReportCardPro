package Components.Inputs;

import Components.Canvas;

/**
 * A class for creating input fields.
 */
public class SubjectInput extends Input {
  /**
   * Constructs a new SubjectInput object and sets its bounds to the specified
   * location and size.
   *
   * @param canvas the canvas to add the input to
   * @param x      the x-coordinate of the input
   * @param y      the y-coordinate of the input
   */
  public SubjectInput(Canvas canvas, int x, int y) {
    super(x, y, 150, 30);
    canvas.add(this);
  }
}
