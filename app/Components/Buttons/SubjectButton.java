package Components.Buttons;

import Components.Canvas;

/**
 * A class for creating buttons.
 */
public class SubjectButton extends Button {
  /**
   * Constructs a new SubjectButton object and sets its bounds to the specified
   * location and size.
   *
   * @param canvas the canvas to add the button to
   * @param x the x-coordinate of the button
   * @param y the y-coordinate of the button
   */
  public SubjectButton (Canvas canvas, int x, int y) {
    super("Add Subject", x, y);
    super.setSize(150, 30);
    canvas.add(this);
  }
}
